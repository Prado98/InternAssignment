package com.healthEdge.Schoolmgmt.InternAssignment.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Course {
    private Integer courseId;
    private String courseName;
    private Integer courseCredit;
    private Collection<Offers> offersByCourseId;

    @Id
    @Column(name = "Course_id", nullable = false)
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "Course_name", nullable = false, length = 255)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Basic
    @Column(name = "Course_credit", nullable = false)
    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (courseId != null ? !courseId.equals(course.courseId) : course.courseId != null) return false;
        if (courseName != null ? !courseName.equals(course.courseName) : course.courseName != null) return false;
        if (courseCredit != null ? !courseCredit.equals(course.courseCredit) : course.courseCredit != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId != null ? courseId.hashCode() : 0;
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        result = 31 * result + (courseCredit != null ? courseCredit.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "courseByCourseId")
    public Collection<Offers> getOffersByCourseId() {
        return offersByCourseId;
    }

    public void setOffersByCourseId(Collection<Offers> offersByCourseId) {
        this.offersByCourseId = offersByCourseId;
    }
}
