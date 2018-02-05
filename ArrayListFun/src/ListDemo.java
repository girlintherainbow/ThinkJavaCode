import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class ListDemo
{
    public static void main(String[] args)
    {
        ListDemo listDemo = new ListDemo();
        listDemo.execute();

    }
   private void execute()
    {
        ArrayList<String> furniture = new ArrayList<>();
        furniture.add("bed");
        furniture.add("futon");
        furniture.add("bookshelf");
        printList(furniture);

        System.out.println();
        furniture.add("desk");
        printList(furniture);

        System.out.println();
        furniture.add(0,"chair");
        printList(furniture);

        System.out.println();
        furniture.add(3,"rug");
        printList(furniture);

        System.out.println();
        furniture.remove("desk");
        printList(furniture);

        System.out.println();
        furniture.remove(0);
        printList(furniture);

        System.out.println();
        furniture.remove(1);
        printList(furniture);



    }
 private static void printList(ArrayList<String> furniture)
    {
        for (int i = 0; i < furniture.size(); i++)
        {
            System.out.print(furniture.get(i) + ":");
        }

    }
}
