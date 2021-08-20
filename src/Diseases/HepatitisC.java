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
public class HepatitisC extends InfectiousDiseaseResponse {

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

	private ValueRange HepCMedicines;
	private int HepCMedsAdministeredEpicResponse;

	public HepatitisC(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HepatitisC.getMintogenerateerrorval(),
					HepatitisC.getMaxtogenerateerrorval()));

			this.setHepCMedicines(ValueRange.of(0, 1));
			this.setHepCMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							HepatitisC.getMintogenerateerrorval(), HepatitisC.getMaxtogenerateerrorval())))) {
				this.setHepCMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getHepCMedicines().getMinimum(), (int) this.getHepCMedicines().getMaximum()));
			} else {
				this.setHepCMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(HepatitisC.getMintogenerateerrorval(), HepatitisC.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public HepatitisC(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HepatitisC.getMintogenerateerrorval(),
					HepatitisC.getMaxtogenerateerrorval()));

			this.setHepCMedicines(valuerange);
			this.setHepCMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							HepatitisC.getMintogenerateerrorval(), HepatitisC.getMaxtogenerateerrorval())))) {
				this.setHepCMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getHepCMedicines().getMinimum(), (int) this.getHepCMedicines().getMaximum()));
			} else {
				this.setHepCMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(HepatitisC.getMintogenerateerrorval(), HepatitisC.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof HepatitisC)) {
			return false;
		}
		HepatitisC other = (HepatitisC) obj;
		return Objects.equals(this.HepCMedicines, other.HepCMedicines)
				&& this.HepCMedsAdministeredEpicResponse == other.HepCMedsAdministeredEpicResponse;
	}

	/**
	 * @return the hepCMedsAdministeredEpicResponse
	 */
	public int getHepatitisCmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.HepCMedsAdministeredEpicResponse;
		} finally {
		}
	}

	/**
	 * @return the hepCMedicines
	 */
	private ValueRange getHepCMedicines() throws Exception {
		try {
			return this.HepCMedicines;
		} finally {
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.HepCMedicines, this.HepCMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param hepCMedicines the hepCMedicines to set
	 */
	private void setHepCMedicines(ValueRange hepCMedicines) throws Exception {
		try {
			this.HepCMedicines = hepCMedicines;
		} finally {
		}
	}

	/**
	 * @param hepCMedsAdministeredEpicResponse the hepCMedsAdministeredEpicResponse
	 *                                         to set
	 */
	private void setHepCMedsAdministeredEpicResponse(int hepCMedsAdministeredEpicResponse) throws Exception {
		try {
			this.HepCMedsAdministeredEpicResponse = hepCMedsAdministeredEpicResponse;
		} finally {
		}
	}

	@Override
	public String toString() {
		return "HepatitisC [HepCMedicines=" + this.HepCMedicines + ", HepCMedsAdministeredEpicResponse="
				+ this.HepCMedsAdministeredEpicResponse + "]";
	}

}
