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
public class SknMSGout extends SkinDiseaseResponse {

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

	private ValueRange SknMSGoutMedicines;
	private int SknMSGoutMedsAdministeredEpicResponse;

	public SknMSGout(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(new UniformDistribution(SknMSGout.getMintogenerateerrorval(),
					SknMSGout.getMaxtogenerateerrorval()));

			this.setSknMSGoutMedicines(ValueRange.of(0, 1));
			this.setSknMSGoutMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SknMSGout.getMintogenerateerrorval(), SknMSGout.getMaxtogenerateerrorval())))) {
				this.setSknMSGoutMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getSknMSGoutMedicines().getMinimum(),
								(int) this.getSknMSGoutMedicines().getMaximum()));
			} else {
				this.setSknMSGoutMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(SknMSGout.getMintogenerateerrorval(), SknMSGout.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public SknMSGout(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		this.setUtilities(new Utilities());
		this.setUniformDistribution(
				new UniformDistribution(SknMSGout.getMintogenerateerrorval(), SknMSGout.getMaxtogenerateerrorval()));

		this.setSknMSGoutMedicines(valuerange);
		this.setSknMSGoutMedsAdministeredEpicResponse(simulatedresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SknMSGout.getMintogenerateerrorval(), SknMSGout.getMaxtogenerateerrorval())))) {
				this.setSknMSGoutMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getSknMSGoutMedicines().getMinimum(),
								(int) this.getSknMSGoutMedicines().getMaximum()));
			} else {
				this.setSknMSGoutMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(SknMSGout.getMintogenerateerrorval(), SknMSGout.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof SknMSGout)) {
			return false;
		}
		SknMSGout other = (SknMSGout) obj;
		return Objects.equals(this.SknMSGoutMedicines, other.SknMSGoutMedicines)
				&& this.SknMSGoutMedsAdministeredEpicResponse == other.SknMSGoutMedsAdministeredEpicResponse;
	}

	/**
	 * @return the sknMSGoutMedsAdministeredEpicResponse
	 */
	public int getSkinMSGoutmedicinesadministeredepicresponse() {
		try {
			return this.SknMSGoutMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SknMSGoutMedsAdministeredEpicResponse;
	}

	/**
	 * @return the sknMSGoutMedicines
	 */
	private ValueRange getSknMSGoutMedicines() throws Exception {
		try {
			return this.SknMSGoutMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SknMSGoutMedicines;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.SknMSGoutMedicines, this.SknMSGoutMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param sknMSGoutMedicines the sknMSGoutMedicines to set
	 */
	private void setSknMSGoutMedicines(ValueRange sknMSGoutMedicines) {
		try {
			this.SknMSGoutMedicines = sknMSGoutMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sknMSGoutMedsAdministeredEpicResponse the
	 *                                              sknMSGoutMedsAdministeredEpicResponse
	 *                                              to set
	 */
	private void setSknMSGoutMedsAdministeredEpicResponse(int sknMSGoutMedsAdministeredEpicResponse) {
		try {
			this.SknMSGoutMedsAdministeredEpicResponse = sknMSGoutMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "SknMSGout [SknMSGoutMedicines=" + this.SknMSGoutMedicines + ", SknMSGoutMedsAdministeredEpicResponse="
				+ this.SknMSGoutMedsAdministeredEpicResponse + "]";
	}

}
