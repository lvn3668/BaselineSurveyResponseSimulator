package Diseases;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERRIC
 *
 */
public class NeuroStimulatoryDiseaseOther extends NeuroStimulatoryDiseaseResponse {

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

	private int NeuroStimulatoryOtherMedsAdministeredEpicResponse;
	private ValueRange NSOtherMed;

	public NeuroStimulatoryDiseaseOther(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new RandomizingDistribution(NeuroStimulatoryDiseaseOther.getMintogenerateerrorval(),
							NeuroStimulatoryDiseaseOther.getMaxtogenerateerrorval()));

			this.setNSOtherMed(ValueRange.of(0, 1));
			this.setNeuroStimulatoryOtherMedsAdministeredEpicResponse(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public NeuroStimulatoryDiseaseOther(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new RandomizingDistribution(NeuroStimulatoryDiseaseOther.getMintogenerateerrorval(),
							NeuroStimulatoryDiseaseOther.getMaxtogenerateerrorval()));

			this.setNSOtherMed(valuerange);
			this.setNeuroStimulatoryOtherMedsAdministeredEpicResponse(simulatedresponse);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the neuroStimulatoryOtherMedsAdministeredEpicResponse
	 */
	public int getNeuroStimulatoryDiseaseOthermedicinesadministeredepicresponse() throws Exception {
		try {
			return this.NeuroStimulatoryOtherMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.NeuroStimulatoryOtherMedsAdministeredEpicResponse;
	}

	/**
	 * @return the nSOtherMed
	 */
	private ValueRange getNSOtherMed() {
		try {
			return this.NSOtherMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.NSOtherMed;
	}

	/**
	 * @param neuroStimulatoryOtherMedsAdministeredEpicResponse the
	 *                                                          neuroStimulatoryOtherMedsAdministeredEpicResponse
	 *                                                          to set
	 */
	private void setNeuroStimulatoryOtherMedsAdministeredEpicResponse(
			int neuroStimulatoryOtherMedsAdministeredEpicResponse) throws Exception {
		try {
			this.NeuroStimulatoryOtherMedsAdministeredEpicResponse = neuroStimulatoryOtherMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param nSOtherMed the nSOtherMed to set
	 */
	private void setNSOtherMed(ValueRange nSOtherMed) {
		try {
			this.NSOtherMed = nSOtherMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) {
		super.simulateResponses(veterancohort);
		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									NeuroStimulatoryDiseaseOther.getMintogenerateerrorval(),
									NeuroStimulatoryDiseaseOther.getMaxtogenerateerrorval())))) {
				this.setNeuroStimulatoryOtherMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween((int) this.getNSOtherMed().getMinimum(), (int) this.getNSOtherMed().getMaximum()));
			} else {
				this.setNeuroStimulatoryOtherMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(NeuroStimulatoryDiseaseOther.getMintogenerateerrorval(),
								NeuroStimulatoryDiseaseOther.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
