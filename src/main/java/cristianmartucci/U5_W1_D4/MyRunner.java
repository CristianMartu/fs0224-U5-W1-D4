package cristianmartucci.U5_W1_D4;


import cristianmartucci.U5_W1_D4.entities.Drink;
import cristianmartucci.U5_W1_D4.entities.Menu;
import cristianmartucci.U5_W1_D4.entities.Pizza;
import cristianmartucci.U5_W1_D4.entities.Topping;
import cristianmartucci.U5_W1_D4.services.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Transactional
public class MyRunner implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    @Autowired
    private AnnotationConfigApplicationContext context;

//    @Autowired
//    private Menu menu;

    @Override
    public void run(String... args) throws Exception {
        Topping topping = (Topping) context.getBean("tomato");
        Topping topping2 = (Topping) context.getBean("cheese");
        Topping topping3 = (Topping) context.getBean("ham");
        Topping topping4 = (Topping) context.getBean("onions");
        Topping topping5 = (Topping) context.getBean("pineapple");
        Topping topping6 = (Topping) context.getBean("salami");

        Drink drink = (Drink) context.getBean("lemonade");
        Drink drink2 = (Drink) context.getBean("water");
        Drink drink3 = (Drink) context.getBean("wine");

        Pizza pizza = new Pizza("Pizza Margherita", 1104, 4.99, Arrays.asList(topping,topping2));
        Pizza pizza2 = new Pizza("Hawaiian Pizza", 1024, 6.49, Arrays.asList(topping,topping2, topping5));
        Pizza pizza3 = new Pizza("Salami Pizza", 1160, 5.99, Arrays.asList(topping,topping2, topping6));

//        productService.saveProduct(topping);
//        productService.saveProduct(topping2);
//        productService.saveProduct(topping3);
//        productService.saveProduct(topping4);
//        productService.saveProduct(topping5);
//        productService.saveProduct(topping6);
//
//        productService.saveProduct(drink);
//        productService.saveProduct(drink2);
//        productService.saveProduct(drink3);
//
//        productService.saveProduct(pizza);
//        productService.saveProduct(pizza2);
//        productService.saveProduct(pizza3);

//        System.out.println(menu);
//        System.out.println(pizza);
        System.out.println("----------FIND BY NAME---------");
        productService.filterByName("Tomato").forEach(System.out::println);
        productService.filterByName("Pizza Margherita").forEach(System.out::println);
        productService.filterByName("Cheese").forEach(System.out::println);

        System.out.println("----------FIND BY NAME PARTIALS---------");
        productService.filterByNameLike("tomat").forEach(System.out::println);
        productService.filterByNameLike("s").forEach(System.out::println);
        productService.filterByNameLike("chees").forEach(System.out::println);

        System.out.println("-------------------");
    }
}
