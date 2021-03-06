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
public class Glaucoma extends HearingVisionDiseaseResponse {

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

	private ValueRange GlaucomaMedicines;
	private int GlaucomaMedsAdministeredEpicResponse;

	public Glaucoma(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(Glaucoma.getMintogenerateerrorval(),
					Glaucoma.getMaxtogenerateerrorval()));

			this.setGlaucomaMedicines(ValueRange.of(0, 1));
			this.setGlaucomaMedsAdministeredEpicResponse(2);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public Glaucoma(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(Glaucoma.getMintogenerateerrorval(),
					Glaucoma.getMaxtogenerateerrorval()));

			this.setGlaucomaMedicines(valuerange);
			this.setGlaucomaMedsAdministeredEpicResponse(simulatedresponse);
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
		if (!(obj instanceof Glaucoma)) {
			return false;
		}
		Glaucoma other = (Glaucoma) obj;
		return Objects.equals(this.GlaucomaMedicines, other.GlaucomaMedicines)
				&& this.GlaucomaMedsAdministeredEpicResponse == other.GlaucomaMedsAdministeredEpicResponse;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	/**
	 * @return the glaucomaMedicines
	 */
	private ValueRange getGlaucomaMedicines() throws Exception {
		try {
			return this.GlaucomaMedicines;
		} finally {
		}
	}

	/**
	 * @return the glaucomaMedsAdministeredEpicResponse
	 */
	public int getGlaucomamedicinesadministeredepicresponse() {
		return this.GlaucomaMedsAdministeredEpicResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.GlaucomaMedicines, this.GlaucomaMedsAdministeredEpicResponse);
		return result;
	}

	/**
	 * @param glaucomaMedicines the glaucomaMedicines to set
	 */
	private void setGlaucomaMedicines(ValueRange glaucomaMedicines) throws Exception {
		try {
			this.GlaucomaMedicines = glaucomaMedicines;
		} finally {
		}
	}

	/**
	 * @param glaucomaMedsAdministeredEpicResponse the
	 *                                             glaucomaMedsAdministeredEpicResponse
	 *                                             to set
	 */
	private void setGlaucomaMedsAdministeredEpicResponse(int glaucomaMedsAdministeredEpicResponse) {
		this.GlaucomaMedsAdministeredEpicResponse = glaucomaMedsAdministeredEpicResponse;
	}

	/**
	 * @throws Exception
	 */
	public void simulateResponses(VeteranCohort veterancohort) throws Exception {
		super.simulateResponses(veterancohort);
		if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
		// add getters for uniform dist and random epic vars
				(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
						.randBetween(Glaucoma.getMintogenerateerrorval(), Glaucoma.getMaxtogenerateerrorval())))) {
			this.setGlaucomaMedsAdministeredEpicResponse(this.getUtilities().randBetween(
					(int) this.getGlaucomaMedicines().getMinimum(), (int) this.getGlaucomaMedicines().getMaximum()));
		} else {
			this.setGlaucomaMedsAdministeredEpicResponse(this.getUtilities()
					.randBetween(Glaucoma.getMintogenerateerrorval(), Glaucoma.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "Glaucoma [GlaucomaMedicines=" + this.GlaucomaMedicines + ", GlaucomaMedsAdministeredEpicResponse="
				+ this.GlaucomaMedsAdministeredEpicResponse + "]";
	}

}
