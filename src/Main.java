import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            Scanner filename = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
        }

        int countwords = 0;
        while(filename.hasNextLine()) {
            String line = filename.nextLine();
            countwords += line.split(" ").length;
        }

        System.out.println(countwords);
    }
}