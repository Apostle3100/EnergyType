package model;

public class Bus extends Vehicle{

	private int numberOfSeats;
	private int hasBaggageDivision;
	
	
	public int getnumberOfSeats() {
		return numberOfSeats;
	}
	
	
	public int gethasBaggageDivision() {
		return hasBaggageDivision;
	}
	
	public void setnumberOfSeats(int inputnumberOfSeats) {
		if (inputnumberOfSeats > 5 && inputnumberOfSeats < 100){
			numberOfSeats = inputnumberOfSeats;
		}
		else {
			numberOfSeats = 5;
		}
	}

	
	public void sethasBaggageDivision(int inputHasBaggageDivision) {
		hasBaggageDivision = inputHasBaggageDivision;
		
		
	}
	public Bus () {
		super();
		setTitle("opel");
		setVehicleCode();
		setnumberOfSeats(10);
		sethasBaggageDivision(23);
		
		
	}
	
		
public Bus (String inputtitle, float inputPrice, EnergyType inputEType, int inputNumberOfSeats,
		int inputBaggageDivision) {
	super (inputtitle, inputPrice, inputEType);
	setnumberOfSeats(inputNumberOfSeats);
	sethasBaggageDivision(inputBaggageDivision);
}

public String toString() {
	String result = super.toString() + " "+numberOfSeats + 
		" " + hasBaggageDivision;
	return result;
	
	
}
	}


