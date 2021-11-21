public class insertSort {


		public static void main (String[] args) 
		{
			int unsorted[]  = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,};
			
			for(int key=1;key<unsorted.length;key++){
			    
			    int keyhold = unsorted[key];
			    int i = key-1;
			  
			     while(i>-1 && unsorted[i]>keyhold){
			         unsorted[i+1] = unsorted[i];
			         i = i-1;
			         unsorted[i+1] = keyhold;
			     }
			    
			}
			for (int count =0;count<unsorted.length ;count++ ) 
			System.out.println(unsorted[count]);
		}
	}



