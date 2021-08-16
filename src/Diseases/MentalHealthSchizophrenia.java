package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

// Differentiate between handled expections and unhandled (thrown)
/**
 * @author Lalitha Viswanathan
 * Affiliation VABHS / MAVERIC 
 *
 */
public class MentalHealthSchizophrenia extends MentalHealthResponse {

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

	private ValueRange MHSchizophreniaMeds;
	private int MHSchizophreniaMedsAdministeredEpicResponse;

	// throw redundant
	// Added to allow extensions where exception is not captured and
	// subclass of Exception is handled

	// Make exception handling more specific and throw the rest
	public MentalHealthSchizophrenia(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthSchizophrenia.getMintogenerateerrorval(),
					MentalHealthSchizophrenia.getMaxtogenerateerrorval()));

			this.setMHSchizophreniaMeds(ValueRange.of(0, 1));
			this.setMHSchizophreniaMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									MentalHealthSchizophrenia.getMintogenerateerrorval(),
									MentalHealthSchizophrenia.getMaxtogenerateerrorval())))) {
				this.setMHSchizophreniaMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getMHSchizophreniaMeds().getMinimum(),
								(int) this.getMHSchizophreniaMeds().getMaximum()));
			} else {
				this.setMHSchizophreniaMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(MentalHealthSchizophrenia.getMintogenerateerrorval(),
								MentalHealthSchizophrenia.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public MentalHealthSchizophrenia(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthSchizophrenia.getMintogenerateerrorval(),
					MentalHealthSchizophrenia.getMaxtogenerateerrorval()));

			this.setMHSchizophreniaMeds(valuerange);
			this.setMHSchizophreniaMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									MentalHealthSchizophrenia.getMintogenerateerrorval(),
									MentalHealthSchizophrenia.getMaxtogenerateerrorval())))) {
				this.setMHSchizophreniaMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getMHSchizophreniaMeds().getMinimum(),
								(int) this.getMHSchizophreniaMeds().getMaximum()));
			} else {
				this.setMHSchizophreniaMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(MentalHealthSchizophrenia.getMintogenerateerrorval(),
								MentalHealthSchizophrenia.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the mHSchizophreniaMeds
	 */
	private ValueRange getMHSchizophreniaMeds() throws Exception {
		try {
			return this.MHSchizophreniaMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHSchizophreniaMeds;
	}

	/**
	 * @return the mHSchizophreniaMedsAdministeredEpicResponse
	 */
	public int getMHSchizophreniaMedsAdministeredEpicResponse() throws Exception {
		try {
			return this.MHSchizophreniaMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHSchizophreniaMedsAdministeredEpicResponse;
	}

	/**
	 * @param mHSchizophreniaMeds the mHSchizophreniaMeds to set
	 */
	private void setMHSchizophreniaMeds(ValueRange mHSchizophreniaMeds) throws Exception {
		try {
			this.MHSchizophreniaMeds = mHSchizophreniaMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mHSchizophreniaMedsAdministeredEpicResponse the
	 *                                                    mHSchizophreniaMedsAdministeredEpicResponse
	 *                                                    to set
	 */
	// throw redundant
	private void setMHSchizophreniaMedsAdministeredEpicResponse(int mHSchizophreniaMedsAdministeredEpicResponse)
			throws Exception {
		try {
			this.MHSchizophreniaMedsAdministeredEpicResponse = mHSchizophreniaMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "MentalHealthSchizophrenia [MHSchizophreniaMeds=" + this.MHSchizophreniaMeds
				+ ", MHSchizophreniaMedsAdministeredEpicResponse=" + this.MHSchizophreniaMedsAdministeredEpicResponse
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.MHSchizophreniaMeds, this.MHSchizophreniaMedsAdministeredEpicResponse);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof MentalHealthSchizophrenia)) {
			return false;
		}
		MentalHealthSchizophrenia other = (MentalHealthSchizophrenia) obj;
		return Objects.equals(this.MHSchizophreniaMeds, other.MHSchizophreniaMeds)
				&& this.MHSchizophreniaMedsAdministeredEpicResponse == other.MHSchizophreniaMedsAdministeredEpicResponse;
	}

}
