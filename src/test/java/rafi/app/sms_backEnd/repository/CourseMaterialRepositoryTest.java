package rafi.app.sms_backEnd.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rafi.app.sms_backEnd.entity.Course;
import rafi.app.sms_backEnd.entity.CourseMaterial;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository repository;
    @Test
    public void saveCourseMaterial(){
        Course course = Course.builder()
                .courseId(1L)
                .title("DSA")
                .credit(3)
                .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .course(course)
                .courseMaterialId(1L)
                .url("www.google.com")
                .build();
        repository.save(courseMaterial);

    }

    @Test
    public void fetchAllCourseMaterials(){
        List<CourseMaterial> courseMaterials = repository.findAll();
        System.out.println(courseMaterials);
    }

}