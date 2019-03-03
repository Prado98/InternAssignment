package com.healthEdge.Schoolmgmt.InternAssignment.Repository;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.School;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
