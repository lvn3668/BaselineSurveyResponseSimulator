package Diseases;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

public class Alzheimers extends NeuroStimulatoryDiseaseResponse {
	/**
	 *
	 */
	private static final int maxtogenerateerrorval = 5;

	/**
	 *
	 */
	private static final int mintogenerateerrorval = 2;

	/**
	 * @return the maxtogenerateerrorval
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
	private static int getMintogenerateerrorval() {
		return mintogenerateerrorval;
	}

	/**
	 *
	 */
	private ValueRange AlzheimersMedicines;

	/**
	 *
	 */
	private int alzheimersmedsadministeredepicresponse;

	/**
	 * @throws Exception
	 */
	public Alzheimers(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(Alzheimers.getMintogenerateerrorval(),
					Alzheimers.getMaxtogenerateerrorval()));
			this.setAlzheimersMedicines(ValueRange.of(0, 1));
			this.setAlzheimersmedsadministeredepicresponse(2);

			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							Alzheimers.getMintogenerateerrorval(), Alzheimers.getMaxtogenerateerrorval())))) {
				this.setAlzheimersmedsadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getAlzheimersMedicines().getMinimum(),
								(int) this.getAlzheimersMedicines().getMaximum()));
			} else {
				this.setAlzheimersmedsadministeredepicresponse(this.getUtilities()
						.randBetween(Alzheimers.getMintogenerateerrorval(), Alzheimers.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param valuerange
	 * @param alzheimersmedsadministeredepicresponse
	 * @throws Exception
	 */
	public Alzheimers(Cohort cohort, ValueRange valuerange, int alzheimersmedsadministeredepicresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, alzheimersmedsadministeredepicresponse);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(Alzheimers.getMintogenerateerrorval(),
					Alzheimers.getMaxtogenerateerrorval()));
			this.setAlzheimersMedicines(valuerange);
			this.setAlzheimersmedsadministeredepicresponse(alzheimersmedsadministeredepicresponse);

			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							Alzheimers.getMintogenerateerrorval(), Alzheimers.getMaxtogenerateerrorval())))) {
				this.setAlzheimersmedsadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getAlzheimersMedicines().getMinimum(),
								(int) this.getAlzheimersMedicines().getMaximum()));
			} else {
				this.setAlzheimersmedsadministeredepicresponse(this.getUtilities()
						.randBetween(Alzheimers.getMintogenerateerrorval(), Alzheimers.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Alzheimers) && (this.hashCode() != obj.hashCode())) {
			return false;
		}
		return true;
	}

	/**
	 * @return the alzheimersMedicines
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	private ValueRange getAlzheimersMedicines() throws Exception {

		try {
			return this.AlzheimersMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AlzheimersMedicines;
	}

	/**
	 * @return the alzheimersmedsadministeredepicresponse
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	public int getAlzheimersmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.alzheimersmedsadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.alzheimersmedsadministeredepicresponse;
	}

	@Override
	public int hashCode() {

		try {
			return (Integer.toString(this.getAlzheimersmedicinesadministeredepicresponse()).hashCode()
					+ Integer.toString((int) this.getAlzheimersMedicines().getMinimum()).hashCode()
					+ Integer.toString((int) this.getAlzheimersMedicines().getMaximum()).hashCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	/**
	 * @param alzheimersMedicines the alzheimersMedicines to set
	 */
	/**
	 * @param alzheimersMedicines
	 * @throws Exception
	 */
	private void setAlzheimersMedicines(ValueRange alzheimersMedicines) throws Exception {
		try {
			this.AlzheimersMedicines = alzheimersMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param alzheimersmedsadministeredepicresponse the
	 *                                               alzheimersmedsadministeredepicresponse
	 *                                               to set
	 */
	/**
	 * @param alzheimersmedsadministeredepicresponse
	 * @throws Exception
	 */
	private void setAlzheimersmedsadministeredepicresponse(int alzheimersmedsadministeredepicresponse)
			throws Exception {
		try {
			this.alzheimersmedsadministeredepicresponse = alzheimersmedsadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
	 *
	 */

	@Override
	public String toString() {
		return "Alzheimers [AlzheimersMedicines=" + this.AlzheimersMedicines
				+ ", alzheimersmedsadministeredepicresponse=" + this.alzheimersmedsadministeredepicresponse + "]";
	}

}
