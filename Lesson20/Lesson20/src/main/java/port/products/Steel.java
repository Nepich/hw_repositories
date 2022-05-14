package port.products;

public class Steel implements Product {

    private String type;

    public Steel(){
        this.type = "Steel";
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
