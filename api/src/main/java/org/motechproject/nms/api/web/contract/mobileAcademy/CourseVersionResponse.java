package org.motechproject.nms.api.web.contract.mobileAcademy;

/**
 * API response object for getting course version
 */
public class CourseVersionResponse {

    private int courseVersion;

    public CourseVersionResponse() {
    }

    public CourseVersionResponse(int courseVersion) {

        this.courseVersion = courseVersion;
    }

    public Integer getCourseVersion() {
        return courseVersion;
    }

    public void setCourseVersion(Integer courseVersion) {
        this.courseVersion = courseVersion;
    }
}
