package cristianmartucci.U5_W1_D4.services;

import cristianmartucci.U5_W1_D4.entities.Product;
import cristianmartucci.U5_W1_D4.entities.Topping;
import cristianmartucci.U5_W1_D4.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product product){
        productRepository.save(product);
        System.out.println("Product " + product + " salvato correttamente");
    }

    public List<Product> filterByName(String name){
        return productRepository.findByName(name);
    }

    public List<Product> filterByNameLike(String name){
        return productRepository.findByNameStartingWithIgnoreCase(name);
    }
}
