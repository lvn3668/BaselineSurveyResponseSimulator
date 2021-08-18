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

public class BloodClots extends MiscDiseaseResponse {

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
	private ValueRange BloodClotsMedicines = ValueRange.of(0, 1);
	private int BloodClotsMedsAdministeredEpicResponse = 2;

	public BloodClots(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(BloodClots.getMintogenerateerrorval(),
					BloodClots.getMaxtogenerateerrorval()));

			this.setBloodClotsMedicines(ValueRange.of(0, 1));
			this.setBloodClotsMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							BloodClots.getMintogenerateerrorval(), BloodClots.getMaxtogenerateerrorval())))) {
				this.setBloodClotsMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getBloodClotsMedicines().getMinimum(),
								(int) this.getBloodClotsMedicines().getMaximum()));
			}

			else
				this.setBloodClotsMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(BloodClots.getMintogenerateerrorval(), BloodClots.getMaxtogenerateerrorval()));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BloodClots(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		this.setUtilities(new Utilities());
		this.setUniformdistribution(
				new UniformDistribution(BloodClots.getMintogenerateerrorval(), BloodClots.getMaxtogenerateerrorval()));

		this.setBloodClotsMedicines(valuerange);
		this.setBloodClotsMedsAdministeredEpicResponse(simulatedresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							BloodClots.getMintogenerateerrorval(), BloodClots.getMaxtogenerateerrorval())))) {
				this.setBloodClotsMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getBloodClotsMedicines().getMinimum(),
								(int) this.getBloodClotsMedicines().getMaximum()));
			}

			else
				this.setBloodClotsMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(BloodClots.getMintogenerateerrorval(), BloodClots.getMaxtogenerateerrorval()));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

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

	/**
	 * @return the BloodClotsMedicines
	 */
	private ValueRange getBloodClotsMedicines() {
		try {
			return this.BloodClotsMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.BloodClotsMedicines;
	}

	/**
	 * @return the BloodClotsMedsAdministeredEpicResponse
	 */
	public int getBloodclotsmedicinesadministeredepicresponse() {
		try {
			return this.BloodClotsMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.BloodClotsMedsAdministeredEpicResponse;
	}

	/**
	 * @param BloodClotsMedicines the BloodClotsMedicines to set
	 */
	private void setBloodClotsMedicines(ValueRange BloodClotsMedicines) {
		try {
			this.BloodClotsMedicines = BloodClotsMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param BloodClotsMedsAdministeredEpicResponse the
	 *                                               BloodClotsMedsAdministeredEpicResponse
	 *                                               to set
	 */
	private void setBloodClotsMedsAdministeredEpicResponse(int BloodClotsMedsAdministeredEpicResponse) {
		try {
			this.BloodClotsMedsAdministeredEpicResponse = BloodClotsMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int hashCode() {
		try {
			return Objects.hash(this.getBloodClotsMedicines(), this.getBloodclotsmedicinesadministeredepicresponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean equals(Object obj) {

		try {
			if (obj != null && (obj instanceof BloodClots) && (this instanceof BloodClots)
					&& (this.hashCode() == obj.hashCode())) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String toString() {
		return "BloodClots [BloodClotsMedicines=" + BloodClotsMedicines + ", BloodClotsMedsAdministeredEpicResponse="
				+ BloodClotsMedsAdministeredEpicResponse + "]";
	}

}