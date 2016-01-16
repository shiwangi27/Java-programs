import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OptimizedInsertionSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int array[] = {1,2,4,5,6};
		boolean swapped = true;
		int n=array.length;
		int newn=0;
		int x;
		int elem = 3 ;
	    int j;
		    for(int i=0; i< n-1 ; i++)
		    {
		        x=array[i];
		        j=i-1;
		        while(j>=0 && array[j] > x)
		        {
		            array[j+1] = array[j];
		          	j=j-1;
		          	
		        } // creates a space for the new element
		        	
		        	array[j+1] = x;
		    }
	
		
		for(Integer i:array)
		{
		    System.out.println(i+ " ");
		}
	}
}
