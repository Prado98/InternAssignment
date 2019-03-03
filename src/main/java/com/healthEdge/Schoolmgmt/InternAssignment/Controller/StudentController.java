package com.healthEdge.Schoolmgmt.InternAssignment.Controller;

import com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl.StudentDaoImpl;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Course;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;


@RestController
@RequestMapping("/Student")

public class StudentController {
    @Autowired
    private StudentDaoImpl studentDao;
    @RequestMapping(method= RequestMethod.GET)
    public Collection<Student> getAllStudents(){
       return this.studentDao.getAllStudents();
    }
    @RequestMapping(value="/{studentId}",method=RequestMethod.GET)
    public  Student getStudentsById(@PathVariable("studentId") int studentId){
        return this.studentDao.getStudentsById(studentId);
    }
    @RequestMapping(value="/{studentFname}",method=RequestMethod.GET)
    public Student getStudentsFName(@PathParam("studentFname") String studentFname){
        return this.studentDao.getStudentFname(studentFname);
    }
    @RequestMapping(value="/{studentLname}",method=RequestMethod.GET)
    public Student getStudentsLName(@PathParam("studentLname") String studentLname){
        return this.studentDao.getStudentLname(studentLname);
    }
    @RequestMapping(value="/{studentAddress}",method=RequestMethod.GET)
    public Student getStudentsAddress(@PathParam("studentAddress") String studentAddress){
        return this.studentDao.getStudentAddress(studentAddress);
    }
    @RequestMapping(value="/{studentGender}",method=RequestMethod.GET)
    public Student getStudentsByGender(@PathParam("studentGender") String studentGender){
        return this.studentDao.getStudentByGender(studentGender);
    }
    @RequestMapping(value="/{studentId}",method=RequestMethod.DELETE)
    public void DeleteStudentById(@PathVariable("studentId") int studentId){
        this.studentDao.RemoveStudentById(studentId);
    }
    @RequestMapping(value="/{studentFname}",method=RequestMethod.DELETE)
    public void DeleteStudentByFName(@PathParam("studentFname") String studentFname){
        this.studentDao.RemoveStudentByFName(studentFname);
    }
    @RequestMapping(value="/{studentLname}",method=RequestMethod.DELETE)
    public void DeleteStudentByLName(@PathParam("studentLname") String studentFname){
        this.studentDao.RemoveStudentByFName(studentFname);
    }
    @RequestMapping(value="/{courseCredit}",method = RequestMethod.DELETE)
    public void DeleteCourseByCourse(@PathVariable("courseCredit") int courseCredit){
        this.studentDao.RemoveCourseByCredits(courseCredit);
    }
    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)//update
    public void UpdateStudnetById(@RequestBody Student student)
    {
        this.studentDao.updateStudent(student);
    }
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void InsertStudent(@RequestBody Student student)
    {
        this.studentDao.insertStudent(student);
    }


}
