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
public class Thyroid extends OsteopathicDiseaseResponse {

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

	private ValueRange ThyroidMedicines;
	private int thyroidmedicinesadministeredepicresponse;

	public Thyroid(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Thyroid.getMintogenerateerrorval(), Thyroid.getMaxtogenerateerrorval()));

			this.setThyroidMedicines(ValueRange.of(0, 1));
			this.setThyroidmedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Thyroid.getMintogenerateerrorval(), Thyroid.getMaxtogenerateerrorval())))) {
				this.setThyroidmedicinesadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getThyroidMedicines().getMinimum(), (int) this.getThyroidMedicines().getMaximum()));
			} else {
				this.setThyroidmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Thyroid.getMintogenerateerrorval(), Thyroid.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Thyroid(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort);
		this.setUtilities(new Utilities());
		this.setUniformdistribution(
				new UniformDistribution(Thyroid.getMintogenerateerrorval(), Thyroid.getMaxtogenerateerrorval()));

		this.setThyroidMedicines(valuerange);
		this.setThyroidmedicinesadministeredepicresponse(simulatedresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Thyroid.getMintogenerateerrorval(), Thyroid.getMaxtogenerateerrorval())))) {
				this.setThyroidmedicinesadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getThyroidMedicines().getMinimum(), (int) this.getThyroidMedicines().getMaximum()));
			} else {
				this.setThyroidmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Thyroid.getMintogenerateerrorval(), Thyroid.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof Thyroid)) {
			return false;
		}
		Thyroid other = (Thyroid) obj;
		return Objects.equals(this.ThyroidMedicines, other.ThyroidMedicines)
				&& this.thyroidmedicinesadministeredepicresponse == other.thyroidmedicinesadministeredepicresponse;
	}

	/**
	 * @return the thyroidMedicines
	 */
	private ValueRange getThyroidMedicines() {
		return this.ThyroidMedicines;
	}

	/**
	 * @return the thyroidmedicinesadministeredepicresponse
	 */
	public int getThyroidmedicinesadministeredepicresponse() {
		try {
			return this.thyroidmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.thyroidmedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.ThyroidMedicines, this.thyroidmedicinesadministeredepicresponse);
		return result;
	}

	/**
	 * @param thyroidMedicines the thyroidMedicines to set
	 */
	private void setThyroidMedicines(ValueRange thyroidMedicines) {
		this.ThyroidMedicines = thyroidMedicines;
	}

	/**
	 * @param thyroidmedicinesadministeredepicresponse the
	 *                                                 thyroidmedicinesadministeredepicresponse
	 *                                                 to set
	 */
	private void setThyroidmedicinesadministeredepicresponse(int thyroidmedicinesadministeredepicresponse) {
		try {
			this.thyroidmedicinesadministeredepicresponse = thyroidmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Thyroid [ThyroidMedicines=" + this.ThyroidMedicines + ", thyroidmedicinesadministeredepicresponse="
				+ this.thyroidmedicinesadministeredepicresponse + "]";
	}

}
