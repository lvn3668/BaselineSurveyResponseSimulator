package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class Cholesterol extends MiscDiseaseResponse {

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
	private static int getMintogenerateerrorval() {
		return mintogenerateerrorval;
	}

	/**
	 *
	 */
	private ValueRange CholesterolMedicines;
	/**
	 *
	 */
	private int cholesterolmedicinesadministeredepicresponse;

	/**
	 * @throws Exception
	 */
	public Cholesterol(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(Cholesterol.getMintogenerateerrorval(),
					Cholesterol.getMaxtogenerateerrorval()));

			this.setCholesterolMedicines(ValueRange.of(0, 1));
			this.setCholesterolmedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							Cholesterol.getMintogenerateerrorval(), Cholesterol.getMaxtogenerateerrorval())))) {
				this.setCholesterolmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getCholesterolMedicines().getMinimum(),
								(int) this.getCholesterolMedicines().getMaximum()));
			} else {
				this.setCholesterolmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Cholesterol.getMintogenerateerrorval(), Cholesterol.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @throws Exception
	 */
	public Cholesterol(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		this.setUtilities(new Utilities());
		this.setUniformdistribution(new UniformDistribution(Cholesterol.getMintogenerateerrorval(),
				Cholesterol.getMaxtogenerateerrorval()));

		this.setCholesterolMedicines(valuerange);
		this.setCholesterolmedicinesadministeredepicresponse(simulatedresponse);
		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							Cholesterol.getMintogenerateerrorval(), Cholesterol.getMaxtogenerateerrorval())))) {
				this.setCholesterolmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getCholesterolMedicines().getMinimum(),
								(int) this.getCholesterolMedicines().getMaximum()));
			} else {
				this.setCholesterolmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Cholesterol.getMintogenerateerrorval(), Cholesterol.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean equals(Object obj) {
		try {
			if (obj != null && this instanceof Cholesterol && obj instanceof Cholesterol
					&& this.hashCode() == obj.hashCode()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @return the cholesterolMedicines
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	private ValueRange getCholesterolMedicines() throws Exception {
		try {
			return this.CholesterolMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.CholesterolMedicines;
	}

	/**
	 * @return the cholesterolmedicinesadministeredepicresponse
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	public int getCholesterolmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.cholesterolmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.cholesterolmedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		try {
			return Objects.hash(this.getCholesterolMedicines(), this.getCholesterolmedicinesadministeredepicresponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @param cholesterolMedicines the cholesterolMedicines to set
	 */
	/**
	 * @param cholesterolMedicines
	 * @throws Exception
	 */
	private void setCholesterolMedicines(ValueRange cholesterolMedicines) throws Exception {

		try {
			this.CholesterolMedicines = cholesterolMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param cholesterolmedicinesadministeredepicresponse the
	 *                                                     cholesterolmedicinesadministeredepicresponse
	 *                                                     to set
	 */
	/**
	 * @param cholesterolmedicinesadministeredepicresponse
	 * @throws Exception
	 */
	private void setCholesterolmedicinesadministeredepicresponse(int cholesterolmedicinesadministeredepicresponse)
			throws Exception {
		try {
			this.cholesterolmedicinesadministeredepicresponse = cholesterolmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Cholesterol [CholesterolMedicines=" + this.CholesterolMedicines
				+ ", cholesterolmedicinesadministeredepicresponse=" + this.cholesterolmedicinesadministeredepicresponse
				+ "]";
	}

}
