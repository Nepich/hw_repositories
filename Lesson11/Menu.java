import java.util.Scanner;
import java.lang.Math;

public class Menu extends Thread{
    

    public void run() {
        render();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int choice = in.nextInt();
            if (choice==1){
                System.out.print("Введите число которое нужно возвести в степень: ");
                int num = in.nextInt();
                System.out.print("Введите степень в которую нужно возвести число: ");
                int degree = in.nextInt();
                Thread solv = new Thread( () -> {
                    try {
                        sleep(50000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } 
                System.out.println("Результат возведения " + num + " в степень " + degree + " = " + (int)Math.pow(num, degree));
                });
                solv.start();
                render();
            } else if (choice!=0) {
                System.out.println("Неверная команда");
                render();
            }
            else break;
            }
            in.close();
        }


    public static void render(){
        System.out.println("___Меню___" + "\n" + "1. Возвести в степень" + "\n" + "0. Выход");
        } 

}