package regxpack;
import java.util.regex.Pattern;;

public class regxExampleNew {

	public static void main(String[] args) {
       String pattern=".park.*";
       String content="park This is Bini from info";
       boolean isMatch=Pattern.matches(pattern, content);
       System.out.println("The text contains 'park' ?"+ isMatch);
	}

}
