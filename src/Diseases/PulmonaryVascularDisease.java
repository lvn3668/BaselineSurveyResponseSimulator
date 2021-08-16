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
public class PulmonaryVascularDisease extends MiscDiseaseResponse {

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

	private ValueRange PulmonaryVascularDiseaseMedicines = ValueRange.of(0, 1);
	private int PulmonaryVascularDiseaseMedsEpicResponse = 2;

	public PulmonaryVascularDisease(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(PulmonaryVascularDisease.getMintogenerateerrorval(),
					PulmonaryVascularDisease.getMaxtogenerateerrorval()));

			this.setPulmonaryVascularDiseaseMedicines(ValueRange.of(0, 1));
			this.setPulmonaryVascularDiseaseMedsEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(PulmonaryVascularDisease.getMintogenerateerrorval(),
									PulmonaryVascularDisease.getMaxtogenerateerrorval())))) {
				this.setPulmonaryVascularDiseaseMedsEpicResponse(
						this.getUtilities().randBetween((int) this.getPulmonaryVascularDiseaseMedicines().getMinimum(),
								(int) this.getPulmonaryVascularDiseaseMedicines().getMaximum()));
			} else {
				this.setPulmonaryVascularDiseaseMedsEpicResponse(
						this.getUtilities().randBetween(PulmonaryVascularDisease.getMintogenerateerrorval(),
								PulmonaryVascularDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public PulmonaryVascularDisease(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(PulmonaryVascularDisease.getMintogenerateerrorval(),
					PulmonaryVascularDisease.getMaxtogenerateerrorval()));

			this.setPulmonaryVascularDiseaseMedicines(valuerange);
			this.setPulmonaryVascularDiseaseMedsEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(PulmonaryVascularDisease.getMintogenerateerrorval(),
									PulmonaryVascularDisease.getMaxtogenerateerrorval())))) {
				this.setPulmonaryVascularDiseaseMedsEpicResponse(
						this.getUtilities().randBetween((int) this.getPulmonaryVascularDiseaseMedicines().getMinimum(),
								(int) this.getPulmonaryVascularDiseaseMedicines().getMaximum()));
			} else {
				this.setPulmonaryVascularDiseaseMedsEpicResponse(
						this.getUtilities().randBetween(PulmonaryVascularDisease.getMintogenerateerrorval(),
								PulmonaryVascularDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the pulmonaryVascularDiseaseMedicines
	 */
	private ValueRange getPulmonaryVascularDiseaseMedicines() {
		try {
			return this.PulmonaryVascularDiseaseMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.PulmonaryVascularDiseaseMedicines;
	}

	/**
	 * @return the pulmonaryVascularDiseaseMedsEpicResponse
	 */
	public int getPulmonaryVascularDiseaseMedsEpicResponse() {
		try {
			return this.PulmonaryVascularDiseaseMedsEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.PulmonaryVascularDiseaseMedsEpicResponse;
	}

	/**
	 * @param pulmonaryVascularDiseaseMedicines the
	 *                                          pulmonaryVascularDiseaseMedicines to
	 *                                          set
	 */
	private void setPulmonaryVascularDiseaseMedicines(ValueRange pulmonaryVascularDiseaseMedicines) {
		try {
			this.PulmonaryVascularDiseaseMedicines = pulmonaryVascularDiseaseMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param pulmonaryVascularDiseaseMedsEpicResponse the
	 *                                                 pulmonaryVascularDiseaseMedsEpicResponse
	 *                                                 to set
	 */
	private void setPulmonaryVascularDiseaseMedsEpicResponse(int pulmonaryVascularDiseaseMedsEpicResponse) {
		try {
			this.PulmonaryVascularDiseaseMedsEpicResponse = pulmonaryVascularDiseaseMedsEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "PulmonaryVascularDisease [PulmonaryVascularDiseaseMedicines=" + this.PulmonaryVascularDiseaseMedicines
				+ ", PulmonaryVascularDiseaseMedsEpicResponse=" + this.PulmonaryVascularDiseaseMedsEpicResponse + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(PulmonaryVascularDiseaseMedicines, PulmonaryVascularDiseaseMedsEpicResponse);
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
		if (!(obj instanceof PulmonaryVascularDisease)) {
			return false;
		}
		PulmonaryVascularDisease other = (PulmonaryVascularDisease) obj;
		return Objects.equals(PulmonaryVascularDiseaseMedicines, other.PulmonaryVascularDiseaseMedicines)
				&& PulmonaryVascularDiseaseMedsEpicResponse == other.PulmonaryVascularDiseaseMedsEpicResponse;
	}

}
