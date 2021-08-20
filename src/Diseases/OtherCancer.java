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

	public OtherCancer(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setOtherCancerMedicines(ValueRange.of(0, 1));
			this.setOthercancermedicinesadministeredepicresponse(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public OtherCancer(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
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
		return Objects.equals(this.OtherCancerMedicines, other.OtherCancerMedicines)
				&& this.othercancermedicinesadministeredepicresponse == other.othercancermedicinesadministeredepicresponse;
	}

	/**
	 * @return the othercancermedicinesadministeredepicresponse
	 */
	public int getCancerOthermedicinesadministeredepicresponse() {
		try {
			return this.othercancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.othercancermedicinesadministeredepicresponse;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.OtherCancerMedicines, this.othercancermedicinesadministeredepicresponse);
		return result;
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

}
