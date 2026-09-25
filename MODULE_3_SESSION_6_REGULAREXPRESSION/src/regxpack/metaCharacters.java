package regxpack;

public class metaCharacters {

	public static void main(String[] args) {
		System.out.println("123".matches("\\d{3}"));
		System.out.println("1".matches("\\d{3}"));
		System.out.println("=========Much atleast 2 digits=======");
		System.out.println("123".matches("\\d{2,}"));
		System.out.println("3".matches("\\d{2,}"));
		System.out.println("=========Match between 2 and 4 digits=======");
		System.out.println("123".matches("\\d{2,4}"));
		System.out.println("1".matches("\\d{2,4}"));
		System.out.println("12345".matches("\\d{2,4}"));
		System.out.println("=========Match one or more digits=======");
		System.out.println("12345".matches("\\d{2,4}"));
		System.out.println("12345".matches("\\d{2,4}"));
		
	}

}
