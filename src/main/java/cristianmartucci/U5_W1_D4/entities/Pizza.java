package cristianmartucci.U5_W1_D4.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
//@DiscriminatorValue("pizzas")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pizza extends Product {

//    @OneToMany(mappedBy = "pizza")
//    private List<Topping> toppings;

    public Pizza(String name, double price, double calories) {
        super(name, price, calories);
    }
}
