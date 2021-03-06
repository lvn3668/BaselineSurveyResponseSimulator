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
public class KidneyDialysis extends NephrologyResponse {

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

	private int KDDialysisMedsAdministeredEpicResponse;
	// Kidney Disease other than dialysis and non-acute
	private ValueRange KidneyDialysisMeds;

	public KidneyDialysis(VeteranCohort veteranCohort) throws Exception {
		super(veteranCohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(KidneyDialysis.getMintogenerateerrorval(),
					KidneyDialysis.getMaxtogenerateerrorval()));

			this.setKidneyDialysisMeds(ValueRange.of(0, 1));
			this.setKidneyDialysismedicinesadministeredepicresponse(2);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public KidneyDialysis(VeteranCohort veteranCohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(veteranCohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(KidneyDialysis.getMintogenerateerrorval(),
					KidneyDialysis.getMaxtogenerateerrorval()));

			this.setKidneyDialysisMeds(valuerange);
			this.setKidneyDialysismedicinesadministeredepicresponse(simulatedresponse);
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
		if (!(obj instanceof KidneyDialysis)) {
			return false;
		}
		KidneyDialysis other = (KidneyDialysis) obj;
		return this.KDDialysisMedsAdministeredEpicResponse == other.KDDialysisMedsAdministeredEpicResponse
				&& Objects.equals(this.KidneyDialysisMeds, other.KidneyDialysisMeds);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	/**
	 * @return the kDDialysisMedsAdministeredEpicResponse
	 */
	public int getKidneyDialysismedicinesadministeredepicresponse() throws Exception {
		try {
			return this.KDDialysisMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.KDDialysisMedsAdministeredEpicResponse;
	}

	/**
	 * @return the kdDialysisMeds
	 */
	private ValueRange getKidneyDialysisMeds() throws Exception {
		try {
			return this.KidneyDialysisMeds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.KidneyDialysisMeds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.KDDialysisMedsAdministeredEpicResponse, this.KidneyDialysisMeds);
		return result;
	}

	/**
	 * @param kDDialysisMedsAdministeredEpicResponse the
	 *                                               kDDialysisMedsAdministeredEpicResponse
	 *                                               to set
	 */
	private void setKidneyDialysismedicinesadministeredepicresponse(int kDDialysisMedsAdministeredEpicResponse)
			throws Exception {
		try {
			this.KDDialysisMedsAdministeredEpicResponse = kDDialysisMedsAdministeredEpicResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param kdDialysisMeds the kdDialysisMeds to set
	 */
	private void setKidneyDialysisMeds(ValueRange kdDialysisMeds) throws Exception {
		try {
			this.KidneyDialysisMeds = kdDialysisMeds;
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
						KidneyDialysis.getMintogenerateerrorval(), KidneyDialysis.getMaxtogenerateerrorval())))) {
			this.setKidneyDialysismedicinesadministeredepicresponse(this.getUtilities().randBetween(
					(int) this.getKidneyDialysisMeds().getMinimum(), (int) this.getKidneyDialysisMeds().getMaximum()));
		} else {
			this.setKidneyDialysismedicinesadministeredepicresponse(this.getUtilities()
					.randBetween(KidneyDialysis.getMintogenerateerrorval(), KidneyDialysis.getMaxtogenerateerrorval()));
		}
	}

	@Override
	public String toString() {
		return "KidneyDialysis [KidneyDialysisMeds=" + this.KidneyDialysisMeds
				+ ", KDDialysisMedsAdministeredEpicResponse=" + this.KDDialysisMedsAdministeredEpicResponse + "]";
	}

}
