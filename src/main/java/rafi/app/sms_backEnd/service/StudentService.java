package rafi.app.sms_backEnd.service;

import rafi.app.sms_backEnd.entity.Student;
import rafi.app.sms_backEnd.error.StudentNotFoundException;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudent();

    public Student getStudentById(Long id) throws StudentNotFoundException;

    Student updateStudent(Long id, Student student);

    String deleteStudent(Long id);

    Student getStudentByName(String name);

    Student getStudentByDepartment(String departmentName);
}
