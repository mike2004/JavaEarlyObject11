public class SalariedCompensationModel implements CompensationModel {
	private double weeklySalary;

	// constructor
	public SalariedCompensationModel(
			double weeklySalary) {
		

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

	// set salary
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

	// return salary
	public double getWeeklySalary() {
		return weeklySalary;
	}

	// calculate earnings; override abstract method earnings in Employee
	
	public double earnings() {
		return getWeeklySalary();
	}

	@Override
	public String toString() {
		return "SalariedCompensationModel\nweeklySalary=" + weeklySalary + " \nEarnings: $" + earnings();
	}

	// return String representation of SalariedEmployee object
	
	/*public String toString() {
		return String.format("salaried employee: %s%n%s: $%s",  "weekly salary", getWeeklySalary());*/
	
	}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/
