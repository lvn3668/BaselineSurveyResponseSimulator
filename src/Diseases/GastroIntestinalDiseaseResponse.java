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
 * Affiliation VABHS /MAVERIC 
 *
 */
public class GastroIntestinalDiseaseResponse {

	private ValueRange diseasepresenceorabsence;
	private UniformDistribution uniformdistribution;
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
	private static final int mintogenerateerrorval = 2;
	// error response
	private int diseasepresenceorabsencesimulatedepicresponse;
	private Utilities utilities;
	private Year yearDiagnosedSimulatedResponse;

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
	/**
	 *
	 */

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
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
	protected Utilities getUtilities() {
		return this.utilities;
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
	protected void setUtilities(Utilities utilities) {
		this.utilities = utilities;
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
	protected int getDiseasepresenceorabsencesimulatedepicresponse() {
		return this.diseasepresenceorabsencesimulatedepicresponse;
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
	private void setDiseasepresenceorabsencesimulatedepicresponse(int diseasepresenceorabsencesimulatedepicresponse) {
		this.diseasepresenceorabsencesimulatedepicresponse = diseasepresenceorabsencesimulatedepicresponse;
	}

	/**
	 * @return the diagnosed
	 */
	protected Year getYearDiagnosedSimulatedResponse() throws Exception {
		try {
			return this.yearDiagnosedSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.yearDiagnosedSimulatedResponse;
	}

	/**
	 * @param yearDiagnosedSimulatedResponse the yearDiagnosedSimulatedResponse to
	 *                                       set
	 */
	private void setYearDiagnosedSimulatedResponse(Year yearDiagnosedSimulatedResponse) {
		this.yearDiagnosedSimulatedResponse = yearDiagnosedSimulatedResponse;
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
	private static int getMintogenerateerrorval() {
		return mintogenerateerrorval;
	}

	public GastroIntestinalDiseaseResponse(Cohort cohort) throws Exception {
		try {

			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GastroIntestinalDiseaseResponse.getMintogenerateerrorval(),
					GastroIntestinalDiseaseResponse.getMaxtogenerateerrorval()));

			// TODO Auto-generated constructor stub
			this.setDiseasepresenceorabsence(ValueRange.of(0, 1));
			this.setDiseasepresenceorabsencesimulatedepicresponse(2);
			// If not to generate noise, generate value between 0 and 1
			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(GastroIntestinalDiseaseResponse.getMintogenerateerrorval(),
							GastroIntestinalDiseaseResponse.getMaxtogenerateerrorval()))) {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getDiseasepresenceorabsence().getMinimum(),
								(int) this.getDiseasepresenceorabsence().getMaximum()));
			} else {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween(GastroIntestinalDiseaseResponse.getMintogenerateerrorval(),
								GastroIntestinalDiseaseResponse.getMaxtogenerateerrorval()));
			}

			// Use Noise to check if valid values of Year are to be generated
			// If not to generate noise, then assign diagnoses year between 1900 and 2020
			// TBD: Change seed years
			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(GastroIntestinalDiseaseResponse.getMintogenerateerrorval(),
							GastroIntestinalDiseaseResponse.getMaxtogenerateerrorval()))) {
				// this changes
				// Minimum is SimulatedDiseaseResponse year of birth
				// Maximum is Today
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(this.getUtilities()
						.randBetween(cohort.getBirthyear().getValue(), Calendar.getInstance().get(Calendar.YEAR)))));
			} else {
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(
						this.getUtilities().randBetween(GastroIntestinalDiseaseResponse.getMintogenerateerrorval(),
								GastroIntestinalDiseaseResponse.getMaxtogenerateerrorval()))));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public GastroIntestinalDiseaseResponse(Cohort cohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GastroIntestinalDiseaseResponse.getMintogenerateerrorval(),
					GastroIntestinalDiseaseResponse.getMaxtogenerateerrorval()));

			// TODO Auto-generated constructor stub
			this.setDiseasepresenceorabsence(valuerange);
			this.setDiseasepresenceorabsencesimulatedepicresponse(simulatedresponse);
			// If not to generate noise, generate value between 0 and 1
			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(GastroIntestinalDiseaseResponse.getMintogenerateerrorval(),
							GastroIntestinalDiseaseResponse.getMaxtogenerateerrorval()))) {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getDiseasepresenceorabsence().getMinimum(),
								(int) this.getDiseasepresenceorabsence().getMaximum()));
			} else {
				this.setDiseasepresenceorabsencesimulatedepicresponse(
						this.getUtilities().randBetween(GastroIntestinalDiseaseResponse.getMintogenerateerrorval(),
								GastroIntestinalDiseaseResponse.getMaxtogenerateerrorval()));
			}

			// Use Noise to check if valid values of Year are to be generated
			// If not to generate noise, then assign diagnoses year between 1900 and 2020
			// TBD: Change seed years
			if (!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(GastroIntestinalDiseaseResponse.getMintogenerateerrorval(),
							GastroIntestinalDiseaseResponse.getMaxtogenerateerrorval()))) {
				// this changes
				// Minimum is SimulatedDiseaseResponse year of birth
				// Maximum is Today
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(this.getUtilities()
						.randBetween(cohort.getBirthyear().getValue(), Calendar.getInstance().get(Calendar.YEAR)))));
			} else {
				this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(
						this.getUtilities().randBetween(GastroIntestinalDiseaseResponse.getMintogenerateerrorval(),
								GastroIntestinalDiseaseResponse.getMaxtogenerateerrorval()))));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		if (!(obj instanceof GastroIntestinalDiseaseResponse)) {
			return false;
		}
		GastroIntestinalDiseaseResponse other = (GastroIntestinalDiseaseResponse) obj;
		return diseasepresenceorabsencesimulatedepicresponse == other.diseasepresenceorabsencesimulatedepicresponse
				&& Objects.equals(yearDiagnosedSimulatedResponse, other.yearDiagnosedSimulatedResponse);
	}

	@Override
	public String toString() {
		return "GastroIntestinalDiseaseResponse [diseasepresenceorabsencesimulatedepicresponse="
				+ diseasepresenceorabsencesimulatedepicresponse + ", yearDiagnosedSimulatedResponse="
				+ yearDiagnosedSimulatedResponse + "]";
	}

}
