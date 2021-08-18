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
public class Diabetes extends OsteopathicDiseaseResponse {

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
		try {
			return mintogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mintogenerateerrorval;

	}

	private ValueRange DiabetesMedicines;
	private int diabetesmedicinesadministeredepicresponse;

	public Diabetes(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Diabetes.getMintogenerateerrorval(), Diabetes.getMaxtogenerateerrorval()));

			this.setDiabetesMedicines(ValueRange.of(0, 1));
			this.setDiabetesmedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Diabetes.getMintogenerateerrorval(), Diabetes.getMaxtogenerateerrorval())))) {
				this.setDiabetesmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getDiabetesMedicines().getMinimum(),
								(int) this.getDiabetesMedicines().getMaximum()));
			} else {
				this.setDiabetesmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Diabetes.getMintogenerateerrorval(), Diabetes.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Diabetes(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Diabetes.getMintogenerateerrorval(), Diabetes.getMaxtogenerateerrorval()));

			this.setDiabetesMedicines(valuerange);
			this.setDiabetesmedicinesadministeredepicresponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Diabetes.getMintogenerateerrorval(), Diabetes.getMaxtogenerateerrorval())))) {
				this.setDiabetesmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getDiabetesMedicines().getMinimum(),
								(int) this.getDiabetesMedicines().getMaximum()));
			} else {
				this.setDiabetesmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Diabetes.getMintogenerateerrorval(), Diabetes.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		this.DiabetesMedicines = null;
	}

	/**
	 * @return the diabetesMedicines
	 */
	private ValueRange getDiabetesMedicines() throws Exception {
		try {
			return this.DiabetesMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.DiabetesMedicines;
	}

	/**
	 * @return the diabetesmedicinesadministeredepicresponse
	 */
	public int getDiabetesmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.diabetesmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.diabetesmedicinesadministeredepicresponse;
	}

	/**
	 * @param diabetesMedicines the diabetesMedicines to set
	 */
	private void setDiabetesMedicines(ValueRange diabetesMedicines) throws Exception {
		try {
			this.DiabetesMedicines = diabetesMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param diabetesmedicinesadministeredepicresponse the
	 *                                                  diabetesmedicinesadministeredepicresponse
	 *                                                  to set
	 */
	private void setDiabetesmedicinesadministeredepicresponse(int diabetesmedicinesadministeredepicresponse)
			throws Exception {
		try {
			this.diabetesmedicinesadministeredepicresponse = diabetesmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public String toString() {
		return "Diabetes [DiabetesMedicines=" + this.DiabetesMedicines + ", diabetesmedicinesadministeredepicresponse="
				+ this.diabetesmedicinesadministeredepicresponse + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(DiabetesMedicines, diabetesmedicinesadministeredepicresponse);
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
		if (!(obj instanceof Diabetes)) {
			return false;
		}
		Diabetes other = (Diabetes) obj;
		return Objects.equals(DiabetesMedicines, other.DiabetesMedicines)
				&& diabetesmedicinesadministeredepicresponse == other.diabetesmedicinesadministeredepicresponse;
	}

}
