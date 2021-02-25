/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DiamondPattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int count =0;
		for(int i=1;i<9;i++){
		    
		    if(i<5){
		    for(int j= 4-i;j>0;j--){
		        System.out.print(" ");
		    }
		    for(int temp =0;temp<i;temp++){
		        count++;
		        System.out.print("* ");
		    }
		    System.out.println();
		    }
		    
		    if(i==5){
		        i++;
		    }
		    
		    if(i>=6){
		        for(int x=0;x<i-5;x++){
		            System.out.print(" ");
		            
		        }
		        for(int temp =0;temp<8-(i-1);temp++){
		            System.out.print("* ");
		        }
		        System.out.println();
		    
		    }
		    
		    
		}
	}
}
