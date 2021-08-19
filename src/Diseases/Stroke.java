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
public class Stroke extends MiscDiseaseResponse {

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

	private ValueRange StrokeMedicines;
	private int StrokeMedsAdministeredEpicResponse;

	public Stroke(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Stroke.getMintogenerateerrorval(), Stroke.getMaxtogenerateerrorval()));

			this.setStrokeMedicines(ValueRange.of(0, 1));
			this.setStrokeMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Stroke.getMintogenerateerrorval(), Stroke.getMaxtogenerateerrorval())))) {
				this.setStrokeMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getStrokeMedicines().getMinimum(), (int) this.getStrokeMedicines().getMaximum()));
			} else {
				this.setStrokeMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(Stroke.getMintogenerateerrorval(), Stroke.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Stroke(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		this.setUtilities(new Utilities());
		this.setUniformdistribution(
				new UniformDistribution(Stroke.getMintogenerateerrorval(), Stroke.getMaxtogenerateerrorval()));

		this.setStrokeMedicines(valuerange);
		this.setStrokeMedsAdministeredEpicResponse(simulatedresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Stroke.getMintogenerateerrorval(), Stroke.getMaxtogenerateerrorval())))) {
				this.setStrokeMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getStrokeMedicines().getMinimum(), (int) this.getStrokeMedicines().getMaximum()));
			} else {
				this.setStrokeMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(Stroke.getMintogenerateerrorval(), Stroke.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof Stroke)) {
			return false;
		}
		Stroke other = (Stroke) obj;
		return Objects.equals(this.StrokeMedicines, other.StrokeMedicines)
				&& this.StrokeMedsAdministeredEpicResponse == other.StrokeMedsAdministeredEpicResponse;
	}

	/**
	 * @return the strokeMedicines
	 */
	private ValueRange getStrokeMedicines() {
		try {
			return this.StrokeMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StrokeMedicines;
	}

	/**
	 * @return the strokeMedsAdministeredEpicResponse
	 */
	public int getStrokemedicinesadministeredepicresponse() {
		try {
			return this.StrokeMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StrokeMedsAdministeredEpicResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.StrokeMedicines, this.StrokeMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param strokeMedicines the strokeMedicines to set
	 */
	private void setStrokeMedicines(ValueRange strokeMedicines) {
		try {
			this.StrokeMedicines = strokeMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param strokeMedsAdministeredEpicResponse the
	 *                                           strokeMedsAdministeredEpicResponse
	 *                                           to set
	 */
	private void setStrokeMedsAdministeredEpicResponse(int strokeMedsAdministeredEpicResponse) {
		try {
			this.StrokeMedsAdministeredEpicResponse = strokeMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Stroke [StrokeMedicines=" + this.StrokeMedicines + ", StrokeMedsAdministeredEpicResponse="
				+ this.StrokeMedsAdministeredEpicResponse + "]";
	}

}
