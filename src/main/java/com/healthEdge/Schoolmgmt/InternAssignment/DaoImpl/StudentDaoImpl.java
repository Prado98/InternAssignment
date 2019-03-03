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
    StudentRepository studentRepository;
    public Collection<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentsById(int studentId) {
        return studentRepository.findAllById(studentId);
    }

    public Student getStudentFname(String studentFname) {
        return studentRepository.findAllByFName(studentFname);
    }

    public void insertStudent(Student student) {

        studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    public void RemoveCourseByCredits(int courseCredit) {
    }

    public void RemoveStudentByFName(String studentFname) {
    }

    public Student getStudentLname(String studentLname) {
        return null;
    }

    public void RemoveStudentById(int studentId) {
        studentRepository.deleteById(studentId);
    }

    public Student getStudentByGender(String studentGender) {
        return studentRepository.findAllByGender(studentGender);
    }

    public Student getStudentAddress(String studentAddress) {
        return null;
    }


}
