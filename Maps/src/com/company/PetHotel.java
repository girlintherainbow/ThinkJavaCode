package com.company;

import java.util.TreeMap;
import java.util.Scanner;

public class PetHotel
{
    Scanner scanner = new Scanner(System.in);
    private TreeMap<Integer, String> hotelRoom = new TreeMap<>();

    public static void main(String[] args)
    {
        PetHotel petHotel = new PetHotel();
        petHotel.run();
    }

    private void run()
    {
        String command;

        do
        {
            System.out.println("How can we help you today?");
            String inputLine = scanner.nextLine();
            String[] words = inputLine.split(" ");
            command = words[0];

            if (command.equalsIgnoreCase("CheckIn"))
            {
                String petName = words[1];
                int roomNumber = Integer.parseInt(words[2]);

                checkIn(petName, roomNumber);
            }
            else if (command.equalsIgnoreCase("CheckOut"))
            {
                String petName = words[1];
                int roomNumber = Integer.parseInt(words[2]);

                checkOut(petName, roomNumber);
            }
            else if (command.equalsIgnoreCase("Move"))
            {
                String petName = words[1];
                int fromRoomNumber = Integer.parseInt(words[2]);
                int toRoomNumber = Integer.parseInt(words[3]);
                move(petName, fromRoomNumber, toRoomNumber);
            }
            else if (command.equalsIgnoreCase("Occupancy"))
            {

            }
            else if (command.equalsIgnoreCase("CloseForSeason"))
            {
                closeForSeason();
            }
            else
                System.out.println("I'm sorry, I don't recognize that command.");
        }

        while (!command.equalsIgnoreCase("Exit"));
    }

    private void checkIn(String petName, Integer roomNumber)
    {

        if (roomNumber >= 100 && roomNumber <= 109)
        {

            if (isRoomEmpty(roomNumber))
            {
                hotelRoom.put(roomNumber, petName);
            }
            else
            {
                System.out.println("This room is occupied.");
            }
        }
        else
            System.out.println("Sorry that room is unavailable");

    }

    private boolean isRoomEmpty(int roomNumber)
    {
        boolean empty = true;

        if (hotelRoom.containsKey(roomNumber))
        {
            empty = false;
        }

        return empty;
    }

    private void checkOut(String petName, Integer roomNumber)
    {
        hotelRoom.remove(roomNumber, petName);
        if (roomNumber >= 100 && roomNumber <= 109)
        {
            System.out.println(petName + " checked out of " + roomNumber);

        }
        else
            System.out.println("No one was in that room.");

    }

    private void move(String petName, Integer fromRoomNumber, Integer toRoomNumber)
    {
        hotelRoom.remove(petName, fromRoomNumber);
        hotelRoom.put(toRoomNumber, petName);

        if (fromRoomNumber >= 100 && fromRoomNumber <= 109)
        {
            if (toRoomNumber >= 100 && toRoomNumber <= 109)
            {
                System.out.println(petName + " moved from " + fromRoomNumber + " to " + toRoomNumber);
            }

        }
    }

    private void occupancy()
    {


    }

    private void closeForSeason()
    {
        hotelRoom.clear();
        System.out.println("Thank you for staying with us! We are now closed.");

    }

}

