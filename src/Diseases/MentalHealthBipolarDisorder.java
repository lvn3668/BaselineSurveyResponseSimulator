package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan
 * Affiliation VABHS / MAVERIC 
 *
 */
public class MentalHealthBipolarDisorder extends MentalHealthResponse {

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

	private ValueRange MHBPDMeds;
	private int MHBPDMedsAdministeredEpicResponse;

	public MentalHealthBipolarDisorder(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthBipolarDisorder.getMintogenerateerrorval(),
					MentalHealthBipolarDisorder.getMaxtogenerateerrorval()));

			this.setMHBPDMeds(ValueRange.of(0, 1));
			this.setMHBPDMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									MentalHealthBipolarDisorder.getMintogenerateerrorval(),
									MentalHealthBipolarDisorder.getMaxtogenerateerrorval())))) {
				this.setMHBPDMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween((int) this.getMHBPDMeds().getMinimum(), (int) this.getMHBPDMeds().getMaximum()));
			} else {
				this.setMHBPDMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(MentalHealthBipolarDisorder.getMintogenerateerrorval(),
								MentalHealthBipolarDisorder.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public MentalHealthBipolarDisorder(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthBipolarDisorder.getMintogenerateerrorval(),
					MentalHealthBipolarDisorder.getMaxtogenerateerrorval()));

			this.setMHBPDMeds(valuerange);
			this.setMHBPDMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									MentalHealthBipolarDisorder.getMintogenerateerrorval(),
									MentalHealthBipolarDisorder.getMaxtogenerateerrorval())))) {
				this.setMHBPDMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween((int) this.getMHBPDMeds().getMinimum(), (int) this.getMHBPDMeds().getMaximum()));
			} else {
				this.setMHBPDMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(MentalHealthBipolarDisorder.getMintogenerateerrorval(),
								MentalHealthBipolarDisorder.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the mHBPDMeds
	 */
	private ValueRange getMHBPDMeds() throws Exception {
		try {
			return this.MHBPDMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHBPDMeds;
	}

	/**
	 * @return the mHBPDMedsAdministeredEpicResponse
	 */
	public int getMHBPDMedsAdministeredEpicResponse() throws Exception {
		try {
			return this.MHBPDMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHBPDMedsAdministeredEpicResponse;
	}

	/**
	 * @param mHBPDMeds the mHBPDMeds to set
	 */
	private void setMHBPDMeds(ValueRange mHBPDMeds) throws Exception {
		try {
			this.MHBPDMeds = mHBPDMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mHBPDMedsAdministeredEpicResponse the
	 *                                          mHBPDMedsAdministeredEpicResponse to
	 *                                          set
	 */
	private void setMHBPDMedsAdministeredEpicResponse(int mHBPDMedsAdministeredEpicResponse) throws Exception {
		try {
			this.MHBPDMedsAdministeredEpicResponse = mHBPDMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(MHBPDMeds, MHBPDMedsAdministeredEpicResponse);
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
		if (!(obj instanceof MentalHealthBipolarDisorder)) {
			return false;
		}
		MentalHealthBipolarDisorder other = (MentalHealthBipolarDisorder) obj;
		return Objects.equals(MHBPDMeds, other.MHBPDMeds)
				&& MHBPDMedsAdministeredEpicResponse == other.MHBPDMedsAdministeredEpicResponse;
	}

	@Override
	public String toString() {
		return "MentalHealthBipolarDisorder [MHBPDMeds=" + MHBPDMeds + ", MHBPDMedsAdministeredEpicResponse="
				+ MHBPDMedsAdministeredEpicResponse + "]";
	}

}
