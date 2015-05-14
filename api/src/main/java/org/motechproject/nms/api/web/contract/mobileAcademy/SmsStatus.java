package org.motechproject.nms.api.web.contract.mobileAcademy;

import org.motechproject.nms.api.web.contract.mobileAcademy.sms.RequestData;

/**
 * Created by kosh on 5/14/15.
 */
public class SmsStatus {

    private RequestData requestData;

    public SmsStatus() {
    }

    public RequestData getRequestData() {
        return requestData;
    }

    public void setRequestData(RequestData requestData) {
        this.requestData = requestData;
    }
}
