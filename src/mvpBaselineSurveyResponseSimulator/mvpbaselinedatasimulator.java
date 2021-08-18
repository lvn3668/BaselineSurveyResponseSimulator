package mvpBaselineSurveyResponseSimulator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;
import java.util.Random;
import java.util.Scanner;

import com.sun.jdi.Field;
import com.sun.jdi.Method;

import cohort.Cohort;
import simulatedDiseaseResponse.SimulatedDiseaseResponse;

/**
 * @author Lalitha Viswanathan
 * Affiliation MAVERIC / VABHS 
 *
 */
public class mvpbaselinedatasimulator implements Runnable {

	private final static String COMMA_DELIMITER = ",";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			//new BufferedWriter(new FileWriter("/data/MVPresponses.csv"));

			//BufferedReader br = new BufferedReader(new FileReader("data/BaselineSurveyVariables.csv"));

			//List<List<String>> result = new ArrayList<>();
			//String line;
			//while ((line = br.readLine()) != null) {
			//	String[] values = line.split(COMMA_DELIMITER);
			//	values[1].replace("\"", "").replace("{", "").replace("}", "").split(COMMA_DELIMITER);

			//}

				Cohort cohort = new Cohort();
				System.out.println("DOB " + cohort.getBirthDateSimulated());
				System.out.println("Sex " + cohort.getSexSimulatedResponse());
				System.out.println("Ethnicity " + cohort.getEthnicitySimulatedResponse());
				System.out.println("Ethnicity " + cohort.getEthnicitySimulatedResponse());
				System.out.println("Race White " + cohort.getRacesimulatedresponse().getRaceWhitesimulatedresponse());
				System.out.println("Race African American " + cohort.getRacesimulatedresponse().getRaceAfricanAmericansimulatedresponse());
				System.out.println("Race American Indian " + cohort.getRacesimulatedresponse().getRaceAmericanIndiansimulatedresponse());
				System.out.println("Race Asian Filipino " + cohort.getRacesimulatedresponse().getRaceAsianFilipinosimulatedresponse());
				System.out.println("Race Asian Indian " + cohort.getRacesimulatedresponse().getRaceAsianIndiansimulatedresponse());
				System.out.println("Race Asian Japan " + cohort.getRacesimulatedresponse().getRaceAsianJapansimulatedresponse());
				System.out.println("Race Asian Other " + cohort.getRacesimulatedresponse().getRaceAsianOthersimulatedresponse());
				System.out.println("Race Pacific Islander " + cohort.getRacesimulatedresponse().getRacePacificIslandersimulatedresponse());
				System.out.println("Race Asian Chinese " + cohort.getRacesimulatedresponse().getRaceAsianChinesesimulatedresponse());
				System.out.println("Adoption Status" + cohort.getAdoptionStatus());
				
				
				System.out.println("Ancestry African " + cohort.getAncestrysimulatedresponse().getAncestryafricansimulatedepicresponse());
				System.out.println("Ancestry East Asian " + cohort.getAncestrysimulatedresponse().getAncestryeastasiansimulatedepicresponse());
				System.out.println("Ancestry Middle Eastern " + cohort.getAncestrysimulatedresponse().getAncestrymiddleeasternsimulatedepicresponse());
				System.out.println("Ancestry North American " + cohort.getAncestrysimulatedresponse().getAncestrynorthamericansimulatedepicresponse());
				System.out.println("Ancestry North European " + cohort.getAncestrysimulatedresponse().getAncestrynortheuropeansimulatedepicresponse());
				System.out.println("Ancestry Samoa American " + cohort.getAncestrysimulatedresponse().getAncestrysamoaamericansimulatedepicresponse());
				System.out.println("Ancestry South Eurasian " + cohort.getAncestrysimulatedresponse().getAncestrysoutheurasiansimulatedepicresponse());
				System.out.println("Ancestry South West Asian " + cohort.getAncestrysimulatedresponse().getAncestrysouthwestasiansimulatedepicresponse());
				

				System.out.println("Education " + cohort.getEducationSimulatedResponse());
				System.out.println("Marital Status " + cohort.getMaritalStatusSimulatedResponse());
				System.out.println("QtyHouse " + cohort.getNumberOfHousesSimulatedResponse());
				System.out.println("Income " + cohort.getIncomeSimulatedResponse());
				
				
				System.out.println("VR12Q1 " + cohort.getQ1_15Simulatedresponse().getVr12Q1simulatedresponse());
				System.out.println("VR12Q2 " + cohort.getQ1_15Simulatedresponse().getVr12Q2simulatedresponse());
				System.out.println("VR12Q3 " + cohort.getQ1_15Simulatedresponse().getVr12Q3simulatedresponse());
				System.out.println("VR12Q4 " + cohort.getQ1_15Simulatedresponse().getVr12Q4simulatedresponse());
				System.out.println("VR12Q5 " + cohort.getQ1_15Simulatedresponse().getVr12Q5simulatedresponse());
				System.out.println("VR12Q6 " + cohort.getQ1_15Simulatedresponse().getVr12Q6simulatedresponse());
				System.out.println("VR12Q7 " + cohort.getQ1_15Simulatedresponse().getVr12Q7simulatedresponse());
				System.out.println("VR12Q8 " + cohort.getQ1_15Simulatedresponse().getVr12Q8simulatedresponse());
				System.out.println("VR12Q9 " + cohort.getQ1_15Simulatedresponse().getVr12Q9simulatedresponse());
				System.out.println("VR12Q10 " + cohort.getQ1_15Simulatedresponse().getVr12Q10simulatedresponse());
				System.out.println("VR12Q11 " + cohort.getQ1_15Simulatedresponse().getVr12Q11simulatedresponse());
				System.out.println("VR12Q12 " + cohort.getQ1_15Simulatedresponse().getVr12Q12simulatedresponse());
				System.out.println("VR12Q13 " + cohort.getQ1_15Simulatedresponse().getVr12Q13simulatedresponse());
				System.out.println("VR12Q14 " + cohort.getQ1_15Simulatedresponse().getVr12Q14simulatedresponse());
				System.out.println("VR12Q15 " + cohort.getQ1_15Simulatedresponse().getVr12Q15simulatedresponse());
				
				System.out.println("Pain " + cohort.getPainSimulatedResponse());
				
				System.out.println("Active Work " + cohort.getLifestyleQsimulatedresponse().getActiveWorksimulatedresponse());
				System.out.println("Active Status " + cohort.getLifestyleQsimulatedresponse().getActiveStatussimulatedresponse());
				System.out.println("Active Exercise " + cohort.getLifestyleQsimulatedresponse().getActiveExercisesimulatedresponse());
				System.out.println("Alcohol Frequency " + cohort.getLifestyleQsimulatedresponse().getAlcoholFrequencysimulatedresponse());
				System.out.println("Alcohol Quantity " + cohort.getLifestyleQsimulatedresponse().getAlcoholQuantitysimulatedresponse());
				System.out.println("Alcochol Binge " + cohort.getLifestyleQsimulatedresponse().getAlcoholBingesimulatedresponse());
				System.out.println("Smoke 100 " + cohort.getLifestyleQsimulatedresponse().getSmoke100cigarettessimulatedresponse());
				System.out.println("Smoke daily " + cohort.getLifestyleQsimulatedresponse().getSmokedailysimulatedresponse());
				System.out.println("Smoke Now " + cohort.getLifestyleQsimulatedresponse().getSmokenowsimulatedresponse());
				
				
				System.out.println("Military Br Army " + cohort.getMilitarydutysimulatedresponse().getMilitaryBranchArmysimulatedresponse());
				System.out.println("Military Br Airforce " + cohort.getMilitarydutysimulatedresponse().getMilitaryBranchAirForcesimulatedresponse());
				System.out.println("Military Br Coast Guard " + cohort.getMilitarydutysimulatedresponse().getMilitaryBranchCoastGuardsimulatedresponse());
				System.out.println("Military Br Mil Cross " + cohort.getMilitarydutysimulatedresponse().getMilitaryBranchMilitaryCrosssimulatedresponse());
				System.out.println("Military Br MM " + cohort.getMilitarydutysimulatedresponse().getMilitaryBranchMMsimulatedresponse());
				System.out.println("Military Br National Guard " + cohort.getMilitarydutysimulatedresponse().getMilitaryBranchNationalGuardsimulatedresponse());
				System.out.println("Military Br Navy " + cohort.getMilitarydutysimulatedresponse().getMilitaryBranchNavysimulatedresponse());
				System.out.println("Military Br NOAA " + cohort.getMilitarydutysimulatedresponse().getMilitaryBranchNOAAsimulatedresponse());
				System.out.println("Military Br PHS " + cohort.getMilitarydutysimulatedresponse().getMilitaryBranchPublicHealthServicesimulatedresponse());
				
				System.out.println("Military Sr Type " + cohort.getMilitarydutysimulatedresponse().getMilitaryServiceTypesimulatedresponse());
				System.out.println("Military Sr 1 " + cohort.getMilitarydutysimulatedresponse().getMilitaryService1simulatedresponse());
				System.out.println("Military Sr 2 " + cohort.getMilitarydutysimulatedresponse().getMilitaryService2simulatedresponse());
				System.out.println("Military Sr 3 " + cohort.getMilitarydutysimulatedresponse().getMilitaryService3simulatedresponse());
				System.out.println("Military Sr 4 " + cohort.getMilitarydutysimulatedresponse().getMilitaryService4simulatedresponse());
				System.out.println("Military Sr 5 " + cohort.getMilitarydutysimulatedresponse().getMilitaryService5simulatedresponse());
				System.out.println("Military Sr 6 " + cohort.getMilitarydutysimulatedresponse().getMilitaryService6simulatedresponse());
				System.out.println("Military Sr 7 " + cohort.getMilitarydutysimulatedresponse().getMilitaryService7simulatedresponse());
				System.out.println("Military Sr 8 " + cohort.getMilitarydutysimulatedresponse().getMilitaryService8simulatedresponse());
				System.out.println("Military Sr 9 " + cohort.getMilitarydutysimulatedresponse().getMilitaryService9simulatedresponse());
				
				System.out.println("Service Outside US " + cohort.getMilitarydutysimulatedresponse().getServiceOutsideUSsimulatedresponse());
				
				System.out.println("Stn Asia Far East " + cohort.getMilitarydutysimulatedresponse().getStationAsiaFareastsimulatedresponse());
				System.out.println("Stn South Pacific " + cohort.getMilitarydutysimulatedresponse().getStationAsiaSouthPacificsimulatedresponse());
				System.out.println("Stn Carribean " + cohort.getMilitarydutysimulatedresponse().getStationCarribeansimulatedresponse());
				System.out.println("Stn East European " + cohort.getMilitarydutysimulatedresponse().getStationEastEuropeansimulatedresponse());
				System.out.println("Stn Mexico " + cohort.getMilitarydutysimulatedresponse().getStationMexicosimulatedresponse());
				System.out.println("Stn Middle East " + cohort.getMilitarydutysimulatedresponse().getStationMiddleEastsimulatedresponse());
				System.out.println("Stn North Central European " + cohort.getMilitarydutysimulatedresponse().getStationNortHCentralEuropeansimulatedresponse());
				System.out.println("Stn Other " + cohort.getMilitarydutysimulatedresponse().getStationOthersimulatedresponse());
				System.out.println("Stn South Central American " + cohort.getMilitarydutysimulatedresponse().getStationSouthCentralAmericansimulatedresponse());
				System.out.println("Stn South European Mediterranean " + cohort.getMilitarydutysimulatedresponse().getStationSouthEuropeanMediterraneansimulatedresponse());
				System.out.println("Stn US Canada " + cohort.getMilitarydutysimulatedresponse().getStationUSCanadasimulatedresponse());				
				System.out.println("Deploy Gulf " + cohort.getMilitarydutysimulatedresponse().getDeployGulfsimulatedresponse());	
				System.out.println("Deploy OEFOIF " + cohort.getMilitarydutysimulatedresponse().getDeployOEFOIFsimulatedresponse());	
				
				System.out.println("Exposure to PyrBr " + cohort.getChemicalexposuresimulatedresponse().getExposurePyrBrsimulatedresponse());
				System.out.println("Exposure to AgentO " + cohort.getChemicalexposuresimulatedresponse().getExposureToAgentOSimulatedResponse());
				System.out.println("Exposure to Anthrax " + cohort.getChemicalexposuresimulatedresponse().getExposureToAnthraxsimulatedresponse());
				System.out.println("Exposure to ChemBioAgents " + cohort.getChemicalexposuresimulatedresponse().getExposureToChemicalBioAgentssimulatedresponse());
				
				System.out.println("Handedness " + cohort.getHandednesssimulatedresponse());
				System.out.println("Height in ft " + cohort.getHeightSRFtSimulatedresponse());
				System.out.println("Height in inches " + cohort.getHeightSRInchesSimulatedresponse());
				System.out.println("Weight in lb " + cohort.getWeightSRLbsSimulatedResponse());
				System.out.println("Skin Color " + cohort.getSkinColorSimulatedResponse());
				System.out.println("Hair Color " + cohort.getHairColorSimulatedResponse());
				System.out.println("Eye Color " + cohort.getEyeColorSimulatedResponse());
				
				
				System.out.println("Diseases Simulated response " + cohort.getDiseasesSimulatedResponse());

				SimulatedDiseaseResponse SDR = cohort.getDiseasesSimulatedResponse();
				
				System.out.println("AcuteSpinalCordInjuryDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getAcuteSpinalCordInjury().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "AcuteSpinalCordInjuryYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getAcuteSpinalCordInjury().getYearDiagnosedSimulatedResponse());
				System.out.println("AcuteSpinalCordInjuryMedsAdministered "+cohort.getDiseasesSimulatedResponse().getAcuteSpinalCordInjury().getAcuteSpinalCordInjurymedicinesadministeredepicresponse());
				System.out.println("BlindnessDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getBlindness().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "BlindnessYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getBlindness().getYearDiagnosedSimulatedResponse());
				System.out.println("BlindnessMedsAdministered "+cohort.getDiseasesSimulatedResponse().getBlindness().getBlindnessmedicinesadministeredepicresponse());
				System.out.println("BloodclotsDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getBloodclots().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "BloodclotsYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getBloodclots().getYearDiagnosedSimulatedResponse());
				System.out.println("BloodclotsMedsAdministered "+cohort.getDiseasesSimulatedResponse().getBloodclots().getBloodclotsmedicinesadministeredepicresponse());
				System.out.println("AlzheimersDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getAlzheimers().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "AlzheimersYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getAlzheimers().getYearDiagnosedSimulatedResponse());
				System.out.println("AlzheimersMedsAdministered "+cohort.getDiseasesSimulatedResponse().getAlzheimers().getAlzheimersmedicinesadministeredepicresponse());
				System.out.println("AsthmaDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getAsthma().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "AsthmaYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getAsthma().getYearDiagnosedSimulatedResponse());
				System.out.println("AsthmaMedsAdministered "+cohort.getDiseasesSimulatedResponse().getAsthma().getAsthmamedicinesadministeredepicresponse());
				System.out.println("ArthritisDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getArthritis().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "ArthritisYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getArthritis().getYearDiagnosedSimulatedResponse());
				System.out.println("ArthritisMedsAdministered "+cohort.getDiseasesSimulatedResponse().getArthritis().getArthritismedicinesadministeredepicresponse());
				System.out.println("CataractDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getCataract().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "CataractYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getCataract().getYearDiagnosedSimulatedResponse());
				System.out.println("CataractMedsAdministered "+cohort.getDiseasesSimulatedResponse().getCataract().getCataractmedicinesadministeredepicresponse());
				System.out.println("CholesterolDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getCholesterol().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "CholesterolYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getCholesterol().getYearDiagnosedSimulatedResponse());
				System.out.println("CholesterolMedsAdministered "+cohort.getDiseasesSimulatedResponse().getCholesterol().getCholesterolmedicinesadministeredepicresponse());
				System.out.println("ColonCancerDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getColonCancer().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "ColonCancerYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getColonCancer().getYearDiagnosedSimulatedResponse());
				System.out.println("ColonCancerMedsAdministered "+cohort.getDiseasesSimulatedResponse().getColonCancer().getColonCancermedicinesadministeredepicresponse());
				System.out.println("GiAcidRefluxDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getGiAcidReflux().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "GiAcidRefluxYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getGiAcidReflux().getYearDiagnosedSimulatedResponse());
				System.out.println("GiAcidRefluxMedsAdministered "+cohort.getDiseasesSimulatedResponse().getGiAcidReflux().getGiAcidRefluxmedicinesadministeredepicresponse());
				System.out.println("GiCeliacDiseaseDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getGiCeliacDisease().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "GiCeliacDiseaseYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getGiCeliacDisease().getYearDiagnosedSimulatedResponse());
				System.out.println("GiCeliacDiseaseMedsAdministered "+cohort.getDiseasesSimulatedResponse().getGiCeliacDisease().getGiCeliacDiseasemedicinesadministeredepicresponse());
				System.out.println("BreastCancerDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getBreastCancer().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "BreastCancerYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getBreastCancer().getYearDiagnosedSimulatedResponse());
				System.out.println("BreastCancerMedsAdministered "+cohort.getDiseasesSimulatedResponse().getBreastCancer().getBreastCancermedicinesadministeredepicresponse());
				System.out.println("DementiaDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getDementia().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "DementiaYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getDementia().getYearDiagnosedSimulatedResponse());
				System.out.println("DementiaMedsAdministered "+cohort.getDiseasesSimulatedResponse().getDementia().getDementiamedicinesadministeredepicresponse());
				System.out.println("GIObstructionDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getGiobstruction().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "GIObstructionYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getGiobstruction().getYearDiagnosedSimulatedResponse());
				System.out.println("GIObstructionMedsAdministered "+cohort.getDiseasesSimulatedResponse().getGiobstruction().getGIObstructionmedicinesadministeredepicresponse());
				System.out.println("GiOtherDiseaseDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getGiOtherDisease().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "GiOtherDiseaseYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getGiOtherDisease().getYearDiagnosedSimulatedResponse());
				System.out.println("GiOtherDiseaseMedsAdministered "+cohort.getDiseasesSimulatedResponse().getGiOtherDisease().getGiOtherDiseasemedicinesadministeredepicresponse());
				System.out.println("GiPolypDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getGiPolyp().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "GiPolypYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getGiPolyp().getYearDiagnosedSimulatedResponse());
				System.out.println("GiPolypMedsAdministered "+cohort.getDiseasesSimulatedResponse().getGiPolyp().getGiPolypmedicinesadministeredepicresponse());
				System.out.println("DiabetesDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getDiabetes().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "DiabetesYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getDiabetes().getYearDiagnosedSimulatedResponse());
				System.out.println("DiabetesMedsAdministered "+cohort.getDiseasesSimulatedResponse().getDiabetes().getDiabetesmedicinesadministeredepicresponse());
				System.out.println("GiCrohnsDiseaseDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getGiCrohnsDisease().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "GiCrohnsDiseaseYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getGiCrohnsDisease().getYearDiagnosedSimulatedResponse());
				System.out.println("GiCrohnsDiseaseMedsAdministered "+cohort.getDiseasesSimulatedResponse().getGiCrohnsDisease().getGiCrohnsDiseasemedicinesadministeredepicresponse());
				System.out.println("GiUlcerDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getGiUlcer().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "GiUlcerYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getGiUlcer().getYearDiagnosedSimulatedResponse());
				System.out.println("GiUlcerMedsAdministered "+cohort.getDiseasesSimulatedResponse().getGiUlcer().getGiUlcermedicinesadministeredepicresponse());
				System.out.println("CadDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getCad().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "CadYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getCad().getYearDiagnosedSimulatedResponse());
				System.out.println("CadMedsAdministered "+cohort.getDiseasesSimulatedResponse().getCad().getCoronaryarterydiseasemedicinesadministeredepicresponse());
				System.out.println("EpilepsyDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getEpilepsy().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "EpilepsyYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getEpilepsy().getYearDiagnosedSimulatedResponse());
				System.out.println("EpilepsyMedsAdministered "+cohort.getDiseasesSimulatedResponse().getEpilepsy().getEpilepsymedicinesadministeredepicresponse());
				System.out.println("ChfDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getChf().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "ChfYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getChf().getYearDiagnosedSimulatedResponse());
				System.out.println("ChfMedsAdministered "+cohort.getDiseasesSimulatedResponse().getChf().getCongestiveheartfailuremedicinesadministeredepicresponse());
				System.out.println("BPHDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getBPH().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "BPHYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getBPH().getYearDiagnosedSimulatedResponse());
				System.out.println("BPHMedsAdministered "+cohort.getDiseasesSimulatedResponse().getBPH().getBPHmedicinesadministeredepicresponse());
				System.out.println("GlaucomaDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getGlaucoma().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "GlaucomaYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getGlaucoma().getYearDiagnosedSimulatedResponse());
				System.out.println("GlaucomaMedsAdministered "+cohort.getDiseasesSimulatedResponse().getGlaucoma().getGlaucomamedicinesadministeredepicresponse());
				System.out.println("CancerOtherDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getOtherCancer().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "CancerOtherYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getOtherCancer().getYearDiagnosedSimulatedResponse());
				System.out.println("CancerOtherMedsAdministered "+cohort.getDiseasesSimulatedResponse().getOtherCancer().getCancerOthermedicinesadministeredepicresponse());
				System.out.println("LungDiseaseDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getLungDisease().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "LungDiseaseYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getLungDisease().getYearDiagnosedSimulatedResponse());
				System.out.println("LungDiseaseMedsAdministered "+cohort.getDiseasesSimulatedResponse().getLungDisease().getLungDiseasemedicinesadministeredepicresponse());
				System.out.println("HearingLossDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getHearingLoss().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "HearingLossYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getHearingLoss().getYearDiagnosedSimulatedResponse());
				System.out.println("HearingLossMedsAdministered "+cohort.getDiseasesSimulatedResponse().getHearingLoss().getHearingLossmedicinesadministeredepicresponse());
				System.out.println("HepatisisCDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getHepatisisC().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "HepatisisCYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getHepatisisC().getYearDiagnosedSimulatedResponse());
				System.out.println("HepatisisCMedsAdministered "+cohort.getDiseasesSimulatedResponse().getHepatisisC().getHepatitisCmedicinesadministeredepicresponse());
				System.out.println("LiverDiseaseDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getLiverDisease().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "LiverDiseaseYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getLiverDisease().getYearDiagnosedSimulatedResponse());
				System.out.println("LiverDiseaseMedsAdministered "+cohort.getDiseasesSimulatedResponse().getLiverDisease().getLiverDiseasemedicinesadministeredepicresponse());
				System.out.println("HypertensionDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getHypertension().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "HypertensionYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getHypertension().getYearDiagnosedSimulatedResponse());
				System.out.println("HypertensionMedsAdministered "+cohort.getDiseasesSimulatedResponse().getHypertension().getHypertensionmedicinesadministeredepicresponse());
				System.out.println("IDOtherDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getIDOther().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "IDOtherYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getIDOther().getYearDiagnosedSimulatedResponse());
				System.out.println("IDOtherMedsAdministered "+cohort.getDiseasesSimulatedResponse().getIDOther().getIDOthermedicinesadministeredepicresponse());
				System.out.println("KidneyDialysisDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getKidneyDialysis().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "KidneyDialysisYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getKidneyDialysis().getYearDiagnosedSimulatedResponse());
				System.out.println("KidneyDialysisMedsAdministered "+cohort.getDiseasesSimulatedResponse().getKidneyDialysis().getKidneyDialysismedicinesadministeredepicresponse());
				System.out.println("MemoryLossDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMemoryLoss().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MemoryLossYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMemoryLoss().getYearDiagnosedSimulatedResponse());
				System.out.println("MemoryLossMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMemoryLoss().getMemoryLossmedicinesadministeredepicresponse());
				System.out.println("LungCancerDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getLungCancer().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "LungCancerYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getLungCancer().getYearDiagnosedSimulatedResponse());
				System.out.println("LungCancerMedsAdministered "+cohort.getDiseasesSimulatedResponse().getLungCancer().getLungCancermedicinesadministeredepicresponse());
				System.out.println("HeartAttackDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getHeartAttack().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "HeartAttackYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getHeartAttack().getYearDiagnosedSimulatedResponse());
				System.out.println("HeartAttackMedsAdministered "+cohort.getDiseasesSimulatedResponse().getHeartAttack().getHeartAttackmedicinesadministeredepicresponse());
				System.out.println("HivDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getHiv().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "HivYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getHiv().getYearDiagnosedSimulatedResponse());
				System.out.println("HivMedsAdministered "+cohort.getDiseasesSimulatedResponse().getHiv().getHivmedicinesadministeredepicresponse());
				System.out.println("SkinMsRADiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getSkinMsRA().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "SkinMsRAYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getSkinMsRA().getYearDiagnosedSimulatedResponse());
				System.out.println("SkinMsRAMedsAdministered "+cohort.getDiseasesSimulatedResponse().getSkinMsRA().getSkinMsRAmedicinesadministeredepicresponse());
				System.out.println("SleepApneaDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getSleepApnea().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "SleepApneaYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getSleepApnea().getYearDiagnosedSimulatedResponse());
				System.out.println("SleepApneaMedsAdministered "+cohort.getDiseasesSimulatedResponse().getSleepApnea().getSleepApneamedicinesadministeredepicresponse());
				System.out.println("ThyroidDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getThyroid().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "ThyroidYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getThyroid().getYearDiagnosedSimulatedResponse());
				System.out.println("ThyroidMedsAdministered "+cohort.getDiseasesSimulatedResponse().getThyroid().getThyroidmedicinesadministeredepicresponse());
				System.out.println("SkinCancerDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getSkinCancer().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "SkinCancerYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getSkinCancer().getYearDiagnosedSimulatedResponse());
				System.out.println("SkinCancerMedsAdministered "+cohort.getDiseasesSimulatedResponse().getSkinCancer().getSkinCancermedicinesadministeredepicresponse());
				System.out.println("StrokeDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getStroke().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "StrokeYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getStroke().getYearDiagnosedSimulatedResponse());
				System.out.println("StrokeMedsAdministered "+cohort.getDiseasesSimulatedResponse().getStroke().getStrokemedicinesadministeredepicresponse());
				System.out.println("ProstateCancerDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getProstateCancer().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "ProstateCancerYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getProstateCancer().getYearDiagnosedSimulatedResponse());
				System.out.println("ProstateCancerMedsAdministered "+cohort.getDiseasesSimulatedResponse().getProstateCancer().getProstateCancermedicinesadministeredepicresponse());
				System.out.println("TinitusDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getTinitus().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "TinitusYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getTinitus().getYearDiagnosedSimulatedResponse());
				System.out.println("TinitusMedsAdministered "+cohort.getDiseasesSimulatedResponse().getTinitus().getTinitusmedicinesadministeredepicresponse());
				System.out.println("MigraneDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMigrane().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MigraneYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMigrane().getYearDiagnosedSimulatedResponse());
				System.out.println("MigraneMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMigrane().getMigranemedicinesadministeredepicresponse());
				System.out.println("TiaDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getTia().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "TiaYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getTia().getYearDiagnosedSimulatedResponse());
				System.out.println("TiaMedsAdministered "+cohort.getDiseasesSimulatedResponse().getTia().getTiamedicinesadministeredepicresponse());
				System.out.println("TuberculosisDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getTuberculosis().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "TuberculosisYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getTuberculosis().getYearDiagnosedSimulatedResponse());
				System.out.println("TuberculosisMedsAdministered "+cohort.getDiseasesSimulatedResponse().getTuberculosis().getTuberculosismedicinesadministeredepicresponse());
				System.out.println("SkinMSGoutDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getSkinMSGout().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "SkinMSGoutYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getSkinMSGout().getYearDiagnosedSimulatedResponse());
				System.out.println("SkinMSGoutMedsAdministered "+cohort.getDiseasesSimulatedResponse().getSkinMSGout().getSkinMSGoutmedicinesadministeredepicresponse());
				System.out.println("ParkinsonsDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getParkinsons().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "ParkinsonsYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getParkinsons().getYearDiagnosedSimulatedResponse());
				System.out.println("ParkinsonsMedsAdministered "+cohort.getDiseasesSimulatedResponse().getParkinsons().getParkinsonsmedicinesadministeredepicresponse());
				System.out.println("SknMSOthrDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getSknMSOthr().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "SknMSOthrYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getSknMSOthr().getYearDiagnosedSimulatedResponse());
				System.out.println("SknMSOthrMedsAdministered "+cohort.getDiseasesSimulatedResponse().getSknMSOthr().getSknMSOthrmedicinesadministeredepicresponse());
				System.out.println("OtherCancerDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getOtherCancer().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "OtherCancerYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getOtherCancer().getYearDiagnosedSimulatedResponse());
				System.out.println("OtherCancerMedsAdministered "+cohort.getDiseasesSimulatedResponse().getOtherCancer().getCancerOthermedicinesadministeredepicresponse());
				System.out.println("SkinMSOADiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getSkinMSOA().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "SkinMSOAYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getSkinMSOA().getYearDiagnosedSimulatedResponse());
				System.out.println("SkinMSOAMedsAdministered "+cohort.getDiseasesSimulatedResponse().getSkinMSOA().getSkinMSOAmedicinesadministeredepicresponse());
				System.out.println("CoronaryarterydiseaseDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getCoronaryarterydisease().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "CoronaryarterydiseaseYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getCoronaryarterydisease().getYearDiagnosedSimulatedResponse());
				System.out.println("CoronaryarterydiseaseMedsAdministered "+cohort.getDiseasesSimulatedResponse().getCoronaryarterydisease().getCoronaryarterydiseasemedicinesadministeredepicresponse());
				System.out.println("MentalhealthBipolarDisorderDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMentalhealthBipolarDisorder().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MentalhealthBipolarDisorderYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMentalhealthBipolarDisorder().getYearDiagnosedSimulatedResponse());
				System.out.println("MentalhealthBipolarDisorderMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMentalhealthBipolarDisorder().getMentalhealthBipolarDisordermedicinesadministeredepicresponse());
				System.out.println("MentalhealthEatingDisorderDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMentalhealthEatingDisorder().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MentalhealthEatingDisorderYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMentalhealthEatingDisorder().getYearDiagnosedSimulatedResponse());
				System.out.println("MentalhealthEatingDisorderMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMentalhealthEatingDisorder().getMentalhealthEatingDisordermedicinesadministeredepicresponse());
				System.out.println("MentalhealthotherDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMentalhealthother().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MentalhealthotherYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMentalhealthother().getYearDiagnosedSimulatedResponse());
				System.out.println("MentalhealthotherMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMentalhealthother().getMentalhealthothermedicinesadministeredepicresponse());
				System.out.println("MentalhealthpersonalitydisorderDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMentalhealthpersonalitydisorder().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MentalhealthpersonalitydisorderYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMentalhealthpersonalitydisorder().getYearDiagnosedSimulatedResponse());
				System.out.println("MentalhealthpersonalitydisorderMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMentalhealthpersonalitydisorder().getMentalhealthpersonalitydisordermedicinesadministeredepicresponse());
				System.out.println("MentalhealthsocphDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMentalhealthsocph().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MentalhealthsocphYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMentalhealthsocph().getYearDiagnosedSimulatedResponse());
				System.out.println("MentalhealthsocphMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMentalhealthsocph().getMentalhealthsocphmedicinesadministeredepicresponse());
				System.out.println("AmytrophiclateralsclerosisDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getAmytrophiclateralsclerosis().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "AmytrophiclateralsclerosisYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getAmytrophiclateralsclerosis().getYearDiagnosedSimulatedResponse());
				System.out.println("AmytrophiclateralsclerosisMedsAdministered "+cohort.getDiseasesSimulatedResponse().getAmytrophiclateralsclerosis().getAmytrophiclateralsclerosismedicinesadministeredepicresponse());
				System.out.println("KidneyDiseaseAcuteDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getKidneyDiseaseAcute().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "KidneyDiseaseAcuteYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getKidneyDiseaseAcute().getYearDiagnosedSimulatedResponse());
				System.out.println("KidneyDiseaseAcuteMedsAdministered "+cohort.getDiseasesSimulatedResponse().getKidneyDiseaseAcute().getKidneyDiseaseAcutemedicinesadministeredepicresponse());
				System.out.println("MentalhealthschizophreniaDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMentalhealthschizophrenia().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MentalhealthschizophreniaYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMentalhealthschizophrenia().getYearDiagnosedSimulatedResponse());
				System.out.println("MentalhealthschizophreniaMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMentalhealthschizophrenia().getMentalhealthschizophreniamedicinesadministeredepicresponse());
				System.out.println("CirculatorydiseaseotherDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getCirculatorydiseaseother().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "CirculatorydiseaseotherYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getCirculatorydiseaseother().getYearDiagnosedSimulatedResponse());
				System.out.println("CirculatorydiseaseotherMedsAdministered "+cohort.getDiseasesSimulatedResponse().getCirculatorydiseaseother().getCirculatorydiseaseothermedicinesadministeredepicresponse());
				System.out.println("MentalhealthDepressionDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMentalhealthDepression().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MentalhealthDepressionYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMentalhealthDepression().getYearDiagnosedSimulatedResponse());
				System.out.println("MentalhealthDepressionMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMentalhealthDepression().getMentalhealthDepressionmedicinesadministeredepicresponse());
				System.out.println("MentalhealthptsdDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMentalhealthptsd().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MentalhealthptsdYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMentalhealthptsd().getYearDiagnosedSimulatedResponse());
				System.out.println("MentalhealthptsdMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMentalhealthptsd().getMentalhealthptsdmedicinesadministeredepicresponse());
				System.out.println("MultiplesclerosisDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMultiplesclerosis().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MultiplesclerosisYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMultiplesclerosis().getYearDiagnosedSimulatedResponse());
				System.out.println("MultiplesclerosisMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMultiplesclerosis().getMultiplesclerosismedicinesadministeredepicresponse());
				System.out.println("CongestiveheartfailureDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getCongestiveheartfailure().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "CongestiveheartfailureYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getCongestiveheartfailure().getYearDiagnosedSimulatedResponse());
				System.out.println("CongestiveheartfailureMedsAdministered "+cohort.getDiseasesSimulatedResponse().getCongestiveheartfailure().getCongestiveheartfailuremedicinesadministeredepicresponse());
				System.out.println("LossofconsciousnessDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getLossofconsciousness().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "LossofconsciousnessYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getLossofconsciousness().getYearDiagnosedSimulatedResponse());
				System.out.println("LossofconsciousnessMedsAdministered "+cohort.getDiseasesSimulatedResponse().getLossofconsciousness().getLossofconsciousnessmedicinesadministeredepicresponse());
				System.out.println("GiIrritableBowelSyndromeDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getGiIrritableBowelSyndrome().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "GiIrritableBowelSyndromeYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getGiIrritableBowelSyndrome().getYearDiagnosedSimulatedResponse());
				System.out.println("GiIrritableBowelSyndromeMedsAdministered "+cohort.getDiseasesSimulatedResponse().getGiIrritableBowelSyndrome().getGiIrritableBowelSyndromemedicinesadministeredepicresponse());
				System.out.println("MentalhealthAnxietyPanicDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMentalhealthAnxietyPanic().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MentalhealthAnxietyPanicYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMentalhealthAnxietyPanic().getYearDiagnosedSimulatedResponse());
				System.out.println("MentalhealthAnxietyPanicMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMentalhealthAnxietyPanic().getMentalhealthAnxietyPanicmedicinesadministeredepicresponse());
				System.out.println("KidneyNoDialysisDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getKidneyNoDialysis().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "KidneyNoDialysisYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getKidneyNoDialysis().getYearDiagnosedSimulatedResponse());
				System.out.println("KidneyNoDialysisMedsAdministered "+cohort.getDiseasesSimulatedResponse().getKidneyNoDialysis().getKidneyNoDialysismedicinesadministeredepicresponse());
				System.out.println("HighBloodPressureDiseaseDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getHighBloodPressureDisease().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "HighBloodPressureDiseaseYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getHighBloodPressureDisease().getYearDiagnosedSimulatedResponse());
				System.out.println("HighBloodPressureDiseaseMedsAdministered "+cohort.getDiseasesSimulatedResponse().getHighBloodPressureDisease().getHighBloodPressureDiseasemedicinesadministeredepicresponse());
				System.out.println("GiUlceritiveColitisDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getGiUlceritiveColitis().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "GiUlceritiveColitisYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getGiUlceritiveColitis().getYearDiagnosedSimulatedResponse());
				System.out.println("GiUlceritiveColitisMedsAdministered "+cohort.getDiseasesSimulatedResponse().getGiUlceritiveColitis().getGiUlceritiveColitismedicinesadministeredepicresponse());
				System.out.println("MaculardegenerationDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMaculardegeneration().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MaculardegenerationYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMaculardegeneration().getYearDiagnosedSimulatedResponse());
				System.out.println("MaculardegenerationMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMaculardegeneration().getMaculardegenerationmedicinesadministeredepicresponse());
				System.out.println("MentalhealthADHDDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getMentalhealthADHD().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "MentalhealthADHDYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getMentalhealthADHD().getYearDiagnosedSimulatedResponse());
				System.out.println("MentalhealthADHDMedsAdministered "+cohort.getDiseasesSimulatedResponse().getMentalhealthADHD().getMentalhealthADHDmedicinesadministeredepicresponse());
				System.out.println("OsteopathicdiseaseotherDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getOsteopathicdiseaseother().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "OsteopathicdiseaseotherYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getOsteopathicdiseaseother().getYearDiagnosedSimulatedResponse());
				System.out.println("OsteopathicdiseaseotherMedsAdministered "+cohort.getDiseasesSimulatedResponse().getOsteopathicdiseaseother().getOsteopathicdiseaseothermedicinesadministeredepicresponse());
				System.out.println("NeuroStimulatoryDiseaseOtherDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseaseother().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "NeuroStimulatoryDiseaseOtherYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseaseother().getYearDiagnosedSimulatedResponse());
				System.out.println("NeuroStimulatoryDiseaseOtherMedsAdministered "+cohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseaseother().getNeuroStimulatoryDiseaseOthermedicinesadministeredepicresponse());
				System.out.println("NeuroStimulatoryDiseaseTBIDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseasetbi().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "NeuroStimulatoryDiseaseTBIYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseasetbi().getYearDiagnosedSimulatedResponse());
				System.out.println("NeuroStimulatoryDiseaseTBIMedsAdministered "+cohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseasetbi().getNeuroStimulatoryDiseaseTBImedicinesadministeredepicresponse());
				System.out.println("OsteopathicdiseaseskinDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getOsteopathicdiseaseskin().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "OsteopathicdiseaseskinYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getOsteopathicdiseaseskin().getYearDiagnosedSimulatedResponse());
				System.out.println("OsteopathicdiseaseskinMedsAdministered "+cohort.getDiseasesSimulatedResponse().getOsteopathicdiseaseskin().getOsteopathicdiseaseskinmedicinesadministeredepicresponse());
				System.out.println("PulmonaryvasculardiseaseDiseasePresenceAbsence " + cohort.getDiseasesSimulatedResponse().getPulmonaryvasculardisease().getDiseasepresenceorabsencesimulatedepicresponse());
				System.out.println( "PulmonaryvasculardiseaseYearDiagnosed " + cohort.getDiseasesSimulatedResponse().getPulmonaryvasculardisease().getYearDiagnosedSimulatedResponse());
				System.out.println("PulmonaryvasculardiseaseMedsAdministered "+cohort.getDiseasesSimulatedResponse().getPulmonaryvasculardisease().getPulmonaryvasculardiseasemedicinesadministeredepicresponse());
				
				
				System.out.println(" VA USE " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getVAUseSimulatedResponse());
				System.out.println(" VA Hosp Response Dropoff Site " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getVAHospResponseDropoffSitesimulatedresponse());       
				System.out.println(" Non VA Hosp Response Dropoff Site " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getNonVAHospResponseDropOffSitesimulatedresponse());  
				System.out.println(" Non VA Rx " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getNonVARxsimulatedresponse());  
				System.out.println(" Non VA Non Rx " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getNonVANonRxsimulatedresponse());  
				System.out.println(" VA Rx " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getVARxsimulatedresponse());  
				System.out.println(" Help Completing " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getHelpCompletingFormsimulatedresponse());
				System.out.println(" O/P File Name " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getOutput_FilenameDefaultSimulatedValue());
				System.out.println(" Time stamp " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getTimestampFormCompletiongDefaultSimulatedValue());
				System.out.println(" Image file " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getImageFileDefaultSimulatedValue());
				System.out.println(" CSID " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getCSIDDefaultSimulatedResponse());
				System.out.println(" Scan Date " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getFormScanDateDefaultSimulatedValue());
				System.out.println(" Form Id " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getForm_IdDefaultSimulatedValue());
				//System.out.println(" Form " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getVAUseSimulatedResponse());
				System.out.println(" Mail Code " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getMailCodeDefaultSimulatedValue());
				System.out.println(" Num Complete " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getNumQ_CompleteDefaultSimulatedResponse());
				System.out.println(" Num Complete A " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getNumQ_Complete_SecADefaultSimulatedResponse());
				System.out.println(" Num Complete B " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getNumQ_Complete_SecBDefaultSimulatedResponse());
				System.out.println(" Num Complete C " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getNumQ_Complete_SecCDefaultSimulatedResponse());
				System.out.println(" Num Complete D " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getNumQ_Complete_SecDDefaultSimulatedResponse());
				System.out.println(" Num Complete E " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getNumQ_Complete_SecEDefaultSimulatedResponse());
				System.out.println(" Num Complete F " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getNum_Complete_SecFDefaultSimulatedResponse());
				System.out.println(" Num Complete G " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getNumQ_Complete_SecGDefaultSimulatedResponse());
				System.out.println(" Duplication Status " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getFormDuplicationStatusDefaultSimulatedValue());
				System.out.println(" Edit Status " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().getEditStatusDefaultSimulatedValue());
				System.out.println(" Version Number " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().get_VersionNumber_DefaultSimulatedValue());
				System.out.println(" Record Status " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().get_RecordStatus_DefaultSimulatedValue());
				System.out.println(" Version Number " + cohort.getVAUseVarssimulatedResponse().getVauseresponses().get_LoadDate_DefaultSimulatedValue());
				
				
			// System.out.println(result);
			//br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
//	public static void printSDR(SimulatedDiseaseResponse sdr)
//	{
//		Class<?>[] classlist = sdr.class.getClasses();
//	}

	/*
	 * public static String printgetters(Object c) {
	 * 
	 * Process process = null; try { StringBuilder diseasehierarchycalls = new
	 * StringBuilder(); java.lang.reflect.Method[] methlist =
	 * c.getClass().getDeclaredMethods(); int i = 0;
	 * 
	 * while (i < c.getClass().getDeclaredMethods().length) { String methodname; if
	 * (methlist[i].getName().startsWith("get") &&
	 * (methlist[i].getReturnType().getName().startsWith("Disease"))) { methodname =
	 * methlist[i].getName().replace("()",""); StringBuilder yeardiagnosedmethodname
	 * = new StringBuilder(methlist[i].getName()); StringBuilder
	 * diseasemedsadministeredmethodName = new StringBuilder(methlist[i].getName());
	 * StringBuilder diseasepresenceabsencemethname = new
	 * StringBuilder(methlist[i].getName()); String epicvarname =
	 * methlist[i].getName().replace("get", "").replace("()", "");
	 * yeardiagnosedmethodname = yeardiagnosedmethodname.insert(0,
	 * "System.out.println( \"" + epicvarname
	 * +"YearDiagnosed \" + cohort.getDiseasesSimulatedResponse().").append(
	 * "().getYearDiagnosedSimulatedResponse());"); diseasepresenceabsencemethname =
	 * diseasepresenceabsencemethname.insert(0,"System.out.println(\"" + epicvarname
	 * +"DiseasePresenceAbsence \" + cohort.getDiseaseSimulatedResponse().").append(
	 * "().getDiseasepresenceorabsencesimulatedepicresponse());");
	 * diseasemedsadministeredmethodName = new
	 * StringBuilder(methlist[i].getName()).insert(0, "System.out.println(\""+
	 * epicvarname+"MedsAdministered \"+cohort.getDiseaseSimulatedResponse().").
	 * append("()."+methodname+"medicinesadministeredepicresponse();");
	 * System.out.println(diseasepresenceabsencemethname);
	 * System.out.println(yeardiagnosedmethodname);
	 * System.out.println(diseasemedsadministeredmethodName); //process =
	 * Runtime.getRuntime().exec(methName.toString());
	 * 
	 * //Scanner scanner = new Scanner(process.getInputStream());
	 * //scanner.useDelimiter("\r\n");
	 * 
	 * //while (scanner.hasNext()) { // System.out.println(scanner.next()); //}
	 * 
	 * //scanner.close(); } i++; } } catch (Exception e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } //catch (InstantiationException e) { //
	 * TODO Auto-generated catch block //e.printStackTrace(); //} catch
	 * (IllegalAccessException e) { // TODO Auto-generated catch block
	 * //e.printStackTrace(); //} //return null; return null;
	 * 
	 * }
	 */	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	// TBD:
	// Simulate cohort
	// Simulate responses for adjunct (M, F, Mgp, Fgp, Sib)
//  Write out to file 
}
