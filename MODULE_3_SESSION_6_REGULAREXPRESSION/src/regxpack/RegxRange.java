package regxpack;

import java.util.regex.Pattern;

public class RegxRange {

	public static void main(String[] args) {
	 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
	 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "january2025"));
	 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA23$EJM,SA"));
	 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aruN22"));
	 
	}

}
