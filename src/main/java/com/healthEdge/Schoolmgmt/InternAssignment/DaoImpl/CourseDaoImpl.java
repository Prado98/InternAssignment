package com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Course;
import com.healthEdge.Schoolmgmt.InternAssignment.Repository.CourseRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class CourseDaoImpl implements CourseRepository{
    CourseRepository courseRepository;
    public Collection<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(int courseId) {
        return courseRepository.findAllById(courseId);
    }

    public Course getCourseByName(String courseName) {
        return courseRepository.findAllByName(courseName);
    }

    public Course getCourseByCredit(int courseCredit) {
        return courseRepository.findAllByCourse(courseCredit);
    }

    public void RemoveCourseById(int courseId) {

        courseRepository.deleteById(courseId);
    }

    public void RemoveCourseByName(String courseName) {
        courseRepository.deleteByName(courseName);
    }

    public void RemoveCourseByCredits(int courseCredit) {
        courseRepository.deleteByCredits(courseCredit);
    }

    public void updateCourse(Course course) {

        courseRepository.save(course);
    }

    public void insertCourse(Course course) {

        courseRepository.save(course);
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public List<Course> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Course> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Course> findAllById(Iterable<Integer> iterable) {
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
    public void delete(Course course) {

    }

    @Override
    public void deleteAll(Iterable<? extends Course> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Course> S save(S s) {
        return null;
    }

    @Override
    public <S extends Course> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Course> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Course> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Course> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Course getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Course> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Course> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Course> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Course> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Course> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Course> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public Course findAllById(int courseId) {
        return null;
    }

    @Override
    public Course findAllByName(String courseName) {
        return null;
    }

    @Override
    public Course findAllByCourse(int courseCredit) {
        return null;
    }

    @Override
    public void deleteByName(String courseName) {

    }

    @Override
    public void deleteByCredits(int courseCredit) {

    }
}
