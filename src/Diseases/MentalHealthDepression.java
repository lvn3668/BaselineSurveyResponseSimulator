package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class MentalHealthDepression extends MentalHealthResponse {

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

	private ValueRange MHDepressionMeds;
	private int MHDepressionMedsAdministeredEpicResponse;

	public MentalHealthDepression(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthDepression.getMintogenerateerrorval(),
					MentalHealthDepression.getMaxtogenerateerrorval()));

			this.setMHDepressionMeds(ValueRange.of(0, 1));
			this.setMHDepressionMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(MentalHealthDepression.getMintogenerateerrorval(),
									MentalHealthDepression.getMaxtogenerateerrorval())))) {
				this.setMHDepressionMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getMHDepressionMeds().getMinimum(), (int) this.getMHDepressionMeds().getMaximum()));
			} else {
				this.setMHDepressionMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(MentalHealthDepression.getMintogenerateerrorval(),
								MentalHealthDepression.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public MentalHealthDepression(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthDepression.getMintogenerateerrorval(),
					MentalHealthDepression.getMaxtogenerateerrorval()));

			this.setMHDepressionMeds(valuerange);
			this.setMHDepressionMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(MentalHealthDepression.getMintogenerateerrorval(),
									MentalHealthDepression.getMaxtogenerateerrorval())))) {
				this.setMHDepressionMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getMHDepressionMeds().getMinimum(), (int) this.getMHDepressionMeds().getMaximum()));
			} else {
				this.setMHDepressionMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(MentalHealthDepression.getMintogenerateerrorval(),
								MentalHealthDepression.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof MentalHealthDepression)) {
			return false;
		}
		MentalHealthDepression other = (MentalHealthDepression) obj;
		return Objects.equals(this.MHDepressionMeds, other.MHDepressionMeds)
				&& this.MHDepressionMedsAdministeredEpicResponse == other.MHDepressionMedsAdministeredEpicResponse;
	}

	/**
	 * @return the mHDepressionMedsAdministeredEpicResponse
	 */
	public int getMentalhealthDepressionmedicinesadministeredepicresponse() {
		try {
			return this.MHDepressionMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHDepressionMedsAdministeredEpicResponse;
	}

	/**
	 * @return the mHDepressionMeds
	 */
	private ValueRange getMHDepressionMeds() {
		try {
			return this.MHDepressionMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHDepressionMeds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.MHDepressionMeds, this.MHDepressionMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param mHDepressionMeds the mHDepressionMeds to set
	 */
	private void setMHDepressionMeds(ValueRange mHDepressionMeds) {
		try {
			this.MHDepressionMeds = mHDepressionMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mHDepressionMedsAdministeredEpicResponse the
	 *                                                 mHDepressionMedsAdministeredEpicResponse
	 *                                                 to set
	 */
	private void setMHDepressionMedsAdministeredEpicResponse(int mHDepressionMedsAdministeredEpicResponse) {
		try {
			this.MHDepressionMedsAdministeredEpicResponse = mHDepressionMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
