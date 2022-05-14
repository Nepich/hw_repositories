package port.ship;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import port.products.Product;

public class Ship {
    
    private String[] types = new String[]{"Wood", "Steel", "Brick"};
    private String shipType;
    private List<Product> cargo = new ArrayList<>();

    public Ship(){
        for (int i =0; i < 1 + new Random().nextInt(10); i++) cargo.add(null);
        this.shipType = types[new Random().nextInt(types.length)];
    }

    public String getType(){
        return shipType;
    }

    public List<Product> getCargo(){
        return cargo;
    }

}
