package Diseases;

import java.time.Year;
import java.time.temporal.ValueRange;
import java.util.Calendar;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

/**
 * @author Lalitha Viswanathan Affiliation MAVERIC / VABHS
 *
 */
public class CancerResponse {

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
		try {
			return maxtogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try {
			return mintogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mintogenerateerrorval;
	}

	private ValueRange diseasepresenceorabsence;
	// error response
	private int diseasepresenceorabsencesimulatedepicresponse;
	private RandomizingDistribution uniformdistribution;
	private Utilities utilities;

	private Year yearDiagnosedSimulatedResponse;

	public CancerResponse(VeteranCohort veteranCohort) throws Exception {
		try {
			this.setCohort(veteranCohort);
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(CancerResponse.getMintogenerateerrorval(),
					CancerResponse.getMaxtogenerateerrorval()));

			// TODO Auto-generated constructor stub
			this.setDiseasepresenceorabsence(ValueRange.of(0, 1));
			this.setDiseasepresenceorabsencesimulatedepicresponse(2);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public CancerResponse(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {

		try {
			this.setCohort(veteranCohort);
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(CancerResponse.getMintogenerateerrorval(),
					CancerResponse.getMaxtogenerateerrorval()));

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
		if (obj != null && obj instanceof CancerResponse && this instanceof CancerResponse
				&& this.hashCode() == obj.hashCode()) {
			return true;
		}
		return false;
	}

	/**
	 * @return the diseasepresenceorabsence
	 */
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
			e.printStackTrace();
		}
		return this.uniformdistribution;
	}

	/**
	 * @return the utilities
	 */
	protected Utilities getUtilities() {
		try {
			return this.utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.utilities;
	}

	/**
	 * @return the diagnosed
	 */
	public Year getYearDiagnosedSimulatedResponse() throws Exception {
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
	 * @param veteranCohort the cohort to set
	 */
	private void setCohort(VeteranCohort veteranCohort) {
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
			e.printStackTrace();
		}
	}

	/**
	 * @param utilities the utilities to set
	 */
	protected void setUtilities(Utilities utilities) {
		try {
			this.utilities = utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param yearDiagnosedSimulatedResponse the yearDiagnosedSimulatedResponse to
	 *                                       set
	 */
	private void setYearDiagnosedSimulatedResponse(Year yearDiagnosedSimulatedResponse) {
		try {
			this.yearDiagnosedSimulatedResponse = yearDiagnosedSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) throws Exception {
		if (!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
				.randBetween(CancerResponse.getMintogenerateerrorval(), CancerResponse.getMaxtogenerateerrorval()))) {
			this.setDiseasepresenceorabsencesimulatedepicresponse(
					this.getUtilities().randBetween((int) this.getDiseasepresenceorabsence().getMinimum(),
							(int) this.getDiseasepresenceorabsence().getMaximum()));
		} else {
			this.setDiseasepresenceorabsencesimulatedepicresponse(this.getUtilities()
					.randBetween(CancerResponse.getMintogenerateerrorval(), CancerResponse.getMaxtogenerateerrorval()));
		}

		// Use Noise to check if valid values of Year are to be generated
		// If not to generate noise, then assign diagnoses year between 1900 and 2020
		// TBD: Change seed years
		if (!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
				.randBetween(CancerResponse.getMintogenerateerrorval(), CancerResponse.getMaxtogenerateerrorval()))) {
			// this changes
			// Minimum is SimulatedDiseaseResponse year of birth
			// Maximum is Today
			// Error on line 2040 DateTimeFormatter.java
			// ParsePosition pos = (position != null ? position : new ParsePosition(0));
			this.setYearDiagnosedSimulatedResponse(Year.of(this.getUtilities().randBetween(
					veterancohort.getYearOfBirth().getValue(), Calendar.getInstance().get(Calendar.YEAR))));
		} else {
			this.setYearDiagnosedSimulatedResponse(Year
					.parse(new StringBuilder(this.getUtilities().randBetween(CancerResponse.getMintogenerateerrorval(),
							CancerResponse.getMaxtogenerateerrorval()))));
		}
	}

}
