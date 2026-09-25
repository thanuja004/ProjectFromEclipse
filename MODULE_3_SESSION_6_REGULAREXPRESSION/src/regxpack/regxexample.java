package regxpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regxexample {
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile(".s");
		Matcher matcher=pattern.matcher("as");
		boolean flagFirst=matcher.matches();
		boolean flagSecond=Pattern.compile(".s").matcher("as").matches();
		boolean flagThird=Pattern.matches(".s","as");
		System.out.println(flagFirst+"\n"+flagSecond+"\n"+flagThird);
		
	}

}
