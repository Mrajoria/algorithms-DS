
public class PlaindromeIndex_Naive {
	
	public static int check (String s) {
		
	    for(int x=0;x<s.length()/2;x++) {
	    	if(s.charAt(x) !=s.charAt(s.length()-1-x)) {
	    		String sub = s.substring(x+1,s.length()-x);
	    		if (ispalindrome(sub)) {
	    			return x;
	    		}
	    		else
	    			return s.length()-1-x;
	    	}
	    	
	    }
	    return -1;
			
		   }
		
		static boolean ispalindrome(String s){
		       for(int x=0;x<s.length()/2;x++){
		           if(s.charAt(x) != s.charAt(s.length()-1-x)){
		               
		                return false; 
		           }
		           
		       }
		       return true;
		    }
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = check("hambbmahx");
		  System.out.println(result);
	}

}
