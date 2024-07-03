package rafi.app.sms_backEnd.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(
        name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "",
                columnNames = "student_email"
        )
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long studentId;
    private String studentName;
    private String studentDept;
    private String studentAddress;
    @Column(name = "student_email")
    private String studentEmail;
    @Embedded
    private Guardian guardian;

   /* public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDept() {
        return studentDept;
    }

    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student(Long studentId, String studentName, String studentDept, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDept = studentDept;
        this.studentAddress = studentAddress;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentDept='" + studentDept + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }*/
}
