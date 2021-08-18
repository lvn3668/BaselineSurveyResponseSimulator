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
public class MentalHealthEatingDisorder extends MentalHealthResponse {

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

	private ValueRange MHEatingDisorderMeds;
	private int MHEatingDisorderMedsAdministeredEpicResponse;

	public MentalHealthEatingDisorder(Cohort cohort) {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthEatingDisorder.getMintogenerateerrorval(),
					MentalHealthEatingDisorder.getMaxtogenerateerrorval()));

			this.setMHEatingDisorderMeds(ValueRange.of(0, 1));
			this.setMHEatingDisorderMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									MentalHealthEatingDisorder.getMintogenerateerrorval(),
									MentalHealthEatingDisorder.getMaxtogenerateerrorval())))) {
				this.setMHEatingDisorderMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getMHEatingDisorderMeds().getMinimum(),
								(int) this.getMHEatingDisorderMeds().getMaximum()));
			} else {
				this.setMHEatingDisorderMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(MentalHealthEatingDisorder.getMintogenerateerrorval(),
								MentalHealthEatingDisorder.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public MentalHealthEatingDisorder(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthEatingDisorder.getMintogenerateerrorval(),
					MentalHealthEatingDisorder.getMaxtogenerateerrorval()));

			this.setMHEatingDisorderMeds(valuerange);
			this.setMHEatingDisorderMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									MentalHealthEatingDisorder.getMintogenerateerrorval(),
									MentalHealthEatingDisorder.getMaxtogenerateerrorval())))) {
				this.setMHEatingDisorderMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getMHEatingDisorderMeds().getMinimum(),
								(int) this.getMHEatingDisorderMeds().getMaximum()));
			} else {
				this.setMHEatingDisorderMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(MentalHealthEatingDisorder.getMintogenerateerrorval(),
								MentalHealthEatingDisorder.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the mHEatingDisorderMeds
	 */
	private ValueRange getMHEatingDisorderMeds() throws Exception {
		try {
			return this.MHEatingDisorderMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHEatingDisorderMeds;
	}

	/**
	 * @return the mHEatingDisorderMedsAdministeredEpicResponse
	 */
	public int getMentalhealthEatingDisordermedicinesadministeredepicresponse() throws Exception {
		try {
			return this.MHEatingDisorderMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHEatingDisorderMedsAdministeredEpicResponse;
	}

	/**
	 * @param mHEatingDisorderMeds the mHEatingDisorderMeds to set
	 */
	private void setMHEatingDisorderMeds(ValueRange mHEatingDisorderMeds) throws Exception {
		try {
			this.MHEatingDisorderMeds = mHEatingDisorderMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mHEatingDisorderMedsAdministeredEpicResponse the
	 *                                                     mHEatingDisorderMedsAdministeredEpicResponse
	 *                                                     to set
	 */
	private void setMHEatingDisorderMedsAdministeredEpicResponse(int mHEatingDisorderMedsAdministeredEpicResponse)
			throws Exception {
		try {
			this.MHEatingDisorderMedsAdministeredEpicResponse = mHEatingDisorderMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "MentalHealthEatingDisorder [MHEatingDisorderMeds=" + this.MHEatingDisorderMeds
				+ ", MHEatingDisorderMedsAdministeredEpicResponse=" + this.MHEatingDisorderMedsAdministeredEpicResponse
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(MHEatingDisorderMeds, MHEatingDisorderMedsAdministeredEpicResponse);
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
		if (!(obj instanceof MentalHealthEatingDisorder)) {
			return false;
		}
		MentalHealthEatingDisorder other = (MentalHealthEatingDisorder) obj;
		return Objects.equals(MHEatingDisorderMeds, other.MHEatingDisorderMeds)
				&& MHEatingDisorderMedsAdministeredEpicResponse == other.MHEatingDisorderMedsAdministeredEpicResponse;
	}

}
