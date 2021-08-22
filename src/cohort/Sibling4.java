package cohort;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import Utilities.Utilities;
import randomizer.UniformDistribution;
import simulatedDiseaseResponse.simulatedDiseasePresenceAbsenceResponseForFamilyMembers;

/**
 * @author Lalitha Viswanathan Affiliation MAVERIC / VABHS
 *
 */
public class Sibling4 extends Sibling {

	private static LocalDate earliestDOBSibling;
	private static LocalDate latestDOBSibling;
	private static final int maxToGenerateErrorVal = 4;
	// If Sibling 1-8 exists, etc.

	private static final int minToGenerateErrorVal = 2;

	/**
	 * @return the earliestDOBSibling
	 */
	private static LocalDate getEarliestDOBSibling() {
		return earliestDOBSibling;
	}

	/**
	 * @return the latestDOBSibling
	 */
	private static LocalDate getLatestDOBSibling() {
		return latestDOBSibling;
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
	 * @param earliestDOBSibling the earliestDOBSibling to set
	 */
	private static void setEarliestDOBSibling(LocalDate earliestDOBSibling) {
		Sibling4.earliestDOBSibling = earliestDOBSibling;
	}

	/**
	 * @param errorResponse the errorResponse to set
	 */
	private static void setErrorResponse(int errorResponse) {
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param latestDOBSibling the latestDOBSibling to set
	 */
	private static void setLatestDOBSibling(LocalDate latestDOBSibling) {
		Sibling4.latestDOBSibling = latestDOBSibling;
	}

	public Sibling4(VeteranCohort veteranCohort) throws Exception {
		// TODO Auto-generated constructor stub
		this.setUtilities(new Utilities());
		this.setUniformdistribution(
				new UniformDistribution(Sibling4.getMintogenerateerrorval(), Sibling4.getMaxtogenerateerrorval()));
		Sibling4.setErrorResponse(this.getUtilities().randBetween(Sibling4.getMintogenerateerrorval(),
				Sibling4.getMaxtogenerateerrorval()));
		// Assign gender to Sibling
		this.setSexSimulatedResponse(this.simulateSexValue());

		if (veteranCohort.getMultipleBirthsSimulatedResponse() == 1) {

			Sibling4.setEarliestDOBSibling(veteranCohort.getEarliestDOBForSimulation());
			Sibling4.setLatestDOBSibling(veteranCohort.getLatestDOBForSimulation());
		} else {
			Sibling4.setEarliestDOBSibling(LocalDate
					.of(this.getUtilities().extractYearFromDate(veteranCohort.getBirthDateSimulated()).getValue() - 10, 1, 1));
			Sibling4.setLatestDOBSibling(LocalDate.of(
					this.getUtilities().extractYearFromDate(veteranCohort.getBirthDateSimulated()).getValue() + 10, 12, 31));
		}

		this.setBirthDateSimulated(this.simulateDateOfBirth());
		this.simulateYearOfBirth(this.getUtilities().extractYearFromDate(this.getBirthDateSimulated()));
		this.simulateYearOfDeath();
		this.setSimulatedDiseasePresenceAbsenceFamilyMembers(
				new simulatedDiseasePresenceAbsenceResponseForFamilyMembers(this.getSexSimulatedResponse()));
	}

	@Override
	// Assumed alive
	public int simulateAliveOrDead() {
		// TODO Auto-generated method stub
		return super.simulateAliveOrDead();
	}

	public Date simulateDateOfBirth() {
		try {
			Date simulatedDOB = new Date(ThreadLocalRandom.current().nextLong(
					Date.from(Sibling4.getEarliestDOBSibling().atStartOfDay(ZoneId.systemDefault()).toInstant())
							.getTime(),
					Date.from(Sibling4.getLatestDOBSibling().atStartOfDay(ZoneId.systemDefault()).toInstant())
							.getTime()));
			this.setBirthDateSimulated(simulatedDOB);
			System.out.println("Sibling 4 DOB " + this.getBirthDateSimulated().toString());
			return this.getBirthDateSimulated();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBirthDateSimulated();
	}

	@Override
	public void simulateYearOfBirth(Year year) {
		// TODO Auto-generated method stub
		super.simulateYearOfBirth(year);
	}

	@Override
	// Year of death N/A
	public void simulateYearOfDeath() {
		// TODO Auto-generated method stub
		super.simulateYearOfDeath();
	}

}
