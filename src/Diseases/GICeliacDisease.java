package Diseases;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class GICeliacDisease extends GastroIntestinalDiseaseResponse {

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

	private int celiacDiseaseMedAdministeredEpicResponse;

	private ValueRange GICeliacDiseaseMeds;

	public GICeliacDisease(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GICeliacDisease.getMintogenerateerrorval(),
					GICeliacDisease.getMaxtogenerateerrorval()));

			this.setGICeliacDiseaseMeds(ValueRange.of(0, 1));
			this.setCeliacDiseaseMedAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							GICeliacDisease.getMintogenerateerrorval(), GICeliacDisease.getMaxtogenerateerrorval())))) {
				this.setCeliacDiseaseMedAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getGICeliacDiseaseMeds().getMinimum(),
								(int) this.getGICeliacDiseaseMeds().getMaximum()));
			} else {
				this.setCeliacDiseaseMedAdministeredEpicResponse(this.getUtilities().randBetween(
						GICeliacDisease.getMintogenerateerrorval(), GICeliacDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GICeliacDisease(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GICeliacDisease.getMintogenerateerrorval(),
					GICeliacDisease.getMaxtogenerateerrorval()));

			this.setGICeliacDiseaseMeds(valuerange);
			this.setCeliacDiseaseMedAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							GICeliacDisease.getMintogenerateerrorval(), GICeliacDisease.getMaxtogenerateerrorval())))) {
				this.setCeliacDiseaseMedAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getGICeliacDiseaseMeds().getMinimum(),
								(int) this.getGICeliacDiseaseMeds().getMaximum()));
			} else {
				this.setCeliacDiseaseMedAdministeredEpicResponse(this.getUtilities().randBetween(
						GICeliacDisease.getMintogenerateerrorval(), GICeliacDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the celiacDiseaseMedAdministeredEpicResponse
	 */
	public int getGiCeliacDiseasemedicinesadministeredepicresponse() throws Exception {
		try {
			return this.celiacDiseaseMedAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.celiacDiseaseMedAdministeredEpicResponse;
	}

	/**
	 * @return the gICeliacDiseaseMeds
	 */
	private ValueRange getGICeliacDiseaseMeds() throws Exception {
		try {
			return this.GICeliacDiseaseMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.GICeliacDiseaseMeds;
	}

	/**
	 * @param celiacDiseaseMedAdministeredEpicResponse the
	 *                                                 celiacDiseaseMedAdministeredEpicResponse
	 *                                                 to set
	 */
	private void setCeliacDiseaseMedAdministeredEpicResponse(int celiacDiseaseMedAdministeredEpicResponse)
			throws Exception {
		try {
			this.celiacDiseaseMedAdministeredEpicResponse = celiacDiseaseMedAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param gICeliacDiseaseMeds the gICeliacDiseaseMeds to set
	 */
	private void setGICeliacDiseaseMeds(ValueRange gICeliacDiseaseMeds) throws Exception {
		try {
			this.GICeliacDiseaseMeds = gICeliacDiseaseMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "GICeliacDisease [GICeliacDiseaseMeds=" + this.GICeliacDiseaseMeds
				+ ", celiacDiseaseMedAdministeredEpicResponse=" + this.celiacDiseaseMedAdministeredEpicResponse + "]";
	}

}
