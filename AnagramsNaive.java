import java.util.ArrayList;

public class AnagramsNaive {
	static ArrayList<String> SubStringSet = new ArrayList<String>();

	public static void main(String[] args) {
		 String s = "dfcaabeaeeabfffcdbbfaffadcacdeeabcadabfdefcfcbbacadaeafcfceeedacbafdebbffcecdbfebdbfdbdecbfbadddbcec";
		 SubStringBuilder(s);	 
	     System.out.println(Anagramchecks());
		
	}
	static void SubStringBuilder(String s) {
		int Length =1;
		
		for(Length=1;Length<s.length();Length++) {
			for(int i=0;i+Length<=s.length();i++) {
				if(Length ==1) {
					String sub = Character.toString(s.charAt(i));
					SubStringSet.add(sub);
				}
				else {
					String sub = s.substring(i, i+Length);
					SubStringSet.add(sub);
				}
			}
		}
		
	}
	
	static int Anagramchecks() {
		int pairCount =0;
		for(int i=0;i<SubStringSet.size();i++) {
			int temp =i;
			if(i>=1) {
				int VisitedIndex = i;
				VisitedIndex--;
				SubStringSet.set(VisitedIndex,"");
			}
			System.out.println(" String picked "+SubStringSet.get(temp));
			for(int x =0; x<SubStringSet.size();x++) {
				if( x !=temp && SubStringSet.get(x)!="" && SubStringSet.get(temp).length() == SubStringSet.get(x).length()) {
					String compareAgainst = SubStringSet.get(x);
					if(isAnagram(SubStringSet.get(temp), compareAgainst) ==true) {
						pairCount++;
					}
				}
			}
		}
		return pairCount;
	}
	
	static boolean isAnagram(String s1, String s2) {
		boolean returnValue = false;
		int freqArray1[] = new int[26];
		int freqArray2[] = new int[26];
		
	for(int i=0;i<s1.length();i++) {
		freqArray1[s1.charAt(i)-'a']++;
		freqArray2[s2.charAt(i)-'a']++;
	}
	
	for(int x=0;x<26;x++) {
		if(freqArray1[x] -freqArray2[x] == 0) {
			if(x==25) {
				returnValue =!returnValue;
				return returnValue;
			}
		}
		else
			return returnValue;
		
	}	
		
		return returnValue;
	}
	
}
