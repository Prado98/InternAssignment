package com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Student;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.StudentStudentContact;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.StudentStudentContactPK;
import com.healthEdge.Schoolmgmt.InternAssignment.Repository.StudentContactPKRepository;
import com.healthEdge.Schoolmgmt.InternAssignment.Repository.StudentContactRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class StudentDaoImpl implements StudentContactPKRepository,StudentContactRepository,StudentContactPKRepository
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

    @Override
    public Optional<StudentStudentContactPK> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<StudentStudentContactPK> findAll() {
        return null;
    }

    @Override
    public List<StudentStudentContactPK> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<StudentStudentContactPK> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<StudentStudentContactPK> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void delete(StudentStudentContact studentStudentContact) {

    }

    @Override
    public void deleteAll(Iterable<? extends StudentStudentContact> iterable) {

    }

    @Override
    public void flush() {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public StudentStudentContactPK getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends StudentStudentContact> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends StudentStudentContact> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends StudentStudentContact> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends StudentStudentContact> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends StudentStudentContact> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends StudentStudentContact> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends StudentStudentContact> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<StudentStudentContact> iterable) {

    }

    @Override
    public <S extends StudentStudentContact> S save(S s) {
        return null;
    }

    @Override
    public <S extends StudentStudentContact> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }
}
