package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OffersPK implements Serializable {
    private Integer schoolId;
    private Integer courseId;

    @Column(name = "School_id", nullable = false)
    @Id
    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @Column(name = "Course_id", nullable = false)
    @Id
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OffersPK offersPK = (OffersPK) o;

        if (schoolId != null ? !schoolId.equals(offersPK.schoolId) : offersPK.schoolId != null) return false;
        if (courseId != null ? !courseId.equals(offersPK.courseId) : offersPK.courseId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolId != null ? schoolId.hashCode() : 0;
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        return result;
    }
}
