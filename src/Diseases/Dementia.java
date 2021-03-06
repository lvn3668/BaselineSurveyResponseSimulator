package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

/**
 * @author Lalitha Viswanathan Affiliation MAVERIC / VABHS
 *
 */
public class Dementia extends NeuroStimulatoryDiseaseResponse {

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

	private ValueRange DementiaMedicines;

	private int dementiamedicinesadministeredepicresponse;

	public Dementia(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(Dementia.getMintogenerateerrorval(),
					Dementia.getMaxtogenerateerrorval()));

			this.setDementiaMedicines(ValueRange.of(0, 1));
			this.setDementiamedicinesadministeredepicresponse(2);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Dementia(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(Dementia.getMintogenerateerrorval(),
					Dementia.getMaxtogenerateerrorval()));

			this.setDementiaMedicines(valuerange);
			this.setDementiamedicinesadministeredepicresponse(simulatedresponse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
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
		if (!(obj instanceof Dementia)) {
			return false;
		}
		Dementia other = (Dementia) obj;
		return Objects.equals(this.DementiaMedicines, other.DementiaMedicines)
				&& this.dementiamedicinesadministeredepicresponse == other.dementiamedicinesadministeredepicresponse;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub

		this.DementiaMedicines = null;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.DementiaMedicines, this.dementiamedicinesadministeredepicresponse);
		return result;
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
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) {

		try {
			super.simulateResponses(veterancohort);
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
		}
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

}
