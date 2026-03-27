package model;

public class Tractor extends Vehicle{
	private String AdditionalTechnique;
	private boolean largeTires;

	public 
		String getAdditionalTechnique() {
			return AdditionalTechnique;
		}
	
		public boolean getlargeTires() {
		return largeTires;
		
	

}

		public void setAdditionalTechnique(String inputAdditionalTechnique) {
			if(inputAdditionalTechnique !=null) {
				AdditionalTechnique= inputAdditionalTechnique;
				
			}
			else {
				AdditionalTechnique = "no additional technique";
				
			}
		}
		
		public void setlargeTires(boolean inputlargeTires) {
			largeTires =inputlargeTires;
		}
			public Tractor() {
				super();
				setAdditionalTechnique( "milleage");
				setlargeTires(true);
			}
			
			
			public Tractor (String inputAdditionalTechnique, boolean inputlargeTires, String inputTitle,float inputPrice,EnergyType inputEType)
			

}

		
