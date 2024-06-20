package cristianmartucci.U5_W1_D4.repositories;

import cristianmartucci.U5_W1_D4.entities.Menu;
import cristianmartucci.U5_W1_D4.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {
    List<Menu> findByName(String name);
}
