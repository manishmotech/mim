package org.motechproject.nms.mobileacademy.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by kosh on 5/14/15.
 */
public class SmsRequestData {

    @JsonProperty("address")
    private List<String> receipients;

    @JsonProperty("senderAddress")
    private String senderId;

    @JsonProperty("clientCorrelator")
    private String correlationId;

}
