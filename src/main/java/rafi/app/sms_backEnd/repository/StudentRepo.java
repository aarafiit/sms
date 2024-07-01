package rafi.app.sms_backEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rafi.app.sms_backEnd.entity.Student;


public interface StudentRepo extends JpaRepository<Student,Long> {
    public Student findByStudentName(String studentName);
    public Student findByStudentNameIgnoreCase(String studentName);

    @Query(value = "SELECT * FROM Student WHERE student_dept = :departmentName",nativeQuery = true)
    public Student findByDepartmentName(String departmentName);
}
