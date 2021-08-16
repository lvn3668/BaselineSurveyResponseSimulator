package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

public class AmytrophicLateralSclerosis extends NeuroStimulatoryDiseaseResponse {

	/**
	 * @author Lalitha Viswanathan
	 * Affiliation VABHS / MAVERIC 
	 *
	 */

	private static final int maxtogenerateerrorval = 5;
	/**
	 * 
	 */
	/**
	 * 
	 */
	private static final int mintogenerateerrorval = 2;

	/**
	 * @return the maxtogenerateerrorval
	 */
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
	private static int getMintogenerateerrorval() {
		return mintogenerateerrorval;
	}

	/**
	 * 
	 */
	private ValueRange ALSMedicines;
	/**
	 * 
	 */
	private int alsmedsadministeredepicresponse;

	/**
	 * @throws Exception
	 */
	public AmytrophicLateralSclerosis(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(AmytrophicLateralSclerosis.getMintogenerateerrorval(),
					AmytrophicLateralSclerosis.getMaxtogenerateerrorval()));
			this.setALSMedicines(ValueRange.of(0, 1));
			this.setAlsmedsadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1 (Valid response)
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									AmytrophicLateralSclerosis.getMintogenerateerrorval(),
									AmytrophicLateralSclerosis.getMaxtogenerateerrorval())))) {
				this.setAlsmedsadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getALSMedicines().getMinimum(), (int) this.getALSMedicines().getMaximum()));
			}

			else
				this.setAlsmedsadministeredepicresponse(
						this.getUtilities().randBetween(AmytrophicLateralSclerosis.getMintogenerateerrorval(),
								AmytrophicLateralSclerosis.getMaxtogenerateerrorval()));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param valuerange
	 * @param alsmedsadministeredepicresponse
	 * @throws Exception
	 */
	public AmytrophicLateralSclerosis(Cohort cohort, ValueRange valuerange, int alsmedsadministeredepicresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, alsmedsadministeredepicresponse);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(AmytrophicLateralSclerosis.getMintogenerateerrorval(),
					AmytrophicLateralSclerosis.getMaxtogenerateerrorval()));
			this.setALSMedicines(valuerange);
			this.setAlsmedsadministeredepicresponse(alsmedsadministeredepicresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1 (Valid response)
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									AmytrophicLateralSclerosis.getMintogenerateerrorval(),
									AmytrophicLateralSclerosis.getMaxtogenerateerrorval())))) {
				this.setAlsmedsadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getALSMedicines().getMinimum(), (int) this.getALSMedicines().getMaximum()));
			}

			else
				this.setAlsmedsadministeredepicresponse(
						this.getUtilities().randBetween(AmytrophicLateralSclerosis.getMintogenerateerrorval(),
								AmytrophicLateralSclerosis.getMaxtogenerateerrorval()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the aLSMedicines
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	private ValueRange getALSMedicines() throws Exception {
		try {
			return this.ALSMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ALSMedicines;
	}

	/**
	 * @return the alsmedsadministeredepicresponse
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	public int getAlsmedsadministeredepicresponse() throws Exception {
		try {
			return this.alsmedsadministeredepicresponse;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.alsmedsadministeredepicresponse;
	}

	/**
	 * @param aLSMedicines the aLSMedicines to set
	 */
	/**
	 * @param aLSMedicines
	 * @throws Exception
	 */
	private void setALSMedicines(ValueRange aLSMedicines) throws Exception {
		try {
			this.ALSMedicines = aLSMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param alsmedsadministeredepicresponse the alsmedsadministeredepicresponse to
	 *                                        set
	 */
	/**
	 * @param alsmedsadministeredepicresponse
	 * @throws Exception
	 */
	private void setAlsmedsadministeredepicresponse(int alsmedsadministeredepicresponse) throws Exception {
		try {
			this.alsmedsadministeredepicresponse = alsmedsadministeredepicresponse;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "AmytrophicLateralSclerosis [ALSMedicines=" + this.ALSMedicines + ", alsmedsadministeredepicresponse="
				+ this.alsmedsadministeredepicresponse + "]";
	}

	@Override
	public int hashCode() {
		try {
			if (this.getALSMedicines() != null)

				return (this.getALSMedicines().hashCode()
						+ Integer.toString(this.getAlsmedsadministeredepicresponse()).hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof AmytrophicLateralSclerosis)) {
			return false;
		}
		try {
			return Objects.equals(this.getALSMedicines(), ((AmytrophicLateralSclerosis) obj).getALSMedicines())
					&& this.getAlsmedsadministeredepicresponse() == ((AmytrophicLateralSclerosis) obj)
							.getAlsmedsadministeredepicresponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
