package rafi.app.sms_backEnd.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rafi.app.sms_backEnd.entity.Student;
import rafi.app.sms_backEnd.service.StudentService;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {

        @Autowired
        private StudentService studentService;

/*
        creating a new Student
*/
        @PostMapping("/students")
        public Student saveStudent(@RequestBody Student student){
                return studentService.saveStudent(student);
        }

/*
        fetching all student
*/
        @GetMapping("/students")
        public List<Student> getAllStudent(){
                return studentService.getAllStudent();
        }

/*
        fetch student by ID
*/
        @GetMapping("/students/{id}")
        public Student getStudentById(@PathVariable("id") Long id){
                return studentService.getStudentById(id);
        }

/*
        update student by Id
*/
        @PutMapping("/students/{id}")
        public Student updateStudentById(@PathVariable("id") Long id,@RequestBody Student student){
               return studentService.updateStudent(id,student);
        }

/*
        delete Student By Id
*/
        @DeleteMapping("/students/{id}")
        public String deletStudentById(@PathVariable Long id){
                return studentService.deleteStudent(id);
        }

}
