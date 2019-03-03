package com.healthEdge.Schoolmgmt.InternAssignment.Repository;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.School;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Student;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
    School findAllById(int schoolId);

    School findAllByName(String schoolName);
    //School findAllBySchoolAddress(String schoolName);

    School findAllByEmail(String schoolEmail);

    School findAllByAddress(String schoolAddress);

    void deleteById(String schoolEmail);

    void deleteByName(String schoolName);

    void deleteByAddress(String schoolAddress);

    void deleteByEmail(String schoolEmail);
}
