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

        printLargest(8, 20);
        printLargest(45, 45);
        printLargest(17, 55);
        printLargest(50, 11);


        printLargestOdd(15, 19);
        printLargestOdd(20, 24);
        printLargestOdd(7, 21);
        printLargestOdd(17, 17);



    }

    private static void printIsLarge(int number)
    {
        System.out.println("printIsLarge");
        System.out.println("Number is: " + number);


        if (number > 99)
        {
            System.out.println("The number is large");
        }


        System.out.println();
    }

    private static void printIsLargeOrSmall(int number)
    {
        System.out.println("numberIsLargeOrSmall");
        System.out.println("The number is: " + number);


        if (number > 99)
        {
            System.out.println("The number is large.");
        } else if (number < 10)
        {
            System.out.println("The Number is small");
        }
        System.out.println();

    }

    private static void printLargest(int number1, int number2)
    {
        System.out.println("printLargest");
        System.out.println("The numbers are " + number1 + " and " + number2);

        if (number1 > number2)
        {
            System.out.println("The largest number is: " + number1);
        } else if (number2 > number1)
        {
            System.out.println("The largest number is: " + number2);
        } else if (number1 == number2)
        {
            System.out.println("The numbers are equal.");
        }


        System.out.println();
    }

    private static void printLargestOdd(int number1, int number2)
    {
        System.out.println("printLargestOdd");
        System.out.println("The numbers are " + number1 + " and " + number2);

        boolean number1IsOdd = number1 % 2 == 1;
        boolean number1IsEven = number1 %2 ==0;
        boolean number2IsOdd = number2 % 2 == 1;
        boolean number2IsEven = number2 % 2 ==0;

        if ((number1IsOdd) && (number1 > number2))
        {
            System.out.println("The largest odd number is: " + number1);
        }
        else if ((number2IsOdd) && (number2 > number1))
        {
            System.out.println("The largest odd number is: " + number2);
        }
        else if (number1IsEven && number2IsEven)
        {
            System.out.println("Neither number is odd.");

        }
        else if ((number1IsOdd && number2IsOdd) && number1 == number2)
        {
            System.out.println("Two odds make an even " + (number1 + number2));
        }


        System.out.println();
    }

}


