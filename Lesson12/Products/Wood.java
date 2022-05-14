package Products;

public class Wood implements Product {

    private String type;

    public Wood(){
        this.type="Wood";
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
