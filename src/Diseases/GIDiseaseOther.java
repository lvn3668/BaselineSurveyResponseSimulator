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
public class GIDiseaseOther extends GastroIntestinalDiseaseResponse {

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

	private ValueRange GIOtherMed;
	private int GIOtherMedAdministeredEpicResponse;

	public GIDiseaseOther(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(GIDiseaseOther.getMintogenerateerrorval(),
					GIDiseaseOther.getMaxtogenerateerrorval()));

			this.setGIOtherMed(ValueRange.of(0, 1));
			this.setGIOtherMedAdministeredEpicResponse(2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GIDiseaseOther(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(GIDiseaseOther.getMintogenerateerrorval(),
					GIDiseaseOther.getMaxtogenerateerrorval()));

			this.setGIOtherMed(valuerange);
			this.setGIOtherMedAdministeredEpicResponse(simulatedresponse);
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
		if (!(obj instanceof GIDiseaseOther)) {
			return false;
		}
		GIDiseaseOther other = (GIDiseaseOther) obj;
		return Objects.equals(this.GIOtherMed, other.GIOtherMed)
				&& this.GIOtherMedAdministeredEpicResponse == other.GIOtherMedAdministeredEpicResponse;
	}

	/**
	 * @return the gIOtherMedAdministeredEpicResponse
	 */
	public int getGiOtherDiseasemedicinesadministeredepicresponse() throws Exception {
		try {
			return this.GIOtherMedAdministeredEpicResponse;
		} finally {
		}
	}

	/**
	 * @return the gIOtherMed
	 */
	private ValueRange getGIOtherMed() throws Exception {
		try {
			return this.GIOtherMed;
		} finally {
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.GIOtherMed, this.GIOtherMedAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param gIOtherMed the gIOtherMed to set
	 */
	private void setGIOtherMed(ValueRange gIOtherMed) throws Exception {
		try {
			this.GIOtherMed = gIOtherMed;
		} finally {
		}
	}

	/**
	 * @param gIOtherMedAdministeredEpicResponse the
	 *                                           gIOtherMedAdministeredEpicResponse
	 *                                           to set
	 */
	private void setGIOtherMedAdministeredEpicResponse(int gIOtherMedAdministeredEpicResponse) throws Exception {
		try {
			this.GIOtherMedAdministeredEpicResponse = gIOtherMedAdministeredEpicResponse;
		} finally {
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
						GIDiseaseOther.getMintogenerateerrorval(), GIDiseaseOther.getMaxtogenerateerrorval())))) {
			this.setGIOtherMedAdministeredEpicResponse(this.getUtilities()
					.randBetween((int) this.getGIOtherMed().getMinimum(), (int) this.getGIOtherMed().getMaximum()));
		} else {
			this.setGIOtherMedAdministeredEpicResponse(this.getUtilities()
					.randBetween(GIDiseaseOther.getMintogenerateerrorval(), GIDiseaseOther.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "GIDiseaseOther [GIOtherMed=" + this.GIOtherMed + ", GIOtherMedAdministeredEpicResponse="
				+ this.GIOtherMedAdministeredEpicResponse + "]";
	}

}
