import java.awt.desktop.SystemSleepEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            Scanner filename = new Scanner(file);

            int countwords = 0;
            while (filename.hasNextLine()) {
                String line = filename.nextLine();
                countwords += line.split(" ").length;
            }

            System.out.println(countwords);

        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
        }
    }
}