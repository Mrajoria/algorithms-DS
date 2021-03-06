
public class ReducdStringNaive {
	

	public static void main(String[] args) {
		
		String show =superReducedString("kagoyzkgfjnyvjewazalxngpdcfahneqoqgiyjgpzobhaghmgzmnwcmeykqzgajlmuerhhsanpdtmrzibswswzjjbjqytgfewiuu");
		System.out.println(show+" "+show.isEmpty());
	}
	 static String superReducedString(String s) {
		 if(s.length()>=1 && s.length()<=100) {
			 System.err.println(s);
			 String sub1 = "";
		     String sub2  = "";
		        
		        if(s.length() ==1) {
		        	return s;
		        }
		        
		        else if(s.length() ==2) {
		        	if(s.charAt(0)!= s.charAt(1)) {
		        		return s;
		        	}
		        	else
		        		return "Empty String";
		        }
		        
		        else {
		        	for(int i=0;i<s.length()-1;i++) {
		        		int lookahead = i;
			        	lookahead++;
			        	
			        		if(s.charAt(i) !=s.charAt(lookahead)) {
			        			if(i==s.length()-2) {
			        				return s;
			        			}
			        		}
			        		
			        		else {
			        			if(i==0) {
			        				sub1 = s.substring(lookahead+1, s.length());
			        				break;
			        			}
			        			else if(i ==1) {
			        				sub1 = s.substring(0,i);
			        				sub2 = s.substring(lookahead+1, s.length());
			        				break;
			        			}
			        			else if(i==s.length()-3) {
			        				sub1 = s.substring(0,i);
			        				sub2 = s.substring(lookahead+1, s.length());
			        				break;
			        			}
			        			
			        			else if(i==s.length()-2) {
			        				sub1 = s.substring(0,i);
			        			}
			        			
			        			else {
			          				sub1 = s.substring(0,i);
			          				sub2 = s.substring(lookahead+1, s.length());
			          				break;
			          			}
			        		}
		        	  }
		        	return superReducedString(sub1+sub2);
		          }
		        
		     }
	     
	        return "Empty String";
	     }
	}

