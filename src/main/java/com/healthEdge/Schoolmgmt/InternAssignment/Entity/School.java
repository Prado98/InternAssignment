package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {
    private Integer schoolId;
    private String schoolName;
    private String schoolAddress;
    private String schoolEmail;

    @Id
    @Column(name = "School_id", nullable = false)
    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "School_name", nullable = false, length = 255)
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "School_address", nullable = false, length = 255)
    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    @Basic
    @Column(name = "School_email", nullable = true, length = 255)
    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        School school = (School) o;

        if (schoolId != null ? !schoolId.equals(school.schoolId) : school.schoolId != null) return false;
        if (schoolName != null ? !schoolName.equals(school.schoolName) : school.schoolName != null) return false;
        if (schoolAddress != null ? !schoolAddress.equals(school.schoolAddress) : school.schoolAddress != null)
            return false;
        if (schoolEmail != null ? !schoolEmail.equals(school.schoolEmail) : school.schoolEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolId != null ? schoolId.hashCode() : 0;
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (schoolAddress != null ? schoolAddress.hashCode() : 0);
        result = 31 * result + (schoolEmail != null ? schoolEmail.hashCode() : 0);
        return result;
    }
}
