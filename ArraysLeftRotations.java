
public class ArraysLeftRotations {
	static int[] rotLeft(int[] a, int d) {
	      int temp =0;
	      for (int x=0;x<d;x++){
	          temp = a[0];
	          for(int y=1;y<a.length;y++){
	              a[y-1] = a[y];
	              
	          }
	          a[a.length-1] =temp;
	      }
	      return a;
	    }
	public static void main(String args[]) {
		
	}
}
