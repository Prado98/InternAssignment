package com.healthEdge.Schoolmgmt.InternAssignment.Repository;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Student;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.TeacherTeacherContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherContactRepository extends JpaRepository<TeacherTeacherContact, Integer> {
}
