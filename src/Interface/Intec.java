package Interface;

public class Intec {

	int x=6;
	static int y=7;
	
	public void display() {
		
		int a =5;
		int b=2;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intec a1 = new Intec();
		Intec a2 = new Intec();
		
		a2.x=1;
		System.out.println(a1.x);
		System.out.println(a2.x);
		System.out.println(y);
		y=8;
		System.out.println(y);
		
		
	}

}
