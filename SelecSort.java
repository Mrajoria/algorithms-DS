/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SelecSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int array1[] = {15,4,3,2,1};
		int array2[] = {11,16,18,17,19};
		
		final int arrayLen = array1.length+array2.length;
		
		int testarray[] =  new int[arrayLen];
		for(int i=0;i<testarray.length;i++){
		    
		    if(i<array1.length){
		        testarray[i] =array1[i];
		    }
		    else
		    testarray[i] = array2[i-5];
		    
		}
		int answerArray[]  = new int[arrayLen];
		answerArray = selecSort(testarray);
		
		for(int j=0;j<answerArray.length;j++){
		    System.out.print("The sorted arry is ");
		    System.out.println(answerArray[j]);
		}
		
	}
	
	static int[] selecSort(int array[]){
	    for(int i=0;i<array.length;i++){
	        
	        for(int j=i+1;j<array.length;j++){
	            if(array[i] >array[j]){
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	               
	            }
	        }
	    }
	    return array;
	}
	
}
