public class LogicMethods
{
    public static void main(String[] args)
    {
        System.out.println("Start of Program ");
        printIsLarge(1);
        printIsLarge(99);
        printIsLarge(100);
        printIsLarge(200);

        printIsLargeOrSmall(7);
        printIsLargeOrSmall(12);
        printIsLargeOrSmall(75);
        printIsLargeOrSmall(100);

        printLargest(8,20);
        printLargest(45,45);
        printLargest(17,55);
        printLargest(50,11);






    }

    private static void printIsLarge(int number)
    {
        System.out.println( "printIsLarge");
        System.out.println("Number is: " + number);


        if (number > 99)
        {
            System.out.println("The number is large");
        }


        System.out.println();
    }

    private static void printIsLargeOrSmall (int number)
    {
        System.out.println("numberIsLargeOrSmall");
        System.out.println("The number is: " + number);


        if (number > 99)
        {
            System.out.println("The number is large.");
        }

        else if (number < 10)
        {
            System.out.println("The Number is small");
        }
        System.out.println();

    }

    private static void printLargest(int number1, int number2)
    {
        System.out.println("printLargest");
        System.out.println("The numbers are " + number1 + " and " + number2);

        if (number1>number2)
        {
            System.out.println("The largest number is: " + number1);
        }
        else if (number2>number1)
        {
            System.out.println("The largest number is: " + number2);
        }
        else if (number1 == number2)
        {
            System.out.println("The numbers are equal.");
        }


        System.out.println();
    }

    }

