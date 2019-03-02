package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SchoolSchoolContactPK implements Serializable {
    private Integer schoolContact;
    private Integer schoolId;

    @Column(name = "School_contact", nullable = false)
    @Id
    public Integer getSchoolContact() {
        return schoolContact;
    }

    public void setSchoolContact(Integer schoolContact) {
        this.schoolContact = schoolContact;
    }

    @Column(name = "School_id", nullable = false)
    @Id
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

        SchoolSchoolContactPK that = (SchoolSchoolContactPK) o;

        if (schoolContact != null ? !schoolContact.equals(that.schoolContact) : that.schoolContact != null)
            return false;
        if (schoolId != null ? !schoolId.equals(that.schoolId) : that.schoolId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolContact != null ? schoolContact.hashCode() : 0;
        result = 31 * result + (schoolId != null ? schoolId.hashCode() : 0);
        return result;
    }
}
