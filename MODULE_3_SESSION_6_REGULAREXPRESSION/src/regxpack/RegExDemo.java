package regxpack;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		String text = "Marks: 85, 90 and 98";
		String regex = "\\d+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		List<Integer>myMarks=new ArrayList<>();
		while (matcher.find()) {
			myMarks.add(Integer.parseInt(matcher.group()));
		}
			System.out.println(myMarks);
		

	}

}
