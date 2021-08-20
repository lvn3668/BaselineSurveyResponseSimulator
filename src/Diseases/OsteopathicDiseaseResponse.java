package Diseases;

import java.time.Year;
import java.time.temporal.ValueRange;
import java.util.Calendar;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.UniformDistribution;

// TBD: Change class hierarchy
// Disease is super class
// Cancer, GI, HV, MH, etc. inherit from Disease
//
/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public abstract class OsteopathicDiseaseResponse {
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
	private UniformDistribution uniformdistribution;
	private Utilities utilities;

	private Year yearDiagnosed = Year.parse(new StringBuilder("0000"));

	public OsteopathicDiseaseResponse(VeteranCohort veteranCohort) throws Exception {
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(OsteopathicDiseaseResponse.getMintogenerateerrorval(),
					OsteopathicDiseaseResponse.getMaxtogenerateerrorval()));

			this.setDiseasepresenceorabsence(ValueRange.of(0, 1));
			this.setDiseasepresenceorabsencesimulatedepicresponse(2);

			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(OsteopathicDiseaseResponse.getMintogenerateerrorval(),
							OsteopathicDiseaseResponse.getMaxtogenerateerrorval()))) {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getDiseasepresenceorabsence().getMinimum(),
								(int) this.getDiseasepresenceorabsence().getMaximum()));
			} else {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween(OsteopathicDiseaseResponse.getMintogenerateerrorval(),
								OsteopathicDiseaseResponse.getMaxtogenerateerrorval()));
			}

			// Use Noise to check if valid values of Year are to be generated
			// If not to generate noise, then assign diagnoses year between 1900 and 2020
			// TBD: Change seed years
			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(OsteopathicDiseaseResponse.getMintogenerateerrorval(),
							OsteopathicDiseaseResponse.getMaxtogenerateerrorval()))) {
				// this changes
				// Minimum is SimulatedDiseaseResponse year of birth
				// Maximum is Today
				this.setYearDiagnosedSimulatedResponse(Year.of(this.getUtilities()
						.randBetween(veteranCohort.getYearOfBirth().getValue(), Calendar.getInstance().get(Calendar.YEAR))));
			} else {
				this.setYearDiagnosedSimulatedResponse(
						Year.of(this.getUtilities().randBetween(OsteopathicDiseaseResponse.getMintogenerateerrorval(),
								OsteopathicDiseaseResponse.getMaxtogenerateerrorval())));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public OsteopathicDiseaseResponse(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		try {
			this.setCohort(veteranCohort);
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(OsteopathicDiseaseResponse.getMintogenerateerrorval(),
					OsteopathicDiseaseResponse.getMaxtogenerateerrorval()));

			// TODO Auto-generated constructor stub
			this.setDiseasepresenceorabsence(valuerange);
			this.setDiseasepresenceorabsencesimulatedepicresponse(simulatedresponse);
			// If not to generate noise, generate value between 0 and 1
			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(OsteopathicDiseaseResponse.getMintogenerateerrorval(),
							OsteopathicDiseaseResponse.getMaxtogenerateerrorval()))) {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getDiseasepresenceorabsence().getMinimum(),
								(int) this.getDiseasepresenceorabsence().getMaximum()));
			} else {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween(OsteopathicDiseaseResponse.getMintogenerateerrorval(),
								OsteopathicDiseaseResponse.getMaxtogenerateerrorval()));
			}

			// Use Noise to check if valid values of Year are to be generated
			// If not to generate noise, then assign diagnoses year between 1900 and 2020
			// TBD: Change seed years
			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(OsteopathicDiseaseResponse.getMintogenerateerrorval(),
							OsteopathicDiseaseResponse.getMaxtogenerateerrorval()))) {
				// this changes
				// Minimum is SimulatedDiseaseResponse year of birth
				// Maximum is Today
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(this.getUtilities()
						.randBetween(veteranCohort.getYearOfBirth().getValue(), Calendar.getInstance().get(Calendar.YEAR)))));
			} else {
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(
						this.getUtilities().randBetween(OsteopathicDiseaseResponse.getMintogenerateerrorval(),
								OsteopathicDiseaseResponse.getMaxtogenerateerrorval()))));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof OsteopathicDiseaseResponse)) {
			return false;
		}
		OsteopathicDiseaseResponse other = (OsteopathicDiseaseResponse) obj;
		return this.diseasepresenceorabsencesimulatedepicresponse == other.diseasepresenceorabsencesimulatedepicresponse
				&& Objects.equals(this.yearDiagnosed, other.yearDiagnosed);
	}

	/**
	 * @return the diseasepresenceorabsence
	 */
	private ValueRange getDiseasepresenceorabsence() {
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
	protected UniformDistribution getUniformdistribution() {
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
	 * @return the yrofidentification
	 */
	public Year getYearDiagnosedSimulatedResponse() {
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
		return Objects.hash(this.diseasepresenceorabsencesimulatedepicresponse, this.yearDiagnosed);
	}

	/**
	 * @param veteranCohort the cohort to set
	 */
	private void setCohort(VeteranCohort veteranCohort) {
	}

	/**
	 * @param diseasepresenceorabsence the diseasepresenceorabsence to set
	 */
	private void setDiseasepresenceorabsence(ValueRange diseasepresenceorabsence) {
		this.diseasepresenceorabsence = diseasepresenceorabsence;
	}

	/**
	 * @param diseasepresenceorabsencesimulatedepicresponse the
	 *                                                      diseasepresenceorabsencesimulatedepicresponse
	 *                                                      to set
	 */
	private void setDiseasepresenceorabsencesimulatedepicresponse(int diseasepresenceorabsencesimulatedepicresponse)
			throws RuntimeException {
		try {
			this.diseasepresenceorabsencesimulatedepicresponse = diseasepresenceorabsencesimulatedepicresponse;
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uniformdistribution the uniformdistribution to set
	 */
	protected void setUniformdistribution(UniformDistribution uniformdist) {
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
	protected void setUtilities(Utilities utilities) throws Exception {
		try {
			this.utilities = utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param yearDiagnosed the yearDiagnosed to set
	 */
	private void setYearDiagnosedSimulatedResponse(Year yearDiagnosed) {
		this.yearDiagnosed = yearDiagnosed;
	}

	@Override
	public String toString() {
		return "OsteopathicDiseaseResponse [diseasepresenceorabsence=" + this.diseasepresenceorabsence
				+ ", yearDiagnosed=" + this.yearDiagnosed + ", uniformdistribution=" + this.uniformdistribution
				+ ", diseasepresenceorabsencesimulatedepicresponse="
				+ this.diseasepresenceorabsencesimulatedepicresponse + "]";
	}

}
