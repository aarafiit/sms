package rafi.app.sms_backEnd.service;

import rafi.app.sms_backEnd.entity.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudent();

    public Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    String deleteStudent(Long id);
}
