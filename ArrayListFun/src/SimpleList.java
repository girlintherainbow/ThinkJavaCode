import java.util.ArrayList;
public class SimpleList
{
    public static void main(String[] args)
    {
      SimpleList simpleList = new SimpleList();
      simpleList.demo();

    }
    public void demo()
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Magenta");
        colors.add("Periwinkle");
        colors.add("Mustard");
        colors.add("Plum");


            for (int i = 0; i < colors.size(); i++)
            {
                System.out.println(colors.get(i));
            }
            System.out.println("");
            for (String name:colors)
            {
                System.out.println(name);
            }
    }
}
