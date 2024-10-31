/**Class: FileStatistics
 * @author Mohammed Islam
 * @version 1.0
 * Course: ITEC 2150 Fall 2024
 * Written: October 29th, 2024
 *
 * This class reads numbers from a CSV file, calculates the sum, lowest,
 * highest, and average, and writes them to a text file.
 */


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileStatistics {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("src/Book1.csv"))) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",");
                for (String strNum : line) {
                    numbers.add(Double.parseDouble(strNum));
                }
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

        try (PrintWriter writer = new PrintWriter("src/stats.txt")) {
            writer.println("The sum of the numbers is: " + sum);
            writer.println("The lowest number is: " + lowest);
            writer.println("The highest number is: " + highest);
            writer.println("The average of the numbers is: " + average);
        } catch (FileNotFoundException e) {
            System.out.println("Error writing output file: " + e.getMessage());
        }
    }
}