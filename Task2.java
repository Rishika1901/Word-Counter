package Internship;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("D:\\java\\Internship\\Task2File.txt");
        BufferedReader reader = new BufferedReader(new FileReader("D:\\java\\Internship\\Task2File.txt"));
        String user = reader.readLine();

        int count = 0;
        String[] str = user.split(" ");
        for (int i = 0; i <= str.length - 1; i++) {
            count++;
        }
        System.out.println("Total no. of words in your file is " + count);
    }

}
