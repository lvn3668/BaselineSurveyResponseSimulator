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
public class ParkinsonsDisease extends NeuroStimulatoryDiseaseResponse {

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

	private ValueRange ParkinsonsDiseaseMedicines;
	private int ParkinsonsDiseaseMedsadministeredepicresponse;

	public ParkinsonsDisease(Cohort cohort) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(ParkinsonsDisease.getMintogenerateerrorval(),
					ParkinsonsDisease.getMaxtogenerateerrorval()));

			this.setParkinsonsDiseaseMedicines(ValueRange.of(0, 1));
			this.setParkinsonsDiseaseMedsadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(ParkinsonsDisease.getMintogenerateerrorval(),
									ParkinsonsDisease.getMaxtogenerateerrorval())))) {
				this.setParkinsonsDiseaseMedsadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getParkinsonsDiseaseMedicines().getMinimum(),
								(int) this.getParkinsonsDiseaseMedicines().getMaximum()));
			} else {
				this.setParkinsonsDiseaseMedsadministeredepicresponse(this.getUtilities().randBetween(
						ParkinsonsDisease.getMintogenerateerrorval(), ParkinsonsDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ParkinsonsDisease(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(ParkinsonsDisease.getMintogenerateerrorval(),
					ParkinsonsDisease.getMaxtogenerateerrorval()));

			this.setParkinsonsDiseaseMedicines(valuerange);
			this.setParkinsonsDiseaseMedsadministeredepicresponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(ParkinsonsDisease.getMintogenerateerrorval(),
									ParkinsonsDisease.getMaxtogenerateerrorval())))) {
				this.setParkinsonsDiseaseMedsadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getParkinsonsDiseaseMedicines().getMinimum(),
								(int) this.getParkinsonsDiseaseMedicines().getMaximum()));
			} else {
				this.setParkinsonsDiseaseMedsadministeredepicresponse(this.getUtilities().randBetween(
						ParkinsonsDisease.getMintogenerateerrorval(), ParkinsonsDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the multipleSclerosisMedicines
	 */
	private ValueRange getParkinsonsDiseaseMedicines() throws Exception {
		try {
			return this.ParkinsonsDiseaseMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ParkinsonsDiseaseMedicines;
	}

	/**
	 * @return the mSMedsadministeredepicresponse
	 */
	public int getParkinsonsmedicinesadministeredepicresponse() {
		try {
			return this.ParkinsonsDiseaseMedsadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ParkinsonsDiseaseMedsadministeredepicresponse;
	}

	/**
	 * @param multipleSclerosisMedicines the multipleSclerosisMedicines to set
	 */
	private void setParkinsonsDiseaseMedicines(ValueRange multipleSclerosisMedicines) {
		try {
			this.ParkinsonsDiseaseMedicines = multipleSclerosisMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mSMedsadministeredepicresponse the mSMedsadministeredepicresponse to
	 *                                       set
	 */
	private void setParkinsonsDiseaseMedsadministeredepicresponse(int mSMedsadministeredepicresponse) {
		try {
			this.ParkinsonsDiseaseMedsadministeredepicresponse = mSMedsadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(ParkinsonsDiseaseMedicines, ParkinsonsDiseaseMedsadministeredepicresponse);
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
		if (!(obj instanceof ParkinsonsDisease)) {
			return false;
		}
		ParkinsonsDisease other = (ParkinsonsDisease) obj;
		return Objects.equals(ParkinsonsDiseaseMedicines, other.ParkinsonsDiseaseMedicines)
				&& ParkinsonsDiseaseMedsadministeredepicresponse == other.ParkinsonsDiseaseMedsadministeredepicresponse;
	}

	@Override
	public String toString() {
		return "ParkinsonsDisease [ParkinsonsDiseaseMedicines=" + ParkinsonsDiseaseMedicines
				+ ", ParkinsonsDiseaseMedsadministeredepicresponse=" + ParkinsonsDiseaseMedsadministeredepicresponse
				+ "]";
	}

}