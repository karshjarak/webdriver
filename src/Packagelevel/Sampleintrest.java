package Packagelevel;

public class Sampleintrest {

	public static void main(String[] args) {
		
		String bankname = "sbdfgi";
		String loan = "getcarloan";
		
		Sampleintrest s1 = new Sampleintrest();
				System.out.println(s1.getroi(bankname, loan));
		
		
	}

	public double getroi(String bankname, String loan) {

		if (loan.equalsIgnoreCase("homeloan")) {

			return Sampleintrest.getbackname(bankname).homeloan();

		} else if (loan.equalsIgnoreCase("getcarloan")) {

			return Sampleintrest.getbackname(bankname).getcarloan();

		} else {

			return Sampleintrest.getbackname(bankname).homeloan();

		}

	}

	public static RBI getbackname(String bank) {

		if (bank.equalsIgnoreCase("sbi")) {

			return new SBI();

		} else if (bank.equalsIgnoreCase("sc")) {

			return new SC();

		} else {
			return new RBI();
		}

	}

}
