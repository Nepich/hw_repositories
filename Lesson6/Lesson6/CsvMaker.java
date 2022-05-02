package Lesson6.Lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CsvMaker {
    
    protected static String lines = "\"Имя\";\"Фамилия\";\"Возраст\";\"Телефон\"\n";

    public static void makeCsv(ArrayList<String> arr) throws FileNotFoundException{
        File file = new File("Lesson6/lesson6/new.csv");
        PrintWriter writer = new PrintWriter(file);
        for (String i:arr){
            lines+=i+"\n";
        }
        writer.println(lines);
        writer.close();
    }
}
