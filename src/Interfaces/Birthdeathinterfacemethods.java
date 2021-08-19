package Interfaces;

import java.time.Year;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public interface Birthdeathinterfacemethods {

	abstract void setAliveSimulatedResponse(int aliveordeadvalue);

	abstract int simulateAliveOrDead();

	abstract int simulateSexValue();

	abstract void simulateYearOfBirth(Year year);

	abstract void simulateYearOfDeath();

}
