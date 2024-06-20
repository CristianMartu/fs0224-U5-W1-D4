package cristianmartucci.U5_W1_D4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Topping extends Product{

    @ManyToMany
    @JoinTable(name = "topping_pizza",
        joinColumns = @JoinColumn(name = "topping_id"),
        inverseJoinColumns = @JoinColumn(name = "pizza_id"))
    private List<Pizza> pizzaList;

    public Topping(String name, double calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
