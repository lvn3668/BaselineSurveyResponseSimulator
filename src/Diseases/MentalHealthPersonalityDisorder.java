package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class MentalHealthPersonalityDisorder extends MentalHealthResponse {

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

	private ValueRange MHPersonalityDisorderMeds;
	private int MHPersonalityDisorderMedsAdministeredEpicResponse;

	public MentalHealthPersonalityDisorder(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new RandomizingDistribution(MentalHealthPersonalityDisorder.getMintogenerateerrorval(),
							MentalHealthPersonalityDisorder.getMaxtogenerateerrorval()));

			this.setMHPersonalityDisorderMeds(ValueRange.of(0, 1));
			this.setMHPersonalityDisorderMedsAdministeredEpicResponse(2);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public MentalHealthPersonalityDisorder(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new RandomizingDistribution(MentalHealthPersonalityDisorder.getMintogenerateerrorval(),
							MentalHealthPersonalityDisorder.getMaxtogenerateerrorval()));

			this.setMHPersonalityDisorderMeds(valuerange);
			this.setMHPersonalityDisorderMedsAdministeredEpicResponse(simulatedresponse);
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
		if (!(obj instanceof MentalHealthPersonalityDisorder)) {
			return false;
		}
		MentalHealthPersonalityDisorder other = (MentalHealthPersonalityDisorder) obj;
		return Objects.equals(this.MHPersonalityDisorderMeds, other.MHPersonalityDisorderMeds)
				&& this.MHPersonalityDisorderMedsAdministeredEpicResponse == other.MHPersonalityDisorderMedsAdministeredEpicResponse;
	}

	/**
	 * @return the mHPersonalityDisorderMedsAdministeredEpicResponse
	 */
	public int getMentalhealthpersonalitydisordermedicinesadministeredepicresponse() throws Exception {
		try {
			return this.MHPersonalityDisorderMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHPersonalityDisorderMedsAdministeredEpicResponse;
	}

	/**
	 * @return the mHPersonalityDisorderMeds
	 */
	private ValueRange getMHPersonalityDisorderMeds() throws Exception {
		try {
			return this.MHPersonalityDisorderMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHPersonalityDisorderMeds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.MHPersonalityDisorderMeds, this.MHPersonalityDisorderMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param mHPersonalityDisorderMeds the mHPersonalityDisorderMeds to set
	 */
	private void setMHPersonalityDisorderMeds(ValueRange mHPersonalityDisorderMeds) throws Exception {
		try {
			this.MHPersonalityDisorderMeds = mHPersonalityDisorderMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mHPersonalityDisorderMedsAdministeredEpicResponse the
	 *                                                          mHPersonalityDisorderMedsAdministeredEpicResponse
	 *                                                          to set
	 */
	private void setMHPersonalityDisorderMedsAdministeredEpicResponse(
			int mHPersonalityDisorderMedsAdministeredEpicResponse) throws Exception {
		try {
			this.MHPersonalityDisorderMedsAdministeredEpicResponse = mHPersonalityDisorderMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) throws Exception {
		super.simulateResponses(veterancohort);
		if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
		// add getters for uniform dist and random epic vars
				(!this.getUniformdistribution()
						.generatenoiseinresponsevariables(this.getUtilities().randBetween(
								MentalHealthPersonalityDisorder.getMintogenerateerrorval(),
								MentalHealthPersonalityDisorder.getMaxtogenerateerrorval())))) {
			this.setMHPersonalityDisorderMedsAdministeredEpicResponse(
					this.getUtilities().randBetween((int) this.getMHPersonalityDisorderMeds().getMinimum(),
							(int) this.getMHPersonalityDisorderMeds().getMaximum()));
		} else {
			this.setMHPersonalityDisorderMedsAdministeredEpicResponse(
					this.getUtilities().randBetween(MentalHealthPersonalityDisorder.getMintogenerateerrorval(),
							MentalHealthPersonalityDisorder.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "MentalHealthPersonalityDisorder [MHPersonalityDisorderMeds=" + this.MHPersonalityDisorderMeds
				+ ", MHPersonalityDisorderMedsAdministeredEpicResponse="
				+ this.MHPersonalityDisorderMedsAdministeredEpicResponse + "]";
	}

}
