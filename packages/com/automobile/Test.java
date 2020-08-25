package packages.com.automobile;
import packages.com.automobile.fourwheeler.Ford;
import packages.com.automobile.fourwheeler.Logan;
import packages.com.automobile.twowheeler.Hero;
import packages.com.automobile.twowheeler.Honda;


public class Test {

	public static void main(String[] args) {
		Hero hero = new Hero("Hero i-smart 110 2s", "MP65MD5060", "Nivedha", 90);
		System.out.println(hero.getModelName());
		System.out.println(hero.getOwnerName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getSpeed()+" kmph");
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda CB Hornet 160R", "M15FZ5101", "Swetha", 110);
		System.out.println(honda.getModelName());
		System.out.println(honda.getOwnerName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getSpeed()+" kmph");
		honda.cdPlayer();
		
		System.out.println();
		
		Logan logan = new Logan("Logan i-smart 110 2s", "MP65MD5060", "Nivedha", 90,110);
		System.out.println(logan.getModelName());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.getSpeed()+" kmph");
		System.out.println(logan.gps()+"'");
		
		System.out.println();
		
		Ford ford = new Ford("Ford CB Hornet 160R", "M15FZ5101", "Swetha", 110,100);
		System.out.println(ford.getModelName());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.getSpeed()+" kmph");
		System.out.println(ford.tempControl()+" 'C");
		
	}

}
