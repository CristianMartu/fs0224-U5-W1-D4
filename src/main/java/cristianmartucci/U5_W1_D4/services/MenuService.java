package cristianmartucci.U5_W1_D4.services;

import cristianmartucci.U5_W1_D4.entities.Menu;
import cristianmartucci.U5_W1_D4.entities.Product;
import cristianmartucci.U5_W1_D4.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public void saveMenu(Menu menu){
        menuRepository.save(menu);
        System.out.println("Menu " + menu + " salvato correttamente");
    }

    public List<Menu> filterByName(String name){
        return menuRepository.findByName(name);
    }
}
