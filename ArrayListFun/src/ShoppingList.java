import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList
{
    private int total = 0;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> shoppingCart = new ArrayList<>();

    public static void main(String[] args)
    {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.run();

    }

    private void run()
    {
        String command;

        do
        {
            System.out.println("Add Item, Remove Item, Print List, Clear Cart or Exit: ");
            command = scanner.nextLine();
            if (command.equalsIgnoreCase("Add"))
            {
                addTo();
            }
            else if (command.equalsIgnoreCase("Remove"))
            {
                removeFrom();
            }
            else if (command.equalsIgnoreCase("Print"))
            {
                printList();
            }
            else if (command.equalsIgnoreCase("Clear"))
            {
                clearCart();
            }
            else
            {
                System.out.println("Command not recognized. Please try again.");
            }
        }
        while (!command.equalsIgnoreCase("Exit"));
        System.out.println("Thank you for shopping! Have a nice day!");
    }

    private void printList()
    {
        for (int i = 0; i < shoppingCart.size(); i++)
        {
            System.out.println(i + " " + shoppingCart.get(i));
        }
        System.out.println();
    }

    private void clearCart()
    {
        shoppingCart.clear();
        System.out.println("Your cart is now empty");
    }

    private void addTo()
    {
        System.out.println("Enter position on list to add item: ");
        String spot = scanner.nextLine();

        System.out.println("Enter item to add to " + spot);
        String item = scanner.nextLine();

        shoppingCart.add(item);
        System.out.println(item + " added to spot " + spot + " in cart.");

    }

    private void removeFrom()
    {
        System.out.println("Enter position on list to remove item: ");
        String spot = scanner.nextLine();

        System.out.println("Enter item to remove " + spot);
        String item = scanner.nextLine();

        for (int i = 0; i < shoppingCart.size(); i++)
        {
            shoppingCart.remove(item);
            System.out.println(item + " removed from spot " + i + " in cart.");
        }
    }
}
