package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.*;

@Entity
@Table(name = "offered_by", schema = "assignment", catalog = "")
@IdClass(OfferedByPK.class)
public class OfferedBy {
    private Integer courseId;
    private Integer teacherId;

    @Id
    @Column(name = "Course_id", nullable = false)
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Id
    @Column(name = "Teacher_id", nullable = false)
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

        OfferedBy offeredBy = (OfferedBy) o;

        if (courseId != null ? !courseId.equals(offeredBy.courseId) : offeredBy.courseId != null) return false;
        if (teacherId != null ? !teacherId.equals(offeredBy.teacherId) : offeredBy.teacherId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId != null ? courseId.hashCode() : 0;
        result = 31 * result + (teacherId != null ? teacherId.hashCode() : 0);
        return result;
    }
}
