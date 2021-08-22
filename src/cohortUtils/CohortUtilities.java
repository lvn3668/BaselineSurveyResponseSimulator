package cohortUtils;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ValueRange;
import java.util.Date;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

public class CohortUtilities {

	protected static LocalDate deathDate = LocalDate.of(0001, 1, 1);
	private static final String COMMA_DELIMITER = ",";

	/**
	 * @return the yearOfDeath
	 */
	protected static LocalDate getDeathDate() {
		try {
			return deathDate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deathDate;
	}

	/**
	 * @param yearOfDeath the yearOfDeath to set
	 */
	protected static void setDeathDate(LocalDate yearOfDeath) {
		try {
			CohortUtilities.deathDate = yearOfDeath;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	protected int aliveSimulatedResponse;
	// Dt,Year (2010)
	/**
	 *
	 */
	private java.util.Date birthDtSimulatedResponse;

	/**
	 *
	 */
	private int sexSimulatedResponse;

	/**
	 *
	 */
	private ValueRange sexValueRange;
	protected RandomizingDistribution uniformdistribution;
	private Utilities utilities;
	/**
	 *
	 */
	protected Year yearOfBirth; // extract from simulated birth date
	private Year yearOfDeath;
	private StringBuilder cohortstringbuilder;

	public CohortUtilities() throws Exception {
		try {
			this.setUtilities(new Utilities());
			this.setSexValueRange(ValueRange.of(0, 1));
			this.setCohortstringbuilder(new StringBuilder());
		} catch (Exception e) {
			e.printStackTrace();
		}

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

	/**
	 * @return the birthDt
	 */
	/**
	 * @return
	 */
	public Date getBirthDateSimulated() {
		try {
			return this.birthDtSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.birthDtSimulatedResponse;

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
	protected ValueRange getSexValueRange() {
		try {
			return this.sexValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sexValueRange;

	}

	/**
	 * @return the uniformDistribution
	 */
	protected RandomizingDistribution getUniformdistribution() {
		try {
			return this.uniformdistribution;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.uniformdistribution;
	}

	/**
	 * @return the utilities
	 */
	protected Utilities getUtilities() {
		try {
			return this.utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.utilities;
	}

	/**
	 * @return the birthyear
	 */
	/**
	 * @return
	 */
	public Year getYearOfBirth() {
		try {
			return this.yearOfBirth;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.yearOfBirth;
	}

	/**
	 * @return the yearOfDeath
	 */
	public Year getYearOfDeath() {
		try {
			return this.yearOfDeath;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.yearOfDeath;
	}

	/**
	 * @param aliveSimulatedResponse the aliveSimulatedResponse to set
	 */
	/**
	 * @param aliveSimulatedResponse
	 */
	protected void setAliveSimulatedResponse(int aliveSimulatedValue) {
		try {
			this.aliveSimulatedResponse = aliveSimulatedValue;
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
	 * @param sexSimulatedResponse the sexSimulatedResponse to set
	 */
	/**
	 * @param sexSimulatedResponse
	 */
	protected void setSexSimulatedResponse(int sexSimulatedResponse) {
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
	protected void setSexValueRange(ValueRange sex) {
		try {
			this.sexValueRange = sex;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param randomizingDistribution the uniformDistribution to set
	 */
	protected void setUniformdistribution(RandomizingDistribution randomizingDistribution) {
		try {
			this.uniformdistribution = randomizingDistribution;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param utilities the utilities to set
	 */
	protected void setUtilities(Utilities utilities) {
		try {
			this.utilities = utilities;
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
	protected void setYearOfBirth(Year birthyear) throws Exception {
		try {
			this.yearOfBirth = birthyear;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param yearOfDeath the yearOfDeath to set
	 */
	protected void setYearOfDeath(Year yearOfDeath) {
		try {
			this.yearOfDeath = yearOfDeath;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected int simulateAliveOrDead() {
		// TODO Auto-generated method stub
		return 1;
	}

	/**
	 * @return
	 */
	protected int simulateSexValue() {
		try {
			this.setSexSimulatedResponse(this.getUtilities().randBetween((int) this.getSexValueRange().getMinimum(),
					(int) this.getSexValueRange().getMaximum()));
			return this.getSexSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getSexSimulatedResponse();
	}

	protected void simulateYearOfBirth(Year birthyear) {
		// TODO Auto-generated method stub
		try {
			this.setYearOfBirth(birthyear);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void simulateYearOfDeath() {
		// TODO Auto-generated method stub
		try {
			this.setYearOfDeath(this.getUtilities().extractYearFromDate(CohortUtilities.getDeathDate()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// externalize separator
	public StringBuilder buildCohortResponseVariableValues(VeteranCohort veteranCohort) throws Exception {
		try {
	
			this.getCohortstringbuilder().append(veteranCohort.getBirthDateSimulated() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getSexSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getEthnicitySimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getEthnicitySimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getRacesimulatedresponse().getRaceWhitesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getRacesimulatedresponse().getRaceAfricanAmericansimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getRacesimulatedresponse().getRaceAmericanIndiansimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getRacesimulatedresponse().getRaceAsianFilipinosimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getRacesimulatedresponse().getRaceAsianIndiansimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getRacesimulatedresponse().getRaceAsianJapansimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getRacesimulatedresponse().getRaceAsianOthersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getRacesimulatedresponse().getRacePacificIslandersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getRacesimulatedresponse().getRaceAsianChinesesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getAdoptionStatusSimulatedResponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(
					veteranCohort.getAncestrysimulatedresponse().getAncestryafricansimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getAncestrysimulatedresponse().getAncestryeastasiansimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getAncestrysimulatedresponse().getAncestrymiddleeasternsimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getAncestrysimulatedresponse().getAncestrynorthamericansimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getAncestrysimulatedresponse().getAncestrynortheuropeansimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getAncestrysimulatedresponse().getAncestrysamoaamericansimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getAncestrysimulatedresponse().getAncestrysoutheurasiansimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getAncestrysimulatedresponse().getAncestrysouthwestasiansimulatedepicresponse()
							+ COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(veteranCohort.getEducationSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMaritalStatusSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getNumberOfHousesSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getIncomeSimulatedResponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q1simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q2simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q3simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q4simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q5simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q6simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q7simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q8simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q9simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q10simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q11simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q12simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q13simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q14simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getQ1_15Simulatedresponse().getVr12Q15simulatedresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(veteranCohort.getPainSimulatedResponse() + COMMA_DELIMITER);
	
			System.out.println(veteranCohort.getLifestyleQsimulatedresponse().getActiveWorksimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getLifestyleQsimulatedresponse().getActiveStatussimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getLifestyleQsimulatedresponse().getActiveExercisesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getLifestyleQsimulatedresponse().getAlcoholFrequencysimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getLifestyleQsimulatedresponse().getAlcoholQuantitysimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getLifestyleQsimulatedresponse().getAlcoholBingesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getLifestyleQsimulatedresponse().getSmoke100cigarettessimulatedresponse() + COMMA_DELIMITER);
			System.out.println(veteranCohort.getLifestyleQsimulatedresponse().getSmokedailysimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getLifestyleQsimulatedresponse().getSmokenowsimulatedresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchArmysimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchAirForcesimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchCoastGuardsimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchMilitaryCrosssimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchMMsimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchNationalGuardsimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchNavysimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchNOAAsimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMilitarydutysimulatedresponse()
					.getMilitaryBranchPublicHealthServicesimulatedresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryServiceTypesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService1simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService2simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService3simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService4simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService5simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService6simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService7simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService8simulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService9simulatedresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getServiceOutsideUSsimulatedresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getStationAsiaFareastsimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getStationAsiaSouthPacificsimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getStationCarribeansimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getStationEastEuropeansimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMilitarydutysimulatedresponse().getStationMexicosimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getStationMiddleEastsimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getStationNortHCentralEuropeansimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMilitarydutysimulatedresponse().getStationOthersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getStationSouthCentralAmericansimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMilitarydutysimulatedresponse()
					.getStationSouthEuropeanMediterraneansimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMilitarydutysimulatedresponse().getStationUSCanadasimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMilitarydutysimulatedresponse().getDeployGulfsimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMilitarydutysimulatedresponse().getDeployOEFOIFsimulatedresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(
					veteranCohort.getChemicalexposuresimulatedresponse().getExposurePyrBrsimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getChemicalexposuresimulatedresponse().getExposureToAgentOSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getChemicalexposuresimulatedresponse().getExposureToAnthraxsimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getChemicalexposuresimulatedresponse()
					.getExposureToChemicalBioAgentssimulatedresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(veteranCohort.getHandednesssimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getHeightSRFtSimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getHeightSRInchesSimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getWeightSRLbsSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getSkinColorSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getHairColorSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getEyeColorSimulatedResponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse() + COMMA_DELIMITER);
	
			// veteranCohort.getDiseasesSimulatedResponse();
	
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getAcuteSpinalCordInjury()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getAcuteSpinalCordInjury()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getAcuteSpinalCordInjury()
					.getAcuteSpinalCordInjurymedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getBlindness()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getBlindness().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getBlindness()
					.getBlindnessmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getBloodclots()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getBloodclots().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getBloodclots()
					.getBloodclotsmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getAlzheimers()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getAlzheimers().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getAlzheimers()
					.getAlzheimersmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getAsthma()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getAsthma().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getAsthma()
					.getAsthmamedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getArthritis()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getArthritis().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getArthritis()
					.getArthritismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getCataract()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getCataract().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getCataract()
					.getCataractmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getCholesterol()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getCholesterol().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getCholesterol()
					.getCholesterolmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getColonCancer()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getColonCancer().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getColonCancer()
					.getColonCancermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiAcidReflux()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getGiAcidReflux().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiAcidReflux()
					.getGiAcidRefluxmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiCeliacDisease()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiCeliacDisease()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiCeliacDisease()
					.getGiCeliacDiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getBreastCancer()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getBreastCancer().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getBreastCancer()
					.getBreastCancermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getDementia()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getDementia().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getDementia()
					.getDementiamedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiobstruction()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getGiobstruction().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiobstruction()
					.getGIObstructionmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiOtherDisease()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getGiOtherDisease().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiOtherDisease()
					.getGiOtherDiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiPolyp()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getGiPolyp().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiPolyp()
					.getGiPolypmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getDiabetes()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getDiabetes().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getDiabetes()
					.getDiabetesmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiCrohnsDisease()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiCrohnsDisease()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiCrohnsDisease()
					.getGiCrohnsDiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiUlcer()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getGiUlcer().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiUlcer()
					.getGiUlcermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getCad()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getCad().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getCad()
					.getCoronaryarterydiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getEpilepsy()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getEpilepsy().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getEpilepsy()
					.getEpilepsymedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getChf()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getChf().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getChf()
					.getCongestiveheartfailuremedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getBPH()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getBPH().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getBPH().getBPHmedicinesadministeredepicresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGlaucoma()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getGlaucoma().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGlaucoma()
					.getGlaucomamedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getOtherCancer()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getOtherCancer().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getOtherCancer()
					.getCancerOthermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getLungDisease()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getLungDisease().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getLungDisease()
					.getLungDiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getHearingLoss()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getHearingLoss().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getHearingLoss()
					.getHearingLossmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getHepatisisC()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getHepatisisC().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getHepatisisC()
					.getHepatitisCmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getLiverDisease()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getLiverDisease().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getLiverDisease()
					.getLiverDiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getHypertension()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getHypertension().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getHypertension()
					.getHypertensionmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getIDOther()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getIDOther().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getIDOther()
					.getIDOthermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getKidneyDialysis()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getKidneyDialysis().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getKidneyDialysis()
					.getKidneyDialysismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMemoryLoss()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getMemoryLoss().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMemoryLoss()
					.getMemoryLossmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getLungCancer()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getLungCancer().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getLungCancer()
					.getLungCancermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getHeartAttack()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getHeartAttack().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getHeartAttack()
					.getHeartAttackmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getHiv()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getHiv().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getHiv().getHivmedicinesadministeredepicresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSkinMsRA()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getSkinMsRA().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSkinMsRA()
					.getSkinMsRAmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSleepApnea()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getSleepApnea().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSleepApnea()
					.getSleepApneamedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getThyroid()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getThyroid().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getThyroid()
					.getThyroidmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSkinCancer()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getSkinCancer().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSkinCancer()
					.getSkinCancermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getStroke()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getStroke().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getStroke()
					.getStrokemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getProstateCancer()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getProstateCancer().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getProstateCancer()
					.getProstateCancermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getTinitus()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getTinitus().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getTinitus()
					.getTinitusmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMigrane()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getMigrane().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMigrane()
					.getMigranemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getTia()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getTia().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getTia().getTiamedicinesadministeredepicresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getTuberculosis()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getTuberculosis().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getTuberculosis()
					.getTuberculosismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSkinMSGout()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getSkinMSGout().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSkinMSGout()
					.getSkinMSGoutmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getParkinsons()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getParkinsons().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getParkinsons()
					.getParkinsonsmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSknMSOthr()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getSknMSOthr().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSknMSOthr()
					.getSknMSOthrmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getOtherCancer()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getOtherCancer().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getOtherCancer()
					.getCancerOthermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSkinMSOA()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getDiseasesSimulatedResponse().getSkinMSOA().getYearDiagnosedSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getSkinMSOA()
					.getSkinMSOAmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getCoronaryarterydisease()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getCoronaryarterydisease()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getCoronaryarterydisease()
					.getCoronaryarterydiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthBipolarDisorder().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthBipolarDisorder().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthBipolarDisorder()
							.getMentalhealthBipolarDisordermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthEatingDisorder()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthEatingDisorder().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthEatingDisorder()
							.getMentalhealthEatingDisordermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthother()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthother()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthother()
					.getMentalhealthothermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthpersonalitydisorder().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthpersonalitydisorder().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthpersonalitydisorder()
							.getMentalhealthpersonalitydisordermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthsocph()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthsocph()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthsocph()
					.getMentalhealthsocphmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(veteranCohort.getDiseasesSimulatedResponse().getAmytrophiclateralsclerosis()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getAmytrophiclateralsclerosis().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getDiseasesSimulatedResponse().getAmytrophiclateralsclerosis()
							.getAmytrophiclateralsclerosismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getKidneyDiseaseAcute()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getKidneyDiseaseAcute()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getKidneyDiseaseAcute()
					.getKidneyDiseaseAcutemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthschizophrenia()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthschizophrenia().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthschizophrenia()
							.getMentalhealthschizophreniamedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getCirculatorydiseaseother().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getCirculatorydiseaseother().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getCirculatorydiseaseother().getCirculatorydiseaseothermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthDepression().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthDepression().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthDepression().getMentalhealthDepressionmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthptsd()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthptsd()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthptsd()
					.getMentalhealthptsdmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMultiplesclerosis()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMultiplesclerosis()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMultiplesclerosis()
					.getMultiplesclerosismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getCongestiveheartfailure().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getCongestiveheartfailure().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getCongestiveheartfailure().getCongestiveheartfailuremedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getLossofconsciousness()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getLossofconsciousness()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getLossofconsciousness()
					.getLossofconsciousnessmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getGiIrritableBowelSyndrome().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getGiIrritableBowelSyndrome().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getDiseasesSimulatedResponse().getGiIrritableBowelSyndrome()
							.getGiIrritableBowelSyndromemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthAnxietyPanic().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthAnxietyPanic().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthAnxietyPanic()
							.getMentalhealthAnxietyPanicmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getKidneyNoDialysis()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getKidneyNoDialysis()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getKidneyNoDialysis()
					.getKidneyNoDialysismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getHighBloodPressureDisease().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getHighBloodPressureDisease().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getDiseasesSimulatedResponse().getHighBloodPressureDisease()
							.getHighBloodPressureDiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiUlceritiveColitis()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiUlceritiveColitis()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getGiUlceritiveColitis()
					.getGiUlceritiveColitismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMaculardegeneration()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMaculardegeneration()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMaculardegeneration()
					.getMaculardegenerationmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthADHD()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthADHD()
					.getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse().getMentalhealthADHD()
					.getMentalhealthADHDmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseother().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseother().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseother().getOsteopathicdiseaseothermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getNeurostimulatorydiseaseother().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getNeurostimulatorydiseaseother().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseaseother()
							.getNeuroStimulatoryDiseaseOthermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(veteranCohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseasetbi()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getNeurostimulatorydiseasetbi().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseasetbi()
							.getNeuroStimulatoryDiseaseTBImedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseskin().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseskin().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseskin().getOsteopathicdiseaseskinmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getPulmonaryvasculardisease().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getDiseasesSimulatedResponse()
					.getPulmonaryvasculardisease().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getDiseasesSimulatedResponse().getPulmonaryvasculardisease()
							.getPulmonaryvasculardiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(
					veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getVAUseSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getVAHospResponseDropoffSitesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNonVAHospResponseDropOffSitesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getNonVARxsimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getNonVANonRxsimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getVARxsimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getHelpCompletingFormsimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getOutput_FilenameDefaultSimulatedValue() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getTimestampFormCompletiongDefaultSimulatedValue() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getImageFileDefaultSimulatedValue() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getCSIDDefaultSimulatedResponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getFormScanDateDefaultSimulatedValue() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getForm_IdDefaultSimulatedValue()
							+ COMMA_DELIMITER);
			// To be implemented
			// this.getCohortstringbuilder().append(
			// cohort.getVAUseVarssimulatedResponse().getVauseresponses().getVAUseSimulatedResponse()+COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getMailCodeDefaultSimulatedValue()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_CompleteDefaultSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecADefaultSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecBDefaultSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecCDefaultSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecDDefaultSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecEDefaultSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNum_Complete_SecFDefaultSimulatedResponse() + COMMA_DELIMITER);
			// Throwing null to be checked
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecGDefaultSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getFormDuplicationStatusDefaultSimulatedValue() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getEditStatusDefaultSimulatedValue() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.get_VersionNumber_DefaultSimulatedValue() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.get_RecordStatus_DefaultSimulatedValue() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.get_LoadDate_DefaultSimulatedValue() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(veteranCohort.getAdoptionStatusSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMultipleBirthsSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getBiologicalSonsPresenceAbsenceSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getTotalNumberOfSonsSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getBiologicalDaughtersPresenceAbsenceSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getTotalNumberOfDaughtersSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getBiologicalSistersPresenceAbsenceSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getTotalNumberOfSonsSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getBiologicalBrothersPresenceAbsenceSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getNumberOfBiologicalBrothersSimulatedResponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(veteranCohort.getMother().getYearOfBirth() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getAliveSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getYearOfDeath() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getAlzheimerspresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getAsthmapresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getBipolarpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMother().getSimulatedDiseasePresenceAbsence().getBreastcancersimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getCholesterolpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getColoncancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getCoronaryarterydiseasesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getDepressionpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getDiabetespresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getHypertensionpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getKidneynodialysispresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getLiverdiseasepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getLungcancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getLungdiseasepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMother().getSimulatedDiseasePresenceAbsence().getOthercancersimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMother().getSimulatedDiseasePresenceAbsence().getProstatecancersimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(
					veteranCohort.getMother().getSimulatedDiseasePresenceAbsence().getSkincancersimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getStrokepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMother().getSimulatedDiseasePresenceAbsence()
					.getSchizophreniapresenceabsencesimulatedresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append(veteranCohort.getFather().getYearOfBirth() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getFather().getAliveSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getFather().getYearOfDeath() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getAlzheimerspresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getAsthmapresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getBipolarpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getFather()
					.getSimulatedDiseasePresenceAbsenceFamilyMembers().getBreastcancersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getCholesterolpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getColoncancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getCoronaryarterydiseasesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getDepressionpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getDiabetespresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getHypertensionpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getKidneynodialysispresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getLiverdiseasepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getLungcancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getLungdiseasepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getFather()
					.getSimulatedDiseasePresenceAbsenceFamilyMembers().getOthercancersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getFather()
					.getSimulatedDiseasePresenceAbsenceFamilyMembers().getProstatecancersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getFather()
					.getSimulatedDiseasePresenceAbsenceFamilyMembers().getSkincancersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getStrokepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getFather().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getSchizophreniapresenceabsencesimulatedresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getAlzheimerspresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getAsthmapresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getBipolarpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers().getBreastcancersimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getCholesterolpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getColoncancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getCoronaryarterydiseasesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getDepressionpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getDiabetespresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getHypertensionpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getKidneynodialysispresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getLiverdiseasepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getLungcancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getLungdiseasepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMaternalfemalegrandparent()
					.getSimulatedDiseasePresenceAbsenceFamilyMembers().getOthercancersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers().getProstatecancersimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getMaternalfemalegrandparent()
					.getSimulatedDiseasePresenceAbsenceFamilyMembers().getSkincancersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getStrokepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getMaternalfemalegrandparent()
							.getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getSchizophreniapresenceabsencesimulatedresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getAlzheimerspresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getAsthmapresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getBipolarpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getPaternalmalegrandparent()
					.getSimulatedDiseasePresenceAbsenceFamilyMembers().getBreastcancersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getCholesterolpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getColoncancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getCoronaryarterydiseasesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getDepressionpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getDiabetespresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getHypertensionpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getKidneynodialysispresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getLiverdiseasepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getLungcancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getLungdiseasepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getPaternalmalegrandparent()
					.getSimulatedDiseasePresenceAbsenceFamilyMembers().getOthercancersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getPaternalmalegrandparent()
					.getSimulatedDiseasePresenceAbsenceFamilyMembers().getProstatecancersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append(veteranCohort.getPaternalmalegrandparent()
					.getSimulatedDiseasePresenceAbsenceFamilyMembers().getSkincancersimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getStrokepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append(veteranCohort.getPaternalmalegrandparent().getSimulatedDiseasePresenceAbsenceFamilyMembers()
							.getSchizophreniapresenceabsencesimulatedresponse() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSibling1().getSexSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSibling1().getYearOfBirth() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSibling1().getAliveSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSibling1().getYearOfDeath() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling2() == null ? "-"
									: veteranCohort.getSibling().getSibling2().getSexSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling2() == null ? "-"
									: veteranCohort.getSibling().getSibling2().getYearOfBirth() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling2() == null ? "-"
									: veteranCohort.getSibling().getSibling2().getAliveSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling2() == null ? "-"
									: veteranCohort.getSibling().getSibling2().getYearOfDeath() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling3() == null ? "-"
									: veteranCohort.getSibling().getSibling3().getSexSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling3() == null ? "-"
									: veteranCohort.getSibling().getSibling3().getYearOfBirth() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling3() == null ? "-"
									: veteranCohort.getSibling().getSibling3().getAliveSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling3() == null ? "-"
									: veteranCohort.getSibling().getSibling3().getYearOfDeath() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling4() == null ? "-"
									: veteranCohort.getSibling().getSibling4().getSexSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling4() == null ? "-"
									: veteranCohort.getSibling().getSibling4().getYearOfBirth() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling4() == null ? "-"
									: veteranCohort.getSibling().getSibling4().getAliveSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling4() == null ? "-"
									: veteranCohort.getSibling().getSibling4().getYearOfDeath() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling5() == null ? "-"
									: veteranCohort.getSibling().getSibling5().getSexSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling5() == null ? "-"
									: veteranCohort.getSibling().getSibling5().getYearOfBirth() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling5() == null ? "-"
									: veteranCohort.getSibling().getSibling5().getAliveSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling5() == null ? "-"
									: veteranCohort.getSibling().getSibling5().getYearOfDeath() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling6() == null ? "-"
									: veteranCohort.getSibling().getSibling6().getSexSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling6() == null ? "-"
									: veteranCohort.getSibling().getSibling6().getYearOfBirth() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling6() == null ? "-"
									: veteranCohort.getSibling().getSibling6().getAliveSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling6() == null ? "-"
									: veteranCohort.getSibling().getSibling6().getYearOfDeath() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling7() == null ? "-"
									: veteranCohort.getSibling().getSibling7().getSexSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling7() == null ? "-"
									: veteranCohort.getSibling().getSibling7().getYearOfBirth() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling7() == null ? "-"
									: veteranCohort.getSibling().getSibling7().getAliveSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling7() == null ? "-"
									: veteranCohort.getSibling().getSibling7().getYearOfDeath() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling8() == null ? "-"
									: veteranCohort.getSibling().getSibling8().getSexSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling8() == null ? "-"
									: veteranCohort.getSibling().getSibling8().getYearOfBirth() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling8() == null ? "-"
									: veteranCohort.getSibling().getSibling8().getAliveSimulatedResponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder()
					.append((veteranCohort.getSibling() == null) ? "-"
							: veteranCohort.getSibling().getSibling8() == null ? "-"
									: veteranCohort.getSibling().getSibling8().getYearOfDeath() + COMMA_DELIMITER);
	
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingAlzheimerspresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingAsthmapresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingBipolarpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingBreastCancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingCholesterolpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingColonCancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingCoronaryarterydiseasepresenceabsencesimulatedresponse()
							+ COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingDepressionpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingDiabetespresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingKidneynodialysispresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingLiverdiseasepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingLungcancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingLungdiseasepresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingOthercancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingProstatecancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingSkincancerpresenceabsencesimulatedresponse() + COMMA_DELIMITER);
			this.getCohortstringbuilder().append((veteranCohort.getSibling() == null) ? "-"
					: veteranCohort.getSibling().getSiblingStrokepresenceabsencesimulatedresponse() + "\n");
	
			return this.getCohortstringbuilder();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.getCohortstringbuilder();
	}

	/**
	 * @return the cohortstringbuilder
	 */
	public StringBuilder getCohortstringbuilder() {
		return this.cohortstringbuilder;
	}

	/**
	 * @param cohortstringbuilder the cohortstringbuilder to set
	 */
	public void setCohortstringbuilder(StringBuilder cohortstringbuilder) {
		this.cohortstringbuilder = cohortstringbuilder;
	}

}
