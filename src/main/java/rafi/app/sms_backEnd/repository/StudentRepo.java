package rafi.app.sms_backEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rafi.app.sms_backEnd.entity.Student;


public interface StudentRepo extends JpaRepository<Student,Long> {
}
