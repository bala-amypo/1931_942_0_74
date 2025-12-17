package com.example.demo.Controller;


@RestController
public class StudentController {
    @Autowired
    StudentService studentservice;

    @postMapping("/postdata")
    public Student postdata(@RequestBody Stuentity student ){
        return studentservice.saveStudent(student);
    }
}