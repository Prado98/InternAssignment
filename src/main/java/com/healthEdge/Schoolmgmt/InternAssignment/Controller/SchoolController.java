package com.healthEdge.Schoolmgmt.InternAssignment.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/School")
public class SchoolController {
    @Autowired
    private SchoolServices schoolService;
    @RequestMapping(method = @RequestMethod.GET)
    public Collection<School> getAllSchool() {
        return this.schoolService.getAllSchool();
    }
    @RequestMapping(value="/{School_id}",method = RequestMethod.GET)
    public School getSchoolById(@PathVariable=("School_id") int School_id)
    {
       return this.schoolService.getSchoolById();
    }
    @RequestMapping(value="/{School_name}",method = RequestMethod.GET)
    public School getSchoolByName(@PathVariable=("School_name") Striing School_name)
    {
        return this.schoolService.getSchoolByName();
    }
    @RequestMapping(value="/{School_address}",method = RequestMethod.GET)
    public School getSchoolByAddress(@PathVariable=("School_address") String School_address)
    {
        return this.schoolService.getSchoolByAddress();
    }
    @RequestMapping(value="/{School_email}",method = RequestMethod.GET)
    public School getSchoolByEmail(@PathVariable=("School_email") String School_email)
    {
        return this.schoolService.getSchoolByEmail();
    }
    @RequestMapping(value= "/{School_id}", method=@RequestMethod.DELETE)
    public void RemoveSchoolById(@PathVariable=("School_id") int School_id)
    {
        this.schoolService.RemoveSchoolById(School_id);
    }
    @RequestMapping(value= "/{School_name}", method=@RequestMethod.DELETE)
    public void RemoveSchoolByName(@PathVariable=("School_name") String School_name)
    {
        this.schoolService.RemoveSchoolByName(School_name);
    }
    @RequestMapping(value="/{School_address}",method= RequestMethod.DELETE(School_adress))
    public void RemoverSchoolByAddress(@PathVariable="School_address" String School_address){
        this.schoolService.RemoveSchoolByAddress(School_address);
    }
    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)//update
    public void UpdateSchoolById(@RequestBody School school)
    {
        this.schoolService.updateSchool(school);
    }
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void InsertSchool(@RequestBody School school)
    {
        this.schoolService.insertSchool(school);
    }
}
