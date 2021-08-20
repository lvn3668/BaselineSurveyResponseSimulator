package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */

public class Blindness extends HearingVisionDiseaseResponse {

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
	private static final int mintogenerateerrorval = 2;

	/**
	 * @return the maxtogenerateerrorval
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
	private static int getMintogenerateerrorval() {
		try {
			return mintogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mintogenerateerrorval;
	}

	private ValueRange BlindnessMedicines;

	// change to random number not 0 or 1
	private int blindnessmedicinesadministeredepicresponse;

	public Blindness(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(Blindness.getMintogenerateerrorval(),
					Blindness.getMaxtogenerateerrorval()));

			this.setBlindnessMedicines(ValueRange.of(0, 1));
			this.setBlindnessmedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							Blindness.getMintogenerateerrorval(), Blindness.getMaxtogenerateerrorval())))) {
				this.setBlindnessmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getBlindnessMedicines().getMinimum(),
								(int) this.getBlindnessMedicines().getMaximum()));
			} else {
				this.setBlindnessmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Blindness.getMintogenerateerrorval(), Blindness.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Blindness(VeteranCohort veteranCohort, ValueRange valuerange, int blindnessmedicinesadministeredepicresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, blindnessmedicinesadministeredepicresponse);

		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(Blindness.getMintogenerateerrorval(),
					Blindness.getMaxtogenerateerrorval()));

			this.setBlindnessMedicines(valuerange);
			this.setBlindnessmedicinesadministeredepicresponse(blindnessmedicinesadministeredepicresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							Blindness.getMintogenerateerrorval(), Blindness.getMaxtogenerateerrorval())))) {
				this.setBlindnessmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getBlindnessMedicines().getMinimum(),
								(int) this.getBlindnessMedicines().getMaximum()));
			} else {
				this.setBlindnessmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Blindness.getMintogenerateerrorval(), Blindness.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj != null) && (obj instanceof Blindness) && (this instanceof Blindness)
				&& (this.hashCode() == obj.hashCode())) {
			return true;
		}
		return false;
	}

	/**
	 * @return the blindnessMedicines
	 */
	private ValueRange getBlindnessMedicines() throws Exception {
		try {
			return this.BlindnessMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.BlindnessMedicines;
	}

	/**
	 * @return the blindnessmedicinesadministeredepicresponse
	 */
	public int getBlindnessmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.blindnessmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.blindnessmedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		try {
			return Objects.hash(this.getBlindnessMedicines(), this.getBlindnessmedicinesadministeredepicresponse(),
					super.getYearDiagnosedSimulatedResponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @param blindnessMedicines the blindnessMedicines to set
	 */
	private void setBlindnessMedicines(ValueRange blindnessMedicines) throws Exception {
		try {
			this.BlindnessMedicines = blindnessMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param blindnessmedicinesadministeredepicresponse the
	 *                                                   blindnessmedicinesadministeredepicresponse
	 *                                                   to set
	 */
	private void setBlindnessmedicinesadministeredepicresponse(int blindnessmedicinesadministeredepicresponse)
			throws Exception {
		try {
			this.blindnessmedicinesadministeredepicresponse = blindnessmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public String toString() {
		return "Blindness [BlindnessMedicines=" + this.BlindnessMedicines
				+ ", blindnessmedicinesadministeredepicresponse=" + this.blindnessmedicinesadministeredepicresponse
				+ "]";
	}

}
