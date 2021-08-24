package Super;

public class B extends A{
	
	String  j;
	
	public B(String h) {
		super(h);

		this.j=h;
		System.out.println(h);


	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B a = new B("karshak");
		
	}

}
