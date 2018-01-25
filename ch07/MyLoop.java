import java.util.Scanner;

public class MyLoop
{
    public static void main(String[] args)
    {
        System.out.println("Exercise 7-A:");
        exercise7A(10);

        exercise7A1(1);

        exercise7A2(10);

        exercise7A3(10);

        System.out.println("Exercise 7-B:");
        exercise7B(100);

        exercise7B1(0);

        exercise7B2(100);

        exercise7B3(0);


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
}
