//***********************************************************
//  Box.java
//
//  Dustin Kaban
//  July 31st, 2020
//
//  This generic class is used for creating a box.  The box contains
//  a list of the items that have been added to it.  It contains
//  methods for adding and drawing items.  The user can also check to see
//  if the box is empty or use toString to display the contents.
//***********************************************************

import java.util.ArrayList;
import java.util.Random;

public class Box<T>
{
    //Variables, Generic arraylist, random for drawing and a name for the box itself
    private ArrayList<T> itemList;
    Random random = new Random();
    String name;

    //Constructor
    public Box(String boxName)
    {
        //Initialize the arraylist
        itemList = new ArrayList<T>();
        name = boxName;
    }

    //We want to add an item to the arraylist
    public void add(T item)
    {
        itemList.add(item);
    }

    //If the list is empty, we want to return true
    public boolean isEmpty()
    {
        if(itemList.size() <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //This draws an item from the box.  If the list is size 1, we draw index 0
    public T drawItem()
    {
        int index = 0;
        if(itemList.size() > 1)
        {
            index = random.nextInt(itemList.size()-1);
        }

        //In case the list has no elements but we try to draw anyway
        try
        {
            T drawnItem = itemList.get(index);
            itemList.remove(index);
            return drawnItem;
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("ArrayList size is 0 so we cannot remove an item.");
            return null;
        }
    }

    //Overriding the toString method and outputting info based on the isEmpty method
    public String toString()
    {
        if(isEmpty())
        {
            return "The " + name + " box is empty";
        }
        else
        {
            return "The " + name + " box contains " + itemList.size() + " items.";
        }
    }
}
