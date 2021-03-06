package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.VeteranCohort;
import randomizer.RandomizingDistribution;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
public class Tuberculosis extends InfectiousDiseaseResponse {

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

	private ValueRange TuberculosisMedicines = ValueRange.of(0, 1);
	private int TuberculosisMedsAdministeredEpicResponse = 2;

	public Tuberculosis(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(Tuberculosis.getMintogenerateerrorval(),
					Tuberculosis.getMaxtogenerateerrorval()));

			this.setTuberculosisMedicines(ValueRange.of(0, 1));
			this.setTuberculosisMedsAdministeredEpicResponse(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Tuberculosis(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);

		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(Tuberculosis.getMintogenerateerrorval(),
					Tuberculosis.getMaxtogenerateerrorval()));

			this.setTuberculosisMedicines(valuerange);
			this.setTuberculosisMedsAdministeredEpicResponse(simulatedresponse);
			// if CancerResponse is positive, then generate values
			// for whether medicines are being administered or not
			// else set to 0

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
		if (!(obj instanceof Tuberculosis)) {
			return false;
		}
		Tuberculosis other = (Tuberculosis) obj;
		return Objects.equals(this.TuberculosisMedicines, other.TuberculosisMedicines)
				&& this.TuberculosisMedsAdministeredEpicResponse == other.TuberculosisMedsAdministeredEpicResponse;
	}

	/**
	 * @return the tuberculosisMedicines
	 */
	private ValueRange getTuberculosisMedicines() {
		try {
			return this.TuberculosisMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.TuberculosisMedicines;
	}

	/**
	 * @return the tuberculosisMedsAdministeredEpicResponse
	 */
	public int getTuberculosismedicinesadministeredepicresponse() {
		try {
			return this.TuberculosisMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.TuberculosisMedsAdministeredEpicResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(this.TuberculosisMedicines, this.TuberculosisMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param tuberculosisMedicines the tuberculosisMedicines to set
	 */
	private void setTuberculosisMedicines(ValueRange tuberculosisMedicines) {
		try {
			this.TuberculosisMedicines = tuberculosisMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param tuberculosisMedsAdministeredEpicResponse the
	 *                                                 tuberculosisMedsAdministeredEpicResponse
	 *                                                 to set
	 */
	private void setTuberculosisMedsAdministeredEpicResponse(int tuberculosisMedsAdministeredEpicResponse) {
		try {
			this.TuberculosisMedsAdministeredEpicResponse = tuberculosisMedsAdministeredEpicResponse;
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
		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							Tuberculosis.getMintogenerateerrorval(), Tuberculosis.getMaxtogenerateerrorval())))) {
				this.setTuberculosisMedsAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getTuberculosisMedicines().getMinimum(),
								(int) this.getTuberculosisMedicines().getMaximum()));
			} else {
				this.setTuberculosisMedsAdministeredEpicResponse(this.getUtilities()
						.randBetween(Tuberculosis.getMintogenerateerrorval(), Tuberculosis.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Tuberculosis [TuberculosisMedicines=" + this.TuberculosisMedicines
				+ ", TuberculosisMedsAdministeredEpicResponse=" + this.TuberculosisMedsAdministeredEpicResponse + "]";
	}

}
