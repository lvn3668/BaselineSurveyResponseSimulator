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
public class KidneyNoDialysis extends NephrologyResponse {

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

	// Kidney Disease other than dialysis and non-acute
	private ValueRange KdNoDialysisMeds;
	private int KdNoDialysisMedsAdministeredEpicResponse;

	public KidneyNoDialysis(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(KidneyNoDialysis.getMintogenerateerrorval(),
					KidneyNoDialysis.getMaxtogenerateerrorval()));

			this.setKdNoDialysisMeds(ValueRange.of(0, 1));
			this.setKdNoDialysisMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(KidneyNoDialysis.getMintogenerateerrorval(),
									KidneyNoDialysis.getMaxtogenerateerrorval())))) {
				this.setKdNoDialysisMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getKdNoDialysisMeds().getMinimum(), (int) this.getKdNoDialysisMeds().getMaximum()));
			} else {
				this.setKdNoDialysisMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						KidneyNoDialysis.getMintogenerateerrorval(), KidneyNoDialysis.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public KidneyNoDialysis(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(KidneyNoDialysis.getMintogenerateerrorval(),
					KidneyNoDialysis.getMaxtogenerateerrorval()));

			this.setKdNoDialysisMeds(valuerange);
			this.setKdNoDialysisMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(KidneyNoDialysis.getMintogenerateerrorval(),
									KidneyNoDialysis.getMaxtogenerateerrorval())))) {
				this.setKdNoDialysisMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getKdNoDialysisMeds().getMinimum(), (int) this.getKdNoDialysisMeds().getMaximum()));
			} else {
				this.setKdNoDialysisMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						KidneyNoDialysis.getMintogenerateerrorval(), KidneyNoDialysis.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof KidneyNoDialysis)) {
			return false;
		}
		KidneyNoDialysis other = (KidneyNoDialysis) obj;
		return Objects.equals(this.KdNoDialysisMeds, other.KdNoDialysisMeds)
				&& this.KdNoDialysisMedsAdministeredEpicResponse == other.KdNoDialysisMedsAdministeredEpicResponse;
	}

	/**
	 * @return the kdNoDialysisMeds
	 */
	private ValueRange getKdNoDialysisMeds() throws Exception {
		try {
			return this.KdNoDialysisMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.KdNoDialysisMeds;
	}

	/**
	 * @return the kdNoDialysisMedsAdministeredEpicResponse
	 */
	public int getKidneyNoDialysismedicinesadministeredepicresponse() throws Exception {
		try {
			return this.KdNoDialysisMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.KdNoDialysisMedsAdministeredEpicResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.KdNoDialysisMeds, this.KdNoDialysisMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param kdNoDialysisMeds the kdNoDialysisMeds to set
	 */
	private void setKdNoDialysisMeds(ValueRange kdNoDialysisMeds) throws Exception {
		try {
			this.KdNoDialysisMeds = kdNoDialysisMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param kdNoDialysisMedsAdministeredEpicResponse the
	 *                                                 kdNoDialysisMedsAdministeredEpicResponse
	 *                                                 to set
	 */
	private void setKdNoDialysisMedsAdministeredEpicResponse(int kdNoDialysisMedsAdministeredEpicResponse)
			throws Exception {
		try {
			this.KdNoDialysisMedsAdministeredEpicResponse = kdNoDialysisMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "KidneyNoDialysis [KdNoDialysisMeds=" + this.KdNoDialysisMeds
				+ ", KdNoDialysisMedsAdministeredEpicResponse=" + this.KdNoDialysisMedsAdministeredEpicResponse + "]";
	}

}
