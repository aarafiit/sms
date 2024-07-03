package rafi.app.sms_backEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rafi.app.sms_backEnd.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
