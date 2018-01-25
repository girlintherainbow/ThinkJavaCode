import java.util.Scanner;

public class MyLoop
{
    public static void main(String[] args)
    {
        System.out.println("Exercise 7-A:");
        exercise7A(10);

        exercise7A1(1);

        System.out.println("For Loop: ");

        exercise7A2(10);

        exercise7A3(10);

        System.out.println("Exercise 7-B:");
        exercise7B(100);

        exercise7B1(0);

        System.out.println("For Loop: ");

        exercise7B2(100);

        exercise7B3(0);

        System.out.println("Exercise 7-C:");

        exercise7C(100);

        exercise7C1(100);

        System.out.println("For Loop: ");

        exercise7C2(100);

        System.out.println("Exercise 7-D: ");
        exercise7D(42);

        System.out.println("Exercise 7-E: ");
        exercise7E(0);


    }

    public static void exercise7A(int n)
    {
        while (n >= 1)
        {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println();
    }

    public static void exercise7A1(int n)
    {

        while (n <= 10)
        {
            System.out.println(n);
            n = n + 1;
        }
        System.out.println();
    }

    public static void exercise7A2(int n)
    {

        for (n = 10; n >= 1; n--)
        {
            System.out.println(n);
        }
        System.out.println();
    }

    public static void exercise7A3(int n)
    {

        for (n = 1; n <= 10; n++)
        {
            System.out.println(n);
        }
        System.out.println();
    }


    public static void exercise7B(int n)
    {
        while (n >= 0)
        {
            System.out.println(n);
            n = n - 10;
        }
        System.out.println();
    }

    public static void exercise7B1(int n)
    {
        while (n <= 100)
        {
            System.out.println(n);
            n = n + 10;
        }
        System.out.println();
    }

    public static void exercise7B2(int n)
    {
        for (n = 0; n <= 100; n = n+ 10)
        {
            System.out.println(n);
        }
        System.out.println();
    }
    public static void exercise7B3(int n)
    {
        for (n = 100; n >= 0; n = n - 10)
        {
            System.out.println(n);
        }
        System.out.println();
    }
    public static void exercise7C(int n)
    {
        while (n >= -100)
        {
            System.out.println(n);
            n = n - 8;
        }
        System.out.println();
    }
    public static void exercise7C1(int n)
    {
        while (n >= 100)
        {
            System.out.println(n);
            n = n - 8;
        }
        System.out.println();
    }

    public static void exercise7C2(int n)
    {
        for (n = 100; n >= -100; n = n - 8)
        {
            System.out.println(n);
        }
        System.out.println();
    }
    public static void exercise7D(int n)
    {
        while (n >=1)
        {
            System.out.println(n);
            n = n - 1;
        }

    }
    public static void exercise7E(int n)
    {
        Scanner in = new Scanner(System.in);
        int number;
        do
        {
            System.out.println("Enter a number between 0 and 5 : ");
            number = in.nextInt();
            if (number >= 1 && number <= 5);
            {
                System.out.println("Nope");
            }

        }
        while (number != 0);

            System.out.println("Good Job!");

    }

}
