import Ship.Ship;
import Store.Store;

public class Crane extends Thread {

    Store store;
    private Ship ship;

    Crane(Store store, Ship ship){
        this.store = store;
        this.ship = ship;
    }

    @Override
    public void run() {
        int cargoSize = ship.getCargo().size();
        for (int i = 0; i<cargoSize; i++){
        store.put(ship);
        } 
    }

    
}
