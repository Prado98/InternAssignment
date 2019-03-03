package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Student {
    private Integer studentId;
    private String studentFname;
    private String studentLname;
    private String studentAddress;
    private String studentGender;
    private Integer schoolId;
    private School schoolBySchoolId;
    private Collection<StudentStudentContact> studentStudentContactsByStudentId;

    @Id
    @Column(name = "Student_id", nullable = false)
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "Student_fname", nullable = false, length = 255)
    public String getStudentFname() {
        return studentFname;
    }

    public void setStudentFname(String studentFname) {
        this.studentFname = studentFname;
    }

    @Basic
    @Column(name = "Student_lname", nullable = false, length = 255)
    public String getStudentLname() {
        return studentLname;
    }

    public void setStudentLname(String studentLname) {
        this.studentLname = studentLname;
    }

    @Basic
    @Column(name = "Student_address", nullable = false, length = 255)
    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Basic
    @Column(name = "Student_gender", nullable = false, length = 1)
    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
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

        Student student = (Student) o;

        if (studentId != null ? !studentId.equals(student.studentId) : student.studentId != null) return false;
        if (studentFname != null ? !studentFname.equals(student.studentFname) : student.studentFname != null)
            return false;
        if (studentLname != null ? !studentLname.equals(student.studentLname) : student.studentLname != null)
            return false;
        if (studentAddress != null ? !studentAddress.equals(student.studentAddress) : student.studentAddress != null)
            return false;
        if (studentGender != null ? !studentGender.equals(student.studentGender) : student.studentGender != null)
            return false;
        if (schoolId != null ? !schoolId.equals(student.schoolId) : student.schoolId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (studentFname != null ? studentFname.hashCode() : 0);
        result = 31 * result + (studentLname != null ? studentLname.hashCode() : 0);
        result = 31 * result + (studentAddress != null ? studentAddress.hashCode() : 0);
        result = 31 * result + (studentGender != null ? studentGender.hashCode() : 0);
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

    @OneToMany(mappedBy = "studentByStudentId")
    public Collection<StudentStudentContact> getStudentStudentContactsByStudentId() {
        return studentStudentContactsByStudentId;
    }

    public void setStudentStudentContactsByStudentId(Collection<StudentStudentContact> studentStudentContactsByStudentId) {
        this.studentStudentContactsByStudentId = studentStudentContactsByStudentId;
    }
}
