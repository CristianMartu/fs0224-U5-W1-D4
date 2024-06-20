package cristianmartucci.U5_W1_D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID menu_id;
    private List<Product> products;

    public Menu(List<Product> products) {
        this.products = products;
    }
}
