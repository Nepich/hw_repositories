import java.util.Scanner;

public class Product {
    private String name;
    private int price;
    private int atStore;

    public Product (String name, int price, int atStore){
        this.name = name;
        this.price = price;
        this.atStore = atStore;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        Scanner in = new Scanner(System.in);
        String newName = in.nextLine();
        name = newName;
        in.close();
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(){
        Scanner in = new Scanner(System.in);
        int newPrice = in.nextInt();
        price = newPrice;
        in.close();
    }

    public int getAtStore(){
        return atStore;
    }

    public void setAtStore(){
        Scanner in = new Scanner(System.in);
        int newAtStore = in.nextInt();
        atStore = newAtStore;
        in.close();
    }

    @Override
    public String toString(){
        return "Товар: " + name + "; Цена: " + price + "; Кол-во на складе: " + atStore;
    }
}
