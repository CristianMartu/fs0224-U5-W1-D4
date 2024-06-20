package cristianmartucci.U5_W1_D4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@DiscriminatorValue("toppings")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Topping extends Product{

//    @OneToMany
//    @JoinColumn(name = "pizza_id")
//    private Pizza pizza;

    public Topping(String name, double price, double calories) {
        super(name, price, calories);
    }
}
