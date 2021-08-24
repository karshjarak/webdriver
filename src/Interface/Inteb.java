package Interface;

public class Inteb extends Intea {
	int j = 55;

	public void g() {
		// TODO Auto-generated method stub

		System.out.println("interface");
	}

	public void h() {

		super.h();
		System.out.println("abstract overriderd");
		System.out.println(this.j);

		System.out.println(super.h);

	}

	public static void main(String[] args) {

		Inteb b = new Inteb();
		b.g();
		b.h();

	}

}
