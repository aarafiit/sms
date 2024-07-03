package rafi.app.sms_backEnd.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rafi.app.sms_backEnd.entity.Course;
import rafi.app.sms_backEnd.entity.CourseMaterial;
import rafi.app.sms_backEnd.entity.Guardian;
import rafi.app.sms_backEnd.entity.Student;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepoTest {

    @Autowired
    private StudentRepo studentRepo;

    @Test
    public void saveStudent() {
        Guardian guardian = Guardian.builder()
                .name("Asma")
                .phoneNo("0000000")
                .build();
        Student student = Student.builder()
                .studentName("Arham")
                .studentDept("IIT")
                .studentEmail("arham@gmail.com")
                .studentAddress("Cumilla")
                .guardian(guardian)
                .build();
        studentRepo.save(student);
    }

    @Test
    public void findStudent() {
        List<Student> student = studentRepo.findByStudentName("Arham");
        System.out.println("List : " + student);
    }

    @Test
    public void findStudentByEmail() {
        List<Student> student = studentRepo.findByStudentEmail("arham@gmail.com");
        System.out.println("List : " + student);
    }

    @Test
    public void findByStudentDept() {
        List<Student> student = studentRepo.findByStudentDept("IIT");
        System.out.println("List : " + student);
    }

    @Test
    public void updateStudent() {
        studentRepo.updateStudentEmail("shobuj@gmail.com", "shobujMia@gmail.com");
    }



}