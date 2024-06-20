package cristianmartucci.U5_W1_D4.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
//@DiscriminatorValue("drinks")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Drink extends Product{

    public Drink(String name, double price, double calories) {
        super(name, price, calories);
    }
}
