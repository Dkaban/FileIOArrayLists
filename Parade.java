//***********************************************************
//  Parade.java
//
//  Dustin Kaban T00663749
//  COMP 1231 Module 4 Assignment 4 Question 1
//  July 29th, 2020
//
//  This class creates an arraylist of Clowns that then implements
//  functionality to add members to the list, remove them,
//  and display information back to the user about the lists status.
//***********************************************************

import java.util.ArrayList;

public class Parade
{
    //ArrayList varible for the list of clowns
    private ArrayList<Clown> clowns;

    //Constructor to instantiate a list
    public Parade()
    {
        this.clowns = new ArrayList<>();
    }

    //Gives the ability to add a clown to the list
    public void joinParade(String name)
    {
        clowns.add(new Clown(name));
    }

    //Gives the ability to remove a clown from the list
    public void leaveParade()
    {
        if(clowns.size() <= 0)
        {
            System.out.println("Since there are no clowns, none can leave.");
        }
        else
        {
            clowns.remove(0);
        }
    }

    //Displays the lists information back to the user.  List size and elements.
    public String toString()
    {
        String clownInformation = clowns.size() + " clown(s) are currently in the parade!";
        String clownNames = "";

        //If there are no clowns we want to display a different message
        if(clowns.size() > 0)
        {
            clownNames += "Currently in the Parade: ";
            //We want to loop through and add a comma for grammar purposes
            for(int i=0;i<clowns.size();i++)
            {
                //We don't want to add a comma to the last element displayed
                if(i<clowns.size()-1)
                {
                    clownNames += clowns.get(i).name + ", ";
                }
                else
                {
                    clownNames += clowns.get(i).name;
                }
            }
        }
        else
        {
            clownNames += "Sadly, no clowns are in the Parade.";
        }

        //return the size of the list and the elements inside back as a string
        return (clownInformation + "\n" + clownNames);
    }
}
