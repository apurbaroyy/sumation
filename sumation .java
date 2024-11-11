import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighestValueSum {

    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try {
           
            File inputFile = new File(inputFileName);
            Scanner scanner = new Scanner(inputFile);

                       double highestValue = Double.MIN_VALUE;
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    double value = scanner.nextDouble();
                    if (value > highestValue) {
                        highestValue = value;
                    }
                } else {
                                        scanner.next();
                }
            }

                       scanner.close();

                       PrintWriter writer = new PrintWriter(outputFileName);
            writer.println("The highest value is: " + highestValue);
            writer.close();

            System.out.println("The highest value (" + highestValue + ") has been written to " + outputFileName);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
