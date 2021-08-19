package Diseases;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class MentalHealthADHD extends MentalHealthResponse {

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

	private ValueRange MHADHDMeds;
	private int MHADHDMedsAdministeredEpicResponse;

	public MentalHealthADHD(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthADHD.getMintogenerateerrorval(),
					MentalHealthADHD.getMaxtogenerateerrorval()));

			this.setMHADHDMeds(ValueRange.of(0, 1));
			this.setMHADHDMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(MentalHealthADHD.getMintogenerateerrorval(),
									MentalHealthADHD.getMaxtogenerateerrorval())))) {
				this.setMHADHDMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween((int) this.getMHADHDMeds().getMinimum(), (int) this.getMHADHDMeds().getMaximum()));
			} else {
				this.setMHADHDMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						MentalHealthADHD.getMintogenerateerrorval(), MentalHealthADHD.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public MentalHealthADHD(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthADHD.getMintogenerateerrorval(),
					MentalHealthADHD.getMaxtogenerateerrorval()));

			this.setMHADHDMeds(valuerange);
			this.setMHADHDMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(MentalHealthADHD.getMintogenerateerrorval(),
									MentalHealthADHD.getMaxtogenerateerrorval())))) {
				this.setMHADHDMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween((int) this.getMHADHDMeds().getMinimum(), (int) this.getMHADHDMeds().getMaximum()));
			} else {
				this.setMHADHDMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						MentalHealthADHD.getMintogenerateerrorval(), MentalHealthADHD.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @return the mHADHDMedsAdministeredEpicResponse
	 */
	public int getMentalhealthADHDmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.MHADHDMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHADHDMedsAdministeredEpicResponse;
	}

	/**
	 * @return the mHADHDMeds
	 */
	private ValueRange getMHADHDMeds() throws Exception {
		try {
			return this.MHADHDMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHADHDMeds;
	}

	/**
	 * @param mHADHDMeds the mHADHDMeds to set
	 */
	private void setMHADHDMeds(ValueRange mHADHDMeds) throws Exception {
		try {
			this.MHADHDMeds = mHADHDMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mHADHDMedsAdministeredEpicResponse the
	 *                                           mHADHDMedsAdministeredEpicResponse
	 *                                           to set
	 */
	private void setMHADHDMedsAdministeredEpicResponse(int mHADHDMedsAdministeredEpicResponse) throws Exception {
		try {
			this.MHADHDMedsAdministeredEpicResponse = mHADHDMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "MentalHealthADHD [MHADHDMeds=" + this.MHADHDMeds + ", MHADHDMedsAdministeredEpicResponse="
				+ this.MHADHDMedsAdministeredEpicResponse + "]";
	}

}
