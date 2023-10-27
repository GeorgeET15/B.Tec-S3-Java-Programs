import java.io.*;
import java.util.*;

public class problem_9 {

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        String inputFileName = "input.txt"; 
        String outputFileName = "output.txt"; 

            FileReader reader = new FileReader(inputFileName);
            FileWriter writer = new FileWriter(outputFileName);

            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split("\\s+"); 

                for (String numberStr : numbers) {
                    int num = Integer.parseInt(numberStr);
                    if (isPrime(num)) {
                        writer.write(Integer.toString(num));
                        writer.write(" "); 
                    }
                }

                writer.write(System.lineSeparator());
            }

            reader.close();
            writer.close();

            System.out.println("Prime numbers copied to " + outputFileName);
        
    }
}
