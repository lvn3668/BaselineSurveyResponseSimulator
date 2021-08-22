package randomizer;

import java.util.Random;

import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.distribution.UniformIntegerDistribution;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.ml.distance.ChebyshevDistance;

// Generate noise from variety of distributions and average it
/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class RandomizingDistribution {

	private static final int lowerbounddistribution = 0;
	private static final int upperbounddistribution = 10;

	/**
	 * @return the lowerbounddistribution
	 */
	private static int getLowerbounddistribution() {
		return lowerbounddistribution;
	}

	/**
	 * @return the upperbounddistribution
	 */
	private static int getUpperbounddistribution() {
		return upperbounddistribution;
	}

	// exp(-0.5 * ((ln(x) - m) / s)^2) / (s * sqrt(2 * pi) * x)
	// m is scale ; s is std devn
	private LogNormalDistribution lognormaldistribution_errorresponsedistribution;

	private org.apache.commons.math3.distribution.UniformIntegerDistribution uniformintegerdistribution_errorresponsedist;

	private org.apache.commons.math3.distribution.UniformIntegerDistribution uniformintegerdistribution_year;

	public RandomizingDistribution() {
		// TODO Auto-generated constructor stub
		// Remove 1900 , 2020 (TBD)
		try {
			this.setUidyear(new UniformIntegerDistribution(1900, 2020));
			this.setUiderrorresponsedist(
					new UniformIntegerDistribution(RandomizingDistribution.getLowerbounddistribution(),
							RandomizingDistribution.getUpperbounddistribution()));
			this.setLognormaldistribution_errorresponsedistribution(
					new LogNormalDistribution(RandomizingDistribution.getLowerbounddistribution(),
							RandomizingDistribution.getUpperbounddistribution()));
		} catch (NumberIsTooLargeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public RandomizingDistribution(int minimum, int maximum) {
		try {
			this.setUiderrorresponsedist(new UniformIntegerDistribution(minimum, maximum));
			// scale (mean)
			// shape (std devn)
			this.setLognormaldistribution_errorresponsedistribution(new LogNormalDistribution(minimum, maximum));
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
	 * @return the lognormaldistribution_errorresponsedistribution
	 */
	public LogNormalDistribution getLognormaldistribution_errorresponsedistribution() {
		return this.lognormaldistribution_errorresponsedistribution;
	}

	/**
	 * @return the uiderrorresponsedist
	 */
	private org.apache.commons.math3.distribution.UniformIntegerDistribution getUiderrorresponsedist() {
		return this.uniformintegerdistribution_errorresponsedist;
	}

	private int randomizecumulativeoperation() {
		Random random = new Random();
		return random.nextInt(3);
	}

	// Skewness defined as
	// skewness = [n / (n -1) (n - 2)] sum[(x_i - mean)^3] / std^3
	// To be generated Randomly from caller
	public double returnprobabilitytointroducenoiseinresponsevariables(int number) {
		double chebyshevdist = 0;
		try {
			// 0 if x <= 0,
			// exp(-0.5 * ((ln(x) - m) / s)^2) / (s * sqrt(2 * pi) * x) otherwise.
			ChebyshevDistance chebydist = new ChebyshevDistance();
			double[] a = new double[2];
			a[0] = this.getUiderrorresponsedist().probability(number);
			a[1] = this.getLognormaldistribution_errorresponsedistribution().probability(number);
			double[] b = new double[2];
			b[0] = this.getUiderrorresponsedist().sample();
			b[1] = this.getLognormaldistribution_errorresponsedistribution().sample();
			chebyshevdist = chebydist.compute(a, b);
			switch (this.randomizecumulativeoperation()) {
			case 0:
				return (this.getUiderrorresponsedist().probability(number)
						+ (this.getLognormaldistribution_errorresponsedistribution().probability(number))
						+ chebyshevdist);
			case 1:
				return Math.abs(this.getUiderrorresponsedist().probability(number)
						- (this.getLognormaldistribution_errorresponsedistribution().probability(number))
						- chebyshevdist);
			case 2:
				if ((this.getUiderrorresponsedist().probability(number) > 0)
						&& (this.getLognormaldistribution_errorresponsedistribution().probability(number) > 0)) {
					return (this.getUiderrorresponsedist().probability(number)
							* (this.getLognormaldistribution_errorresponsedistribution().probability(number)
									* chebyshevdist));
				}
			case 3:
				if ((this.getUiderrorresponsedist().probability(number) > 0)
						&& (this.getLognormaldistribution_errorresponsedistribution().probability(number) > 0)) {
					return ((this.getUiderrorresponsedist().probability(number) + chebyshevdist)
							/ (this.getLognormaldistribution_errorresponsedistribution().probability(number)));
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chebyshevdist;
	}

	// To be generated Randomly from caller
	public double returnprobabilitytointroducenoiseinyearresponses(int number) {
		return (this.getUiderrorresponsedist().probability(number)
				+ (this.getLognormaldistribution_errorresponsedistribution().probability(number)));
	}

	/**
	 * @param lognormaldistribution_errorresponsedistribution the
	 *                                                        lognormaldistribution_errorresponsedistribution
	 *                                                        to set
	 */
	public void setLognormaldistribution_errorresponsedistribution(
			LogNormalDistribution lognormaldistribution_errorresponsedistribution) {
		this.lognormaldistribution_errorresponsedistribution = lognormaldistribution_errorresponsedistribution;
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
