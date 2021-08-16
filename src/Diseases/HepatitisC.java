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
public class HepatitisC extends InfectiousDiseaseResponse {

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

	private ValueRange HepCMedicines;
	private int HepCMedsAdministeredEpicResponse;

	public HepatitisC(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HepatitisC.getMintogenerateerrorval(),
					HepatitisC.getMaxtogenerateerrorval()));

			this.setHepCMedicines(ValueRange.of(0, 1));
			this.setHepCMedsAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							HepatitisC.getMintogenerateerrorval(), HepatitisC.getMaxtogenerateerrorval())))) {
				this.setHepCMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getHepCMedicines().getMinimum(), (int) this.getHepCMedicines().getMaximum()));
			} else {
				this.setHepCMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(HepatitisC.getMintogenerateerrorval(), HepatitisC.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public HepatitisC(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HepatitisC.getMintogenerateerrorval(),
					HepatitisC.getMaxtogenerateerrorval()));

			this.setHepCMedicines(valuerange);
			this.setHepCMedsAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							HepatitisC.getMintogenerateerrorval(), HepatitisC.getMaxtogenerateerrorval())))) {
				this.setHepCMedsAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getHepCMedicines().getMinimum(), (int) this.getHepCMedicines().getMaximum()));
			} else {
				this.setHepCMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(HepatitisC.getMintogenerateerrorval(), HepatitisC.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the hepCMedicines
	 */
	private ValueRange getHepCMedicines() throws Exception {
		try {
			return this.HepCMedicines;
		} finally {
		}
	}

	/**
	 * @return the hepCMedsAdministeredEpicResponse
	 */
	public int getHepCMedsAdministeredEpicResponse() throws Exception {
		try {
			return this.HepCMedsAdministeredEpicResponse;
		} finally {
		}
	}

	/**
	 * @param hepCMedicines the hepCMedicines to set
	 */
	private void setHepCMedicines(ValueRange hepCMedicines) throws Exception {
		try {
			this.HepCMedicines = hepCMedicines;
		} finally {
		}
	}

	/**
	 * @param hepCMedsAdministeredEpicResponse the hepCMedsAdministeredEpicResponse
	 *                                         to set
	 */
	private void setHepCMedsAdministeredEpicResponse(int hepCMedsAdministeredEpicResponse) throws Exception {
		try {
			this.HepCMedsAdministeredEpicResponse = hepCMedsAdministeredEpicResponse;
		} finally {
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(HepCMedicines, HepCMedsAdministeredEpicResponse);
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
		if (!(obj instanceof HepatitisC)) {
			return false;
		}
		HepatitisC other = (HepatitisC) obj;
		return Objects.equals(HepCMedicines, other.HepCMedicines)
				&& HepCMedsAdministeredEpicResponse == other.HepCMedsAdministeredEpicResponse;
	}

	@Override
	public String toString() {
		return "HepatitisC [HepCMedicines=" + HepCMedicines + ", HepCMedsAdministeredEpicResponse="
				+ HepCMedsAdministeredEpicResponse + "]";
	}

}
