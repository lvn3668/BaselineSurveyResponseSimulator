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
public class HeartAttack extends MiscDiseaseResponse {

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

	private ValueRange HeartAttackMedicines;
	private int HeartAttackMedicinesAdministeredEpicResponse;

	public HeartAttack(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HeartAttack.getMintogenerateerrorval(),
					HeartAttack.getMaxtogenerateerrorval()));

			this.setHeartAttackMedicines(ValueRange.of(0, 1));
			this.setHeartAttackMedicinesAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							HeartAttack.getMintogenerateerrorval(), HeartAttack.getMaxtogenerateerrorval())))) {
				this.setHeartAttackMedicinesAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getHeartAttackMedicines().getMinimum(),
								(int) this.getHeartAttackMedicines().getMaximum()));
			} else {
				this.setHeartAttackMedicinesAdministeredEpicResponse(this.getUtilities()
						.randBetween(HeartAttack.getMintogenerateerrorval(), HeartAttack.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public HeartAttack(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HeartAttack.getMintogenerateerrorval(),
					HeartAttack.getMaxtogenerateerrorval()));

			this.setHeartAttackMedicines(valuerange);
			this.setHeartAttackMedicinesAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							HeartAttack.getMintogenerateerrorval(), HeartAttack.getMaxtogenerateerrorval())))) {
				this.setHeartAttackMedicinesAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getHeartAttackMedicines().getMinimum(),
								(int) this.getHeartAttackMedicines().getMaximum()));
			} else {
				this.setHeartAttackMedicinesAdministeredEpicResponse(this.getUtilities()
						.randBetween(HeartAttack.getMintogenerateerrorval(), HeartAttack.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return the heartAttackMedicines
	 */
	private ValueRange getHeartAttackMedicines() throws Exception {
		try {
			return this.HeartAttackMedicines;
		} finally {
		}
	}

	/**
	 * @return the heartAttackMedicinesAdministeredEpicResponse
	 */
	public int getHeartAttackmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.HeartAttackMedicinesAdministeredEpicResponse;
		} finally {
		}
	}

	/**
	 * @param heartAttackMedicines the heartAttackMedicines to set
	 */
	private void setHeartAttackMedicines(ValueRange heartAttackMedicines) throws Exception {
		try {
			this.HeartAttackMedicines = heartAttackMedicines;
		} finally {
		}
	}

	/**
	 * @param heartAttackMedicinesAdministeredEpicResponse the
	 *                                                     heartAttackMedicinesAdministeredEpicResponse
	 *                                                     to set
	 */
	private void setHeartAttackMedicinesAdministeredEpicResponse(int heartAttackMedicinesAdministeredEpicResponse)
			throws Exception {
		try {
			this.HeartAttackMedicinesAdministeredEpicResponse = heartAttackMedicinesAdministeredEpicResponse;
		} finally {
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(HeartAttackMedicines, HeartAttackMedicinesAdministeredEpicResponse);
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
		if (!(obj instanceof HeartAttack)) {
			return false;
		}
		HeartAttack other = (HeartAttack) obj;
		return Objects.equals(HeartAttackMedicines, other.HeartAttackMedicines)
				&& HeartAttackMedicinesAdministeredEpicResponse == other.HeartAttackMedicinesAdministeredEpicResponse;
	}

	@Override
	public String toString() {
		return "HeartAttack [HeartAttackMedicines=" + HeartAttackMedicines
				+ ", HeartAttackMedicinesAdministeredEpicResponse=" + HeartAttackMedicinesAdministeredEpicResponse
				+ "]";
	}
}
