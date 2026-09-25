package genericfeaturespack;

public class  genericBoundedType {
	private T t;
	public T get() {
		return this.t;
	}
	public void set(T t1) {
		this.t=t1;
	}

	public static<T>boolean isEqual(genericType<T>g1,genericType<T>g2){
		return g1.get().equals(g2.get());
		
	}
	public static<T extends Comparable<T>>int compare(T t1,T t2){
		return t1.compareTo(t2);
	}

	public static void main(String[] args) {
		genericBoundedType<String> g1=new genericBoundedType<>();
		g1.set("Bini");
		genericBoundedType<String> g2=new genericBoundedType<>();
		g2.set("Bini");
		boolean check=GenericsMethodsBounds.<String>checkEquals(g1,g2);
		System.out.println(check);
		check=GenericsMethodsBounds.checkEquals(g1,g2);
		System.out.println(check);
		System.out.println(genericMethodsBounds.compare("bini","bini"));
		System.out.println(genericMethodsBounds.compare("bini","Bini"));
		System.out.println(genericMethodsBounds.compare("bini","mini"));
		

	}

}
