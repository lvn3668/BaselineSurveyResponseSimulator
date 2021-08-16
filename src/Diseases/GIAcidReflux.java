package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan
 * Affiliation VABHS /MAVERIC 
 *
 */
public class GIAcidReflux extends GastroIntestinalDiseaseResponse {

	private ValueRange GIAcidRefluxMedicines;
	private int acidRefluxmedicinesadministeredepicresponse;
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

	public GIAcidReflux(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GIAcidReflux.getMintogenerateerrorval(),
					GIAcidReflux.getMaxtogenerateerrorval()));

			this.setGIAcidRefluxMedicines(ValueRange.of(0, 1));
			this.setAcidRefluxmedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							GIAcidReflux.getMintogenerateerrorval(), GIAcidReflux.getMaxtogenerateerrorval())))) {
				this.setAcidRefluxmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getGIAcidRefluxMedicines().getMinimum(),
								(int) this.getGIAcidRefluxMedicines().getMaximum()));
			} else {
				this.setAcidRefluxmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(GIAcidReflux.getMintogenerateerrorval(), GIAcidReflux.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GIAcidReflux(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(GIAcidReflux.getMintogenerateerrorval(),
					GIAcidReflux.getMaxtogenerateerrorval()));

			this.setGIAcidRefluxMedicines(valuerange);
			this.setAcidRefluxmedicinesadministeredepicresponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							GIAcidReflux.getMintogenerateerrorval(), GIAcidReflux.getMaxtogenerateerrorval())))) {
				this.setAcidRefluxmedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getGIAcidRefluxMedicines().getMinimum(),
								(int) this.getGIAcidRefluxMedicines().getMaximum()));
			} else {
				this.setAcidRefluxmedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(GIAcidReflux.getMintogenerateerrorval(), GIAcidReflux.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return the gIAcidRefluxMedicines
	 */
	private ValueRange getGIAcidRefluxMedicines() throws Exception {
		try {
			return this.GIAcidRefluxMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.GIAcidRefluxMedicines;
	}

	/**
	 * @param gIAcidRefluxMedicines the gIAcidRefluxMedicines to set
	 */
	private void setGIAcidRefluxMedicines(ValueRange gIAcidRefluxMedicines) throws Exception {
		try {
			this.GIAcidRefluxMedicines = gIAcidRefluxMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the acidRefluxmedicinesadministeredepicresponse
	 */
	public int getAcidRefluxmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.acidRefluxmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.acidRefluxmedicinesadministeredepicresponse;
	}

	/**
	 * @param acidRefluxmedicinesadministeredepicresponse the
	 *                                                    acidRefluxmedicinesadministeredepicresponse
	 *                                                    to set
	 */
	private void setAcidRefluxmedicinesadministeredepicresponse(int acidRefluxmedicinesadministeredepicresponse) {
		try {
			this.acidRefluxmedicinesadministeredepicresponse = acidRefluxmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(GIAcidRefluxMedicines, acidRefluxmedicinesadministeredepicresponse);
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
		if (!(obj instanceof GIAcidReflux)) {
			return false;
		}
		GIAcidReflux other = (GIAcidReflux) obj;
		return Objects.equals(GIAcidRefluxMedicines, other.GIAcidRefluxMedicines)
				&& acidRefluxmedicinesadministeredepicresponse == other.acidRefluxmedicinesadministeredepicresponse;
	}

	@Override
	public String toString() {
		return "GIAcidReflux [GIAcidRefluxMedicines=" + GIAcidRefluxMedicines
				+ ", acidRefluxmedicinesadministeredepicresponse=" + acidRefluxmedicinesadministeredepicresponse + "]";
	}

}
