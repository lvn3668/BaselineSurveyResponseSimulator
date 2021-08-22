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
public class LungDisease extends OsteopathicDiseaseResponse {

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

	private ValueRange LungDiseaseMedicines;
	private int lungdiseasemedicinesadministeredepicresponse;

	public LungDisease(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(LungDisease.getMintogenerateerrorval(),
					LungDisease.getMaxtogenerateerrorval()));

			this.setLungDiseaseMedicines(ValueRange.of(0, 1));
			this.setLungdiseasemedicinesadministeredepicresponse(2);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public LungDisease(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(LungDisease.getMintogenerateerrorval(),
					LungDisease.getMaxtogenerateerrorval()));

			this.setLungDiseaseMedicines(valuerange);
			this.setLungdiseasemedicinesadministeredepicresponse(simulatedresponse);
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
		if (!(obj instanceof LungDisease)) {
			return false;
		}
		LungDisease other = (LungDisease) obj;
		return Objects.equals(this.LungDiseaseMedicines, other.LungDiseaseMedicines)
				&& this.lungdiseasemedicinesadministeredepicresponse == other.lungdiseasemedicinesadministeredepicresponse;
	}

	/**
	 * @return the lungDiseaseMedicines
	 */
	private ValueRange getLungDiseaseMedicines() throws Exception {
		try {
			return this.LungDiseaseMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.LungDiseaseMedicines;
	}

	public int getLungDiseasemedicinesadministeredepicresponse() throws Exception {
		try {
			return this.lungdiseasemedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.lungdiseasemedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.LungDiseaseMedicines, this.lungdiseasemedicinesadministeredepicresponse);
		return result;
	}

	/**
	 * @param lungDiseaseMedicines the lungDiseaseMedicines to set
	 */
	private void setLungDiseaseMedicines(ValueRange lungDiseaseMedicines) throws Exception {
		try {
			this.LungDiseaseMedicines = lungDiseaseMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setLungdiseasemedicinesadministeredepicresponse(int lungdiseasemedicinesadministeredepicresponse)
			throws Exception {
		try {
			this.lungdiseasemedicinesadministeredepicresponse = lungdiseasemedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) {
		try {
			super.simulateResponses(veterancohort);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							LungDisease.getMintogenerateerrorval(), LungDisease.getMaxtogenerateerrorval())))) {
				this.setLungdiseasemedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getLungDiseaseMedicines().getMinimum(),
								(int) this.getLungDiseaseMedicines().getMaximum()));
			} else {
				this.setLungdiseasemedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(LungDisease.getMintogenerateerrorval(), LungDisease.getMaxtogenerateerrorval()));
			}
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "LungDisease [LungDiseaseMedicines=" + this.LungDiseaseMedicines
				+ ", lungdiseasemedicinesadministeredepicresponse=" + this.lungdiseasemedicinesadministeredepicresponse
				+ "]";
	}

}
