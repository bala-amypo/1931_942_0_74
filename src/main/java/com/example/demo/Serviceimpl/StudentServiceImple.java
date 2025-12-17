package com.example.demo.Serviceimpl;

import org.springframework.sterotype.Service;

import com.example.demo.service.StudentSrevice;

@Service

public class StudentServiceImple implements StudentService{
    private final StudentRepository studentRepository;
    public StudentServiceImple(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }



    public Student saveStudent(Student student){
        return studentRepository.save()
    }
}