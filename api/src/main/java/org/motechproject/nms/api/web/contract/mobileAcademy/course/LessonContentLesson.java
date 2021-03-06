package org.motechproject.nms.api.web.contract.mobileAcademy.course;

import javax.validation.constraints.NotNull;

/**
 * Lesson content lesson metadata
 */
public class LessonContentLesson {

    @NotNull
    private String id;

    @NotNull
    private String file;

    public LessonContentLesson() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
