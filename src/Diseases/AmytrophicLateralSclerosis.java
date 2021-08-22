package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

public class AmytrophicLateralSclerosis extends NeuroStimulatoryDiseaseResponse {

	/**
	 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
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
	public AmytrophicLateralSclerosis(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new RandomizingDistribution(AmytrophicLateralSclerosis.getMintogenerateerrorval(),
							AmytrophicLateralSclerosis.getMaxtogenerateerrorval()));
			this.setALSMedicines(ValueRange.of(0, 1));
			this.setAlsmedsadministeredepicresponse(2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param valuerange
	 * @param alsmedsadministeredepicresponse
	 * @throws Exception
	 */
	public AmytrophicLateralSclerosis(VeteranCohort veteranCohort, ValueRange valuerange,
			int alsmedsadministeredepicresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, alsmedsadministeredepicresponse);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new RandomizingDistribution(AmytrophicLateralSclerosis.getMintogenerateerrorval(),
							AmytrophicLateralSclerosis.getMaxtogenerateerrorval()));
			this.setALSMedicines(valuerange);
			this.setAlsmedsadministeredepicresponse(alsmedsadministeredepicresponse);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof AmytrophicLateralSclerosis)) {
			return false;
		}
		try {
			return Objects.equals(this.getALSMedicines(), ((AmytrophicLateralSclerosis) obj).getALSMedicines()) && this
					.getAmytrophiclateralsclerosismedicinesadministeredepicresponse() == ((AmytrophicLateralSclerosis) obj)
							.getAmytrophiclateralsclerosismedicinesadministeredepicresponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
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
	public int getAmytrophiclateralsclerosismedicinesadministeredepicresponse() throws Exception {
		try {
			return this.alsmedsadministeredepicresponse;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.alsmedsadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		try {
			if (this.getALSMedicines() != null) {
				return (this.getALSMedicines().hashCode() + Integer
						.toString(this.getAmytrophiclateralsclerosismedicinesadministeredepicresponse()).hashCode());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
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

	public void simulateResponses(VeteranCohort veterancohort) {
		super.simulateResponses(veterancohort);
		try {
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
			} else {
				this.setAlsmedsadministeredepicresponse(
						this.getUtilities().randBetween(AmytrophicLateralSclerosis.getMintogenerateerrorval(),
								AmytrophicLateralSclerosis.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {

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

}
