package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation MAVERIC / VABHS
 *
 */
public class Cataract extends HearingVisionDiseaseResponse {

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
	private static int getMintogenerateerrorval() {
		return mintogenerateerrorval;
	}

	/**
	 *
	 */
	private ValueRange CataractMedicines;
	// default is error response
	/**
	 *
	 */
	private int cataractmedicinesadministeredepicresponse;

	/**
	 * @throws Exception
	 */
	public Cataract(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Cataract.getMintogenerateerrorval(), Cataract.getMaxtogenerateerrorval()));

			this.setCataractMedicines(ValueRange.of(0, 1));
			this.setCataractmedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Cataract.getMintogenerateerrorval(), Cataract.getMaxtogenerateerrorval())))) {
				this.setCataractmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getCataractMedicines().getMinimum(),
								(int) this.getCataractMedicines().getMaximum()));
			} else {
				this.setCataractmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Cataract.getMintogenerateerrorval(), Cataract.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @throws Exception
	 */
	public Cataract(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		this.setUtilities(new Utilities());
		this.setUniformdistribution(
				new UniformDistribution(Cataract.getMintogenerateerrorval(), Cataract.getMaxtogenerateerrorval()));

		this.setCataractMedicines(valuerange);
		this.setCataractmedicinesadministeredepicresponse(simulatedresponse);
		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Cataract.getMintogenerateerrorval(), Cataract.getMaxtogenerateerrorval())))) {
				this.setCataractmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getCataractMedicines().getMinimum(),
								(int) this.getCataractMedicines().getMaximum()));
			} else {
				this.setCataractmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Cataract.getMintogenerateerrorval(), Cataract.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Cataract && this instanceof Cataract && this.hashCode() == obj.hashCode()) {
			return true;
		}
		return false;
	}

	/**
	 * @return the cataractMedicines
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	private ValueRange getCataractMedicines() {
		try {
			return this.CataractMedicines;
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return this.CataractMedicines;
	}

	/**
	 * @return the cataractmedicinesadministeredepicresponse
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	public int getCataractmedicinesadministeredepicresponse() {
		try {
			return this.cataractmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.cataractmedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getCataractMedicines(), this.getCataractmedicinesadministeredepicresponse());
	}

	/**
	 * @param cataractMedicines the cataractMedicines to set
	 */
	/**
	 * @param cataractMedicines
	 * @throws Exception
	 */
	private void setCataractMedicines(ValueRange cataractMedicines) {
		try {
			this.CataractMedicines = cataractMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param cataractmedicinesadministeredepicresponse the
	 *                                                  cataractmedicinesadministeredepicresponse
	 *                                                  to set
	 */
	/**
	 * @param cataractmedicinesadministeredepicresponse
	 * @throws Exception
	 */
	private void setCataractmedicinesadministeredepicresponse(int cataractmedicinesadministeredepicresponse) {
		try {
			this.cataractmedicinesadministeredepicresponse = cataractmedicinesadministeredepicresponse;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Cataract [CataractMedicines=" + this.CataractMedicines + ", cataractmedicinesadministeredepicresponse="
				+ this.cataractmedicinesadministeredepicresponse + "]";
	}

}
