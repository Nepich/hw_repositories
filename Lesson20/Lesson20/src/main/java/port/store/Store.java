package port.store;

import java.util.ArrayList;
import java.util.List;

import port.products.Product;
import port.ship.Ship;

public class Store {
    
    private List<Product> store = new ArrayList<>();

    
    public synchronized void put(Ship ship){
        while (store.stream().filter(a -> a.getType().equals(ship.getType())).count() <= 0){
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
        while (store.size()>74){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        store.add(product);
        System.out.println("Товар " + product + " добавлен на склад");
        notify();
    }
}
