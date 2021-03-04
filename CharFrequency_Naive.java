
public class CharFrequency_Naive {
		char ch;
		int frequency;
		int topOfList =0;
		
		 public CharFrequency_Naive(){
		        char ch ='\0';
		        int frequency =0;
		    }
			public static void main (String[] args) throws java.lang.Exception
			{
			    CharFrequency_Naive list[] = new CharFrequency_Naive[26];
			    for(int i=0;i<list.length;i++){
			        list[i] = new CharFrequency_Naive();
			     
			    }
			    
			    CharFrequency_Naive obj = new CharFrequency_Naive();
			    
			    String test1 = "mississippi";
			    
			    String test2 = "geeks for geeks";
			    
			    String test3 = "giganticbillieillionis";
			    
			    String test4 = "googglleeefoogleeagle";
			    
			    
			    for(int i=0;i<test4.length();i++){
				    char chr = test4.charAt(i);
				    if(obj.exists(chr,list) == false){
				        obj.append(chr, list);
				    }
				 }
				
			       obj.ShowFrequency(list);    
			}
	    	
	    	

	public void append(char chr, CharFrequency_Naive list[]){
	    list[topOfList].ch = chr;
	    list[topOfList].frequency++;
	    topOfList++;
	    
	}

	public boolean exists(char ch, CharFrequency_Naive list[]){
	    boolean exists = false;
	    for(int i=0;i<list.length;i++){
	        if(ch == list[i].ch){
	            exists = true;
	            list[i].frequency++;
	            return exists;
	        }
	        
	    }
	    return exists;
	}

	public void ShowFrequency(CharFrequency_Naive list[]){
	    for(int i=0;i<list.length;i++){
	        if(list[i].ch != '\0'){
	           System.out.print("character "+list[i].ch+" frequency "+list[i].frequency);
	           System.out.println();
	        }
	    }
	}
	}

