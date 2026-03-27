package model;

public class Vehicle {

	private int id;
	private String title;
	private String vehicleCode;
	private float price;
	private EnergyType eType;
	
	private static int counter = 0;

	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getVehicleCode() {
		return vehicleCode;
	}

	public float getPrice() {
		return price;
	}

	public EnergyType geteType() {
		return eType;
	}


	public void setId() {
		id = counter;
		counter++;
	}
	
	public void setTitle(String inputTitle) {
		if((inputTitle != null) && (!inputTitle.isEmpty()) 
				&& (inputTitle.matches("[A-Z]{1}[a-z]{3,20}"))) {
			title = inputTitle;
		}
		else
		{
			title = "Unkown";
		}
	}
	
	
	public void setVehicleCode() {
		vehicleCode = id + "_" + title;
	}
	
	public void setPrice(float inputPrice) {
		if(inputPrice > 0   && inputPrice <= 100000 ) {
			price = inputPrice;
		}
		else
		{
			price = 1;
		}
	}
	
	public void setEType(EnergyType inputEtype) {
		if(inputEtype!=null) {
			eType = inputEtype;
		}
		else
		{
			eType = EnergyType.not_specified;
		}
	}
	
	
	//4.both constructors
	public Vehicle() {
		setId();
		setTitle("opel");
		setVehicleCode();
		setPrice(234);
		setEType(EnergyType.gas);
		
		
	}
	public Vehicle (String inputtitle,
			float inputprice, 
			EnergyType inputType ) {
		setId();
		setTitle(inputtitle);
		setVehicleCode();
		setPrice(inputprice);
		setEType(inputType);
		
		
	}
	public String toString() {
		String result = id + " " + title + "(" + vehicleCode +")" +price + " " + eType;
		return result;
	}
	
	
	
	
	
	//5.toString function

}