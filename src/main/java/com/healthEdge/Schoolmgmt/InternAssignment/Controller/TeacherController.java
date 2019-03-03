package com.healthEdge.Schoolmgmt.InternAssignment.Controller;


import com.healthEdge.Schoolmgmt.InternAssignment.DaoImpl.TeacherDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Teacher")
public class TeacherController {
    @Autowired
   // eacherId;
    //private String teacherName;
    //private String teacherEmail
    private TeacherDaoImpl TeacherDao;

}
