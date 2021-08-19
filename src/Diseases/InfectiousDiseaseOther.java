package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class InfectiousDiseaseOther extends InfectiousDiseaseResponse {

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
	protected static int getMaxtogenerateerrorval() {
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
	protected static int getMintogenerateerrorval() {
		return mintogenerateerrorval;
	}

	private ValueRange IDOtherMed;
	private int InfectiousDiseasesOtherMedsAdministeredEpicResponse;

	public InfectiousDiseaseOther(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(InfectiousDiseaseOther.getMintogenerateerrorval(),
					InfectiousDiseaseOther.getMaxtogenerateerrorval()));

			this.setIDOtherMed(ValueRange.of(0, 1));
			this.setInfectiousDiseasesOtherMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(InfectiousDiseaseOther.getMintogenerateerrorval(),
									InfectiousDiseaseOther.getMaxtogenerateerrorval())))) {
				this.setInfectiousDiseasesOtherMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween((int) this.getIDOtherMed().getMinimum(), (int) this.getIDOtherMed().getMaximum()));
			} else {
				this.setInfectiousDiseasesOtherMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(InfectiousDiseaseOther.getMintogenerateerrorval(),
								InfectiousDiseaseOther.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public InfectiousDiseaseOther(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(InfectiousDiseaseOther.getMintogenerateerrorval(),
					InfectiousDiseaseOther.getMaxtogenerateerrorval()));

			this.setIDOtherMed(valuerange);
			this.setInfectiousDiseasesOtherMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(InfectiousDiseaseOther.getMintogenerateerrorval(),
									InfectiousDiseaseOther.getMaxtogenerateerrorval())))) {
				this.setInfectiousDiseasesOtherMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween((int) this.getIDOtherMed().getMinimum(), (int) this.getIDOtherMed().getMaximum()));
			} else {
				this.setInfectiousDiseasesOtherMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(InfectiousDiseaseOther.getMintogenerateerrorval(),
								InfectiousDiseaseOther.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof InfectiousDiseaseOther)) {
			return false;
		}
		InfectiousDiseaseOther other = (InfectiousDiseaseOther) obj;
		return Objects.equals(this.IDOtherMed, other.IDOtherMed)
				&& this.InfectiousDiseasesOtherMedsAdministeredEpicResponse == other.InfectiousDiseasesOtherMedsAdministeredEpicResponse;
	}

	/**
	 * @return the iDOtherMed
	 */
	protected ValueRange getIDOtherMed() throws Exception {
		try {
			return this.IDOtherMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.IDOtherMed;
	}

	/**
	 * @return the infectiousDiseasesOtherMedsAdministeredEpicResponse
	 */
	public int getIDOthermedicinesadministeredepicresponse() throws Exception {
		try {
			return this.InfectiousDiseasesOtherMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.InfectiousDiseasesOtherMedsAdministeredEpicResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.IDOtherMed, this.InfectiousDiseasesOtherMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param iDOtherMed the iDOtherMed to set
	 */
	protected void setIDOtherMed(ValueRange iDOtherMed) throws Exception {
		try {
			this.IDOtherMed = iDOtherMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param infectiousDiseasesOtherMedsAdministeredEpicResponse the
	 *                                                            infectiousDiseasesOtherMedsAdministeredEpicResponse
	 *                                                            to set
	 */
	protected void setInfectiousDiseasesOtherMedsAdministeredEpicResponse(
			int infectiousDiseasesOtherMedsAdministeredEpicResponse) throws Exception {
		try {
			this.InfectiousDiseasesOtherMedsAdministeredEpicResponse = infectiousDiseasesOtherMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "InfectiousDiseaseOther [IDOtherMed=" + this.IDOtherMed
				+ ", InfectiousDiseasesOtherMedsAdministeredEpicResponse="
				+ this.InfectiousDiseasesOtherMedsAdministeredEpicResponse + "]";
	}

}
