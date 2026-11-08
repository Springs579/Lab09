import java.util.Random;
import java.util.Scanner;
public class Task01 {
    public static void main(String[] args){
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;
        System.out.println();
        System.out.println("The sum of dataPoints is: " + sum);
        System.out.println("The average of dataPoints is: " + average);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
        Scanner pipe = new Scanner(System.in);
        int searchValue = SafeInput.getRangedInt(pipe, "Enter a number to search for", 1, 100);
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == searchValue)
            {
                count++;
            }
        }
        System.out.println("The number " + searchValue + " was found " + count + " times.");
        int searchValue2 = SafeInput.getRangedInt(pipe, "Enter another number to search for", 1, 100);
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == searchValue2)
            {
                System.out.println("The value " + searchValue2 + " was found at array index " + i);
                found = true;
                break;
            }
        }
        if (!found)
        {
            System.out.println("The value " + searchValue2 + " was not found in the array.");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
    }
    public static double getAverage(int values[])
    {
        int sum = 0;

        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }

        return (double) sum / values.length;
    }
}
