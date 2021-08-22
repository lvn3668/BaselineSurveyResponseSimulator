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
public class Epilepsy extends NeuroStimulatoryDiseaseResponse {

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

	private ValueRange epilepsyMedicines;

	private int epilepsymedsadministeredepicresponse;

	public Epilepsy(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(Epilepsy.getMintogenerateerrorval(),
					Epilepsy.getMaxtogenerateerrorval()));

			this.setEpilepsyMedicines(ValueRange.of(0, 1));
			this.setEpilepsymedsadministeredepicresponse(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Epilepsy(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(Epilepsy.getMintogenerateerrorval(),
					Epilepsy.getMaxtogenerateerrorval()));

			this.setEpilepsyMedicines(valuerange);
			this.setEpilepsymedsadministeredepicresponse(simulatedresponse);
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
		if (!(obj instanceof Epilepsy)) {
			return false;
		}
		Epilepsy other = (Epilepsy) obj;
		return Objects.equals(this.epilepsyMedicines, other.epilepsyMedicines)
				&& this.epilepsymedsadministeredepicresponse == other.epilepsymedsadministeredepicresponse;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		this.epilepsyMedicines = null;
	}

	/**
	 * @return the epilepsyMedicines
	 */
	private ValueRange getEpilepsyMedicines() throws Exception {
		try {
			return this.epilepsyMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.epilepsyMedicines;
	}

	/**
	 * @return the epilepsymedsadministeredepicresponse
	 */
	public int getEpilepsymedicinesadministeredepicresponse() throws Exception {
		try {
			return this.epilepsymedsadministeredepicresponse;
		} finally {
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.epilepsyMedicines, this.epilepsymedsadministeredepicresponse);
		return result;
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
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) {

		try {
			super.simulateResponses(veterancohort);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Epilepsy [epilepsyMedicines=" + this.epilepsyMedicines + ", epilepsymedsadministeredepicresponse="
				+ this.epilepsymedsadministeredepicresponse + "]";
	}

}
