package org.motechproject.nms.imi.domain;

/**
 * File processing status, provided by IVR
 */
public enum FileProcessedStatus {
    FILE_PROCESSED_SUCCESSFULLY(8000),
    FILE_NOT_ACCESSIBLE(8001),
    FILE_CHECKSUM_ERROR(8002),
    FILE_RECORDSCOUNT_ERROR(8003),
    FILE_OUTSIDE_SOCIAL_HOURS(8004),
    FILE_ERROR_IN_FILE_FORMAT(8005);

    private final int value;

    FileProcessedStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static boolean isValid(int i) {
        return (i >= FILE_PROCESSED_SUCCESSFULLY.getValue() && i <= FILE_ERROR_IN_FILE_FORMAT.getValue());
    }

    public static FileProcessedStatus fromInt(int i) {
        if (isValid(i)) {
            return values()[i - FILE_PROCESSED_SUCCESSFULLY.getValue()];
        } else {
            throw new IllegalArgumentException(String.format("%d is an invalid FileProcessedStatus", i));
        }
    }
}
