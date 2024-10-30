import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PoemWriter {
    public static void main(String[] args) {
        Poem poem1 = new Poem();
        poem1.setName("The Road Not Taken");
        poem1.setPoet("Robert Frost");

        Poem poem2 = new Poem();
        poem2.setName("Still I Rise");
        poem2.setPoet("Maya Angelou");

        Poem poem3 = new Poem();
        poem3.setName("Stopping by Woods on a Snowy Evening");
        poem3.setPoet("Robert Frost");

        try (PrintWriter writer = new PrintWriter("poems.txt")) {
            writer.println(poem1.getName());
            writer.println(poem1.getPoet());
            writer.println(poem2.getName());
            writer.println(poem2.getPoet());
            writer.println(poem3.getName());
            writer.println(poem3.getPoet());
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}