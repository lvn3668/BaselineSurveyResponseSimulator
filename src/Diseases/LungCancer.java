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
public class LungCancer extends CancerResponse {

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

	private ValueRange LungCancerMedicines;
	private int lungcancermedicinesadministeredepicresponse;

	public LungCancer(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(LungCancer.getMintogenerateerrorval(),
					LungCancer.getMaxtogenerateerrorval()));

			this.setLungCancerMedicines(ValueRange.of(0, 1));
			this.setLungcancermedicinesadministeredepicresponse(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public LungCancer(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		try {

			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(LungCancer.getMintogenerateerrorval(),
					LungCancer.getMaxtogenerateerrorval()));

			this.setLungCancerMedicines(valuerange);
			this.setLungcancermedicinesadministeredepicresponse(simulatedresponse);
			// if CancerResponse is positive, then generate values
			// for whether medicines are being administered or not
			// else set to 0

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
		if (!(obj instanceof LungCancer)) {
			return false;
		}
		LungCancer other = (LungCancer) obj;
		return Objects.equals(this.LungCancerMedicines, other.LungCancerMedicines)
				&& this.lungcancermedicinesadministeredepicresponse == other.lungcancermedicinesadministeredepicresponse;
	}

	/**
	 * @return the lungCancerMedicines
	 */
	private ValueRange getLungCancerMedicines() throws Exception {
		try {
			return this.LungCancerMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.LungCancerMedicines;
	}

	/**
	 * @return the lungcancermedicinesadministeredepicresponse
	 */
	public int getLungCancermedicinesadministeredepicresponse() throws Exception {
		try {
			return this.lungcancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.lungcancermedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.LungCancerMedicines, this.lungcancermedicinesadministeredepicresponse);
		return result;
	}

	/**
	 * @param lungCancerMedicines the lungCancerMedicines to set
	 */
	private void setLungCancerMedicines(ValueRange lungCancerMedicines) throws Exception {
		try {
			this.LungCancerMedicines = lungCancerMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param lungcancermedicinesadministeredepicresponse the
	 *                                                    lungcancermedicinesadministeredepicresponse
	 *                                                    to set
	 */
	private void setLungcancermedicinesadministeredepicresponse(int lungcancermedicinesadministeredepicresponse)
			throws Exception {
		try {
			this.lungcancermedicinesadministeredepicresponse = lungcancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
				(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
						.randBetween(LungCancer.getMintogenerateerrorval(), LungCancer.getMaxtogenerateerrorval())))) {
			this.setLungcancermedicinesadministeredepicresponse(
					this.getUtilities().randBetween((int) this.getLungCancerMedicines().getMinimum(),
							(int) this.getLungCancerMedicines().getMaximum()));
		} else {
			this.setLungcancermedicinesadministeredepicresponse(this.getUtilities()
					.randBetween(LungCancer.getMintogenerateerrorval(), LungCancer.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "LungCancer [LungCancerMedicines=" + this.LungCancerMedicines
				+ ", lungcancermedicinesadministeredepicresponse=" + this.lungcancermedicinesadministeredepicresponse
				+ "]";
	}

}
