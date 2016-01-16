import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OptimizedBubbleSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int array[] = {1,2,8,4,5,6};
		boolean swapped = true;
		int n=array.length;
		int newn=0;
		while(swapped)
		{
		    swapped = false;
		    
		    for(int i=0; i< n-1 ; i++)
		    {
		        if(array[i]>array[i+1])
		        {
		            int temp = array[i];
		            array[i] = array[i+1];
		            array[i+1] = temp;
		          	 swapped = true;
		          	 newn = i;

		        }
		    }
		   n=n-1;
		}
		
		for(Integer i:array)
		{
		    System.out.println(i+ " ");
		}
	}
}
