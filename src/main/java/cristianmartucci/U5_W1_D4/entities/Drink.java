package cristianmartucci.U5_W1_D4.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Drink extends Product{

    public Drink(String name, double calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
