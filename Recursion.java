
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Recursion {
    int n;
    int subSolution;
    int returnval;
      
  Recursion(){
      
  }
  
  static int factorial(int n, ArrayList<Recursion> obj){
	  if(n>0) {
	  int result =0;
      int i;
      for (i=n;i>=1 ;i-- ){
          
        push(i, obj);
     
      }
      
      if(i==0){
    	  obj.get(obj.size()-1).returnval =1;
          result = pop(obj);
      }
      
      return result;
	  }
	  else
		  return 1;
   }  
  
 static void  push(int i, ArrayList<Recursion> obj){
     
      Recursion c = new Recursion();
      c.n = i;
      obj.add(c);
             
  }
  
  static int pop(ArrayList<Recursion> obj){
	  Recursion tempstore = new Recursion();
       while(obj.size()>0) {
    	  tempstore = obj.get(obj.size()-1);
    	  
    	  obj.remove(obj.size()-1);    					// pop the stack
    	  
    	  if(obj.size()>=1) {
    	  obj.get(obj.size()-1).subSolution =  tempstore.returnval;
    	  obj.get(obj.size()-1).returnval =  obj.get(obj.size()-1).subSolution* obj.get(obj.size()-1).n;
    	  } 
       }
       return tempstore.returnval;
      
  }
  
  public static void main (String args[]){
      ArrayList<Recursion> obj = new ArrayList<Recursion>();
      int result =factorial(11, obj);
      System.out.println(result);
      
      for (int i=0;i<obj.size();i++ ){
         System.out.println(obj.get(i).n);
         System.out.println(obj.get(i).subSolution);
         System.out.println(obj.get(i).returnval);

      } 
      
      
      
  }
  
}

