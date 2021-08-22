package cohort;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ValueRange;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import Utilities.Utilities;
import cohortUtils.CohortUtilities;
import simulatedDiseaseResponse.SimulatedDiseaseResponse;
import simulatedResponseAncestry.SimulatedResponseAncestry;
import simulatedResponseChemicalExposure.SimulatedResponseChemicalExposure;
import simulatedResponseLifeStyleResponseVars.SimulatedResponseForLifestyleQ;
import simulatedResponseMilitaryDuty.SimulatedResponseMilitaryDuty;
import simulatedResponseQ1_15.SimulatedResponseQ1_15;
import simulatedResponseRace.SimulatedResponseRace;
import simulatedResponseVAUseVars.SimulatedResponseVAUseVars;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */

public class VeteranCohort extends CohortUtilities {

	private static int maximumNumberSiblings = 8;
	private static int minimumNumberSiblings = 1;

	/**
	 * @return the maximumNumberSiblings
	 */
	public static int getMaximumNumberSiblings() {
		return maximumNumberSiblings;
	}

	/**
	 * @return the minimumNumberSiblings
	 */
	private static int getMinimumNumberSiblings() {
		return minimumNumberSiblings;
	}

	/**
	 *
	 */
	private int adoptedSimulatedResponse;
	/**
	 *
	 */
	private ValueRange adoptedValueRange;
	/**
	 *
	 */
	private SimulatedResponseAncestry ancestrysimulatedresponse;

	/**
	 *
	 */
	private ValueRange biologicalBrotherPresenceAbsenceValueRange;
	/**
	 *
	 */
	private int biologicalBrothersPresenceAbsencesimulatedresponse;

	/**
	 *
	 */
	private int biologicalDaughtersPresenceAbsenceSimulatedResponse;
	/**
	 *
	 */
	private ValueRange biologicalDaughtersPresenceAbsenceValueRange;
	/**
	 *
	 */
	private ValueRange biologicalSistersPresenceOrAbsenceValueRange;
	/**
	 *
	 */
	private int biologicalSonsPresenceAbsenceSimulatedResponse;

	/**
	 *
	 */
	private ValueRange biologicalSonsPresenceAbsenceValueRange;
	/**
	 *
	 */
	private SimulatedResponseChemicalExposure chemicalexposuresimulatedresponse;
	// call each simulatedresponse individually
	/**
	 *
	 */
	private SimulatedDiseaseResponse diseassessimulatedresponse;

	protected LocalDate earliestDOBForSimulation;
	/**
	 *
	 */
	private int educationSimulatedResponse;
	// Generate responses for these values within this class
	/**
	 *
	 */
	private ValueRange educationValueRange;

	/**
	 *
	 */
	private int ethnicitySimulatedResponse;
	/**
	 *
	 */
	private ValueRange ethnicityValueRange;
	/**
	 *
	 */
	private int eyeColorSimulatedResponse;

	/**
	 *
	 */
	private ValueRange eyeColorValueRange;
	/**
	 *
	 */
	private Father father;
	/**
	 *
	 */
	private int hairColorSimulatedResponse;

	/**
	 *
	 */
	private ValueRange hairColorValueRange;

	/**
	 *
	 */
	private int handednesssimulatedresponse;
	/**
	 *
	 */
	private ValueRange handednessValueRange;
	/**
	 *
	 */
	private float heightSRFtSimulatedresponse;

	/**
	 *
	 */
	private float heightSRInchesSimulatedresponse;
	/**
	 *
	 */
	private int incomeSimulatedResponse;
	/**
	 *
	 */
	private ValueRange incomeValueRange;
	protected LocalDate latestDOBForSimulation;

	/**
	 *
	 */
	private SimulatedResponseForLifestyleQ lifestyleQsimulatedresponse;
	/**
	 *
	 */
	private int maritalStatusSimulatedResponse;
	/**
	 *
	 */
	private ValueRange maritalStatusValueRange;

	/**
	 *
	 */
	private MaternalFemaleGrandParent maternalfemalegrandparent;
	/**
	 *
	 */
	private SimulatedResponseMilitaryDuty militarydutysimulatedresponse;
	/**
	 *
	 */
	private Mother mother;
	/**
	 *
	 */
	private int multipleBirthsSimulatedResponse;

	/**
	 *
	 */
	private ValueRange multipleBirthsValueRange;
	/**
	 *
	 */
	private int numberOfBiologicalBrothersSimulatedResponse; // simulation

	/**
	 *
	 */
	private int numberOfBiologicalSistersSimulatedResponse;
	// Assume value of 0-2
	/**
	 *
	 */
	private int numberOfHousesSimulatedResponse;

	private int painSimulatedResponse;

	private ValueRange painValueRange;
	private PaternalMaleGrandParent paternalmalegrandparent;

	/**
	 *
	 */
	private SimulatedResponseQ1_15 q1_15simulatedresponse;
	/**
	 *
	 */
	private SimulatedResponseRace racesimulatedresponse;

	private Sibling sibling;
	private int skinColorSimulatedResponse;
	private ValueRange skinColorValueRange;
	/**
	 *
	 */
	private int totalNumberOfDaughtersSimulatedResponse;
	/**
	 *
	 */
	private int totalNumberOfSonsSimulatedResponse;

	/**
	 *
	 */
	private SimulatedResponseVAUseVars VAUseVarssimulatedResponse;

	/**
	 *
	 */
	private float WeightSRLbsSimulatedResponse;

	/**
	 * @throws Exception
	 */
	public VeteranCohort() throws Exception {

		// Move logic out of default constructor
		try {
			this.setUtilities(new Utilities());
			this.setQ1_15SimulatedResponse(new SimulatedResponseQ1_15());
			this.setRaceSimulatedResponse(new SimulatedResponseRace());
			this.setChemicalexposuresimulatedresponse(new SimulatedResponseChemicalExposure());
			this.setLifestyleQsimulatedresponse(new SimulatedResponseForLifestyleQ());
			this.setAncestrysimulatedresponse(new SimulatedResponseAncestry());
			this.setMilitarydutysimulatedresponse(new SimulatedResponseMilitaryDuty());
			this.setVAUseVarsSimulatedResponse(new SimulatedResponseVAUseVars());
			this.setAdoptedValueRange(ValueRange.of(0, 1));
			this.setAliveValueRange(ValueRange.of(0, 1));
			this.setAliveSimulatedResponse((super.simulateAliveOrDead()));
			this.setMultipleBirthsValueRange(ValueRange.of(0, 1));
			// 1 - Male
			// 2- Female
			this.setSexValueRange(ValueRange.of(1, 2));
			this.setEducationValueRange(ValueRange.of(1, 7));
			this.setEthnicityValueRange(ValueRange.of(1, 5));
			this.setEyeColorValueRange(ValueRange.of(1, 6));
			this.setHairColorValueRange(ValueRange.of(1, 5));
			this.setHandednessValueRange(ValueRange.of(1, 3));
			this.setIncomeValueRange(ValueRange.of(1, 10));
			this.setBiologicalBrotherPresenceAbsenceValueRange(ValueRange.of(0, 1));
			this.setBiologicalSistersPresenceOrAbsenceValueRange(ValueRange.of(0, 1));
			this.setBiologicalSonsPresenceAbsenceValueRange(ValueRange.of(0, 1));
			this.setBiologicalDaughtersPresenceAbsenceValueRange(ValueRange.of(0, 1));
			this.setMaritalStatusValueRange(ValueRange.of(1, 7));
			this.setSkinColorValueRange(ValueRange.of(1, 6));
			this.setPainValueRange(ValueRange.of(0, 1));
			this.setEarliestDOBForSimulation(LocalDate.of(1940, 1, 1));
			this.setLatestDOBForSimulation(LocalDate.of(1970, 12, 31));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * private static VeteranCohort simulateVeteranResponses() { // TODO
	 * Auto-generated method stub try { VeteranCohort veteranCohort = new
	 * VeteranCohort(); return veteranCohort; } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } return null; }
	 **/

	// public static void printSDR(SimulatedDiseaseResponse sdr)
	// {
	// Class<?>[] classlist = sdr.class.getClasses();
	// }

	/*
	 * public static String printgetters(Object c) {
	 *
	 * Process process = null; try { StringBuilder diseasehierarchycalls = new
	 * StringBuilder(); java.lang.reflect.Method[] methlist =
	 * c.getClass().getDeclaredMethods(); int i = 0;
	 *
	 * while (i < c.getClass().getDeclaredMethods().length) { String methodname; if
	 * (methlist[i].getName().startsWith("get") &&
	 * (methlist[i].getReturnType().getName().startsWith("Disease")+",")) {
	 * methodname = methlist[i].getName().replace("()",""); StringBuilder
	 * yeardiagnosedmethodname = new StringBuilder(methlist[i].getName()+",");
	 * StringBuilder diseasemedsadministeredmethodName = new
	 * StringBuilder(methlist[i].getName()+","); StringBuilder
	 * diseasepresenceabsencemethname = new
	 * StringBuilder(methlist[i].getName()+","); String epicvarname =
	 * methlist[i].getName().replace("get", "").replace("()", "");
	 * yeardiagnosedmethodname = yeardiagnosedmethodname.insert(0,
	 * "System.out.println( \"" + epicvarname
	 * +"YearDiagnosed \" + cohort.getDiseasesSimulatedResponse().").append(
	 * "().getYearDiagnosedSimulatedResponse()+",");");
	 * diseasepresenceabsencemethname =
	 * diseasepresenceabsencemethname.insert(0,"System.out.println(\"" + epicvarname
	 * +"DiseasePresenceAbsence \" + cohort.getDiseaseSimulatedResponse().").append(
	 * "().getDiseasepresenceorabsencesimulatedepicresponse()+",");");
	 * diseasemedsadministeredmethodName = new
	 * StringBuilder(methlist[i].getName()+",").insert(0, "System.out.println(\""+
	 * epicvarname+"MedsAdministered \"+cohort.getDiseaseSimulatedResponse().").
	 * append("()."+methodname+"medicinesadministeredepicresponse();");
	 * System.out.println(diseasepresenceabsencemethname);
	 * System.out.println(yeardiagnosedmethodname);
	 * System.out.println(diseasemedsadministeredmethodName); //process =
	 * Runtime.getRuntime().exec(methName.toString()+",");
	 *
	 * //Scanner scanner = new Scanner(process.getInputStream()+",");
	 * //scanner.useDelimiter("\r\n");
	 *
	 * //while (scanner.hasNext()+",") { // System.out.println(scanner.next()+",");
	 * //}
	 *
	 * //scanner.close(); } i++; } } catch (Exception e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } //catch (InstantiationException e) { //
	 * TODO Auto-generated catch block //e.printStackTrace(); //} catch
	 * (IllegalAccessException e) { // TODO Auto-generated catch block
	 * //e.printStackTrace(); //} //return null; return null;
	 *
	 * }
	 */

	private void generateSiblingsForCohortCreation() throws Exception {
		try {
			int totalNumberOfSiblings = this.getNumberOfBiologicalBrothersSimulatedResponse()
					+ this.getNumberOfBiologicalSistersSimulatedResponse();
	//		 System.out.println("Total number of siblings simulated " +
	//		 totalNumberOfSiblings);
			if (totalNumberOfSiblings > 0) {
				this.setSibling(new Sibling());
				switch (totalNumberOfSiblings) {
				case 1:
					this.getSibling().setSibling1(new Sibling1(this));
					this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling1().getSexSimulatedResponse());
					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					 //this.getSibling().printSiblingDetails(this.getSibling().getSibling1());
					 //this.getSibling().printDiseasePresenceAbsenceInSiblings(this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers());

					break;
				case 2:
					this.getSibling().setSibling1(new Sibling1(this));
					this.getSibling().setSibling2(new Sibling2(this));
					this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling1().getSexSimulatedResponse());
					this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling2().getSexSimulatedResponse());
					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					 //this.getSibling().printSiblingDetails(this.getSibling().getSibling1(),
					 //this.getSibling().getSibling2());
					 //this.getSibling().printDiseasePresenceAbsenceInSiblings(
					//		 this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
					//		 this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers());

					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers());

					break;
				case 3:
					this.getSibling().setSibling1(new Sibling1(this));
					this.getSibling().setSibling2(new Sibling2(this));
					this.getSibling().setSibling3(new Sibling3(this));
					this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling1().getSexSimulatedResponse());
					this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling2().getSexSimulatedResponse());
					this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling3().getSexSimulatedResponse());

					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					 //this.getSibling().printSiblingDetails(this.getSibling().getSibling1(),
					// this.getSibling().getSibling2(), this.getSibling().getSibling3());
					 //this.getSibling().printDiseasePresenceAbsenceInSiblings(
					//		 this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
					//		 this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
					//		 this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					break;
				case 4:
					this.getSibling().setSibling1(new Sibling1(this));
					this.getSibling().setSibling2(new Sibling2(this));
					this.getSibling().setSibling3(new Sibling3(this));
					this.getSibling().setSibling4(new Sibling4(this));
					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling1().getSexSimulatedResponse());
					this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling2().getSexSimulatedResponse());
					this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling3().getSexSimulatedResponse());
					this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling4().getSexSimulatedResponse());

					 //this.getSibling().printSiblingDetails(this.getSibling().getSibling1(),
					// this.getSibling().getSibling2(), this.getSibling().getSibling3(),
					// this.getSibling().getSibling4());
					 //this.getSibling().printDiseasePresenceAbsenceInSiblings(
					//		 this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
					//		 this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
					//		 this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
					//		 this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers());

					break;
				case 5:
					this.getSibling().setSibling1(new Sibling1(this));
					this.getSibling().setSibling2(new Sibling2(this));
					this.getSibling().setSibling3(new Sibling3(this));
					this.getSibling().setSibling4(new Sibling4(this));
					this.getSibling().setSibling5(new Sibling5(this));
					this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling1().getSexSimulatedResponse());
					this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling2().getSexSimulatedResponse());
					this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling3().getSexSimulatedResponse());
					this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling4().getSexSimulatedResponse());
					this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling5().getSexSimulatedResponse());

					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					// this.getSibling().printSiblingDetails(this.getSibling().getSibling1(),
					// this.getSibling().getSibling2(), this.getSibling().getSibling3(),
					// this.getSibling().getSibling4(), this.getSibling().getSibling5());
					 //this.getSibling().printDiseasePresenceAbsenceInSiblings(
					//		 this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
					//		 this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
					//		 this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
					//		 this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
					//		 this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers());

					break;
				case 6:
					this.getSibling().setSibling1(new Sibling1(this));
					this.getSibling().setSibling2(new Sibling2(this));
					this.getSibling().setSibling3(new Sibling3(this));
					this.getSibling().setSibling4(new Sibling4(this));
					this.getSibling().setSibling5(new Sibling5(this));
					this.getSibling().setSibling6(new Sibling6(this));
					this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling1().getSexSimulatedResponse());
					this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling2().getSexSimulatedResponse());
					this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling3().getSexSimulatedResponse());
					this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling4().getSexSimulatedResponse());
					this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling5().getSexSimulatedResponse());
					this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling6().getSexSimulatedResponse());

					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					 
					 /**this.getSibling().printSiblingDetails(this.getSibling().getSibling1(),
					 this.getSibling().getSibling2(), this.getSibling().getSibling3(),
					 this.getSibling().getSibling4(), this.getSibling().getSibling5(),
					 this.getSibling().getSibling6());
					 this.getSibling().printDiseasePresenceAbsenceInSiblings(
							 this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers()); **/
					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers());

					break;
				case 7:
					this.getSibling().setSibling1(new Sibling1(this));
					this.getSibling().setSibling2(new Sibling2(this));
					this.getSibling().setSibling3(new Sibling3(this));
					this.getSibling().setSibling4(new Sibling4(this));
					this.getSibling().setSibling5(new Sibling5(this));
					this.getSibling().setSibling6(new Sibling6(this));
					this.getSibling().setSibling7(new Sibling7(this));
					this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling1().getSexSimulatedResponse());
					this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling2().getSexSimulatedResponse());
					this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling3().getSexSimulatedResponse());
					this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling4().getSexSimulatedResponse());
					this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling5().getSexSimulatedResponse());
					this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling6().getSexSimulatedResponse());
					this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling7().getSexSimulatedResponse());

					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					/** this.getSibling().printSiblingDetails(this.getSibling().getSibling1(),
					 this.getSibling().getSibling2(), this.getSibling().getSibling3(),
					 this.getSibling().getSibling4(), this.getSibling().getSibling5(),
					 this.getSibling().getSibling6(), this.getSibling().getSibling5(),
					 this.getSibling().getSibling7());
					 this.getSibling().printDiseasePresenceAbsenceInSiblings(
							 this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers()); **/
					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers());

					break;
				case 8:
					this.getSibling().setSibling1(new Sibling1(this));
					this.getSibling().setSibling2(new Sibling2(this));
					this.getSibling().setSibling3(new Sibling3(this));
					this.getSibling().setSibling4(new Sibling4(this));
					this.getSibling().setSibling3(new Sibling3(this));
					this.getSibling().setSibling5(new Sibling5(this));
					this.getSibling().setSibling6(new Sibling6(this));
					this.getSibling().setSibling7(new Sibling7(this));
					this.getSibling().setSibling8(new Sibling8(this));
					this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling1().getSexSimulatedResponse());
					this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling2().getSexSimulatedResponse());
					this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling3().getSexSimulatedResponse());
					this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling4().getSexSimulatedResponse());
					this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling5().getSexSimulatedResponse());
					this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling6().getSexSimulatedResponse());
					this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling7().getSexSimulatedResponse());
					this.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling8().getSexSimulatedResponse());

					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					/** this.getSibling().printSiblingDetails(this.getSibling().getSibling1(),
					 this.getSibling().getSibling2(), this.getSibling().getSibling3(),
					 this.getSibling().getSibling4(), this.getSibling().getSibling5(),
					 this.getSibling().getSibling6(), this.getSibling().getSibling5(),
					 this.getSibling().getSibling7(), this.getSibling().getSibling8());
					 this.getSibling().printDiseasePresenceAbsenceInSiblings(
							 this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers()); **/
					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers());

					break;
				default:
					this.getSibling().setSibling1(new Sibling1(this));
					this.getSibling().setSibling2(new Sibling2(this));
					this.getSibling().setSibling3(new Sibling3(this));
					this.getSibling().setSibling4(new Sibling4(this));
					this.getSibling().setSibling5(new Sibling5(this));
					this.getSibling().setSibling6(new Sibling6(this));
					this.getSibling().setSibling7(new Sibling7(this));
					this.getSibling().setSibling8(new Sibling8(this));
					this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling1().getSexSimulatedResponse());
					this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling2().getSexSimulatedResponse());
					this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling3().getSexSimulatedResponse());
					this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling4().getSexSimulatedResponse());
					this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling5().getSexSimulatedResponse());
					this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling6().getSexSimulatedResponse());
					this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling7().getSexSimulatedResponse());
					this.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers().simulateResponseVariablesForFamilyMembers(this.getSibling().getSibling8().getSexSimulatedResponse());

					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers());
					/** this.getSibling().printSiblingDetails(this.getSibling().getSibling1(), this.getSibling().getSibling2(),
							this.getSibling().getSibling3(), this.getSibling().getSibling4(),
							this.getSibling().getSibling5(), this.getSibling().getSibling6(),
							this.getSibling().getSibling5(), this.getSibling().getSibling7(),
							this.getSibling().getSibling8());
					 this.getSibling().printDiseasePresenceAbsenceInSiblings(
							 this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							 this.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers()); **/
					this.getSibling().checkForDiseasePresenceAbsenceInSiblings(
							this.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
							this.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers());

					break;
				}
			}
			 //if (totalNumberOfSiblings > 0) {
			 //System.out.println("Printing disease presence in cohort ");
			 //this.getSibling().printDiseasePresenceInSiblings();
			 //}
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Cohort, Siblings DOB: 1940 -1970
	// Mother Father DOB: 1900-1920

	/**
	 * @return the adopted
	 */
	/**
	 * @return
	 */
	public ValueRange getAdoptedValueRange() throws Exception {
		try {
			return this.adoptedValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this.adoptedValueRange;
	}

	// private Year deathyear; // for simulation, setting to 0, as alive is assumed
	// 1

	/**
	 * @return the adoptedSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getAdoptionStatusSimulatedResponse() {
		try {
			return this.adoptedSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.adoptedSimulatedResponse;

	}

	/**
	 * @return the ancestrysimulatedresponse
	 */
	/**
	 * @return
	 */
	public SimulatedResponseAncestry getAncestrysimulatedresponse() {
		try {
			return this.ancestrysimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ancestrysimulatedresponse;

	}

	/**
	 * @return the bioBro
	 */
	/**
	 * @return
	 */
	private ValueRange getBiologicalBrotherPresenceAbsenceValueRange() {
		try {
			return this.biologicalBrotherPresenceAbsenceValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this.biologicalBrotherPresenceAbsenceValueRange;

	}

	/**
	 * @return the simulatedresponseBiologicalBrothersPresenceAbsence
	 */
	/**
	 * @return
	 */
	public int getBiologicalBrothersPresenceAbsenceSimulatedResponse() {
		try {
			return this.biologicalBrothersPresenceAbsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.biologicalBrothersPresenceAbsencesimulatedresponse;
	}

	/**
	 * @return the biologicalDaughterPresenceAbsenceSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getBiologicalDaughtersPresenceAbsenceSimulatedResponse() {
		return this.biologicalDaughtersPresenceAbsenceSimulatedResponse;
	}

	/**
	 * @return the bioDaughter
	 */
	/**
	 * @return
	 */
	private ValueRange getBiologicalDaughtersPresenceAbsenceValueRange() {
		try {
			return this.biologicalDaughtersPresenceAbsenceValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this.biologicalDaughtersPresenceAbsenceValueRange;

	}

	/**
	 * @return
	 */
	public int getBiologicalSistersPresenceAbsenceSimulatedResponse() {
		// TODO Auto-generated method stub
		return this.numberOfBiologicalSistersSimulatedResponse;
	}

	/**
	 * @return the bioSis
	 */
	/**
	 * @return
	 */
	private ValueRange getBiologicalSistersPresenceOrAbsenceValueRange() {
		try {
			return this.biologicalSistersPresenceOrAbsenceValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this.biologicalSistersPresenceOrAbsenceValueRange;

	}

	/**
	 * @return the biologicalSonsPresenceAbsenceSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getBiologicalSonsPresenceAbsenceSimulatedResponse() {
		return this.biologicalSonsPresenceAbsenceSimulatedResponse;
	}

	/**
	 * @return the bioSon
	 */
	/**
	 * @return
	 */
	private ValueRange getBiologicalSonsPresenceAbsenceValueRange() {
		try {
			return this.biologicalSonsPresenceAbsenceValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this.biologicalSonsPresenceAbsenceValueRange;

	}

	/**
	 * @return the simulatedresponsechemicalexposure
	 */
	public SimulatedResponseChemicalExposure getChemicalexposuresimulatedresponse() {
		return this.chemicalexposuresimulatedresponse;
	}

	/**
	 * @return the diseassessimulatedresponse
	 */
	/**
	 * @return
	 */
	public SimulatedDiseaseResponse getDiseasesSimulatedResponse() {
		return this.diseassessimulatedresponse;
	}

	/**
	 * @return the earliestDOBForSimulation
	 */
	protected LocalDate getEarliestDOBForSimulation() {
		return this.earliestDOBForSimulation;
	}

	/**
	 * @return the educationSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getEducationSimulatedResponse() {
		return this.educationSimulatedResponse;
	}

	/**
	 * @return the deathyear
	 */
	/*
	 * protected Year getDeathyear() throws Exception { try { return this.deathyear;
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return this.deathyear; }
	 */
	/**
	 * @return the educationValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getEducationValueRange() {
		try {
			return this.educationValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.educationValueRange;

	}

	/**
	 * @return the ethnicitySimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getEthnicitySimulatedResponse() {
		try {
			return this.ethnicitySimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ethnicitySimulatedResponse;

	}

	/**
	 * @return the ethnicityValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getEthnicityValueRange() {
		try {
			return this.ethnicityValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ethnicityValueRange;

	}

	/**
	 * @return the eyeColorSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getEyeColorSimulatedResponse() {
		try {
			return this.eyeColorSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.eyeColorSimulatedResponse;

	}

	/**
	 * @return the eyeClr
	 */
	/**
	 * @return
	 */
	private ValueRange getEyeColorValueRange() {
		try {
			return this.eyeColorValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this.eyeColorValueRange;

	}

	/**
	 * @return the father
	 */
	/**
	 * @return
	 */
	public Father getFather() {
		return this.father;
	}

	/**
	 * @return the hairColorSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getHairColorSimulatedResponse() {
		try {
			return this.hairColorSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.hairColorSimulatedResponse;

	}

	/**
	 * @return the hairClr
	 */
	/**
	 * @return
	 */
	private ValueRange getHairColorValueRange() {
		try {
			return this.hairColorValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.hairColorValueRange;

	}

	/**
	 * @return the handednesssimulatedresponse
	 */
	/**
	 * @return
	 */
	public int getHandednesssimulatedresponse() {
		try {
			return this.handednesssimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.handednesssimulatedresponse;

	}

	/**
	 * @return the handedness
	 */
	/**
	 * @return
	 */
	private ValueRange getHandednessValueRange() {
		try {
			return this.handednessValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.handednessValueRange;

	}

	/**
	 * @return the heightSRFtSimulatedresponse
	 */
	/**
	 * @return
	 */
	public float getHeightSRFtSimulatedresponse() {
		try {
			return this.heightSRFtSimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.heightSRFtSimulatedresponse;

	}

	/**
	 * @return the heightSRInchesSimulatedresponse
	 */
	/**
	 * @return
	 */
	public float getHeightSRInchesSimulatedresponse() {
		try {
			return this.heightSRInchesSimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.heightSRInchesSimulatedresponse;

	}

	/**
	 * @return the incomeSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getIncomeSimulatedResponse() {
		try {
			return this.incomeSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.incomeSimulatedResponse;

	}

	/**
	 * @return the incomeValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getIncomeValueRange() {
		try {
			return this.incomeValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.incomeValueRange;

	}

	/**
	 * @return the latestDOBForSimulation
	 */
	protected LocalDate getLatestDOBForSimulation() {
		return this.latestDOBForSimulation;
	}

	/**
	 * @return the simulatedresponselifestyle
	 */
	/**
	 * @return
	 */
	public SimulatedResponseForLifestyleQ getLifestyleQsimulatedresponse() {
		try {
			return this.lifestyleQsimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.lifestyleQsimulatedresponse;

	}

	/**
	 * @return the maritalStatusSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getMaritalStatusSimulatedResponse() {
		try {
			return this.maritalStatusSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.maritalStatusSimulatedResponse;

	}

	/**
	 * @return the maritalStatusValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getMaritalStatusValueRange() {
		try {
			return this.maritalStatusValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.maritalStatusValueRange;

	}

	/**
	 * @return the maternalgrandparent
	 */
	/**
	 * @return
	 */
	public MaternalFemaleGrandParent getMaternalfemalegrandparent() {
		try {
			return this.maternalfemalegrandparent;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.maternalfemalegrandparent;

	}

	/**
	 * @return the simulatedresponsemilitaryduty
	 */
	/**
	 * @return
	 */
	public SimulatedResponseMilitaryDuty getMilitarydutysimulatedresponse() {
		try {
			return this.militarydutysimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.militarydutysimulatedresponse;

	}

	/**
	 * @return the mother
	 */
	/**
	 * @return
	 */
	public Mother getMother() {
		try {
			return this.mother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.mother;

	}

	/**
	 * @return the multipleBirthSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getMultipleBirthsSimulatedResponse() {
		return this.multipleBirthsSimulatedResponse;
	}

	/**
	 * @return the multiBirth
	 */
	/**
	 * @return
	 */
	private ValueRange getMultipleBirthsValueRange() {
		try {
			return this.multipleBirthsValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.multipleBirthsValueRange;

	}

	/**
	 * @return the bioBroQty
	 */
	/**
	 * @return
	 */
	public int getNumberOfBiologicalBrothersSimulatedResponse() {
		try {
			return this.numberOfBiologicalBrothersSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this.numberOfBiologicalBrothersSimulatedResponse;

	}

	/**
	 * @return the numberOfBiologicalSistersSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getNumberOfBiologicalSistersSimulatedResponse() {
		return this.numberOfBiologicalSistersSimulatedResponse;
	}

	/**
	 * @return the numberOfHousesSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getNumberOfHousesSimulatedResponse() {
		try {
			return this.numberOfHousesSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.numberOfHousesSimulatedResponse;

	}

	/**
	 * @return the painSimulatedResponse
	 */
	public int getPainSimulatedResponse() {
		return this.painSimulatedResponse;
	}

	/**
	 * @return the painValueRange
	 */
	private ValueRange getPainValueRange() {
		return this.painValueRange;
	}

	/**
	 * @return the paternalgrandparent
	 */
	public PaternalMaleGrandParent getPaternalmalegrandparent() {
		return this.paternalmalegrandparent;
	}

	/**
	 * @return the simulatedresponeq1_15
	 */
	/**
	 * @return
	 */
	public SimulatedResponseQ1_15 getQ1_15Simulatedresponse() {
		try {
			return this.q1_15simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.q1_15simulatedresponse;

	}

	/**
	 * @return the qtyHouse
	 */
	/**
	 * @return
	 */
	public int getQtyHouseSimulatedResponse() {
		try {
			return this.numberOfHousesSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.numberOfHousesSimulatedResponse;

	}

	/**
	 * @return the simulatedresponserace
	 */
	/**
	 * @return
	 */
	public SimulatedResponseRace getRacesimulatedresponse() {
		try {
			return this.racesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.racesimulatedresponse;

	}

	/**
	 * @return the sibling
	 */
	public Sibling getSibling() {
		return this.sibling;
	}

	/**
	 * @return the skinColorSimulatedResponse
	 */
	public int getSkinColorSimulatedResponse() {
		return this.skinColorSimulatedResponse;
	}

	/**
	 * @return the skinColorValueRange
	 */
	private ValueRange getSkinColorValueRange() {
		return this.skinColorValueRange;
	}

	/**
	 * @return the totalNumberOfDaughtersSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getTotalNumberOfDaughtersSimulatedResponse() {
		return this.totalNumberOfDaughtersSimulatedResponse;
	}

	/**
	 * @return the totalNumberOfSonsSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getTotalNumberOfSonsSimulatedResponse() {
		return this.totalNumberOfSonsSimulatedResponse;
	}

	/**
	 * @return the simulatedResponseVAUseVars
	 */
	/**
	 * @return
	 */
	public SimulatedResponseVAUseVars getVAUseVarssimulatedResponse() {
		try {
			return this.VAUseVarssimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.VAUseVarssimulatedResponse;

	}

	/**
	 * @return the weightSRLbsSimulatedResponse
	 */
	/**
	 * @return
	 */
	public float getWeightSRLbsSimulatedResponse() {
		return this.WeightSRLbsSimulatedResponse;
	}

	/**
	 * @param adoptedSimulatedResponse the adoptedSimulatedResponse to set
	 */
	/**
	 * @param adoptedSimulatedResponse
	 */
	private void setAdoptedSimulatedResponse(int adoptedSimulatedValue) {
		try {
			this.adoptedSimulatedResponse = adoptedSimulatedValue;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param adopted the adopted to set
	 */
	/**
	 * @param adopted
	 */
	private void setAdoptedValueRange(ValueRange adopted) {
		try {
			this.adoptedValueRange = adopted;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param aliveValueRange the aliveValueRange to set
	 */
	/**
	 * @param alive
	 * @throws Exception
	 */
	private void setAliveValueRange(ValueRange alive) throws Exception {
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestrysimulatedresponse the ancestrysimulatedresponse to set
	 */
	/**
	 * @param ancestrysimulatedresponse
	 */
	private void setAncestrysimulatedresponse(SimulatedResponseAncestry simulatedresponseancestry) {
		try {
			this.ancestrysimulatedresponse = simulatedresponseancestry;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param bioBro the bioBro to set
	 */
	/**
	 * @param bioBro
	 */
	private void setBiologicalBrotherPresenceAbsenceValueRange(ValueRange bioBro) {
		try {
			this.biologicalBrotherPresenceAbsenceValueRange = bioBro;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param simulatedresponseBiologicalBrothersPresenceAbsence the
	 *                                                           simulatedresponseBiologicalBrothersPresenceAbsence
	 *                                                           to set
	 */
	/**
	 * @param biologicalBrothersPresenceAbsencesimulatedresponse
	 */
	private void setBiologicalBrothersPresenceAbsencesimulatedresponse(
			int biologicalBrothersPresenceAbsenceSimulatedResponse) {
		try {
			this.biologicalBrothersPresenceAbsencesimulatedresponse = biologicalBrothersPresenceAbsenceSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// getMarital()
	// setMarital(ValueRange)

	/**
	 * @param biologicalDaughterPresenceAbsenceSimulatedResponse the
	 *                                                           biologicalDaughterPresenceAbsenceSimulatedResponse
	 *                                                           to set
	 */
	/**
	 * @param biologicalDaughterPresenceAbsenceSimulatedResponse
	 */
	private void setBiologicalDaughtersPresenceAbsenceSimulatedResponse(
			int biologicalDaughterPresenceAbsenceSimulatedResponse) {
		this.biologicalDaughtersPresenceAbsenceSimulatedResponse = biologicalDaughterPresenceAbsenceSimulatedResponse;
	}

	/**
	 * @param bioDaughter the bioDaughter to set
	 */
	/**
	 * @param bioDaughter
	 */
	private void setBiologicalDaughtersPresenceAbsenceValueRange(ValueRange bioDaughter) {
		try {
			this.biologicalDaughtersPresenceAbsenceValueRange = bioDaughter;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param randBetween
	 */
	private void setBiologicalSistersPresenceAbsenceSimulatedResponse(int randBetween) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param bioSis the bioSis to set
	 */
	/**
	 * @param bioSis
	 */
	private void setBiologicalSistersPresenceOrAbsenceValueRange(ValueRange bioSis) {
		try {
			this.biologicalSistersPresenceOrAbsenceValueRange = bioSis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param biologicalSonsPresenceAbsenceSimulatedResponse the
	 *                                                       biologicalSonsPresenceAbsenceSimulatedResponse
	 *                                                       to set
	 */
	/**
	 * @param biologicalSonPresenceAbsenceSimulatedResponse
	 */
	private void setBiologicalSonsPresenceAbsenceSimulatedResponse(int biologicalSonPresenceAbsenceSimulatedResponse) {
		this.biologicalSonsPresenceAbsenceSimulatedResponse = biologicalSonPresenceAbsenceSimulatedResponse;
	}

	/**
	 * @param deathyear the deathyear to set
	 */
	/*
	 * private void setDeathyear(Year deathyear) throws Exception { try {
	 * this.deathyear = deathyear; } catch (Exception e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } }
	 */

	/**
	 * @param bioSon the bioSon to set
	 */
	/**
	 * @param bioSon
	 */
	private void setBiologicalSonsPresenceAbsenceValueRange(ValueRange bioSon) {
		try {
			this.biologicalSonsPresenceAbsenceValueRange = bioSon;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param simulatedresponsechemicalexposure the
	 *                                          simulatedresponsechemicalexposure to
	 *                                          set
	 */
	private void setChemicalexposuresimulatedresponse(
			SimulatedResponseChemicalExposure simulatedresponsechemicalexposure) {
		this.chemicalexposuresimulatedresponse = simulatedresponsechemicalexposure;
	}

	/**
	 * @param diseassessimulatedresponse the diseassessimulatedresponse to set
	 */
	/**
	 * @param diseassessimulatedresponse
	 */
	private void setDiseassessimulatedresponse(SimulatedDiseaseResponse simulateddiseasesresponse) {
		try {
			this.diseassessimulatedresponse = simulateddiseasesresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param earliestDOBForSimulation the earliestDOBForSimulation to set
	 */
	private void setEarliestDOBForSimulation(LocalDate earliestDOBForSimulation) {
		this.earliestDOBForSimulation = earliestDOBForSimulation;
	}

	/**
	 * @param educationSimulatedResponse the educationSimulatedResponse to set
	 */
	/**
	 * @param educationSimulatedResponse
	 */
	private void setEducationSimulatedResponse(int educationSimulatedResponse) {
		try {
			this.educationSimulatedResponse = educationSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param educationValueRange the educationValueRange to set
	 */
	/**
	 * @param education
	 */
	private void setEducationValueRange(ValueRange education) {
		try {
			this.educationValueRange = education;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ethnicitySimulatedResponse the ethnicitySimulatedResponse to set
	 */
	/**
	 * @param ethnicitySimulatedResponse
	 */
	private void setEthnicitySimulatedResponse(int ethnicitySimulatedResponse) {
		try {
			this.ethnicitySimulatedResponse = ethnicitySimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ethnicityValueRange the ethnicityValueRange to set
	 */
	/**
	 * @param ethnicity
	 */
	private void setEthnicityValueRange(ValueRange ethnicity) {
		try {
			this.ethnicityValueRange = ethnicity;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param eyeColorSimulatedResponse the eyeColorSimulatedResponse to set
	 */
	/**
	 * @param eyeColorSimulatedResponse
	 */
	private void setEyeColorSimulatedResponse(int eyeColorSimulatedResponse) {
		try {
			this.eyeColorSimulatedResponse = eyeColorSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param eyeClr the eyeClr to set
	 */
	/**
	 * @param eyeClr
	 */
	private void setEyeColorValueRange(ValueRange eyeClr) {
		try {
			this.eyeColorValueRange = eyeClr;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * For siblings asthma presence / absence Alzheimers presence / absence Bipolar
	 * disorder presence / absence Breast cancer presence / absence Colon cancer
	 * presence / absence Lung Cancer presence / absence Prostate Cancer presence /
	 * absence (interrelated with gender of SimulatedDiseaseResponse) Skin Cancer
	 * presence / absence Other Cancer presence / absence Depression presence /
	 * absence DoDM presence / absence Hypertension presence / absence Cholesterol
	 * presence / absence Kidney Disease presence / absence Liver disease presence /
	 * absence Stroke presence / absence generate response for each of above
	 * varables and assign to one of 8 randomly generated siblings
	 */

	// Which sibling

	/**
	 * @param father the father to set
	 */
	/**
	 * @param father
	 */
	public void setFather(Father father) {
		this.father = father;
	}

	/**
	 * @param hairColorSimulatedResponse the hairColorSimulatedResponse to set
	 */
	/**
	 * @param hairColorSimulatedResponse
	 */
	private void setHairColorSimulatedResponse(int hairColorSimulatedResponse) {
		try {
			this.hairColorSimulatedResponse = hairColorSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param hairClr the hairClr to set
	 */
	/**
	 * @param hairClr
	 */
	private void setHairColorValueRange(ValueRange hairClr) {
		try {
			this.hairColorValueRange = hairClr;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param handednesssimulatedresponse the handednesssimulatedresponse to set
	 */
	/**
	 * @param handednesssimulatedresponse
	 */
	private void setHandednesssimulatedresponse(int handednesssimulatedresponse) {
		try {
			this.handednesssimulatedresponse = handednesssimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param handedness the handedness to set
	 */
	/**
	 * @param handedness
	 */
	private void setHandednessValueRange(ValueRange handedness) {
		try {
			this.handednessValueRange = handedness;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param heightSRFtSimulatedresponse the heightSRFtSimulatedresponse to set
	 */
	/**
	 * @param heightSRFtSimulatedresponse
	 */
	private void setHeightSRFtSimulatedresponse(float heightSRFtSimulatedresponse) {
		try {
			this.heightSRFtSimulatedresponse = heightSRFtSimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param heightSRInchesSimulatedresponse the heightSRInchesSimulatedresponse to
	 *                                        set
	 */
	/**
	 * @param heightSRInchesSimulatedresponse
	 */
	private void setHeightSRInchesSimulatedresponse(float heightSRInchesSimulatedresponse) {
		try {
			this.heightSRInchesSimulatedresponse = heightSRInchesSimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param incomeSimulatedResponse the incomeSimulatedResponse to set
	 */
	/**
	 * @param incomeSimulatedResponse
	 */
	private void setIncomeSimulatedResponse(int incomeSimulatedResponse) {
		try {
			this.incomeSimulatedResponse = incomeSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param incomeValueRange the incomeValueRange to set
	 */
	/**
	 * @param income
	 */
	private void setIncomeValueRange(ValueRange income) {
		try {
			this.incomeValueRange = income;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param latestDOBForSimulation the latestDOBForSimulation to set
	 */
	private void setLatestDOBForSimulation(LocalDate latestDOBForSimulation) {
		this.latestDOBForSimulation = latestDOBForSimulation;
	}

	/**
	 * @param simulatedresponselifestyle the simulatedresponselifestyle to set
	 */
	/**
	 * @param simulatedresponselifestyle
	 */
	private void setLifestyleQsimulatedresponse(SimulatedResponseForLifestyleQ simulatedresponselifestyle) {
		try {
			this.lifestyleQsimulatedresponse = simulatedresponselifestyle;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param maritalStatusSimulatedResponse the maritalStatusSimulatedResponse to
	 *                                       set
	 */
	/**
	 * @param maritalStatusSimulatedResponse
	 */
	private void setMaritalStatusSimulatedResponse(int maritalStatusSimulatedResponse) {
		try {
			this.maritalStatusSimulatedResponse = maritalStatusSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param maritalStatusValueRange the maritalStatusValueRange to set
	 */
	/**
	 * @param maritalStatusValueRange
	 */
	private void setMaritalStatusValueRange(ValueRange maritalStatusValueRange) {
		try {
			this.maritalStatusValueRange = maritalStatusValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param maternalgrandparent the maternalgrandparent to set
	 */
	/**
	 * @param maternalfemalegrandparent
	 */
	public void setMaternalfemalegrandparent(MaternalFemaleGrandParent maternalGP) {
		try {
			this.maternalfemalegrandparent = maternalGP;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param simulatedresponsemilitaryduty the simulatedresponsemilitaryduty to set
	 */
	/**
	 * @param simulatedresponsemilitaryduty
	 */
	private void setMilitarydutysimulatedresponse(SimulatedResponseMilitaryDuty simulatedresponsemilitaryduty) {
		try {
			this.militarydutysimulatedresponse = simulatedresponsemilitaryduty;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mother the mother to set
	 */
	/**
	 * @param mother
	 */
	public void setMother(Mother mother) {
		try {
			this.mother = mother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param multipleBirthSimulatedResponse the multipleBirthSimulatedResponse to
	 *                                       set
	 */
	/**
	 * @param multipleBirthSimulatedResponse
	 */
	private void setMultipleBirthsSimulatedResponse(int multipleBirthSimulatedResponse) {
		this.multipleBirthsSimulatedResponse = multipleBirthSimulatedResponse;
	}

	/**
	 * @param multiBirth the multiBirth to set
	 */
	/**
	 * @param multiBirth
	 */
	private void setMultipleBirthsValueRange(ValueRange multiBirth) {
		try {
			this.multipleBirthsValueRange = multiBirth;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param bioBroQty the bioBroQty to set
	 */
	/**
	 * @param bioBroQty
	 */
	private void setNumberOfBiologicalBrothersSimulatedResponse(int bioBroQty) {
		try {
			this.numberOfBiologicalBrothersSimulatedResponse = bioBroQty;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param bioSisQty the bioSisQty to set
	 */
	/**
	 * @param bioSisQty
	 */
	private void setNumberOfBiologicalSistersSimulatedResponse(int bioSisQty) {
		try {
			this.numberOfBiologicalSistersSimulatedResponse = bioSisQty;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param daughterQty the daughterQty to set
	 */
	/**
	 * @param daughterQty
	 */
	private void setNumberOfDaughtersSimulatedResponse(int daughterQty) {
		try {
			this.totalNumberOfDaughtersSimulatedResponse = daughterQty;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param numberOfHousesSimulatedResponse the numberOfHousesSimulatedResponse to
	 *                                        set
	 */
	/**
	 * @param numberOfHousesSimulatedResponse
	 */
	private void setNumberOfHousesSimulatedResponse(int numberOfHousesSimulatedResponse) {
		try {
			this.numberOfHousesSimulatedResponse = numberOfHousesSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sonQty the sonQty to set
	 */
	/**
	 * @param sonQty
	 */
	private void setNumberOfSonsSimulatedResponse(int sonQty) {
		try {
			this.totalNumberOfSonsSimulatedResponse = sonQty;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param painSimulatedResponse the painSimulatedResponse to set
	 */
	private void setPainSimulatedResponse(int painSimulatedResponse) {
		this.painSimulatedResponse = painSimulatedResponse;
	}

	/**
	 * @param painValueRange the painValueRange to set
	 */
	private void setPainValueRange(ValueRange painValueRange) {
		this.painValueRange = painValueRange;
	}

	/**
	 * @param paternalgrandparent the paternalgrandparent to set
	 */
	public void setPaternalmalegrandparent(PaternalMaleGrandParent paternalgrandparent) {
		this.paternalmalegrandparent = paternalgrandparent;
	}

	/**
	 * @param simulatedresponeq1_15 the simulatedresponeq1_15 to set
	 */
	/**
	 * @param simulatedresponeq1_15
	 */
	private void setQ1_15SimulatedResponse(SimulatedResponseQ1_15 simulatedresponseq1_15) {
		try {
			this.q1_15simulatedresponse = simulatedresponseq1_15;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param qtyHouse the qtyHouse to set
	 */
	/**
	 * @param qtyHouse
	 */
	private void setQtyHouseSimulatedResponse(int qtyHouse) {
		try {
			this.numberOfHousesSimulatedResponse = qtyHouse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param simulatedresponserace the simulatedresponserace to set
	 */
	/**
	 * @param simulatedresponserace
	 */
	private void setRaceSimulatedResponse(SimulatedResponseRace simulatedresponserace) {
		try {
			this.racesimulatedresponse = simulatedresponserace;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sibling the sibling to set
	 */
	public void setSibling(Sibling sibling) {
		this.sibling = sibling;
	}

	/**
	 * @param skinColorSimulatedResponse the skinColorSimulatedResponse to set
	 */
	private void setSkinColorSimulatedResponse(int skinColorSimulatedResponse) {
		this.skinColorSimulatedResponse = skinColorSimulatedResponse;
	}

	/**
	 * @param skinColorValueRange the skinColorValueRange to set
	 */
	private void setSkinColorValueRange(ValueRange skinColorValueRange) {
		this.skinColorValueRange = skinColorValueRange;
	}

	/**
	 * @param totalNumberOfDaughtersSimulatedResponse the
	 *                                                totalNumberOfDaughtersSimulatedResponse
	 *                                                to set
	 */
	/**
	 * @param totalNumberOfDaughtersSimulatedResponse
	 */
	private void setTotalNumberOfDaughtersSimulatedResponse(int totalNumberOfDaughtersSimulatedResponse) {
		this.totalNumberOfDaughtersSimulatedResponse = totalNumberOfDaughtersSimulatedResponse;
	}

	/**
	 * @param totalNumberOfSonsSimulatedResponse the
	 *                                           totalNumberOfSonsSimulatedResponse
	 *                                           to set
	 */
	/**
	 * @param totalNumberOfSonsSimulatedResponse
	 */
	private void setTotalNumberOfSonsSimulatedResponse(int totalNumberOfSonsSimulatedResponse) {
		this.totalNumberOfSonsSimulatedResponse = totalNumberOfSonsSimulatedResponse;
	}

	/**
	 * @param simulatedResponseVAUseVars the simulatedResponseVAUseVars to set
	 */
	/**
	 * @param VAUseVarssimulatedResponse
	 */
	private void setVAUseVarsSimulatedResponse(SimulatedResponseVAUseVars simulatedResponse) {
		try {
			this.VAUseVarssimulatedResponse = simulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param weightSRLbs the weightSRLbs to set
	 */
	/**
	 * @param weightSRLbs
	 */
	private void setWeightSRLbsSimulatedResponse(float weightSRLbs) {
		try {
			this.WeightSRLbsSimulatedResponse = weightSRLbs;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return
	 */
	private int simulateAdoptedValue() {
		try {
			this.setAdoptedSimulatedResponse(this.getUtilities().randBetween(
					(int) this.getAdoptedValueRange().getMinimum(), (int) this.getAdoptedValueRange().getMaximum()));
			return this.getAdoptionStatusSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getAdoptionStatusSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulateBiologicalBrothersPresenceAbsence() {
		try {
			this.setBiologicalBrothersPresenceAbsencesimulatedresponse(this.getUtilities().randBetween(
					(int) this.getBiologicalBrotherPresenceAbsenceValueRange().getMinimum(),
					(int) this.getBiologicalBrotherPresenceAbsenceValueRange().getMaximum()));
			return this.getBiologicalBrothersPresenceAbsenceSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBiologicalBrothersPresenceAbsenceSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulateBiologicalSistersPresenceAbsence() {
		try {
			this.setBiologicalSistersPresenceAbsenceSimulatedResponse(this.getUtilities().randBetween(
					(int) this.getBiologicalSistersPresenceOrAbsenceValueRange().getMinimum(),
					(int) this.getBiologicalSistersPresenceOrAbsenceValueRange().getMaximum()));
			return this.getBiologicalSistersPresenceAbsenceSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBiologicalSistersPresenceAbsenceSimulatedResponse();
	}

	// BIO Daughter BIO SON DOB not captured (only presence / absence captured)
	/**
	 * @return
	 */
	private Date simulateDateOfBirth() {
		Date simulatedDOB = null;
		try {
			simulatedDOB = new Date(ThreadLocalRandom.current().nextLong(
					Date.from(this.getEarliestDOBForSimulation().atStartOfDay(ZoneId.systemDefault()).toInstant())
							.getTime(),
					Date.from(this.getLatestDOBForSimulation().atStartOfDay(ZoneId.systemDefault()).toInstant())
							.getTime()));
			//System.out.println("Simulated DOB Cohort " + simulatedDOB);

			return simulatedDOB;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return simulatedDOB;
	}

	/**
	 * @return
	 */
	private int simulateEducationValue() {
		try {
			this.setEducationSimulatedResponse(
					this.getUtilities().randBetween((int) this.getEducationValueRange().getMinimum(),
							(int) this.getEducationValueRange().getMaximum()));
			return this.getEducationSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getEducationSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulateEthnicityValue() {
		try {
			this.setEthnicitySimulatedResponse(
					this.getUtilities().randBetween((int) this.getEthnicityValueRange().getMinimum(),
							(int) this.getEthnicityValueRange().getMaximum()));
			return this.getEthnicitySimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getEthnicitySimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulateEyeColor() {
		try {
			this.setEyeColorSimulatedResponse(this.getUtilities().randBetween(
					(int) this.getEyeColorValueRange().getMinimum(), (int) this.getEyeColorValueRange().getMaximum()));
			return this.getEyeColorSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getEyeColorSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulateHairColor() {
		try {
			this.setHairColorSimulatedResponse(
					this.getUtilities().randBetween((int) this.getHairColorValueRange().getMinimum(),
							(int) this.getHairColorValueRange().getMaximum()));
			return this.getHairColorSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getHairColorSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulateHandedness() {
		try {
			this.setHandednesssimulatedresponse(
					this.getUtilities().randBetween((int) this.getHandednessValueRange().getMinimum(),
							(int) this.getHandednessValueRange().getMaximum()));
			return this.getHandednesssimulatedresponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getHandednesssimulatedresponse();
	}

	// float between 5-6
	/**
	 * @return
	 */
	private float simulateheightinfeet() {
		try {
			this.setHeightSRFtSimulatedresponse(this.getUtilities().randFloatBetween(5, 6));
			return this.getHeightSRFtSimulatedresponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getHeightSRFtSimulatedresponse();
	}

	/**
	 * @return
	 */
	private float simulateheightininches() {
		try {
			this.setHeightSRInchesSimulatedresponse(this.getUtilities().randFloatBetween(1, 12));
			return this.getHeightSRInchesSimulatedresponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getHeightSRInchesSimulatedresponse();
	}

	/**
	 * @return
	 */
	private int simulateIncome() {
		try {
			this.setIncomeSimulatedResponse(this.getUtilities().randBetween(
					(int) this.getIncomeValueRange().getMinimum(), (int) this.getIncomeValueRange().getMaximum()));
			return this.getIncomeSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getIncomeSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulatemaritalstatus() {
		try {
			this.setMaritalStatusSimulatedResponse(
					this.getUtilities().randBetween((int) this.getMaritalStatusValueRange().getMinimum(),
							(int) this.getMaritalStatusValueRange().getMaximum()));
			return this.getMaritalStatusSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getMaritalStatusSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulateMultipleBirths() {
		try {
			this.setMultipleBirthsSimulatedResponse(
					this.getUtilities().randBetween((int) this.getMultipleBirthsValueRange().getMinimum(),
							(int) this.getMultipleBirthsValueRange().getMaximum()));
			return this.getMultipleBirthsSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getMultipleBirthsSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulatenumberOfHouses() {
		try {
			this.setNumberOfHousesSimulatedResponse(this.getUtilities().randBetween(0, 2));
			return this.getNumberOfHousesSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getNumberOfHousesSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulateNumBioBrothers() {
		try {
			if (this.getBiologicalBrothersPresenceAbsenceSimulatedResponse() == 1) {
				this.setNumberOfBiologicalBrothersSimulatedResponse(this.getUtilities().randBetween(
						VeteranCohort.getMinimumNumberSiblings(), VeteranCohort.getMaximumNumberSiblings()));
				return this.getNumberOfBiologicalBrothersSimulatedResponse();
			}
			this.setNumberOfBiologicalBrothersSimulatedResponse(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.getNumberOfBiologicalBrothersSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulateNumBioSisters() {
		try {
			if (this.getBiologicalSistersPresenceAbsenceSimulatedResponse() == 1) {
				this.setNumberOfBiologicalSistersSimulatedResponse(this.getUtilities().randBetween(
						VeteranCohort.getMinimumNumberSiblings(), VeteranCohort.getMaximumNumberSiblings()));
				return this.getNumberOfBiologicalSistersSimulatedResponse();
			}
			this.setNumberOfBiologicalSistersSimulatedResponse(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.getNumberOfBiologicalSistersSimulatedResponse();
	}

	private int simulatePainValue() {
		try {
			this.setPainSimulatedResponse(this.getUtilities().randBetween((int) this.getPainValueRange().getMinimum(),
					(int) this.getPainValueRange().getMaximum()));
			return this.getPainSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getPainSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulatepresenceabsencebiologicaldaughter() {
		try {
			this.setBiologicalDaughtersPresenceAbsenceSimulatedResponse(this.getUtilities().randBetween(
					(int) this.getBiologicalDaughtersPresenceAbsenceValueRange().getMinimum(),
					(int) this.getBiologicalDaughtersPresenceAbsenceValueRange().getMaximum()));
			return this.getBiologicalDaughtersPresenceAbsenceSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBiologicalDaughtersPresenceAbsenceSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulatepresenceabsencebiologicalson() {
		try {
			this.setBiologicalSonsPresenceAbsenceSimulatedResponse(this.getUtilities().randBetween(
					(int) this.getBiologicalSonsPresenceAbsenceValueRange().getMinimum(),
					(int) this.getBiologicalSonsPresenceAbsenceValueRange().getMaximum()));
			return this.getBiologicalSonsPresenceAbsenceSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBiologicalSonsPresenceAbsenceSimulatedResponse();
	}

	/**
	 * @return
	 */
	private int simulateSkinColorValue() {
		try {
			this.setSkinColorSimulatedResponse(
					this.getUtilities().randBetween((int) this.getSkinColorValueRange().getMinimum(),
							(int) this.getSkinColorValueRange().getMaximum()));
			return this.getSkinColorSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getSkinColorSimulatedResponse();
	}

	private int simulateTotalNumberOfDaughters() {
		int numberOfBiologicalDaughters = 0;
		try {
			if (this.getBiologicalDaughtersPresenceAbsenceSimulatedResponse() == 1) {
				// Simulate daughters IF PRESENT
				numberOfBiologicalDaughters = this.getUtilities().randBetween(1, 5);
			}
			this.setTotalNumberOfDaughtersSimulatedResponse(
					this.getUtilities().randBetween(1, 5) + numberOfBiologicalDaughters);

			return this.getTotalNumberOfDaughtersSimulatedResponse();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.getTotalNumberOfDaughtersSimulatedResponse();
	}

	private int simulateTotalNumberOfSons() {
		int numberOfBiologicalSons = 0;
		try {
			if (this.getBiologicalSonsPresenceAbsenceSimulatedResponse() == 1) {
				// Simulate biological sons IF PRESENT
				numberOfBiologicalSons = this.getUtilities().randBetween(1, 5);
			}
			this.setTotalNumberOfSonsSimulatedResponse(this.getUtilities().randBetween(1, 5) + numberOfBiologicalSons);

			return this.getNumberOfBiologicalBrothersSimulatedResponse();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.getTotalNumberOfSonsSimulatedResponse();
	}

	public void simulateVeteranCohortResponseVariables() throws Exception {
		try {

			this.getQ1_15Simulatedresponse().simulateQ1_Q15responseVariables();
			this.getRacesimulatedresponse().simulateRaceResponseVariables();
			this.getChemicalexposuresimulatedresponse().simulateChemicalExposureResponseVariables();
			this.getLifestyleQsimulatedresponse().simulateLifeStyleQResponseVariables();
			this.getAncestrysimulatedresponse().simulateAncestryResponseVariables();
			this.getMilitarydutysimulatedresponse().simulateMilitaryDutyResponseVariables();
			this.getVAUseVarssimulatedResponse().getVauseresponses();
			this.setBirthDateSimulated(this.simulateDateOfBirth());
			//System.out.println(this.getBirthDateSimulated().toString());
			//System.out.println(this.getUtilities().extractYearFromDate(this.getBirthDateSimulated()));
			super.simulateYearOfBirth(this.getUtilities().extractYearFromDate(this.getBirthDateSimulated()));
			//System.out.println(this.getYearOfBirth());
			this.simulateYearOfDeath();
			this.setBiologicalBrothersPresenceAbsencesimulatedresponse(
					this.simulateBiologicalBrothersPresenceAbsence());
			this.setBiologicalDaughtersPresenceAbsenceSimulatedResponse(
					this.simulatepresenceabsencebiologicaldaughter());
			this.setBiologicalSistersPresenceAbsenceSimulatedResponse(this.simulateBiologicalSistersPresenceAbsence());
			this.setBiologicalSonsPresenceAbsenceSimulatedResponse(this.simulatepresenceabsencebiologicalson());

			this.setNumberOfDaughtersSimulatedResponse(this.simulateTotalNumberOfDaughters());
			this.setNumberOfSonsSimulatedResponse(this.simulateTotalNumberOfSons());
			this.setNumberOfBiologicalBrothersSimulatedResponse(this.simulateNumBioBrothers());
			this.setNumberOfBiologicalSistersSimulatedResponse(this.simulateNumBioSisters());
			this.setWeightSRLbsSimulatedResponse(this.simulateweightinlbs());
			this.setIncomeSimulatedResponse(this.simulateIncome());
			this.setEducationSimulatedResponse(this.simulateEducationValue());
			this.setQtyHouseSimulatedResponse(this.simulatenumberOfHouses());
			this.setMaritalStatusSimulatedResponse(this.simulatemaritalstatus());
			this.setHeightSRFtSimulatedresponse(this.simulateheightinfeet());
			this.setHeightSRInchesSimulatedresponse(this.simulateheightininches());
			this.setEyeColorSimulatedResponse(this.simulateEyeColor());
			this.setHairColorSimulatedResponse(this.simulateHairColor());
			this.setEthnicitySimulatedResponse(this.simulateEthnicityValue());
			this.setHandednesssimulatedresponse(this.simulateHandedness());
			this.setSexSimulatedResponse(this.simulateSexValue());
			this.setPainSimulatedResponse(this.simulatePainValue());
			this.setSkinColorSimulatedResponse(this.simulateSkinColorValue());
			this.setAdoptedSimulatedResponse(this.simulateAdoptedValue());
			this.setMultipleBirthsSimulatedResponse(this.simulateMultipleBirths());

			// Move logic out of constructor for simulateddiseaseresponse
			this.setDiseassessimulatedresponse(new SimulatedDiseaseResponse(this));
			this.getDiseasesSimulatedResponse().simulateResponses(this);
			this.setMother(new Mother(this));
			//System.out.println("Mother responses ");
			this.getMother().simulateResponseVariablesForMother(this);
			//this.getMother().getSimulatedDiseasePresenceAbsence().printsimulatedresponses();
			this.setFather(new Father(this));
			this.getFather().simulateResponseVariablesForFather(this);
			//System.out.println("Father responses ");
			//this.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers().printsimulatedresponses();
			this.setMaternalfemalegrandparent(new MaternalFemaleGrandParent());
			//System.out.println("Maternal GP responses ");
			//this.getMaternalfemalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers().printsimulatedresponses();
			this.setPaternalmalegrandparent(new PaternalMaleGrandParent());
			//System.out.println("Paternal GP responses ");
			//this.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers().printsimulatedresponses();
			
			this.generateSiblingsForCohortCreation();
			
			// check for diseases across generated siblings
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	private float simulateweightinlbs() {
		try {
			this.setWeightSRLbsSimulatedResponse(this.getUtilities().randFloatBetween(120, 300));
			return this.getWeightSRLbsSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getWeightSRLbsSimulatedResponse();
	}
	
}	
