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
public class GIUlcer extends GastroIntestinalDiseaseResponse {

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

	private ValueRange GIUlcerMeds;
	private int GIUlcerMedsAdministeredEpicResponse;

	public GIUlcer(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(GIUlcer.getMintogenerateerrorval(), GIUlcer.getMaxtogenerateerrorval()));

			this.setGIUlcerMeds(ValueRange.of(0, 1));
			this.setGIUlcerMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(GIUlcer.getMintogenerateerrorval(), GIUlcer.getMaxtogenerateerrorval())))) {
				this.setGIUlcerMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getGIUlcerMeds().getMinimum(), (int) this.getGIUlcerMeds().getMaximum()));
			} else {
				this.setGIUlcerMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(GIUlcer.getMintogenerateerrorval(), GIUlcer.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GIUlcer(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(GIUlcer.getMintogenerateerrorval(), GIUlcer.getMaxtogenerateerrorval()));

			this.setGIUlcerMeds(valuerange);
			this.setGIUlcerMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(GIUlcer.getMintogenerateerrorval(), GIUlcer.getMaxtogenerateerrorval())))) {
				this.setGIUlcerMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getGIUlcerMeds().getMinimum(), (int) this.getGIUlcerMeds().getMaximum()));
			} else {
				this.setGIUlcerMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(GIUlcer.getMintogenerateerrorval(), GIUlcer.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof GIUlcer)) {
			return false;
		}
		GIUlcer other = (GIUlcer) obj;
		return Objects.equals(this.GIUlcerMeds, other.GIUlcerMeds)
				&& this.GIUlcerMedsAdministeredEpicResponse == other.GIUlcerMedsAdministeredEpicResponse;
	}

	/**
	 * @return the gIUlcerMedsAdministeredEpicResponse
	 */
	public int getGiUlcermedicinesadministeredepicresponse() throws Exception {
		try {
			return this.GIUlcerMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.GIUlcerMedsAdministeredEpicResponse;
	}

	/**
	 * @return the gIUlcerMeds
	 */
	private ValueRange getGIUlcerMeds() throws Exception {
		try {
			return this.GIUlcerMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.GIUlcerMeds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.GIUlcerMeds, this.GIUlcerMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param gIUlcerMeds the gIUlcerMeds to set
	 */
	private void setGIUlcerMeds(ValueRange gIUlcerMeds) throws Exception {
		try {
			this.GIUlcerMeds = gIUlcerMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param gIUlcerMedsAdministeredEpicResponse the
	 *                                            gIUlcerMedsAdministeredEpicResponse
	 *                                            to set
	 */
	private void setGIUlcerMedsAdministeredEpicResponse(int gIUlcerMedsAdministeredEpicResponse) throws Exception {
		try {
			this.GIUlcerMedsAdministeredEpicResponse = gIUlcerMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "GIUlcer [GIUlcerMeds=" + this.GIUlcerMeds + ", GIUlcerMedsAdministeredEpicResponse="
				+ this.GIUlcerMedsAdministeredEpicResponse + "]";
	}

}
