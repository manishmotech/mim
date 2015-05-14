package org.motechproject.nms.api.web.contract.mobileAcademy.sms;

/**
 * Created by kosh on 5/14/15.
 */
public class DeliveryInfoNotification {

    private String clientCorrelator;

    private String callbackData;

    private DeliveryInfo deliveryInfo;

    public DeliveryInfoNotification() {
    }

    public String getClientCorrelator() {
        return clientCorrelator;
    }

    public void setClientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }
}
