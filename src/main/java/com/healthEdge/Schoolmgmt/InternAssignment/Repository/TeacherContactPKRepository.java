package com.healthEdge.Schoolmgmt.InternAssignment.Repository;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Student;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.TeacherTeacherContact;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.TeacherTeacherContactPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherContactPKRepository extends JpaRepository<TeacherTeacherContactPK, Integer> {
}
