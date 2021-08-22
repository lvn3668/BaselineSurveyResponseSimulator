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
public class GIIrritableBowelSyndrome extends GastroIntestinalDiseaseResponse {

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

	private ValueRange GI_IBS_Meds;
	private int GIIBSMedsAdministeredEpicResponse;

	public GIIrritableBowelSyndrome(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(GIIrritableBowelSyndrome.getMintogenerateerrorval(),
					GIIrritableBowelSyndrome.getMaxtogenerateerrorval()));

			this.setGI_IBS_Meds(ValueRange.of(0, 1));
			this.setGIIBSMedsAdministeredEpicResponse(2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public GIIrritableBowelSyndrome(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(GIIrritableBowelSyndrome.getMintogenerateerrorval(),
					GIIrritableBowelSyndrome.getMaxtogenerateerrorval()));

			this.setGI_IBS_Meds(valuerange);
			this.setGIIBSMedsAdministeredEpicResponse(simulatedresponse);

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
		if (!(obj instanceof GIIrritableBowelSyndrome)) {
			return false;
		}
		GIIrritableBowelSyndrome other = (GIIrritableBowelSyndrome) obj;
		return this.GIIBSMedsAdministeredEpicResponse == other.GIIBSMedsAdministeredEpicResponse
				&& Objects.equals(this.GI_IBS_Meds, other.GI_IBS_Meds);
	}

	/**
	 * @return the gI_IBS_Meds
	 */
	private ValueRange getGI_IBS_Meds() throws Exception {
		return this.GI_IBS_Meds;
	}

	/**
	 * @return the gIIBSMedsAdministeredEpicResponse
	 */
	public int getGiIrritableBowelSyndromemedicinesadministeredepicresponse() throws Exception {
		return this.GIIBSMedsAdministeredEpicResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.GIIBSMedsAdministeredEpicResponse, this.GI_IBS_Meds);
		return result;
	}

	/**
	 * @param gI_IBS_Meds the gI_IBS_Meds to set
	 */
	private void setGI_IBS_Meds(ValueRange gI_IBS_Meds) throws Exception {
		this.GI_IBS_Meds = gI_IBS_Meds;
	}

	/**
	 * @param gIIBSMedsAdministeredEpicResponse the
	 *                                          gIIBSMedsAdministeredEpicResponse to
	 *                                          set
	 */
	private void setGIIBSMedsAdministeredEpicResponse(int gIIBSMedsAdministeredEpicResponse) throws Exception {
		this.GIIBSMedsAdministeredEpicResponse = gIIBSMedsAdministeredEpicResponse;
	}

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) throws Exception {

		super.simulateResponses(veterancohort);
		if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
		// add getters for uniform dist and random epic vars
				(!this.getUniformdistribution().generatenoiseinresponsevariables(
						this.getUtilities().randBetween(GIIrritableBowelSyndrome.getMintogenerateerrorval(),
								GIIrritableBowelSyndrome.getMaxtogenerateerrorval())))) {
			this.setGIIBSMedsAdministeredEpicResponse(this.getUtilities()
					.randBetween((int) this.getGI_IBS_Meds().getMinimum(), (int) this.getGI_IBS_Meds().getMaximum()));
		} else {
			this.setGIIBSMedsAdministeredEpicResponse(
					this.getUtilities().randBetween(GIIrritableBowelSyndrome.getMintogenerateerrorval(),
							GIIrritableBowelSyndrome.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "GIIrritableBowelSyndrome [GI_IBS_Meds=" + this.GI_IBS_Meds + ", GIIBSMedsAdministeredEpicResponse="
				+ this.GIIBSMedsAdministeredEpicResponse + "]";
	}
}
