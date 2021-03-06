package Diseases;

import java.time.Year;
import java.time.temporal.ValueRange;
import java.util.Calendar;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
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
	private RandomizingDistribution randomizingDistribution;
	private Utilities utilities;
	/**
	 * @return the diseasepresenceorabsence
	 */

	private Year yearDiagnosedSimulatedResponse;

	public SkinDiseaseResponse(VeteranCohort veteranCohort) throws Exception {
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(new RandomizingDistribution(SkinDiseaseResponse.getMintogenerateerrorval(),
					SkinDiseaseResponse.getMaxtogenerateerrorval()));

			this.setDiseasepresenceorabsence(ValueRange.of(0, 1));
			this.setDiseasepresenceorabsencesimulatedepicresponse(2);
			this.setUtilities(new Utilities());
			this.setUniformDistribution(new RandomizingDistribution(SkinDiseaseResponse.getMintogenerateerrorval(),
					SkinDiseaseResponse.getMaxtogenerateerrorval()));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public SkinDiseaseResponse(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) {
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(new RandomizingDistribution(SkinDiseaseResponse.getMintogenerateerrorval(),
					SkinDiseaseResponse.getMaxtogenerateerrorval()));

			// TODO Auto-generated constructor stub
			this.setDiseasepresenceorabsence(valuerange);
			this.setDiseasepresenceorabsencesimulatedepicresponse(simulatedresponse);
			// If not to generate noise, generate value between 0 and 1
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
		if (!(obj instanceof SkinDiseaseResponse)) {
			return false;
		}
		SkinDiseaseResponse other = (SkinDiseaseResponse) obj;
		return this.diseasepresenceorabsencesimulatedepicresponse == other.diseasepresenceorabsencesimulatedepicresponse
				&& Objects.equals(this.yearDiagnosedSimulatedResponse, other.yearDiagnosedSimulatedResponse);
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
	 * @return the randomizingDistribution
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
	protected RandomizingDistribution getUniformDistribution() {
		return this.randomizingDistribution;
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

	@Override
	public int hashCode() {
		return Objects.hash(this.diseasepresenceorabsencesimulatedepicresponse, this.yearDiagnosedSimulatedResponse);
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
	 * @param randomizingDistribution the randomizingDistribution to set
	 */
	/**
	 * @param randomizingDistribution
	 */
	/**
	 * @param randomizingDistribution
	 */
	/**
	 * @param randomizingDistribution
	 */
	/**
	 * @param randomizingDistribution
	 */
	protected void setUniformDistribution(RandomizingDistribution randomizingDistribution) {
		this.randomizingDistribution = randomizingDistribution;
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
	 * @param yearDiagnosedSimulatedResponse the yearDiagnosedSimulatedResponse to
	 *                                       set
	 */
	private void setYearDiagnosedSimulatedResponse(Year yearDiagnosed) {
		this.yearDiagnosedSimulatedResponse = yearDiagnosed;
	}

	/**
	 * @param veteranCohort
	 */
	public void simulateResponses(VeteranCohort veteranCohort) {
		try {
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
				this.setYearDiagnosedSimulatedResponse(Year.of(this.getUtilities().randBetween(
						veteranCohort.getYearOfBirth().getValue(), Calendar.getInstance().get(Calendar.YEAR))));
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

	@Override
	public String toString() {
		return "SkinDiseaseResponse [diseasepresenceorabsence=" + this.diseasepresenceorabsence
				+ ", diseasepresenceorabsencesimulatedepicresponse="
				+ this.diseasepresenceorabsencesimulatedepicresponse + ", yearDiagnosedSimulatedResponse="
				+ this.yearDiagnosedSimulatedResponse + ", randomizingDistribution=" + this.randomizingDistribution
				+ ", utilities=" + this.utilities + "]";
	}

}
