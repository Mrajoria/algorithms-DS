/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SubStringFreq
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  String s1 = " awintewinter win ter wins axwinxcter awintewinterwinter winter";
      String sC = "awinterisneverthereforwinnerButForwinter";
      String sD = "awbicndtefrwinter wintewinter winter winter wintew";
      String sE = " winter ";
      String s2 = "winter";
      
      String s11 = "bat is a good batting by batsmanbatcbatebatdbatrbat";
      String s22 = "bat";
      
      int answer = subStringFrequency(s11,s22);
      System.out.println(answer);
	}
	
	static int subStringFrequency(String test, String pattern){
	    int testLen = test.length();
	    int patternLen = pattern.length();
	    int count = 0;
	    for(int i=0;i<=testLen - patternLen;i++){
	        int j;
	        for(j=0;j<patternLen;j++){
	            if(test.charAt(i+j)!=pattern.charAt(j)){
	                break;
	            }
	        }
	            if(j==patternLen){
	                count++;
	                j=0;
	            }
	        }
	        return count; 
	    }
	   
	}

