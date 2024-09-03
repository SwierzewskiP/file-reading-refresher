import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException {

        // New and most popular way
        String path = "src/dataset_91033.txt";
        String line = "";
        int sum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((line = reader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
        } catch (IOException e) {
            System.out.println("File not found: " + path);
        }

        System.out.println(sum);


        // Old way
        File file = new File(path);
        int sumOld = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                sumOld += scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        }

        System.out.println(sumOld);
    }
}