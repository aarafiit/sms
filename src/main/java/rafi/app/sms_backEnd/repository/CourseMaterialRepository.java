package rafi.app.sms_backEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rafi.app.sms_backEnd.entity.CourseMaterial;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {
}
