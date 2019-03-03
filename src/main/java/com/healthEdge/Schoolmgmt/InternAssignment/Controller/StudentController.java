package com.healthEdge.Schoolmgmt.InternAssignment.Controller;

import com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl.StudentDaoImpl;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.School;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;


@RestController
@RequestMapping(/Student);
public class StudentController {
    @Autowired
    private StudentDaoImpl StudentDao;
    @RequestMapping(method = @RequestMethod.GET)
    public Collection<Student> GetAllStudent() {
        return this.StudentDao.getAllStudents();
    }
    @RequestMapping(value="/{studentId}",method = RequestMethod.GET)
    public Student GetStudentById(@PathVariable("studentId") int studentId)
    {
        return this.StudentDao.getStudentById(studentId);
    }
    @RequestMapping(value="/{studentFname}",method = RequestMethod.GET)
    public Student GetStudentByFname(@PathParam("studentFname") String studentFname)
    {
        return this.StudentDao.getStudentByFName(studentFname);
    }
    @RequestMapping(value="/{studentLname}",method = RequestMethod.GET)
    public Student GetStudentByLname(@PathParam("studentLname") String studentLname)
    {
        return this.StudentDao.getStudentByLName(studentLname);
    }
    @RequestMapping(value="/{studentAddress}",method = RequestMethod.GET)
    public Student GetStudentByAddress(@PathParam("studentAddress") String studentAddress)
    {
        return this.StudentDao.getStudentByADDress(studentAddress);
    }
    @RequestMapping(value="/{studentId}",method=RequestMethod.DELETE)
    public void DeleteStudentByid(@PathVariable("studentId") int studentId){
        this.StudentDao.removeStudentByid(studentId);
    }
    @RequestMapping(value="/{studentFname}",method=RequestMethod.DELETE)
    public void DeleteStudentByFname(@PathParam("studentFname") String studentFname){
        this.StudentDao.removeStudentByFName(studentFname);
    }
    @RequestMapping(value="/{studentLname}",method=RequestMethod.DELETE)
    public void DeleteStudentByLname(@PathParam("studentLname") String studentLname){
        this.StudentDao.removeStudentByLName(studentLname);
    }
    @RequestMapping(value="/{studentAddress}",method=RequestMethod.DELETE)
    public void DeleteStudentAddress(@PathParam("studentAddress") String studentAddress){
        this.StudentDao.removeStudentByAddress(studentAddress);
    }
    @RequestMapping(value="/{studentGender}",method=RequestMethod.DELETE)
    public void DeleteStudentGender(@PathParam("studentGender") String studentGender){
        this.StudentDao.removeStudentByGender(studentGender);
    }
    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)//update
    public void UpdateStudent(@RequestBody Student student)
    {
        this.StudentDao.updateStudent(student);
    }
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void InsertStudents(@RequestBody Student student)
    {
        this.StudentDao.insertStudent(student);
    }

}