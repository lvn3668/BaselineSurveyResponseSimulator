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
public class HIV extends InfectiousDiseaseResponse {

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

	private ValueRange HIVMedicines;
	private int HIVMedsAdministeredEpicResponse;

	public HIV(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(HIV.getMintogenerateerrorval(), HIV.getMaxtogenerateerrorval()));

			this.setHIVMedicines(ValueRange.of(0, 1));
			this.setHIVMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(HIV.getMintogenerateerrorval(), HIV.getMaxtogenerateerrorval())))) {
				this.setHIVMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getHIVMedicines().getMinimum(), (int) this.getHIVMedicines().getMaximum()));
			} else {
				this.setHIVMedsAdministeredEpicResponse(this.getUtilities().randBetween(HIV.getMintogenerateerrorval(),
						HIV.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public HIV(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(HIV.getMintogenerateerrorval(), HIV.getMaxtogenerateerrorval()));

			this.setHIVMedicines(valuerange);
			this.setHIVMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(HIV.getMintogenerateerrorval(), HIV.getMaxtogenerateerrorval())))) {
				this.setHIVMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getHIVMedicines().getMinimum(), (int) this.getHIVMedicines().getMaximum()));
			} else {
				this.setHIVMedsAdministeredEpicResponse(this.getUtilities().randBetween(HIV.getMintogenerateerrorval(),
						HIV.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the hIVMedicines
	 */
	private ValueRange getHIVMedicines() throws Exception {
		try {
			return this.HIVMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.HIVMedicines;
	}

	/**
	 * @return the hIVMedsAdministeredEpicResponse
	 */
	public int getHivmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.HIVMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.HIVMedsAdministeredEpicResponse;
	}

	/**
	 * @param hIVMedicines the hIVMedicines to set
	 */
	private void setHIVMedicines(ValueRange hIVMedicines) throws Exception {
		try {
			this.HIVMedicines = hIVMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param hIVMedsAdministeredEpicResponse the hIVMedsAdministeredEpicResponse to
	 *                                        set
	 */
	private void setHIVMedsAdministeredEpicResponse(int hIVMedsAdministeredEpicResponse) throws Exception {
		try {
			this.HIVMedsAdministeredEpicResponse = hIVMedsAdministeredEpicResponse;
		} finally {
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(HIVMedicines, HIVMedsAdministeredEpicResponse);
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
		if (!(obj instanceof HIV)) {
			return false;
		}
		HIV other = (HIV) obj;
		return Objects.equals(HIVMedicines, other.HIVMedicines)
				&& HIVMedsAdministeredEpicResponse == other.HIVMedsAdministeredEpicResponse;
	}

	@Override
	public String toString() {
		return "HIV [HIVMedicines=" + HIVMedicines + ", HIVMedsAdministeredEpicResponse="
				+ HIVMedsAdministeredEpicResponse + "]";
	}

}