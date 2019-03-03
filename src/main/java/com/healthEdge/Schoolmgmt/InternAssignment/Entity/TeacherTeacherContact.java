package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.*;

@Entity
@Table(name = "teacher_teacher_contact", schema = "assignment", catalog = "")
@IdClass(TeacherTeacherContactPK.class)
public class TeacherTeacherContact {
    private Integer teacherContact;
    private Integer teacherId;
    private Teacher teacherByTeacherId;

    @Id
    @Column(name = "Teacher_contact", nullable = false)
    public Integer getTeacherContact() {
        return teacherContact;
    }

    public void setTeacherContact(Integer teacherContact) {
        this.teacherContact = teacherContact;
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

        TeacherTeacherContact that = (TeacherTeacherContact) o;

        if (teacherContact != null ? !teacherContact.equals(that.teacherContact) : that.teacherContact != null)
            return false;
        if (teacherId != null ? !teacherId.equals(that.teacherId) : that.teacherId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherContact != null ? teacherContact.hashCode() : 0;
        result = 31 * result + (teacherId != null ? teacherId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Teacher_id", referencedColumnName = "Teacher_id", nullable = false)
    public Teacher getTeacherByTeacherId() {
        return teacherByTeacherId;
    }

    public void setTeacherByTeacherId(Teacher teacherByTeacherId) {
        this.teacherByTeacherId = teacherByTeacherId;
    }
}
