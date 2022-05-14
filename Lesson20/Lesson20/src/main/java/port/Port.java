package port;
import port.store.Store;

public class Port {

    Store store;
    private int craneNum;

    public Port(Store store, int num){
        this.store = store;
        this.craneNum = num;
    }
    
    public int getCraneNum(){
        return craneNum;
    }
}
