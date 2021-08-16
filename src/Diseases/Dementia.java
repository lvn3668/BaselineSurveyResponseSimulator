package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan
 * Affiliation MAVERIC / VABHS 
 *
 */
public class Dementia extends NeuroStimulatoryDiseaseResponse {

	private ValueRange DementiaMedicines;
	private int dementiamedicinesadministeredepicresponse;
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

	public Dementia(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Dementia.getMintogenerateerrorval(), Dementia.getMaxtogenerateerrorval()));

			this.setDementiaMedicines(ValueRange.of(0, 1));
			this.setDementiamedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Dementia.getMintogenerateerrorval(), Dementia.getMaxtogenerateerrorval())))) {
				this.setDementiamedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getDementiaMedicines().getMinimum(),
								(int) this.getDementiaMedicines().getMaximum()));
			} else {
				this.setDementiamedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Dementia.getMintogenerateerrorval(), Dementia.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Dementia(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Dementia.getMintogenerateerrorval(), Dementia.getMaxtogenerateerrorval()));

			this.setDementiaMedicines(valuerange);
			this.setDementiamedicinesadministeredepicresponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Dementia.getMintogenerateerrorval(), Dementia.getMaxtogenerateerrorval())))) {
				this.setDementiamedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getDementiaMedicines().getMinimum(),
								(int) this.getDementiaMedicines().getMaximum()));
			} else {
				this.setDementiamedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Dementia.getMintogenerateerrorval(), Dementia.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub

		this.DementiaMedicines = null;
	}

	@Override
	public String toString() {
		try {
			return "Dementia [DementiaMedicines=" + this.DementiaMedicines
					+ ", dementiamedicinesadministeredepicresponse=" + this.dementiamedicinesadministeredepicresponse
					+ "]";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Dementia [DementiaMedicines=" + this.DementiaMedicines + ", dementiamedicinesadministeredepicresponse="
				+ this.dementiamedicinesadministeredepicresponse + "]";
	}

	/**
	 * @return the dementiaMedicines
	 */
	private ValueRange getDementiaMedicines() throws Exception {
		try {
			return this.DementiaMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.DementiaMedicines;
	}

	/**
	 * @param dementiaMedicines the dementiaMedicines to set
	 */
	private void setDementiaMedicines(ValueRange dementiaMedicines) throws Exception {
		try {
			this.DementiaMedicines = dementiaMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @return the dementiamedicinesadministeredepicresponse
	 */
	public int getDementiamedicinesadministeredepicresponse() throws Exception {
		try {
			return this.dementiamedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.dementiamedicinesadministeredepicresponse;
	}

	/**
	 * @param dementiamedicinesadministeredepicresponse the
	 *                                                  dementiamedicinesadministeredepicresponse
	 *                                                  to set
	 */
	private void setDementiamedicinesadministeredepicresponse(int dementiamedicinesadministeredepicresponse)
			throws Exception {
		try {
			this.dementiamedicinesadministeredepicresponse = dementiamedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	private static int getMaxtogenerateerrorval() {
		try {
			return maxtogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(DementiaMedicines, dementiamedicinesadministeredepicresponse);
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
		if (!(obj instanceof Dementia)) {
			return false;
		}
		Dementia other = (Dementia) obj;
		return Objects.equals(DementiaMedicines, other.DementiaMedicines)
				&& dementiamedicinesadministeredepicresponse == other.dementiamedicinesadministeredepicresponse;
	}

}
