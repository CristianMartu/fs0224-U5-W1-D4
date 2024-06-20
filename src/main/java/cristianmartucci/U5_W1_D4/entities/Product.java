package cristianmartucci.U5_W1_D4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
//@Table(name = "products")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected UUID product_id;
    protected String name;
    protected double price;
    protected double calories;


    public Product(String name, double price, double calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
}
