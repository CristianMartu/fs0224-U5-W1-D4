package cristianmartucci.U5_W1_D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Pizza extends Product {

    @ManyToMany(mappedBy = "pizzaList")
    private List<Topping> toppings;

    public Pizza(String name, double calories, double price, List<Topping> toppings) {
        super(name, calories, price);
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", toppings=" + toppings +
                '}';
    }


//    @Override
//    public String toString() {
//        return "Pizza{" +
//                "toppings=" + toppings +
//                ", product_id=" + product_id +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                ", calories=" + calories +
//                '}';
//    }
}
