package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan MAVERIC / VABHS
 *
 */
public class LiverDisease extends OsteopathicDiseaseResponse {

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

	private ValueRange LiverMedicines;
	private int livermedicinesadministeredepicresponse;

	public LiverDisease(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(LiverDisease.getMintogenerateerrorval(),
					LiverDisease.getMaxtogenerateerrorval()));

			this.setLiverMedicines(ValueRange.of(0, 1));
			this.setLivermedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							LiverDisease.getMintogenerateerrorval(), LiverDisease.getMaxtogenerateerrorval())))) {
				this.setLivermedicinesadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getLiverMedicines().getMinimum(), (int) this.getLiverMedicines().getMaximum()));
			} else {
				this.setLivermedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(LiverDisease.getMintogenerateerrorval(), LiverDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public LiverDisease(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(LiverDisease.getMintogenerateerrorval(),
					LiverDisease.getMaxtogenerateerrorval()));

			this.setLiverMedicines(valuerange);
			this.setLivermedicinesadministeredepicresponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							LiverDisease.getMintogenerateerrorval(), LiverDisease.getMaxtogenerateerrorval())))) {
				this.setLivermedicinesadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getLiverMedicines().getMinimum(), (int) this.getLiverMedicines().getMaximum()));
			} else {
				this.setLivermedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(LiverDisease.getMintogenerateerrorval(), LiverDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
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
		if (!(obj instanceof LiverDisease)) {
			return false;
		}
		LiverDisease other = (LiverDisease) obj;
		return Objects.equals(this.LiverMedicines, other.LiverMedicines)
				&& this.livermedicinesadministeredepicresponse == other.livermedicinesadministeredepicresponse;
	}

	/**
	 * @return the livermedicinesadministeredepicresponse
	 */
	public int getLiverDiseasemedicinesadministeredepicresponse() throws Exception {
		try {
			return this.livermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.livermedicinesadministeredepicresponse;
	}

	/**
	 * @return the liverMedicines
	 */
	private ValueRange getLiverMedicines() throws Exception {
		try {
			return this.LiverMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.LiverMedicines;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.LiverMedicines, this.livermedicinesadministeredepicresponse);
		return result;
	}

	/**
	 * @param liverMedicines the liverMedicines to set
	 */
	private void setLiverMedicines(ValueRange liverMedicines) throws Exception {
		try {
			this.LiverMedicines = liverMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param livermedicinesadministeredepicresponse the
	 *                                               livermedicinesadministeredepicresponse
	 *                                               to set
	 */
	private void setLivermedicinesadministeredepicresponse(int livermedicinesadministeredepicresponse)
			throws Exception {
		try {
			this.livermedicinesadministeredepicresponse = livermedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "LiverDisease [LiverMedicines=" + this.LiverMedicines + ", livermedicinesadministeredepicresponse="
				+ this.livermedicinesadministeredepicresponse + "]";
	}

}
