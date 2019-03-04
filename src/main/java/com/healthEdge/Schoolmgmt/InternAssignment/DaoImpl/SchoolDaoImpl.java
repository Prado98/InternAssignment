package com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.School;
import com.healthEdge.Schoolmgmt.InternAssignment.Repository.SchoolRepository;
import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Collection;

public class SchoolDaoImpl {
    public Collection<School> getAllSchool() {
    }

    public void getSchoolById(int schoolId) {
    }

    public School getSchoolByName(String schoolName) {
    }

    public School getSchoolByAddress(String schoolAddress) {
        return SchoolRepository.findAllByAddress(schoolAddress);
    }

    public School getSchoolByEmail(String schoolEmail) {
    }

    public void RemoveSchoolById(int schoolId) {
    }

    public void RemoveSchoolByName(String schoolName) {
    }

    public void RemoveSchoolByAddress(String schoolAddress) {
    }

    public void RemoveSchoolByEmail(String schoolEmail) {
    }

    public void updateSchool(School school) {
    }

    public void insertSchool(School school) {
    }
}
