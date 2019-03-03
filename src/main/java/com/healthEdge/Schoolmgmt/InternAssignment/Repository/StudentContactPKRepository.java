package com.healthEdge.Schoolmgmt.InternAssignment.Repository;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Student;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.StudentStudentContactPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentContactPKRepository extends JpaRepository<StudentStudentContactPK, Integer> {
}
