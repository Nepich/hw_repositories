import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    public static void startMenu() {
        render();
//        ArrayList<HashMap<Integer,Product>> store = new ArrayList<>(); реализация через класс продукт
//        HashMap<Integer,Product> base = new HashMap<>();
        ArrayList<HashMap<Integer,String>> store = new ArrayList<>();
        for (int i = 0; i<3; i++) store.add(null);
        HashMap<Integer,String> names = new HashMap<>();
        HashMap<Integer,String> prices = new HashMap<>();
        HashMap<Integer,String> atStores = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int iter = 0; //этого нет в задаче, но интереснее было бы как ключ использовать артикул товара
        while (in.hasNext()){
//            HashMap<Integer,Product> base = new HashMap<>();
            int choise = in.nextInt();
            if (choise==1) {
                System.out.println("Введите название продукта: ");
                String name = in.next();
                names.put(iter, name);
                System.out.println("Введите стоимость: ");
//                int price = in.nextInt();
                String price = in.next();
                prices.put(iter, price);
                System.out.println("Введите количество на складе: ");
/*                int atStore = in.nextInt();
                Product p = new Product(name, price, atStore);*/
                String atStore = in.next();
                atStores.put(iter,atStore);
//                base.put(iter, p);
                iter++;
                store.set(0,names);
                store.set(1,prices);
                store.set(2,atStores);
                render();
            } else if (choise==2) {
//                for (HashMap<Integer,Product> i:store) {
                System.out.println("Порядковый номер | Наименование | Цена | Количество");
                for (Integer val:names.keySet()){
                    System.out.println((val+1) + " | " + names.get(val) + " | " + prices.get(val) + " | " + atStores.get(val));
                };
                render();
            } else if (choise==3) {
                System.out.println("Какой товар нужно изменить? (введите порядковый номер)");
                int number = in.nextInt();
                System.out.println("1. Хотите удалить товар" + "\n" + "2. Хотите изменить количество товара на складе?");
                int changeType = in.nextInt();
                if (changeType==1) {
                    System.out.println(names.get(number-1) + " удален!");
                    names.remove(number-1, names.get(number-1));
                    prices.remove(number-1, prices.get(number-1));
                    atStores.remove(number-1, atStores.get(number-1));
                    render();
                }
                else if (changeType==2){
                    System.out.println("Введите значение количества товара на складе");
                    String val = in.next();
                    atStores.replace(number-1, val);
                    render();
                }
                else {
                    System.out.println("Введeна неверная команда!");
                    render();
                }
            }
            else if (choise==4) {
                break;
            }else {
                System.out.println("Неверный выбор! Выберите из существующих пунктов меню");
                render();
            };
        }
//        store.add(base);
        in.close();
    }

    public static void render(){
        System.out.println("__МЕНЮ__" + "\n" + "1. Добавить товар" + "\n" + "2. Вывести все товары" + "\n" + "3. Внести изменения в базу" + "\n" + "4. Выход");
    }
}
