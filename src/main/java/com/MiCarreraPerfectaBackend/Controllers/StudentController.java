package com.MiCarreraPerfectaBackend.Controllers;

import com.MiCarreraPerfectaBackend.Config.WebApiResponse;
import com.MiCarreraPerfectaBackend.Entity.Student;
import com.MiCarreraPerfectaBackend.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Tello
 */
@RestController
@RequestMapping("/student") // Base path para los endpoints de estudiantes
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @GetMapping
    public WebApiResponse getAllStudents() {
        return WebApiResponse.newResponse(-1, "Status: ",studentService.getAllStudents());
    }

    @PostMapping("/add")
    public WebApiResponse addStudent(@RequestBody Student student) {
        return WebApiResponse.newResponse(-1, "Status: ",studentService.addStudent(student));
    }
    
}