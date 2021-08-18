package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan
 * Affiliation VABHS / MAVERIC 
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

	public HighBloodPressureDisease(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HighBloodPressureDisease.getMintogenerateerrorval(),
					HighBloodPressureDisease.getMaxtogenerateerrorval()));

			this.setHBPDMed(ValueRange.of(0, 1));
			this.setHBPDMedsAdministeredEpicResponse(2);
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public HighBloodPressureDisease(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HighBloodPressureDisease.getMintogenerateerrorval(),
					HighBloodPressureDisease.getMaxtogenerateerrorval()));

			this.setHBPDMed(valuerange);
			this.setHBPDMedsAdministeredEpicResponse(simulatedresponse);
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
		} catch (Exception e) {
			e.printStackTrace();
		}
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

	@Override
	public String toString() {
		return "HighBloodPressureDisease [HBPDMed=" + this.HBPDMed + ", HBPDMedsAdministeredEpicResponse="
				+ this.HBPDMedsAdministeredEpicResponse + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(HBPDMed, HBPDMedsAdministeredEpicResponse);
		return result;
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
		return Objects.equals(HBPDMed, other.HBPDMed)
				&& HBPDMedsAdministeredEpicResponse == other.HBPDMedsAdministeredEpicResponse;
	}

}