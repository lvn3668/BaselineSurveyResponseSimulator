package cohort;

import java.time.Instant;
import java.time.Year;
import java.time.temporal.ValueRange;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import Interfaces.Birthdeathinterfacemethods;
import SimulatedResponseAncestry.SimulatedResponseAncestry;
import Utilities.Utilities;
import randomizer.UniformDistribution;
import simulatedDiseaseResponse.SimulatedDiseaseResponse;
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

public abstract class Cohort implements Birthdeathinterfacemethods {

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
	private int aliveSimulatedResponse = 1;

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
	// Dt,Year (2010)
	/**
	 *
	 */
	private java.util.Date birthDtSimulatedResponse;
	/**
	 *
	 */
	private Year birthyear; // extract from simulated birth date

	/**
	 *
	 */
	private SimulatedResponseChemicalExposure chemicalexposuresimulatedresponse;
	// call each simulatedresponse individually
	/**
	 *
	 */
	private SimulatedDiseaseResponse diseassessimulatedresponse;
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
	private MaternalGrandParent maternalgrandparent;
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
	/**
	 *
	 */
	private SimulatedResponseQ1_15 q1_15simulatedresponse;

	/**
	 *
	 */
	private SimulatedResponseRace racesimulatedresponse;
	/**
	 *
	 */
	private int sexSimulatedResponse;
	/**
	 *
	 */
	private ValueRange sexValueRange;
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
	private Utilities utilities;
	private UniformDistribution uniformdistribution;
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
	public Cohort() throws Exception {

		// Move logic out of default constructor 
		try {
			this.setUtilities(new Utilities());
			// call overloaded constructor with value ranges
			this.setQ1_15SimulatedResponse(new SimulatedResponseQ1_15());
			this.getQ1_15Simulatedresponse().simulateQ1_Q15responseVariables();

			// calling default constructor
			this.setRaceSimulatedResponse(new SimulatedResponseRace());
			this.getRacesimulatedresponse().simulateRaceResponseVariables();

			this.setChemicalexposuresimulatedresponse(new SimulatedResponseChemicalExposure());
			this.getChemicalexposuresimulatedresponse().simulateChemicalExposureResponseVariables();

			this.setLifestyleQsimulatedresponse(new SimulatedResponseForLifestyleQ());
			this.getLifestyleQsimulatedresponse().simulateLifeStyleQResponseVariables();

			this.setAncestrysimulatedresponse(new SimulatedResponseAncestry());
			this.getAncestrysimulatedresponse().simulateAncestryResponseVariables();

			this.setMilitarydutysimulatedresponse(new SimulatedResponseMilitaryDuty());
			this.getMilitarydutysimulatedresponse().simulateMilitaryDutyResponseVariables();

			this.setVAUseVarsSimulatedResponse(new SimulatedResponseVAUseVars());
			this.getVAUseVarssimulatedResponse().getVausevars();

			this.setAdoptedValueRange(ValueRange.of(0, 1));
			this.setAliveValueRange(ValueRange.of(0, 1));
			this.setAliveSimulatedResponse(1);

			this.setMultipleBirthsValueRange(ValueRange.of(0, 1));
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
			this.setBirthDateSimulated(this.simulateDateOfBirth());

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

			this.setDiseassessimulatedresponse(new SimulatedDiseaseResponse(this));
			// simulateddiseaseresponse
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

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

	/**
	 * @return the adoptedSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getAdoptionStatus() {
		try {
			return this.adoptedSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.adoptedSimulatedResponse;

	}

	/**
	 * @return the aliveSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getAliveSimulatedResponse() {
		try {
			return this.aliveSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.aliveSimulatedResponse;

	}

	// Cohort, Siblings DOB: 1940 -1970
	// Mother Father DOB: 1900-1920

	/**
	 * @return the ancestrysimulatedresponse
	 */
	/**
	 * @return
	 */
	private SimulatedResponseAncestry getAncestrysimulatedresponse() {
		try {
			return this.ancestrysimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ancestrysimulatedresponse;

	}

	// private Year deathyear; // for simulation, setting to 0, as alive is assumed
	// 1

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
	public int getBiologicalBrothersPresenceAbsencesimulatedresponse() {
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
	 * @return the birthDt
	 */
	/**
	 * @return
	 */
	protected Date getBirthDateSimulated() {
		try {
			return this.birthDtSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.birthDtSimulatedResponse;

	}

	/**
	 * @return the birthyear
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	public Year getBirthyear() throws Exception {
		try {
			return this.birthyear;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.birthyear;
	}

	/**
	 * @return the simulatedresponsechemicalexposure
	 */
	private SimulatedResponseChemicalExposure getChemicalexposuresimulatedresponse() {
		return this.chemicalexposuresimulatedresponse;
	}

	/**
	 * @return the diseassessimulatedresponse
	 */
	/**
	 * @return
	 */
	protected SimulatedDiseaseResponse getDiseassessimulatedresponse() {
		return this.diseassessimulatedresponse;
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
	protected Father getFather() {
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
	 * @return the simulatedresponselifestyle
	 */
	/**
	 * @return
	 */
	private SimulatedResponseForLifestyleQ getLifestyleQsimulatedresponse() {
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
	protected MaternalGrandParent getMaternalgrandparent() {
		try {
			return this.maternalgrandparent;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.maternalgrandparent;

	}

	/**
	 * @return the simulatedresponsemilitaryduty
	 */
	/**
	 * @return
	 */
	private SimulatedResponseMilitaryDuty getMilitarydutysimulatedresponse() {
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
	protected Mother getMother() {
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
	 * @return the daughterQty
	 */
	/**
	 * @return
	 */
	public int getNumberOfDaughtersSimulatedResponse() {
		try {
			return this.totalNumberOfDaughtersSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.totalNumberOfDaughtersSimulatedResponse;

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
	 * @return the simulatedresponeq1_15
	 */
	/**
	 * @return
	 */
	private SimulatedResponseQ1_15 getQ1_15Simulatedresponse() {
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
	private SimulatedResponseRace getRacesimulatedresponse() {
		try {
			return this.racesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.racesimulatedresponse;

	}

	/**
	 * @return the sexSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getSexSimulatedResponse() {
		try {
			return this.sexSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sexSimulatedResponse;

	}

	/**
	 * @return the sexValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getSexValueRange() {
		try {
			return this.sexValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sexValueRange;

	}

	/**
	 * @return the sibling1
	 */
	/**
	 * @return
	 */
	protected Sibling1 getSibling1() {
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
	protected Sibling2 getSibling2() {
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
	protected Sibling3 getSibling3() {
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
	protected Sibling4 getSibling4() {
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
	protected Sibling5 getSibling5() {
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
	protected Sibling6 getSibling6() {
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
	protected Sibling7 getSibling7() {
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
	protected Sibling8 getSibling8() {
		try {
			return this.sibling8;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sibling8;
	}

	/**
	 * @return the skinColorSimulatedResponse
	 */
	private int getSkinColorSimulatedResponse() {
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
	 * @return the utilities
	 */
	protected Utilities getUtilities() {
		return this.utilities;
	}

	/**
	 * @return the simulatedResponseVAUseVars
	 */
	/**
	 * @return
	 */
	private SimulatedResponseVAUseVars getVAUseVarssimulatedResponse() {
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
	 * @param aliveSimulatedResponse the aliveSimulatedResponse to set
	 */
	/**
	 * @param aliveSimulatedResponse
	 */
	private void setAliveSimulatedResponse(int aliveSimulatedValue) {
		try {
			this.aliveSimulatedResponse = aliveSimulatedValue;
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
	 * @param birthDt the birthDt to set
	 */
	/**
	 * @param birthDt
	 */
	protected void setBirthDateSimulated(java.util.Date birthDt) {
		try {
			this.birthDtSimulatedResponse = birthDt;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param birthyear the birthyear to set
	 */
	/**
	 * @param birthyear
	 * @throws Exception
	 */
	protected void setBirthyear(Year birthyear) throws Exception {
		try {
			this.birthyear = birthyear;
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
	 * @param deathyear the deathyear to set
	 */
	/*
	 * private void setDeathyear(Year deathyear) throws Exception { try {
	 * this.deathyear = deathyear; } catch (Exception e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } }
	 */

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
	 * @param father the father to set
	 */
	/**
	 * @param father
	 */
	protected void setFather(Father father) {
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
	 * @param maternalgrandparent
	 */
	protected void setMaternalgrandparent(MaternalGrandParent maternalGP) {
		try {
			this.maternalgrandparent = maternalGP;
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
	protected void setMother(Mother mother) {
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
	 * @param sexSimulatedResponse the sexSimulatedResponse to set
	 */
	/**
	 * @param sexSimulatedResponse
	 */
	private void setSexSimulatedResponse(int sexSimulatedResponse) {
		try {
			this.sexSimulatedResponse = sexSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sexValueRange the sexValueRange to set
	 */
	/**
	 * @param sex
	 */
	private void setSexValueRange(ValueRange sex) {
		try {
			this.sexValueRange = sex;
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
	protected void setSibling1(Sibling1 sibling1) {
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
	protected void setSibling2(Sibling2 sibling2) {
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
	protected void setSibling3(Sibling3 sibling3) {
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
	protected void setSibling4(Sibling4 sibling4) {
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
	protected void setSibling5(Sibling5 sibling5) {
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
	protected void setSibling6(Sibling6 sibling6) {
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
	protected void setSibling7(Sibling7 sibling7) {
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
	protected void setSibling8(Sibling8 sibling8) {
		try {
			this.sibling8 = sibling8;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	 * @param utilities the utilities to set
	 */
	protected void setUtilities(Utilities utilities) {
		this.utilities = utilities;
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
	public int simulateAdoptedValue() {
		try {
			this.setAdoptedSimulatedResponse(this.utilities.randBetween((int) this.getAdoptedValueRange().getMinimum(),
					(int) this.getAdoptedValueRange().getMaximum()));
			return this.getAdoptionStatus();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getAdoptionStatus();
	}

	/**
	 * @return
	 */
	public int simulateBiologicalBrothersPresenceAbsence() {
		try {
			this.setBiologicalBrothersPresenceAbsencesimulatedresponse(
					this.utilities.randBetween((int) this.getBiologicalBrotherPresenceAbsenceValueRange().getMinimum(),
							(int) this.getBiologicalBrotherPresenceAbsenceValueRange().getMaximum()));
			return this.getBiologicalBrothersPresenceAbsencesimulatedresponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBiologicalBrothersPresenceAbsencesimulatedresponse();
	}

	/**
	 * @return
	 */
	public int simulateBiologicalSistersPresenceAbsence() {
		try {
			this.setBiologicalSistersPresenceAbsenceSimulatedResponse(this.utilities.randBetween(
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
	protected Date simulateDateOfBirth() {
		try {

			Date simulatedDOB = Date.from(Instant.ofEpochSecond(ThreadLocalRandom.current()
					.nextLong(new Date("1-1-1940").getTime(), new Date("12-31-1970").getTime())));
			this.setBirthDateSimulated(simulatedDOB);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(simulatedDOB);
			this.setBirthyear(Year.parse(new StringBuilder(calendar.get(Calendar.YEAR))));
			return this.getBirthDateSimulated();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBirthDateSimulated();
	}

	/**
	 * @return
	 */
	public int simulateEducationValue() {
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
	public int simulateEthnicityValue() {
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
	public int simulateEyeColor() {
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
	public int simulateHairColor() {
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
	public int simulateHandedness() {
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
	public float simulateheightinfeet() {
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
	public float simulateheightininches() {
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
	public int simulateIncome() {
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
	public int simulatemaritalstatus() {
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
	public int simulateMultipleBirths() {
		try {
			this.setMultipleBirthsSimulatedResponse(
					this.utilities.randBetween((int) this.getMultipleBirthsValueRange().getMinimum(),
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
	public int simulatenumberOfHouses() {
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
	public int simulateNumBioBrothers() {
		try {
			if (this.getBiologicalBrothersPresenceAbsencesimulatedresponse() == 1) {
				this.setNumberOfBiologicalBrothersSimulatedResponse(this.utilities.randBetween(1, 5));
				return this.getNumberOfBiologicalBrothersSimulatedResponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.getNumberOfBiologicalBrothersSimulatedResponse();
	}

	/**
	 * @return
	 */
	public int simulateNumBioSisters() {
		try {
			if (this.getBiologicalSistersPresenceAbsenceSimulatedResponse() == 1) {
				this.setNumberOfBiologicalSistersSimulatedResponse(this.utilities.randBetween(1, 5));
				return this.getNumberOfBiologicalSistersSimulatedResponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.getNumberOfBiologicalSistersSimulatedResponse();
	}

	public int simulatePainValue() {
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
	public int simulatepresenceabsencebiologicaldaughter() {
		try {
			this.setBiologicalDaughtersPresenceAbsenceSimulatedResponse(this.utilities.randBetween(
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
	public int simulatepresenceabsencebiologicalson() {
		try {
			this.setBiologicalSonsPresenceAbsenceSimulatedResponse(
					this.utilities.randBetween((int) this.getBiologicalSonsPresenceAbsenceValueRange().getMinimum(),
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
	public int simulateSexValue() {
		try {
			this.setSexSimulatedResponse(this.utilities.randBetween((int) this.getSexValueRange().getMinimum(),
					(int) this.getSexValueRange().getMaximum()));
			return this.getSexSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getSexSimulatedResponse();
	}

	/**
	 * @return
	 */
	public int simulateSkinColorValue() {
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

	public int simulateTotalNumberOfDaughters() {
		int numberOfBiologicalDaughters = 0;
		try {
			if (this.getBiologicalDaughtersPresenceAbsenceSimulatedResponse() == 1) {
				// Simulate biological sons IF PRESENT
				numberOfBiologicalDaughters = this.utilities.randBetween(1, 5);
			}
			this.setTotalNumberOfDaughtersSimulatedResponse(
					this.utilities.randBetween(1, 5) + numberOfBiologicalDaughters);

			return this.getTotalNumberOfDaughtersSimulatedResponse();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.getTotalNumberOfDaughtersSimulatedResponse();
	}

	public int simulateTotalNumberOfSons() {
		int numberOfBiologicalSons = 0;
		try {
			if (this.getBiologicalSonsPresenceAbsenceSimulatedResponse() == 1) {
				// Simulate biological sons IF PRESENT
				numberOfBiologicalSons = this.utilities.randBetween(1, 5);
			}
			this.setTotalNumberOfSonsSimulatedResponse(this.utilities.randBetween(1, 5) + numberOfBiologicalSons);

			return this.getNumberOfBiologicalBrothersSimulatedResponse();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.getTotalNumberOfSonsSimulatedResponse();
	}

	public float simulateweightinlbs() {
		try {
			this.setWeightSRLbsSimulatedResponse(this.utilities.randFloatBetween(120, 300));
			return this.getWeightSRLbsSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getWeightSRLbsSimulatedResponse();
	}

	/**
	 * @return the uniformdistribution
	 */
	public UniformDistribution getUniformdistribution() {
		return uniformdistribution;
	}

	/**
	 * @param uniformdistribution the uniformdistribution to set
	 */
	public void setUniformdistribution(UniformDistribution uniformdistribution) {
		this.uniformdistribution = uniformdistribution;
	}

}
