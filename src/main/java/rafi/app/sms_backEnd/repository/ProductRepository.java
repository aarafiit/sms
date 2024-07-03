package rafi.app.sms_backEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rafi.app.sms_backEnd.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
