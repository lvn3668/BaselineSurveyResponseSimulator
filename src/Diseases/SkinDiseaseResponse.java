package Diseases;

import java.time.Year;
import java.time.temporal.ValueRange;
import java.util.Calendar;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan
 * Affiliation VABHS / MAVERIC 
 *
 */
public class SkinDiseaseResponse {

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
	private int diseasepresenceorabsencesimulatedepicresponse;
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
	private UniformDistribution uniformDistribution;
	private Utilities utilities;
	/**
	 * @return the diseasepresenceorabsence
	 */

	private Year yearDiagnosedSimulatedResponse = Year.parse(new StringBuilder("0000"));

	public SkinDiseaseResponse(Cohort cohort) throws Exception {
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(new UniformDistribution(SkinDiseaseResponse.getMintogenerateerrorval(),
					SkinDiseaseResponse.getMaxtogenerateerrorval()));

			this.setDiseasepresenceorabsence(ValueRange.of(0, 1));
			this.setDiseasepresenceorabsencesimulatedepicresponse(2);
			this.setUtilities(new Utilities());
			this.setUniformDistribution(new UniformDistribution(SkinDiseaseResponse.getMintogenerateerrorval(),
					SkinDiseaseResponse.getMaxtogenerateerrorval()));

			// If not to generate noise, generate value between 0 and 1
			if (!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
					SkinDiseaseResponse.getMintogenerateerrorval(), SkinDiseaseResponse.getMaxtogenerateerrorval()))) {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getDiseasepresenceorabsence().getMinimum(),
								(int) this.getDiseasepresenceorabsence().getMaximum()));
			} else {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween(SkinDiseaseResponse.getMintogenerateerrorval(),
								SkinDiseaseResponse.getMaxtogenerateerrorval()));
			}

			// Use Noise to check if valid values of Year are to be generated
			// If not to generate noise, then assign diagnoses year between 1900 and 2020
			// TBD: Change seed years
			if (!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
					SkinDiseaseResponse.getMintogenerateerrorval(), SkinDiseaseResponse.getMaxtogenerateerrorval()))) {
				// this changes
				// Minimum is SimulatedDiseaseResponse year of birth
				// Maximum is Today
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(this.getUtilities()
						.randBetween(cohort.getBirthyear().getValue(), Calendar.getInstance().get(Calendar.YEAR)))));
			} else {
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(
						this.getUtilities().randBetween(SkinDiseaseResponse.getMintogenerateerrorval(),
								SkinDiseaseResponse.getMaxtogenerateerrorval()))));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public SkinDiseaseResponse(Cohort cohort, ValueRange valuerange, int simulatedresponse) {
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(new UniformDistribution(SkinDiseaseResponse.getMintogenerateerrorval(),
					SkinDiseaseResponse.getMaxtogenerateerrorval()));

			// TODO Auto-generated constructor stub
			this.setDiseasepresenceorabsence(valuerange);
			this.setDiseasepresenceorabsencesimulatedepicresponse(simulatedresponse);
			// If not to generate noise, generate value between 0 and 1
			if (!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
					SkinDiseaseResponse.getMintogenerateerrorval(), SkinDiseaseResponse.getMaxtogenerateerrorval()))) {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getDiseasepresenceorabsence().getMinimum(),
								(int) this.getDiseasepresenceorabsence().getMaximum()));
			} else {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween(SkinDiseaseResponse.getMintogenerateerrorval(),
								SkinDiseaseResponse.getMaxtogenerateerrorval()));
			}

			// Use Noise to check if valid values of Year are to be generated
			// If not to generate noise, then assign diagnoses year between 1900 and 2020
			// TBD: Change seed years
			if (!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
					SkinDiseaseResponse.getMintogenerateerrorval(), SkinDiseaseResponse.getMaxtogenerateerrorval()))) {
				// this changes
				// Minimum is SimulatedDiseaseResponse year of birth
				// Maximum is Today
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(this.getUtilities()
						.randBetween(cohort.getBirthyear().getValue(), Calendar.getInstance().get(Calendar.YEAR)))));
			} else {
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(
						this.getUtilities().randBetween(SkinDiseaseResponse.getMintogenerateerrorval(),
								SkinDiseaseResponse.getMaxtogenerateerrorval()))));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the diseasepresenceorabsence
	 */
	private ValueRange getDiseasepresenceorabsence() {
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
	public int getDiseasepresenceorabsencesimulatedepicresponse() {
		try {
			return this.diseasepresenceorabsencesimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.diseasepresenceorabsencesimulatedepicresponse;
	}

	/**
	 *
	 * /**
	 *
	 * @return the uniformDistribution
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
	protected UniformDistribution getUniformDistribution() {
		return this.uniformDistribution;
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
	 * @return the yearDiagnosedSimulatedResponse
	 */
	public Year getYearDiagnosedSimulatedResponse() {
		try {
			return this.yearDiagnosedSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.yearDiagnosedSimulatedResponse;
	}

	/**
	 * @param diseasepresenceorabsence the diseasepresenceorabsence to set
	 */
	private void setDiseasepresenceorabsence(ValueRange diseasepresenceorabsence) {
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
	private void setDiseasepresenceorabsencesimulatedepicresponse(int diseasepresenceorabsencesimulatedepicresponse) {
		try {
			this.diseasepresenceorabsencesimulatedepicresponse = diseasepresenceorabsencesimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the maxtogenerateerrorval
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
	 * @param uniformDistribution the uniformDistribution to set
	 */
	/**
	 * @param uniformDistribution
	 */
	/**
	 * @param uniformDistribution
	 */
	/**
	 * @param uniformDistribution
	 */
	/**
	 * @param uniformDistribution
	 */
	protected void setUniformDistribution(UniformDistribution uniformDistribution) {
		this.uniformDistribution = uniformDistribution;
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
	 * @param yearDiagnosedSimulatedResponse the yearDiagnosedSimulatedResponse to set
	 */
	private void setYearDiagnosedSimulatedResponse(Year yearDiagnosed) {
		this.yearDiagnosedSimulatedResponse = yearDiagnosed;
	}

	@Override
	public String toString() {
		return "SkinDiseaseResponse [diseasepresenceorabsence=" + this.diseasepresenceorabsence
				+ ", diseasepresenceorabsencesimulatedepicresponse="
				+ this.diseasepresenceorabsencesimulatedepicresponse + ", yearDiagnosedSimulatedResponse=" + this.yearDiagnosedSimulatedResponse
				+ ", uniformDistribution=" + this.uniformDistribution + ", utilities=" + this.utilities + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(diseasepresenceorabsencesimulatedepicresponse, yearDiagnosedSimulatedResponse);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SkinDiseaseResponse)) {
			return false;
		}
		SkinDiseaseResponse other = (SkinDiseaseResponse) obj;
		return diseasepresenceorabsencesimulatedepicresponse == other.diseasepresenceorabsencesimulatedepicresponse
				&& Objects.equals(yearDiagnosedSimulatedResponse, other.yearDiagnosedSimulatedResponse);
	}

}
