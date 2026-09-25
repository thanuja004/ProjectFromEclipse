package stringdemo;

import java.util.StringTokenizer;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		int vowels=0;
		int cons=0;
		String s="Hello world";
		
		System.out.println(s.toLowerCase());
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowels++;
		
			
		}else {
			cons++;
			
		}
		}
		System.out.println("count of vowels : "+vowels);
		System.out.println("count of vowels : "+cons);
		
		}
			
		
			
		
		}

	
	


