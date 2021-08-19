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
public class Tinitus extends HearingVisionDiseaseResponse {

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

	private ValueRange TinitusMedicines;
	private int TinitusMedsAdministeredEpicResponse;

	public Tinitus(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());

			this.setUniformdistribution(
					new UniformDistribution(Tinitus.getMintogenerateerrorval(), Tinitus.getMaxtogenerateerrorval()));

			this.setTinitusMedicines(ValueRange.of(0, 1));
			this.setTinitusMedsAdministeredEpicResponse(2);
			// if CancerResponse is positive, then generate values
			// for whether medicines are being administered or not
			// else set to 0

			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Tinitus.getMintogenerateerrorval(), Tinitus.getMaxtogenerateerrorval())))) {
				this.setTinitusMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getTinitusMedicines().getMinimum(), (int) this.getTinitusMedicines().getMaximum()));
			} else {
				this.setTinitusMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(Tinitus.getMintogenerateerrorval(), Tinitus.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}

	public Tinitus(Cohort cohort, ValueRange valuerange, int simulatedresponse) {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		try {
			this.setUtilities(new Utilities());

			this.setUniformdistribution(
					new UniformDistribution(Tinitus.getMintogenerateerrorval(), Tinitus.getMaxtogenerateerrorval()));

			this.setTinitusMedicines(valuerange);
			this.setTinitusMedsAdministeredEpicResponse(simulatedresponse);
			// if CancerResponse is positive, then generate values
			// for whether medicines are being administered or not
			// else set to 0

			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Tinitus.getMintogenerateerrorval(), Tinitus.getMaxtogenerateerrorval())))) {
				this.setTinitusMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getTinitusMedicines().getMinimum(), (int) this.getTinitusMedicines().getMaximum()));
			} else {
				this.setTinitusMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(Tinitus.getMintogenerateerrorval(), Tinitus.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof Tinitus)) {
			return false;
		}
		Tinitus other = (Tinitus) obj;
		return Objects.equals(this.TinitusMedicines, other.TinitusMedicines)
				&& this.TinitusMedsAdministeredEpicResponse == other.TinitusMedsAdministeredEpicResponse;
	}

	/**
	 * @return the tinitusMedicines
	 */
	private ValueRange getTinitusMedicines() {
		try {
			return this.TinitusMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.TinitusMedicines;
	}

	/**
	 * @return the tinitusMedsAdministeredEpicResponse
	 */
	public int getTinitusmedicinesadministeredepicresponse() {
		try {
			return this.TinitusMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.TinitusMedsAdministeredEpicResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.TinitusMedicines, this.TinitusMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param tinitusMedicines the tinitusMedicines to set
	 */
	private void setTinitusMedicines(ValueRange tinitusMedicines) {
		try {
			this.TinitusMedicines = tinitusMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param tinitusMedsAdministeredEpicResponse the
	 *                                            tinitusMedsAdministeredEpicResponse
	 *                                            to set
	 */
	private void setTinitusMedsAdministeredEpicResponse(int tinitusMedsAdministeredEpicResponse) {
		try {
			this.TinitusMedsAdministeredEpicResponse = tinitusMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Tinitus [TinitusMedicines=" + this.TinitusMedicines + ", TinitusMedsAdministeredEpicResponse="
				+ this.TinitusMedsAdministeredEpicResponse + "]";
	}

}
