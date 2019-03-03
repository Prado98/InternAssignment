package com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.School;
import com.healthEdge.Schoolmgmt.InternAssignment.Repository.SchoolRepository;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class SchoolDaoImpl {

    @Autowired
    SchoolRepository schoolRepository;
    public Collection<School> getAllSchool() {
        return schoolRepository.findAll();
    }

    public School getSchoolById(int schoolId) {
        return schoolRepository.findAllById(schoolId);
    }

    public School getSchoolByName(String schoolName) {
        return schoolRepository.findAllByName(schoolName);
    }

    public School getSchoolByAddress(String schoolAddress) {
       return schoolRepository.findAllByAddress(schoolAddress);
    }

    public School getSchoolByEmail(String schoolEmail) {
        return schoolRepository.findAllByEmail(schoolEmail);
    }

    public void RemoveSchoolById(int schoolId) {
        schoolRepository.deleteById(schoolId);
    }

    public void updateSchool(School school) {
        schoolRepository.save(school);
    }

    public void insertSchool(School school) {
        schoolRepository.save(school);
    }

    public void RemoveSchoolByEmail(String schoolEmail) {
        schoolRepository.deleteByEmail(schoolEmail);
    }

    public void RemoveSchoolByAddress(String schoolAddress) {
        schoolRepository.deleteByAddress(schoolAddress);
    }

    public void RemoveSchoolByName(String schoolName) {
        schoolRepository.deleteByName(schoolName);
    }
}
