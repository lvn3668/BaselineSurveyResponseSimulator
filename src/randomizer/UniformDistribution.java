package randomizer;

import org.apache.commons.math3.distribution.UniformIntegerDistribution;
import org.apache.commons.math3.exception.NumberIsTooLargeException;

// Generate noise from variety of distributions and average it
/**
 * @author Lalitha Viswanathan
 * Affiliation VABHS / MAVERIC 
 *
 */
public class UniformDistribution {

	org.apache.commons.math3.distribution.UniformIntegerDistribution uniformintegerdistribution_errorresponsedist;
	org.apache.commons.math3.distribution.UniformIntegerDistribution uniformintegerdistribution_year;

	public UniformDistribution() {
		// TODO Auto-generated constructor stub
		// Remove 1900 , 2020 (TBD)
		try {
			this.setUidyear(new UniformIntegerDistribution(1900, 2020));
			this.setUiderrorresponsedist(new UniformIntegerDistribution(0, 1));
		} catch (NumberIsTooLargeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public UniformDistribution(int minimum, int maximum) {
		try {
			this.uniformintegerdistribution_errorresponsedist = new UniformIntegerDistribution(minimum, maximum);
		} catch (NumberIsTooLargeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean generatenoiseinresponsevariables(int number) {
		// find value from pdf for number
		if (this.returnprobabilitytointroducenoiseinyearresponses(number) > 0.5) {
			return true;
		}
		return false;
	}

	// bool to generate noise
	// function called in data simulator package for Year
	//
	public boolean generatenoiseinyearresponses(int number) {
		// find value from pdf for number
		if (this.returnprobabilitytointroducenoiseinyearresponses(number) > 0.5) {
			return true;
		}
		return false;
	}

	/**
	 * @return the uiderrorresponsedist
	 */
	private org.apache.commons.math3.distribution.UniformIntegerDistribution getUiderrorresponsedist() {
		return this.uniformintegerdistribution_errorresponsedist;
	}

	/**
	 * @return the uidyear
	 */
	private org.apache.commons.math3.distribution.UniformIntegerDistribution getUidyear() {
		return this.uniformintegerdistribution_year;
	}

	// To be generated Randomly from caller
	public double returnprobabilitytointroducenoiseinresponsevariables(int number) {
		try {
			return this.getUiderrorresponsedist().probability(number);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getUiderrorresponsedist().probability(number);
	}

	// To be generated Randomly from caller
	public double returnprobabilitytointroducenoiseinyearresponses(int number) {
		return this.getUiderrorresponsedist().probability(number);
	}

	/**
	 * @param uiderrorresponsedist the uiderrorresponsedist to set
	 */
	private void setUiderrorresponsedist(
			org.apache.commons.math3.distribution.UniformIntegerDistribution uiderrorresponsedist) {
		try {
			this.uniformintegerdistribution_errorresponsedist = uiderrorresponsedist;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uidyear the uidyear to set
	 */
	private void setUidyear(org.apache.commons.math3.distribution.UniformIntegerDistribution uidyear) {
		try {
			this.uniformintegerdistribution_year = uidyear;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
