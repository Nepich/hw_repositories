package Suppliers;

import Products.Brick;
import Products.Product;
import Store.Store;

public class BrickSupplier implements Supplier, Runnable {

    Store store;
    public BrickSupplier(Store store){
        this.store=store;
    }

    @Override
    public void run() {
        for (int i=0; i<25; i++) {
            Product product = new Brick();
            store.load(product);
        }
        
    }
    
}
