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
public class SleepApnea extends OsteopathicDiseaseResponse {

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

	private ValueRange SleepApneaMedicines;
	private int sleepapneamedicinesadministeredepicresponse;

	/**
	 * @return the sleepApneaMedicines
	 */

	public SleepApnea(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(SleepApnea.getMintogenerateerrorval(),
					SleepApnea.getMaxtogenerateerrorval()));

			this.setSleepApneaMedicines(ValueRange.of(0, 1));
			this.setSleepapneamedicinesadministeredepicresponse(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public SleepApnea(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);

		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(SleepApnea.getMintogenerateerrorval(),
					SleepApnea.getMaxtogenerateerrorval()));

			this.setSleepApneaMedicines(valuerange);
			this.setSleepapneamedicinesadministeredepicresponse(simulatedresponse);

		} catch (Exception e) {
			// TODO Auto-generated catch block
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
		if (!(obj instanceof SleepApnea)) {
			return false;
		}
		SleepApnea other = (SleepApnea) obj;
		return Objects.equals(this.SleepApneaMedicines, other.SleepApneaMedicines)
				&& this.sleepapneamedicinesadministeredepicresponse == other.sleepapneamedicinesadministeredepicresponse;
	}

	private ValueRange getSleepApneaMedicines() {
		try {
			return this.SleepApneaMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SleepApneaMedicines;
	}

	/**
	 * @return the sleepapneamedicinesadministeredepicresponse
	 */
	public int getSleepApneamedicinesadministeredepicresponse() {
		try {
			return this.sleepapneamedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sleepapneamedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.SleepApneaMedicines, this.sleepapneamedicinesadministeredepicresponse);
		return result;
	}

	/**
	 * @param sleepApneaMedicines the sleepApneaMedicines to set
	 */
	private void setSleepApneaMedicines(ValueRange sleepApneaMedicines) {
		try {
			this.SleepApneaMedicines = sleepApneaMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sleepapneamedicinesadministeredepicresponse the
	 *                                                    sleepapneamedicinesadministeredepicresponse
	 *                                                    to set
	 */
	private void setSleepapneamedicinesadministeredepicresponse(int sleepapneamedicinesadministeredepicresponse) {
		try {
			this.sleepapneamedicinesadministeredepicresponse = sleepapneamedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) {
		// if CancerResponse is positive, then generate values
// for whether medicines are being administered or not
// else set to 0
		super.simulateResponses(veterancohort);
		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SleepApnea.getMintogenerateerrorval(), SleepApnea.getMaxtogenerateerrorval())))) {
				this.setSleepapneamedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getSleepApneaMedicines().getMinimum(),
								(int) this.getSleepApneaMedicines().getMaximum()));
			} else {
				this.setSleepapneamedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(SleepApnea.getMintogenerateerrorval(), SleepApnea.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "SleepApnea [SleepApneaMedicines=" + this.SleepApneaMedicines
				+ ", sleepapneamedicinesadministeredepicresponse=" + this.sleepapneamedicinesadministeredepicresponse
				+ "]";
	}

}
