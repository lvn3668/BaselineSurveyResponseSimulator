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
public class OsteopathicDiseaseSkin extends OsteopathicDiseaseResponse {

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

	private int OsteopathicDiseasesSkinMedsAdministeredEpicResponse = 2;
	private ValueRange OsteopathicDSkinMed;

	public OsteopathicDiseaseSkin(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(OsteopathicDiseaseSkin.getMintogenerateerrorval(),
					OsteopathicDiseaseSkin.getMaxtogenerateerrorval()));

			this.setOsteopathicDSkinMed(ValueRange.of(0, 1));
			this.setOsteopathicDiseasesSkinMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(OsteopathicDiseaseSkin.getMintogenerateerrorval(),
									OsteopathicDiseaseSkin.getMaxtogenerateerrorval())))) {
				this.setOsteopathicDiseasesSkinMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getOsteopathicDSkinMed().getMinimum(),
								(int) this.getOsteopathicDSkinMed().getMaximum()));
			} else {
				this.setOsteopathicDiseasesSkinMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(OsteopathicDiseaseSkin.getMintogenerateerrorval(),
								OsteopathicDiseaseSkin.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public OsteopathicDiseaseSkin(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(OsteopathicDiseaseSkin.getMintogenerateerrorval(),
					OsteopathicDiseaseSkin.getMaxtogenerateerrorval()));

			this.setOsteopathicDSkinMed(valuerange);
			this.setOsteopathicDiseasesSkinMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(OsteopathicDiseaseSkin.getMintogenerateerrorval(),
									OsteopathicDiseaseSkin.getMaxtogenerateerrorval())))) {
				this.setOsteopathicDiseasesSkinMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getOsteopathicDSkinMed().getMinimum(),
								(int) this.getOsteopathicDSkinMed().getMaximum()));
			} else {
				this.setOsteopathicDiseasesSkinMedsAdministeredEpicResponse(
						this.getUtilities().randBetween(OsteopathicDiseaseSkin.getMintogenerateerrorval(),
								OsteopathicDiseaseSkin.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof OsteopathicDiseaseSkin)) {
			return false;
		}
		OsteopathicDiseaseSkin other = (OsteopathicDiseaseSkin) obj;
		return Objects.equals(this.OsteopathicDSkinMed, other.OsteopathicDSkinMed)
				&& this.OsteopathicDiseasesSkinMedsAdministeredEpicResponse == other.OsteopathicDiseasesSkinMedsAdministeredEpicResponse;
	}

	/**
	 * @return the osteopathicDiseasesSkinMedsAdministeredEpicResponse
	 */
	public int getOsteopathicdiseaseskinmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.OsteopathicDiseasesSkinMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.OsteopathicDiseasesSkinMedsAdministeredEpicResponse;
	}

	/**
	 * @return the osteopathicDSkinMed
	 */
	private ValueRange getOsteopathicDSkinMed() {
		try {
			return this.OsteopathicDSkinMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.OsteopathicDSkinMed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.OsteopathicDSkinMed, this.OsteopathicDiseasesSkinMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param osteopathicDiseasesSkinMedsAdministeredEpicResponse the
	 *                                                            osteopathicDiseasesSkinMedsAdministeredEpicResponse
	 *                                                            to set
	 */
	private void setOsteopathicDiseasesSkinMedsAdministeredEpicResponse(
			int osteopathicDiseasesSkinMedsAdministeredEpicResponse) throws Exception {
		try {
			this.OsteopathicDiseasesSkinMedsAdministeredEpicResponse = osteopathicDiseasesSkinMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param osteopathicDSkinMed the osteopathicDSkinMed to set
	 */
	private void setOsteopathicDSkinMed(ValueRange osteopathicDSkinMed) throws Exception {
		try {
			this.OsteopathicDSkinMed = osteopathicDSkinMed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "OsteopathicDiseaseSkin [OsteopathicDiseasesSkinMedsAdministeredEpicResponse="
				+ this.OsteopathicDiseasesSkinMedsAdministeredEpicResponse + ", OsteopathicDSkinMed="
				+ this.OsteopathicDSkinMed + "]";
	}

}
