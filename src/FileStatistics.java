import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileStatistics {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("Book1.csv"))) {
            while (scanner.hasNext()) {
                numbers.add(Double.parseDouble(scanner.next()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        double sum = 0;
        double lowest = numbers.get(0);
        double highest = numbers.get(0);

        for (double num : numbers) {
            sum += num;
            if (num < lowest) lowest = num;
            if (num > highest) highest = num;
        }

        double average = sum / numbers.size();

        try (PrintWriter writer = new PrintWriter("stats.txt")) {
            writer.println("The sum of the numbers is: " + sum);
            writer.println("The lowest number is: " + lowest);
            writer.println("The highest number is: " + highest);
            writer.println("The average of the numbers is: " + average);
        } catch (FileNotFoundException e) {
            System.out.println("Error writing output file: " + e.getMessage());
        }
    }
}