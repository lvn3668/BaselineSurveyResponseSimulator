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
public class GIObstruction extends GastroIntestinalDiseaseResponse {

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

	private ValueRange GIObstructionMeds;
	private int GIObstructionMedsAdministeredEpicResponse;

	public GIObstruction(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GIObstruction.getMintogenerateerrorval(),
					GIObstruction.getMaxtogenerateerrorval()));

			this.setGIObstructionMeds(ValueRange.of(0, 1));
			this.setGIObstructionMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							GIObstruction.getMintogenerateerrorval(), GIObstruction.getMaxtogenerateerrorval())))) {
				this.setGIObstructionMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getGIObstructionMeds().getMinimum(),
								(int) this.getGIObstructionMeds().getMaximum()));
			} else {
				this.setGIObstructionMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						GIObstruction.getMintogenerateerrorval(), GIObstruction.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GIObstruction(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GIObstruction.getMintogenerateerrorval(),
					GIObstruction.getMaxtogenerateerrorval()));

			this.setGIObstructionMeds(valuerange);
			this.setGIObstructionMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							GIObstruction.getMintogenerateerrorval(), GIObstruction.getMaxtogenerateerrorval())))) {
				this.setGIObstructionMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getGIObstructionMeds().getMinimum(),
								(int) this.getGIObstructionMeds().getMaximum()));
			} else {
				this.setGIObstructionMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						GIObstruction.getMintogenerateerrorval(), GIObstruction.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return the gIObstructionMeds
	 */
	private ValueRange getGIObstructionMeds() throws Exception {
		try {
			return this.GIObstructionMeds;
		} finally {
		}
	}

	/**
	 * @return the gIObstructionMedsAdministeredEpicResponse
	 */
	public int getGIObstructionmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.GIObstructionMedsAdministeredEpicResponse;
		} finally {
		}
	}

	/**
	 * @param gIObstructionMeds the gIObstructionMeds to set
	 */
	private void setGIObstructionMeds(ValueRange gIObstructionMeds) throws Exception {
		try {
			this.GIObstructionMeds = gIObstructionMeds;
		} finally {
		}
	}

	/**
	 * @param gIObstructionMedsAdministeredEpicResponse the
	 *                                                  gIObstructionMedsAdministeredEpicResponse
	 *                                                  to set
	 */
	private void setGIObstructionMedsAdministeredEpicResponse(int gIObstructionMedsAdministeredEpicResponse)
			throws Exception {
		try {
			this.GIObstructionMedsAdministeredEpicResponse = gIObstructionMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(GIObstructionMeds, GIObstructionMedsAdministeredEpicResponse);
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
		if (!(obj instanceof GIObstruction)) {
			return false;
		}
		GIObstruction other = (GIObstruction) obj;
		return Objects.equals(GIObstructionMeds, other.GIObstructionMeds)
				&& GIObstructionMedsAdministeredEpicResponse == other.GIObstructionMedsAdministeredEpicResponse;
	}
}
