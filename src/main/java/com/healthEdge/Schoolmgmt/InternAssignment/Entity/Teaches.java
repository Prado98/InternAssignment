package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(TeachesPK.class)
public class Teaches {
    private Integer teacherId;
    private Integer studentId;

    @Id
    @Column(name = "Teacher_id", nullable = false)
    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Id
    @Column(name = "Student_id", nullable = false)
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

        Teaches teaches = (Teaches) o;

        if (teacherId != null ? !teacherId.equals(teaches.teacherId) : teaches.teacherId != null) return false;
        if (studentId != null ? !studentId.equals(teaches.studentId) : teaches.studentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherId != null ? teacherId.hashCode() : 0;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }
}
