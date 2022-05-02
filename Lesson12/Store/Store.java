package Store;

import java.util.ArrayList;
import java.util.List;

import Products.Product;
import Ship.Ship;

public class Store {
    
    private List<Product> store = new ArrayList<>();

    
    public synchronized void put(Ship ship){
        while (store.stream().filter(a -> a.getType().equals(ship.getType())).count() < 0){
            try{
                wait();
            }
            catch (InterruptedException e){}
        }
        Product toShip = store.stream().filter(a -> a.getType().equals(ship.getType())).findFirst().get();
        ship.getCargo().add(toShip);
        store.remove(toShip);
        System.out.println("1 товар \"" + ship.getType() + "\" был отгружен");
        notify();
    
    }

    public synchronized void load(Product product){
        while (store.size()>49){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        store.add(product);
        System.out.println("Товар " + product + " добавлен на склад");
        notify();
    }
}
