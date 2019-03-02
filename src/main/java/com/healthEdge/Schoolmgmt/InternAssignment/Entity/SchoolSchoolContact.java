package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.*;

@Entity
@Table(name = "school_school_contact", schema = "assignment", catalog = "")
@IdClass(SchoolSchoolContactPK.class)
public class SchoolSchoolContact {
    private Integer schoolContact;
    private Integer schoolId;

    @Id
    @Column(name = "School_contact", nullable = false)
    public Integer getSchoolContact() {
        return schoolContact;
    }

    public void setSchoolContact(Integer schoolContact) {
        this.schoolContact = schoolContact;
    }

    @Id
    @Column(name = "School_id", nullable = false)
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

        SchoolSchoolContact that = (SchoolSchoolContact) o;

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
