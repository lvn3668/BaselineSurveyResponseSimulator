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
public class SknMsRA extends SkinDiseaseResponse {

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

	private ValueRange SknMsRAMedicines;
	private int SknMsRAMedsAdministeredEpicResponse;

	public SknMsRA(Cohort cohort) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(
					new UniformDistribution(SknMsRA.getMintogenerateerrorval(), SknMsRA.getMaxtogenerateerrorval()));

			this.setSknMsRAMedicines(ValueRange.of(0, 1));
			this.setSknMsRAMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(SknMsRA.getMintogenerateerrorval(), SknMsRA.getMaxtogenerateerrorval())))) {
				this.setSknMsRAMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getSknMsRAMedicines().getMinimum(), (int) this.getSknMsRAMedicines().getMaximum()));
			} else {
				this.setSknMsRAMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(SknMsRA.getMintogenerateerrorval(), SknMsRA.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public SknMsRA(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		this.setUtilities(new Utilities());
		this.setUniformDistribution(
				new UniformDistribution(SknMsRA.getMintogenerateerrorval(), SknMsRA.getMaxtogenerateerrorval()));

		this.setSknMsRAMedicines(valuerange);
		this.setSknMsRAMedsAdministeredEpicResponse(simulatedresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(SknMsRA.getMintogenerateerrorval(), SknMsRA.getMaxtogenerateerrorval())))) {
				this.setSknMsRAMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getSknMsRAMedicines().getMinimum(), (int) this.getSknMsRAMedicines().getMaximum()));
			} else {
				this.setSknMsRAMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(SknMsRA.getMintogenerateerrorval(), SknMsRA.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
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
		if (!(obj instanceof SknMsRA)) {
			return false;
		}
		SknMsRA other = (SknMsRA) obj;
		return Objects.equals(this.SknMsRAMedicines, other.SknMsRAMedicines)
				&& this.SknMsRAMedsAdministeredEpicResponse == other.SknMsRAMedsAdministeredEpicResponse;
	}

	/**
	 * @return the sknMsRAMedsAdministeredEpicResponse
	 */
	public int getSkinMsRAmedicinesadministeredepicresponse() {
		try {
			return this.SknMsRAMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SknMsRAMedsAdministeredEpicResponse;
	}

	/**
	 * @return the sknMsRAMedicines
	 */
	private ValueRange getSknMsRAMedicines() {
		try {
			return this.SknMsRAMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SknMsRAMedicines;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.SknMsRAMedicines, this.SknMsRAMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param sknMsRAMedicines the sknMsRAMedicines to set
	 */
	private void setSknMsRAMedicines(ValueRange sknMsRAMedicines) {
		try {
			this.SknMsRAMedicines = sknMsRAMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sknMsRAMedsAdministeredEpicResponse the
	 *                                            sknMsRAMedsAdministeredEpicResponse
	 *                                            to set
	 */
	private void setSknMsRAMedsAdministeredEpicResponse(int sknMsRAMedsAdministeredEpicResponse) {
		try {
			this.SknMsRAMedsAdministeredEpicResponse = sknMsRAMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "SknMsRA [SknMsRAMedicines=" + this.SknMsRAMedicines + ", SknMsRAMedsAdministeredEpicResponse="
				+ this.SknMsRAMedsAdministeredEpicResponse + "]";
	}

}
