package genericfeaturespack;

public class genericfeaturesExample {
	private object t;

	public object get();
	return t;

}

	public void set(Object t) {
		this.t = t;
	}

	public static void main(String[] args) {
		genericfeaturesExample type=new genericfeaturesExample();
		type.set("Bini");
		String str=(String) type.get();
		System.out.println(str);
		type.set(20);
		String str=(String) type.get();
		System.out.println(str);
		

	}

}
