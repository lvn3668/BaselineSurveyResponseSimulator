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
public class Migrane extends NeuroStimulatoryDiseaseResponse {

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

	private ValueRange MigraneMedicines;
	private int MigraneMedsEpicResponse;

	public Migrane(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Migrane.getMintogenerateerrorval(), Migrane.getMaxtogenerateerrorval()));

			this.setMigraneMedicines(ValueRange.of(0, 1));
			this.setMigranemedsadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Migrane.getMintogenerateerrorval(), Migrane.getMaxtogenerateerrorval())))) {
				this.setMigranemedsadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getMigraneMedicines().getMinimum(), (int) this.getMigraneMedicines().getMaximum()));
			} else {
				this.setMigranemedsadministeredepicresponse(this.getUtilities()
						.randBetween(Migrane.getMintogenerateerrorval(), Migrane.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public Migrane(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Migrane.getMintogenerateerrorval(), Migrane.getMaxtogenerateerrorval()));

			this.setMigraneMedicines(valuerange);
			this.setMigranemedsadministeredepicresponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Migrane.getMintogenerateerrorval(), Migrane.getMaxtogenerateerrorval())))) {
				this.setMigranemedsadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getMigraneMedicines().getMinimum(), (int) this.getMigraneMedicines().getMaximum()));
			} else {
				this.setMigranemedsadministeredepicresponse(this.getUtilities()
						.randBetween(Migrane.getMintogenerateerrorval(), Migrane.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the migraneMedicines
	 */
	private ValueRange getMigraneMedicines() throws Exception {
		try {
			return this.MigraneMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MigraneMedicines;
	}

	/**
	 * @return the migraneMedsEpicResponse
	 */
	public int getMigranemedicinesadministeredepicresponse() throws Exception {
		try {
			return this.MigraneMedsEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MigraneMedsEpicResponse;
	}

	/**
	 * @param migraneMedicines the migraneMedicines to set
	 */
	private void setMigraneMedicines(ValueRange migraneMedicines) throws Exception {
		try {
			this.MigraneMedicines = migraneMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setMigranemedsadministeredepicresponse(int simulatedresponse) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Migrane [MigraneMedicines=" + this.MigraneMedicines + ", MigraneMedsEpicResponse="
				+ this.MigraneMedsEpicResponse + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(MigraneMedicines, MigraneMedsEpicResponse);
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
		if (!(obj instanceof Migrane)) {
			return false;
		}
		Migrane other = (Migrane) obj;
		return Objects.equals(MigraneMedicines, other.MigraneMedicines)
				&& MigraneMedsEpicResponse == other.MigraneMedsEpicResponse;
	}

}