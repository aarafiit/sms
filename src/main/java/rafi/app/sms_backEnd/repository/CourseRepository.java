package rafi.app.sms_backEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rafi.app.sms_backEnd.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
