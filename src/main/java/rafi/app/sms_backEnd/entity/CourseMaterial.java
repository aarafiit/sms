package rafi.app.sms_backEnd.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "course")
@Builder
public class CourseMaterial {
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     @SequenceGenerator(
             name = "course_material_sequence",
             sequenceName = "course_material_sequence",
             allocationSize = 1
     )
     private Long courseMaterialId;
     private String url;

     @JoinColumn(
             name = "course_id",
             referencedColumnName = "courseId"
     )
     @OneToOne(
             cascade = CascadeType.ALL,
             fetch = FetchType.LAZY,
             optional = false
     )
     private Course course;
}
