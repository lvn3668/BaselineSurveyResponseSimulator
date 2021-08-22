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
public class MemoryLoss extends NeuroStimulatoryDiseaseResponse {

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

	private ValueRange MemoryLossMedicines;
	private int memorylossmedicinesadministeredepicresponse;

	public MemoryLoss(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(MemoryLoss.getMintogenerateerrorval(),
					MemoryLoss.getMaxtogenerateerrorval()));

			this.setMemoryLossMedicines(ValueRange.of(0, 1));
			this.setMemorylossmedicinesadministeredepicresponse(2);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public MemoryLoss(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(MemoryLoss.getMintogenerateerrorval(),
					MemoryLoss.getMaxtogenerateerrorval()));

			this.setMemoryLossMedicines(valuerange);
			this.setMemorylossmedicinesadministeredepicresponse(simulatedresponse);
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
		if (!(obj instanceof MemoryLoss)) {
			return false;
		}
		MemoryLoss other = (MemoryLoss) obj;
		return Objects.equals(this.MemoryLossMedicines, other.MemoryLossMedicines)
				&& this.memorylossmedicinesadministeredepicresponse == other.memorylossmedicinesadministeredepicresponse;
	}

	/**
	 * @return the migraneMedicines
	 */
	private ValueRange getMemoryLossMedicines() {
		try {
			return this.MemoryLossMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MemoryLossMedicines;
	}

	/**
	 * @return the memorylossmedicinesadministeredepicresponse
	 */
	public int getMemoryLossmedicinesadministeredepicresponse() {
		try {
			return this.memorylossmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.memorylossmedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.MemoryLossMedicines, this.memorylossmedicinesadministeredepicresponse);
		return result;
	}

	/**
	 * @param migraneMedicines the migraneMedicines to set
	 */
	private void setMemoryLossMedicines(ValueRange memorylossMedicines) {
		try {
			this.MemoryLossMedicines = memorylossMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param memorylossmedicinesadministeredepicresponse the
	 *                                                    memorylossmedicinesadministeredepicresponse
	 *                                                    to set
	 */
	private void setMemorylossmedicinesadministeredepicresponse(int migranemedicinesadministeredepicresponse) {
		try {
			this.memorylossmedicinesadministeredepicresponse = migranemedicinesadministeredepicresponse;
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
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							MemoryLoss.getMintogenerateerrorval(), MemoryLoss.getMaxtogenerateerrorval())))) {
				this.setMemorylossmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getMemoryLossMedicines().getMinimum(),
								(int) this.getMemoryLossMedicines().getMaximum()));
			} else {
				this.setMemorylossmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(MemoryLoss.getMintogenerateerrorval(), MemoryLoss.getMaxtogenerateerrorval()));
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
		return "MemoryLoss [memorylossmedicinesadministeredepicresponse="
				+ this.memorylossmedicinesadministeredepicresponse + ", MemoryLossMedicines=" + this.MemoryLossMedicines
				+ "]";
	}

}
