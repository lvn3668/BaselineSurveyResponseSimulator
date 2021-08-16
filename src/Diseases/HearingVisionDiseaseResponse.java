package Diseases;

import java.time.Year;
import java.time.temporal.ValueRange;
import java.util.Calendar;
import java.util.Objects;
import java.util.Random;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan
 * Affiliation VABHS / MAVERIC 
 *
 */
public class HearingVisionDiseaseResponse {

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

	private ValueRange diseasepresenceorabsence;
	// error response
	private int diseasepresenceorabsencesimulatedepicresponse;
	private UniformDistribution uniformdistribution;
	private Utilities utilities;

	private Year yearDiagnosed;

	public HearingVisionDiseaseResponse(Cohort cohort) {
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HearingVisionDiseaseResponse.getMintogenerateerrorval(),
					HearingVisionDiseaseResponse.getMaxtogenerateerrorval()));

			this.setDiseasepresenceorabsence(ValueRange.of(0, 1));
			this.setDiseasepresenceorabsencesimulatedepicresponse(2);
			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(HearingVisionDiseaseResponse.getMintogenerateerrorval(),
							HearingVisionDiseaseResponse.getMaxtogenerateerrorval()))) {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getDiseasepresenceorabsence().getMinimum(),
								(int) this.getDiseasepresenceorabsence().getMaximum()));
			}

			else
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween(HearingVisionDiseaseResponse.getMintogenerateerrorval(),
								HearingVisionDiseaseResponse.getMaxtogenerateerrorval()));

			// Use Noise to check if valid values of Year are to be generated
			// If not to generate noise, then assign diagnoses year between 1900 and 2020
			// TBD: Change seed years
			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(HearingVisionDiseaseResponse.getMintogenerateerrorval(),
							HearingVisionDiseaseResponse.getMaxtogenerateerrorval()))) {
				// this changes
				// Minimum is SimulatedDiseaseResponse year of birth
				// Maximum is Today
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(this.getUtilities()
						.randBetween(cohort.getBirthyear().getValue(), Calendar.getInstance().get(Calendar.YEAR)))));
			}

			else
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(
						this.getUtilities().randBetween(HearingVisionDiseaseResponse.getMintogenerateerrorval(),
								HearingVisionDiseaseResponse.getMaxtogenerateerrorval()))));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public HearingVisionDiseaseResponse(Cohort cohort, ValueRange valuerange, int simulatedresponse) {
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HearingVisionDiseaseResponse.getMintogenerateerrorval(),
					HearingVisionDiseaseResponse.getMaxtogenerateerrorval()));

			// TODO Auto-generated constructor stub
			this.setDiseasepresenceorabsence(valuerange);
			this.setDiseasepresenceorabsencesimulatedepicresponse(simulatedresponse);
			// If not to generate noise, generate value between 0 and 1
			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(HearingVisionDiseaseResponse.getMintogenerateerrorval(),
							HearingVisionDiseaseResponse.getMaxtogenerateerrorval()))) {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getDiseasepresenceorabsence().getMinimum(),
								(int) this.getDiseasepresenceorabsence().getMaximum()));
			}

			else
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween(HearingVisionDiseaseResponse.getMintogenerateerrorval(),
								HearingVisionDiseaseResponse.getMaxtogenerateerrorval()));

			// Use Noise to check if valid values of Year are to be generated
			// If not to generate noise, then assign diagnoses year between 1900 and 2020
			// TBD: Change seed years
			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(HearingVisionDiseaseResponse.getMintogenerateerrorval(),
							HearingVisionDiseaseResponse.getMaxtogenerateerrorval()))) {
				// this changes
				// Minimum is SimulatedDiseaseResponse year of birth
				// Maximum is Today
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(this.getUtilities()
						.randBetween(cohort.getBirthyear().getValue(), Calendar.getInstance().get(Calendar.YEAR)))));
			}

			else
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(
						this.getUtilities().randBetween(HearingVisionDiseaseResponse.getMintogenerateerrorval(),
								HearingVisionDiseaseResponse.getMaxtogenerateerrorval()))));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
	protected UniformDistribution getUniformdistribution() throws Exception {
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
	protected void setUniformdistribution(UniformDistribution uniformdist) throws Exception {
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
	 * @return the yearDiagnosed
	 */
	public Year getYearDiagnosedSimulatedValue() {
		return this.yearDiagnosed;
	}

	/**
	 * @param yearDiagnosed the yearDiagnosed to set
	 */
	private void setYearDiagnosedSimulatedResponse(Year yearDiagnosed) {
		this.yearDiagnosed = yearDiagnosed;
	}

	/**
	 * @return the diseasepresenceorabsence
	 */
	private ValueRange getDiseasepresenceorabsence() {
		return this.diseasepresenceorabsence;
	}

	/**
	 * @param diseasepresenceorabsence the diseasepresenceorabsence to set
	 */
	private void setDiseasepresenceorabsence(ValueRange diseasepresenceorabsence) {
		this.diseasepresenceorabsence = diseasepresenceorabsence;
	}

	@Override
	public int hashCode() {
		try {
			return Objects.hash(this.getDiseasepresenceorabsencesimulatedepicresponse(),
					this.getYearDiagnosedSimulatedValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			if (obj != null && this instanceof HearingVisionDiseaseResponse
					&& obj instanceof HearingVisionDiseaseResponse && this.hashCode() == obj.hashCode()) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String toString() {
		return "HearingVisionDiseaseResponse [diseasepresenceorabsencesimulatedepicresponse="
				+ diseasepresenceorabsencesimulatedepicresponse + ", yearDiagnosed=" + yearDiagnosed + "]";
	}

}
