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
public class MentalHealthSocPh extends MentalHealthResponse {

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

	private ValueRange MHSocPhMed;
	private int MHSocPhMedAdministeredEpicResponse;

	public MentalHealthSocPh(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(MentalHealthSocPh.getMintogenerateerrorval(),
					MentalHealthSocPh.getMaxtogenerateerrorval()));

			this.setMHSocPhMed(ValueRange.of(0, 1));
			this.setMHSocPhMedAdministeredEpicResponse(2);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	// Exception Handling TBD
	public MentalHealthSocPh(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(MentalHealthSocPh.getMintogenerateerrorval(),
					MentalHealthSocPh.getMaxtogenerateerrorval()));

			this.setMHSocPhMed(valuerange);
			this.setMHSocPhMedAdministeredEpicResponse(simulatedresponse);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
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
		if (!(obj instanceof MentalHealthSocPh)) {
			return false;
		}
		MentalHealthSocPh other = (MentalHealthSocPh) obj;
		return Objects.equals(this.MHSocPhMed, other.MHSocPhMed)
				&& this.MHSocPhMedAdministeredEpicResponse == other.MHSocPhMedAdministeredEpicResponse;
	}

	/**
	 * @return the mHSocPhMedAdministeredEpicResponse
	 */
	public int getMentalhealthsocphmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.MHSocPhMedAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHSocPhMedAdministeredEpicResponse;
	}

	/**
	 * @return the mHSocPhMed
	 */
	private ValueRange getMHSocPhMed() {
		try {
			return this.MHSocPhMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHSocPhMed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.MHSocPhMed, this.MHSocPhMedAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param mHSocPhMed the mHSocPhMed to set
	 */
	private void setMHSocPhMed(ValueRange mHSocPhMed) throws Exception {
		try {
			this.MHSocPhMed = mHSocPhMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mHSocPhMedAdministeredEpicResponse the
	 *                                           mHSocPhMedAdministeredEpicResponse
	 *                                           to set
	 */
	private void setMHSocPhMedAdministeredEpicResponse(int mHSocPhMedAdministeredEpicResponse) throws Exception {
		try {
			this.MHSocPhMedAdministeredEpicResponse = mHSocPhMedAdministeredEpicResponse;
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
				(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
						MentalHealthSocPh.getMintogenerateerrorval(), MentalHealthSocPh.getMaxtogenerateerrorval())))) {
			this.setMHSocPhMedAdministeredEpicResponse(this.getUtilities()
					.randBetween((int) this.getMHSocPhMed().getMinimum(), (int) this.getMHSocPhMed().getMaximum()));
		} else {
			this.setMHSocPhMedAdministeredEpicResponse(this.getUtilities().randBetween(
					MentalHealthSocPh.getMintogenerateerrorval(), MentalHealthSocPh.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "MentalHealthSocPh [MHSocPhMed=" + this.MHSocPhMed + ", MHSocPhMedAdministeredEpicResponse="
				+ this.MHSocPhMedAdministeredEpicResponse + "]";
	}

}
