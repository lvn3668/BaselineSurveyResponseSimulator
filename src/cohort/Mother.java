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
 *
 */
public class Mother extends CohortUtilities {
	private static LocalDate earliestDOBMother;
	private static LocalDate latestDOBMother;

	/**
	 * @return the earliestDOBMother
	 */
	private static LocalDate getEarliestDOBMother() {
		try {
			return earliestDOBMother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return earliestDOBMother;
	}

	/**
	 * @return the latestDOBMother
	 */
	private static LocalDate getLatestDOBMother() {
		try {
			return latestDOBMother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return latestDOBMother;
	}

	/**
	 * @param earliestDOBMother the earliestDOBMother to set
	 */
	private static void setEarliestDOBMother(LocalDate earliestDOBMother) {
		try {
			Mother.earliestDOBMother = earliestDOBMother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param latestDOBMother the latestDOBMother to set
	 */
	private static void setLatestDOBMother(LocalDate latestDOBMother) {
		System.out.println("Latest dob mother " + latestDOBMother.toString());
		Mother.latestDOBMother = latestDOBMother;
	}

	private simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulatedDiseasePresenceAbsenceFamilyMembers;

	protected void simulateResponseVariablesForMother(VeteranCohort veteranCohort) 
	{

		try {
			this.setBirthDateSimulated(this.simulateDateOfBirth());
			this.simulateYearOfBirth(super.getUtilities().extractYearFromDate(veteranCohort.getBirthDateSimulated()));
			this.simulateYearOfDeath();
			this.setAliveSimulatedResponse(this.simulateAliveOrDead());
			this.setSimulatedDiseasePresenceAbsenceFamilyMembers(
					new simulatedDiseasePresenceAbsenceResponseForFamilyMembers(this.getSexSimulatedResponse()));
			this.getSimulatedDiseasePresenceAbsence().simulateResponseVariablesForFamilyMembers(this.getSexSimulatedResponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Mother(VeteranCohort veteranCohort) throws Exception {
		// TODO Auto-generated constructor stub
		// Set sex for mother to 2
		// 1 : Male ; 2 : Female assumption
		try {
			super.setUtilities(new Utilities());
			this.setSexSimulatedResponse(2);

			Mother.setEarliestDOBMother(LocalDate
					.of(super.getUtilities().extractYearFromDate(veteranCohort.getBirthDateSimulated()).getValue() - 40, 1, 1));
			Mother.setLatestDOBMother(LocalDate
					.of(super.getUtilities().extractYearFromDate(veteranCohort.getBirthDateSimulated()).getValue() - 20, 12, 31));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @return the simulatedDiseasePresenceAbsence
	 */
	public simulatedDiseasePresenceAbsenceResponseForFamilyMembers getSimulatedDiseasePresenceAbsence() {
		try {
			return this.simulatedDiseasePresenceAbsenceFamilyMembers;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.simulatedDiseasePresenceAbsenceFamilyMembers;
	}

	/**
	 * @param simulatedDiseasePresenceAbsence the simulatedDiseasePresenceAbsence to
	 *                                        set
	 */
	private void setSimulatedDiseasePresenceAbsenceFamilyMembers(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulatedDiseasePresenceAbsence) {
		try {
			this.simulatedDiseasePresenceAbsenceFamilyMembers = simulatedDiseasePresenceAbsence;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			return this.getBirthDateSimulated();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBirthDateSimulated();
	}
}

