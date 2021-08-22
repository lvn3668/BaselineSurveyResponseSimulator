package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
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

	public MacularDegeneration(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(MacularDegeneration.getMintogenerateerrorval(),
					MacularDegeneration.getMaxtogenerateerrorval()));

			this.setMacularDegenerationMedicines(ValueRange.of(0, 1));
			this.setMaculardegenerationmedsadministeredepicresponse(2);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public MacularDegeneration(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(MacularDegeneration.getMintogenerateerrorval(),
					MacularDegeneration.getMaxtogenerateerrorval()));

			this.setMacularDegenerationMedicines(valuerange);
			this.setMaculardegenerationmedsadministeredepicresponse(simulatedresponse);
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
		if (!(obj instanceof MacularDegeneration)) {
			return false;
		}
		MacularDegeneration other = (MacularDegeneration) obj;
		return Objects.equals(this.MacularDegenerationMedicines, other.MacularDegenerationMedicines)
				&& this.maculardegenerationmedsadministeredepicresponse == other.maculardegenerationmedsadministeredepicresponse;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.MacularDegenerationMedicines, this.maculardegenerationmedsadministeredepicresponse);
		return result;
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

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) throws Exception {
		super.simulateResponses(veterancohort);
		if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
		// add getters for uniform dist and random epic vars
				(!this.getUniformdistribution().generatenoiseinresponsevariables(
						this.getUtilities().randBetween(MacularDegeneration.getMintogenerateerrorval(),
								MacularDegeneration.getMaxtogenerateerrorval())))) {
			this.setMaculardegenerationmedsadministeredepicresponse(
					this.getUtilities().randBetween((int) this.getMacularDegenerationMedicines().getMinimum(),
							(int) this.getMacularDegenerationMedicines().getMaximum()));
		} else {
			this.setMaculardegenerationmedsadministeredepicresponse(this.getUtilities().randBetween(
					MacularDegeneration.getMintogenerateerrorval(), MacularDegeneration.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "MacularDegeneration [MacularDegenerationMedicines=" + this.MacularDegenerationMedicines
				+ ", maculardegenerationmedsadministeredepicresponse="
				+ this.maculardegenerationmedsadministeredepicresponse + "]";
	}

}
