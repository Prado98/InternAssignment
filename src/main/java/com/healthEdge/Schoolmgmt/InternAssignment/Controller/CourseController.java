package com.healthEdge.Schoolmgmt.InternAssignment.Controller;


import com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl.CourseDaoImpl;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Course;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/Course")
public class CourseController {



    private CourseDaoImpl courseDao;
    @RequestMapping(method= RequestMethod.GET)
    public Collection<Course> getAllCourses(){

       return this.courseDao.getAllCourses();

    }

    @RequestMapping(value="/{courseId}",method=RequestMethod.GET)
    public Course getCourseById(@PathVariable("courseId") int courseId){
        return this.courseDao.getCourseById(courseId);
    }
    @RequestMapping(value="/{courseName}",method=RequestMethod.GET)
    public Course getCourseByName(@PathParam("courseName") String courseName){
        return this.courseDao.getCourseByName(courseName);
    }
    @RequestMapping(value="/{CourseCredit}",method=RequestMethod.GET)
    public Course getCourseByName(@PathVariable("courseCredit") int courseCredit){
        return this.courseDao.getCourseByCredit(courseCredit);
    }
    @RequestMapping(value="/{courseId}",method=RequestMethod.DELETE)
    public void DeleteCourseById(@PathVariable("courseId") int courseId){
        this.courseDao.RemoveCourseById(courseId);
    }
    @RequestMapping(value="/{courseName}",method=RequestMethod.DELETE)
    public void DeleteCourseByName(@PathParam("courseName") String courseName){
         this.courseDao.RemoveCourseByName(courseName);
    }
    @RequestMapping(value="/{courseCredit}",method = RequestMethod.DELETE)
    public void DeleteCourseByCourse(@PathVariable("courseCredit") int courseCredit){
        this.courseDao.RemoveCourseByCredits(courseCredit);
    }
    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)//update
    public void UpdateCourseById(@RequestBody Course course)
    {
        this.courseDao.updateCourse(course);
    }
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void InsertCourse(@RequestBody Course course)
    {
        this.courseDao.insertCourse(course);
    }


}
