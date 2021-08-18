package cohort;

import java.time.Instant;
import java.time.Year;
import java.time.temporal.ValueRange;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import Utilities.Utilities;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan
 * Affiliation MAVERIC / VABHS 
 *
 */
public class Sibling5 extends Sibling {

	private static final Date earliestDOB = new Date("1-1-1940");
	private static int errorResponse;
	private static final Date latestDOB = new Date("12-31-1970");
	private static final int maxToGenerateErrorVal = 4;
	// If Sibling 1-8 exists, etc.

	private static final int minToGenerateErrorVal = 2;

	/**
	 * @return the earliestdob
	 */
	public static Date getEarliestdob() {
		return earliestDOB;
	}

	/**
	 * @return the errorResponse
	 */
	private static int getErrorResponse() {
		return errorResponse;
	}

	/**
	 * @return the latestdob
	 */
	public static Date getLatestdob() {
		return latestDOB;
	}

	/**
	 * @return the maxtogenerateerrorval
	 */
	private static int getMaxtogenerateerrorval() {
		return maxToGenerateErrorVal;
	}

	/**
	 * @return the mintogenerateerrorval
	 */
	private static int getMintogenerateerrorval() {
		return minToGenerateErrorVal;
	}

	/**
	 * @param errorResponse the errorResponse to set
	 */
	private static void setErrorResponse(int errorResponse) {
		try {
			Sibling5.errorResponse = errorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int siblingexistssimulatedresponse;
	private ValueRange siblingexistsValueRange = ValueRange.of(1, 2);

	public Sibling5(Cohort cohort) throws Exception {
		// TODO Auto-generated constructor stub
		this.setUtilities(new Utilities());
		this.setUniformdistribution(
				new UniformDistribution(Sibling5.getMintogenerateerrorval(), Sibling5.getMaxtogenerateerrorval()));
		this.setSiblingexistsValueRange(ValueRange.of(1, 2));
		Sibling5.setErrorResponse(this.getUtilities().randBetween(Sibling5.getMintogenerateerrorval(),
				Sibling5.getMaxtogenerateerrorval()));
		this.setSiblingexistssimulatedresponse(Sibling5.getErrorResponse());
	}

	/**
	 * @return the siblingexistssimulatedresponse
	 */
	public int getSiblingexistssimulatedresponse() {
		return this.siblingexistssimulatedresponse;
	}

	/**
	 * @return the siblingexistsValueRange
	 */
	public ValueRange getSiblingexistsValueRange() {
		return this.siblingexistsValueRange;
	}

	/**
	 * @param siblingexistssimulatedresponse the siblingexistssimulatedresponse to
	 *                                       set
	 */
	public void setSiblingexistssimulatedresponse(int siblingexistssimulatedresponse) {
		this.siblingexistssimulatedresponse = siblingexistssimulatedresponse;
	}

	/**
	 * @param siblingexistsValueRange the siblingexistsValueRange to set
	 */
	public void setSiblingexistsValueRange(ValueRange siblingexistsValueRange) {
		this.siblingexistsValueRange = siblingexistsValueRange;
	}

	@Override
	// Assumed alive
	public int simulateAliveOrDead() {
		// TODO Auto-generated method stub
		try {
			this.setSiblingexistssimulatedresponse(1);
			return this.getSiblingexistssimulatedresponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getSiblingexistssimulatedresponse();
	}

	public Date simulateDateOfBirth() {
		try {
			Date simulatedDOB = Date.from(Instant.ofEpochSecond(ThreadLocalRandom.current()
					.nextLong(Sibling5.getEarliestdob().getTime(), Sibling5.getLatestdob().getTime())));
			this.setBirthDateSimulated(simulatedDOB);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(simulatedDOB);
			this.setBirthyear(Year.parse(new StringBuilder(calendar.get(Calendar.YEAR))));
			return this.getBirthDateSimulated();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBirthDateSimulated();
	}

	@Override
	public Year simulateYearOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// Year of death N/A
	public Year simulateYearOfDeath() {
		// TODO Auto-generated method stub
		return null;
	}

}