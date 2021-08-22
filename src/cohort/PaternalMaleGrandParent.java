package cohort;

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
		try {
			this.setSexSimulatedResponse(1);
			this.setSimulatedDiseasePresenceAbsenceFamilyMembers(
					new simulatedDiseasePresenceAbsenceResponseForFamilyMembers(this.getSexSimulatedResponse()));
			this.getSimulatedDiseasePresenceAbsenceFamilyMembers()
					.simulateResponseVariablesForFamilyMembers(this.getSexSimulatedResponse());
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

}
