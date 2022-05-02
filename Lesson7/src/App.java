import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        Calc.<String>divis("10", "0");
        Calc.<String>summ("10", "5");
        Calc.<String>mult("10", "2");
        Calc.<String>subtr("10", "7");
        ArrayList<String> test = new ArrayList<> ();
        test.add("123");
        test.add("asd");
        test.add("!!!");
        System.out.println(listing(test));
    }

    public static <T> ArrayList<T> listing(ArrayList<T> a) {
        ArrayList<T> out = new ArrayList<>();
        {for (int j = 0; j<100; j++) out.add(null);}       
        while (out.contains(null)){
            int num = new Random().nextInt(100);
            int rnd = new Random().nextInt(a.size());
            if (out.get(num)==null){
            out.set(num, a.get(rnd));}
        }
        return out;
    }
}
