package cohort;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import Utilities.Utilities;
import cohortUtils.CohortUtilities;
import simulatedDiseaseResponse.simulatedDiseasePresenceAbsenceResponseForFamilyMembers;

/**
 * @author Lalitha Viswanathan
 * Affiliation MAVERIC / VABHS
 *
 */
/**
 * @author visu4
 *
 */
public class Mother extends CohortUtilities {
	private static LocalDate earliestDOBMother;
	private static LocalDate latestDOBMother;

	/**
	 * @return the earliestDOBMother
	 */
	private static LocalDate getEarliestDOBMother() {
		return earliestDOBMother;
	}

	/**
	 * @return the latestDOBMother
	 */
	private static LocalDate getLatestDOBMother() {
		return latestDOBMother;
	}

	/**
	 * @param earliestDOBMother the earliestDOBMother to set
	 */
	private static void setEarliestDOBMother(LocalDate earliestDOBMother) {
		Mother.earliestDOBMother = earliestDOBMother;
	}

	/**
	 * @param latestDOBMother the latestDOBMother to set
	 */
	private static void setLatestDOBMother(LocalDate latestDOBMother) {
		System.out.println("Latest dob mother " + latestDOBMother.toString());
		Mother.latestDOBMother = latestDOBMother;
	}

	private simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulatedDiseasePresenceAbsenceFamilyMembers;

	public Mother(Cohort cohort) throws Exception {
		// TODO Auto-generated constructor stub
		// Set sex for mother to 2
		// 1 : Male ; 2 : Female assumption
		super.setUtilities(new Utilities());
		System.out.println("Cohort DOB inside Mother class is " + cohort.getBirthDateSimulated().toString());
		this.setSexSimulatedResponse(2);

		Mother.setEarliestDOBMother(LocalDate
				.of(super.getUtilities().extractYearFromDate(cohort.getBirthDateSimulated()).getValue() - 40, 1, 1));
		Mother.setLatestDOBMother(LocalDate
				.of(super.getUtilities().extractYearFromDate(cohort.getBirthDateSimulated()).getValue() - 20, 12, 31));

		this.setBirthDateSimulated(this.simulateDateOfBirth());

		this.simulateYearOfBirth(super.getUtilities().extractYearFromDate(cohort.getBirthDateSimulated()));
		this.simulateYearOfDeath();
		this.setAliveSimulatedResponse(this.simulateAliveOrDead());
		this.setSimulatedDiseasePresenceAbsenceFamilyMembers(
				new simulatedDiseasePresenceAbsenceResponseForFamilyMembers(this.getSexSimulatedResponse()));
	}

	/**
	 * @return the simulatedDiseasePresenceAbsence
	 */
	public simulatedDiseasePresenceAbsenceResponseForFamilyMembers getSimulatedDiseasePresenceAbsence() {
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

	private Date simulateDateOfBirth() {
		try {
			Date simulatedDOB = new Date(ThreadLocalRandom.current().nextLong(
					Date.from(Mother.getEarliestDOBMother().atStartOfDay(ZoneId.systemDefault()).toInstant()).getTime(),
					Date.from(Mother.getLatestDOBMother().atStartOfDay(ZoneId.systemDefault()).toInstant()).getTime()));
			this.setBirthDateSimulated(simulatedDOB);
			System.out.println("Simulated DOB Mother" + simulatedDOB);

			return this.getBirthDateSimulated();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBirthDateSimulated();
	}
}

// BIO Daughter BIO SON DOB not captured (only presence / absence captured
