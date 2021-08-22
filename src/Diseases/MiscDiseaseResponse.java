package Diseases;

import java.time.Year;
import java.time.temporal.ValueRange;
import java.util.Calendar;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

// TBD: Change class hierarchy
// Disease is super class
// Cancer, GI, HV, MH, etc. inherit from Disease
//
/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public abstract class MiscDiseaseResponse {
	/**
	 *
	 */
	/**
	 *
	 */
	/**
	 *
	 */
	/**
	 *
	 */
	private static final int maxtogenerateerrorval = 5;
	/**
	 *
	 */
	/**
	 *
	 */
	/**
	 *
	 */
	/**
	 *
	 */
	/**
	 *
	 */
	private static final int mintogenerateerrorval = 2;

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	private static int getMaxtogenerateerrorval() {
		return maxtogenerateerrorval;
	}

	/**
	 * @return the mintogenerateerrorval
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	private static int getMintogenerateerrorval() {
		return mintogenerateerrorval;
	}

	private ValueRange diseasepresenceorabsence = ValueRange.of(0, 1);
	private int diseasepresenceorabsencesimulatedepicresponse = 2;
	private RandomizingDistribution uniformdistribution;
	private Utilities utilities;
	// Move values to properties file
	private Year yearDiagnosed = Year.parse(new StringBuilder("0000"));

	/**
	 * @param veteranCohort
	 * @return the diseasepresenceorabsence
	 */

	public MiscDiseaseResponse(VeteranCohort veteranCohort) throws Exception {
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(MiscDiseaseResponse.getMintogenerateerrorval(),
					MiscDiseaseResponse.getMaxtogenerateerrorval()));

			this.setDiseasepresenceorabsence(ValueRange.of(0, 1));
			this.setDiseasepresenceorabsencesimulatedepicresponse(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public MiscDiseaseResponse(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(MiscDiseaseResponse.getMintogenerateerrorval(),
					MiscDiseaseResponse.getMaxtogenerateerrorval()));

			// TODO Auto-generated constructor stub
			this.setDiseasepresenceorabsence(valuerange);
			this.setDiseasepresenceorabsencesimulatedepicresponse(simulatedresponse);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && this instanceof MiscDiseaseResponse && obj instanceof MiscDiseaseResponse
				&& this.hashCode() == obj.hashCode()) {
			return true;
		}
		return false;
	}

	private ValueRange getDiseasepresenceorabsence() throws Exception {
		try {
			return this.diseasepresenceorabsence;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.diseasepresenceorabsence;
	}

	/**
	 * @return the diseasepresenceorabsencesimulatedepicresponse
	 */
	public int getDiseasepresenceorabsencesimulatedepicresponse() throws Exception {
		try {
			return this.diseasepresenceorabsencesimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.diseasepresenceorabsencesimulatedepicresponse;
	}

	/**
	 * @return the uniformdistribution
	 */
	protected RandomizingDistribution getUniformdistribution() throws Exception {
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
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	protected Utilities getUtilities() {
		return this.utilities;
	}

	/**
	 * @return the yearDiagnosed
	 */
	public Year getYearDiagnosedSimulatedResponse() throws Exception {
		try {
			return this.yearDiagnosed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.yearDiagnosed;
	}

	@Override
	public int hashCode() {
		try {
			return Objects.hash(this.getDiseasepresenceorabsencesimulatedepicresponse(),
					this.getYearDiagnosedSimulatedResponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @param diseasepresenceorabsence the diseasepresenceorabsence to set
	 */
	private void setDiseasepresenceorabsence(ValueRange diseasepresenceorabsence) throws Exception {
		try {
			this.diseasepresenceorabsence = diseasepresenceorabsence;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param diseasepresenceorabsencesimulatedepicresponse the
	 *                                                      diseasepresenceorabsencesimulatedepicresponse
	 *                                                      to set
	 */
	private void setDiseasepresenceorabsencesimulatedepicresponse(int diseasepresenceorabsencesimulatedepicresponse)
			throws Exception {
		try {
			this.diseasepresenceorabsencesimulatedepicresponse = diseasepresenceorabsencesimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uniformdistribution the uniformdistribution to set
	 */
	protected void setUniformdistribution(RandomizingDistribution uniformdist) throws Exception {
		try {
			this.uniformdistribution = uniformdist;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param utilities the utilities to set
	 */
	/**
	 * @param utilities
	 */
	/**
	 * @param utilities
	 */
	/**
	 * @param utilities
	 */
	/**
	 * @param utilities
	 */
	protected void setUtilities(Utilities utilities) {
		this.utilities = utilities;
	}

	/**
	 * @param yearDiagnosed the yearDiagnosed to set
	 */
	private void setYearDiagnosedSimulatedResponse(Year yearDiagnosed) throws Exception {
		try {
			this.yearDiagnosed = yearDiagnosed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param veteranCohort
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veteranCohort) throws Exception {
		if (!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
				MiscDiseaseResponse.getMintogenerateerrorval(), MiscDiseaseResponse.getMaxtogenerateerrorval()))) {
			this.setDiseasepresenceorabsencesimulatedepicresponse(
					this.getUtilities().randBetween((int) this.getDiseasepresenceorabsence().getMinimum(),
							(int) this.getDiseasepresenceorabsence().getMaximum()));
		} else {
			this.setDiseasepresenceorabsencesimulatedepicresponse(this.getUtilities().randBetween(
					MiscDiseaseResponse.getMintogenerateerrorval(), MiscDiseaseResponse.getMaxtogenerateerrorval()));
		}

		// Use Noise to check if valid values of Year are to be generated
		// If not to generate noise, then assign diagnoses year between 1900 and 2020
		// TBD: Change seed years
		if (!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
				MiscDiseaseResponse.getMintogenerateerrorval(), MiscDiseaseResponse.getMaxtogenerateerrorval()))) {
			// this changes
			// Minimum is SimulatedDiseaseResponse year of birth
			// Maximum is Today
			this.setYearDiagnosedSimulatedResponse(Year.of(this.getUtilities().randBetween(
					veteranCohort.getYearOfBirth().getValue(), Calendar.getInstance().get(Calendar.YEAR))));
		} else {
			this.setYearDiagnosedSimulatedResponse(Year.of(this.getUtilities().randBetween(
					MiscDiseaseResponse.getMintogenerateerrorval(), MiscDiseaseResponse.getMaxtogenerateerrorval())));
		}
	}

	@Override
	public String toString() {
		return "MiscDiseaseResponse [diseasepresenceorabsencesimulatedepicresponse="
				+ this.diseasepresenceorabsencesimulatedepicresponse + ", yearDiagnosed=" + this.yearDiagnosed + "]";
	}

}
