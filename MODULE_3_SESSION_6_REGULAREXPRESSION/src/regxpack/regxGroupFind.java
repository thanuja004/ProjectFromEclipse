package regxpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regxGroupFind {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("Luminar",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("Visit luminar");
		boolean matchFound=matcher.find();
		if(matchFound) {
			System.out.println("MATCH FOUND");
			
		}else {
			System.out.println("MATCH NOT FOUND");
		}

	}

}
