package rafi.app.sms_backEnd.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rafi.app.sms_backEnd.entity.Course;
import rafi.app.sms_backEnd.entity.Teacher;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    TeacherRepository teacherRepository;
    @Test
    public void saveTeacher() {
        Course AI = Course.builder()
                .title("AI")
                .credit(2)
                .courseId(305L)
                .build();
        Course OOP = Course.builder()
                .title("OOP")
                .credit(2)
                .courseId(307L)
                .build();
        Course DE = Course.builder()
                .title("DE")
                .credit(1)
                .courseId(302L)
                .build();
        Teacher teacher = Teacher.builder()
                .teacherId(1L)
                .email("iftee@gmail.com")
                .name("iftee")
                .courses(List.of(AI,OOP,DE))
                .build();
        teacherRepository.save(teacher);
    }

}