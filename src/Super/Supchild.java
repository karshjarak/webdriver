package Super;

public class Supchild extends Supparent {
	int n;
	int m = 99;

	public Supchild(int a) {
		super(a);

		System.out.println(a);
	}

	public Supchild(int a, int b) {
		super(a, b, 9);
		System.out.println(a + b);
	}

	public void inti() {
		System.out.println("child child");
		
		super.inti();
		
//         System.out.println(super.abc);
//         System.out.println(super.f);
//         System.out.println(super.m);
//
//		System.out.println(this.m);
//		System.out.println(this.n);
	}

}
