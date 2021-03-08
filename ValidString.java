

import java.util.ArrayList;
import java.util.List;

public class ValidString {
    static ArrayList<Integer> freq = new ArrayList<Integer>();
    static ArrayList<Integer> charset = new ArrayList<Integer>();  
 
    // Complete the isValid function below.
    static String isValid(String s) {
        
    
     int freq[] = new int[26];
     
     List<Integer> list = new ArrayList<Integer>();
     
     for(int i=0;i<s.length();i++){
         freq[s.charAt(i) - 'a']++;
     }
     
     for(int i=0;i<freq.length;i++){
         if(freq[i] !=0){
             list.add(freq[i]);
         }
     }
     
     Integer array[]= new Integer[list.size()];
     array = list.toArray(array);
      setBuilder(array);
      return showFreqAndCharSet();
       
    }
    static void setBuilder(Integer[] array) {
        int indexPtr =0;
            
        for(int i=0;i<array.length;i++){
            if(freq.contains(array[i]) == false) {
                freq.add(indexPtr,array[i]);
                charset.add(indexPtr,1);
                indexPtr++;
            }
            else {
                int index = freq.indexOf(array[i]);
                int val = charset.get(index);
                val++;
                charset.set(index, val);
            }
        }
    }
    static String showFreqAndCharSet() {
       for(int i=0;i<freq.size();i++) {
           System.out.println("Freq : "+freq.get(i)+" charSet : "+charset.get(i));
       }
      
       if(freq.size() ==0){
           return "NO";
       }
       else if(freq.size() ==1) {
           return "YES";
       }
       else if(freq.size() ==2) {
           if(freq.contains(1)) {
               int indexPtr = freq.indexOf(1);
               if(charset.get(indexPtr) ==1) {
                   return "YES";
               }
               else
                   return "NO";
           }
           else {
               int i=0;
               if(freq.get(i) - freq.get(i+1) ==1 | freq.get(i) - freq.get(i+1) ==-1 ){
                   if(charset.get(i) ==1 && charset.get(i+1) ==1) {
                       return "YES";
                   }
                   else if(charset.contains(1)) {
                       return "YES";
                   }
                   return "NO";
               }
               else return "NO";
           }
           
       }
       
       else return "NO";
       
    }

public static void main(String[] args) {
		String s1 ="aaa";
		String s2 = "aabbccdd";
		String s3 = "aaaaad";
		String s4 = "aaabbbcccdddx";
		String s5 = "aaabbbcdef";
	    String s6 = "aabbccxxx";
		System.out.println(isValid(s5));
	}

}