package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.*;

@Entity
@Table(name = "student_student_contact", schema = "assignment", catalog = "")
@IdClass(StudentStudentContactPK.class)
public class StudentStudentContact {
    private Integer studentContact;
    private Integer studentId;

    @Id
    @Column(name = "Student_contact", nullable = false)
    public Integer getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(Integer studentContact) {
        this.studentContact = studentContact;
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

        StudentStudentContact that = (StudentStudentContact) o;

        if (studentContact != null ? !studentContact.equals(that.studentContact) : that.studentContact != null)
            return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentContact != null ? studentContact.hashCode() : 0;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }
}
