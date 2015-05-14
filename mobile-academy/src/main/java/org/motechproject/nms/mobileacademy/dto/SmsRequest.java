package org.motechproject.nms.mobileacademy.dto;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Sms request object to talk to IMI
 */
public class SmsRequest {

    @JsonProperty("outboundSMSMessageRequest")
    private SmsRequestData requestdata;

}
