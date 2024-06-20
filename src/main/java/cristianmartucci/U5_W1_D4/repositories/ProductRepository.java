package cristianmartucci.U5_W1_D4.repositories;

import cristianmartucci.U5_W1_D4.entities.Product;
import cristianmartucci.U5_W1_D4.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

    List<Product> findByName(String name);

    List<Product> findByNameStartingWithIgnoreCase(String name);
}
