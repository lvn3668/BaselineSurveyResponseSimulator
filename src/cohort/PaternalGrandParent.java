package cohort;

import java.time.Year;

import Diseases.BreastCancer;

// Move to SimulatedDiseaseResponse class 
/**
 * @author Lalitha Viswanathan
 * Affiliation VABHS / MAVERIC 
 *
 */
public class PaternalGrandParent extends Cohort{
	// Only presence / absence is recorded
	// Not year diagnosed or whether meds administered
	BreastCancer paternalGrandParentCaBrst;
	//KidneyNoDialysis maternalGrandParentKdDisease;
	public PaternalGrandParent(Cohort cohort) throws Exception {
		// TODO Auto-generated constructor stub
		paternalGrandParentCaBrst =  new BreastCancer(cohort);
		//maternalGrandParentKdDisease = new 
	}
	@Override
	public Year simulateYearOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int simulateAliveOrDead() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Year simulateYearOfDeath() {
		// TODO Auto-generated method stub
		return null;
	}

}
