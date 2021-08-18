package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;
import java.util.Random;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan
 * Affiliation VABHS / MAVERIC 
 *
 */
public class Epilepsy extends NeuroStimulatoryDiseaseResponse {

	private ValueRange epilepsyMedicines;
	private int epilepsymedsadministeredepicresponse;
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

	public Epilepsy(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Epilepsy.getMintogenerateerrorval(), Epilepsy.getMaxtogenerateerrorval()));

			this.setEpilepsyMedicines(ValueRange.of(0, 1));
			this.setEpilepsymedsadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Epilepsy.getMintogenerateerrorval(), Epilepsy.getMaxtogenerateerrorval())))) {
				this.setEpilepsymedsadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getEpilepsyMedicines().getMinimum(),
								(int) this.getEpilepsyMedicines().getMaximum()));
			} else {
				this.setEpilepsymedsadministeredepicresponse(this.getUtilities()
						.randBetween(Epilepsy.getMintogenerateerrorval(), Epilepsy.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		epilepsyMedicines = null;
	}

	/**
	 * @return the epilepsyMedicines
	 */
	private ValueRange getEpilepsyMedicines() throws Exception {
		try {
			return epilepsyMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return epilepsyMedicines;
	}

	/**
	 * @param epilepsyMedicines the epilepsyMedicines to set
	 */
	private void setEpilepsyMedicines(ValueRange epilepsyMedicines) throws Exception {
		try {
			this.epilepsyMedicines = epilepsyMedicines;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the epilepsymedsadministeredepicresponse
	 */
	public int getEpilepsymedicinesadministeredepicresponse() throws Exception {
		try {
			return epilepsymedsadministeredepicresponse;
		} finally {
		}
	}

	@Override
	public String toString() {
		return "Epilepsy [epilepsyMedicines=" + epilepsyMedicines + ", epilepsymedsadministeredepicresponse="
				+ epilepsymedsadministeredepicresponse + "]";
	}

	/**
	 * @param epilepsymedsadministeredepicresponse the
	 *                                             epilepsymedsadministeredepicresponse
	 *                                             to set
	 */
	private void setEpilepsymedsadministeredepicresponse(int epilepsymedsadministeredepicresponse) throws Exception {
		try {
			this.epilepsymedsadministeredepicresponse = epilepsymedsadministeredepicresponse;
		} finally {
		}
	}

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

	public Epilepsy(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Epilepsy.getMintogenerateerrorval(), Epilepsy.getMaxtogenerateerrorval()));

			this.setEpilepsyMedicines(valuerange);
			this.setEpilepsymedsadministeredepicresponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Epilepsy.getMintogenerateerrorval(), Epilepsy.getMaxtogenerateerrorval())))) {
				this.setEpilepsymedsadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getEpilepsyMedicines().getMinimum(),
								(int) this.getEpilepsyMedicines().getMaximum()));
			} else {
				this.setEpilepsymedsadministeredepicresponse(this.getUtilities()
						.randBetween(Epilepsy.getMintogenerateerrorval(), Epilepsy.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(epilepsyMedicines, epilepsymedsadministeredepicresponse);
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
		if (!(obj instanceof Epilepsy)) {
			return false;
		}
		Epilepsy other = (Epilepsy) obj;
		return Objects.equals(epilepsyMedicines, other.epilepsyMedicines)
				&& epilepsymedsadministeredepicresponse == other.epilepsymedsadministeredepicresponse;
	}

}
