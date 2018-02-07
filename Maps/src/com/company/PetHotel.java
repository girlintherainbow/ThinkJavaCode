package com.company;

import java.util.*;

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

                int roomNumber = Integer.parseInt(words[1]);

                checkOut(roomNumber);
            }
            else if (command.equalsIgnoreCase("Move"))
            {

                int fromRoomNumber = Integer.parseInt(words[1]);
                int toRoomNumber = Integer.parseInt(words[2]);
                move(fromRoomNumber, toRoomNumber);
            }
            else if (command.equalsIgnoreCase("Occupancy"))
            {
                occupancy();

            }
            else if (command.equalsIgnoreCase("CloseForSeason"))
            {
                closeForSeason();
            }
            else if (command.equalsIgnoreCase("Exit"))
            {
                System.out.println("Bye, bye!");
            }
            else
            {
                System.out.println("Command not recognized");

            }

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

    private void checkOut(int roomNumber)
    {
       String petName = hotelRoom.remove(roomNumber);
        System.out.println( petName + " has checked out");
    }

    private void move(int fromRoomNumber, int toRoomNumber)
    {
       if (isRoomEmpty(toRoomNumber))
       {
           String petName = hotelRoom.remove(fromRoomNumber);
           hotelRoom.put(toRoomNumber,petName);
           System.out.println(petName + " moved from room " + fromRoomNumber + " to room " + toRoomNumber);
       }
       else
       {
           System.out.println("This room is already occupied");
       }


    }

    private void occupancy()
    {
        Set<Map.Entry<Integer, String>> entries = hotelRoom.entrySet();

        for (Map.Entry<Integer, String> list : entries)
        {
            int roomNumber = list.getKey();
            String petName = list.getValue();

            System.out.println("Room: " + roomNumber + "   " + "Pet: " + petName);

        }

    }

    private void closeForSeason()
    {
        hotelRoom.clear();
        System.out.println("Thank you for staying with us! We are now closed.");

    }

}

