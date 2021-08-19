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
public class MaternalFemaleGrandParent extends CohortUtilities {
	private simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulatedDiseasePresenceAbsenceFamilyMembers;

	// KidneyNoDialysis maternalGrandParentKdDisease;
	public MaternalFemaleGrandParent() throws Exception {
		// TODO Auto-generated constructor stub
		// maternalGrandParentKdDisease = new
		this.setSexSimulatedResponse(2);
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
