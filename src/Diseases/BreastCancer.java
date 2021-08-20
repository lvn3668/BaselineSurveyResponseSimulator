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

public class BreastCancer extends CancerResponse {

	// TBD: Noise to be introduced to get error in response variables
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
		return mintogenerateerrorval;
	}

	private int breastcancermedicinesadministeredepicresponse;

	private ValueRange BrstCancerMedicines;

	public BreastCancer(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(BreastCancer.getMintogenerateerrorval(),
					BreastCancer.getMaxtogenerateerrorval()));

			this.setBrstCancerMedicines(ValueRange.of(0, 1));
			this.setBreastcancermedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							BreastCancer.getMintogenerateerrorval(), BreastCancer.getMaxtogenerateerrorval())))) {
				this.setBreastcancermedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getBrstCancerMedicines().getMinimum(),
								(int) this.getBrstCancerMedicines().getMaximum()));
			} else {
				this.setBreastcancermedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(BreastCancer.getMintogenerateerrorval(), BreastCancer.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BreastCancer(VeteranCohort veteranCohort, ValueRange valuerange, int breastcancermedicinesadministeredepicresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, breastcancermedicinesadministeredepicresponse);
		this.setUtilities(new Utilities());
		this.setUniformdistribution(new UniformDistribution(BreastCancer.getMintogenerateerrorval(),
				BreastCancer.getMaxtogenerateerrorval()));

		this.setBrstCancerMedicines(valuerange);
		this.setBreastcancermedicinesadministeredepicresponse(breastcancermedicinesadministeredepicresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							BreastCancer.getMintogenerateerrorval(), BreastCancer.getMaxtogenerateerrorval())))) {
				this.setBreastcancermedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getBrstCancerMedicines().getMinimum(),
								(int) this.getBrstCancerMedicines().getMaximum()));
			} else {
				this.setBreastcancermedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(BreastCancer.getMintogenerateerrorval(), BreastCancer.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof BreastCancer && this instanceof BreastCancer
				&& this.hashCode() == obj.hashCode()) {
			return true;
		}
		return false;
	}

	/**
	 * @return the breastcancermedicinesadministeredepicresponse
	 */
	public int getBreastCancermedicinesadministeredepicresponse() throws Exception {
		try {
			return this.breastcancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.breastcancermedicinesadministeredepicresponse;
	}

	/**
	 * @return the brstCancerMedicines
	 */
	private ValueRange getBrstCancerMedicines() throws Exception {
		try {
			return this.BrstCancerMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.BrstCancerMedicines;
	}

	@Override
	public int hashCode() {
		try {
			return Objects.hash(this.getBrstCancerMedicines(), this.getBreastCancermedicinesadministeredepicresponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @param breastcancermedicinesadministeredepicresponse the
	 *                                                      breastcancermedicinesadministeredepicresponse
	 *                                                      to set
	 */
	private void setBreastcancermedicinesadministeredepicresponse(int breastcancermedicinesadministeredepicresponse)
			throws Exception {
		try {
			this.breastcancermedicinesadministeredepicresponse = breastcancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param brstCancerMedicines the brstCancerMedicines to set
	 */
	private void setBrstCancerMedicines(ValueRange brstCancerMedicines) throws Exception {
		try {
			this.BrstCancerMedicines = brstCancerMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
