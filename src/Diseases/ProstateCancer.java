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
public class ProstateCancer extends CancerResponse {

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

	ValueRange ProstateCancerMedicines;
	int prostatecancermedicinesadministeredepicresponse;

	public ProstateCancer(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(ProstateCancer.getMintogenerateerrorval(),
					ProstateCancer.getMaxtogenerateerrorval()));

			this.setProstateCancerMedicines(ValueRange.of(0, 1));
			this.setProstatecancermedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							ProstateCancer.getMintogenerateerrorval(), ProstateCancer.getMaxtogenerateerrorval())))) {
				this.setProstatecancermedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getProstateCancerMedicines().getMinimum(),
								(int) this.getProstateCancerMedicines().getMaximum()));
			} else {
				this.setProstatecancermedicinesadministeredepicresponse(this.getUtilities().randBetween(
						ProstateCancer.getMintogenerateerrorval(), ProstateCancer.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ProstateCancer(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort);
		this.setUtilities(new Utilities());
		this.setUniformdistribution(new UniformDistribution(ProstateCancer.getMintogenerateerrorval(),
				ProstateCancer.getMaxtogenerateerrorval()));

		this.setProstateCancerMedicines(valuerange);
		this.setProstatecancermedicinesadministeredepicresponse(simulatedresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							ProstateCancer.getMintogenerateerrorval(), ProstateCancer.getMaxtogenerateerrorval())))) {
				this.setProstatecancermedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getProstateCancerMedicines().getMinimum(),
								(int) this.getProstateCancerMedicines().getMaximum()));
			} else {
				this.setProstatecancermedicinesadministeredepicresponse(this.getUtilities().randBetween(
						ProstateCancer.getMintogenerateerrorval(), ProstateCancer.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof ProstateCancer)) {
			return false;
		}
		ProstateCancer other = (ProstateCancer) obj;
		return Objects.equals(this.ProstateCancerMedicines, other.ProstateCancerMedicines)
				&& this.prostatecancermedicinesadministeredepicresponse == other.prostatecancermedicinesadministeredepicresponse;
	}

	/**
	 * @return the prostateCancerMedicines
	 */
	private ValueRange getProstateCancerMedicines() {
		return this.ProstateCancerMedicines;
	}

	/**
	 * @return the prostatecancermedicinesadministeredepicresponse
	 */
	public int getProstateCancermedicinesadministeredepicresponse() {
		try {
			return this.prostatecancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.prostatecancermedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.ProstateCancerMedicines, this.prostatecancermedicinesadministeredepicresponse);
		return result;
	}

	/**
	 * @param prostateCancerMedicines the prostateCancerMedicines to set
	 */
	private void setProstateCancerMedicines(ValueRange prostateCancerMedicines) {
		this.ProstateCancerMedicines = prostateCancerMedicines;
	}

	/**
	 * @param prostatecancermedicinesadministeredepicresponse the
	 *                                                        prostatecancermedicinesadministeredepicresponse
	 *                                                        to set
	 */
	private void setProstatecancermedicinesadministeredepicresponse(
			int prostatecancermedicinesadministeredepicresponse) {
		try {
			this.prostatecancermedicinesadministeredepicresponse = prostatecancermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "ProstateCancer [ProstateCancerMedicines=" + this.ProstateCancerMedicines
				+ ", prostatecancermedicinesadministeredepicresponse="
				+ this.prostatecancermedicinesadministeredepicresponse + "]";
	}

}
