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
public class MultipleSclerosis extends NeuroStimulatoryDiseaseResponse {

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

	private int MSMedsadministeredepicresponse;
	private ValueRange MultipleSclerosisMedicines;

	public MultipleSclerosis(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(MultipleSclerosis.getMintogenerateerrorval(),
					MultipleSclerosis.getMaxtogenerateerrorval()));

			this.setMultipleSclerosisMedicines(ValueRange.of(0, 1));
			this.setMSMedsadministeredepicresponse(2);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public MultipleSclerosis(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(MultipleSclerosis.getMintogenerateerrorval(),
					MultipleSclerosis.getMaxtogenerateerrorval()));

			this.setMultipleSclerosisMedicines(valuerange);
			this.setMSMedsadministeredepicresponse(simulatedresponse);
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
		if (!(obj instanceof MultipleSclerosis)) {
			return false;
		}
		MultipleSclerosis other = (MultipleSclerosis) obj;
		return this.MSMedsadministeredepicresponse == other.MSMedsadministeredepicresponse
				&& Objects.equals(this.MultipleSclerosisMedicines, other.MultipleSclerosisMedicines);
	}

	/**
	 * @return the multipleSclerosisMedicines
	 */
	private ValueRange getMultipleSclerosisMedicines() throws Exception {
		try {
			return this.MultipleSclerosisMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MultipleSclerosisMedicines;
	}

	/**
	 * @return the mSMedsadministeredepicresponse
	 */
	public int getMultiplesclerosismedicinesadministeredepicresponse() throws Exception {
		try {
			return this.MSMedsadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MSMedsadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.MSMedsadministeredepicresponse, this.MultipleSclerosisMedicines);
		return result;
	}

	/**
	 * @param mSMedsadministeredepicresponse the mSMedsadministeredepicresponse to
	 *                                       set
	 */
	private void setMSMedsadministeredepicresponse(int mSMedsadministeredepicresponse) throws Exception {
		try {
			this.MSMedsadministeredepicresponse = mSMedsadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param multipleSclerosisMedicines the multipleSclerosisMedicines to set
	 */
	private void setMultipleSclerosisMedicines(ValueRange multipleSclerosisMedicines) throws Exception {
		try {
			this.MultipleSclerosisMedicines = multipleSclerosisMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) {
		try {
			super.simulateResponses(veterancohort);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(MultipleSclerosis.getMintogenerateerrorval(),
									MultipleSclerosis.getMaxtogenerateerrorval())))) {
				this.setMSMedsadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getMultipleSclerosisMedicines().getMinimum(),
								(int) this.getMultipleSclerosisMedicines().getMaximum()));
			} else {
				this.setMSMedsadministeredepicresponse(this.getUtilities().randBetween(
						MultipleSclerosis.getMintogenerateerrorval(), MultipleSclerosis.getMaxtogenerateerrorval()));
			}
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "MultipleSclerosis [MultipleSclerosisMedicines=" + this.MultipleSclerosisMedicines
				+ ", MSMedsadministeredepicresponse=" + this.MSMedsadministeredepicresponse + "]";
	}

}
