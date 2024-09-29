import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();
        File selectedfile = null;
        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            selectedfile = chooser.getSelectedFile();

            ArrayList<String> words = new ArrayList<>();

            try (Scanner scanner = new Scanner(selectedfile)){
                while (scanner.hasNext()) {
                    words.add(scanner.next());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found" + selectedfile.getAbsolutePath());
            }

            Filter shortWordFilter = new ShortWordFilter();
            System.out.println("Short Word Filter (length < 5)");
            for (String word : words) {
                if (shortWordFilter.accept(word)) {
                    System.out.println(word);
                }

            }
        }
    }
}