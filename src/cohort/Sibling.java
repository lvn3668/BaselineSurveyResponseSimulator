package cohort;

import java.time.Year;

import cohortUtils.CohortUtilities;
import simulatedDiseaseResponse.simulatedDiseasePresenceAbsenceResponseForFamilyMembers;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
/**
 * @author visu4
 *
 */
public class Sibling extends CohortUtilities {

	// If Sibling 1-8 exists, etc.

	/**
	 *
	 */
	private Sibling1 sibling1;

	/**
	 *
	 */
	private Sibling2 sibling2;
	/**
	 *
	 */
	private Sibling3 sibling3;

	/**
	 *
	 */
	private Sibling4 sibling4;

	/**
	 *
	 */
	private Sibling5 sibling5;

	/**
	 *
	 */
	private Sibling6 sibling6;

	/**
	 *
	 */
	private Sibling7 sibling7;
	/**
	 *
	 */
	private Sibling8 sibling8;

	private int siblingAlzheimerspresenceabsencesimulatedresponse;

	private int siblingAsthmapresenceabsencesimulatedresponse;

	private int siblingBipolarpresenceabsencesimulatedresponse;
	private int siblingBreastCancerpresenceabsencesimulatedresponse;

	private int siblingCholesterolpresenceabsencesimulatedresponse;
	private int siblingColonCancerpresenceabsencesimulatedresponse;
	private int siblingCoronaryarterydiseasepresenceabsencesimulatedresponse;
	private int siblingDepressionpresenceabsencesimulatedresponse;
	private int siblingDiabetespresenceabsencesimulatedresponse;
	private int siblingKidneynodialysispresenceabsencesimulatedresponse;
	private int siblingLiverdiseasepresenceabsencesimulatedresponse;
	private int siblingLungcancerpresenceabsencesimulatedresponse;
	private int siblingLungdiseasepresenceabsencesimulatedresponse;
	private int siblingOthercancerpresenceabsencesimulatedresponse;
	private int siblingProstatecancerpresenceabsencesimulatedresponse;

	private int siblingSkincancerpresenceabsencesimulatedresponse;
	private int siblingStrokepresenceabsencesimulatedresponse;
	private simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulatedDiseasePresenceAbsenceFamilyMembers;

	public Sibling() throws Exception {
		// TODO Auto-generated constructor stub
		super();
		try {

			// If Sibling class is created, sibling is assumed to exist
			this.setAliveSimulatedResponse(this.simulateAliveOrDead());
			this.simulateYearOfDeath();
			this.setSibling1(null);
			this.setSibling2(null);
			this.setSibling3(null);
			this.setSibling4(null);
			this.setSibling5(null);
			this.setSibling6(null);
			this.setSibling7(null);
			this.setSibling8(null);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void printDiseasePresenceInSiblings()
	{
		try {
			System.out.println("Sibling(1..n) Alzheimers " + this.getSiblingAlzheimerspresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Asthma " + this.getSiblingAsthmapresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Bipolar " + this.getSiblingBipolarpresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Brst Cancer " +this.getSiblingBreastCancerpresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Cholesterol " + this.getSiblingCholesterolpresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Coloncancer " +this.getSiblingColonCancerpresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) CAD " +this.getSiblingCoronaryarterydiseasepresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Depression " + this.getSiblingDepressionpresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Diabetes " +this.getSiblingDiabetespresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Kidney disease no dialysis " +this.getSiblingKidneynodialysispresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Liver disease " +this.getSiblingLiverdiseasepresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Lung cancer " + this.getSiblingLungcancerpresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Lung disease " +this.getSiblingLungdiseasepresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Other cancer " +this.getSiblingOthercancerpresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Prostate cancer " +this.getSiblingProstatecancerpresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Skin cancer " +this.getSiblingSkincancerpresenceabsencesimulatedresponse());
			System.out.println("Sibling(1..n) Stroke " +this.getSiblingStrokepresenceabsencesimulatedresponse());
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void checkForDiseasePresenceAbsenceInSiblings(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... simulateddiseaseresponsesiblings) {
		try {
			this.setSiblingAlzheimerspresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingAsthmapresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingBipolarpresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingBreastcancerpresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingCholesterolpresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingColoncancerpresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingCoronaryArteryDiseasepresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingDepressionpresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingDiabetespresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingHypertensionpresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingKidneynodialysispresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingLiverdiseasepresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingLungcancerpresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingLungdiseasepresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingOthercancerpresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingProstatecancerpresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingSkincancerpresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			this.setSiblingStrokepresenceabsencesimulatedresponse(simulateddiseaseresponsesiblings);
			/*
			 * switch (this.getNumberOfBiologicalBrothersSimulatedResponse()+this.
			 * getNumberOfBiologicalSistersSimulatedResponse()) { case 1:
			 * this.setSiblingAlzheimerspresenceabsencesimulatedresponse(this.getSibling1().
			 * getSimulatedDiseasePresenceAbsenceFamilyMembers()); break; case 2:
			 * this.setSiblingAlzheimerspresenceabsencesimulatedresponse(this.getSibling1().
			 * getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers()); break;
			 * case 3:
			 * this.setSiblingAlzheimerspresenceabsencesimulatedresponse(this.getSibling1().
			 * getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers()); break;
			 * case 4:
			 * this.setSiblingAlzheimerspresenceabsencesimulatedresponse(this.getSibling1().
			 * getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers()); break;
			 * case 5:
			 * this.setSiblingAlzheimerspresenceabsencesimulatedresponse(this.getSibling1().
			 * getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers()); break;
			 * case 6:
			 * this.setSiblingAlzheimerspresenceabsencesimulatedresponse(this.getSibling1().
			 * getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers()); break;
			 * case 7:
			 * this.setSiblingAlzheimerspresenceabsencesimulatedresponse(this.getSibling1().
			 * getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers()); break;
			 * case 8:
			 * this.setSiblingAlzheimerspresenceabsencesimulatedresponse(this.getSibling1().
			 * getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers()
			 * ,this.getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers()); break;
			 * default:
			 * this.setSiblingAlzheimerspresenceabsencesimulatedresponse(this.getSibling1().
			 * getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers()
			 * ,this.getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
			 * this.getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers()); break;
			 *
			 * }
			 */

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the sibling1
	 */
	/**
	 * @return
	 */
	public Sibling1 getSibling1() {
		try {
			return this.sibling1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sibling1;

	}

	/**
	 * @return the sibling2
	 */
	/**
	 * @return
	 */
	public Sibling2 getSibling2() {
		try {
			return this.sibling2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sibling2;

	}

	/**
	 * @return the sibling3
	 */
	/**
	 * @return
	 */
	public Sibling3 getSibling3() {
		try {
			return this.sibling3;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sibling3;

	}

	/**
	 * @return the sibling4
	 */
	/**
	 * @return
	 */
	public Sibling4 getSibling4() {
		try {
			return this.sibling4;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sibling4;

	}

	/**
	 * @return the sibling5
	 */
	/**
	 * @return
	 */
	public Sibling5 getSibling5() {
		try {
			return this.sibling5;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sibling5;
	}

	/**
	 * @return the sibling6
	 */
	/**
	 * @return
	 */
	public Sibling6 getSibling6() {
		try {
			return this.sibling6;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sibling6;
	}

	/**
	 * @return the sibling7
	 */
	/**
	 * @return
	 */
	public Sibling7 getSibling7() {
		try {
			return this.sibling7;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sibling7;
	}

	/**
	 * @return the sibling8
	 */
	/**
	 * @return
	 */
	public Sibling8 getSibling8() {
		try {
			return this.sibling8;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sibling8;
	}

	/**
	 * @return the siblingAlzheimerspresenceabsencesimulatedresponse
	 */
	public int getSiblingAlzheimerspresenceabsencesimulatedresponse() {
		return this.siblingAlzheimerspresenceabsencesimulatedresponse;
	}

	/**
	 * @return the simulatedDiseasePresenceAbsence
	 */
	public simulatedDiseasePresenceAbsenceResponseForFamilyMembers getSimulatedDiseasePresenceAbsenceFamilyMembers() {
		return this.simulatedDiseasePresenceAbsenceFamilyMembers;
	}

	public void printSiblingDetails(Sibling... siblingslist) {
		try {
			int counter = 1;
			for (Sibling sibling : siblingslist) {
				System.out.println("Sibling " + counter + " Sex " + sibling.getSexSimulatedResponse());
				System.out.println("Sibling " + counter + " Year of Birth " + sibling.getYearOfBirth());
				System.out.println("Sibling " + counter + "Alive " + sibling.getAliveSimulatedResponse());
				System.out.println("Sibling " + counter + "Year of death " + sibling.getYearOfDeath());
				counter++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sibling1 the sibling1 to set
	 */
	/**
	 * @param sibling1
	 */
	public void setSibling1(Sibling1 sibling1) {
		try {
			this.sibling1 = sibling1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sibling2 the sibling2 to set
	 */
	/**
	 * @param sibling2
	 */
	public void setSibling2(Sibling2 sibling2) {
		try {
			this.sibling2 = sibling2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sibling3 the sibling3 to set
	 */
	/**
	 * @param sibling3
	 */
	public void setSibling3(Sibling3 sibling3) {
		try {
			this.sibling3 = sibling3;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sibling4 the sibling4 to set
	 */
	/**
	 * @param sibling4
	 */
	public void setSibling4(Sibling4 sibling4) {
		try {
			this.sibling4 = sibling4;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sibling5 the sibling5 to set
	 */
	/**
	 * @param sibling5
	 */
	public void setSibling5(Sibling5 sibling5) {
		try {
			this.sibling5 = sibling5;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sibling6 the sibling6 to set
	 */
	/**
	 * @param sibling6
	 */
	public void setSibling6(Sibling6 sibling6) {
		try {
			this.sibling6 = sibling6;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sibling7 the sibling7 to set
	 */
	/**
	 * @param sibling7
	 */
	public void setSibling7(Sibling7 sibling7) {
		try {
			this.sibling7 = sibling7;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sibling8 the sibling8 to set
	 */
	/**
	 * @param sibling8
	 */
	public void setSibling8(Sibling8 sibling8) {
		try {
			this.sibling8 = sibling8;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setSiblingAlzheimerspresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingAlzheimerspresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasAlzheimers(siblingsdiseasepresenceabsence);
	}

	private void setSiblingAsthmapresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingAsthmapresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasAsthma(siblingsdiseasepresenceabsence);
	}

	private void setSiblingBipolarpresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingBipolarpresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasBipolar(siblingsdiseasepresenceabsence);
	}

	private void setSiblingBreastcancerpresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingBreastCancerpresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasBreastCancer(siblingsdiseasepresenceabsence);
	}

	private void setSiblingCholesterolpresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingCholesterolpresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasCholesterol(siblingsdiseasepresenceabsence);
	}

	private void setSiblingColoncancerpresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingColonCancerpresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasColonCancer(siblingsdiseasepresenceabsence);
	}

	private void setSiblingCoronaryArteryDiseasepresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingCoronaryarterydiseasepresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasCoronaryArteryDisease(siblingsdiseasepresenceabsence);
	}

	private void setSiblingDepressionpresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingDepressionpresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasDepression(siblingsdiseasepresenceabsence);
	}

	private void setSiblingDiabetespresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingDiabetespresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasDiabetes(siblingsdiseasepresenceabsence);
	}

	/**
	 * @param siblingHypertensionpresenceabsencesimulatedresponse the
	 *                                                            siblingHypertensionpresenceabsencesimulatedresponse
	 *                                                            to set
	 */
	private void setSiblingHypertensionpresenceabsencesimulatedresponse(
			int siblingHypertensionpresenceabsencesimulatedresponse) {
	}

	private void setSiblingHypertensionpresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.setSiblingHypertensionpresenceabsencesimulatedresponse(
				this.getUtilities().checkIfSiblingHasHypertension(siblingsdiseasepresenceabsence));
	}

	private void setSiblingKidneynodialysispresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingKidneynodialysispresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasKidneynodialysis(siblingsdiseasepresenceabsence);
	}

	private void setSiblingLiverdiseasepresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingLiverdiseasepresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasLiverdisease(siblingsdiseasepresenceabsence);
	}

	private void setSiblingLungcancerpresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingLungcancerpresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasLungcancer(siblingsdiseasepresenceabsence);
	}

	private void setSiblingLungdiseasepresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingLungdiseasepresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasLungdisease(siblingsdiseasepresenceabsence);
	}

	private void setSiblingOthercancerpresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingOthercancerpresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasOthercancer(siblingsdiseasepresenceabsence);
	}

	private void setSiblingProstatecancerpresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingProstatecancerpresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasProstatecancer(siblingsdiseasepresenceabsence);
	}

	private void setSiblingSkincancerpresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingSkincancerpresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasSkincancer(siblingsdiseasepresenceabsence);
	}

	private void setSiblingStrokepresenceabsencesimulatedresponse(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingsdiseasepresenceabsence) {
		this.siblingStrokepresenceabsencesimulatedresponse = this.getUtilities()
				.checkIfSiblingHasStroke(siblingsdiseasepresenceabsence);
	}

	/**
	 * @param simulatedDiseasePresenceAbsence the simulatedDiseasePresenceAbsence to
	 *                                        set
	 */
	protected void setSimulatedDiseasePresenceAbsenceFamilyMembers(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulatedDiseasePresenceAbsence) {
		this.simulatedDiseasePresenceAbsenceFamilyMembers = simulatedDiseasePresenceAbsence;
	}

	@Override
	public int simulateAliveOrDead() {
		// TODO Auto-generated method stub
		return super.simulateAliveOrDead();
	}

	@Override
	public void simulateYearOfBirth(Year year) {

		try {
			this.setYearOfBirth(year);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Year of death N/A
	public void simulateYearOfDeath() {
		// TODO Auto-generated method stub
		super.simulateYearOfDeath();
	}

	/**
	 * @return the siblingAsthmapresenceabsencesimulatedresponse
	 */
	private int getSiblingAsthmapresenceabsencesimulatedresponse() {
		return siblingAsthmapresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingBipolarpresenceabsencesimulatedresponse
	 */
	private int getSiblingBipolarpresenceabsencesimulatedresponse() {
		return siblingBipolarpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingBreastCancerpresenceabsencesimulatedresponse
	 */
	private int getSiblingBreastCancerpresenceabsencesimulatedresponse() {
		return siblingBreastCancerpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingCholesterolpresenceabsencesimulatedresponse
	 */
	private int getSiblingCholesterolpresenceabsencesimulatedresponse() {
		return siblingCholesterolpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingColonCancerpresenceabsencesimulatedresponse
	 */
	private int getSiblingColonCancerpresenceabsencesimulatedresponse() {
		return siblingColonCancerpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingCoronaryarterydiseasepresenceabsencesimulatedresponse
	 */
	private int getSiblingCoronaryarterydiseasepresenceabsencesimulatedresponse() {
		return siblingCoronaryarterydiseasepresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingDepressionpresenceabsencesimulatedresponse
	 */
	private int getSiblingDepressionpresenceabsencesimulatedresponse() {
		return siblingDepressionpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingDiabetespresenceabsencesimulatedresponse
	 */
	private int getSiblingDiabetespresenceabsencesimulatedresponse() {
		return siblingDiabetespresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingKidneynodialysispresenceabsencesimulatedresponse
	 */
	private int getSiblingKidneynodialysispresenceabsencesimulatedresponse() {
		return siblingKidneynodialysispresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingLiverdiseasepresenceabsencesimulatedresponse
	 */
	private int getSiblingLiverdiseasepresenceabsencesimulatedresponse() {
		return siblingLiverdiseasepresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingLungcancerpresenceabsencesimulatedresponse
	 */
	private int getSiblingLungcancerpresenceabsencesimulatedresponse() {
		return siblingLungcancerpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingLungdiseasepresenceabsencesimulatedresponse
	 */
	private int getSiblingLungdiseasepresenceabsencesimulatedresponse() {
		return siblingLungdiseasepresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingOthercancerpresenceabsencesimulatedresponse
	 */
	private int getSiblingOthercancerpresenceabsencesimulatedresponse() {
		return siblingOthercancerpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingProstatecancerpresenceabsencesimulatedresponse
	 */
	private int getSiblingProstatecancerpresenceabsencesimulatedresponse() {
		return siblingProstatecancerpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingSkincancerpresenceabsencesimulatedresponse
	 */
	private int getSiblingSkincancerpresenceabsencesimulatedresponse() {
		return siblingSkincancerpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the siblingStrokepresenceabsencesimulatedresponse
	 */
	private int getSiblingStrokepresenceabsencesimulatedresponse() {
		return siblingStrokepresenceabsencesimulatedresponse;
	}

}
