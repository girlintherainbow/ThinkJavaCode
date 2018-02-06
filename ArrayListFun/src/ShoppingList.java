import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ShoppingList
{
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
            System.out.println("Add Item, Remove Item, Print List, Find Item, Clear Cart or Exit: ");
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
                Collections.sort(shoppingCart);
                printList();
            }
            else if (command.equalsIgnoreCase("Clear"))
            {
                clearCart();
            }
            else if (command.equalsIgnoreCase("Find"))
            {
                findItem();
            }
            else if (command.equalsIgnoreCase("Exit"))
            {
                System.out.println("Here is your receipt: ");
                printList();
            }
            else
            {
                System.out.println("Command not recognized. Please try again.");
            }
        }
        while (!command.equalsIgnoreCase("Exit"));
        System.out.println("Thank you for shopping! Have a nice day!");
    }

    private void findItem()
    {
        System.out.println("What are you looking for?");

        String selectItem = scanner.nextLine();

        if (shoppingCart.contains(selectItem))
        {
            System.out.println("Found it!");
        }
        else
            System.out.println("Item not found");

    }

    private void printList()
    {
        if (shoppingCart.size()==0)
        {
            System.out.println("Your cart is empty");
        }
        else
        {
            for (int i = 0; i < shoppingCart.size(); i++)
            {
                Collections.sort(shoppingCart);
                System.out.println(i + " : " + shoppingCart.get(i));
            }
        }
    }

    private void clearCart()
    {
        shoppingCart.clear();
        System.out.println("Your cart is now empty");
    }

    private void addTo()
    {
        System.out.println("Add to cart: ");
        String item = scanner.nextLine();
        shoppingCart.add(item);
        System.out.println(item + " added to cart.");

    }

    private void removeFrom()
    {
        System.out.println("Enter number of item to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.println(shoppingCart.get(index)+ " removed from cart.");
        shoppingCart.remove(index);

    }
}
