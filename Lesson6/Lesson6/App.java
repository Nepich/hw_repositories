package Lesson6.Lesson6;

import java.util.ArrayList;
//import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
 //       Writer.writer();
        
/*        ArrayList <String> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);    
        for (int i=0; i<6; i++) {
            System.out.print("Введите имя: ");
            String name =in.next();
            System.out.print("Введите фамилию: ");
            String surName =in.next();
            System.out.print("Введите возраст: ");
            int age =in.nextInt();
            System.out.print("Введите номер телефона: ");
            int phoneNumber =in.nextInt();
            arr.add(i, new Person(name, surName, age, phoneNumber).toCSV(name, surName, age, phoneNumber));
        }
        in.close();*/
        ArrayList <Person> lstPers = CsvReader.readCsv();
        System.out.println(lstPers);
    }


}

