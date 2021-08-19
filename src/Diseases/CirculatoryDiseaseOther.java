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
public class CirculatoryDiseaseOther extends InfectiousDiseaseResponse {

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
	private static final int mintogenerateerrorval = 2;

	/**
	 * @return the maxtogenerateerrorval
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
	private static int getMaxtogenerateerrorval() {
		try {
			return maxtogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	private static int getMintogenerateerrorval() {
		try {
			return mintogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mintogenerateerrorval;
	}

	private ValueRange CircDOtherMed;
	private int CirculatoryDiseasesOtherMedsAdministeredEpicResponse;

	public CirculatoryDiseaseOther(Cohort cohort) throws Exception {
		super(cohort);
		try {
			// TODO Auto-generated constructor stub
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(CirculatoryDiseaseOther.getMintogenerateerrorval(),
					CirculatoryDiseaseOther.getMaxtogenerateerrorval()));

			this.setCircDOtherMed(ValueRange.of(0, 1));
			this.setCirculatoryDiseasesOtherMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(CirculatoryDiseaseOther.getMintogenerateerrorval(),
									CirculatoryDiseaseOther.getMaxtogenerateerrorval())))) {
				this.setCirculatoryDiseasesOtherMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getCircDOtherMed().getMinimum(), (int) this.getCircDOtherMed().getMaximum()));
			} else {
				this.setCirculatoryDiseasesOtherMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(CirculatoryDiseaseOther.getMintogenerateerrorval(),
								CirculatoryDiseaseOther.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	public CirculatoryDiseaseOther(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		this.setUtilities(new Utilities());
		this.setUniformdistribution(new UniformDistribution(CirculatoryDiseaseOther.getMintogenerateerrorval(),
				CirculatoryDiseaseOther.getMaxtogenerateerrorval()));

		this.setCircDOtherMed(valuerange);
		this.setCirculatoryDiseasesOtherMedsAdministeredEpicResponse(simulatedresponse);
		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(CirculatoryDiseaseOther.getMintogenerateerrorval(),
									CirculatoryDiseaseOther.getMaxtogenerateerrorval())))) {
				this.setCirculatoryDiseasesOtherMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getCircDOtherMed().getMinimum(), (int) this.getCircDOtherMed().getMaximum()));
			} else {
				this.setCirculatoryDiseasesOtherMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(CirculatoryDiseaseOther.getMintogenerateerrorval(),
								CirculatoryDiseaseOther.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof CirculatoryDiseaseOther && this instanceof CirculatoryDiseaseOther
				&& this.hashCode() == obj.hashCode()) {
			return true;
		}
		return false;
	}

	/**
	 * @return the circDOtherMed
	 */
	private ValueRange getCircDOtherMed() {
		try {
			return this.CircDOtherMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.CircDOtherMed;
	}

	/**
	 * @return the circulatoryDiseasesOtherMedsAdministeredEpicResponse
	 */
	public int getCirculatorydiseaseothermedicinesadministeredepicresponse() {
		try {
			return this.CirculatoryDiseasesOtherMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.CirculatoryDiseasesOtherMedsAdministeredEpicResponse;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), this.getCircDOtherMed(),
				this.getCirculatorydiseaseothermedicinesadministeredepicresponse());
	}

	/**
	 * @param circDOtherMed the circDOtherMed to set
	 */
	private void setCircDOtherMed(ValueRange circDOtherMed) throws Exception {
		try {
			this.CircDOtherMed = circDOtherMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param circulatoryDiseasesOtherMedsAdministeredEpicResponse the
	 *                                                             circulatoryDiseasesOtherMedsAdministeredEpicResponse
	 *                                                             to set
	 */
	private void setCirculatoryDiseasesOtherMedsAdministeredEpicResponse(
			int circulatoryDiseasesOtherMedsAdministeredEpicResponse) throws Exception {
		try {
			this.CirculatoryDiseasesOtherMedsAdministeredEpicResponse = circulatoryDiseasesOtherMedsAdministeredEpicResponse;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public String toString() {
		return "CirculatoryDiseaseOther [CircDOtherMed=" + this.CircDOtherMed
				+ ", CirculatoryDiseasesOtherMedsAdministeredEpicResponse="
				+ this.CirculatoryDiseasesOtherMedsAdministeredEpicResponse + "]";
	}

}
