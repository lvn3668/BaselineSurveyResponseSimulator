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
public class TransientIschemicAttack extends MiscDiseaseResponse {

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

	private ValueRange TIAMedicines;
	private int TIAMedsAdministeredEpicResponse;

	public TransientIschemicAttack(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(TransientIschemicAttack.getMintogenerateerrorval(),
					TransientIschemicAttack.getMaxtogenerateerrorval()));

			this.setTIAMedicines(ValueRange.of(0, 1));
			this.setTIAMedsAdministeredEpicResponse(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public TransientIschemicAttack(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(TransientIschemicAttack.getMintogenerateerrorval(),
					TransientIschemicAttack.getMaxtogenerateerrorval()));

			this.setTIAMedicines(valuerange);
			this.setTIAMedsAdministeredEpicResponse(simulatedresponse);
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
		if (!(obj instanceof TransientIschemicAttack)) {
			return false;
		}
		TransientIschemicAttack other = (TransientIschemicAttack) obj;
		return Objects.equals(this.TIAMedicines, other.TIAMedicines)
				&& this.TIAMedsAdministeredEpicResponse == other.TIAMedsAdministeredEpicResponse;
	}

	/**
	 * @return the tIAMedicines
	 */
	private ValueRange getTIAMedicines() {
		try {
			return this.TIAMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.TIAMedicines;
	}

	/**
	 * @return the tIAMedsAdministeredEpicResponse
	 */
	public int getTiamedicinesadministeredepicresponse() {
		try {
			return this.TIAMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.TIAMedsAdministeredEpicResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.TIAMedicines, this.TIAMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param tIAMedicines the tIAMedicines to set
	 */
	private void setTIAMedicines(ValueRange tIAMedicines) {
		try {
			this.TIAMedicines = tIAMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param tIAMedsAdministeredEpicResponse the tIAMedsAdministeredEpicResponse to
	 *                                        set
	 */
	private void setTIAMedsAdministeredEpicResponse(int tIAMedsAdministeredEpicResponse) {
		try {
			this.TIAMedsAdministeredEpicResponse = tIAMedsAdministeredEpicResponse;
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
				(!this.getUniformdistribution().generatenoiseinresponsevariables(
						this.getUtilities().randBetween(TransientIschemicAttack.getMintogenerateerrorval(),
								TransientIschemicAttack.getMaxtogenerateerrorval())))) {
			this.setTIAMedsAdministeredEpicResponse(this.getUtilities()
					.randBetween((int) this.getTIAMedicines().getMinimum(), (int) this.getTIAMedicines().getMaximum()));
		} else {
			this.setTIAMedsAdministeredEpicResponse(
					this.getUtilities().randBetween(TransientIschemicAttack.getMintogenerateerrorval(),
							TransientIschemicAttack.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "TransientIschemicAttack [TIAMedicines=" + this.TIAMedicines + ", TIAMedsAdministeredEpicResponse="
				+ this.TIAMedsAdministeredEpicResponse + "]";
	}

}
