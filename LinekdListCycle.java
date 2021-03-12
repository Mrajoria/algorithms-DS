
public class LinekdListCycle {
	
		public static void main (String args[]) {
			
	      class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data = data;
		
			}
			
			void add(int data){
				this.next = new Node(data);
			}
			
			void cycle() {
				System.out.println("*******ADDING CYCLE*********");
				Node reference = this;
				while(reference !=null) {
			
					reference = reference.next;
					if(reference.next == null) {
						reference.next = this;
						break;
						
					}	
				}
			
			}
			
			 boolean hasCycle() {
				 
				   Node n1 = this;
				   Node n2 = this.next.next;
				   System.out.println("detecting cycle---------------------");
				   boolean switch1 = true;
				   while(switch1 == true){
					   try {
						 if(n1 == n2){
							 System.out.println(n1.data+" "+n2.data);
				           switch1 = false;
				       }  
					   
				       
				       else {
				    	   n1 = n1.next;
				       n2 = n2.next.next;
				       System.out.println();
				       }
				       
		
					   }
				    	  catch(NullPointerException e) {
				    		  System.out.println("N.E");
				    		 return false;
				    	 }
				       
				   }
				        return !switch1;
				    }
		
		}	
	      
	      Node n = new Node(70);
	      n.add(50);
		  n.next.add(40);
		  n.next.next.add(10);
		  n.next.next.next.add(50);
		  
	  
		  Node example =n;
		  while(example!=null) {
			  System.out.println(example.data);
			  example = example.next;
			
		  }
		  
		  n.cycle();
		
		  System.out.println(n.hasCycle());
			  
		}
	}

