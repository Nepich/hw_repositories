package Suppliers;

import Products.Product;
import Products.Steel;
import Store.Store;


public class SteelSupplier implements Supplier, Runnable {

    Store store;
    public SteelSupplier(Store store){
        this.store=store;
    }

    @Override
    public void run() {
        for (int i=0; i<25; i++) {
            Product product = new Steel();
            store.load(product);
        }
        
    }
    
}
