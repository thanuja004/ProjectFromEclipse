package regxpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		  String text="thanujak004@gmail.com";
		  Matcher match =Pattern.compile("\\d+").matcher(text\);
		  while(match.find()) {
			  
			  System.out.println("Found number :"+ match.group());

	}

}
}
