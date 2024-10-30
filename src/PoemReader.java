import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PoemReader {
    public static void main(String[] args) {
        ArrayList<Poem> poems = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("poem2.txt"))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                String poet = scanner.nextLine();

                Poem poem = new Poem();
                poem.setName(name);
                poem.setPoet(poet);
                poems.add(poem);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        for (Poem poem : poems) {
            System.out.println(poem.toString());
        }
    }
}