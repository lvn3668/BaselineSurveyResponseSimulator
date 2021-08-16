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
public class SkinMsArthritis extends SkinDiseaseResponse {

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

	private ValueRange ArthritisMedicines;
	private int arthritismedicinesadministeredepicresponse;

	public SkinMsArthritis(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(new UniformDistribution(SkinMsArthritis.getMintogenerateerrorval(),
					SkinMsArthritis.getMaxtogenerateerrorval()));

			this.setArthritisMedicines(ValueRange.of(0, 1));
			this.setArthritismedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SkinMsArthritis.getMintogenerateerrorval(), SkinMsArthritis.getMaxtogenerateerrorval())))) {
				this.setArthritismedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getArthritisMedicines().getMinimum(),
								(int) this.getArthritisMedicines().getMaximum()));
			} else {
				this.setArthritismedicinesadministeredepicresponse(this.getUtilities().randBetween(
						SkinMsArthritis.getMintogenerateerrorval(), SkinMsArthritis.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public SkinMsArthritis(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		this.setUtilities(new Utilities());
		this.setUniformDistribution(new UniformDistribution(SkinMsArthritis.getMintogenerateerrorval(),
				SkinMsArthritis.getMaxtogenerateerrorval()));

		this.setArthritisMedicines(valuerange);
		this.setArthritismedicinesadministeredepicresponse(simulatedresponse);
		// if CancerResponse is positive, then generate values
		// for whether medicines are being administered or not
		// else set to 0

		try {
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SkinMsArthritis.getMintogenerateerrorval(), SkinMsArthritis.getMaxtogenerateerrorval())))) {
				this.setArthritismedicinesadministeredepicresponse(
						this.getUtilities().randBetween((int) this.getArthritisMedicines().getMinimum(),
								(int) this.getArthritisMedicines().getMaximum()));
			} else {
				this.setArthritismedicinesadministeredepicresponse(this.getUtilities().randBetween(
						SkinMsArthritis.getMintogenerateerrorval(), SkinMsArthritis.getMaxtogenerateerrorval()));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the arthritisMedicines
	 */
	private ValueRange getArthritisMedicines() {
		try {
			return this.ArthritisMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ArthritisMedicines;
	}

	/**
	 * @return the arthritismedicinesadministeredepicresponse
	 */
	public int getArthritismedicinesadministeredepicresponse() {
		try {
			return this.arthritismedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.arthritismedicinesadministeredepicresponse;
	}

	/**
	 * @param arthritisMedicines the arthritisMedicines to set
	 */
	private void setArthritisMedicines(ValueRange arthritisMedicines) {
		try {
			this.ArthritisMedicines = arthritisMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param arthritismedicinesadministeredepicresponse the
	 *                                                   arthritismedicinesadministeredepicresponse
	 *                                                   to set
	 */
	private void setArthritismedicinesadministeredepicresponse(int arthritismedicinesadministeredepicresponse) {
		try {
			this.arthritismedicinesadministeredepicresponse = arthritismedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "SkinMsArthritis [ArthritisMedicines=" + this.ArthritisMedicines
				+ ", arthritismedicinesadministeredepicresponse=" + this.arthritismedicinesadministeredepicresponse
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(ArthritisMedicines, arthritismedicinesadministeredepicresponse);
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
		if (!(obj instanceof SkinMsArthritis)) {
			return false;
		}
		SkinMsArthritis other = (SkinMsArthritis) obj;
		return Objects.equals(ArthritisMedicines, other.ArthritisMedicines)
				&& arthritismedicinesadministeredepicresponse == other.arthritismedicinesadministeredepicresponse;
	}

}
