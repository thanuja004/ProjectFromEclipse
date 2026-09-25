package stringdemo;


public class StringBuilderDemo {

	public static void main(String[] args) {
		String s=new String("Hello ftgyhujikkhujikohujikohnjm");
		StringBuilder sb= new StringBuilder("helloluminar");
		System.out.println("capacity after  append "+sb.capacity());
		s.concat("student");
		//sb.append("Luminar");
		//sb.append("new");
		//System.out.println("s : " +s);
		sb.append("sbkcvgrjcmf,ldgvcfdkdm,l.ldl4di4lwsa.ksmdnfdms,.ammmmmmmmmmmmmm");
		System.out.println("String Buffer Capacity : "+sb.capacity());
		//sb.delete(0,6);
		System.out.println(s.substring(15));//cut the substring
		System.out.println(s.substring(0,7));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		System.out.println(s.startsWith("lu"));
		System.out.println(s.endsWith("r"));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		String replaceString=s.replace("llo","lltg");
		System.out.println(replaceString);
		
		
		
		
		//System.out.println("capacity after 2026 append "+sb.capacity());
		//System.out.println(sb.charAt(4));
		//System.out.println(sb.insert(6, "kochi"));
	
		
		

	}

}
