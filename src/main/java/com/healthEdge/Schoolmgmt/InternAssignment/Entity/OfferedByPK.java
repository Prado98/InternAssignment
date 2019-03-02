package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OfferedByPK implements Serializable {
    private Integer courseId;
    private Integer teacherId;

    @Column(name = "Course_id", nullable = false)
    @Id
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Column(name = "Teacher_id", nullable = false)
    @Id
    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfferedByPK that = (OfferedByPK) o;

        if (courseId != null ? !courseId.equals(that.courseId) : that.courseId != null) return false;
        if (teacherId != null ? !teacherId.equals(that.teacherId) : that.teacherId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId != null ? courseId.hashCode() : 0;
        result = 31 * result + (teacherId != null ? teacherId.hashCode() : 0);
        return result;
    }
}
