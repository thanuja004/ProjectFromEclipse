package regxpack;

import java.util.regex.Pattern;

public class regexExampleDemo {

	public static void main(String[] args) {
		System.out.println("metacharacters d..........");
		System.out.println(Pattern.matches("\\d","a"));
		System.out.println(Pattern.matches("\\d","1"));
		System.out.println("metacharacters D..........");
		System.out.println(Pattern.matches("\\D","1"));
		System.out.println(Pattern.matches("\\D","a"));

		System.out.println("............Range of characters..........");
		   String pattern=".park.*";
		System.out.println(Pattern.matches("[abc]","d"));

	}

}
