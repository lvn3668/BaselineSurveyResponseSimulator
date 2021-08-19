package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

public class BenignProstaticHyperplasia extends OsteopathicDiseaseResponse {

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
	/**
	 * @return
	 */
	private static int getMaxtogenerateerrorval() {
		try {
			return maxtogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	private static int getMintogenerateerrorval() {
		try {
			return mintogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mintogenerateerrorval;
	}

	/**
	 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
	 */
	private ValueRange BPHMedicines;

	/**
	 *
	 */
	private int bphmedicinesadministeredepicresponse;

	/**
	 * @throws Exception
	 */
	public BenignProstaticHyperplasia(Cohort cohort) throws Exception {
		super(cohort);

		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(BenignProstaticHyperplasia.getMintogenerateerrorval(),
					BenignProstaticHyperplasia.getMaxtogenerateerrorval()));

			this.setBPHMedicines(ValueRange.of(0, 1));
			this.setBphmedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									BenignProstaticHyperplasia.getMintogenerateerrorval(),
									BenignProstaticHyperplasia.getMaxtogenerateerrorval())))) {
				this.setBphmedicinesadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getBPHMedicines().getMinimum(), (int) this.getBPHMedicines().getMaximum()));
			} else {
				this.setBphmedicinesadministeredepicresponse(
						this.getUtilities().randBetween(BenignProstaticHyperplasia.getMintogenerateerrorval(),
								BenignProstaticHyperplasia.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param valuerange
	 * @param bphmedicinesadministeredepicresponse
	 * @throws Exception
	 */
	public BenignProstaticHyperplasia(Cohort cohort, ValueRange valuerange, int bphmedicinesadministeredepicresponse)
			throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, bphmedicinesadministeredepicresponse);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(BenignProstaticHyperplasia.getMintogenerateerrorval(),
					BenignProstaticHyperplasia.getMaxtogenerateerrorval()));

			this.setBPHMedicines(valuerange);
			this.setBphmedicinesadministeredepicresponse(bphmedicinesadministeredepicresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution()
							.generatenoiseinresponsevariables(this.getUtilities().randBetween(
									BenignProstaticHyperplasia.getMintogenerateerrorval(),
									BenignProstaticHyperplasia.getMaxtogenerateerrorval())))) {
				this.setBphmedicinesadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getBPHMedicines().getMinimum(), (int) this.getBPHMedicines().getMaximum()));
			} else {
				this.setBphmedicinesadministeredepicresponse(
						this.getUtilities().randBetween(BenignProstaticHyperplasia.getMintogenerateerrorval(),
								BenignProstaticHyperplasia.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public boolean equals(Object obj) {
		try {
			if ((obj instanceof BenignProstaticHyperplasia) && (this.hashCode() == obj.hashCode())) {
				return true;
			}
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @return the bPHMedicines
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	private ValueRange getBPHMedicines() throws Exception {
		try {
			return this.BPHMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.BPHMedicines;
	}

	/**
	 * @return the bphmedicinesadministeredepicresponse
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	public int getBPHmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.bphmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.bphmedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		try {
			return Objects.hash(this.BPHMedicines, this.bphmedicinesadministeredepicresponse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @param bPHMedicines the bPHMedicines to set
	 */
	/**
	 * @param bPHMedicines
	 * @throws Exception
	 */
	private void setBPHMedicines(ValueRange bPHMedicines) throws Exception {
		try {
			this.BPHMedicines = bPHMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param bphmedicinesadministeredepicresponse the
	 *                                             bphmedicinesadministeredepicresponse
	 *                                             to set
	 */
	/**
	 * @param bphmedicinesadministeredepicresponse
	 * @throws Exception
	 */
	private void setBphmedicinesadministeredepicresponse(int bphmedicinesadministeredepicresponse) throws Exception {
		try {
			this.bphmedicinesadministeredepicresponse = bphmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "BenignProstaticHyperplasia [BPHMedicines=" + this.BPHMedicines
				+ ", bphmedicinesadministeredepicresponse=" + this.bphmedicinesadministeredepicresponse + "]";
	}

}
