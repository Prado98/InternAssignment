package com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Course;
import com.healthEdge.Schoolmgmt.InternAssignment.Repository.CourseRepository;
import com.healthEdge.Schoolmgmt.InternAssignment.Repository.OffersPKRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class CourseDaoImpl implements CourseRepository {

    CourseRepository courseRepository;
    public Collection<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(int courseId) {
        return courseRepository.findAllById(courseId);
    }

    public Course getCourseByName(String courseName) {
        return courseRepository.findAllByName(courseName);
    }

    public Course getCourseByCredit(int courseCredit) {
        return courseRepository.findAllByCourse(courseCredit);
    }

    public void RemoveCourseById(int courseId) {

        courseRepository.deleteById(courseId);
    }

    public void RemoveCourseByName(String courseName) {
        courseRepository.deleteByName(courseName);
    }

    public void RemoveCourseByCredits(int courseCredit) {
        courseRepository.deleteByCredits(courseCredit);
    }

    public void updateCourse(Course course) {

        courseRepository.save(course);
    }

    public void insertCourse(Course course) {

        courseRepository.save(course);
    }

}
