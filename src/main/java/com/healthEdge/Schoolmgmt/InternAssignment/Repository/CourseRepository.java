package com.healthEdge.Schoolmgmt.InternAssignment.Repository;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Course;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.NamedQuery;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    Course findAllById(int courseId);

    Course findAllByName(String courseName);

    Course findAllByCourse(int courseCredit);

    void deleteByName(String courseName);

    void deleteByCredits(int courseCredit);


}
