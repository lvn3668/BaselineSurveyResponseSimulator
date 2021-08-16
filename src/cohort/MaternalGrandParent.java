package cohort;

import java.time.Year;

import Diseases.BreastCancer;

// Move to SimulatedDiseaseResponse class
/**
 * @author Lalitha Viswanathan
 * Affiliation VABHS / MAVERIC 
 *
 */
public class MaternalGrandParent extends Cohort {
	// Only presence / absence is recorded
	// Not year diagnosed or whether meds administered
	private BreastCancer maternalGrandParentCaBrst;

	// KidneyNoDialysis maternalGrandParentKdDisease;
	public MaternalGrandParent(Cohort cohort) throws Exception {
		// TODO Auto-generated constructor stub
		this.setMaternalGrandParentCaBrst(new BreastCancer(cohort));
		// maternalGrandParentKdDisease = new
	}

	/**
	 * @return the maternalGrandParentCaBrst
	 */
	public BreastCancer getMaternalGrandParentCaBrst() {
		return this.maternalGrandParentCaBrst;
	}

	/**
	 * @param maternalGrandParentCaBrst the maternalGrandParentCaBrst to set
	 */
	public void setMaternalGrandParentCaBrst(BreastCancer maternalGrandParentCaBrst) {
		this.maternalGrandParentCaBrst = maternalGrandParentCaBrst;
	}

	@Override
	public int simulateAliveOrDead() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Year simulateYearOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Year simulateYearOfDeath() {
		// TODO Auto-generated method stub
		return null;
	}

}
