package com.healthEdge.Schoolmgmt.InternAssignment.Controller;


import com.healthEdge.Schoolmgmt.InternAssignment.Entity.Course;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
@RequestMapping("/Course")
public class CourseController {
    @Autowired
    private CourseController courseController;
    @RequestMapping(method= RequestMethod.GET)
    public Collection<Course> getAllCourses(){
        this.courseController.getAllCourses();
    }
    @RequestMapping(value="/{courseId}",method=RequestMethod.GET)
    public getCourseById(@PathVariable=("courseId") int courseId){
        return this.courseController.getCourseById(courseId);
    }
    @RequestMapping(value="/{courseName}",method=RequestMethod.GET)
    public getCourseByName(@PathParam("courseName") String courseName){
        return this.courseController.getCourseByName(courseName);
    }
    @RequestMapping(value="/{CourseCredit}",method=RequestMethod.GET)
    public getCourseByName(@PathVariable=("courseCredit") int courseCredit){
        return this.courseController.getCourseByCredit(courseCredit);
    }
    @RequestMapping(value="/{courseId}",method=RequestMethod.DELETE)
    public void DeleteCourseById(@PathVariable=("courseId") int courseId){
        this.courseController.RemoveCourseById(courseId);
    }
    @RequestMapping(value="/{courseName}",method=RequestMethod.DELETE)
    public DeleteCourseByName(@PathParam("courseName") String courseName){
         this.courseController.RemoveCourseByName(courseName);
    }
    @RequestMapping(value="/{courseCredit}",method = RequestMethod.DELETE)
    public void DeleteCourseByCourse(@PathVariable=("courseCredit") int courseCredit){
        this.courseController.RemoveCourseByCredits(courseCredit);
    }
    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)//update
    public void UpdateCourseById(@RequestBody Course course)
    {
        this.courseController.updateCourse(course);
    }
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void InsertCourse(@RequestBody Course course)
    {
        this.courseController.insertCourse(course);
    }


}
