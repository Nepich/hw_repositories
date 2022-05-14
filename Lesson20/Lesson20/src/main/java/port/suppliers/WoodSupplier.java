package port.suppliers;

import port.products.Product;
import port.products.Wood;
import port.store.Store;

public class WoodSupplier implements Supplier, Runnable {

    Store store;
    public WoodSupplier(Store store){
        this.store=store;
    }

    @Override
    public void run() {
        for (int i=0; i<25; i++) {
            Product product = new Wood();
            store.load(product);
        }
        
    }
    
}
