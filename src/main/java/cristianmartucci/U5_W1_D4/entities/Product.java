package cristianmartucci.U5_W1_D4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "product_type")
@NoArgsConstructor
@Getter
@Setter
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected UUID product_id;
    protected String name;
    protected double price;
    protected double calories;

    @ManyToMany(mappedBy = "products")
    private List<Menu> menuList;

    public Product(String name, double calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}
