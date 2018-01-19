public class DateRevisted
{
    public static void main(String[] args)
    {
        String day = "Friday";
        int date = 19;
        String month = "January ";
        int year = 2018;

        printAmerica(day, month, date, year);

        printEuropean( day, date, month, year);




    }

    public static void printAmerica(String day, String month, int date, int year)
    {
        System.out.println("American Format: ");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(date);
        System.out.print(", ");
        System.out.println(year);

    }

    public static void printEuropean(String day, int date, String month, int year)
    {

        System.out.println("European Format: ");
        System.out.print(day);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(year);
    }
}
// take code from previous excercise and make a method that accepts parameters
