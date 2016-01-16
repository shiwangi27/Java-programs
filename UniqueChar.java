/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class UniqueChar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		HashMap<Integer, String> maps = new HashMap<>();
		
		String test = "Google is the best work place in the world";
		
		char[] c = test.toCharArray();
		TreeSet<Character> uniquechar = new TreeSet<>();
		
		for(char i : c)
		{
		    uniquechar.add(i);
		}
		
	    for(int i=0; i < uniquechar.size(); i++)
	    {
	        int count=0;
	        for(char dupchar : c)
	        {
	            if(uniquechar == dupchar)
	                count++;
	        }
	        if(count>1)
	        {
	            System.out.println("Not Unique");
	        }
	    }
		
		maps.put(1,"the");
		maps.put(2,"interview");
		maps.put(3,"with");
		maps.put(4,"Google");
		
		
		if(maps.containsValue(test))
		{
		    System.out.println(test + " Found!");
		}
		
        for(Integer i : maps.keySet())
        {
            maps.get(i);   
        }
		
		
		
	}
}
