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
public class NeuroStimulatoryDiseaseTBI extends NeuroStimulatoryDiseaseResponse {

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

	private int NeuroStimulatoryTBIMedsAdministeredEpicResponse;
	private ValueRange NSTBIMed;

	public NeuroStimulatoryDiseaseTBI(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(NeuroStimulatoryDiseaseTBI.getMintogenerateerrorval(),
					NeuroStimulatoryDiseaseTBI.getMaxtogenerateerrorval()));

			this.setNSTBIMed(ValueRange.of(0, 1));
			this.setNeuroStimulatoryTBIMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									NeuroStimulatoryDiseaseTBI.getMintogenerateerrorval(),
									NeuroStimulatoryDiseaseTBI.getMaxtogenerateerrorval())))) {
				this.setNeuroStimulatoryTBIMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween((int) this.getNSTBIMed().getMinimum(), (int) this.getNSTBIMed().getMaximum()));
			} else {
				this.setNeuroStimulatoryTBIMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(NeuroStimulatoryDiseaseTBI.getMintogenerateerrorval(),
								NeuroStimulatoryDiseaseTBI.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public NeuroStimulatoryDiseaseTBI(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(NeuroStimulatoryDiseaseTBI.getMintogenerateerrorval(),
					NeuroStimulatoryDiseaseTBI.getMaxtogenerateerrorval()));

			this.setNSTBIMed(valuerange);
			this.setNeuroStimulatoryTBIMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									NeuroStimulatoryDiseaseTBI.getMintogenerateerrorval(),
									NeuroStimulatoryDiseaseTBI.getMaxtogenerateerrorval())))) {
				this.setNeuroStimulatoryTBIMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween((int) this.getNSTBIMed().getMinimum(), (int) this.getNSTBIMed().getMaximum()));
			} else {
				this.setNeuroStimulatoryTBIMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(NeuroStimulatoryDiseaseTBI.getMintogenerateerrorval(),
								NeuroStimulatoryDiseaseTBI.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof NeuroStimulatoryDiseaseTBI)) {
			return false;
		}
		NeuroStimulatoryDiseaseTBI other = (NeuroStimulatoryDiseaseTBI) obj;
		return Objects.equals(this.NSTBIMed, other.NSTBIMed)
				&& this.NeuroStimulatoryTBIMedsAdministeredEpicResponse == other.NeuroStimulatoryTBIMedsAdministeredEpicResponse;
	}

	/**
	 * @return the neuroStimulatoryTBIMedsAdministeredEpicResponse
	 */
	public int getNeuroStimulatoryDiseaseTBImedicinesadministeredepicresponse() {
		try {
			return this.NeuroStimulatoryTBIMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.NeuroStimulatoryTBIMedsAdministeredEpicResponse;
	}

	/**
	 * @return the nSTBIMed
	 */
	private ValueRange getNSTBIMed() {
		try {
			return this.NSTBIMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.NSTBIMed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.NSTBIMed, this.NeuroStimulatoryTBIMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param neuroStimulatoryTBIMedsAdministeredEpicResponse the
	 *                                                        neuroStimulatoryTBIMedsAdministeredEpicResponse
	 *                                                        to set
	 */
	private void setNeuroStimulatoryTBIMedsAdministeredEpicResponse(
			int neuroStimulatoryTBIMedsAdministeredEpicResponse) {
		try {
			this.NeuroStimulatoryTBIMedsAdministeredEpicResponse = neuroStimulatoryTBIMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param nSTBIMed the nSTBIMed to set
	 */
	private void setNSTBIMed(ValueRange nSTBIMed) {
		try {
			this.NSTBIMed = nSTBIMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "NeuroStimulatoryDiseaseTBI [NSTBIMed=" + this.NSTBIMed
				+ ", NeuroStimulatoryTBIMedsAdministeredEpicResponse="
				+ this.NeuroStimulatoryTBIMedsAdministeredEpicResponse + "]";
	}

}
