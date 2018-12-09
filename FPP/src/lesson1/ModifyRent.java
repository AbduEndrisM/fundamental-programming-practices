package lesson1;

class TrailorRental {
	private double mRent;
	private String tNo;

	TrailorRental(String tNo, double mRent) {
		this.tNo = tNo;
		this.mRent = mRent;
	}

	public double getmRent() {
		return mRent;
	}

	public void setmRent(double mRent) {
		this.mRent = mRent;
	}

	public String toString() {
		return "[" + this.tNo + "," + this.mRent + "]";
	}
}

public class ModifyRent {
	public static void main(String[] args) {
		TrailorRental[] obj = { new TrailorRental("11A", 650), new TrailorRental("11J", 550) };
		System.out.println("Original Rental for the Trailors : ");
		System.out.print(obj[0]);
		System.out.print(obj[1]);
		changeRental(obj);
		System.out.println("\nModified Rental for the Trailors : ");
		System.out.print(obj[0]);
		System.out.print(obj[1]);
	}

	public static void changeRental(TrailorRental[] objects) {
		double temp;
		if (objects != null || objects.length > 0) {
			for (TrailorRental ind : objects) {
				temp = ind.getmRent() + ind.getmRent() * 0.10;
				ind.setmRent(temp);
			}
		}
	}
}