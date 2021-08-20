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
public class GIUlceritiveColitis extends GastroIntestinalDiseaseResponse {

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

	private ValueRange GIUCMeds;
	private int GIUCMedsAdministeredEpicResponse;

	public GIUlceritiveColitis(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GIUlceritiveColitis.getMintogenerateerrorval(),
					GIUlceritiveColitis.getMaxtogenerateerrorval()));

			this.setGIUCMeds(ValueRange.of(0, 1));
			this.setGIUCMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(GIUlceritiveColitis.getMintogenerateerrorval(),
									GIUlceritiveColitis.getMaxtogenerateerrorval())))) {
				this.setGIUCMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween((int) this.getGIUCMeds().getMinimum(), (int) this.getGIUCMeds().getMaximum()));
			} else {
				this.setGIUCMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(GIUlceritiveColitis.getMintogenerateerrorval(),
								GIUlceritiveColitis.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GIUlceritiveColitis(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GIUlceritiveColitis.getMintogenerateerrorval(),
					GIUlceritiveColitis.getMaxtogenerateerrorval()));

			this.setGIUCMeds(valuerange);
			this.setGIUCMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(GIUlceritiveColitis.getMintogenerateerrorval(),
									GIUlceritiveColitis.getMaxtogenerateerrorval())))) {
				this.setGIUCMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween((int) this.getGIUCMeds().getMinimum(), (int) this.getGIUCMeds().getMaximum()));
			} else {
				this.setGIUCMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(GIUlceritiveColitis.getMintogenerateerrorval(),
								GIUlceritiveColitis.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof GIUlceritiveColitis)) {
			return false;
		}
		GIUlceritiveColitis other = (GIUlceritiveColitis) obj;
		return Objects.equals(this.GIUCMeds, other.GIUCMeds)
				&& this.GIUCMedsAdministeredEpicResponse == other.GIUCMedsAdministeredEpicResponse;
	}

	/**
	 * @return the gIUCMeds
	 */
	private ValueRange getGIUCMeds() {
		return this.GIUCMeds;
	}

	/**
	 * @return the gIUCMedsAdministeredEpicResponse
	 */
	public int getGiUlceritiveColitismedicinesadministeredepicresponse() {
		return this.GIUCMedsAdministeredEpicResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.GIUCMeds, this.GIUCMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param gIUCMeds the gIUCMeds to set
	 */
	private void setGIUCMeds(ValueRange gIUCMeds) {
		this.GIUCMeds = gIUCMeds;
	}

	/**
	 * @param gIUCMedsAdministeredEpicResponse the gIUCMedsAdministeredEpicResponse
	 *                                         to set
	 */
	private void setGIUCMedsAdministeredEpicResponse(int gIUCMedsAdministeredEpicResponse) {
		this.GIUCMedsAdministeredEpicResponse = gIUCMedsAdministeredEpicResponse;
	}

	@Override
	public String toString() {
		return "GIUC [GIUCMeds=" + this.GIUCMeds + ", GIUCMedsAdministeredEpicResponse="
				+ this.GIUCMedsAdministeredEpicResponse + "]";
	}

}
