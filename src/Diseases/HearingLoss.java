package Diseases;

import java.time.temporal.ValueRange;
import java.util.Objects;

import Utilities.Utilities;
import cohort.Cohort;
import randomizer.UniformDistribution;

public class HearingLoss extends HearingVisionDiseaseResponse {

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

	private ValueRange HearingLossMedicines;
	private int hearinglossMedicinesAdministeredEpicResponse;

	public HearingLoss(Cohort cohort) throws Exception {
		super(cohort);
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HearingLoss.getMintogenerateerrorval(),
					HearingLoss.getMaxtogenerateerrorval()));

			this.setHearingLossMedicines(ValueRange.of(0, 1));
			this.setHearinglossMedicinesAdministeredEpicResponse(2);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							HearingLoss.getMintogenerateerrorval(), HearingLoss.getMaxtogenerateerrorval())))) {
				this.setHearinglossMedicinesAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getHearingLossMedicines().getMinimum(),
								(int) this.getHearingLossMedicines().getMaximum()));
			} else {
				this.setHearinglossMedicinesAdministeredEpicResponse(this.getUtilities()
						.randBetween(HearingLoss.getMintogenerateerrorval(), HearingLoss.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public HearingLoss(Cohort cohort, ValueRange valuerange, int simulatedresponse) throws Exception {
		// TODO Auto-generated constructor stub
		super(cohort, valuerange, simulatedresponse);
		// TODO Auto-generated constructor stub
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(HearingLoss.getMintogenerateerrorval(),
					HearingLoss.getMaxtogenerateerrorval()));

			this.setHearingLossMedicines(valuerange);
			this.setHearinglossMedicinesAdministeredEpicResponse(simulatedresponse);
			if ((super.getDiseasepresenceorabsencesimulatedepicresponse() == 1) &&
			// add getters for uniform dist and random epic vars
					(!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
							HearingLoss.getMintogenerateerrorval(), HearingLoss.getMaxtogenerateerrorval())))) {
				this.setHearinglossMedicinesAdministeredEpicResponse(
						this.getUtilities().randBetween((int) this.getHearingLossMedicines().getMinimum(),
								(int) this.getHearingLossMedicines().getMaximum()));
			} else {
				this.setHearinglossMedicinesAdministeredEpicResponse(this.getUtilities()
						.randBetween(HearingLoss.getMintogenerateerrorval(), HearingLoss.getMaxtogenerateerrorval()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return the hearingLossMedicines
	 */
	private ValueRange getHearingLossMedicines() throws Exception {
		try {
			return this.HearingLossMedicines;
		} finally {
		}
	}

	/**
	 * @return the hearinglossMedicinesAdministeredEpicResponse
	 */
	public int getHearinglossMedicinesAdministeredEpicResponse() {
		return this.hearinglossMedicinesAdministeredEpicResponse;
	}

	/**
	 * @param hearingLossMedicines the hearingLossMedicines to set
	 */
	private void setHearingLossMedicines(ValueRange hearingLossMedicines) throws Exception {
		try {
			this.HearingLossMedicines = hearingLossMedicines;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param hearinglossMedicinesAdministeredEpicResponse the
	 *                                                     hearinglossMedicinesAdministeredEpicResponse
	 *                                                     to set
	 */
	private void setHearinglossMedicinesAdministeredEpicResponse(int hearinglossMedicinesAdministeredEpicResponse) {
		this.hearinglossMedicinesAdministeredEpicResponse = hearinglossMedicinesAdministeredEpicResponse;
	}

	@Override
	public String toString() {
		return "HearingLoss [HearingLossMedicines=" + this.HearingLossMedicines
				+ ", hearinglossMedicinesAdministeredEpicResponse=" + this.hearinglossMedicinesAdministeredEpicResponse
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(HearingLossMedicines, hearinglossMedicinesAdministeredEpicResponse);
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
		if (!(obj instanceof HearingLoss)) {
			return false;
		}
		HearingLoss other = (HearingLoss) obj;
		return Objects.equals(HearingLossMedicines, other.HearingLossMedicines)
				&& hearinglossMedicinesAdministeredEpicResponse == other.hearinglossMedicinesAdministeredEpicResponse;
	}

}
