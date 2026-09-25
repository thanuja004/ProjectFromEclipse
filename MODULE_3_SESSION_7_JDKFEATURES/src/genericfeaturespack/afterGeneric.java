package genericfeaturespack;

public class afterGeneric<T> {
	private T t;
	public T get() {
		return this.t;
		
	}
	public void set(T t1) {
		this.t=t1;
		
	}
	

	public static void main(String[] args) {
		afterGeneric<String>type=new afterGeneric<>();
		type.set("Bini");
		System.out.println(type.get());
		afterGeneric<String>type2=new afterGeneric<>();
		type2.set("Bini");
		System.out.println(type2.get());
		
		

	}

}
