// Removes duplicate characters from a string

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RemoveDuplicate
{
    void removeDup(String str)
    {
        if (str == null)
        {
            return;
        }
        if(str.length < 2)
        {
            return str;
        }
        
       boolean[] ch = new boolean[256];
       String newstring ="";
       
       for(int i=0 ; i<str.length() ; i++)
       {
           int val = str.charAt(i);
           if(ch[val] == true)
           {
               continue;
           }
           else
           {
                ch[val] = true;
                newstring += Character.toString(str.charAt(i));
           }    
      }
      

      System.out.println(newstring);
        }       
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	  Codechef c= new Codechef();
	  String s = "Shiwangiisapagalladiki";
	  c.removeDup(s);
	
		
	}
}


