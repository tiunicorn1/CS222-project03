import java.io.File;
import java.util.Scanner;

public class Main
{

    public static double calculateSum(double[] array)
    {
        double sum = 0.0;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        return sum;

    }

    public static void main(String[] args)
    {
        double[] doubleArray;
        Scanner scannerIn;
        double inputNumber;
        int count;
        int index = 0;
        double sum = 0.0;
        double average = 0.0;

        try
        {
            scannerIn = new Scanner(new File("input.txt"));
            count = scannerIn.nextInt();
            doubleArray = new double[count];

            System.out.println(String.format("Count of numbers in the file: %d", count));


            while(scannerIn.hasNext())
            {
                inputNumber = scannerIn.nextDouble();
                doubleArray[index] = inputNumber;
                index++;

            }

            scannerIn.close();

            sum = calculateSum(doubleArray);
            System.out.println(String.format("Sum of numbers in the file: %.2f", sum));

            average = sum / count;
            System.out.println(String.format("Averge of numbers in the file: %.2f", average));


        }
        catch(Exception ex)
        {
            System.out.println( ex.getMessage() );
        }
    }
}
