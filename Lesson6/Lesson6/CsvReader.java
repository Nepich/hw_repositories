package Lesson6.Lesson6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvReader {

    static ArrayList <Person> arr = new ArrayList<>();

    public static ArrayList <Person> readCsv () throws IOException {
    System.out.println("Какой файл читаем: ");
    Scanner in = new Scanner(System.in);
    String path = "Lesson6/lesson6/" +in.next();
    in.close();
    File file = new File(path);
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String header = reader.readLine();// вот здесь проблема
    String s;
    for (int i=0; i<6; i++) {
        s = reader.readLine();
        if (s!=null) {
            String[] pers = s.split(";");
            String name = pers[0].replaceAll("\"","");
            String surName = pers[1].replaceAll("\"","");
            int age = Integer.parseInt(pers[2].replaceAll("\"",""));
            int phoneNumber = Integer.parseInt(pers[3].replaceAll("\"",""));
            arr.add(i, new Person(name, surName, age, phoneNumber));
        } else break;
    }
    reader.close();
    return arr;
}
}
