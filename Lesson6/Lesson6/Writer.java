package Lesson6.Lesson6;
import java.io.*;
import java.util.Scanner;

public class Writer {

    public static String lines="";
    public static String line="";
    public static void writer() throws FileNotFoundException {
        File file = new File("Lesson6//lesson6/new.txt");
        PrintWriter writer = new PrintWriter(file);
        Scanner in = new Scanner(System.in); 
        while (!in.hasNext("!q")) {
            line = in.nextLine();
            lines+=line;
            }
        in.close();
        writer.println(lines);
        writer.close();
        }
        
    }

