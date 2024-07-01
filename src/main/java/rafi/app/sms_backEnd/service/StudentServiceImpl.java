package rafi.app.sms_backEnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import rafi.app.sms_backEnd.entity.Student;
import rafi.app.sms_backEnd.repository.StudentRepo;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        /* Why I have to use .get()??
         * Ans. It's used to avoid NullPointerException. */
        return studentRepo.findById(id).get();
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Optional<Student> optionalStudent = studentRepo.findById(id);
        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setStudentName(student.getStudentName());
            existingStudent.setStudentDept(student.getStudentDept());
            existingStudent.setStudentAddress(student.getStudentAddress());
            return studentRepo.save(existingStudent);
        }
        return null;
    }

    @Override
    public String deleteStudent(Long id) {
        studentRepo.deleteById(id);
        return "Student with id : " + id + "deleted successfully!";
    }

    @Override
    public Student getStudentByName(String name) {
        return studentRepo.findByStudentNameIgnoreCase(name);
    }

    @Override
    public Student getStudentByDepartment(String departmentName) {
        return studentRepo.findByDepartmentName(departmentName);
    }


}
