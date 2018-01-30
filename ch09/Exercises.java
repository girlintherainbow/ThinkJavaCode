public class Exercises
{
    public static void main(String[] args)
    {
        System.out.println("");
        System.out.println("Exercise 9-A");
        printFirstCharacter("Hello");
        printFirstCharacter("Goodbye");

        System.out.println("");
        System.out.println("Exercise 9-B");
        printLastCharacter(" Hello");
        printLastCharacter(" Goodbye");

        System.out.println("");
        System.out.println("Exercise 9-C");
        printCharacter("Hello");

        System.out.println("");
        System.out.println("Exercise 9-D");
        allButFirstThree("Hello");
        allButFirstThree("Goodbye");


        System.out.println("");
        System.out.println("Exercise 9-E");
        printFirstThree("Hello");
        printFirstThree("Goodbye");

        System.out.println("");
        System.out.println("Exercise 9-F");
        printPhoneNumber("501-555-0100");

        System.out.println("");
        System.out.println("Exercise 9-G");
        findFirstE("Hello");
        findFirstE("Goodbye");



    }

    private static void printFirstCharacter(String text)
    {
        System.out.println("Print the first character in " + text);
        System.out.println(text.charAt(0));
    }

    private static void printLastCharacter(String text)
    {
        System.out.println("Print the last character in" + text);
        System.out.println(text.charAt(text.length() - 1));
    }

    private static void printCharacter(String text)
    {
        System.out.println("Print characters and location: ");
        for (int i = 0; i < text.length(); i++)
        {
            char letter = text.charAt(i);
            int num = i;
            System.out.println(letter + "" + (num));
        }
    }

    private static void allButFirstThree(String text)
    {
        System.out.println(text.substring(3,text.length()));
    }
    private static void printFirstThree(String text)
    {
        System.out.println(text.substring(0,3));
    }
    private static void printPhoneNumber(String text)
    {
        System.out.println("Area Code: " +"" + text.substring(0,3));
        System.out.println("Exchange: " +"" + text.substring(4,7));
        System.out.println("Line Number: " +"" + text.substring(8,12));
    }
    private static void findFirstE(String text)
    {
        System.out.println("First Instance of E: ");
        int index = text.indexOf('e');
        System.out.println(index);
    }

}
