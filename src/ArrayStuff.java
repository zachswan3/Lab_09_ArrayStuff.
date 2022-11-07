import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner pipe = new Scanner(System.in);
        int[] dataPoints = new int[100];

        for(int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = rnd.nextInt(100)+1;
            System.out.print(dataPoints[i]);
            if(i < 99){
                System.out.print(" | ");
            }
        }
        double sum = 0;
        for(int i = 0; i < dataPoints.length; i++){
            sum = sum + dataPoints[i];
        }
        double average = sum / dataPoints.length; //avoid constants if possible
        System.out.println("\nThe sum of the array is " + sum);
        System.out.println("The average of the array is " + average);

        boolean found = false;
        int searchNumber = SafeInput.getRangedInt(pipe,"Enter a integer between 1-100",1,100);
        System.out.print("Searching for: " + searchNumber);
        for(int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == searchNumber){
                System.out.printf("%n%d %d", searchNumber, i);
                found = true;
            }
        }
        if(!found){
            System.out.println("\nThe number " + searchNumber + " does not exist within the array.");
        }

        boolean found2 = false;
        int searchNumber2 = SafeInput.getRangedInt(pipe,"Enter a integer between 1-100",1,100);
        System.out.print("Searching for: " + searchNumber2);
        for(int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == searchNumber2){
                System.out.printf("%n%d exists at index value %d", searchNumber2, i);
                found2 = true;
                break;
            }
        }
        if(!found2){
            System.out.println("The number " + searchNumber2 + " does not exist within the array.");
        }

        int maxNumber = Integer.MIN_VALUE;
        int maxNumberIndex = 0;
        int minNumber = Integer.MAX_VALUE;
        int minNumberIndex = 0;
        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] > maxNumber){
                maxNumber = dataPoints[i];
                maxNumberIndex = i;
            }
            if(dataPoints[i] < minNumber){
                minNumber = dataPoints[i];
                minNumberIndex = i;
            }
        }
        System.out.println("\nThe max number in the loop is: " + maxNumber);
        System.out.println("The index of the max number is: " + maxNumberIndex);
        System.out.println("The min number in the loop is: " + minNumber);
        System.out.println("The index of the min number is: " + minNumberIndex);
        System.out.println("Average of the data points is: " + getAverage(dataPoints));
    }
    public static double getAverage(int[] values){
        double retVal = 0;
        for(int row = 0; row < values.length; row++){
            retVal = retVal + values[row];
        }
        retVal = retVal / values.length;
        return retVal;
    }
}
