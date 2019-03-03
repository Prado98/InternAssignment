package com.healthEdge.Schoolmgmt.InternAssignment.Controller;


import com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl.TeacherDaoImpl;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.School;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
@RequestMapping("/Teacher")
public class TeacherController {
    @Autowired
    private TeacherDaoImpl TeacherDao;
    @RequestMapping(method= RequestMethod.GET)
    public Collection<Teacher> getAllTeachers(){
        return this.TeacherDao.GetAllTeachers();
    }
    @RequestMapping(value="/{teacherId}",method=RequestMethod.GET)
    public Teacher GetTeachersById(@PathVariable("teacherId") int teacherId){
        return this.TeacherDao.getTeacherById(teacherId);
    }
    @RequestMapping(value="/{teacherName}",method=RequestMethod.GET)
    public Teacher GetTeachersByName(@PathParam("teacherName") String teacherName){
        return this.TeacherDao.getTeacherByName(teacherName);
    }
    @RequestMapping(value="/{teacherEmail}",method=RequestMethod.GET)
    public Teacher GetTeachersByEmail(@PathParam("teacherEmail") String teacherEmail){
        return this.TeacherDao.getTeacherByEmail(teacherEmail);
    }
    @RequestMapping(value ="/{teacherId}", method = RequestMethod.DELETE)
    public void DeleteTeacherById(@PathVariable("teacherId") int teacherId){
        this.TeacherDao.RemoveTeacherById(teacherId);
    }
    @RequestMapping(value ="/{teachername}", method = RequestMethod.DELETE)
    public void DeleteTeacherByName(@PathParam("teachername") String teachername){
        this.TeacherDao.RemoveTeacherByName(teachername);
    }
    @RequestMapping(value ="/{teacherEmail}", method = RequestMethod.DELETE)
    public void DeleteTeacherByEmail(@PathParam("teacherEmail") String teacherEmail){
        this.TeacherDao.RemoveTeacherByEmail(teacherEmail);
    }
    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)//update
    public void UpdateTeacher(@RequestBody Teacher teacher)
    {
        this.TeacherDao.updateTeacher(teacher);
    }
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void InsertTeacher(@RequestBody Teacher teacher)
    {
        this.TeacherDao.insertTeacher(teacher);
    }

}
