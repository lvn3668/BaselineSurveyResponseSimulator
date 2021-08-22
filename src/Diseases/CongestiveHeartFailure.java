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
public class CongestiveHeartFailure extends CirculatoryDiseaseResponse {

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
		try {
			return mintogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mintogenerateerrorval;
	}

	/**
	 *
	 */
	private int chfmedicinesadministeredepicresponse;
	/**
	 *
	 */
	private ValueRange CongestiveHeartFailureMedicines;

	/**
	 * @throws Exception
	 */
	public CongestiveHeartFailure(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdisttribution(new RandomizingDistribution(CongestiveHeartFailure.getMintogenerateerrorval(),
					CongestiveHeartFailure.getMaxtogenerateerrorval()));

			this.setCongestiveHeartFailureMedicines(ValueRange.of(0, 1));
			this.setChfmedicinesadministeredepicresponse(2);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @throws Exception
	 */
	public CongestiveHeartFailure(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		super(veteranCohort, valuerange, simulatedresponse);

		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdisttribution(new RandomizingDistribution(CongestiveHeartFailure.getMintogenerateerrorval(),
					CongestiveHeartFailure.getMaxtogenerateerrorval()));

			this.setCongestiveHeartFailureMedicines(valuerange);
			this.setChfmedicinesadministeredepicresponse(simulatedresponse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
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
		if (!(obj instanceof CongestiveHeartFailure)) {
			return false;
		}
		CongestiveHeartFailure other = (CongestiveHeartFailure) obj;
		return Objects.equals(this.CongestiveHeartFailureMedicines, other.CongestiveHeartFailureMedicines)
				&& this.chfmedicinesadministeredepicresponse == other.chfmedicinesadministeredepicresponse;
	}

	/**
	 *
	 */
	@Override
	protected void finalize() throws Exception {
		// TODO Auto-generated method stub
		// super.finalize();
		try {
			this.CongestiveHeartFailureMedicines = null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @return the congestiveHeartFailureMedicines
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	private ValueRange getCongestiveHeartFailureMedicines() {
		try {
			return this.CongestiveHeartFailureMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.CongestiveHeartFailureMedicines;
	}

	/**
	 * @return the chfmedicinesadministeredepicresponse
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	public int getCongestiveheartfailuremedicinesadministeredepicresponse() {
		try {
			return this.chfmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.chfmedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.getCongestiveHeartFailureMedicines(), this.chfmedicinesadministeredepicresponse);
		return result;
	}

	/**
	 * @param chfmedicinesadministeredepicresponse the
	 *                                             chfmedicinesadministeredepicresponse
	 *                                             to set
	 */
	/**
	 * @param chfmedicinesadministeredepicresponse
	 * @throws Exception
	 */
	private void setChfmedicinesadministeredepicresponse(int chfmedicinesadministeredepicresponse) throws Exception {
		try {
			this.chfmedicinesadministeredepicresponse = chfmedicinesadministeredepicresponse;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param congestiveHeartFailureMedicines the congestiveHeartFailureMedicines to
	 *                                        set
	 */
	/**
	 * @param congestiveHeartFailureMedicines
	 * @throws Exception
	 */
	private void setCongestiveHeartFailureMedicines(ValueRange congestiveHeartFailureMedicines) throws Exception {
		try {
			this.CongestiveHeartFailureMedicines = congestiveHeartFailureMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) {

		super.simulateResponses(veterancohort);
		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdisttribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(CongestiveHeartFailure.getMintogenerateerrorval(),
									CongestiveHeartFailure.getMaxtogenerateerrorval())))) {
				this.setChfmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getCongestiveHeartFailureMedicines().getMinimum(),
								(int) this.getCongestiveHeartFailureMedicines().getMaximum()));
			} else {
				this.setChfmedicinesadministeredepicresponse(
						this.getUtilities().randBetween(CongestiveHeartFailure.getMintogenerateerrorval(),
								CongestiveHeartFailure.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		try {
			return "CongestiveHeartFailure [CongestiveHeartFailureMedicines=" + this.CongestiveHeartFailureMedicines
					+ ", chfmedicinesadministeredepicresponse=" + this.chfmedicinesadministeredepicresponse + "]";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "CongestiveHeartFailure [CongestiveHeartFailureMedicines=" + this.CongestiveHeartFailureMedicines
				+ ", chfmedicinesadministeredepicresponse=" + this.chfmedicinesadministeredepicresponse + "]";

	}

}
