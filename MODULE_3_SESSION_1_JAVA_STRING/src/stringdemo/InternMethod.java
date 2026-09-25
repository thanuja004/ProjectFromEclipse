package stringdemo;

public class InternMethod {

	public static void main(String[] args) {
		String s=new String("Hello");
		//String snew="Hello";
		String s2=s.intern();
		System.out.println(s2);

	}

}
