package cohort;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import Utilities.Utilities;
import cohortUtils.CohortUtilities;
import simulatedDiseaseResponse.simulatedDiseasePresenceAbsenceResponseForFamilyMembers;

/**
 * @author Lalitha Viswanathan Affiliation MAVERIC / VABHS
 *
 */
public class Father extends CohortUtilities {
	// Only presence / absence is recorded
	// Not year diagnosed or whether meds administered

	private static LocalDate earliestDOBFather;
	private static LocalDate latestDOBFather;

	/**
	 * @return the earliestDOBFather
	 */
	private static LocalDate getEarliestDOBFather() {
		return earliestDOBFather;
	}

	/**
	 * @return the latestDOBFather
	 */
	private static LocalDate getLatestDOBFather() {
		return latestDOBFather;
	}

	/**
	 * @param earliestDOBFather the earliestDOBFather to set
	 */
	private static void setEarliestDOBFather(LocalDate earliestDOBFather) {
		Father.earliestDOBFather = earliestDOBFather;
	}

	/**
	 * @param latestDOBFather the latestDOBFather to set
	 */
	private static void setLatestDOBFather(LocalDate latestDOBFather) {
		Father.latestDOBFather = latestDOBFather;
	}

	private simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulatedDiseasePresenceAbsenceFamilyMembers;

	public Father(Cohort cohort) throws Exception {
		// TODO Auto-generated constructor stub

		super.setUtilities(new Utilities());
		System.out.println("Cohort DOB inside Father class is " + cohort.getBirthDateSimulated().toString());

		this.setSexSimulatedResponse(1);
		Father.setEarliestDOBFather(LocalDate
				.of(this.getUtilities().extractYearFromDate(cohort.getBirthDateSimulated()).getValue() - 40, 1, 1));
		Father.setLatestDOBFather(LocalDate
				.of(this.getUtilities().extractYearFromDate(cohort.getBirthDateSimulated()).getValue() - 20, 12, 31));
		this.setBirthDateSimulated(this.simulateDateOfBirth());
		System.out.println("Father DOB is " + this.getBirthDateSimulated().toString());
		this.simulateYearOfBirth(super.getUtilities().extractYearFromDate(cohort.getBirthDateSimulated()));
		this.simulateYearOfDeath();
		this.setAliveSimulatedResponse(this.simulateAliveOrDead());
		this.setSimulatedDiseasePresenceAbsenceFamilyMembers(
				new simulatedDiseasePresenceAbsenceResponseForFamilyMembers(this.getSexSimulatedResponse()));

	}

	/**
	 * @return the simulatedDiseasePresenceAbsence
	 */
	public simulatedDiseasePresenceAbsenceResponseForFamilyMembers getSimulatedDiseasePresenceAbsenceFamilyMembers() {
		return this.simulatedDiseasePresenceAbsenceFamilyMembers;
	}

	/**
	 * @param simulatedDiseasePresenceAbsence the simulatedDiseasePresenceAbsence to
	 *                                        set
	 */
	private void setSimulatedDiseasePresenceAbsenceFamilyMembers(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulatedDiseasePresenceAbsence) {
		this.simulatedDiseasePresenceAbsenceFamilyMembers = simulatedDiseasePresenceAbsence;
	}

	/**
	 * MomBrthYr,Year MomLive,"{0,1}" MomDthYr,Year TBD
	 */

	public Date simulateDateOfBirth() {
		try {
			Date simulatedDOB = new Date(ThreadLocalRandom.current().nextLong(
					Date.from(Father.getEarliestDOBFather().atStartOfDay(ZoneId.systemDefault()).toInstant()).getTime(),
					Date.from(Father.getLatestDOBFather().atStartOfDay(ZoneId.systemDefault()).toInstant()).getTime()));
			this.setBirthDateSimulated(simulatedDOB);
			System.out.println("Simulated DOB Father" + simulatedDOB);

			return this.getBirthDateSimulated();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBirthDateSimulated();
	}

	/**
	 * DadBrthYr,Year DadLive,"{0,1}" DadDthYr,Year
	 **/

	//
}
