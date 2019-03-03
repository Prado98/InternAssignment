package com.healthEdge.Schoolmgmt.InternAssignment.Repository;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Student;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    Teacher findAllById(int teacherId);

    Teacher findAllByName(String teacherName);

    void deleteByEmail(String teacherEmail);

    void deleteByName(String teachername);

    Teacher findByEmail(String teacherEmail);
}
