package genericfeaturespack;

public class genericType<T> {
	private T t;
	public T get() {
		return this.t;
	}
	public void set(T t1) {
		this.t=t1;
	}


		public static<T>boolean isEqual(genericType<T>g1,genericType<T>g2){
			return g1.get().equals(g2.get());
		
			public static void main(String[] args) {
				GenType<String> g1=new GenType<>();
				g1.set("Bini");
				GenType<String> g2=new GenType<>();
				g2.set("Bini");
				boolean isEqual=GenericsMethods.<String>isEqual(g1,g2);
				isEqual=GenericsMethods.isEqual(g1,g2);
				System.out.println(isEqual);
				GenType<Integer> g3=new GenType<>();
				g3.set(10);
				GenType<String> g4=new GenType<>();
				g4.set(11);
				boolean isEqual=GenericsMethods.<String>isEqual(g3,g4);
				isEqual=GenericsMethods.isEqual(g3,g4);
				System.out.println(isEqual);
				GenType<Float> g5=new GenType<>();
				g3.set(10.8f);
				GenType<Float> g6=new GenType<>();
				g4.set(11.76f);
				boolean isEqual=GenericsMethods.<String>isEqual(g5,g6);
				isEqual=GenericsMethods.isEqual(g5,g6);
				System.out.println(isEqual);
				
				
			
		

			}
	}

}
