package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class SknMSOA extends SkinDiseaseResponse {

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

	private ValueRange SknMSOAMedicines;
	private int SknMSOAMedicinesAdministeredEpicResponse;

	public SknMSOA(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(
					new UniformDistribution(SknMSOA.getMintogenerateerrorval(), SknMSOA.getMaxtogenerateerrorval()));

			this.setSknMSOAMedicines(ValueRange.of(0, 1));
			this.setSknMSOAMedicinesAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(SknMSOA.getMintogenerateerrorval(), SknMSOA.getMaxtogenerateerrorval())))) {
				this.setSknMSOAMedicinesAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getSknMSOAMedicines().getMinimum(), (int) this.getSknMSOAMedicines().getMaximum()));
			} else {
				this.setSknMSOAMedicinesAdministeredEpicResponse(this.getUtilities()
						.randBetween(SknMSOA.getMintogenerateerrorval(), SknMSOA.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public SknMSOA(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		super(veteranCohort, valuerange, simulatedresponse);
		this.setUtilities(new Utilities());
		this.setUniformDistribution(
				new UniformDistribution(SknMSOA.getMintogenerateerrorval(), SknMSOA.getMaxtogenerateerrorval()));

		this.setSknMSOAMedicines(valuerange);
		this.setSknMSOAMedicinesAdministeredEpicResponse(simulatedresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(SknMSOA.getMintogenerateerrorval(), SknMSOA.getMaxtogenerateerrorval())))) {
				this.setSknMSOAMedicinesAdministeredEpicResponse(this.getUtilities().randBetween(
						(int) this.getSknMSOAMedicines().getMinimum(), (int) this.getSknMSOAMedicines().getMaximum()));
			} else {
				this.setSknMSOAMedicinesAdministeredEpicResponse(this.getUtilities()
						.randBetween(SknMSOA.getMintogenerateerrorval(), SknMSOA.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
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
		if (!(obj instanceof SknMSOA)) {
			return false;
		}
		SknMSOA other = (SknMSOA) obj;
		return Objects.equals(this.SknMSOAMedicines, other.SknMSOAMedicines)
				&& this.SknMSOAMedicinesAdministeredEpicResponse == other.SknMSOAMedicinesAdministeredEpicResponse;
	}

	/**
	 * @return the sknMSOAMedicinesAdministeredEpicResponse
	 */
	public int getSkinMSOAmedicinesadministeredepicresponse() {
		try {
			return this.SknMSOAMedicinesAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SknMSOAMedicinesAdministeredEpicResponse;
	}

	/**
	 * @return the sknMSOAMedicines
	 */
	private ValueRange getSknMSOAMedicines() {
		try {
			return this.SknMSOAMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SknMSOAMedicines;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.SknMSOAMedicines, this.SknMSOAMedicinesAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param sknMSOAMedicines the sknMSOAMedicines to set
	 */
	private void setSknMSOAMedicines(ValueRange sknMSOAMedicines) {
		try {
			this.SknMSOAMedicines = sknMSOAMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sknMSOAMedicinesAdministeredEpicResponse the
	 *                                                 sknMSOAMedicinesAdministeredEpicResponse
	 *                                                 to set
	 */
	private void setSknMSOAMedicinesAdministeredEpicResponse(int sknMSOAMedicinesAdministeredEpicResponse) {
		try {
			this.SknMSOAMedicinesAdministeredEpicResponse = sknMSOAMedicinesAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "SknMSOA [SknMSOAMedicines=" + this.SknMSOAMedicines + ", SknMSOAMedicinesAdministeredEpicResponse="
				+ this.SknMSOAMedicinesAdministeredEpicResponse + "]";
	}

}
