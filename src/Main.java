import java.io.File;
import java.util.Scanner;

public class Main
{

    public static double calculateSum(double[] array)
    {

    }

    public static void main(String[] args)
    {
        Scanner scannerIn;

        try
        {
            scannerIn = new Scanner(new File("input.txt"));

        }
        catch(Exception ex)
        {
            System.out.println( ex.getMessage() );
        }
    }
}
