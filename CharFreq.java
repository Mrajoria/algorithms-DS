
public class CharFreq {

public static void main(String args[]) {

charfreq("mississippi");
}

public static void charfreq(String test) {
	int frequencyArray[] = new int[26];
		
	for(int i=0;i<test.length();i++) {
		frequencyArray[test.charAt(i) - 'a']++;
	}

	
	for(int i=0;i<test.length();i++) {
		if(frequencyArray[test.charAt(i)-'a'] != 0) {
			System.out.println(test.charAt(i)+" : "+frequencyArray[test.charAt(i)-'a']);
			frequencyArray[test.charAt(i)-'a'] =0;
		}
		
	}
}
}
