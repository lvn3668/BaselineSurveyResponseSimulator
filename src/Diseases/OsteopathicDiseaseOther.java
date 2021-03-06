package Diseases;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class OsteopathicDiseaseOther extends OsteopathicDiseaseResponse {

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

	private int OsteopathicDiseasesOtherMedsAdministeredEpicResponse = 2;

	private ValueRange OsteopathicDOtherMed;

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
	private RandomizingDistribution randomizingDistribution;

	private Utilities utilities;

	public OsteopathicDiseaseOther(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(new RandomizingDistribution(OsteopathicDiseaseOther.getMintogenerateerrorval(),
					OsteopathicDiseaseOther.getMaxtogenerateerrorval()));

			this.setOsteopathicDOtherMed(ValueRange.of(0, 1));
			this.setOsteopathicDiseasesOtherMedsAdministeredEpicResponse(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public OsteopathicDiseaseOther(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(new RandomizingDistribution(OsteopathicDiseaseOther.getMintogenerateerrorval(),
					OsteopathicDiseaseOther.getMaxtogenerateerrorval()));

			this.setOsteopathicDOtherMed(valuerange);
			this.setOsteopathicDiseasesOtherMedsAdministeredEpicResponse(simulatedresponse);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the osteopathicDiseasesOtherMedsAdministeredEpicResponse
	 */
	public int getOsteopathicdiseaseothermedicinesadministeredepicresponse() {
		return this.OsteopathicDiseasesOtherMedsAdministeredEpicResponse;
	}

	/**
	 * @return the osteopathicDOtherMed
	 */
	protected ValueRange getOsteopathicDOtherMed() {
		try {
			return this.OsteopathicDOtherMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.OsteopathicDOtherMed;
	}

	/**
	 *
	 * /**
	 *
	 * @return the randomizingDistribution
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
	public RandomizingDistribution getUniformDistribution() {
		return this.randomizingDistribution;
	}

	/**
	 * @return the utilities
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
	public Utilities getUtilities() {
		return this.utilities;
	}

	/**
	 * @param osteopathicDiseasesOtherMedsAdministeredEpicResponse the
	 *                                                             osteopathicDiseasesOtherMedsAdministeredEpicResponse
	 *                                                             to set
	 */
	protected void setOsteopathicDiseasesOtherMedsAdministeredEpicResponse(
			int osteopathicDiseasesOtherMedsAdministeredEpicResponse) {
		this.OsteopathicDiseasesOtherMedsAdministeredEpicResponse = osteopathicDiseasesOtherMedsAdministeredEpicResponse;
	}

	/**
	 * @param osteopathicDOtherMed the osteopathicDOtherMed to set
	 */
	protected void setOsteopathicDOtherMed(ValueRange osteopathicDOtherMed) {
		try {
			this.OsteopathicDOtherMed = osteopathicDOtherMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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
	 * @param randomizingDistribution the randomizingDistribution to set
	 */
	/**
	 * @param randomizingDistribution
	 */
	/**
	 * @param randomizingDistribution
	 */
	/**
	 * @param randomizingDistribution
	 */
	/**
	 * @param randomizingDistribution
	 */
	public void setUniformDistribution(RandomizingDistribution randomizingDistribution) {
		this.randomizingDistribution = randomizingDistribution;
	}

	/**
	 * @param utilities the utilities to set
	 */
	/**
	 * @param utilities
	 */
	/**
	 * @param utilities
	 */
	/**
	 * @param utilities
	 */
	/**
	 * @param utilities
	 */
	public void setUtilities(Utilities utilities) {
		this.utilities = utilities;
	}

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) {

		try {
			super.simulateResponses(veterancohort);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformDistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(OsteopathicDiseaseOther.getMintogenerateerrorval(),
									OsteopathicDiseaseOther.getMaxtogenerateerrorval())))) {
				this.setOsteopathicDiseasesOtherMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getOsteopathicDOtherMed().getMinimum(),
								(int) this.getOsteopathicDOtherMed().getMaximum()));
			} else {
				this.setOsteopathicDiseasesOtherMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(OsteopathicDiseaseOther.getMintogenerateerrorval(),
								OsteopathicDiseaseOther.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "OsteopathicDiseaseOther [OsteopathicDOtherMed=" + this.OsteopathicDOtherMed
				+ ", OsteopathicDiseasesOtherMedsAdministeredEpicResponse="
				+ this.OsteopathicDiseasesOtherMedsAdministeredEpicResponse + "]";
	}

}
