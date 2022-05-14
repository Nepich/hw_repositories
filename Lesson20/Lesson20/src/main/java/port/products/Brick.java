package port.products;

public class Brick implements Product {

    private String type;

    public Brick(){
        this.type = "Brick";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString(){
        return type;
    }
}
