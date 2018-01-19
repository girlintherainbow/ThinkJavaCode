import java.util.Scanner;

public class ConvertTemp
{
    public static void main(String[] args)
    {
        double celsius;

        int farenheit;


        final double DEGREES_IN_CELCIUS = 0;
        final int DEGREES_IN_FARENHEIT = 0;
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Exactly how many degrees celcius? ");
        celsius = in.nextDouble();

        farenheit = (int) (celsius/DEGREES_IN_CELCIUS);

        System.out.println((celsius * 9/5) + 32);

    }
}