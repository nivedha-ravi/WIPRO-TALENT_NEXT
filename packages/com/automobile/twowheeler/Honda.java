package packages.com.automobile.twowheeler;
import packages.com.automobile.Vehicle;

public class Honda extends Vehicle{
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
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
	public void cdPlayer()
	{
		System.out.println("Accessing the CDPlayer");
	}

}
