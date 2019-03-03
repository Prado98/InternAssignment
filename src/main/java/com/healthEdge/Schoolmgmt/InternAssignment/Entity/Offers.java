package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.*;

@Entity
@IdClass(OffersPK.class)
public class Offers {
    private Integer schoolId;
    private Integer courseId;
    private School schoolBySchoolId;
    private Course courseByCourseId;

    @Id
    @Column(name = "School_id", nullable = false)
    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @Id
    @Column(name = "Course_id", nullable = false)
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Offers offers = (Offers) o;

        if (schoolId != null ? !schoolId.equals(offers.schoolId) : offers.schoolId != null) return false;
        if (courseId != null ? !courseId.equals(offers.courseId) : offers.courseId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolId != null ? schoolId.hashCode() : 0;
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "School_id", referencedColumnName = "School_id", nullable = false)
    public School getSchoolBySchoolId() {
        return schoolBySchoolId;
    }

    public void setSchoolBySchoolId(School schoolBySchoolId) {
        this.schoolBySchoolId = schoolBySchoolId;
    }

    @ManyToOne
    @JoinColumn(name = "Course_id", referencedColumnName = "Course_id", nullable = false)
    public Course getCourseByCourseId() {
        return courseByCourseId;
    }

    public void setCourseByCourseId(Course courseByCourseId) {
        this.courseByCourseId = courseByCourseId;
    }
}
