package Diseases;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class AcuteSpinalCordInjury extends NeuroStimulatoryDiseaseResponse {

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
	/**
	 *
	 */
	private ValueRange AcuteSpinalCordInjuryMedicines;
	/**
	 *
	 */
	/**
	 *
	 */
	private int NS_ASCI_medicinesadministered_epicresponse;

	/**
	 * @throws Exception
	 */
	/**
	 * @param cohort
	 * @throws Exception
	 */
	public AcuteSpinalCordInjury(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(AcuteSpinalCordInjury.getMintogenerateerrorval(),
					AcuteSpinalCordInjury.getMaxtogenerateerrorval()));

			this.setAcuteSpinalCordInjuryMedicines(ValueRange.of(0, 1));
			this.setNS_ASCI_medicinesadministered_epicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(AcuteSpinalCordInjury.getMintogenerateerrorval(),
									AcuteSpinalCordInjury.getMaxtogenerateerrorval())))) {
				this.setNS_ASCI_medicinesadministered_epicresponse(
						this.getUtilities().randBetween((int) this.AcuteSpinalCordInjuryMedicines.getMinimum(),
								(int) this.AcuteSpinalCordInjuryMedicines.getMaximum()));
			} else {
				this.setNS_ASCI_medicinesadministered_epicresponse(
						this.getUtilities().randBetween(AcuteSpinalCordInjury.getMintogenerateerrorval(),
								AcuteSpinalCordInjury.getMaxtogenerateerrorval()));
			}
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param valuerange
	 * @param NS_SCImedicinesadministeredepicresponse
	 * @throws Exception
	 */
	/**
	 * @param cohort
	 * @param valuerange
	 * @param NS_SCImedicinesadministeredepicresponse
	 * @throws Exception
	 */
	public AcuteSpinalCordInjury(Cohort cohort, ValueRange valuerange, int NS_SCImedicinesadministeredepicresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, NS_SCImedicinesadministeredepicresponse);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(AcuteSpinalCordInjury.getMintogenerateerrorval(),
					AcuteSpinalCordInjury.getMaxtogenerateerrorval()));
			this.setAcuteSpinalCordInjuryMedicines(valuerange);
			this.setNS_ASCI_medicinesadministered_epicresponse(NS_SCImedicinesadministeredepicresponse);

			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(AcuteSpinalCordInjury.getMintogenerateerrorval(),
									AcuteSpinalCordInjury.getMaxtogenerateerrorval())))) {
				this.setNS_ASCI_medicinesadministered_epicresponse(
						this.getUtilities().randBetween((int) this.getAcuteSpinalCordInjuryMedicines().getMinimum(),
								(int) this.getAcuteSpinalCordInjuryMedicines().getMaximum()));
			} else {
				this.setNS_ASCI_medicinesadministered_epicresponse(
						this.getUtilities().randBetween(AcuteSpinalCordInjury.getMintogenerateerrorval(),
								AcuteSpinalCordInjury.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean equals(Object obj) {

		AcuteSpinalCordInjury other = (AcuteSpinalCordInjury) obj;
		if ((!(obj instanceof AcuteSpinalCordInjury) && (this.hashCode() != other.hashCode()))) {
			return false;
		}
		return true;
	}

	/**
	 * @return the acuteSpinalCordInjuryMedicines
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	private ValueRange getAcuteSpinalCordInjuryMedicines() throws Exception {
		try {
			return this.AcuteSpinalCordInjuryMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AcuteSpinalCordInjuryMedicines;
	}

	/**
	 * @return the nS_ASCI_medicinesadministered_epicresponse
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public int getAcuteSpinalCordInjurymedicinesadministeredepicresponse() {
		return this.NS_ASCI_medicinesadministered_epicresponse;
	}

	@Override
	public int hashCode() {
		try {
			return (Integer.toString(this.getAcuteSpinalCordInjurymedicinesadministeredepicresponse()).hashCode()
					+ Integer.toString((int) this.getAcuteSpinalCordInjuryMedicines().getMinimum()).hashCode()
					+ Integer.toString((int) this.getAcuteSpinalCordInjuryMedicines().getMaximum()).hashCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	/**
	 * @param acuteSpinalCordInjuryMedicines the acuteSpinalCordInjuryMedicines to
	 *                                       set
	 */
	/**
	 * @param acuteSpinalCordInjuryMedicines
	 */
	/**
	 * @param acuteSpinalCordInjuryMedicines
	 */
	private void setAcuteSpinalCordInjuryMedicines(ValueRange acuteSpinalCordInjuryMedicines) {
		try {
			this.AcuteSpinalCordInjuryMedicines = acuteSpinalCordInjuryMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param nS_ASCI_medicinesadministered_epicresponse the
	 *                                                   nS_ASCI_medicinesadministered_epicresponse
	 *                                                   to set
	 */
	/**
	 * @param nS_ASCI_medicinesadministered_epicresponse
	 */
	/**
	 * @param nS_ASCI_medicinesadministered_epicresponse
	 */
	private void setNS_ASCI_medicinesadministered_epicresponse(int nS_ASCI_medicinesadministered_epicresponse) {
		this.NS_ASCI_medicinesadministered_epicresponse = nS_ASCI_medicinesadministered_epicresponse;
	}

	/**
	 *
	 */
	/**
	 *
	 */
	@Override
	public String toString() {
		return "AcuteSpinalCordInjury [AcuteSpinalCordInjuryMedicines=" + this.AcuteSpinalCordInjuryMedicines
				+ ", NS_SCImedicinesadministeredepicresponse=" + this.NS_ASCI_medicinesadministered_epicresponse + "]";
	}

}
