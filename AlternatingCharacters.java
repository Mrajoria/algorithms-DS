
public class AlternatingCharacters {
	
	
	 static int alternatingCharacters (String s) {
			int count =0;
			int i;
			for( i=0;i<s.length();i++) {
			  if(i+1 <s.length()) {
				  if(s.charAt(i) ==s.charAt(i+1)) {
					  count++;
					  
				  }
			  }
			}
				return count;
	}
	 

	public static void main(String[] args) {
		String s = "AAAABABABBAABBABABAABBAAABBAABAABBABBBBAAABABBBBABBAABAAABBAABABAAABAAAAABABABAAABAAAABABABBBBBAABBABBABABAAAABBBBBBAAABABBAAAAABBABBBABABAABBBBABAABAAABBAABAAABBBAAAAABAAABABBBAAAAAAABAAAAAAABAABAABBAABBABBBBBBBBABAABABAABBABBAAABAABAAABBBABABBABBBBABBBBABAABAABBBBBBABAAAABBAAAABBBBAABBABABBAAABBBAABAAAABAAAAABABBAABBBBABBABBBBBAABAABABAABABBBAABBBABBBABBBAAAAAABBBBABBBBABAABBAAABBBBAABAABBBBAABBAAABAAAAABAABABABBAAABABABBABABBABBABBBBBBAABBBAABAAABAAABAABBBBAAABABBBABBBAABBAABABBBBABBBBBBBBBBBAAAABABBAAAAAABBBABABABABAABBBABBBBABABBBAABABBBBABAABBABBBBABABAABBAABBABBAAAABABBAAAAABBBBBBABBBBAAABABABBABAAABBBABBBBABABBBBBABBAABBBAABBAAAABBAAABBAABBABABBBAAABBBAAABAABABAAAAABAABAAAABBABBABBBBBBABAAABAABBABBBABBAABBAABABABABABAABAABBBABAAAABAABBABBBBBBABABAABBBBBABBBBBAABAAABAAABBBAABABBBABAAAABBBABBAABBAABABBAABABABBBBABBABABABAABABABAABBBBBABBAAABAAABABABABAAAABBBBBBAAAAAABBABAABBABAAAABAABBAAABBBABAAAABBAABBBABABBABABABAAAABBABBABBAAAAABBBAABBBAABBABBABBAABBBBBABBAAAABBAABBBBBBAAABABAABAABBBBBAABAAAAAABBAAABAABBBABBBBBABAAABABBABBAAABAABBAAABBABABAAABAABBAABAAAAABBABABAABBBBAAABAAAAAAAAABAABAAABAAABAAABABAAABAABABBABABAABABBABBABBABBABBABAABBBABBABBABAAABAABABABABBBAAAAAAABABBAAAABABABBAAABBBBAABBABBBBBAAABAABBABAABBABBBAAABBBABBBAABBABABAAAABAAABAABBABBBABBAABAAABBBAABAABBABABBAAAAAAAABBABABBAAAAAABAABAAAAAAAAAAAAABBABAAAABBABBBAABBAAAAAAAAAABBBAABBBBABABBBAAAAABAABAABAAABBBABBBBAABBBABAABABBABBBABBAABBBABBBAAABBBABAABABABBABAAABAAAAAABBAABABABBBABAAABBBBAABBBBBABBABAABBAABABAAABABABABAAABABAABAAAABBABBBBAABABBBBBAABAAAABAAAABABABBBAABAAABBAAABAAABAABAAAABBBABABABBBBAAABABABBABABBABBABABAAABBAABABBAAAABABABABABBBABABABBAABAAAABBABBAAABBBBABABABAAAABBABAABABBBBABABBBAABABBBBABBABBABAABABABAABBAAABAAAABABAAAABBBBABBABAAABAAAAABABBABBABBBBBABABBAABBBAAAAAABABBBBBBAAABBBBBABAABABBBBBBABABBBABABAABAAABBBAABAAABBBBABBBBAAAABBBBBBBBBBABBBABBAAAABABABAABAABBAABBAAABBBAAABBABBABBBBABABAAABABABBBAAABAABBBAAAABBABBBBABBBBAABBBABBABBAAABAABBAABBBAAAABBBBBABABABBBAAAABAABBABABBBBBBBAAABABBBAABBABBAAAABBBBAAABABABBABAABBABBBABAABAABABABBBBABAAABABBBAABBBAAAAABAAAABBBBAABBAABBAAABBAAABAABAAABABBAABBABABAAABBAAABABAABABABABBBABBBABBBABBAAAAABABAABBAABBAABBBAAABBBABABBBAABBAABABAAAAAAABABBAAAABABAABBABABBBABAABAABBBABAABAABABBABABBBBAAAABBAABBAAAABAABBBABABBBBAAABAAAABBAAABABBAAABBBAAAABBBBBBBABAABBBBBABBBAABABBBBBBBAAABBBBAABABAAAAABBBABAAABABABABAAABBBBBAAABABBAAABAABBABBABAAAABBAAABABBAABBBBABAABABABAAABABBBABAABABAABAAABAAAABAABBABBBAABBAABBBBAAAAAAABAABAABABABBAABABABAAABBABBABBBBBBAABAABABAAABBBBABBABBAAABAAABBBBBBBAAABAABBBBABAABBBAABBABBBBAAABAABAABABAAABBBBBAABABAABBBABAABABAABAAAAABBAAABAAABAABBBBBABBBBAABBABAAABAABABBBBABBAAABBAAAABBAAAABAABBABABAAABABAABABABBABABBAABAABBAABABBABBBABBBABBBABABBBBBABBBBBBAAABABABBABAAABBABBBAABBAAABBABBABBABBAABBBBBAABBBBBBAABABBABABBBABAABBBAABBABBABABAAAAABBAABABAAABAAAAAABAAABABBAABAABBBABAAAAAABBABBBBABAAAAABAAAAABBBBABBABABBBBAAAAABAABAAABAABAABBBBABAABBBAABABBAABAAABABBBAABBBABABBAAABAAAABAAABBABAAABBBBAABBBBAABBAABBAAAAAAABABBBABABABBBABAABBBABBBABBABAABAAABABABABABBBABBBBBBAABBBBABABAAABABBBBABBBBBBAAABBABABAABAABAABBAABBABABBBAABAAAAABABAAAAABAAABABABBAAABBABBABBABBBABBABAABAAABBBAABAAAAABBBAABBBABAABBABAAABBBAAABAABABABAAABBBAAAABBABAABBAABAAAABBBABAABABAABAABBBBABABAAABAABABABBBABAABAAAAAAAABABBAABABBABAABBBBBBBAAAAAABAABABABBABBAABBABAABBBABBABAABBBAABBAAABBBBAAAAAAABAABBBBABBBAABABABAAABBBBABAABABBAAAABABAAABBAAABAABAAABABBABABAABBAABAABABBAABAABBABAABBBBABABABAABBAABABABBBBAAAAAAABAABABBBBBBAABAAABAAABBBBBBABAABAAAAABABABBBAABABBABBBAABBAABBBBBBABBABBBAAAAAABBBAAAABBABABABBABBBABABABAABABBBABAAABAAAABBBABABAAABABAABBAAABAABBAABABBBAAABBBBBAABBABAABBABBAAAABBAAAAABABABABBBBABABBAAABBABABABBAABABBBBBAAABBBAAAAAAABBAABBBBBBBAAAABBBBBBABABBABBABAABABBBAABBABBAAABAABABBBAAABABBABBAABAAAAABBBBAABABABBBBBAABBBAAAAABAABABAAAAAABAABBBBAABABABBBBBBBAAAABBABBABAABABABBAABAAABBABBBBBBBAAABBAAABAAAABABBBBBAABABABABAABBAAAAAABAAABBAAABBABBBBBBABABBBABBAABBBABBBBBBBBABABAAABAABBBABBBABBBABAAABBBBABABABBBABBABAAABAAABBBAABABABABABAAABBAAAABBBAABABAAAAABABBBAABBABBBBBABABABBBAAAAAAAABABABBBAABBBBABBABAAAABAABAABAAAABBBBABBBABABABBBABBABBAABAABAABBBAABBABBBBABBBABBBBAABABBAABBBAABBAABBBAAABBBBAAABAAABBBBBAAABBBABBBAABAAAAABAABABBAAAABBAABBBABABAABBAABAAABABBBABBABBBABABAABABBABBABABBBABABBBAABABBAABBAAAABAAABBBBAAAAABBBABBBBBABBABAABABBBAAABAAAAAABBBBAABABBBBBABBABBBABAAAAAAAAAABBBAAAABABABABBABABBBBABBAAABAAAABAAAABAAABABAAAABABBABAABABBAABAABABBABBBBAABBAABABBBABAABBBBBBBABABBBAAABABABABBBAABBAAABBBAABBBBAABBABABBAABBBABBAABABABABBBAABAAABABBBABBBAAABBAAAABBBBAABAAAAAAAABBAABBBBABBBBBABABABBAABAABAABBABBAAABBABAAABAABBABABBBBAAAAABABAABAAABBBBBABBAAABABABAABABBBBABABAAABBBAABBABBAABBBABBBAABBABBABBABABAABBBBBABBBAABAAAAABBABAAABABBBBBBAAABAABBABAABBAAAAABABBABABBBBAABABAAABBAABBBABBAABABAAABABABBAAAAAAAABAABABBBABBBBAAABBAABBAABAAAAAAABABBBAABBABAABABAAABBABBABBAABABBBAABABAAABBBBABAABBAAAAABBAABBBBBBABBBABABBBBABABBAABBABAABBBBAAABBBABBAAABAABAAAAABBAABAABBBBBBAABAAAAAAAAABAABBAAAABAABBBAAABBBABBAABAAABBABABAAAABABABAABBAAAAABBAABAAABBABAABAABABBBAABBABBABABBABBBBAABBABBBAABBBBBBAABBBABBBAAAABAABBABBBABBAAABAABABAABBBBABBAABABBABABBBABBBABBBAAAAABBBBBABBAABBAABABAABBBBBABBBBBBAAAABABBABABAAAABAAAAAABABABABAABAABBAABBABBABBBAAAAAABABBABAABBBAAAAABBAABAAAAAAAAAABBBABAABBBABAABAABBAABAABABBABBBAABBABBABBBBABBAAAAAABABBBBABABBBBBBAABBBBABAABAAAAABAAAABABBAAABBABBBBBABAABAAAAAABBABBBAABAABBABABBBABBBAABAABBBAABBBBBBABBBABBBBAABBBABABAAABBABBAAABBABABBAAABABAAABBAABBBAABBBBBBBABABBBBBAAABAABBBAABBBBBABBAAABBABABABAABABBABBABBBAAABABAAABBBBABABAABBBBABABBBAABABABABBAABBBBABAABABABAABBBAAABABBBBABAAABBBAAAAAAAABAAABAABABABABABAABAABAABAABAAABAABAABBAABBABABBABAAAAABABBABBBABAAABBABBABAABBAABBABBBBAABABAABAABBBBAABAABBAABBBBBAAABBABAABBBBAAAABBBBBBABBBBAAAAAABBAAABBBAAAABABABABAABBBABBAAAABBBABABBAABABBABAAABBBAABAABAAABBBBBBBABBBBAABBAABBBBABAABAABABBBBAAAABBBABBAABABBBABABBABBBBAAABAABABABBBABBABBBABABABBBAAAABAABABABABBBAABAAABABBBAAABABAAAAABBABAABBBBAABAAAAABAABABBBBBBAABBAABABBBABABBABBAABABAAABBABBAAAAAAAABBAABABABAAAABBABABAAAAAAAABAABBBBBBBABBBBBBAABBAAAABAABAAABABAABABAAABBBAAABBBBABABBAAABBBBABBBBAAAABBAAAABBBABBAAABBAAABBABBAABAAABAABAAABBBBABBBAABAABABABBAABBAABAABAAAABBABBBBBBAAAABABAABBBABAABBBAABBBBAABAAAAAAABABBAAAAABABBAABABABABABBABBABBBBAAAAAABBAAAAABABAABBABAAABAAABBABBABBBAABBABABAABABBBBBBABBAABABABAAAAAABABABAAAAABBBAAABAABBBABAABABBAAAAABABAABBBAABABBBBAABAAABABBBBBBAABBABAAAAABBBBAABAABAABABABABAABBBAABAAAAABBBBAABAABABBBBBBABABBBBBBBABBAABBBBBABBBBAAABBBBBBBABABAABBBBBAAABAAABBBABBBBBBAAAABABBABAAABABBABBAAAAAABABABBBBBABAAABAAAAABBAABBABBBBABABABABAAABAAABAABBBABBBAABBBAAABBAABBBBBAAAABABABAABAABABBBBBBAABBBAAABAABABABBBAAAAAAABBBAAABABABBABAAAAABAABBABAABAAABBABBBBABABBBBBBBABBAABABBAABAAABABAAAABABBBAABAAABAAAABBABAABABBBBBBBBBAABBAABBAABABABAAABBBBAABAAABBAABBBBBAABAABBAAAAABBBAABBABABAABBBABAABBBBAABAAAABBBABABBABBABAAABBABABAABBBBBBBBBABABAABABBBBBAAAAABAABBBABBAAABBBBABBBBAABAABAABABBBABABABBABABABBABABBBABBBABBABABBBAABBBABBBBBBBABBBABBBBBBABAABBABABABBBBBBAAAABBBABABABAABAAAAABAABBBBAAAAAAAAAAABABBAABBABBAAAAABABAAAABABBABBAAAABAAABABABBABBBBBAABABBBAAAAAAAABAABBBBBAABBAABBABABABAABBAABAABABABABAAABBAAABABBBBAAAABAAABABBBABBBBBBBBBBBABBBBAABAAABAAAAABAAABBABBBAAABBBAAABABBABAAAABAABAAABABABBBBBABBABABBABAAAABBABAABAAAAABBBBABAAABABAAABBABABABBAAAAAABABABAABAAAABBBBAAABABBBBABBAABBAAABAAAAAABBBAABAABAAABBAAABABAABABAABAAABBBBABBAABAAABBBBABAAAABBABBAABABABBBBABAAABABABBBABBAABAAAAABABBABBBBABBAABBABAABABBAABAABABAABABABAAABBBBABABBBBBABBBAAAABAAAABABBBABABAAAABABABBAAAAAAAABBABABBAABBAABAABAAAABBAABAABBAAABAAABAAABAAAAABABBBAABABABBBBBBABBAAAAABAAABBBBABAABABBAAABBBAABBABBBABBABABAABBAABABAABABABBAABBAAAABBAAAABABAABBBABBBBBABAABBBBABBBBAABABBBBBBBABAABABBBBBABBABABABBAABBBBBBAABBABAAABBABABAAAABAABBAAAABBBBBABAABAABAAAABAABABAAABBBBBABAAAABAAABBBBBBBBBBAAAAABBBABAAAAAABBBBAAABBABABABBABABABAAABBABBBABAABAAABABBBAABABBBAAAABBBBABABAABBABBBABABBAABABBAABABAAAABBBBBAAAABBAAABBAABABAABBBABBBBAABBBBBBBABBBBBABBBAABAAABABABBABABBBAABBBAAABAAAAABBABAABBABABAAABABABABBAABAABAAAAABAABBBAAAAAAAABABBBBBBAABBABAAABAAAABAABBAABBBBABABAABABBBBBBBAABBABBAAAAABBAAABBBBBBAAABBBAABAAAABAABABAAAAAABBAAABABBBAAABBABABAABBAABABBBBAABBBABABBABBBBBABAABAABABABBBBBBAAABAAABBAAABBBAABBABAABAAABBBBBABAAABBBBBBAAAAAABABBBAABABAAABAAAAABBBAAAAABABBBBAAABABBABBABBABBAAABAAAABBAAABBABABABBABAAAABBBBBABBABBBABBAABABBABABBBBABBBABABBBABABBAAAAABBAABBBABABBABAAAAABAAAAABBAABBBABABABBBBBABAAAABABBABBABABBAAAABAABBBBBABAAAAABABABBBBAAABAABABAABBAAAABBBBBBAABABAAAAABBABAABABAABAABBBABBABBBAABAABABAABAAABBABAABABBAAAAABBABAABBABBAAAAABAAAAABABABAABABBAABAABABAABAABBABBBBBBABAAAAABBAAAAABABAAAABBABABABAABAAAAAABBBBABBBAABAAABBABBBBAABAAAAAAABABBABABBBBBBBBBBAAABBABBABBABBABBBBABBBAAAABBBABBABABABBBAAAAAABBBBAAABAABBAABBBAAABABABAAAAAABBBAAAABAAAAAABABBABABBBABBABAAABAABAAAAAAABAABABBBAAABBBABAAAAAAABAAAABABABBBBAAAABBBAAABBABBABAABAAABABBBAAAABBBAAAAAABBBBBBABBABBABABABBBABABAABBABBBBAAAABBBBABBBBAAABBAABBBBAABABABABBAAABBAAAABAAABBABAAABAAAAAABABAABABABAABBABBBAABAABBAABBABAABBAABBBABBBBAAABAAAAAABBAAAAAAABBABBBABBABAABABABAABAAAAAAAABABAABBBBBABAABBBBBABABBAABAABBBBAABBBABABAABAAABBAABABBAAAABBAABABBBBAAAAAAAAABABBBBABBABBBABBBBAABAABABBABABBAAABBBAABBBBBBABABBBBAABBAAAABBABABABAAABBBBAAABBBAABBBABBBBAABBAABBABAABBBBBBAAABAAAAABBBAAABBABBAAAAABBBBBABBAAAAAABBBABBAABBAABAABAAABBBBABBBBABBBBABAAABBBBBABBBBBBAABBBAAABABABAABBABABABAAAABBBABABABBABABAAABBBABAABABBABBBABABBBBABBBBABABABAAABABBBBAAABABBBABAAAABBABBBBAAABBAAAABAAAABBBAAABAABAABBBBAABABABBABBBBBBAAABABABBBBBAABBABABAAABBBAAABBBABAAAABABABBAABBBBABAABBBBBBBAABBABAABABBBBAAABBBBBBBAAABBBABABBABBBABABABBABAABBBAABBAAAABAAABABABBBABBBAABBAAABABABBAABBABABABBBBABABBABABBAAAABAAABAAAABABBAABBAABBBBBBBABBBAABAAAAABAABBBBBAABBBAABBAAABBBBBABBBBAABABABBBABABBBBAABAABBBAAAABBBBBBBABBBBBBBAAABABBABABBABBAAAAABBBBAABBBABBABBAAAAAABBAAABAABABAAAAABAABBBBAABBABBAAABAAABABBBBBBBABBAAABABABAABBBBBAABABBBAAAABBAABABBBBABAAABBBBABBBBAAAAAAAABAAAABAA";
		
		System.out.println(alternatingCharacters(s));
	}
    
}