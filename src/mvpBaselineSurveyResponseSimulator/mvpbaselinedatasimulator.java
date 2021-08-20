package mvpBaselineSurveyResponseSimulator;

import cohort.VeteranCohort;
import cohort.Father;
import cohort.MaternalFemaleGrandParent;
import cohort.Mother;
import cohort.PaternalMaleGrandParent;
import cohort.Sibling;
import cohort.Sibling1;
import cohort.Sibling2;
import cohort.Sibling3;
import cohort.Sibling4;
import cohort.Sibling5;
import cohort.Sibling6;
import cohort.Sibling7;
import cohort.Sibling8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Lalitha Viswanathan Affiliation MAVERIC / VABHS
 *
 */
public class mvpbaselinedatasimulator implements Callable {
	
	
    private VeteranCohort simulatedCohort;

    /**
	 * @return the cohortsimulated
	 */
	private VeteranCohort getCohortsimulated() {
		return this.simulatedCohort;
	}
	
	public mvpbaselinedatasimulator(int i) throws Exception
	{		
		VeteranCohort veteranCohort = mvpbaselinedatasimulator.simulateVeteranResponses();
		//this.printVeteranResponseVariableValues(veteranCohort);

		veteranCohort = this.generateSiblingsForCohortCreation(veteranCohort, i);
		veteranCohort = this.generateParentsAndGrandParents(veteranCohort);
	
	 }
	
	/** public void run() 
	{
			if (this.getCohortsimulated() != null)
			System.out.println("Cohort Adoption Status " + this.getCohortsimulated().getAdoptionStatusSimulatedResponse());
			
			else 
				throw (new InterruptedException());
		
	} **/


	/**
	 * @param cohortsimulated the cohortsimulated to set
	 */
	private void setCohortsimulated(VeteranCohort cohortsimulated) {
		try {
			this.simulatedCohort = cohortsimulated;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public int getVeteranAdoptionSimulatedResponse() {
        return this.simulatedCohort.getAdoptionStatusSimulatedResponse();
    }
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			// new BufferedWriter(new FileWriter("/data/MVPresponses.csv"));

			// BufferedReader br = new BufferedReader(new
			// FileReader("data/BaselineSurveyVariables.csv"));

			// List<List<String>> result = new ArrayList<>();
			// String line;
			// while ((line = br.readLine()) != null) {
			// String[] values = line.split(COMMA_DELIMITER);
			// values[1].replace("\"", "").replace("{", "").replace("}",
			// "").split(COMMA_DELIMITER);

			// }
			
			int numthreads = 1000000;
			BlockingQueue<Runnable> blockingQueue =  new  ArrayBlockingQueue<Runnable>(numthreads);
			ThreadPoolExecutor executor = new ThreadPoolExecutor(500,500,1,TimeUnit.SECONDS, blockingQueue);
			executor.prestartAllCoreThreads();
			long starttime = System.nanoTime();
			int i = 1;
			while (i <= numthreads) 
	        {
	            //executor.execute(new mvpbaselinedatasimulator());
	            System.out.println("*****Before Created Cohort No: " + i);
				executor.submit(new mvpbaselinedatasimulator(i));
	            System.out.println("*****After Created Cohort No: " + i);
	           // Thread.sleep(50);
	       	 
	            i++;
	        }
	        executor.shutdown();
	        long endtime = System.nanoTime();
	        System.out.println("Running time" + (endtime-starttime)/1000000000);

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

	
	private VeteranCohort generateSiblingsForCohortCreation(VeteranCohort veteranCohort,int cohortno) throws Exception
	{ 
		if (veteranCohort != null) {
		int totalNumberOfSiblings = veteranCohort.getNumberOfBiologicalBrothersSimulatedResponse()
				+ veteranCohort.getNumberOfBiologicalSistersSimulatedResponse();
		System.out.println("Total number of siblings simulated " + totalNumberOfSiblings);
		if (totalNumberOfSiblings > 0) {
			veteranCohort.setSibling(new Sibling());
			switch (totalNumberOfSiblings) {
			case 1:
				veteranCohort.getSibling().setSibling1(new Sibling1(veteranCohort));
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers());
				veteranCohort.getSibling().printSiblingDetails(veteranCohort.getSibling().getSibling1());
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers());

				break;
			case 2:
				veteranCohort.getSibling().setSibling1(new Sibling1(veteranCohort));
				veteranCohort.getSibling().setSibling2(new Sibling2(veteranCohort));
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers());
				veteranCohort.getSibling().printSiblingDetails(veteranCohort.getSibling().getSibling1(),
						veteranCohort.getSibling().getSibling2());
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers());

				break;
			case 3:
				veteranCohort.getSibling().setSibling1(new Sibling1(veteranCohort));
				veteranCohort.getSibling().setSibling2(new Sibling2(veteranCohort));
				veteranCohort.getSibling().setSibling3(new Sibling3(veteranCohort));
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers());
				veteranCohort.getSibling().printSiblingDetails(veteranCohort.getSibling().getSibling1(),
						veteranCohort.getSibling().getSibling2(), veteranCohort.getSibling().getSibling3());
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers());
				break;
			case 4:
				veteranCohort.getSibling().setSibling1(new Sibling1(veteranCohort));
				veteranCohort.getSibling().setSibling2(new Sibling2(veteranCohort));
				veteranCohort.getSibling().setSibling3(new Sibling3(veteranCohort));
				veteranCohort.getSibling().setSibling4(new Sibling4(veteranCohort));
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers());
				veteranCohort.getSibling().printSiblingDetails(veteranCohort.getSibling().getSibling1(),
						veteranCohort.getSibling().getSibling2(), veteranCohort.getSibling().getSibling3(),
						veteranCohort.getSibling().getSibling4());
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers());

				break;
			case 5:
				veteranCohort.getSibling().setSibling1(new Sibling1(veteranCohort));
				veteranCohort.getSibling().setSibling2(new Sibling2(veteranCohort));
				veteranCohort.getSibling().setSibling3(new Sibling3(veteranCohort));
				veteranCohort.getSibling().setSibling4(new Sibling4(veteranCohort));
				veteranCohort.getSibling().setSibling5(new Sibling5(veteranCohort));
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers());
				veteranCohort.getSibling().printSiblingDetails(veteranCohort.getSibling().getSibling1(),
						veteranCohort.getSibling().getSibling2(), veteranCohort.getSibling().getSibling3(),
						veteranCohort.getSibling().getSibling4(), veteranCohort.getSibling().getSibling5());
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers());

				break;
			case 6:
				veteranCohort.getSibling().setSibling1(new Sibling1(veteranCohort));
				veteranCohort.getSibling().setSibling2(new Sibling2(veteranCohort));
				veteranCohort.getSibling().setSibling3(new Sibling3(veteranCohort));
				veteranCohort.getSibling().setSibling4(new Sibling4(veteranCohort));
				veteranCohort.getSibling().setSibling5(new Sibling5(veteranCohort));
				veteranCohort.getSibling().setSibling6(new Sibling6(veteranCohort));
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers());
				veteranCohort.getSibling().printSiblingDetails(veteranCohort.getSibling().getSibling1(),
						veteranCohort.getSibling().getSibling2(), veteranCohort.getSibling().getSibling3(),
						veteranCohort.getSibling().getSibling4(), veteranCohort.getSibling().getSibling5(),
						veteranCohort.getSibling().getSibling6());
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers());

				break;
			case 7:
				veteranCohort.getSibling().setSibling1(new Sibling1(veteranCohort));
				veteranCohort.getSibling().setSibling2(new Sibling2(veteranCohort));
				veteranCohort.getSibling().setSibling3(new Sibling3(veteranCohort));
				veteranCohort.getSibling().setSibling4(new Sibling4(veteranCohort));
				veteranCohort.getSibling().setSibling5(new Sibling5(veteranCohort));
				veteranCohort.getSibling().setSibling6(new Sibling6(veteranCohort));
				veteranCohort.getSibling().setSibling7(new Sibling7(veteranCohort));
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers());
				veteranCohort.getSibling().printSiblingDetails(veteranCohort.getSibling().getSibling1(),
						veteranCohort.getSibling().getSibling2(), veteranCohort.getSibling().getSibling3(),
						veteranCohort.getSibling().getSibling4(), veteranCohort.getSibling().getSibling5(),
						veteranCohort.getSibling().getSibling6(), veteranCohort.getSibling().getSibling5(),
						veteranCohort.getSibling().getSibling7());
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers());

				break;
			case 8:
				veteranCohort.getSibling().setSibling1(new Sibling1(veteranCohort));
				veteranCohort.getSibling().setSibling2(new Sibling2(veteranCohort));
				veteranCohort.getSibling().setSibling3(new Sibling3(veteranCohort));
				veteranCohort.getSibling().setSibling4(new Sibling4(veteranCohort));
				veteranCohort.getSibling().setSibling3(new Sibling3(veteranCohort));
				veteranCohort.getSibling().setSibling5(new Sibling5(veteranCohort));
				veteranCohort.getSibling().setSibling6(new Sibling6(veteranCohort));
				veteranCohort.getSibling().setSibling7(new Sibling7(veteranCohort));
				veteranCohort.getSibling().setSibling8(new Sibling8(veteranCohort));
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers());
				veteranCohort.getSibling().printSiblingDetails(veteranCohort.getSibling().getSibling1(),
						veteranCohort.getSibling().getSibling2(), veteranCohort.getSibling().getSibling3(),
						veteranCohort.getSibling().getSibling4(), veteranCohort.getSibling().getSibling5(),
						veteranCohort.getSibling().getSibling6(), veteranCohort.getSibling().getSibling5(),
						veteranCohort.getSibling().getSibling7(), veteranCohort.getSibling().getSibling8());
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers()
						);

				break;
			default:
				veteranCohort.getSibling().setSibling1(new Sibling1(veteranCohort));
				veteranCohort.getSibling().setSibling2(new Sibling2(veteranCohort));
				veteranCohort.getSibling().setSibling3(new Sibling3(veteranCohort));
				veteranCohort.getSibling().setSibling4(new Sibling4(veteranCohort));
				veteranCohort.getSibling().setSibling5(new Sibling5(veteranCohort));
				veteranCohort.getSibling().setSibling6(new Sibling6(veteranCohort));
				veteranCohort.getSibling().setSibling7(new Sibling7(veteranCohort));
				veteranCohort.getSibling().setSibling8(new Sibling8(veteranCohort));
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers());
				veteranCohort.getSibling().printSiblingDetails(veteranCohort.getSibling().getSibling1(),
						veteranCohort.getSibling().getSibling2(), veteranCohort.getSibling().getSibling3(),
						veteranCohort.getSibling().getSibling4(), veteranCohort.getSibling().getSibling5(),
						veteranCohort.getSibling().getSibling6(), veteranCohort.getSibling().getSibling5(),
						veteranCohort.getSibling().getSibling7(), veteranCohort.getSibling().getSibling8());
				veteranCohort.getSibling().checkForDiseasePresenceAbsenceInSiblings(
						veteranCohort.getSibling().getSibling1().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling2().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling3().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling4().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling5().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling6().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling7().getSimulatedDiseasePresenceAbsenceFamilyMembers(),
						veteranCohort.getSibling().getSibling8().getSimulatedDiseasePresenceAbsenceFamilyMembers()
						);

				break;
			}
		}
		if (totalNumberOfSiblings > 0) {
			System.out.println("Printing disease presence in cohort no " + cohortno);
		//veteranCohort.getSibling().printDiseasePresenceInSiblings();
		}
		return veteranCohort;
		} else
			throw new Exception();

	}
	
	private void printVeteranResponseVariableValues(VeteranCohort veteranCohort) throws Exception
	{
		try {
			
			System.out.println("DOB " + veteranCohort.getBirthDateSimulated());
			System.out.println("Sex " + veteranCohort.getSexSimulatedResponse());
			System.out.println("Ethnicity " + veteranCohort.getEthnicitySimulatedResponse());
			System.out.println("Ethnicity " + veteranCohort.getEthnicitySimulatedResponse());
			System.out.println("Race White " + veteranCohort.getRacesimulatedresponse().getRaceWhitesimulatedresponse());
			System.out.println("Race African American "
					+ veteranCohort.getRacesimulatedresponse().getRaceAfricanAmericansimulatedresponse());
			System.out.println("Race American Indian "
					+ veteranCohort.getRacesimulatedresponse().getRaceAmericanIndiansimulatedresponse());
			System.out.println(
					"Race Asian Filipino " + veteranCohort.getRacesimulatedresponse().getRaceAsianFilipinosimulatedresponse());
			System.out.println(
					"Race Asian Indian " + veteranCohort.getRacesimulatedresponse().getRaceAsianIndiansimulatedresponse());
			System.out.println(
					"Race Asian Japan " + veteranCohort.getRacesimulatedresponse().getRaceAsianJapansimulatedresponse());
			System.out.println(
					"Race Asian Other " + veteranCohort.getRacesimulatedresponse().getRaceAsianOthersimulatedresponse());
			System.out.println("Race Pacific Islander "
					+ veteranCohort.getRacesimulatedresponse().getRacePacificIslandersimulatedresponse());
			System.out.println(
					"Race Asian Chinese " + veteranCohort.getRacesimulatedresponse().getRaceAsianChinesesimulatedresponse());
			System.out.println("Adoption Status" + veteranCohort.getAdoptionStatusSimulatedResponse());

			System.out.println("Ancestry African "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestryafricansimulatedepicresponse());
			System.out.println("Ancestry East Asian "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestryeastasiansimulatedepicresponse());
			System.out.println("Ancestry Middle Eastern "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrymiddleeasternsimulatedepicresponse());
			System.out.println("Ancestry North American "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrynorthamericansimulatedepicresponse());
			System.out.println("Ancestry North European "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrynortheuropeansimulatedepicresponse());
			System.out.println("Ancestry Samoa American "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrysamoaamericansimulatedepicresponse());
			System.out.println("Ancestry South Eurasian "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrysoutheurasiansimulatedepicresponse());
			System.out.println("Ancestry South West Asian "
					+ veteranCohort.getAncestrysimulatedresponse().getAncestrysouthwestasiansimulatedepicresponse());

			System.out.println("Education " + veteranCohort.getEducationSimulatedResponse());
			System.out.println("Marital Status " + veteranCohort.getMaritalStatusSimulatedResponse());
			System.out.println("QtyHouse " + veteranCohort.getNumberOfHousesSimulatedResponse());
			System.out.println("Income " + veteranCohort.getIncomeSimulatedResponse());

			System.out.println("VR12Q1 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q1simulatedresponse());
			System.out.println("VR12Q2 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q2simulatedresponse());
			System.out.println("VR12Q3 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q3simulatedresponse());
			System.out.println("VR12Q4 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q4simulatedresponse());
			System.out.println("VR12Q5 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q5simulatedresponse());
			System.out.println("VR12Q6 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q6simulatedresponse());
			System.out.println("VR12Q7 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q7simulatedresponse());
			System.out.println("VR12Q8 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q8simulatedresponse());
			System.out.println("VR12Q9 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q9simulatedresponse());
			System.out.println("VR12Q10 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q10simulatedresponse());
			System.out.println("VR12Q11 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q11simulatedresponse());
			System.out.println("VR12Q12 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q12simulatedresponse());
			System.out.println("VR12Q13 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q13simulatedresponse());
			System.out.println("VR12Q14 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q14simulatedresponse());
			System.out.println("VR12Q15 " + veteranCohort.getQ1_15Simulatedresponse().getVr12Q15simulatedresponse());

			System.out.println("Pain " + veteranCohort.getPainSimulatedResponse());

			System.out
					.println("Active Work " + veteranCohort.getLifestyleQsimulatedresponse().getActiveWorksimulatedresponse());
			System.out.println(
					"Active Status " + veteranCohort.getLifestyleQsimulatedresponse().getActiveStatussimulatedresponse());
			System.out.println(
					"Active Exercise " + veteranCohort.getLifestyleQsimulatedresponse().getActiveExercisesimulatedresponse());
			System.out.println("Alcohol Frequency "
					+ veteranCohort.getLifestyleQsimulatedresponse().getAlcoholFrequencysimulatedresponse());
			System.out.println("Alcohol Quantity "
					+ veteranCohort.getLifestyleQsimulatedresponse().getAlcoholQuantitysimulatedresponse());
			System.out.println(
					"Alcochol Binge " + veteranCohort.getLifestyleQsimulatedresponse().getAlcoholBingesimulatedresponse());
			System.out.println(
					"Smoke 100 " + veteranCohort.getLifestyleQsimulatedresponse().getSmoke100cigarettessimulatedresponse());
			System.out
					.println("Smoke daily " + veteranCohort.getLifestyleQsimulatedresponse().getSmokedailysimulatedresponse());
			System.out.println("Smoke Now " + veteranCohort.getLifestyleQsimulatedresponse().getSmokenowsimulatedresponse());

			System.out.println("Military Br Army "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchArmysimulatedresponse());
			System.out.println("Military Br Airforce "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchAirForcesimulatedresponse());
			System.out.println("Military Br Coast Guard "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchCoastGuardsimulatedresponse());
			System.out.println("Military Br Mil Cross "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchMilitaryCrosssimulatedresponse());
			System.out.println("Military Br MM "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchMMsimulatedresponse());
			System.out.println("Military Br National Guard "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchNationalGuardsimulatedresponse());
			System.out.println("Military Br Navy "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchNavysimulatedresponse());
			System.out.println("Military Br NOAA "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryBranchNOAAsimulatedresponse());
			System.out.println("Military Br PHS " + veteranCohort.getMilitarydutysimulatedresponse()
					.getMilitaryBranchPublicHealthServicesimulatedresponse());

			System.out.println("Military Sr Type "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryServiceTypesimulatedresponse());
			System.out.println("Military Sr 1 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService1simulatedresponse());
			System.out.println("Military Sr 2 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService2simulatedresponse());
			System.out.println("Military Sr 3 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService3simulatedresponse());
			System.out.println("Military Sr 4 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService4simulatedresponse());
			System.out.println("Military Sr 5 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService5simulatedresponse());
			System.out.println("Military Sr 6 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService6simulatedresponse());
			System.out.println("Military Sr 7 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService7simulatedresponse());
			System.out.println("Military Sr 8 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService8simulatedresponse());
			System.out.println("Military Sr 9 "
					+ veteranCohort.getMilitarydutysimulatedresponse().getMilitaryService9simulatedresponse());

			System.out.println("Service Outside US "
					+ veteranCohort.getMilitarydutysimulatedresponse().getServiceOutsideUSsimulatedresponse());

			System.out.println("Stn Asia Far East "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationAsiaFareastsimulatedresponse());
			System.out.println("Stn South Pacific "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationAsiaSouthPacificsimulatedresponse());
			System.out.println("Stn Carribean "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationCarribeansimulatedresponse());
			System.out.println("Stn East European "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationEastEuropeansimulatedresponse());
			System.out.println(
					"Stn Mexico " + veteranCohort.getMilitarydutysimulatedresponse().getStationMexicosimulatedresponse());
			System.out.println("Stn Middle East "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationMiddleEastsimulatedresponse());
			System.out.println("Stn North Central European "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationNortHCentralEuropeansimulatedresponse());
			System.out.println(
					"Stn Other " + veteranCohort.getMilitarydutysimulatedresponse().getStationOthersimulatedresponse());
			System.out.println("Stn South Central American "
					+ veteranCohort.getMilitarydutysimulatedresponse().getStationSouthCentralAmericansimulatedresponse());
			System.out.println("Stn South European Mediterranean " + veteranCohort.getMilitarydutysimulatedresponse()
					.getStationSouthEuropeanMediterraneansimulatedresponse());
			System.out.println(
					"Stn US Canada " + veteranCohort.getMilitarydutysimulatedresponse().getStationUSCanadasimulatedresponse());
			System.out.println(
					"Deploy Gulf " + veteranCohort.getMilitarydutysimulatedresponse().getDeployGulfsimulatedresponse());
			System.out.println(
					"Deploy OEFOIF " + veteranCohort.getMilitarydutysimulatedresponse().getDeployOEFOIFsimulatedresponse());

			System.out.println("Exposure to PyrBr "
					+ veteranCohort.getChemicalexposuresimulatedresponse().getExposurePyrBrsimulatedresponse());
			System.out.println("Exposure to AgentO "
					+ veteranCohort.getChemicalexposuresimulatedresponse().getExposureToAgentOSimulatedResponse());
			System.out.println("Exposure to Anthrax "
					+ veteranCohort.getChemicalexposuresimulatedresponse().getExposureToAnthraxsimulatedresponse());
			System.out.println("Exposure to ChemBioAgents "
					+ veteranCohort.getChemicalexposuresimulatedresponse().getExposureToChemicalBioAgentssimulatedresponse());

			System.out.println("Handedness " + veteranCohort.getHandednesssimulatedresponse());
			System.out.println("Height in ft " + veteranCohort.getHeightSRFtSimulatedresponse());
			System.out.println("Height in inches " + veteranCohort.getHeightSRInchesSimulatedresponse());
			System.out.println("Weight in lb " + veteranCohort.getWeightSRLbsSimulatedResponse());
			System.out.println("Skin Color " + veteranCohort.getSkinColorSimulatedResponse());
			System.out.println("Hair Color " + veteranCohort.getHairColorSimulatedResponse());
			System.out.println("Eye Color " + veteranCohort.getEyeColorSimulatedResponse());

			System.out.println("Diseases Simulated response " + veteranCohort.getDiseasesSimulatedResponse());

			veteranCohort.getDiseasesSimulatedResponse();

			System.out.println("AcuteSpinalCordInjuryDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getAcuteSpinalCordInjury().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("AcuteSpinalCordInjuryYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getAcuteSpinalCordInjury().getYearDiagnosedSimulatedResponse());
			System.out.println("AcuteSpinalCordInjuryMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getAcuteSpinalCordInjury().getAcuteSpinalCordInjurymedicinesadministeredepicresponse());
			System.out.println("BlindnessDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getBlindness()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("BlindnessYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getBlindness().getYearDiagnosedSimulatedResponse());
			System.out.println("BlindnessMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getBlindness()
					.getBlindnessmedicinesadministeredepicresponse());
			System.out.println("BloodclotsDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getBloodclots().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("BloodclotsYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getBloodclots().getYearDiagnosedSimulatedResponse());
			System.out.println("BloodclotsMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getBloodclots()
					.getBloodclotsmedicinesadministeredepicresponse());
			System.out.println("AlzheimersDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getAlzheimers().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("AlzheimersYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getAlzheimers().getYearDiagnosedSimulatedResponse());
			System.out.println("AlzheimersMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getAlzheimers()
					.getAlzheimersmedicinesadministeredepicresponse());
			System.out.println("AsthmaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getAsthma()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("AsthmaYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getAsthma().getYearDiagnosedSimulatedResponse());
			System.out.println("AsthmaMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getAsthma().getAsthmamedicinesadministeredepicresponse());
			System.out.println("ArthritisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getArthritis()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("ArthritisYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getArthritis().getYearDiagnosedSimulatedResponse());
			System.out.println("ArthritisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getArthritis()
					.getArthritismedicinesadministeredepicresponse());
			System.out.println("CataractDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getCataract()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("CataractYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getCataract().getYearDiagnosedSimulatedResponse());
			System.out.println("CataractMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getCataract()
					.getCataractmedicinesadministeredepicresponse());
			System.out.println("CholesterolDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getCholesterol().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("CholesterolYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getCholesterol().getYearDiagnosedSimulatedResponse());
			System.out.println("CholesterolMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getCholesterol()
					.getCholesterolmedicinesadministeredepicresponse());
			System.out.println("ColonCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getColonCancer().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("ColonCancerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getColonCancer().getYearDiagnosedSimulatedResponse());
			System.out.println("ColonCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getColonCancer()
					.getColonCancermedicinesadministeredepicresponse());
			System.out.println("GiAcidRefluxDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiAcidReflux().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("GiAcidRefluxYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiAcidReflux().getYearDiagnosedSimulatedResponse());
			System.out.println("GiAcidRefluxMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getGiAcidReflux()
					.getGiAcidRefluxmedicinesadministeredepicresponse());
			System.out.println("GiCeliacDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiCeliacDisease().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("GiCeliacDiseaseYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiCeliacDisease().getYearDiagnosedSimulatedResponse());
			System.out.println("GiCeliacDiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiCeliacDisease().getGiCeliacDiseasemedicinesadministeredepicresponse());
			System.out.println("BreastCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getBreastCancer().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("BreastCancerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getBreastCancer().getYearDiagnosedSimulatedResponse());
			System.out.println("BreastCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getBreastCancer()
					.getBreastCancermedicinesadministeredepicresponse());
			System.out.println("DementiaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getDementia()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("DementiaYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getDementia().getYearDiagnosedSimulatedResponse());
			System.out.println("DementiaMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getDementia()
					.getDementiamedicinesadministeredepicresponse());
			System.out.println("GIObstructionDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiobstruction().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("GIObstructionYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiobstruction().getYearDiagnosedSimulatedResponse());
			System.out.println("GIObstructionMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiobstruction().getGIObstructionmedicinesadministeredepicresponse());
			System.out.println("GiOtherDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiOtherDisease().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("GiOtherDiseaseYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiOtherDisease().getYearDiagnosedSimulatedResponse());
			System.out.println("GiOtherDiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiOtherDisease().getGiOtherDiseasemedicinesadministeredepicresponse());
			System.out.println("GiPolypDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getGiPolyp()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("GiPolypYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiPolyp().getYearDiagnosedSimulatedResponse());
			System.out.println("GiPolypMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiPolyp().getGiPolypmedicinesadministeredepicresponse());
			System.out.println("DiabetesDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getDiabetes()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("DiabetesYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getDiabetes().getYearDiagnosedSimulatedResponse());
			System.out.println("DiabetesMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getDiabetes()
					.getDiabetesmedicinesadministeredepicresponse());
			System.out.println("GiCrohnsDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiCrohnsDisease().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("GiCrohnsDiseaseYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiCrohnsDisease().getYearDiagnosedSimulatedResponse());
			System.out.println("GiCrohnsDiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiCrohnsDisease().getGiCrohnsDiseasemedicinesadministeredepicresponse());
			System.out.println("GiUlcerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getGiUlcer()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("GiUlcerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiUlcer().getYearDiagnosedSimulatedResponse());
			System.out.println("GiUlcerMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getGiUlcer().getGiUlcermedicinesadministeredepicresponse());
			System.out.println("CadDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getCad()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("CadYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getCad().getYearDiagnosedSimulatedResponse());
			System.out.println("CadMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getCad()
					.getCoronaryarterydiseasemedicinesadministeredepicresponse());
			System.out.println("EpilepsyDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getEpilepsy()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("EpilepsyYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getEpilepsy().getYearDiagnosedSimulatedResponse());
			System.out.println("EpilepsyMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getEpilepsy()
					.getEpilepsymedicinesadministeredepicresponse());
			System.out.println("ChfDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getChf()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("ChfYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getChf().getYearDiagnosedSimulatedResponse());
			System.out.println("ChfMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getChf()
					.getCongestiveheartfailuremedicinesadministeredepicresponse());
			System.out.println("BPHDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getBPH()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("BPHYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getBPH().getYearDiagnosedSimulatedResponse());
			System.out.println("BPHMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getBPH().getBPHmedicinesadministeredepicresponse());
			System.out.println("GlaucomaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getGlaucoma()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("GlaucomaYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getGlaucoma().getYearDiagnosedSimulatedResponse());
			System.out.println("GlaucomaMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getGlaucoma()
					.getGlaucomamedicinesadministeredepicresponse());
			System.out.println("CancerOtherDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getOtherCancer().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("CancerOtherYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getOtherCancer().getYearDiagnosedSimulatedResponse());
			System.out.println("CancerOtherMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getOtherCancer()
					.getCancerOthermedicinesadministeredepicresponse());
			System.out.println("LungDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getLungDisease().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("LungDiseaseYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getLungDisease().getYearDiagnosedSimulatedResponse());
			System.out.println("LungDiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getLungDisease()
					.getLungDiseasemedicinesadministeredepicresponse());
			System.out.println("HearingLossDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getHearingLoss().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("HearingLossYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getHearingLoss().getYearDiagnosedSimulatedResponse());
			System.out.println("HearingLossMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getHearingLoss()
					.getHearingLossmedicinesadministeredepicresponse());
			System.out.println("HepatisisCDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getHepatisisC().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("HepatisisCYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getHepatisisC().getYearDiagnosedSimulatedResponse());
			System.out.println("HepatisisCMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getHepatisisC()
					.getHepatitisCmedicinesadministeredepicresponse());
			System.out.println("LiverDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getLiverDisease().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("LiverDiseaseYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getLiverDisease().getYearDiagnosedSimulatedResponse());
			System.out.println("LiverDiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getLiverDisease()
					.getLiverDiseasemedicinesadministeredepicresponse());
			System.out.println("HypertensionDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getHypertension().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("HypertensionYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getHypertension().getYearDiagnosedSimulatedResponse());
			System.out.println("HypertensionMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getHypertension()
					.getHypertensionmedicinesadministeredepicresponse());
			System.out.println("IDOtherDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getIDOther()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("IDOtherYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getIDOther().getYearDiagnosedSimulatedResponse());
			System.out.println("IDOtherMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getIDOther().getIDOthermedicinesadministeredepicresponse());
			System.out.println("KidneyDialysisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyDialysis().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("KidneyDialysisYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getKidneyDialysis().getYearDiagnosedSimulatedResponse());
			System.out.println("KidneyDialysisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyDialysis().getKidneyDialysismedicinesadministeredepicresponse());
			System.out.println("MemoryLossDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMemoryLoss().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MemoryLossYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getMemoryLoss().getYearDiagnosedSimulatedResponse());
			System.out.println("MemoryLossMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getMemoryLoss()
					.getMemoryLossmedicinesadministeredepicresponse());
			System.out.println("LungCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getLungCancer().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("LungCancerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getLungCancer().getYearDiagnosedSimulatedResponse());
			System.out.println("LungCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getLungCancer()
					.getLungCancermedicinesadministeredepicresponse());
			System.out.println("HeartAttackDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getHeartAttack().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("HeartAttackYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getHeartAttack().getYearDiagnosedSimulatedResponse());
			System.out.println("HeartAttackMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getHeartAttack()
					.getHeartAttackmedicinesadministeredepicresponse());
			System.out.println("HivDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getHiv()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("HivYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getHiv().getYearDiagnosedSimulatedResponse());
			System.out.println("HivMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getHiv().getHivmedicinesadministeredepicresponse());
			System.out.println("SkinMsRADiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getSkinMsRA()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("SkinMsRAYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSkinMsRA().getYearDiagnosedSimulatedResponse());
			System.out.println("SkinMsRAMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getSkinMsRA()
					.getSkinMsRAmedicinesadministeredepicresponse());
			System.out.println("SleepApneaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getSleepApnea().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("SleepApneaYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSleepApnea().getYearDiagnosedSimulatedResponse());
			System.out.println("SleepApneaMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getSleepApnea()
					.getSleepApneamedicinesadministeredepicresponse());
			System.out.println("ThyroidDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getThyroid()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("ThyroidYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getThyroid().getYearDiagnosedSimulatedResponse());
			System.out.println("ThyroidMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getThyroid().getThyroidmedicinesadministeredepicresponse());
			System.out.println("SkinCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getSkinCancer().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("SkinCancerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSkinCancer().getYearDiagnosedSimulatedResponse());
			System.out.println("SkinCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getSkinCancer()
					.getSkinCancermedicinesadministeredepicresponse());
			System.out.println("StrokeDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getStroke()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("StrokeYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getStroke().getYearDiagnosedSimulatedResponse());
			System.out.println("StrokeMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getStroke().getStrokemedicinesadministeredepicresponse());
			System.out.println("ProstateCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getProstateCancer().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("ProstateCancerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getProstateCancer().getYearDiagnosedSimulatedResponse());
			System.out.println("ProstateCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getProstateCancer().getProstateCancermedicinesadministeredepicresponse());
			System.out.println("TinitusDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getTinitus()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("TinitusYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getTinitus().getYearDiagnosedSimulatedResponse());
			System.out.println("TinitusMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getTinitus().getTinitusmedicinesadministeredepicresponse());
			System.out.println("MigraneDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getMigrane()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MigraneYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getMigrane().getYearDiagnosedSimulatedResponse());
			System.out.println("MigraneMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getMigrane().getMigranemedicinesadministeredepicresponse());
			System.out.println("TiaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getTia()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("TiaYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getTia().getYearDiagnosedSimulatedResponse());
			System.out.println("TiaMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getTia().getTiamedicinesadministeredepicresponse());
			System.out.println("TuberculosisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getTuberculosis().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("TuberculosisYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getTuberculosis().getYearDiagnosedSimulatedResponse());
			System.out.println("TuberculosisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getTuberculosis()
					.getTuberculosismedicinesadministeredepicresponse());
			System.out.println("SkinMSGoutDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getSkinMSGout().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("SkinMSGoutYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSkinMSGout().getYearDiagnosedSimulatedResponse());
			System.out.println("SkinMSGoutMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getSkinMSGout()
					.getSkinMSGoutmedicinesadministeredepicresponse());
			System.out.println("ParkinsonsDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getParkinsons().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("ParkinsonsYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getParkinsons().getYearDiagnosedSimulatedResponse());
			System.out.println("ParkinsonsMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getParkinsons()
					.getParkinsonsmedicinesadministeredepicresponse());
			System.out.println("SknMSOthrDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getSknMSOthr()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("SknMSOthrYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSknMSOthr().getYearDiagnosedSimulatedResponse());
			System.out.println("SknMSOthrMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getSknMSOthr()
					.getSknMSOthrmedicinesadministeredepicresponse());
			System.out.println("OtherCancerDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getOtherCancer().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("OtherCancerYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getOtherCancer().getYearDiagnosedSimulatedResponse());
			System.out.println("OtherCancerMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getOtherCancer()
					.getCancerOthermedicinesadministeredepicresponse());
			System.out.println("SkinMSOADiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse().getSkinMSOA()
					.getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("SkinMSOAYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getSkinMSOA().getYearDiagnosedSimulatedResponse());
			System.out.println("SkinMSOAMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse().getSkinMSOA()
					.getSkinMSOAmedicinesadministeredepicresponse());
			System.out.println("CoronaryarterydiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getCoronaryarterydisease().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("CoronaryarterydiseaseYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getCoronaryarterydisease().getYearDiagnosedSimulatedResponse());
			System.out.println("CoronaryarterydiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getCoronaryarterydisease().getCoronaryarterydiseasemedicinesadministeredepicresponse());
			System.out.println(
					"MentalhealthBipolarDisorderDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getMentalhealthBipolarDisorder().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MentalhealthBipolarDisorderYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthBipolarDisorder().getYearDiagnosedSimulatedResponse());
			System.out.println("MentalhealthBipolarDisorderMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthBipolarDisorder()
							.getMentalhealthBipolarDisordermedicinesadministeredepicresponse());
			System.out
					.println("MentalhealthEatingDisorderDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getMentalhealthEatingDisorder().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MentalhealthEatingDisorderYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthEatingDisorder().getYearDiagnosedSimulatedResponse());
			System.out.println("MentalhealthEatingDisorderMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthEatingDisorder().getMentalhealthEatingDisordermedicinesadministeredepicresponse());
			System.out.println("MentalhealthotherDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthother().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MentalhealthotherYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthother().getYearDiagnosedSimulatedResponse());
			System.out.println("MentalhealthotherMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthother().getMentalhealthothermedicinesadministeredepicresponse());
			System.out.println(
					"MentalhealthpersonalitydisorderDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getMentalhealthpersonalitydisorder().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MentalhealthpersonalitydisorderYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthpersonalitydisorder().getYearDiagnosedSimulatedResponse());
			System.out.println("MentalhealthpersonalitydisorderMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthpersonalitydisorder()
							.getMentalhealthpersonalitydisordermedicinesadministeredepicresponse());
			System.out.println("MentalhealthsocphDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthsocph().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MentalhealthsocphYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthsocph().getYearDiagnosedSimulatedResponse());
			System.out.println("MentalhealthsocphMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthsocph().getMentalhealthsocphmedicinesadministeredepicresponse());
			System.out
					.println("AmytrophiclateralsclerosisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getAmytrophiclateralsclerosis().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("AmytrophiclateralsclerosisYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getAmytrophiclateralsclerosis().getYearDiagnosedSimulatedResponse());
			System.out.println("AmytrophiclateralsclerosisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getAmytrophiclateralsclerosis().getAmytrophiclateralsclerosismedicinesadministeredepicresponse());
			System.out.println("KidneyDiseaseAcuteDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyDiseaseAcute().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("KidneyDiseaseAcuteYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyDiseaseAcute().getYearDiagnosedSimulatedResponse());
			System.out.println("KidneyDiseaseAcuteMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyDiseaseAcute().getKidneyDiseaseAcutemedicinesadministeredepicresponse());
			System.out
					.println("MentalhealthschizophreniaDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getMentalhealthschizophrenia().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MentalhealthschizophreniaYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthschizophrenia().getYearDiagnosedSimulatedResponse());
			System.out.println("MentalhealthschizophreniaMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthschizophrenia().getMentalhealthschizophreniamedicinesadministeredepicresponse());
			System.out.println("CirculatorydiseaseotherDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getCirculatorydiseaseother().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("CirculatorydiseaseotherYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getCirculatorydiseaseother().getYearDiagnosedSimulatedResponse());
			System.out.println("CirculatorydiseaseotherMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getCirculatorydiseaseother().getCirculatorydiseaseothermedicinesadministeredepicresponse());
			System.out.println("MentalhealthDepressionDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthDepression().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MentalhealthDepressionYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthDepression().getYearDiagnosedSimulatedResponse());
			System.out.println("MentalhealthDepressionMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthDepression().getMentalhealthDepressionmedicinesadministeredepicresponse());
			System.out.println("MentalhealthptsdDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthptsd().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MentalhealthptsdYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthptsd().getYearDiagnosedSimulatedResponse());
			System.out.println("MentalhealthptsdMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthptsd().getMentalhealthptsdmedicinesadministeredepicresponse());
			System.out.println("MultiplesclerosisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMultiplesclerosis().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MultiplesclerosisYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getMultiplesclerosis().getYearDiagnosedSimulatedResponse());
			System.out.println("MultiplesclerosisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMultiplesclerosis().getMultiplesclerosismedicinesadministeredepicresponse());
			System.out.println("CongestiveheartfailureDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getCongestiveheartfailure().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("CongestiveheartfailureYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getCongestiveheartfailure().getYearDiagnosedSimulatedResponse());
			System.out.println("CongestiveheartfailureMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getCongestiveheartfailure().getCongestiveheartfailuremedicinesadministeredepicresponse());
			System.out.println("LossofconsciousnessDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getLossofconsciousness().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("LossofconsciousnessYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getLossofconsciousness().getYearDiagnosedSimulatedResponse());
			System.out.println("LossofconsciousnessMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getLossofconsciousness().getLossofconsciousnessmedicinesadministeredepicresponse());
			System.out.println("GiIrritableBowelSyndromeDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiIrritableBowelSyndrome().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("GiIrritableBowelSyndromeYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiIrritableBowelSyndrome().getYearDiagnosedSimulatedResponse());
			System.out.println("GiIrritableBowelSyndromeMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiIrritableBowelSyndrome().getGiIrritableBowelSyndromemedicinesadministeredepicresponse());
			System.out.println("MentalhealthAnxietyPanicDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthAnxietyPanic().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MentalhealthAnxietyPanicYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthAnxietyPanic().getYearDiagnosedSimulatedResponse());
			System.out.println("MentalhealthAnxietyPanicMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthAnxietyPanic().getMentalhealthAnxietyPanicmedicinesadministeredepicresponse());
			System.out.println("KidneyNoDialysisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyNoDialysis().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("KidneyNoDialysisYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getKidneyNoDialysis().getYearDiagnosedSimulatedResponse());
			System.out.println("KidneyNoDialysisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getKidneyNoDialysis().getKidneyNoDialysismedicinesadministeredepicresponse());
			System.out.println("HighBloodPressureDiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getHighBloodPressureDisease().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("HighBloodPressureDiseaseYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getHighBloodPressureDisease().getYearDiagnosedSimulatedResponse());
			System.out.println("HighBloodPressureDiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getHighBloodPressureDisease().getHighBloodPressureDiseasemedicinesadministeredepicresponse());
			System.out.println("GiUlceritiveColitisDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiUlceritiveColitis().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("GiUlceritiveColitisYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiUlceritiveColitis().getYearDiagnosedSimulatedResponse());
			System.out.println("GiUlceritiveColitisMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getGiUlceritiveColitis().getGiUlceritiveColitismedicinesadministeredepicresponse());
			System.out.println("MaculardegenerationDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMaculardegeneration().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MaculardegenerationYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getMaculardegeneration().getYearDiagnosedSimulatedResponse());
			System.out.println("MaculardegenerationMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMaculardegeneration().getMaculardegenerationmedicinesadministeredepicresponse());
			System.out.println("MentalhealthADHDDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthADHD().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("MentalhealthADHDYearDiagnosed "
					+ veteranCohort.getDiseasesSimulatedResponse().getMentalhealthADHD().getYearDiagnosedSimulatedResponse());
			System.out.println("MentalhealthADHDMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getMentalhealthADHD().getMentalhealthADHDmedicinesadministeredepicresponse());
			System.out.println("OsteopathicdiseaseotherDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseother().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("OsteopathicdiseaseotherYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseother().getYearDiagnosedSimulatedResponse());
			System.out.println("OsteopathicdiseaseotherMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseother().getOsteopathicdiseaseothermedicinesadministeredepicresponse());
			System.out.println(
					"NeuroStimulatoryDiseaseOtherDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getNeurostimulatorydiseaseother().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("NeuroStimulatoryDiseaseOtherYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getNeurostimulatorydiseaseother().getYearDiagnosedSimulatedResponse());
			System.out.println("NeuroStimulatoryDiseaseOtherMedsAdministered "
					+ veteranCohort.getDiseasesSimulatedResponse().getNeurostimulatorydiseaseother()
							.getNeuroStimulatoryDiseaseOthermedicinesadministeredepicresponse());
			System.out
					.println("NeuroStimulatoryDiseaseTBIDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
							.getNeurostimulatorydiseasetbi().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("NeuroStimulatoryDiseaseTBIYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getNeurostimulatorydiseasetbi().getYearDiagnosedSimulatedResponse());
			System.out.println("NeuroStimulatoryDiseaseTBIMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getNeurostimulatorydiseasetbi().getNeuroStimulatoryDiseaseTBImedicinesadministeredepicresponse());
			System.out.println("OsteopathicdiseaseskinDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseskin().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("OsteopathicdiseaseskinYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseskin().getYearDiagnosedSimulatedResponse());
			System.out.println("OsteopathicdiseaseskinMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getOsteopathicdiseaseskin().getOsteopathicdiseaseskinmedicinesadministeredepicresponse());
			System.out.println("PulmonaryvasculardiseaseDiseasePresenceAbsence " + veteranCohort.getDiseasesSimulatedResponse()
					.getPulmonaryvasculardisease().getDiseasepresenceorabsencesimulatedepicresponse());
			System.out.println("PulmonaryvasculardiseaseYearDiagnosed " + veteranCohort.getDiseasesSimulatedResponse()
					.getPulmonaryvasculardisease().getYearDiagnosedSimulatedResponse());
			System.out.println("PulmonaryvasculardiseaseMedsAdministered " + veteranCohort.getDiseasesSimulatedResponse()
					.getPulmonaryvasculardisease().getPulmonaryvasculardiseasemedicinesadministeredepicresponse());

			System.out.println(" VA USE "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getVAUseSimulatedResponse());
			System.out.println(" VA Hosp Response Dropoff Site " + veteranCohort.getVAUseVarssimulatedResponse()
					.getVauseresponses().getVAHospResponseDropoffSitesimulatedresponse());
			System.out.println(" Non VA Hosp Response Dropoff Site " + veteranCohort.getVAUseVarssimulatedResponse()
					.getVauseresponses().getNonVAHospResponseDropOffSitesimulatedresponse());
			System.out.println(" Non VA Rx "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getNonVARxsimulatedresponse());
			System.out.println(" Non VA Non Rx "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getNonVANonRxsimulatedresponse());
			System.out.println(
					" VA Rx " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getVARxsimulatedresponse());
			System.out.println(" Help Completing " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getHelpCompletingFormsimulatedresponse());
			System.out.println(" O/P File Name " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getOutput_FilenameDefaultSimulatedValue());
			System.out.println(" Time stamp " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getTimestampFormCompletiongDefaultSimulatedValue());
			System.out.println(" Image file "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getImageFileDefaultSimulatedValue());
			System.out.println(" CSID "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getCSIDDefaultSimulatedResponse());
			System.out.println(" Scan Date " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getFormScanDateDefaultSimulatedValue());
			System.out.println(" Form Id "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getForm_IdDefaultSimulatedValue());
			// To be implemented
			// System.out.println(" Form " +
			// cohort.getVAUseVarssimulatedResponse().getVauseresponses().getVAUseSimulatedResponse());
			System.out.println(" Mail Code "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getMailCodeDefaultSimulatedValue());
			System.out.println(" Num Complete " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_CompleteDefaultSimulatedResponse());
			System.out.println(" Num Complete A " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecADefaultSimulatedResponse());
			System.out.println(" Num Complete B " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecBDefaultSimulatedResponse());
			System.out.println(" Num Complete C " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecCDefaultSimulatedResponse());
			System.out.println(" Num Complete D " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecDDefaultSimulatedResponse());
			System.out.println(" Num Complete E " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecEDefaultSimulatedResponse());
			System.out.println(" Num Complete F " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNum_Complete_SecFDefaultSimulatedResponse());
			// Throwing null to be checked
			System.out.println(" Num Complete G " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getNumQ_Complete_SecGDefaultSimulatedResponse());
			System.out.println(" Duplication Status " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.getFormDuplicationStatusDefaultSimulatedValue());
			System.out.println(" Edit Status "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().getEditStatusDefaultSimulatedValue());
			System.out.println(" Version Number " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.get_VersionNumber_DefaultSimulatedValue());
			System.out.println(" Record Status " + veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses()
					.get_RecordStatus_DefaultSimulatedValue());
			System.out.println(" Version Number "
					+ veteranCohort.getVAUseVarssimulatedResponse().getVauseresponses().get_LoadDate_DefaultSimulatedValue());

			System.out.println("Adopted " + veteranCohort.getAdoptionStatusSimulatedResponse());
			System.out.println("Multiple Births " + veteranCohort.getMultipleBirthsSimulatedResponse());
			System.out.println(
					"Biological Son presence / absence " + veteranCohort.getBiologicalSonsPresenceAbsenceSimulatedResponse());
			System.out.println("Total number of daughters " + veteranCohort.getTotalNumberOfSonsSimulatedResponse());
			System.out.println("Biological Daughters presence / absence "
					+ veteranCohort.getBiologicalDaughtersPresenceAbsenceSimulatedResponse());
			System.out.println("Total number of daughters " + veteranCohort.getTotalNumberOfDaughtersSimulatedResponse());
			System.out.println("Biological Sisters presence / absence "
					+ veteranCohort.getBiologicalSistersPresenceAbsenceSimulatedResponse());
			System.out.println("Total number of sisters " + veteranCohort.getTotalNumberOfSonsSimulatedResponse());
			System.out.println("Biological Brothers presence / absence "
					+ veteranCohort.getBiologicalBrothersPresenceAbsenceSimulatedResponse());
			System.out.println("Total number of brothers " + veteranCohort.getNumberOfBiologicalBrothersSimulatedResponse());

			
		}catch (Exception e)
		{
			
		}
	}
	
	private static VeteranCohort simulateVeteranResponses() {
		// TODO Auto-generated method stub
		try {
			VeteranCohort veteranCohort = new VeteranCohort();
			return veteranCohort;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private VeteranCohort generateParentsAndGrandParents(VeteranCohort veteranCohort) 
	{
		
		try {
			
			System.out.println("Before creating mother class " + veteranCohort.getBirthDateSimulated().toString());
			veteranCohort.setMother(new Mother(veteranCohort));
			System.out.println("Disease presence / absence for Mother class ");
			//veteranCohort.getMother().getSimulatedDiseasePresenceAbsence().printsimulatedresponses();
			System.out.println("Before creating father class " + veteranCohort.getBirthDateSimulated().toString());
			veteranCohort.setFather(new Father(veteranCohort));
			System.out.println("Disease presence / absence for Father class ");
			//veteranCohort.getMother().getSimulatedDiseasePresenceAbsence().printsimulatedresponses();
			veteranCohort.setMaternalgrandparent(new MaternalFemaleGrandParent());
			System.out.println("Disease presence / absence for Maternal Grand Parent (F) class ");
			//veteranCohort.getMaternalgrandparent().getSimulatedDiseasePresenceAbsence().printsimulatedresponses();			
			veteranCohort.setPaternalgrandparent(new PaternalMaleGrandParent());
			System.out.println("Disease presence / absence for Paternal Grand Parent (M) class ");
//			/veteranCohort.getPaternalgrandparent().getSimulatedDiseasePresenceAbsence().printsimulatedresponses();		
			return veteranCohort;
			
		} catch (Exception e)
		{
			
		}
		return veteranCohort;
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		if (this.getCohortsimulated() != null)
		System.out.println("Cohort Adoption Status " + this.getCohortsimulated().getAdoptionStatusSimulatedResponse());
		
		else 
			throw (new InterruptedException());

		return null;
	}

	// TBD:
	// Simulate cohort
	// Simulate responses for adjunct (M, F, Mgp, Fgp, Sib)
//  Write out to file
}
