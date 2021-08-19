package cohort;

import java.time.Year;

import Diseases.BreastCancer;
import cohortUtils.CohortUtilities;
import simulatedDiseaseResponse.simulatedDiseasePresenceAbsenceResponseForFamilyMembers;

// Move to SimulatedDiseaseResponse class
/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class PaternalMaleGrandParent extends CohortUtilities {
	// Only presence / absence is recorded
	// Not year diagnosed or whether meds administered

	private simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulatedDiseasePresenceAbsenceFamilyMembers;

	// KidneyNoDialysis maternalGrandParentKdDisease;
	public PaternalMaleGrandParent() throws Exception {
		this.setSexSimulatedResponse(1);
		this.setSimulatedDiseasePresenceAbsenceFamilyMembers(new simulatedDiseasePresenceAbsenceResponseForFamilyMembers(this.getSexSimulatedResponse()));

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

}
