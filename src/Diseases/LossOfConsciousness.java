package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class LossOfConsciousness extends NeuroStimulatoryDiseaseResponse {

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

	private int lossofconsciousnesmedsadministeredepicresponse;
	private ValueRange LossOfConsciousnessMedicines;

	public LossOfConsciousness(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(LossOfConsciousness.getMintogenerateerrorval(),
					LossOfConsciousness.getMaxtogenerateerrorval()));

			this.setLossOfConsciousnessMedicines(ValueRange.of(0, 1));
			this.setLossofconsciousnesmedsadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(LossOfConsciousness.getMintogenerateerrorval(),
									LossOfConsciousness.getMaxtogenerateerrorval())))) {
				this.setLossofconsciousnesmedsadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getLossOfConsciousnessMedicines().getMinimum(),
								(int) this.getLossOfConsciousnessMedicines().getMaximum()));
			} else {
				this.setLossofconsciousnesmedsadministeredepicresponse(
						this.getUtilities().randBetween(LossOfConsciousness.getMintogenerateerrorval(),
								LossOfConsciousness.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public LossOfConsciousness(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(LossOfConsciousness.getMintogenerateerrorval(),
					LossOfConsciousness.getMaxtogenerateerrorval()));

			this.setLossOfConsciousnessMedicines(valuerange);
			this.setLossofconsciousnesmedsadministeredepicresponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(LossOfConsciousness.getMintogenerateerrorval(),
									LossOfConsciousness.getMaxtogenerateerrorval())))) {
				this.setLossofconsciousnesmedsadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getLossOfConsciousnessMedicines().getMinimum(),
								(int) this.getLossOfConsciousnessMedicines().getMaximum()));
			} else {
				this.setLossofconsciousnesmedsadministeredepicresponse(
						this.getUtilities().randBetween(LossOfConsciousness.getMintogenerateerrorval(),
								LossOfConsciousness.getMaxtogenerateerrorval()));
			}
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
		if (!(obj instanceof LossOfConsciousness)) {
			return false;
		}
		LossOfConsciousness other = (LossOfConsciousness) obj;
		return Objects.equals(this.LossOfConsciousnessMedicines, other.LossOfConsciousnessMedicines)
				&& this.lossofconsciousnesmedsadministeredepicresponse == other.lossofconsciousnesmedsadministeredepicresponse;
	}

	/**
	 * @return the lossOfConsciousnessMedicines
	 */
	private ValueRange getLossOfConsciousnessMedicines() throws Exception {
		try {
			return this.LossOfConsciousnessMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.LossOfConsciousnessMedicines;
	}

	/**
	 * @return the lossofconsciousnesmedsadministeredepicresponse
	 */
	public int getLossofconsciousnessmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.lossofconsciousnesmedsadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.lossofconsciousnesmedsadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.LossOfConsciousnessMedicines, this.lossofconsciousnesmedsadministeredepicresponse);
		return result;
	}

	/**
	 * @param lossofconsciousnesmedsadministeredepicresponse the
	 *                                                       lossofconsciousnesmedsadministeredepicresponse
	 *                                                       to set
	 */
	private void setLossofconsciousnesmedsadministeredepicresponse(int lossofconsciousnesmedsadministeredepicresponse)
			throws Exception {
		try {
			this.lossofconsciousnesmedsadministeredepicresponse = lossofconsciousnesmedsadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param lossOfConsciousnessMedicines the lossOfConsciousnessMedicines to set
	 */
	private void setLossOfConsciousnessMedicines(ValueRange lossOfConsciousnessMedicines) throws Exception {
		try {
			this.LossOfConsciousnessMedicines = lossOfConsciousnessMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "LossOfConsciousness [LossOfConsciousnessMedicines=" + this.LossOfConsciousnessMedicines
				+ ", lossofconsciousnesmedsadministeredepicresponse="
				+ this.lossofconsciousnesmedsadministeredepicresponse + "]";
	}

}
