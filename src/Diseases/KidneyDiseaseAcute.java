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
public class KidneyDiseaseAcute extends NephrologyResponse {

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
	private ValueRange KDAcuteMeds;
	private int KDAcuteMedsAdministeredEpicResponse;

	public KidneyDiseaseAcute(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(KidneyDiseaseAcute.getMintogenerateerrorval(),
					KidneyDiseaseAcute.getMaxtogenerateerrorval()));

			this.setKDAcuteMeds(ValueRange.of(0, 1));
			this.setKDAcuteMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(KidneyDiseaseAcute.getMintogenerateerrorval(),
									KidneyDiseaseAcute.getMaxtogenerateerrorval())))) {
				this.setKDAcuteMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getKDAcuteMeds().getMinimum(), (int) this.getKDAcuteMeds().getMaximum()));
			} else {
				this.setKDAcuteMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						KidneyDiseaseAcute.getMintogenerateerrorval(), KidneyDiseaseAcute.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public KidneyDiseaseAcute(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(KidneyDiseaseAcute.getMintogenerateerrorval(),
					KidneyDiseaseAcute.getMaxtogenerateerrorval()));

			this.setKDAcuteMeds(valuerange);
			this.setKDAcuteMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(KidneyDiseaseAcute.getMintogenerateerrorval(),
									KidneyDiseaseAcute.getMaxtogenerateerrorval())))) {
				this.setKDAcuteMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getKDAcuteMeds().getMinimum(), (int) this.getKDAcuteMeds().getMaximum()));
			} else {
				this.setKDAcuteMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						KidneyDiseaseAcute.getMintogenerateerrorval(), KidneyDiseaseAcute.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return the kDAcuteMeds
	 */
	private ValueRange getKDAcuteMeds() throws Exception {
		try {
			return this.KDAcuteMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.KDAcuteMeds;
	}

	/**
	 * @return the kDAcuteMedsAdministeredEpicResponse
	 */
	public int getKDAcuteMedsAdministeredEpicResponse() throws Exception {
		try {
			return this.KDAcuteMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.KDAcuteMedsAdministeredEpicResponse;
	}

	/**
	 * @param kDAcuteMeds the kDAcuteMeds to set
	 */
	private void setKDAcuteMeds(ValueRange kDAcuteMeds) throws Exception {
		try {
			this.KDAcuteMeds = kDAcuteMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param kDAcuteMedsAdministeredEpicResponse the
	 *                                            kDAcuteMedsAdministeredEpicResponse
	 *                                            to set
	 */
	private void setKDAcuteMedsAdministeredEpicResponse(int kDAcuteMedsAdministeredEpicResponse) throws Exception {
		try {
			this.KDAcuteMedsAdministeredEpicResponse = kDAcuteMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(KDAcuteMeds, KDAcuteMedsAdministeredEpicResponse);
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
		if (!(obj instanceof KidneyDiseaseAcute)) {
			return false;
		}
		KidneyDiseaseAcute other = (KidneyDiseaseAcute) obj;
		return Objects.equals(KDAcuteMeds, other.KDAcuteMeds)
				&& KDAcuteMedsAdministeredEpicResponse == other.KDAcuteMedsAdministeredEpicResponse;
	}

	@Override
	public String toString() {
		return "KidneyDiseaseAcute [KDAcuteMeds=" + KDAcuteMeds + ", KDAcuteMedsAdministeredEpicResponse="
				+ KDAcuteMedsAdministeredEpicResponse + "]";
	}

}
