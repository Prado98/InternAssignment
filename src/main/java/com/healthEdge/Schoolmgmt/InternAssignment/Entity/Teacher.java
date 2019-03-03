package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Teacher {
    private Integer teacherId;
    private String teacherName;
    private String teacherEmail;
    private Integer schoolId;
    private School schoolBySchoolId;
    private Collection<TeacherTeacherContact> teacherTeacherContactsByTeacherId;

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
    @Column(name = "Teacher_email", nullable = false, length = 255)
    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    @Basic
    @Column(name = "School_id", nullable = true)
    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
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
        if (schoolId != null ? !schoolId.equals(teacher.schoolId) : teacher.schoolId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherId != null ? teacherId.hashCode() : 0;
        result = 31 * result + (teacherName != null ? teacherName.hashCode() : 0);
        result = 31 * result + (teacherEmail != null ? teacherEmail.hashCode() : 0);
        result = 31 * result + (schoolId != null ? schoolId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "School_id", referencedColumnName = "School_id")
    public School getSchoolBySchoolId() {
        return schoolBySchoolId;
    }

    public void setSchoolBySchoolId(School schoolBySchoolId) {
        this.schoolBySchoolId = schoolBySchoolId;
    }

    @OneToMany(mappedBy = "teacherByTeacherId")
    public Collection<TeacherTeacherContact> getTeacherTeacherContactsByTeacherId() {
        return teacherTeacherContactsByTeacherId;
    }

    public void setTeacherTeacherContactsByTeacherId(Collection<TeacherTeacherContact> teacherTeacherContactsByTeacherId) {
        this.teacherTeacherContactsByTeacherId = teacherTeacherContactsByTeacherId;
    }
}
