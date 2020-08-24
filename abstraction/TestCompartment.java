package abstraction;

import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] c=new Compartment[10]; 
		Random random=new Random();
		for(int i=0;i<10;i++)
		{
			int randomNum = random.nextInt((4-1)+1)+1;//boundary of randomnum
	    	
    		if (randomNum == 1)
    			c[i] = new Luggage();
    		else if (randomNum == 2)
    			c[i] = new Ladies();
    		else if (randomNum == 3)
    			c[i] = new General();
    		else if (randomNum == 4)
    			c[i] = new FirstClass();
    	
    		System.out.println(c[i].notice());
		}
		//checking polymorphic behaviour
		for (int i = 0; i < 10; i++) {
    		if(c[i] instanceof Luggage)
        		System.out.print("Compartment " + i + " is of type Luggage, ");
    		if(c[i] instanceof Ladies)
        		System.out.print("Compartment " + i + " is of type Ladies, ");
    		if(c[i] instanceof General)
        		System.out.print("Compartment "+ i + " is of type General, ");
    		if(c[i] instanceof FirstClass)
        		System.out.print("Compartment "+ i + " is of type FirstClass, ");
    		c[i].notice();
    	}
			
	}

}
