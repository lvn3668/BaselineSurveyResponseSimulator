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
		try {
			return earliestDOBFather;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return earliestDOBFather;
	}

	/**
	 * @return the latestDOBFather
	 */
	private static LocalDate getLatestDOBFather() {
		try {
			return latestDOBFather;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return latestDOBFather;
	}

	/**
	 * @param earliestDOBFather the earliestDOBFather to set
	 */
	private static void setEarliestDOBFather(LocalDate earliestDOBFather) {
		try {
			Father.earliestDOBFather = earliestDOBFather;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param latestDOBFather the latestDOBFather to set
	 */
	private static void setLatestDOBFather(LocalDate latestDOBFather) {
		try {
			Father.latestDOBFather = latestDOBFather;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulatedDiseasePresenceAbsenceFamilyMembers;

	public Father(VeteranCohort veteranCohort) throws Exception {
		// TODO Auto-generated constructor stub

		try {
			super.setUtilities(new Utilities());
			this.setSexSimulatedResponse(1);
			Father.setEarliestDOBFather(LocalDate.of(
					this.getUtilities().extractYearFromDate(veteranCohort.getBirthDateSimulated()).getValue() - 40, 1,
					1));
			Father.setLatestDOBFather(LocalDate.of(
					this.getUtilities().extractYearFromDate(veteranCohort.getBirthDateSimulated()).getValue() - 20, 12,
					31));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @return the simulatedDiseasePresenceAbsence
	 */
	public simulatedDiseasePresenceAbsenceResponseForFamilyMembers getSimulatedDiseasePresenceAbsenceFamilyMembers() {
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

	public Date simulateDateOfBirth() {
		try {
			Date simulatedDOB = new Date(ThreadLocalRandom.current().nextLong(
					Date.from(Father.getEarliestDOBFather().atStartOfDay(ZoneId.systemDefault()).toInstant()).getTime(),
					Date.from(Father.getLatestDOBFather().atStartOfDay(ZoneId.systemDefault()).toInstant()).getTime()));
			this.setBirthDateSimulated(simulatedDOB);
			return this.getBirthDateSimulated();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBirthDateSimulated();
	}

	protected void simulateResponseVariablesForFather(VeteranCohort veteranCohort) {
		try {
			this.setBirthDateSimulated(this.simulateDateOfBirth());
			// System.out.println("Father DOB is " +
			// this.getBirthDateSimulated().toString());
			this.simulateYearOfBirth(super.getUtilities().extractYearFromDate(veteranCohort.getBirthDateSimulated()));
			this.simulateYearOfDeath();
			this.setAliveSimulatedResponse(this.simulateAliveOrDead());
			this.setSimulatedDiseasePresenceAbsenceFamilyMembers(
					new simulatedDiseasePresenceAbsenceResponseForFamilyMembers(this.getSexSimulatedResponse()));
			this.getSimulatedDiseasePresenceAbsenceFamilyMembers()
					.simulateResponseVariablesForFamilyMembers(this.getSexSimulatedResponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
