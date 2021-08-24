package Exception;

public class Execa extends Exception {

	public static void show(int i) throws Execa {

		if (i == 5) {

			throw new Execa();
		}
		System.out.println("karshak");
	}

}
