public class ValueMethods
{/*If any of the three lengths is greater than the sum of the other
        two, you cannot form a triangle.
         */
    public static void main(String[] args)
    {
        boolean yesDivide = isDivisible(6,3);
        System.out.println(yesDivide);

        if (yesDivide)
        {
            System.out.println("Divide those numbers!");
        }
        boolean noDivide = isDivisible(7,4);
        System.out.println(noDivide);


        boolean goodTriangle = isTriangle(3,3,3);
        System.out.println(goodTriangle);

        if (goodTriangle)
        {
            System.out.println("That's a nice triangle.");
        }

        boolean badTriangle = isTriangle(7,9,14);
        System.out.println(badTriangle);
    }
      public static boolean isDivisible(int n, int m)
        {
            if (n % m ==0)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    public static boolean isTriangle(int a, int b, int c)
    {
        if (a + b > c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}


