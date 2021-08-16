package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

public class Asthma extends OsteopathicDiseaseResponse {

	/**
	 * /**
 * @author Lalitha Viswanathan
 * Affiliation VABHS / MAVERIC 
 *
 */
	/**
	 * 
	 */
	private static final int maxtogenerateerrorval = 5;
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
	private static int getMintogenerateerrorval() {
		return mintogenerateerrorval;
	}

	/**
	 * 
	 */
	private ValueRange AsthmaMedicines;
	/**
	 * 
	 */
	private int asthmamedicinesadministeredepicresponse;

	/**
	 * @throws Exception
	 */
	public Asthma(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Asthma.getMintogenerateerrorval(), Asthma.getMaxtogenerateerrorval()));
			this.setAsthmaMedicines(ValueRange.of(0, 1));
			this.setAsthmamedicinesadministeredepicresponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Asthma.getMintogenerateerrorval(), Asthma.getMaxtogenerateerrorval())))) {
				this.setAsthmamedicinesadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getAsthmaMedicines().getMinimum(), (int) this.getAsthmaMedicines().getMaximum()));
			}

			else
				this.setAsthmamedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Asthma.getMintogenerateerrorval(), Asthma.getMaxtogenerateerrorval()));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param valuerange
	 * @param asthmamedicinesadministeredepicresponse
	 * @throws Exception
	 */
	public Asthma(Cohort cohort, ValueRange valuerange, int asthmamedicinesadministeredepicresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, asthmamedicinesadministeredepicresponse);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(
					new UniformDistribution(Asthma.getMintogenerateerrorval(), Asthma.getMaxtogenerateerrorval()));
			this.setAsthmaMedicines(valuerange);
			this.setAsthmamedicinesadministeredepicresponse(asthmamedicinesadministeredepicresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// generate uniform distribution between min and max error vals and pick a
			// random number, check pdf value
			// if less than 0.5 then generate 0 or 1
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
							.randBetween(Asthma.getMintogenerateerrorval(), Asthma.getMaxtogenerateerrorval())))) {
				this.setAsthmamedicinesadministeredepicresponse(this.getUtilities().randBetween(
						(int) this.getAsthmaMedicines().getMinimum(), (int) this.getAsthmaMedicines().getMaximum()));
			} else
				this.setAsthmamedicinesadministeredepicresponse(this.getUtilities()
						.randBetween(Asthma.getMintogenerateerrorval(), Asthma.getMaxtogenerateerrorval()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the asthmaMedicines
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	private ValueRange getAsthmaMedicines() throws Exception {
		try {
			return this.AsthmaMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AsthmaMedicines;
	}

	/**
	 * @return the asthmamedicinesadministeredepicresponse
	 */
	/**
	 * @return
	 * @throws Exception
	 */
	public int getAsthmamedicinesadministeredepicresponse() throws Exception {
		try {
			return this.asthmamedicinesadministeredepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.asthmamedicinesadministeredepicresponse;
	}

	/**
	 * @param asthmaMedicines the asthmaMedicines to set
	 */
	/**
	 * @param asthmaMedicines
	 * @throws Exception
	 */
	private void setAsthmaMedicines(ValueRange asthmaMedicines) throws Exception {
		try {
			this.AsthmaMedicines = asthmaMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param asthmamedicinesadministeredepicresponse the
	 *                                                asthmamedicinesadministeredepicresponse
	 *                                                to set
	 */
	/**
	 * @param asthmamedicinesadministeredepicresponse
	 * @throws Exception
	 */
	private void setAsthmamedicinesadministeredepicresponse(int asthmamedicinesadministeredepicresponse)
			throws Exception {
		try {
			this.asthmamedicinesadministeredepicresponse = asthmamedicinesadministeredepicresponse;
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
		return "Asthma [AsthmaMedicines=" + this.AsthmaMedicines + ", asthmamedicinesadministeredepicresponse="
				+ this.asthmamedicinesadministeredepicresponse + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(AsthmaMedicines, asthmamedicinesadministeredepicresponse);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Asthma)) {
			return false;
		}
		Asthma other = (Asthma) obj;
		return Objects.equals(AsthmaMedicines, other.AsthmaMedicines)
				&& asthmamedicinesadministeredepicresponse == other.asthmamedicinesadministeredepicresponse;
	}

}
