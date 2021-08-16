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
public class GIPolyp extends GastroIntestinalDiseaseResponse {

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

	private ValueRange GIPolypMeds;
	private int GIPolypMedsAdministeredEpicResponse;

	public GIPolyp(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(GIPolyp.getMintogenerateerrorval(), GIPolyp.getMaxtogenerateerrorval()));

			this.setGIPolypMeds(ValueRange.of(0, 1));
			this.setGIPolypMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(GIPolyp.getMintogenerateerrorval(), GIPolyp.getMaxtogenerateerrorval())))) {
				this.setGIPolypMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getGIPolypMeds().getMinimum(), (int) this.getGIPolypMeds().getMaximum()));
			} else {
				this.setGIPolypMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(GIPolyp.getMintogenerateerrorval(), GIPolyp.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GIPolyp(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(GIPolyp.getMintogenerateerrorval(), GIPolyp.getMaxtogenerateerrorval()));

			this.setGIPolypMeds(valuerange);
			this.setGIPolypMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(GIPolyp.getMintogenerateerrorval(), GIPolyp.getMaxtogenerateerrorval())))) {
				this.setGIPolypMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getGIPolypMeds().getMinimum(), (int) this.getGIPolypMeds().getMaximum()));
			} else {
				this.setGIPolypMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(GIPolyp.getMintogenerateerrorval(), GIPolyp.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return the gIPolypMeds
	 */
	private ValueRange getGIPolypMeds() throws Exception {
		try {
			return this.GIPolypMeds;
		} finally {
		}
	}

	/**
	 * @return the gIPolypMedsAdministeredEpicResponse
	 */
	public int getGIPolypMedsAdministeredEpicResponse() throws Exception {
		try {
			return this.GIPolypMedsAdministeredEpicResponse;
		} finally {
		}
	}

	/**
	 * @param gIPolypMeds the gIPolypMeds to set
	 */
	private void setGIPolypMeds(ValueRange gIPolypMeds) throws Exception {
		try {
			this.GIPolypMeds = gIPolypMeds;
		} finally {
		}
	}

	/**
	 * @param gIPolypMedsAdministeredEpicResponse the
	 *                                            gIPolypMedsAdministeredEpicResponse
	 *                                            to set
	 */
	private void setGIPolypMedsAdministeredEpicResponse(int gIPolypMedsAdministeredEpicResponse) throws Exception {
		try {
			this.GIPolypMedsAdministeredEpicResponse = gIPolypMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(GIPolypMeds, GIPolypMedsAdministeredEpicResponse);
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
		if (!(obj instanceof GIPolyp)) {
			return false;
		}
		GIPolyp other = (GIPolyp) obj;
		return Objects.equals(GIPolypMeds, other.GIPolypMeds)
				&& GIPolypMedsAdministeredEpicResponse == other.GIPolypMedsAdministeredEpicResponse;
	}
}
