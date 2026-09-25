package regxpack;

import java.util.regex.Pattern;

public class RegxNumber {

	public static void main(String[] args) {
	System.out.println(" by character classes and quantifiers ");
	System.out.println(Pattern.matches("^[6-9]\\d{9}$","9976589087"));
	System.out.println(Pattern.matches("[6789][0-9]{9}","9976589087"));
	System.out.println(Pattern.matches("[6789][0-9]{9}","99765890870"));
	System.out.println(Pattern.matches("[6789][0-9]{9}","59765890870"));
	System.out.println(Pattern.matches("[6789][0-9]{9}","9976589087"));
	

	}

}
