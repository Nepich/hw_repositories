import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Ship.Ship;
import Store.Store;
import Suppliers.BrickSupplier;
import Suppliers.SteelSupplier;
import Suppliers.WoodSupplier;

public class Main{

    public static void main(String[] args) {
        
        Store store = new Store();
        Ship ship = new Ship();
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        System.out.println(ship.getCargo().size() + " " + ship.getType());
        System.out.println(ship1.getCargo().size() + " " + ship1.getType());
        System.out.println(ship2.getCargo().size() + " " + ship2.getType());
        Port port = new Port(store, 2);
        BrickSupplier bs = new BrickSupplier(store);
        WoodSupplier ws = new WoodSupplier(store);
        SteelSupplier ss = new SteelSupplier(store);
        new Thread(bs).start();
        new Thread(ws).start();
        new Thread(ss).start();


        ExecutorService shipping = Executors.newFixedThreadPool(port.getCraneNum());
        shipping.submit(new Crane(store, ship));
        shipping.submit(new Crane(store, ship1));
        shipping.submit(new Crane(store, ship2));
        shipping.shutdown();
    }

}