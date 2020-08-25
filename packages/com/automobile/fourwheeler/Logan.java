package packages.com.automobile.fourwheeler;
import packages.com.automobile.Vehicle;

public class Logan extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int gps;
	
	public Logan(String modelName, String registrationNumber, String ownerName, int speed,int gps) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.gps=gps;
	}
	public int getSpeed()
	{
		return speed;
	}

	@Override
	public String getModelName() {
		return modelName;
	}

	@Override
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	@Override
	public String getOwnerName() {
		return ownerName;
	}
	public int gps()
	{
		return gps;
	}
	

}
