
public class N_LettersInInfinetlyRepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println(repeatedString("naman",17L));
	}

	public static long repeatedString(String s, long num)
	{

	    long count =0;
	    long repits = 0L;
	    long reminder =0L;
	 
	    
	   long num1 = s.length();
	    
	   long   num2 = num;
	    
	    repits = num2/num1;
	    
	    reminder = num2%num1;
	
	    if(s.length() ==1 && s.charAt(0)=='a') return num2;
	    else if (s.length() ==1 && s.charAt(0) != 'a') return 0;
	    
	    if(repits>=1){
	    
	   
	        for(int x=0;x<s.length();x++){
	        if(s.charAt(x) =='a'){
	             count++;
	        }
	        }
	      count = count* (repits);
	    
	    if(reminder >0){
	        for(int z=0;z<reminder;z++){
	             if(s.charAt(z) =='a'){
	               count++;
	            }
	        }
	    }
	    
	    }
	    
	    else if (repits ==0){
	        for(int x =0;x<num2;x++){
	            if(s.charAt(x) =='a'){
	                count++;
	            }
	        }
	    }
	    
	    return count;
	}
}
