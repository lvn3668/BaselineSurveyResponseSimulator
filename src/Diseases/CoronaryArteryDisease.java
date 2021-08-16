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
public class CoronaryArteryDisease extends CirculatoryDiseaseResponse {

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

	private int cadmedicinesadministeredepicresponse;
	private ValueRange CoronaryArteryMedicines;

	public CoronaryArteryDisease(Cohort cohort) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdisttribution(new UniformDistribution(CoronaryArteryDisease.getMintogenerateerrorval(),
					CoronaryArteryDisease.getMaxtogenerateerrorval()));

			this.setCoronaryArteryMedicines(ValueRange.of(0, 1));
			this.setCadmedicinesadministeredepicresponse(2);

			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdisttribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(CoronaryArteryDisease.getMintogenerateerrorval(),
									CoronaryArteryDisease.getMaxtogenerateerrorval())))) {
				this.setCadmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getCoronaryArteryMedicines().getMinimum(),
								(int) this.getCoronaryArteryMedicines().getMaximum()));
			} else {
				this.setCadmedicinesadministeredepicresponse(
						this.getUtilities().randBetween(CoronaryArteryDisease.getMintogenerateerrorval(),
								CoronaryArteryDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public CoronaryArteryDisease(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		super(cohort, valuerange, simulatedresponse);

		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdisttribution(new UniformDistribution(CoronaryArteryDisease.getMintogenerateerrorval(),
					CoronaryArteryDisease.getMaxtogenerateerrorval()));

			this.setCoronaryArteryMedicines(valuerange);
			this.setCadmedicinesadministeredepicresponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdisttribution().generatenoiseinresponsevariables(
							this.getUtilities().randBetween(CoronaryArteryDisease.getMintogenerateerrorval(),
									CoronaryArteryDisease.getMaxtogenerateerrorval())))) {
				this.setCadmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getCoronaryArteryMedicines().getMinimum(),
								(int) this.getCoronaryArteryMedicines().getMaximum()));
			} else {
				this.setCadmedicinesadministeredepicresponse(
						this.getUtilities().randBetween(CoronaryArteryDisease.getMintogenerateerrorval(),
								CoronaryArteryDisease.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	protected void finalize() throws Exception {
		// TODO Auto-generated method stub
		try {
			this.CoronaryArteryMedicines = null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @return the cadmedicinesadministeredepicresponse
	 */
	public int getCadmedicinesadministeredepicresponse() {
		try {
			return this.cadmedicinesadministeredepicresponse;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.cadmedicinesadministeredepicresponse;
	}

	/**
	 * @return the coronaryArteryMedicines
	 */
	private ValueRange getCoronaryArteryMedicines() {

		try {
			return this.CoronaryArteryMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.CoronaryArteryMedicines;
	}

	/**
	 * @param cadmedicinesadministeredepicresponse the
	 *                                             cadmedicinesadministeredepicresponse
	 *                                             to set
	 */
	private void setCadmedicinesadministeredepicresponse(int cadmedicinesadministeredepicresponse) throws Exception {
		try {
			this.cadmedicinesadministeredepicresponse = cadmedicinesadministeredepicresponse;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param coronaryArteryMedicines the coronaryArteryMedicines to set
	 */
	private void setCoronaryArteryMedicines(ValueRange coronaryArteryMedicines) throws Exception {
		try {
			this.CoronaryArteryMedicines = coronaryArteryMedicines;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public String toString() {
		try {
			return "CoronaryArteryDisease [CoronaryArteryMedicines=" + this.CoronaryArteryMedicines
					+ ", cadmedicinesadministeredepicresponse=" + this.cadmedicinesadministeredepicresponse + "]";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "CoronaryArteryDisease [CoronaryArteryMedicines=" + this.CoronaryArteryMedicines
				+ ", cadmedicinesadministeredepicresponse=" + this.cadmedicinesadministeredepicresponse + "]";

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(CoronaryArteryMedicines, cadmedicinesadministeredepicresponse);
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
		if (!(obj instanceof CoronaryArteryDisease)) {
			return false;
		}
		CoronaryArteryDisease other = (CoronaryArteryDisease) obj;
		return Objects.equals(CoronaryArteryMedicines, other.CoronaryArteryMedicines)
				&& cadmedicinesadministeredepicresponse == other.cadmedicinesadministeredepicresponse;
	}

}
