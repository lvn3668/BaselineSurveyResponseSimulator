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
public class HighBloodPressureDisease extends InfectiousDiseaseResponse {

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

	private ValueRange HBPDMed;
	private int HBPDMedsAdministeredEpicResponse;

	public HighBloodPressureDisease(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(HighBloodPressureDisease.getMintogenerateerrorval(),
					HighBloodPressureDisease.getMaxtogenerateerrorval()));

			this.setHBPDMed(ValueRange.of(0, 1));
			this.setHBPDMedsAdministeredEpicResponse(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public HighBloodPressureDisease(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(HighBloodPressureDisease.getMintogenerateerrorval(),
					HighBloodPressureDisease.getMaxtogenerateerrorval()));

			this.setHBPDMed(valuerange);
			this.setHBPDMedsAdministeredEpicResponse(simulatedresponse);
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
		if (!(obj instanceof HighBloodPressureDisease)) {
			return false;
		}
		HighBloodPressureDisease other = (HighBloodPressureDisease) obj;
		return Objects.equals(this.HBPDMed, other.HBPDMed)
				&& this.HBPDMedsAdministeredEpicResponse == other.HBPDMedsAdministeredEpicResponse;
	}

	/**
	 * @return the hBPDMed
	 */
	private ValueRange getHBPDMed() throws Exception {
		try {
			return this.HBPDMed;
		} finally {
		}
	}

	/**
	 * @return the hBPDMedsAdministeredEpicResponse
	 */
	public int getHighBloodPressureDiseasemedicinesadministeredepicresponse() throws Exception {
		try {
			return this.HBPDMedsAdministeredEpicResponse;
		} finally {
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.HBPDMed, this.HBPDMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param hBPDMed the hBPDMed to set
	 */
	private void setHBPDMed(ValueRange hBPDMed) throws Exception {
		try {
			this.HBPDMed = hBPDMed;
		} finally {
		}
	}

	/**
	 * @param hBPDMedsAdministeredEpicResponse the hBPDMedsAdministeredEpicResponse
	 *                                         to set
	 */
	private void setHBPDMedsAdministeredEpicResponse(int hBPDMedsAdministeredEpicResponse) {
		try {
			this.HBPDMedsAdministeredEpicResponse = hBPDMedsAdministeredEpicResponse;
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
				(!this.getUniformdistribution().generatenoiseinresponsevariables(
						this.getUtilities().randBetween(HighBloodPressureDisease.getMintogenerateerrorval(),
								HighBloodPressureDisease.getMaxtogenerateerrorval())))) {
			this.setHBPDMedsAdministeredEpicResponse(this.getUtilities()
					.randBetween((int) this.getHBPDMed().getMinimum(), (int) this.getHBPDMed().getMaximum()));
		} else {
			this.setHBPDMedsAdministeredEpicResponse(
					this.getUtilities().randBetween(HighBloodPressureDisease.getMintogenerateerrorval(),
							HighBloodPressureDisease.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "HighBloodPressureDisease [HBPDMed=" + this.HBPDMed + ", HBPDMedsAdministeredEpicResponse="
				+ this.HBPDMedsAdministeredEpicResponse + "]";
	}

}
