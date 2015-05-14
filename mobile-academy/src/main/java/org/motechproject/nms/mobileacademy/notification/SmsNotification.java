package org.motechproject.nms.mobileacademy.notification;

import org.joda.time.DateTime;
import org.motechproject.event.MotechEvent;
import org.motechproject.event.listener.annotations.MotechListener;
import org.motechproject.nms.mobileacademy.domain.CompletionRecord;
import org.motechproject.nms.mobileacademy.repository.CompletionRecordDataService;
import org.motechproject.sms.service.OutgoingSms;
import org.motechproject.sms.service.SmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * This handles all the integration pieces between MA and sms module to trigger and handle notifications
 * for course completion
 */
@Component
public class SmsNotification {

    private static final String COURSE_COMPLETED = "nms.ma.course.completed";

    private static final Logger LOGGER = LoggerFactory.getLogger(SmsNotification.class);

    private CompletionRecordDataService completionRecordDataService;

    private SmsService smsService;

    public SmsNotification(CompletionRecordDataService completionRecordDataService) {
        this.completionRecordDataService = completionRecordDataService;
    }

    @MotechListener(subjects = { COURSE_COMPLETED })
    public void sendSmsNotification(MotechEvent event) {

        LOGGER.debug("Handling course completion notification event");

        CompletionRecord cr = completionRecordDataService.findRecordByCallingNumber(
                (Long) event.getParameters().get("callingNumber"));

        OutgoingSms outgoingSms = new OutgoingSms();
        outgoingSms.setRecipients(Arrays.asList(String.valueOf(cr.getCallingNumber())));
        outgoingSms.setConfig("IMI");
        outgoingSms.setDeliveryTime(DateTime.now());
        // TODO: Need to get this from BBC
        outgoingSms.setMessage("Course completion message");

        smsService.send(outgoingSms);
    }
}
