package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class SkinCancer extends CancerResponse {

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

	private ValueRange SkinCancerMedicines;
	private int skincancermedicinesadministeredepicresponse;

	public SkinCancer(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(SkinCancer.getMintogenerateerrorval(),
					SkinCancer.getMaxtogenerateerrorval()));

			this.setSkinCancerMedicines(ValueRange.of(0, 1));
			this.setSkincancermedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SkinCancer.getMintogenerateerrorval(), SkinCancer.getMaxtogenerateerrorval())))) {
				this.setSkincancermedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getSkinCancerMedicines().getMinimum(),
								(int) this.getSkinCancerMedicines().getMaximum()));
			} else {
				this.setSkincancermedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(SkinCancer.getMintogenerateerrorval(), SkinCancer.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public SkinCancer(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort);
		this.setUtilities(new Utilities());
		this.setUniformdistribution(
				new UniformDistribution(SkinCancer.getMintogenerateerrorval(), SkinCancer.getMaxtogenerateerrorval()));

		this.setSkinCancerMedicines(valuerange);
		this.setSkincancermedicinesadministeredepicresponse(simulatedresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SkinCancer.getMintogenerateerrorval(), SkinCancer.getMaxtogenerateerrorval())))) {
				this.setSkincancermedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getSkinCancerMedicines().getMinimum(),
								(int) this.getSkinCancerMedicines().getMaximum()));
			} else {
				this.setSkincancermedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(SkinCancer.getMintogenerateerrorval(), SkinCancer.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof SkinCancer)) {
			return false;
		}
		SkinCancer other = (SkinCancer) obj;
		return Objects.equals(this.SkinCancerMedicines, other.SkinCancerMedicines)
				&& this.skincancermedicinesadministeredepicresponse == other.skincancermedicinesadministeredepicresponse;
	}

	/**
	 * @return the skinCancerMedicines
	 */
	private ValueRange getSkinCancerMedicines() {
		try {
			return this.SkinCancerMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SkinCancerMedicines;
	}

	/**
	 * @return the skincancermedicinesadministeredepicresponse
	 */
	public int getSkinCancermedicinesadministeredepicresponse() {
		try {
			return this.skincancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.skincancermedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.SkinCancerMedicines, this.skincancermedicinesadministeredepicresponse);
		return result;
	}

	/**
	 * @param skinCancerMedicines the skinCancerMedicines to set
	 */
	private void setSkinCancerMedicines(ValueRange skinCancerMedicines) {
		try {
			this.SkinCancerMedicines = skinCancerMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param skincancermedicinesadministeredepicresponse the
	 *                                                    skincancermedicinesadministeredepicresponse
	 *                                                    to set
	 */
	private void setSkincancermedicinesadministeredepicresponse(int skincancermedicinesadministeredepicresponse) {
		try {
			this.skincancermedicinesadministeredepicresponse = skincancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "SkinCancer [SkinCancerMedicines=" + this.SkinCancerMedicines
				+ ", skincancermedicinesadministeredepicresponse=" + this.skincancermedicinesadministeredepicresponse
				+ "]";
	}

}
