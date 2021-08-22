package mvpBaselineSurveyResponseSimulator;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cohort.VeteranCohort;
import cohortUtils.CohortUtilities;

import java.lang.ref.Cleaner;
/**
 * @author Lalitha Viswanathan Affiliation MAVERIC / VABHS
 *
 */
public class mvpbaselinedatasimulator implements Callable<VeteranCohort>, AutoCloseable {


	private static class State implements Runnable {
		public void run() 
		{
			
		}
	}
	private static final String COMMA_DELIMITER =",";
	private static final int numberOfCohorts = 1000000;
	private static final Cleaner cleaner = Cleaner.create();

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			// new BufferedWriter(new FileWriter("/data/MVPresponses.csv")+COMMA_DELIMITER);

			// BufferedReader br = new BufferedReader(new
			// FileReader("data/BaselineSurveyVariables.csv")+COMMA_DELIMITER);

			// List<List<String>> result = new ArrayList<>();
			// String line;
			// while ((line = br.readLine()+COMMA_DELIMITER) != null) {
			// String[] values = line.split(COMMA_DELIMITER);
			// values[1].replace("\"", "").replace("{", "").replace("}",
			// "").split(COMMA_DELIMITER);

			// }
			  Cleaner.Cleanable cleanable; 
					  //Cleaner.create();
			int numthreads = 5;
			BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<Runnable>(numthreads);
			ThreadPoolExecutor executor = new ThreadPoolExecutor(500, 500, 1, TimeUnit.SECONDS, blockingQueue);
			executor.prestartAllCoreThreads();
			Runtime r = Runtime.getRuntime();
			long starttime = System.nanoTime();
			int i = 1;
			CohortUtilities cutilities = new CohortUtilities();
			String destFilePath = "C:\\Users\\visu4\\eclipse-workspace\\BaselineSurveyResponseSimulator\\data\\dataresults.txt";
			// FileChannel dest = FileChannel.open(Paths.get(destFilePath),
			// StandardOpenOption.APPEND,StandardOpenOption.CREATE_NEW);
			FileChannel dest = FileChannel.open(Paths.get(destFilePath), StandardOpenOption.APPEND, StandardOpenOption.CREATE_NEW);
			mvpbaselinedatasimulator tempobj;
			while (i < numberOfCohorts) {
				// executor.execute(new mvpbaselinedatasimulator());
				System.out.println("*****Before Created Cohort No: " + i);				
				//executor.submit(new mvpbaselinedatasimulator(i, dest));
				tempobj = new mvpbaselinedatasimulator();
				Future<VeteranCohort> result = executor.submit(tempobj);
	            cleanable = cleaner.register(tempobj, new State());    // register cleaner
				mvpbaselinedatasimulator.writeToFile(dest, 
						cutilities.buildCohortResponseVariableValues(result.get()));
				System.out.println("*****After Created Cohort No: " + i);
				i++;
				r.freeMemory();
				cleanable.clean();
			}
			
			executor.shutdown();
			long endtime = System.nanoTime();
			System.out.println("Running time " + (endtime - starttime) / 1000000000);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	private VeteranCohort simulatedCohort;

	public mvpbaselinedatasimulator() throws Exception {

		//this.setCohortsimulated(vcohort);

	}

	private void setCohortsimulated(VeteranCohort vcohort) {
		try {
			// TODO Auto-generated method stub
			this.simulatedCohort = vcohort;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public VeteranCohort call() throws Exception {
		// TODO Auto-generated method stub
		VeteranCohort veteranCohort = new VeteranCohort();
		this.setCohortsimulated(veteranCohort);
		this.getCohortsimulated().simulateVeteranCohortResponseVariables();
		//this.printVeteranResponseVariableValues(veteranCohort);
		// veteranCohort = this.generateSiblingsForCohortCreation(veteranCohort, i);
		// veteranCohort = this.generateParentsAndGrandParents(veteranCohort);
		//this.setCohortstringbuilder(new StringBuilder());
		//this.buildCohortResponseVariableValues(this.getCohortsimulated());
		//this.writeToFile(fc);
		if (this.getCohortsimulated() != null) {
	//		System.out.println(
	//				"Cohort Adoption Status " + this.getCohortsimulated().getAdoptionStatusSimulatedResponse() + COMMA_DELIMITER);
		
			return veteranCohort;
		}
		else 
			throw new Exception();
	}

	/**
	 * @return the cohortsimulated
	 */
	private VeteranCohort getCohortsimulated() {
		return this.simulatedCohort;
	}


	/**
	 * public void run() { if (this.getCohortsimulated() != null)
	 * System.out.println("Cohort Adoption Status " +
	 * this.getCohortsimulated().getAdoptionStatusSimulatedResponse()+COMMA_DELIMITER);
	 *
	 * else throw (new InterruptedException()+COMMA_DELIMITER);
	 *
	 * }
	 **/

	public int getVeteranAdoptionSimulatedResponse() {
		return this.simulatedCohort.getAdoptionStatusSimulatedResponse();
	}


	private void printVeteranResponseVariableValues(VeteranCohort veteranCohort) throws Exception {
		try {

			System.out.println("DOB " + veteranCohort.getBirthDateSimulated() + COMMA_DELIMITER);
			System.out.println("Sex " + veteranCohort.getSexSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Ethnicity " + veteranCohort.getEthnicitySimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Ethnicity " + veteranCohort.getEthnicitySimulatedResponse() + COMMA_DELIMITER);
			System.out.println(
					"Race White " + veteranCohort.getRacesimulatedresponse().getRaceWhitesimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Race African American "
					+ veteranCohort.getRacesimulatedresponse().getRaceAfricanAmericansimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Race American Indian "
					+ veteranCohort.getRacesimulatedresponse().getRaceAmericanIndiansimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Race Asian Filipino "
					+ veteranCohort.getRacesimulatedresponse().getRaceAsianFilipinosimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Race Asian Indian "
					+ veteranCohort.getRacesimulatedresponse().getRaceAsianIndiansimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Race Asian Japan "
					+ veteranCohort.getRacesimulatedresponse().getRaceAsianJapansimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Race Asian Other "
					+ veteranCohort.getRacesimulatedresponse().getRaceAsianOthersimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Race Pacific Islander "
					+ veteranCohort.getRacesimulatedresponse().getRacePacificIslandersimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Race Asian Chinese "
					+ veteranCohort.getRacesimulatedresponse().getRaceAsianChinesesimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Adoption Status" + veteranCohort.getAdoptionStatusSimulatedResponse() + COMMA_DELIMITER);

			System.out.println("Ancestry African "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestryafricansimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("Ancestry East Asian "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestryeastasiansimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("Ancestry Middle Eastern "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrymiddleeasternsimulatedepicresponse()
					+ COMMA_DELIMITER);
			System.out.println("Ancestry North American "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrynorthamericansimulatedepicresponse()
					+ COMMA_DELIMITER);
			System.out.println("Ancestry North European "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrynortheuropeansimulatedepicresponse()
					+ COMMA_DELIMITER);
			System.out.println("Ancestry Samoa American "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrysamoaamericansimulatedepicresponse()
					+ COMMA_DELIMITER);
			System.out.println("Ancestry South Eurasian "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrysoutheurasiansimulatedepicresponse()
					+ COMMA_DELIMITER);
			System.out.println("Ancestry South West Asian "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrysouthwestasiansimulatedepicresponse()
					+ COMMA_DELIMITER);

			System.out.println("Education " + veteranCohort.getEducationSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Marital Status " + veteranCohort.getMaritalStatusSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("QtyHouse " + veteranCohort.getNumberOfHousesSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Income " + veteranCohort.getIncomeSimulatedResponse() + COMMA_DELIMITER);

			System.out
					.println("VR12Q1 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q1simulatedresponse() + COMMA_DELIMITER);
			System.out
					.println("VR12Q2 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q2simulatedresponse() + COMMA_DELIMITER);
			System.out
					.println("VR12Q3 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q3simulatedresponse() + COMMA_DELIMITER);
			System.out
					.println("VR12Q4 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q4simulatedresponse() + COMMA_DELIMITER);
			System.out
					.println("VR12Q5 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q5simulatedresponse() + COMMA_DELIMITER);
			System.out
					.println("VR12Q6 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q6simulatedresponse() + COMMA_DELIMITER);
			System.out
					.println("VR12Q7 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q7simulatedresponse() + COMMA_DELIMITER);
			System.out
					.println("VR12Q8 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q8simulatedresponse() + COMMA_DELIMITER);
			System.out
					.println("VR12Q9 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q9simulatedresponse() + COMMA_DELIMITER);
			System.out.println(
					"VR12Q10 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q10simulatedresponse() + COMMA_DELIMITER);
			System.out.println(
					"VR12Q11 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q11simulatedresponse() + COMMA_DELIMITER);
			System.out.println(
					"VR12Q12 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q12simulatedresponse() + COMMA_DELIMITER);
			System.out.println(
					"VR12Q13 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q13simulatedresponse() + COMMA_DELIMITER);
			System.out.println(
					"VR12Q14 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q14simulatedresponse() + COMMA_DELIMITER);
			System.out.println(
					"VR12Q15 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q15simulatedresponse() + COMMA_DELIMITER);

			System.out.println("Pain " + veteranCohort.getPainSimulatedResponse() + COMMA_DELIMITER);

			System.out.println("Active Work "
					+ veteranCohort.getLifestyleQsimulatedresponse().getActiveWorksimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Active Status "
					+ veteranCohort.getLifestyleQsimulatedresponse().getActiveStatussimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Active Exercise "
					+ veteranCohort.getLifestyleQsimulatedresponse().getActiveExercisesimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Alcohol Frequency "
					+ veteranCohort.getLifestyleQsimulatedresponse().getAlcoholFrequencysimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Alcohol Quantity "
					+ veteranCohort.getLifestyleQsimulatedresponse().getAlcoholQuantitysimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Alcochol Binge "
					+ veteranCohort.getLifestyleQsimulatedresponse().getAlcoholBingesimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Smoke 100 "
					+ veteranCohort.getLifestyleQsimulatedresponse().getSmoke100cigarettessimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Smoke daily "
					+ veteranCohort.getLifestyleQsimulatedresponse().getSmokedailysimulatedresponse() + COMMA_DELIMITER);
			System.out.println(
					"Smoke Now " + veteranCohort.getLifestyleQsimulatedresponse().getSmokenowsimulatedresponse() + COMMA_DELIMITER);

			System.out.println("Military Br Army "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchArmysimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Br Airforce "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchAirForcesimulatedresponse()
					+ COMMA_DELIMITER);
			System.out.println("Military Br Coast Guard "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchCoastGuardsimulatedresponse()
					+ COMMA_DELIMITER);
			System.out.println("Military Br Mil Cross "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchMilitaryCrosssimulatedresponse()
					+ COMMA_DELIMITER);
			System.out.println("Military Br MM "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchMMsimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Br National Guard "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchNationalGuardsimulatedresponse()
					+ COMMA_DELIMITER);
			System.out.println("Military Br Navy "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchNavysimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Br NOAA "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchNOAAsimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Br PHS " + veteranCohort.getMilitarydutysimulatedresponse()
					.getMilitaryBranchPublicHealthServicesimulatedresponse() + COMMA_DELIMITER);

			System.out.println("Military Sr Type "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryServiceTypesimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Sr 1 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService1simulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Sr 2 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService2simulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Sr 3 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService3simulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Sr 4 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService4simulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Sr 5 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService5simulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Sr 6 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService6simulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Sr 7 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService7simulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Sr 8 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService8simulatedresponse() + COMMA_DELIMITER);
			System.out.println("Military Sr 9 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService9simulatedresponse() + COMMA_DELIMITER);

			System.out.println("Service Outside US "
					+ veteranCohort.getMilitarydutysimulatedresponse().getServiceOutsideUSsimulatedresponse() + COMMA_DELIMITER);

			System.out.println("Stn Asia Far East "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationAsiaFareastsimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Stn South Pacific "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationAsiaSouthPacificsimulatedresponse()
					+ COMMA_DELIMITER);
			System.out.println("Stn Carribean "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationCarribeansimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Stn East European "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationEastEuropeansimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Stn Mexico "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationMexicosimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Stn Middle East "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationMiddleEastsimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Stn North Central European "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationNortHCentralEuropeansimulatedresponse()
					+ COMMA_DELIMITER);
			System.out.println("Stn Other "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationOthersimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Stn South Central American "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationSouthCentralAmericansimulatedresponse()
					+ COMMA_DELIMITER);
			System.out.println("Stn South European Mediterranean " + veteranCohort.getMilitarydutysimulatedresponse()
					.getStationSouthEuropeanMediterraneansimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Stn US Canada "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationUSCanadasimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Deploy Gulf "
					+ veteranCohort.getMilitarydutysimulatedresponse().getDeployGulfsimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Deploy OEFOIF "
					+ veteranCohort.getMilitarydutysimulatedresponse().getDeployOEFOIFsimulatedresponse() + COMMA_DELIMITER);

			System.out.println("Exposure to PyrBr "
					+ veteranCohort.getChemicalexposuresimulatedresponse().getExposurePyrBrsimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Exposure to AgentO "
					+ veteranCohort.getChemicalexposuresimulatedresponse().getExposureToAgentOSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("Exposure to Anthrax "
					+ veteranCohort.getChemicalexposuresimulatedresponse().getExposureToAnthraxsimulatedresponse()
					+ COMMA_DELIMITER);
			System.out.println("Exposure to ChemBioAgents " + veteranCohort.getChemicalexposuresimulatedresponse()
					.getExposureToChemicalBioAgentssimulatedresponse() + COMMA_DELIMITER);

			System.out.println("Handedness " + veteranCohort.getHandednesssimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Height in ft " + veteranCohort.getHeightSRFtSimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Height in inches " + veteranCohort.getHeightSRInchesSimulatedresponse() + COMMA_DELIMITER);
			System.out.println("Weight in lb " + veteranCohort.getWeightSRLbsSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Skin Color " + veteranCohort.getSkinColorSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Hair Color " + veteranCohort.getHairColorSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Eye Color " + veteranCohort.getEyeColorSimulatedResponse() + COMMA_DELIMITER);

			System.out.println("Diseases Simulated response " + veteranCohort.getDiseasesSimulatedResponse() + COMMA_DELIMITER);

			veteranCohort.getDiseasesSimulatedResponse();

			System.out.println(
					"AcuteSpinalCordInjuryDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getAcuteSpinalCordInjury().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("AcuteSpinalCordInjuryYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getAcuteSpinalCordInjury().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("AcuteSpinalCordInjuryMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getAcuteSpinalCordInjury().getAcuteSpinalCordInjurymedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("BlindnessDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getBlindness().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("BlindnessYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getBlindness().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("BlindnessMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getBlindness().getBlindnessmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("BloodclotsDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getBloodclots().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("BloodclotsYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getBloodclots().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("BloodclotsMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getBloodclots().getBloodclotsmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("AlzheimersDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getAlzheimers().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("AlzheimersYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getAlzheimers().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("AlzheimersMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getAlzheimers().getAlzheimersmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("AsthmaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getAsthma().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("AsthmaYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getAsthma().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("AsthmaMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getAsthma()
					.getAsthmamedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("ArthritisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getArthritis().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("ArthritisYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getArthritis().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("ArthritisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getArthritis().getArthritismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("CataractDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getCataract().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("CataractYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getCataract().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("CataractMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getCataract()
					.getCataractmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("CholesterolDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getCholesterol().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("CholesterolYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getCholesterol().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("CholesterolMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getCholesterol().getCholesterolmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("ColonCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getColonCancer().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("ColonCancerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getColonCancer().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("ColonCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getColonCancer().getColonCancermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("GiAcidRefluxDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiAcidReflux().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("GiAcidRefluxYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiAcidReflux().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("GiAcidRefluxMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiAcidReflux().getGiAcidRefluxmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("GiCeliacDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiCeliacDisease().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("GiCeliacDiseaseYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiCeliacDisease().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("GiCeliacDiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiCeliacDisease().getGiCeliacDiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("BreastCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getBreastCancer().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("BreastCancerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getBreastCancer().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("BreastCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getBreastCancer().getBreastCancermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("DementiaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getDementia().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("DementiaYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getDementia().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("DementiaMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getDementia()
					.getDementiamedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("GIObstructionDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiobstruction().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("GIObstructionYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiobstruction().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("GIObstructionMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiobstruction().getGIObstructionmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("GiOtherDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiOtherDisease().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("GiOtherDiseaseYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiOtherDisease().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("GiOtherDiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiOtherDisease().getGiOtherDiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("GiPolypDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiPolyp().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("GiPolypYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiPolyp().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("GiPolypMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getGiPolyp()
					.getGiPolypmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("DiabetesDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getDiabetes().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("DiabetesYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getDiabetes().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("DiabetesMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getDiabetes()
					.getDiabetesmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("GiCrohnsDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiCrohnsDisease().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("GiCrohnsDiseaseYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiCrohnsDisease().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("GiCrohnsDiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiCrohnsDisease().getGiCrohnsDiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("GiUlcerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiUlcer().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("GiUlcerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiUlcer().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("GiUlcerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getGiUlcer()
					.getGiUlcermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("CadDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getCad()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("CadYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getCad().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("CadMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getCad()
					.getCoronaryarterydiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("EpilepsyDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getEpilepsy().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("EpilepsyYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getEpilepsy().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("EpilepsyMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getEpilepsy()
					.getEpilepsymedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("ChfDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getChf()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("ChfYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getChf().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("ChfMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getChf()
					.getCongestiveheartfailuremedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("BPHDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getBPH()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("BPHYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getBPH().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("BPHMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getBPH().getBPHmedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out.println("GlaucomaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGlaucoma().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("GlaucomaYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGlaucoma().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("GlaucomaMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getGlaucoma()
					.getGlaucomamedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("CancerOtherDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getOtherCancer().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("CancerOtherYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getOtherCancer().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("CancerOtherMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getOtherCancer().getCancerOthermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("LungDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getLungDisease().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("LungDiseaseYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getLungDisease().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("LungDiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getLungDisease().getLungDiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("HearingLossDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getHearingLoss().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("HearingLossYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getHearingLoss().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("HearingLossMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getHearingLoss().getHearingLossmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("HepatisisCDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getHepatisisC().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("HepatisisCYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getHepatisisC().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("HepatisisCMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getHepatisisC().getHepatitisCmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("LiverDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getLiverDisease().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("LiverDiseaseYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getLiverDisease().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("LiverDiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getLiverDisease().getLiverDiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("HypertensionDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getHypertension().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("HypertensionYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getHypertension().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("HypertensionMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getHypertension().getHypertensionmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("IDOtherDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getIDOther().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("IDOtherYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getIDOther().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("IDOtherMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getIDOther()
					.getIDOthermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("KidneyDialysisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyDialysis().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("KidneyDialysisYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyDialysis().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("KidneyDialysisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyDialysis().getKidneyDialysismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("MemoryLossDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMemoryLoss().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MemoryLossYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getMemoryLoss().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("MemoryLossMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMemoryLoss().getMemoryLossmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("LungCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getLungCancer().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("LungCancerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getLungCancer().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("LungCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getLungCancer().getLungCancermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("HeartAttackDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getHeartAttack().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("HeartAttackYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getHeartAttack().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("HeartAttackMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getHeartAttack().getHeartAttackmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("HivDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getHiv()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("HivYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getHiv().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("HivMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getHiv().getHivmedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out.println("SkinMsRADiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getSkinMsRA().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("SkinMsRAYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSkinMsRA().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("SkinMsRAMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getSkinMsRA()
					.getSkinMsRAmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("SleepApneaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getSleepApnea().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("SleepApneaYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSleepApnea().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("SleepApneaMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getSleepApnea().getSleepApneamedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("ThyroidDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getThyroid().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("ThyroidYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getThyroid().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("ThyroidMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getThyroid()
					.getThyroidmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("SkinCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getSkinCancer().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("SkinCancerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSkinCancer().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("SkinCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getSkinCancer().getSkinCancermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("StrokeDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getStroke().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("StrokeYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getStroke().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("StrokeMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getStroke()
					.getStrokemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("ProstateCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getProstateCancer().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("ProstateCancerYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getProstateCancer().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("ProstateCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getProstateCancer().getProstateCancermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("TinitusDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getTinitus().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("TinitusYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getTinitus().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("TinitusMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getTinitus()
					.getTinitusmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("MigraneDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMigrane().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MigraneYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getMigrane().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("MigraneMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getMigrane()
					.getMigranemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("TiaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getTia()
					.getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("TiaYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getTia().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("TiaMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getTia().getTiamedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out.println("TuberculosisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getTuberculosis().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("TuberculosisYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getTuberculosis().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("TuberculosisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getTuberculosis().getTuberculosismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("SkinMSGoutDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getSkinMSGout().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("SkinMSGoutYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSkinMSGout().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("SkinMSGoutMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getSkinMSGout().getSkinMSGoutmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("ParkinsonsDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getParkinsons().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("ParkinsonsYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getParkinsons().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("ParkinsonsMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getParkinsons().getParkinsonsmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("SknMSOthrDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getSknMSOthr().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("SknMSOthrYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSknMSOthr().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("SknMSOthrMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getSknMSOthr().getSknMSOthrmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("OtherCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getOtherCancer().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("OtherCancerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getOtherCancer().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("OtherCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getOtherCancer().getCancerOthermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("SkinMSOADiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getSkinMSOA().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("SkinMSOAYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSkinMSOA().getYearDiagnosedSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println("SkinMSOAMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getSkinMSOA()
					.getSkinMSOAmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(
					"CoronaryarterydiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getCoronaryarterydisease().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("CoronaryarterydiseaseYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getCoronaryarterydisease().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("CoronaryarterydiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getCoronaryarterydisease().getCoronaryarterydiseasemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(
					"MentalhealthBipolarDisorderDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getMentalhealthBipolarDisorder().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out
					.println("MentalhealthBipolarDisorderYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
							.getMentalhealthBipolarDisorder().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthBipolarDisorderMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthBipolarDisorder()
							.getMentalhealthBipolarDisordermedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out.println(
					"MentalhealthEatingDisorderDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getMentalhealthEatingDisorder().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthEatingDisorderYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthEatingDisorder().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthEatingDisorderMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthEatingDisorder()
							.getMentalhealthEatingDisordermedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out.println("MentalhealthotherDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthother().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthotherYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthother().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthotherMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthother().getMentalhealthothermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthpersonalitydisorderDiseasePresenceAbsence "
					+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthpersonalitydisorder()
							.getDiseasepresenceorabsencesimulatedepicresponse()
					+ COMMA_DELIMITER);
			System.out.println(
					"MentalhealthpersonalitydisorderYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
							.getMentalhealthpersonalitydisorder().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out
					.println(
							"MentalhealthpersonalitydisorderMedsAdministered "
									+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthpersonalitydisorder()
											.getMentalhealthpersonalitydisordermedicinesadministeredepicresponse()
									+ COMMA_DELIMITER);
			System.out.println("MentalhealthsocphDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthsocph().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthsocphYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthsocph().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthsocphMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthsocph().getMentalhealthsocphmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(
					"AmytrophiclateralsclerosisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getAmytrophiclateralsclerosis().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("AmytrophiclateralsclerosisYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getAmytrophiclateralsclerosis().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("AmytrophiclateralsclerosisMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getAmytrophiclateralsclerosis()
							.getAmytrophiclateralsclerosismedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out
					.println("KidneyDiseaseAcuteDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getKidneyDiseaseAcute().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("KidneyDiseaseAcuteYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyDiseaseAcute().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("KidneyDiseaseAcuteMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyDiseaseAcute().getKidneyDiseaseAcutemedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(
					"MentalhealthschizophreniaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getMentalhealthschizophrenia().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthschizophreniaYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthschizophrenia().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthschizophreniaMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthschizophrenia()
							.getMentalhealthschizophreniamedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out.println(
					"CirculatorydiseaseotherDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getCirculatorydiseaseother().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("CirculatorydiseaseotherYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getCirculatorydiseaseother().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("CirculatorydiseaseotherMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getCirculatorydiseaseother().getCirculatorydiseaseothermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(
					"MentalhealthDepressionDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getMentalhealthDepression().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthDepressionYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthDepression().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthDepressionMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthDepression().getMentalhealthDepressionmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthptsdDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthptsd().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthptsdYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthptsd().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthptsdMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthptsd().getMentalhealthptsdmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("MultiplesclerosisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMultiplesclerosis().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MultiplesclerosisYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMultiplesclerosis().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("MultiplesclerosisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMultiplesclerosis().getMultiplesclerosismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(
					"CongestiveheartfailureDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getCongestiveheartfailure().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("CongestiveheartfailureYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getCongestiveheartfailure().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("CongestiveheartfailureMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getCongestiveheartfailure().getCongestiveheartfailuremedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out
					.println("LossofconsciousnessDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getLossofconsciousness().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("LossofconsciousnessYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getLossofconsciousness().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("LossofconsciousnessMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getLossofconsciousness().getLossofconsciousnessmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(
					"GiIrritableBowelSyndromeDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getGiIrritableBowelSyndrome().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("GiIrritableBowelSyndromeYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiIrritableBowelSyndrome().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("GiIrritableBowelSyndromeMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiIrritableBowelSyndrome()
							.getGiIrritableBowelSyndromemedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out.println(
					"MentalhealthAnxietyPanicDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getMentalhealthAnxietyPanic().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthAnxietyPanicYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthAnxietyPanic().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthAnxietyPanicMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthAnxietyPanic()
							.getMentalhealthAnxietyPanicmedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out.println("KidneyNoDialysisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyNoDialysis().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("KidneyNoDialysisYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyNoDialysis().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("KidneyNoDialysisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyNoDialysis().getKidneyNoDialysismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(
					"HighBloodPressureDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getHighBloodPressureDisease().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("HighBloodPressureDiseaseYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getHighBloodPressureDisease().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("HighBloodPressureDiseaseMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getHighBloodPressureDisease()
							.getHighBloodPressureDiseasemedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out
					.println("GiUlceritiveColitisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getGiUlceritiveColitis().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("GiUlceritiveColitisYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiUlceritiveColitis().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("GiUlceritiveColitisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiUlceritiveColitis().getGiUlceritiveColitismedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out
					.println("MaculardegenerationDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getMaculardegeneration().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MaculardegenerationYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMaculardegeneration().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("MaculardegenerationMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMaculardegeneration().getMaculardegenerationmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthADHDDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthADHD().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthADHDYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthADHD().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("MentalhealthADHDMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthADHD().getMentalhealthADHDmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(
					"OsteopathicdiseaseotherDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getOsteopathicdiseaseother().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("OsteopathicdiseaseotherYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseother().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("OsteopathicdiseaseotherMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseother().getOsteopathicdiseaseothermedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println("NeuroStimulatoryDiseaseOtherDiseasePresenceAbsence "
					+ veteranCohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseaseother()
							.getDiseasepresenceorabsencesimulatedepicresponse()
					+ COMMA_DELIMITER);
			System.out
					.println("NeuroStimulatoryDiseaseOtherYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
							.getNeurostimulatorydiseaseother().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("NeuroStimulatoryDiseaseOtherMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseaseother()
							.getNeuroStimulatoryDiseaseOthermedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out.println(
					"NeuroStimulatoryDiseaseTBIDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getNeurostimulatorydiseasetbi().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("NeuroStimulatoryDiseaseTBIYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getNeurostimulatorydiseasetbi().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("NeuroStimulatoryDiseaseTBIMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseasetbi()
							.getNeuroStimulatoryDiseaseTBImedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);
			System.out.println(
					"OsteopathicdiseaseskinDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getOsteopathicdiseaseskin().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("OsteopathicdiseaseskinYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseskin().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("OsteopathicdiseaseskinMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseskin().getOsteopathicdiseaseskinmedicinesadministeredepicresponse() + COMMA_DELIMITER);
			System.out.println(
					"PulmonaryvasculardiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getPulmonaryvasculardisease().getDiseasepresenceorabsencesimulatedepicresponse() + COMMA_DELIMITER);
			System.out.println("PulmonaryvasculardiseaseYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getPulmonaryvasculardisease().getYearDiagnosedSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("PulmonaryvasculardiseaseMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getPulmonaryvasculardisease()
							.getPulmonaryvasculardiseasemedicinesadministeredepicresponse()
					+ COMMA_DELIMITER);

			System.out.println(" VA USE "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getVAUseSimulatedResponse()
					+ COMMA_DELIMITER);
			System.out.println(" VA Hosp Response Dropoff Site " + veteranCohort.getVAUseVarssimulatedResponse()
					.getVauseresponses().getVAHospResponseDropoffSitesimulatedresponse() + COMMA_DELIMITER);
			System.out.println(" Non VA Hosp Response Dropoff Site " + veteranCohort.getVAUseVarssimulatedResponse()
					.getVauseresponses().getNonVAHospResponseDropOffSitesimulatedresponse() + COMMA_DELIMITER);
			System.out.println(" Non VA Rx "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getNonVARxsimulatedresponse()
					+ COMMA_DELIMITER);
			System.out.println(" Non VA Non Rx "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getNonVANonRxsimulatedresponse()
					+ COMMA_DELIMITER);
			System.out.println(" VA Rx "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getVARxsimulatedresponse()
					+ COMMA_DELIMITER);
			System.out.println(" Help Completing " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getHelpCompletingFormsimulatedresponse() + COMMA_DELIMITER);
			System.out.println(" O/P File Name " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getOutput_FilenameDefaultSimulatedValue() + COMMA_DELIMITER);
			System.out.println(" Time stamp " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getTimestampFormCompletiongDefaultSimulatedValue() + COMMA_DELIMITER);
			System.out.println(" Image file " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getImageFileDefaultSimulatedValue() + COMMA_DELIMITER);
			System.out.println(" CSID " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getCSIDDefaultSimulatedResponse() + COMMA_DELIMITER);
			System.out.println(" Scan Date " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getFormScanDateDefaultSimulatedValue() + COMMA_DELIMITER);
			System.out.println(" Form Id " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getForm_IdDefaultSimulatedValue() + COMMA_DELIMITER);
			// To be implemented
			// System.out.println(" Form " +
			// cohort.getVAUseVarssimulatedResponse().getVauseresponses().getVAUseSimulatedResponse()+COMMA_DELIMITER);
			System.out.println(" Mail Code " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getMailCodeDefaultSimulatedValue() + COMMA_DELIMITER);
			System.out.println(" Num Complete " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_CompleteDefaultSimulatedResponse() + COMMA_DELIMITER);
			System.out.println(" Num Complete A " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecADefaultSimulatedResponse() + COMMA_DELIMITER);
			System.out.println(" Num Complete B " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecBDefaultSimulatedResponse() + COMMA_DELIMITER);
			System.out.println(" Num Complete C " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecCDefaultSimulatedResponse() + COMMA_DELIMITER);
			System.out.println(" Num Complete D " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecDDefaultSimulatedResponse() + COMMA_DELIMITER);
			System.out.println(" Num Complete E " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecEDefaultSimulatedResponse() + COMMA_DELIMITER);
			System.out.println(" Num Complete F " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNum_Complete_SecFDefaultSimulatedResponse() + COMMA_DELIMITER);
			// Throwing null to be checked
			System.out.println(" Num Complete G " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecGDefaultSimulatedResponse() + COMMA_DELIMITER);
			System.out.println(" Duplication Status " + veteranCohort.getVAUseVarssimulatedResponse()
					.getVauseresponses().getFormDuplicationStatusDefaultSimulatedValue() + COMMA_DELIMITER);
			System.out.println(" Edit Status " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getEditStatusDefaultSimulatedValue() + COMMA_DELIMITER);
			System.out.println(" Version Number " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.get_VersionNumber_DefaultSimulatedValue() + COMMA_DELIMITER);
			System.out.println(" Record Status " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.get_RecordStatus_DefaultSimulatedValue() + COMMA_DELIMITER);
			System.out.println(" Version Number " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.get_LoadDate_DefaultSimulatedValue() + COMMA_DELIMITER);

			System.out.println("Adopted " + veteranCohort.getAdoptionStatusSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Multiple Births " + veteranCohort.getMultipleBirthsSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Biological Son presence / absence "
					+ veteranCohort.getBiologicalSonsPresenceAbsenceSimulatedResponse() + COMMA_DELIMITER);
			System.out.println(
					"Total number of daughters " + veteranCohort.getTotalNumberOfSonsSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Biological Daughters presence / absence "
					+ veteranCohort.getBiologicalDaughtersPresenceAbsenceSimulatedResponse() + COMMA_DELIMITER);
			System.out.println(
					"Total number of daughters " + veteranCohort.getTotalNumberOfDaughtersSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Biological Sisters presence / absence "
					+ veteranCohort.getBiologicalSistersPresenceAbsenceSimulatedResponse() + COMMA_DELIMITER);
			System.out
					.println("Total number of sisters " + veteranCohort.getTotalNumberOfSonsSimulatedResponse() + COMMA_DELIMITER);
			System.out.println("Biological Brothers presence / absence "
					+ veteranCohort.getBiologicalBrothersPresenceAbsenceSimulatedResponse() + COMMA_DELIMITER);
			System.out.println(
					"Total number of brothers " + veteranCohort.getNumberOfBiologicalBrothersSimulatedResponse() + COMMA_DELIMITER);

		} catch (Exception e) {

		}
	}

	private static void writeToFile(FileChannel fc, StringBuilder sb) {
		try {
			fc.position(fc.size());
			fc.write(ByteBuffer.wrap(sb.toString().getBytes(StandardCharsets.UTF_8)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	// TBD:
	// Simulate cohort
	// Simulate responses for adjunct (M, F, Mgp, Fgp, Sib)
//  Write out to file
}
