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
public class ColonCancer extends CancerResponse {

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
	private static int getMintogenerateerrorval() {
		try {
			return mintogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mintogenerateerrorval;
	}

	ValueRange ColonCancerMedicines = ValueRange.of(0, 1);

	// default is error response
	int coloncancermedicinesadministeredepicresponse = 2;

	public ColonCancer(VeteranCohort veteranCohort) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(ColonCancer.getMintogenerateerrorval(),
					ColonCancer.getMaxtogenerateerrorval()));

			this.setColonCancerMedicines(ValueRange.of(0, 1));
			this.setColoncancermedicinesadministeredepicresponse(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ColonCancer(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);

		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(ColonCancer.getMintogenerateerrorval(),
					ColonCancer.getMaxtogenerateerrorval()));

			this.setColonCancerMedicines(valuerange);
			this.setColoncancermedicinesadministeredepicresponse(simulatedresponse);
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
		if (!(obj instanceof ColonCancer)) {
			return false;
		}
		ColonCancer other = (ColonCancer) obj;
		return Objects.equals(this.ColonCancerMedicines, other.ColonCancerMedicines)
				&& this.coloncancermedicinesadministeredepicresponse == other.coloncancermedicinesadministeredepicresponse;
	}

	/**
	 * @return the colonCancerMedicines
	 */
	private ValueRange getColonCancerMedicines() {
		try {
			return this.ColonCancerMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ColonCancerMedicines;
	}

	/**
	 * @return the coloncancermedicinesadministeredepicresponse
	 */
	public int getColonCancermedicinesadministeredepicresponse() {
		try {
			return this.coloncancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.coloncancermedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.ColonCancerMedicines, this.coloncancermedicinesadministeredepicresponse);
		return result;
	}

	/**
	 * @param colonCancerMedicines the colonCancerMedicines to set
	 */
	private void setColonCancerMedicines(ValueRange colonCancerMedicines) throws Exception {
		try {
			this.ColonCancerMedicines = colonCancerMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param coloncancermedicinesadministeredepicresponse the
	 *                                                     coloncancermedicinesadministeredepicresponse
	 *                                                     to set
	 */
	private void setColoncancermedicinesadministeredepicresponse(int coloncancermedicinesadministeredepicresponse)
			throws Exception {
		try {
			this.coloncancermedicinesadministeredepicresponse = coloncancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) throws Exception {
		super.simulateResponses(veterancohort);
		if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
		// generate uniform distribution between min and max error vals and pick a
		// random number, check pdf value
		// if less than 0.5 then generate 0 or 1
				(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
						ColonCancer.getMintogenerateerrorval(), ColonCancer.getMaxtogenerateerrorval())))) {
			this.setColoncancermedicinesadministeredepicresponse(
					this.getUtilities().randBetween((int) this.getColonCancerMedicines().getMinimum(),
							(int) this.getColonCancerMedicines().getMaximum()));
		} else {
			this.setColoncancermedicinesadministeredepicresponse(this.getUtilities()
					.randBetween(ColonCancer.getMintogenerateerrorval(), ColonCancer.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "ColonCancer [ColonCancerMedicines=" + this.ColonCancerMedicines
				+ ", coloncancermedicinesadministeredepicresponse=" + this.coloncancermedicinesadministeredepicresponse
				+ "]";
	}

}
