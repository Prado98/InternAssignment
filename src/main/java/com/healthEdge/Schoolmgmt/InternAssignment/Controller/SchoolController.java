package com.healthEdge.Schoolmgmt.InternAssignment.Controller;


import com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl.StudentDaoImpl;
import com.healthEdge.Schoolmgmt.InternAssignment.Entity.School;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
@RequestMapping("/School")
public class SchoolController {
    @Autowired
    private SchoolDaoImpl schoolDao;
    @RequestMapping(method = @RequestMethod.GET)
    public Collection<School> getAllSchool() {
        return this.schoolDao.getAllSchool();
    }
    @RequestMapping(value="/{schoolId}",method = RequestMethod.GET)
    public School GetSchoolById(@PathVariable=("schoolId") int schoolId)
    {
        return this.schoolDao.getSchoolById(schoolId);
    }
    @RequestMapping(value="/{schoolName}",method = RequestMethod.GET)
    public School GetSchoolByName(@PathParam("schoolName") String schoolName)
    {
        return this.schoolDao.getSchoolByName(schoolName);
    }
    @RequestMapping(value="/{schoolAddress}",method = RequestMethod.GET)
    public School GetSchoolByAddress(@PathParam("schoolAddress") String schoolAddress)
    {
        return this.schoolDao.getSchoolByAddress(schoolAddress);
    }
    @RequestMapping(value="/{schoolEmail}",method = RequestMethod.GET)
    public School GetSchoolByEmail(@PathParam("schoolEmail") String schoolEmail)
    {
        return this.schoolDao.getSchoolByEmail(schoolEmail);
    }
    @RequestMapping(value= "/{schoolId}", method=@RequestMethod.DELETE)
    public void DeleteSchoolById(@PathVariable("schoolId") int schoolId)
    {
        this.schoolDao.RemoveSchoolById(schoolId);
    }
    @RequestMapping(value= "/{schoolName}", method=@RequestMethod.DELETE)
    public void DeleteSchoolByName(@PathParam("schoolName") String schoolName){
        this.schoolDao.RemoveSchoolByName(schoolName);
    }
    @RequestMapping(value="/{schoolAddress}", method= RequestMethod.DELETE)
    public void DeleteSchoolByAddress(@PathParam("schoolAddress") String schoolAddress){
        this.schoolDao.RemoveSchoolByAddress(schoolAddress);
    }
    @RequestMapping(value="/{schoolEmail}",method=RequestMethod.DELETE)
    public void DeleteSchoolByEmail(@PathParam("schoolEmail") String schoolEmail){
        this.schoolDao.RemoveSchoolByEmail(schoolEmail);
    }
    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)//update
    public void UpdateSchool(@RequestBody School school)
    {
        this.schoolDao.updateSchool(school);
    }
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void InsertSchool(@RequestBody School school)
    {
        this.schoolDao.insertSchool(school);
    }
}