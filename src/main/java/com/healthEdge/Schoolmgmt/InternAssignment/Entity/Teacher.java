package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
    private Integer teacherId;
    private String teacherName;
    private String teacherEmail;

    @Id
    @Column(name = "Teacher_id", nullable = false)
    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "Teacher_name", nullable = false, length = 255)
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Basic
    @Column(name = "Teacher_email", nullable = true, length = 255)
    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (teacherId != null ? !teacherId.equals(teacher.teacherId) : teacher.teacherId != null) return false;
        if (teacherName != null ? !teacherName.equals(teacher.teacherName) : teacher.teacherName != null) return false;
        if (teacherEmail != null ? !teacherEmail.equals(teacher.teacherEmail) : teacher.teacherEmail != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherId != null ? teacherId.hashCode() : 0;
        result = 31 * result + (teacherName != null ? teacherName.hashCode() : 0);
        result = 31 * result + (teacherEmail != null ? teacherEmail.hashCode() : 0);
        return result;
    }
}
