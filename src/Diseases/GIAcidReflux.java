package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS /MAVERIC
 *
 */
public class GIAcidReflux extends GastroIntestinalDiseaseResponse {

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

	private int acidRefluxmedicinesadministeredepicresponse;

	private ValueRange GIAcidRefluxMedicines;

	public GIAcidReflux(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(GIAcidReflux.getMintogenerateerrorval(),
					GIAcidReflux.getMaxtogenerateerrorval()));

			this.setGIAcidRefluxMedicines(ValueRange.of(0, 1));
			this.setAcidRefluxmedicinesadministeredepicresponse(2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GIAcidReflux(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(GIAcidReflux.getMintogenerateerrorval(),
					GIAcidReflux.getMaxtogenerateerrorval()));

			this.setGIAcidRefluxMedicines(valuerange);
			this.setAcidRefluxmedicinesadministeredepicresponse(simulatedresponse);
		} catch (Exception e) {
			e.printStackTrace();
		}

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
		return Objects.equals(this.GIAcidRefluxMedicines, other.GIAcidRefluxMedicines)
				&& this.acidRefluxmedicinesadministeredepicresponse == other.acidRefluxmedicinesadministeredepicresponse;
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
	 * @return the acidRefluxmedicinesadministeredepicresponse
	 */
	public int getGiAcidRefluxmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.acidRefluxmedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.acidRefluxmedicinesadministeredepicresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.GIAcidRefluxMedicines, this.acidRefluxmedicinesadministeredepicresponse);
		return result;
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
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) throws Exception {

		super.simulateResponses(veterancohort);
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
	}

	@Override
	public String toString() {
		return "GIAcidReflux [GIAcidRefluxMedicines=" + this.GIAcidRefluxMedicines
				+ ", acidRefluxmedicinesadministeredepicresponse=" + this.acidRefluxmedicinesadministeredepicresponse
				+ "]";
	}

}
