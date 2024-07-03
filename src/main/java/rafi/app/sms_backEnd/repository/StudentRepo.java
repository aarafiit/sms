package rafi.app.sms_backEnd.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rafi.app.sms_backEnd.entity.Student;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
/*
    public Student findByStudentName(String studentName);
*/
    public Student findByStudentNameIgnoreCase(String studentName);

    @Query(value = "SELECT * FROM Student WHERE student_dept = :departmentName",nativeQuery = true)
    public Student findByDepartmentName(String departmentName);

    public List<Student> findByStudentName(String name);

/*
    JPQL
*/
    @Query(value = "select s from Student s where s.studentEmail = :email")
    public List<Student> findByStudentEmail(@Param("email") String email);

    @Query(value = "select s from Student s where s.studentDept = ?1")
    public List<Student> findByStudentDept(String dept);

/*
    Update
*/
    @Modifying
    @Transactional
    @Query(
            value = "update tbl_student SET student_email = :newEmail where student_email = :email",
            nativeQuery = true
    )
    public void updateStudentEmail(@Param("email")String email,@Param("newEmail") String newEmail);

}
