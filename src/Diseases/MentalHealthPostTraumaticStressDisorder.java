package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class MentalHealthPostTraumaticStressDisorder extends MentalHealthResponse {

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

	private ValueRange MHPTSD;
	private int MHPTSDMedsEpicResponse;

	public MentalHealthPostTraumaticStressDisorder(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(MentalHealthPostTraumaticStressDisorder.getMintogenerateerrorval(),
							MentalHealthPostTraumaticStressDisorder.getMaxtogenerateerrorval()));

			this.setMHPTSD(ValueRange.of(0, 1));
			this.setMHPTSDMedsEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									MentalHealthPostTraumaticStressDisorder.getMintogenerateerrorval(),
									MentalHealthPostTraumaticStressDisorder.getMaxtogenerateerrorval())))) {
				this.setMHPTSDMedsEpicResponse(this.getUtilities().randBetween((int) this.getMHPTSD().getMinimum(),
						(int) this.getMHPTSD().getMaximum()));
			} else {
				this.setMHPTSDMedsEpicResponse(this.getUtilities().randBetween(
						MentalHealthPostTraumaticStressDisorder.getMintogenerateerrorval(),
						MentalHealthPostTraumaticStressDisorder.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public MentalHealthPostTraumaticStressDisorder(Cohort cohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(MentalHealthPostTraumaticStressDisorder.getMintogenerateerrorval(),
							MentalHealthPostTraumaticStressDisorder.getMaxtogenerateerrorval()));

			this.setMHPTSD(valuerange);
			this.setMHPTSDMedsEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									MentalHealthPostTraumaticStressDisorder.getMintogenerateerrorval(),
									MentalHealthPostTraumaticStressDisorder.getMaxtogenerateerrorval())))) {
				this.setMHPTSDMedsEpicResponse(this.getUtilities().randBetween((int) this.getMHPTSD().getMinimum(),
						(int) this.getMHPTSD().getMaximum()));
			} else {
				this.setMHPTSDMedsEpicResponse(this.getUtilities().randBetween(
						MentalHealthPostTraumaticStressDisorder.getMintogenerateerrorval(),
						MentalHealthPostTraumaticStressDisorder.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof MentalHealthPostTraumaticStressDisorder)) {
			return false;
		}
		MentalHealthPostTraumaticStressDisorder other = (MentalHealthPostTraumaticStressDisorder) obj;
		return Objects.equals(this.MHPTSD, other.MHPTSD) && this.MHPTSDMedsEpicResponse == other.MHPTSDMedsEpicResponse;
	}

	/**
	 * @return the mHPTSDMedsEpicResponse
	 */
	public int getMentalhealthptsdmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.MHPTSDMedsEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHPTSDMedsEpicResponse;
	}

	/**
	 * @return the mHPTSD
	 */
	private ValueRange getMHPTSD() throws Exception {
		try {
			return this.MHPTSD;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHPTSD;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.MHPTSD, this.MHPTSDMedsEpicResponse);
		return result;
	}

	/**
	 * @param mHPTSD the mHPTSD to set
	 */
	private void setMHPTSD(ValueRange mHPTSD) throws Exception {
		try {
			this.MHPTSD = mHPTSD;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mHPTSDMedsEpicResponse the mHPTSDMedsEpicResponse to set
	 */
	private void setMHPTSDMedsEpicResponse(int mHPTSDMedsEpicResponse) throws Exception {
		try {
			this.MHPTSDMedsEpicResponse = mHPTSDMedsEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "MentalHealthPostTraumaticStressDisorder [MHPTSD=" + this.MHPTSD + ", MHPTSDMedsEpicResponse="
				+ this.MHPTSDMedsEpicResponse + "]";
	}

}
