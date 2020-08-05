//***********************************************************
//  ParadeManager.java
//
//  Dustin Kaban
//  July 29th, 2020
//
//  This class creates an instance of Parade and populates the ArrayList
//  clowns inside the parade class.  It then displays the information to the
//  user and tests functionality of the parades getters and setters.
//***********************************************************

public class ParadeManager
{
    public static void main(String[] args)
    {
        //Create an instance of the Parade
        Parade parade = new Parade();

        //Display to the user that the parade has begun, current values
        System.out.println("The Parade is just getting started.");
        System.out.println("***********************");
        System.out.println(parade.toString());
        System.out.println("***********************");

        //Add members to the parade
        parade.joinParade("Dustin Kaban");
        parade.joinParade("Darryl Strawberry");
        parade.joinParade("Edward ScissorHands");
        parade.joinParade("Captain Crunch");

        System.out.println(parade.toString());
        System.out.println("***********************");

        //Remove members from the parade
        parade.leaveParade();
        parade.leaveParade();

        //Display status of the parade to the user
        System.out.println(parade.toString());
        System.out.println("***********************");

        //Adding 2 more members to the parade
        parade.joinParade("John Jacob");
        parade.joinParade("Jingleheimer Schmidt");
        System.out.println(parade.toString());

        //Displaying the final output to the user
        System.out.println("***********************");
        System.out.println("The Parade has ended.");
    }
}
