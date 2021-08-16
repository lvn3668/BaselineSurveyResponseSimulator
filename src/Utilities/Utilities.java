package Utilities;

import java.util.Random;

public class Utilities {

	private Random random;
	public Utilities() {
		// TODO Auto-generated constructor stub
		random = new Random();
	}

	public int randBetween(int start, int end) {
	    return start + (int)Math.round(Math.random() * (end - start));
	}
	
	public float randFloatBetween(int start, int end)
	{
		return (start + (float)random.nextFloat()*(end-start));
	}
	
	public int generateRandomNumber(int upperbound)
	{
		return (random.nextInt(upperbound));
	}
}
