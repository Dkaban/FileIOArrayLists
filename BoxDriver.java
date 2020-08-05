//***********************************************************
//  BoxDriver.java
//
//  Dustin Kaban T00663749
//  COMP 1231 Module 4 Assignment 4 Question 2
//  July 31st, 2020
//
//  This class tests the functionality of the Generic box class.
//  Displays information to the user.
//***********************************************************


public class BoxDriver
{
    public static void main(String[] args)
    {
        //Create the nameBox arraylist and populate it with Strings
        Box<String> nameBox = new Box<String>("Name");
        nameBox.add("Wilma Flintstone");
        nameBox.add("Ted Banana");
        nameBox.add("Suzanne Summers");
        nameBox.add("Tiger Trees");
        nameBox.add("Sally Mcdonald");
        System.out.println(nameBox.toString());

        //Create the seatNumberBox arraylist and popualte it with Integers
        Box<Integer> seatNumberBox = new Box<Integer>("Seat Number");
        seatNumberBox.add(1);
        seatNumberBox.add(2);
        seatNumberBox.add(3);
        seatNumberBox.add(4);
        seatNumberBox.add(5);
        System.out.println(seatNumberBox.toString());

        //Loop through both lists and display to the user a seat number and name
        while(!nameBox.isEmpty() && !seatNumberBox.isEmpty())
        {
            System.out.println("***********************");
            System.out.println(nameBox.drawItem() + " sits in chair "
                    + seatNumberBox.drawItem());
            System.out.println(nameBox.toString());
            System.out.println(seatNumberBox.toString());
        }
    }
}
