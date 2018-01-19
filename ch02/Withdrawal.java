public class Withdrawal
{
    public static void main(String[] args)
    {
        int withdrawal = 137;

        int a = 20;
        int b = 10;
        int c = 5;
        int d = 1;

        System.out.println("Ideal Withdrawal Amounts: ");

        System.out.println("Number of $20's : " + withdrawal / a );

        int numberOf20s = withdrawal / a;

        int remainder1 = 17;

        int numberOf10s = remainder1 / b;

        System.out.println("Number or $10's: " + numberOf10s);

        int remainder2 = 7;

        int numberOf5s = remainder2 / c ;

        System.out.println("Number of $5's: " + numberOf5s);

        int remainder3 = 2;

        int numberOf1s = remainder3 / 1;

        System.out.println("Number of $1's: " + numberOf1s);


    }
}
