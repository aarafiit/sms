package rafi.app.sms_backEnd.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rafi.app.sms_backEnd.entity.Course;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void getAllCourses() {
        List<Course> courses = courseRepository.findAll();
        System.out.println(courses);
    }
}