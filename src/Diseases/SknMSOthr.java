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
public class SknMSOthr extends SkinDiseaseResponse {

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

	private int SknMSOtherMedsEpicResponse;
	private ValueRange SknMSOthrMedicines;

	public SknMSOthr(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(new UniformDistribution(SknMSOthr.getMintogenerateerrorval(),
					SknMSOthr.getMaxtogenerateerrorval()));

			this.setSknMSOthrMedicines(ValueRange.of(0, 1));
			this.setSknMSOtherMedsEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SknMSOthr.getMintogenerateerrorval(), SknMSOthr.getMaxtogenerateerrorval())))) {
				this.setSknMSOtherMedsEpicResponse(
						this.getUtilities().randBetween((int) this.getSknMSOthrMedicines().getMinimum(),
								(int) this.getSknMSOthrMedicines().getMaximum()));
			} else {
				this.setSknMSOtherMedsEpicResponse(this.getUtilities().randBetween(SknMSOthr.getMintogenerateerrorval(),
						SknMSOthr.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public SknMSOthr(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		this.setUtilities(new Utilities());
		this.setUniformDistribution(
				new UniformDistribution(SknMSOthr.getMintogenerateerrorval(), SknMSOthr.getMaxtogenerateerrorval()));

		this.setSknMSOthrMedicines(valuerange);
		this.setSknMSOtherMedsEpicResponse(simulatedresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SknMSOthr.getMintogenerateerrorval(), SknMSOthr.getMaxtogenerateerrorval())))) {
				this.setSknMSOtherMedsEpicResponse(
						this.getUtilities().randBetween((int) this.getSknMSOthrMedicines().getMinimum(),
								(int) this.getSknMSOthrMedicines().getMaximum()));
			} else {
				this.setSknMSOtherMedsEpicResponse(this.getUtilities().randBetween(SknMSOthr.getMintogenerateerrorval(),
						SknMSOthr.getMaxtogenerateerrorval()));
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
		if (!(obj instanceof SknMSOthr)) {
			return false;
		}
		SknMSOthr other = (SknMSOthr) obj;
		return this.SknMSOtherMedsEpicResponse == other.SknMSOtherMedsEpicResponse
				&& Objects.equals(this.SknMSOthrMedicines, other.SknMSOthrMedicines);
	}

	/**
	 * @return the sknMSOthrMedicines
	 */
	private ValueRange getSknMSOthrMedicines() throws Exception {
		try {
			return this.SknMSOthrMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SknMSOthrMedicines;
	}

	/**
	 * @return the sknMSOtherMedsEpicResponse
	 */
	public int getSknMSOthrmedicinesadministeredepicresponse() throws Exception {
		try {
			return this.SknMSOtherMedsEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SknMSOtherMedsEpicResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.SknMSOtherMedsEpicResponse, this.SknMSOthrMedicines);
		return result;
	}

	/**
	 * @param sknMSOtherMedsEpicResponse the sknMSOtherMedsEpicResponse to set
	 */
	private void setSknMSOtherMedsEpicResponse(int sknMSOtherMedsEpicResponse) {
		try {
			this.SknMSOtherMedsEpicResponse = sknMSOtherMedsEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sknMSOthrMedicines the sknMSOthrMedicines to set
	 */
	private void setSknMSOthrMedicines(ValueRange sknMSOthrMedicines) {
		this.SknMSOthrMedicines = sknMSOthrMedicines;
	}

	@Override
	public String toString() {
		return "SknMSOthr [SknMSOthrMedicines=" + this.SknMSOthrMedicines + ", SknMSOtherMedsEpicResponse="
				+ this.SknMSOtherMedsEpicResponse + "]";
	}

}
