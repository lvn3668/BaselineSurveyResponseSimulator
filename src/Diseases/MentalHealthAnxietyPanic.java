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
public class MentalHealthAnxietyPanic extends MentalHealthResponse {

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

	private ValueRange MHAnxPancMedicines;
	private int MHAnxPanicMedsAdministeredEpicResponse;

	public MentalHealthAnxietyPanic(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthAnxietyPanic.getMintogenerateerrorval(),
					MentalHealthAnxietyPanic.getMaxtogenerateerrorval()));

			this.setMHAnxietyPanicMeds(ValueRange.of(0, 1));
			this.setMHAnxPanicMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(MentalHealthAnxietyPanic.getMintogenerateerrorval(),
									MentalHealthAnxietyPanic.getMaxtogenerateerrorval())))) {
				this.setMHAnxPanicMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getMHAnxPancMedicines().getMinimum(),
								(int) this.getMHAnxPancMedicines().getMaximum()));
			} else {
				this.setMHAnxPanicMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(MentalHealthAnxietyPanic.getMintogenerateerrorval(),
								MentalHealthAnxietyPanic.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public MentalHealthAnxietyPanic(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		// TODO Auto-generated constructor stub
		super(cohort);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(MentalHealthAnxietyPanic.getMintogenerateerrorval(),
					MentalHealthAnxietyPanic.getMaxtogenerateerrorval()));

			this.setMHAnxietyPanicMeds(valuerange);
			this.setMHAnxPanicMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(MentalHealthAnxietyPanic.getMintogenerateerrorval(),
									MentalHealthAnxietyPanic.getMaxtogenerateerrorval())))) {
				this.setMHAnxPanicMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getMHAnxPancMedicines().getMinimum(),
								(int) this.getMHAnxPancMedicines().getMaximum()));
			} else {
				this.setMHAnxPanicMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(MentalHealthAnxietyPanic.getMintogenerateerrorval(),
								MentalHealthAnxietyPanic.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @return the mHAnxPancMedicines
	 */
	private ValueRange getMHAnxPancMedicines() throws Exception {
		try {
			return this.MHAnxPancMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHAnxPancMedicines;
	}

	/**
	 * @return the mHAnxPanicMedsAdministeredEpicResponse
	 */
	public int getMentalhealthAnxietyPanicmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.MHAnxPanicMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MHAnxPanicMedsAdministeredEpicResponse;
	}

	private void setMHAnxietyPanicMeds(ValueRange valuerange) {
		try {
			// TODO Auto-generated method stub
			this.MHAnxPancMedicines = valuerange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param mHAnxPanicMedsAdministeredEpicResponse the
	 *                                               mHAnxPanicMedsAdministeredEpicResponse
	 *                                               to set
	 */
	private void setMHAnxPanicMedsAdministeredEpicResponse(int mHAnxPanicMedsAdministeredEpicResponse)
			throws Exception {
		try {
			this.MHAnxPanicMedsAdministeredEpicResponse = mHAnxPanicMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public String toString() {
		return "MentalHealthAnxietyPanic [MHAnxPancMedicines=" + this.MHAnxPancMedicines
				+ ", MHAnxPanicMedsAdministeredEpicResponse=" + this.MHAnxPanicMedsAdministeredEpicResponse + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(MHAnxPancMedicines, MHAnxPanicMedsAdministeredEpicResponse);
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
		if (!(obj instanceof MentalHealthAnxietyPanic)) {
			return false;
		}
		MentalHealthAnxietyPanic other = (MentalHealthAnxietyPanic) obj;
		return Objects.equals(MHAnxPancMedicines, other.MHAnxPancMedicines)
				&& MHAnxPanicMedsAdministeredEpicResponse == other.MHAnxPanicMedsAdministeredEpicResponse;
	}

}
