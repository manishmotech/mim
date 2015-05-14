package org.motechproject.nms.api.web.contract.mobileAcademy.sms;

/**
 * Created by kosh on 5/14/15.
 */
public class RequestData {

    private DeliveryInfoNotification deliveryInfoNotification;

    public RequestData() {
    }

    public DeliveryInfoNotification getDeliveryInfoNotification() {
        return deliveryInfoNotification;
    }

    public void setDeliveryInfoNotification(DeliveryInfoNotification deliveryInfoNotification) {
        this.deliveryInfoNotification = deliveryInfoNotification;
    }
}
