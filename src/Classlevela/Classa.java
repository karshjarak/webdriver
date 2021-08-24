package Classlevela;

import Packagelevel.Classb;

public class Classa {

	public static void main(String[] args) {

		Classa a = new Classa();
		a.add(23, 34);
		int f = a.add(22, 33, 44);
		System.out.println(f);
		a.add("cde", 9);
		int g =	a.add(1,2,3,3,1,2);
		System.out.println(g);

		// TODO Auto-generated method stub

	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public int add(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}

	public void add(String a, int b) {
		System.out.println(a + b);
	}

	public int add(int... var) {

		int sum = 0;
		for (int h = 0; h < var.length; h++) {
			sum = sum + var[h];
			
		}
		return sum;
	}

}
