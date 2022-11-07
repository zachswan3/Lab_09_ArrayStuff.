import java.util.Random;
import java.util.Scanner;

public class ArrayStuff1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner pipe = new Scanner(System.in);
        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
            System.out.print(dataPoints[i]);
            if (i < 99) {
                System.out.print(" | ");
            }
        }
        double sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }
        double average = sum / dataPoints.length; //avoid constants if possible
        System.out.println("\nThe sum of the array is " + sum);
        System.out.println("The average of the array is " + average);

        boolean found = false;
        int searchNumber = SafeInput.getRangedInt(pipe, "Enter a integer between 1-100", 1, 100);
        System.out.print("Searching for: " + searchNumber);
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchNumber) {
                System.out.printf("%n%d %d", searchNumber, i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("\nThe number " + searchNumber + " does not exist within the array.");
        }
    }
}
