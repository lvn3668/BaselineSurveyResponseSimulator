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
public class MentalHealthOther extends MentalHealthResponse {

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

	private ValueRange MHOtherMeds;
	private int MHOtherMedsAdministeredEpicResponse;

	public MentalHealthOther(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthOther.getMintogenerateerrorval(),
					MentalHealthOther.getMaxtogenerateerrorval()));

			this.setMHOtherMeds(ValueRange.of(0, 1));
			this.setMHOtherMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(MentalHealthOther.getMintogenerateerrorval(),
									MentalHealthOther.getMaxtogenerateerrorval())))) {
				this.setMHOtherMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getMHOtherMeds().getMinimum(), (int) this.getMHOtherMeds().getMaximum()));
			} else {
				this.setMHOtherMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						MentalHealthOther.getMintogenerateerrorval(), MentalHealthOther.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public MentalHealthOther(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthOther.getMintogenerateerrorval(),
					MentalHealthOther.getMaxtogenerateerrorval()));

			this.setMHOtherMeds(valuerange);
			this.setMHOtherMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(MentalHealthOther.getMintogenerateerrorval(),
									MentalHealthOther.getMaxtogenerateerrorval())))) {
				this.setMHOtherMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getMHOtherMeds().getMinimum(), (int) this.getMHOtherMeds().getMaximum()));
			} else {
				this.setMHOtherMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						MentalHealthOther.getMintogenerateerrorval(), MentalHealthOther.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * @return the mHOtherMeds
	 */
	private ValueRange getMHOtherMeds() {
		try {
			return this.MHOtherMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHOtherMeds;
	}

	/**
	 * @return the mHOtherMedsAdministeredEpicResponse
	 */
	public int getMentalhealthothermedicinesadministeredepicresponse() {
		try {
			return this.MHOtherMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHOtherMedsAdministeredEpicResponse;
	}

	/**
	 * @param mHOtherMeds the mHOtherMeds to set
	 */
	private void setMHOtherMeds(ValueRange mHOtherMeds) {
		try {
			this.MHOtherMeds = mHOtherMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mHOtherMedsAdministeredEpicResponse the
	 *                                            mHOtherMedsAdministeredEpicResponse
	 *                                            to set
	 */
	private void setMHOtherMedsAdministeredEpicResponse(int mHOtherMedsAdministeredEpicResponse) {
		try {
			this.MHOtherMedsAdministeredEpicResponse = mHOtherMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "MentalHealthOther [MHOtherMeds=" + this.MHOtherMeds + ", MHOtherMedsAdministeredEpicResponse="
				+ this.MHOtherMedsAdministeredEpicResponse + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(MHOtherMeds, MHOtherMedsAdministeredEpicResponse);
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
		if (!(obj instanceof MentalHealthOther)) {
			return false;
		}
		MentalHealthOther other = (MentalHealthOther) obj;
		return Objects.equals(MHOtherMeds, other.MHOtherMeds)
				&& MHOtherMedsAdministeredEpicResponse == other.MHOtherMedsAdministeredEpicResponse;
	}

}
