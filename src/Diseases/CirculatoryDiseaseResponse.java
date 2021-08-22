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
public class CirculatoryDiseaseResponse {

	// TBD: Noise to be introduced to get error in response variables
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

	private ValueRange diseasepresenceorabsence;
	// error response
	private int diseasepresenceorabsencesimulatedepicresponse;
	private RandomizingDistribution uniformdisttribution;
	private Utilities utilities;
	private Year yearDiagnosedSimulatedResponse;

	public CirculatoryDiseaseResponse(VeteranCohort veteranCohort) throws Exception {
		this.setUtilities(new Utilities());
		this.setUniformdisttribution(new RandomizingDistribution(CirculatoryDiseaseResponse.getMintogenerateerrorval(),
				CirculatoryDiseaseResponse.getMaxtogenerateerrorval()));

		// TODO Auto-generated constructor stub
		this.setDiseasepresenceorabsence(ValueRange.of(0, 1));
		this.setDiseasepresenceorabsencesimulatedepicresponse(2);
		// If not to generate noise, generate value between 0 and 1

	}

	public CirculatoryDiseaseResponse(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {

		try {
			this.setUtilities(new Utilities());
			this.setUniformdisttribution(
					new RandomizingDistribution(CirculatoryDiseaseResponse.getMintogenerateerrorval(),
							CirculatoryDiseaseResponse.getMaxtogenerateerrorval()));

			// TODO Auto-generated constructor stub
			this.setDiseasepresenceorabsence(valuerange);
			this.setDiseasepresenceorabsencesimulatedepicresponse(simulatedresponse);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CirculatoryDiseaseResponse)) {
			return false;
		}
		CirculatoryDiseaseResponse other = (CirculatoryDiseaseResponse) obj;
		return this.getDiseasepresenceorabsencesimulatedepicresponse() == other
				.getDiseasepresenceorabsencesimulatedepicresponse()
				&& Objects.equals(this.getYearDiagnosedSimulatedResponse(), other.getYearDiagnosedSimulatedResponse());
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
	public int getDiseasepresenceorabsencesimulatedepicresponse() {
		return this.diseasepresenceorabsencesimulatedepicresponse;
	}

	/**
	 * @return the uniformdisttribution
	 */
	protected RandomizingDistribution getUniformdisttribution() {
		try {
			return this.uniformdisttribution;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.uniformdisttribution;
	}

	/**
	 * @return the utilities
	 */
	protected Utilities getUtilities() {
		return this.utilities;
	}

	/**
	 * @return the diagnosed
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
		return Objects.hash(this.getDiseasepresenceorabsencesimulatedepicresponse(),
				this.getYearDiagnosedSimulatedResponse());
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
	 * @param uniformdisttribution the uniformdisttribution to set
	 */
	protected void setUniformdisttribution(RandomizingDistribution uniformdist) throws Exception {
		try {
			this.uniformdisttribution = uniformdist;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * @param utilities the utilities to set
	 */
	protected void setUtilities(Utilities utilities) {
		this.utilities = utilities;
	}

	/**
	 * @param yearDiagnosedSimulatedResponse the yearDiagnosedSimulatedResponse to
	 *                                       set
	 */
	private void setYearDiagnosedSimulatedResponse(Year yearDiagnosedSimulatedResponse) {
		this.yearDiagnosedSimulatedResponse = yearDiagnosedSimulatedResponse;
	}

	/**
	 * @param veteranCohort
	 */
	public void simulateResponses(VeteranCohort veteranCohort) {
		if (!this.getUniformdisttribution().generatenoiseinresponsevariables(
				this.getUtilities().randBetween(CirculatoryDiseaseResponse.getMintogenerateerrorval(),
						CirculatoryDiseaseResponse.getMaxtogenerateerrorval()))) {
			this.setDiseasepresenceorabsencesimulatedepicresponse(
					this.getUtilities().randBetween((int) this.getDiseasepresenceorabsence().getMinimum(),
							(int) this.getDiseasepresenceorabsence().getMaximum()));
		} else {
			this.setDiseasepresenceorabsencesimulatedepicresponse(
					this.getUtilities().randBetween(CirculatoryDiseaseResponse.getMintogenerateerrorval(),
							CirculatoryDiseaseResponse.getMaxtogenerateerrorval()));
		}

		// Use Noise to check if valid values of Year are to be generated
		// If not to generate noise, then assign diagnoses year between 1900 and 2020
		// TBD: Change seed years
		if (!this.getUniformdisttribution().generatenoiseinresponsevariables(
				this.getUtilities().randBetween(CirculatoryDiseaseResponse.getMintogenerateerrorval(),
						CirculatoryDiseaseResponse.getMaxtogenerateerrorval()))) {
			// this changes
			// Minimum is SimulatedDiseaseResponse year of birth
			// Maximum is Today
			// Year.parse buggy incorrect eval expression in DateTimeFormatter line 2040
			// Null is parsed as argument to private TemporalAccessor parseResolved0(final
			// CharSequence text, final ParsePosition position
			// On line 2040, this evals to Position(0) as ParsePosition is null
			// On line 2051, it throws an exception
			this.setYearDiagnosedSimulatedResponse(Year.of(this.getUtilities().randBetween(
					veteranCohort.getYearOfBirth().getValue(), Calendar.getInstance().get(Calendar.YEAR))));
		} else {
			this.setYearDiagnosedSimulatedResponse(Year.parse(new StringBuilder(
					this.getUtilities().randBetween(CirculatoryDiseaseResponse.getMintogenerateerrorval(),
							CirculatoryDiseaseResponse.getMaxtogenerateerrorval()))));
		}
	}

}
