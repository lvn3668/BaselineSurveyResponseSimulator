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
public class GICrohnsDisease extends GastroIntestinalDiseaseResponse {

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

	private int CrohnsDiseaseMedsAdministeredEpicResponse;
	private ValueRange GICrohnsDiseaseMeds;

	public GICrohnsDisease(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GICrohnsDisease.getMintogenerateerrorval(),
					GICrohnsDisease.getMaxtogenerateerrorval()));

			this.setGICrohnsDiseaseMeds(ValueRange.of(0, 1));
			this.setCrohnsDiseaseMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							GICrohnsDisease.getMintogenerateerrorval(), GICrohnsDisease.getMaxtogenerateerrorval())))) {
				this.setCrohnsDiseaseMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getGICrohnsDiseaseMeds().getMinimum(),
								(int) this.getGICrohnsDiseaseMeds().getMaximum()));
			} else {
				this.setCrohnsDiseaseMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						GICrohnsDisease.getMintogenerateerrorval(), GICrohnsDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GICrohnsDisease(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GICrohnsDisease.getMintogenerateerrorval(),
					GICrohnsDisease.getMaxtogenerateerrorval()));

			this.setGICrohnsDiseaseMeds(valuerange);
			this.setCrohnsDiseaseMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							GICrohnsDisease.getMintogenerateerrorval(), GICrohnsDisease.getMaxtogenerateerrorval())))) {
				this.setCrohnsDiseaseMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getGICrohnsDiseaseMeds().getMinimum(),
								(int) this.getGICrohnsDiseaseMeds().getMaximum()));
			} else {
				this.setCrohnsDiseaseMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						GICrohnsDisease.getMintogenerateerrorval(), GICrohnsDisease.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof GICrohnsDisease)) {
			return false;
		}
		GICrohnsDisease other = (GICrohnsDisease) obj;
		return this.CrohnsDiseaseMedsAdministeredEpicResponse == other.CrohnsDiseaseMedsAdministeredEpicResponse
				&& Objects.equals(this.GICrohnsDiseaseMeds, other.GICrohnsDiseaseMeds);
	}

	/**
	 * @return the crohnsDiseaseMedsAdministeredEpicResponse
	 */
	public int getGiCrohnsDiseasemedicinesadministeredepicresponse() throws Exception {
		try {
			return this.CrohnsDiseaseMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.CrohnsDiseaseMedsAdministeredEpicResponse;
	}

	/**
	 * @return the gICrohnsDiseaseMeds
	 */
	private ValueRange getGICrohnsDiseaseMeds() throws Exception {
		try {
			return this.GICrohnsDiseaseMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.GICrohnsDiseaseMeds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.CrohnsDiseaseMedsAdministeredEpicResponse, this.GICrohnsDiseaseMeds);
		return result;
	}

	/**
	 * @param crohnsDiseaseMedsAdministeredEpicResponse the
	 *                                                  crohnsDiseaseMedsAdministeredEpicResponse
	 *                                                  to set
	 */
	private void setCrohnsDiseaseMedsAdministeredEpicResponse(int crohnsDiseaseMedsAdministeredEpicResponse)
			throws Exception {
		try {
			this.CrohnsDiseaseMedsAdministeredEpicResponse = crohnsDiseaseMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param gICrohnsDiseaseMeds the gICrohnsDiseaseMeds to set
	 */
	private void setGICrohnsDiseaseMeds(ValueRange gICrohnsDiseaseMeds) throws Exception {
		try {
			this.GICrohnsDiseaseMeds = gICrohnsDiseaseMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "GICrohnsDisease [GICrohnsDiseaseMeds=" + this.GICrohnsDiseaseMeds
				+ ", CrohnsDiseaseMedsAdministeredEpicResponse=" + this.CrohnsDiseaseMedsAdministeredEpicResponse + "]";
	}

}
