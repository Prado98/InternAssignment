package com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Student;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.StudentStudentContact;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.StudentStudentContactPK;
import com.healthEdge.Schoolmgmt.InternAssignment.Repository.StudentContactPKRepository;
import com.healthEdge.Schoolmgmt.InternAssignment.Repository.StudentContactRepository;
import com.healthEdge.Schoolmgmt.InternAssignment.Repository.StudentRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class StudentDaoImpl implements StudentRepository
{
    public Collection<Student> getAllStudents() {
        return null;
    }

    public Student getStudentsById(int studentId) {
        return null;
    }

    public Student getStudentFname(String studentFname) {
        return null;
    }

    public void insertStudent(Student student) {
    }

    public void updateStudent(Student student) {
    }

    public void RemoveCourseByCredits(int courseCredit) {
    }

    public void RemoveStudentByFName(String studentFname) {
    }

    public Student getStudentLname(String studentLname) {
        return null;
    }

    public void RemoveStudentById(int studentId) {
    }

    public Student getStudentByGender(String studentGender) {
        return null;
    }

    public Student getStudentAddress(String studentAddress) {
        return null;
    }


}
