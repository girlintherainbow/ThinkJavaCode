import java.util.Random;

public class FinishLineGame

{
    public static void main(String[] args)
    {
        System.out.println("Let's start!");
        play();
    }

    private static void play()
    {
        final int STARTING_PLACE = 1;


        final int LAST_PLACE = 10;


        int player1 = STARTING_PLACE;
        int player2 = STARTING_PLACE;

        while (player1 < LAST_PLACE && player2 < LAST_PLACE)
        {
            int nextSpot = player1+1;
            int player1Die1= die();
            int player1Die2 = die();
            int total1 = player1Die1+player1Die2;

            System.out.println("Player One: " + player1 + " Player Two: " + player2);

            if (player1Die1==nextSpot || player1Die2 == nextSpot || total1 == nextSpot)
            {
                System.out.println("Move on up!");
                player1++;
            }
            nextSpot = player2 +1;
            int player2Die1= die();
            int player2Die2 = die();
            int total2 = player2Die1+player2Die2;

            if (player2Die1==nextSpot || player2Die2 == nextSpot || total2 == nextSpot)
            {
                System.out.println("Move on up!");
            player2++;
            }
        }
        if (player1>=player2)
        {
            System.out.println("Player One Wins!");
        }
        else
        {
            System.out.println("Player Two Wins!");
        }

    }
    private static int die()
    {
        final int MAX_NUMBER = 6;

        Random random = new Random();
        int randomNumber = random.nextInt(MAX_NUMBER)+1;

        return randomNumber;
    }


}
