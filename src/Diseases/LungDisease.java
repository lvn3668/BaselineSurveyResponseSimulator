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
public class LungDisease extends OsteopathicDiseaseResponse {

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

	private ValueRange LungDiseaseMedicines;
	private int lungdiseasemedicinesadministeredepicresponse;

	public LungDisease(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(LungDisease.getMintogenerateerrorval(),
					LungDisease.getMaxtogenerateerrorval()));

			this.setLungDiseaseMedicines(ValueRange.of(0, 1));
			this.setLungdiseasemedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							LungDisease.getMintogenerateerrorval(), LungDisease.getMaxtogenerateerrorval())))) {
				this.setLungdiseasemedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getLungDiseaseMedicines().getMinimum(),
								(int) this.getLungDiseaseMedicines().getMaximum()));
			} else {
				this.setLungdiseasemedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(LungDisease.getMintogenerateerrorval(), LungDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public LungDisease(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(LungDisease.getMintogenerateerrorval(),
					LungDisease.getMaxtogenerateerrorval()));

			this.setLungDiseaseMedicines(valuerange);
			this.setLungdiseasemedicinesadministeredepicresponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							LungDisease.getMintogenerateerrorval(), LungDisease.getMaxtogenerateerrorval())))) {
				this.setLungdiseasemedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getLungDiseaseMedicines().getMinimum(),
								(int) this.getLungDiseaseMedicines().getMaximum()));
			} else {
				this.setLungdiseasemedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(LungDisease.getMintogenerateerrorval(), LungDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the lungDiseaseMedicines
	 */
	private ValueRange getLungDiseaseMedicines() throws Exception {
		try {
			return this.LungDiseaseMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.LungDiseaseMedicines;
	}

	public int getLungDiseasemedicinesadministeredepicresponse() throws Exception {
		try {
			return this.lungdiseasemedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.lungdiseasemedicinesadministeredepicresponse;
	}

	/**
	 * @param lungDiseaseMedicines the lungDiseaseMedicines to set
	 */
	private void setLungDiseaseMedicines(ValueRange lungDiseaseMedicines) throws Exception {
		try {
			this.LungDiseaseMedicines = lungDiseaseMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setLungdiseasemedicinesadministeredepicresponse(int lungdiseasemedicinesadministeredepicresponse)
			throws Exception {
		try {
			this.lungdiseasemedicinesadministeredepicresponse = lungdiseasemedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "LungDisease [LungDiseaseMedicines=" + this.LungDiseaseMedicines
				+ ", lungdiseasemedicinesadministeredepicresponse=" + this.lungdiseasemedicinesadministeredepicresponse
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(LungDiseaseMedicines, lungdiseasemedicinesadministeredepicresponse);
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
		if (!(obj instanceof LungDisease)) {
			return false;
		}
		LungDisease other = (LungDisease) obj;
		return Objects.equals(LungDiseaseMedicines, other.LungDiseaseMedicines)
				&& lungdiseasemedicinesadministeredepicresponse == other.lungdiseasemedicinesadministeredepicresponse;
	}

}
