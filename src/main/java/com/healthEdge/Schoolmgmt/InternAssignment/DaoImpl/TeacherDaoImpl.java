package com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl;

import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Teacher;
import com.healthEdge.Schoolmgmt.InternAssignment.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class TeacherDaoImpl{

    @Autowired
    TeacherRepository teacherRepository;
    public Collection<Teacher> GetAllTeachers() {
        return null;
    }

    public Teacher getTeacherById(int teacherId) {
        return teacherRepository.findAllById(teacherId);
    }

    public Teacher getTeacherByName(String teacherName) {
        return teacherRepository.findAllByName(teacherName);
    }

    public void insertTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public void updateTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public void RemoveTeacherByEmail(String teacherEmail) {
        teacherRepository.deleteByEmail(teacherEmail);
    }

    public void RemoveTeacherByName(String teachername) {
        teacherRepository.deleteByName(teachername);
    }

    public void RemoveTeacherById(int teacherId) {
        teacherRepository.deleteById(teacherId);
    }

    public Teacher getTeacherByEmail(String teacherEmail) {
        return teacherRepository.findByEmail(teacherEmail);
    }
}
