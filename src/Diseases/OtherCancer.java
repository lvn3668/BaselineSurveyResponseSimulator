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
public class OtherCancer extends CancerResponse {

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

	private ValueRange OtherCancerMedicines;
	private int othercancermedicinesadministeredepicresponse;

	public OtherCancer(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setOtherCancerMedicines(ValueRange.of(0, 1));
			this.setOthercancermedicinesadministeredepicresponse(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public OtherCancer(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		this.setUtilities(new Utilities());
		this.setUniformdistribution(new UniformDistribution(OtherCancer.getMintogenerateerrorval(),
				OtherCancer.getMaxtogenerateerrorval()));

		this.setOtherCancerMedicines(valuerange);
		this.setOthercancermedicinesadministeredepicresponse(simulatedresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							OtherCancer.getMintogenerateerrorval(), OtherCancer.getMaxtogenerateerrorval())))) {
				this.setOthercancermedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getOtherCancerMedicines().getMinimum(),
								(int) this.getOtherCancerMedicines().getMaximum()));
			} else {
				this.setOthercancermedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(OtherCancer.getMintogenerateerrorval(), OtherCancer.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the otherCancerMedicines
	 */
	private ValueRange getOtherCancerMedicines() {
		try {
			return this.OtherCancerMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.OtherCancerMedicines;
	}

	/**
	 * @return the othercancermedicinesadministeredepicresponse
	 */
	public int getOthercancermedicinesadministeredepicresponse() {
		try {
			return this.othercancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.othercancermedicinesadministeredepicresponse;
	}

	/**
	 * @param otherCancerMedicines the otherCancerMedicines to set
	 */
	private void setOtherCancerMedicines(ValueRange otherCancerMedicines) {
		try {
			this.OtherCancerMedicines = otherCancerMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param othercancermedicinesadministeredepicresponse the
	 *                                                     othercancermedicinesadministeredepicresponse
	 *                                                     to set
	 */
	private void setOthercancermedicinesadministeredepicresponse(int othercancermedicinesadministeredepicresponse) {
		try {
			this.othercancermedicinesadministeredepicresponse = othercancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "OtherCancer [OtherCancerMedicines=" + this.OtherCancerMedicines
				+ ", othercancermedicinesadministeredepicresponse=" + this.othercancermedicinesadministeredepicresponse
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(OtherCancerMedicines, othercancermedicinesadministeredepicresponse);
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
		if (!(obj instanceof OtherCancer)) {
			return false;
		}
		OtherCancer other = (OtherCancer) obj;
		return Objects.equals(OtherCancerMedicines, other.OtherCancerMedicines)
				&& othercancermedicinesadministeredepicresponse == other.othercancermedicinesadministeredepicresponse;
	}

}
