package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TeachesPK implements Serializable {
    private Integer teacherId;
    private Integer studentId;

    @Column(name = "Teacher_id", nullable = false)
    @Id
    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Column(name = "Student_id", nullable = false)
    @Id
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeachesPK teachesPK = (TeachesPK) o;

        if (teacherId != null ? !teacherId.equals(teachesPK.teacherId) : teachesPK.teacherId != null) return false;
        if (studentId != null ? !studentId.equals(teachesPK.studentId) : teachesPK.studentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherId != null ? teacherId.hashCode() : 0;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }
}
