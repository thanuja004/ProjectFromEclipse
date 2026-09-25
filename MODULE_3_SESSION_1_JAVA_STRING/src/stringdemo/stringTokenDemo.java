package stringdemo;

import java.util.StringTokenizer;

public class stringTokenDemo {

	public static void main(String[] args) {
		String s="hjbwes kmq  awq";
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreElements()) {
			//System.out.println(st.nextToken());
			System.out.println(st.nextToken());
			
		}
		System.out.println(st.countTokens());
		

	}

}
