package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class StudentStudentContactPK implements Serializable {
    private Integer studentContact;
    private Integer studentId;

    @Column(name = "Student_contact", nullable = false)
    @Id
    public Integer getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(Integer studentContact) {
        this.studentContact = studentContact;
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

        StudentStudentContactPK that = (StudentStudentContactPK) o;

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
