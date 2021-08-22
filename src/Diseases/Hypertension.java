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
public class Hypertension extends MiscDiseaseResponse {

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

	private ValueRange HTNMeds;
	private int HTNMedsAdministeredEpicResponse;

	public Hypertension(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(Hypertension.getMintogenerateerrorval(),
					Hypertension.getMaxtogenerateerrorval()));

			this.setHTNMeds(ValueRange.of(0, 1));
			this.setHTNMedsAdministeredEpicResponse(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Hypertension(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(Hypertension.getMintogenerateerrorval(),
					Hypertension.getMaxtogenerateerrorval()));

			this.setHTNMeds(valuerange);
			this.setHTNMedsAdministeredEpicResponse(simulatedresponse);
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
		if (!(obj instanceof Hypertension)) {
			return false;
		}
		Hypertension other = (Hypertension) obj;
		return Objects.equals(this.HTNMeds, other.HTNMeds)
				&& this.HTNMedsAdministeredEpicResponse == other.HTNMedsAdministeredEpicResponse;
	}

	/**
	 * @return the hTNMeds
	 */
	private ValueRange getHTNMeds() throws Exception {
		try {
			return this.HTNMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.HTNMeds;
	}

	/**
	 * @return the hTNMedsAdministeredEpicResponse
	 */
	public int getHypertensionmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.HTNMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.HTNMedsAdministeredEpicResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.HTNMeds, this.HTNMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param hTNMeds the hTNMeds to set
	 */
	private void setHTNMeds(ValueRange hTNMeds) throws Exception {
		try {
			this.HTNMeds = hTNMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param hTNMedsAdministeredEpicResponse the hTNMedsAdministeredEpicResponse to
	 *                                        set
	 */
	private void setHTNMedsAdministeredEpicResponse(int hTNMedsAdministeredEpicResponse) throws Exception {
		try {
			this.HTNMedsAdministeredEpicResponse = hTNMedsAdministeredEpicResponse;
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
		// add getters for uniform dist and random epic vars
				(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
						Hypertension.getMintogenerateerrorval(), Hypertension.getMaxtogenerateerrorval())))) {
			this.setHTNMedsAdministeredEpicResponse(this.getUtilities()
					.randBetween((int) this.getHTNMeds().getMinimum(), (int) this.getHTNMeds().getMaximum()));
		} else {
			this.setHTNMedsAdministeredEpicResponse(this.getUtilities()
					.randBetween(Hypertension.getMintogenerateerrorval(), Hypertension.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "Hypertension [HTNMeds=" + this.HTNMeds + ", HTNMedsAdministeredEpicResponse="
				+ this.HTNMedsAdministeredEpicResponse + "]";
	}

}
