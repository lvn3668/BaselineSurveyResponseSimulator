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
public class MacularDegeneration extends HearingVisionDiseaseResponse {

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

	private ValueRange MacularDegenerationMedicines;
	private int maculardegenerationmedsadministeredepicresponse;

	public MacularDegeneration(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MacularDegeneration.getMintogenerateerrorval(),
					MacularDegeneration.getMaxtogenerateerrorval()));

			this.setMacularDegenerationMedicines(ValueRange.of(0, 1));
			this.setMaculardegenerationmedsadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(MacularDegeneration.getMintogenerateerrorval(),
									MacularDegeneration.getMaxtogenerateerrorval())))) {
				this.setMaculardegenerationmedsadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getMacularDegenerationMedicines().getMinimum(),
								(int) this.getMacularDegenerationMedicines().getMaximum()));
			} else {
				this.setMaculardegenerationmedsadministeredepicresponse(
						this.getUtilities().randBetween(MacularDegeneration.getMintogenerateerrorval(),
								MacularDegeneration.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public MacularDegeneration(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MacularDegeneration.getMintogenerateerrorval(),
					MacularDegeneration.getMaxtogenerateerrorval()));

			this.setMacularDegenerationMedicines(valuerange);
			this.setMaculardegenerationmedsadministeredepicresponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(MacularDegeneration.getMintogenerateerrorval(),
									MacularDegeneration.getMaxtogenerateerrorval())))) {
				this.setMaculardegenerationmedsadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getMacularDegenerationMedicines().getMinimum(),
								(int) this.getMacularDegenerationMedicines().getMaximum()));
			} else {
				this.setMaculardegenerationmedsadministeredepicresponse(
						this.getUtilities().randBetween(MacularDegeneration.getMintogenerateerrorval(),
								MacularDegeneration.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the macularDegenerationMedicines
	 */
	private ValueRange getMacularDegenerationMedicines() throws Exception {
		try {
			return this.MacularDegenerationMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MacularDegenerationMedicines;
	}

	/**
	 * @return the maculardegenerationmedsadministeredepicresponse
	 */
	public int getMaculardegenerationmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.maculardegenerationmedsadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.maculardegenerationmedsadministeredepicresponse;
	}

	/**
	 * @param macularDegenerationMedicines the macularDegenerationMedicines to set
	 */
	private void setMacularDegenerationMedicines(ValueRange macularDegenerationMedicines) throws Exception {
		try {
			this.MacularDegenerationMedicines = macularDegenerationMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param maculardegenerationmedsadministeredepicresponse the
	 *                                                        maculardegenerationmedsadministeredepicresponse
	 *                                                        to set
	 */
	private void setMaculardegenerationmedsadministeredepicresponse(int maculardegenerationmedsadministeredepicresponse)
			throws Exception {
		try {
			this.maculardegenerationmedsadministeredepicresponse = maculardegenerationmedsadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "MacularDegeneration [MacularDegenerationMedicines=" + this.MacularDegenerationMedicines
				+ ", maculardegenerationmedsadministeredepicresponse="
				+ this.maculardegenerationmedsadministeredepicresponse + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(MacularDegenerationMedicines, maculardegenerationmedsadministeredepicresponse);
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
		if (!(obj instanceof MacularDegeneration)) {
			return false;
		}
		MacularDegeneration other = (MacularDegeneration) obj;
		return Objects.equals(MacularDegenerationMedicines, other.MacularDegenerationMedicines)
				&& maculardegenerationmedsadministeredepicresponse == other.maculardegenerationmedsadministeredepicresponse;
	}

}
