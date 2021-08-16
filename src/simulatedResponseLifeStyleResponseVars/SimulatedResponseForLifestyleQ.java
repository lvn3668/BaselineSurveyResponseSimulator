/**
 * @author Lalitha Viswanathan
 * Affiliation: MAVERIC / VABHS 
 */

package simulatedResponseLifeStyleResponseVars;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import randomizer.UniformDistribution;

public class SimulatedResponseForLifestyleQ {
	// Move these to lifestyle package
	private static int errorResponse;
	private static int maxToGenerateErrorVal = 16;
	private static int minToGenerateErrorVal = 8;

	/**
	 * @return the errorresponse
	 */
	private static int getErrorResponse() {
		try {
			return errorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return errorResponse;

	}

	/**
	 * @return the maxToGenerateErrorVal
	 */
	private static int getMaxToGenerateErrorVal() {
		try {
			return maxToGenerateErrorVal;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maxToGenerateErrorVal;

	}

	/**
	 * @return the minToGenerateErrorVal
	 */
	private static int getMinToGenerateErrorVal() {
		try {
			return minToGenerateErrorVal;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return minToGenerateErrorVal;

	}

	/**
	 * @param errorResponse the errorResponse to set
	 */
	private static void setErrorResponse(int errorResponse) {
		SimulatedResponseForLifestyleQ.errorResponse = errorResponse;
	}

	/**
	 * @param maxToGenerateErrorVal the maxToGenerateErrorVal to set
	 */
	private static void setMaxToGenerateErrorVal(int maxToGenerateErrorVal) {
		try {
			SimulatedResponseForLifestyleQ.maxToGenerateErrorVal = maxToGenerateErrorVal;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param minToGenerateErrorVal the minToGenerateErrorVal to set
	 */
	private static void setMinToGenerateErrorVal(int minToGenerateErrorVal) {
		try {
			SimulatedResponseForLifestyleQ.minToGenerateErrorVal = minToGenerateErrorVal;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int activeExercisesimulatedresponse;
	private ValueRange ActiveExerciseValueRange;
	private int activeStatussimulatedresponse;
	private ValueRange ActiveStatusValueRange;
	private int activeWorksimulatedresponse;
	private ValueRange ActiveWorkValueRange;
	private int alcoholBingesimulatedresponse;
	private ValueRange AlcoholBingeValueRange;
	private int alcoholFrequencysimulatedresponse;
	private ValueRange AlcoholFrequencyValueRange;
	private int alcoholQuantitysimulatedresponse;
	private ValueRange AlcoholQuantityValueRange;
	private int smoke100cigarettessimulatedresponse;
	private ValueRange Smoke100cigarettesValueRange;
	private int smokedailysimulatedresponse;
	private ValueRange SmokeDailyValueRange;
	private int smokenowsimulatedresponse;

	private ValueRange SmokeNowValueRange;

	private UniformDistribution uniformdistribution;

	private Utilities utilities;

	public SimulatedResponseForLifestyleQ() {
		// TODO Auto-generated constructor stub

		try {
			SimulatedResponseForLifestyleQ
					.setMinToGenerateErrorVal(SimulatedResponseForLifestyleQ.getMinToGenerateErrorVal());
			SimulatedResponseForLifestyleQ
					.setMaxToGenerateErrorVal(SimulatedResponseForLifestyleQ.getMaxToGenerateErrorVal());
			this.setUtilities(new Utilities());
			SimulatedResponseForLifestyleQ.setErrorResponse(
					this.getUtilities().randBetween(SimulatedResponseForLifestyleQ.getMinToGenerateErrorVal(),
							SimulatedResponseForLifestyleQ.getMaxToGenerateErrorVal()));
			this.setUniformdistribution(
					new UniformDistribution(SimulatedResponseForLifestyleQ.getMinToGenerateErrorVal(),
							SimulatedResponseForLifestyleQ.getMaxToGenerateErrorVal()));
			this.setActiveWorkValueRange(ValueRange.of(1, 4));
			this.setActiveWorksimulatedresponse(SimulatedResponseForLifestyleQ.getErrorResponse());
			this.setActiveStatusValueRange(ValueRange.of(1, 5));
			this.setActiveStatussimulatedresponse(SimulatedResponseForLifestyleQ.getErrorResponse());
			this.setActiveExerciseValueRange(ValueRange.of(1, 6));
			this.setActiveExercisesimulatedresponse(SimulatedResponseForLifestyleQ.getErrorResponse());
			this.setAlcoholFrequencyValueRange(ValueRange.of(1, 5));
			this.setAlcoholFrequencysimulatedresponse(SimulatedResponseForLifestyleQ.getErrorResponse());
			this.setAlcoholQuantityValueRange(ValueRange.of(1, 5));
			this.setAlcoholQuantitysimulatedresponse(SimulatedResponseForLifestyleQ.getErrorResponse());
			this.setAlcoholBingeValueRange(ValueRange.of(1, 5));
			this.setAlcoholBingesimulatedresponse(SimulatedResponseForLifestyleQ.getErrorResponse());
			this.setSmoke100cigarettesValueRange(ValueRange.of(0, 1));
			this.setSmoke100cigarettessimulatedresponse(SimulatedResponseForLifestyleQ.getErrorResponse());
			this.setSmokeDailyValueRange(ValueRange.of(0, 1));
			this.setSmokedailysimulatedresponse(SimulatedResponseForLifestyleQ.getErrorResponse());
			this.setSmokeNowValueRange(ValueRange.of(1, 3));
			this.setSmokenowsimulatedresponse(SimulatedResponseForLifestyleQ.getErrorResponse());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the activeExercisesimulatedresponse
	 */
	public int getActiveExercisesimulatedresponse() {
		try {
			return this.activeExercisesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.activeExercisesimulatedresponse;

	}

	/**
	 * @return the activeExercise
	 */
	private ValueRange getActiveExerciseValueRange() {
		try {
			return this.ActiveExerciseValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ActiveExerciseValueRange;
	}

	/**
	 * @return the activeStatussimulatedresponse
	 */
	public int getActiveStatussimulatedresponse() {
		try {
			return this.activeStatussimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.activeStatussimulatedresponse;

	}

	/**
	 * @return the activeStatus
	 */
	private ValueRange getActiveStatusValueRange() {
		try {
			return this.ActiveStatusValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ActiveStatusValueRange;

	}

	/**
	 * @return the activeWorksimulatedresponse
	 */
	public int getActiveWorksimulatedresponse() {
		try {
			return this.activeWorksimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.activeWorksimulatedresponse;

	}

	/**
	 * @return the activeWork
	 */
	private ValueRange getActiveWorkValueRange() {
		try {
			return this.ActiveWorkValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ActiveWorkValueRange;

	}

	/**
	 * @return the alcoholBingesimulatedresponse
	 */
	public int getAlcoholBingesimulatedresponse() {
		try {
			return this.alcoholBingesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.alcoholBingesimulatedresponse;

	}

	/**
	 * @return the alcoholBinge
	 */
	private ValueRange getAlcoholBingeValueRange() {
		try {
			return this.AlcoholBingeValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AlcoholBingeValueRange;

	}

	/**
	 * @return the alcoholFrequencysimulatedresponse
	 */
	public int getAlcoholFrequencysimulatedresponse() {
		try {
			return this.alcoholFrequencysimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.alcoholFrequencysimulatedresponse;

	}

	/**
	 * @return the alcoholFrequency
	 */
	private ValueRange getAlcoholFrequencyValueRange() {
		try {
			return this.AlcoholFrequencyValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AlcoholFrequencyValueRange;

	}

	/**
	 * @return the alcoholQuantitysimulatedresponse
	 */
	public int getAlcoholQuantitysimulatedresponse() {
		try {
			return this.alcoholQuantitysimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.alcoholQuantitysimulatedresponse;

	}

	/**
	 * @return the alcoholoQuantity
	 */
	private ValueRange getAlcoholQuantityValueRange() {
		try {
			return this.AlcoholQuantityValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AlcoholQuantityValueRange;

	}

	/**
	 * @return the smoke100cigarettessimulatedresponse
	 */
	public int getSmoke100cigarettessimulatedresponse() {
		try {
			return this.smoke100cigarettessimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.smoke100cigarettessimulatedresponse;

	}

	/**
	 * @return the smoke100cigarettes
	 */
	private ValueRange getSmoke100cigarettesValueRange() {
		try {
			return this.Smoke100cigarettesValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.Smoke100cigarettesValueRange;

	}

	/**
	 * @return the smokedailysimulatedresponse
	 */
	public int getSmokedailysimulatedresponse() {
		try {
			return this.smokedailysimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.smokedailysimulatedresponse;

	}

	/**
	 * @return the smokeDaily
	 */
	private ValueRange getSmokeDailyValueRange() {
		try {
			return this.SmokeDailyValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SmokeDailyValueRange;

	}

	/**
	 * @return the smokenowsimulatedresponse
	 */
	public int getSmokenowsimulatedresponse() {
		try {
			return this.smokenowsimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.smokenowsimulatedresponse;

	}

	/**
	 * @return the smokeNow
	 */
	private ValueRange getSmokeNowValueRange() {
		try {
			return this.SmokeNowValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SmokeNowValueRange;

	}

	/**
	 * @return the uniformdistribution
	 */
	private UniformDistribution getUniformdistribution() {
		try {
			return this.uniformdistribution;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.uniformdistribution;
	}

	/**
	 * @return the utilities
	 */
	private Utilities getUtilities() {
		try {
			return this.utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.utilities;

	}

	/**
	 * @param activeExercisesimulatedresponse the activeExercisesimulatedresponse to
	 *                                        set
	 */
	private void setActiveExercisesimulatedresponse(int activeExercisesimulatedresponse) {
		try {
			this.activeExercisesimulatedresponse = activeExercisesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param activeExercise the activeExercise to set
	 */
	private void setActiveExerciseValueRange(ValueRange activeExercise) {
		try {
			this.ActiveExerciseValueRange = activeExercise;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param activeStatussimulatedresponse the activeStatussimulatedresponse to set
	 */
	private void setActiveStatussimulatedresponse(int activeStatussimulatedresponse) {
		try {
			this.activeStatussimulatedresponse = activeStatussimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param activeStatus the activeStatus to set
	 */
	private void setActiveStatusValueRange(ValueRange activeStatus) {
		try {
			this.ActiveStatusValueRange = activeStatus;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param activeWorksimulatedresponse the activeWorksimulatedresponse to set
	 */
	private void setActiveWorksimulatedresponse(int activeWorksimulatedresponse) {
		try {
			this.activeWorksimulatedresponse = activeWorksimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param activeWork the activeWork to set
	 */
	private void setActiveWorkValueRange(ValueRange activeWork) {
		try {
			this.ActiveWorkValueRange = activeWork;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param alcoholBingesimulatedresponse the alcoholBingesimulatedresponse to set
	 */
	private void setAlcoholBingesimulatedresponse(int alcoholBingesimulatedresponse) {
		try {
			this.alcoholBingesimulatedresponse = alcoholBingesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param alcoholBinge the alcoholBinge to set
	 */
	private void setAlcoholBingeValueRange(ValueRange alcoholBinge) {
		try {
			this.AlcoholBingeValueRange = alcoholBinge;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param alcoholFrequencysimulatedresponse the
	 *                                          alcoholFrequencysimulatedresponse to
	 *                                          set
	 */
	private void setAlcoholFrequencysimulatedresponse(int alcoholFrequencysimulatedresponse) {
		try {
			this.alcoholFrequencysimulatedresponse = alcoholFrequencysimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param alcoholFrequency the alcoholFrequency to set
	 */
	private void setAlcoholFrequencyValueRange(ValueRange alcoholFrequency) {
		try {
			this.AlcoholFrequencyValueRange = alcoholFrequency;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param alcoholQuantitysimulatedresponse the alcoholQuantitysimulatedresponse
	 *                                         to set
	 */
	private void setAlcoholQuantitysimulatedresponse(int alcoholoQuantitysimulatedresponse) {
		try {
			this.alcoholQuantitysimulatedresponse = alcoholoQuantitysimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param alcoholoQuantity the alcoholoQuantity to set
	 */
	private void setAlcoholQuantityValueRange(ValueRange alcoholoQuantity) {
		try {
			this.AlcoholQuantityValueRange = alcoholoQuantity;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param smoke100cigarettessimulatedresponse the
	 *                                            smoke100cigarettessimulatedresponse
	 *                                            to set
	 */
	private void setSmoke100cigarettessimulatedresponse(int smoke100cigarettessimulatedresponse) {
		try {
			this.smoke100cigarettessimulatedresponse = smoke100cigarettessimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param smoke100cigarettes the smoke100cigarettes to set
	 */
	private void setSmoke100cigarettesValueRange(ValueRange smoke100cigarettes) {
		try {
			this.Smoke100cigarettesValueRange = smoke100cigarettes;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param smokedailysimulatedresponse the smokedailysimulatedresponse to set
	 */
	private void setSmokedailysimulatedresponse(int smokedailysimulatedresponse) {
		try {
			this.smokedailysimulatedresponse = smokedailysimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param smokeDaily the smokeDaily to set
	 */
	private void setSmokeDailyValueRange(ValueRange smokeDaily) {
		try {
			this.SmokeDailyValueRange = smokeDaily;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param smokenowsimulatedresponse the smokenowsimulatedresponse to set
	 */
	private void setSmokenowsimulatedresponse(int smokenowsimulatedresponse) {
		try {
			this.smokenowsimulatedresponse = smokenowsimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param smokeNow the smokeNow to set
	 */
	private void setSmokeNowValueRange(ValueRange smokeNow) {
		try {
			this.SmokeNowValueRange = smokeNow;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uniformdistribution the uniformdistribution to set
	 */
	private void setUniformdistribution(UniformDistribution uniformdistribution) {
		try {
			this.uniformdistribution = uniformdistribution;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param utilities the utilities to set
	 */
	private void setUtilities(Utilities utilities) {
		try {
			this.utilities = utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int simulateActiveExerciseResponse(ValueRange valuerange, int errorresponse) {
		try {
			this.setActiveExerciseValueRange(valuerange);
			this.setActiveExercisesimulatedresponse(errorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseForLifestyleQ.minToGenerateErrorVal,
							SimulatedResponseForLifestyleQ.maxToGenerateErrorVal)))) {
				this.setActiveExercisesimulatedresponse(
						this.getUtilities().randBetween((int) this.getActiveExerciseValueRange().getMinimum(),
								(int) this.getActiveExerciseValueRange().getMaximum()));
				return this.getActiveExercisesimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return errorresponse;

	}

	public int simulateActiveStatusResponse(ValueRange valuerange, int errorresponse) {
		try {
			this.setActiveStatusValueRange(valuerange);
			this.setActiveStatussimulatedresponse(errorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseForLifestyleQ.minToGenerateErrorVal,
							SimulatedResponseForLifestyleQ.maxToGenerateErrorVal)))) {
				this.setActiveStatussimulatedresponse(
						this.getUtilities().randBetween((int) this.getActiveStatusValueRange().getMinimum(),
								(int) this.getActiveStatusValueRange().getMaximum()));
				return this.getActiveStatussimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return errorresponse;
	}

	public int simulateActiveWorkResponse(ValueRange valuerange, int errorresponse) {
		try {
			this.setActiveWorkValueRange(valuerange);
			this.setActiveWorksimulatedresponse(errorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseForLifestyleQ.minToGenerateErrorVal,
							SimulatedResponseForLifestyleQ.maxToGenerateErrorVal)))) {
				this.setActiveWorksimulatedresponse(
						this.getUtilities().randBetween((int) this.getActiveWorkValueRange().getMinimum(),
								(int) this.getActiveWorkValueRange().getMaximum()));
				return this.getActiveWorksimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return errorresponse;
	}

	public int simulateAlcoholBingeResponse(ValueRange valuerange, int errorresponse) {
		try {
			this.setAlcoholBingeValueRange(valuerange);
			this.setAlcoholBingesimulatedresponse(errorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseForLifestyleQ.minToGenerateErrorVal,
							SimulatedResponseForLifestyleQ.maxToGenerateErrorVal)))) {
				this.setAlcoholBingesimulatedresponse(
						this.getUtilities().randBetween((int) this.getAlcoholBingeValueRange().getMinimum(),
								(int) this.getAlcoholBingeValueRange().getMaximum()));
				return this.getAlcoholBingesimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return errorresponse;
	}

	public int simulateAlcoholFrequencyResponse(ValueRange valuerange, int errorresponse) {
		try {
			this.setAlcoholFrequencyValueRange(valuerange);
			this.setAlcoholFrequencysimulatedresponse(errorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseForLifestyleQ.minToGenerateErrorVal,
							SimulatedResponseForLifestyleQ.maxToGenerateErrorVal)))) {
				this.setAlcoholFrequencysimulatedresponse(
						this.getUtilities().randBetween((int) this.getAlcoholFrequencyValueRange().getMinimum(),
								(int) this.getAlcoholFrequencyValueRange().getMaximum()));
				return this.getAlcoholFrequencysimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return errorresponse;

	}

	public int simulateAlcoholQuantityResponse(ValueRange valuerange, int errorresponse) {
		try {
			this.setAlcoholQuantityValueRange(valuerange);
			this.setAlcoholQuantitysimulatedresponse(errorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseForLifestyleQ.minToGenerateErrorVal,
							SimulatedResponseForLifestyleQ.maxToGenerateErrorVal)))) {
				this.setAlcoholQuantitysimulatedresponse(
						this.getUtilities().randBetween((int) this.getAlcoholQuantityValueRange().getMinimum(),
								(int) this.getAlcoholQuantityValueRange().getMaximum()));
				return this.getAlcoholQuantitysimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return errorresponse;

	}

	public void simulateLifeStyleQResponseVariables() throws Exception {
		try {
			this.simulateActiveExerciseResponse(this.getActiveExerciseValueRange(),
					SimulatedResponseForLifestyleQ.getErrorResponse());
			this.simulateActiveStatusResponse(this.getActiveStatusValueRange(),
					SimulatedResponseForLifestyleQ.getErrorResponse());
			this.simulateActiveWorkResponse(this.getActiveWorkValueRange(),
					SimulatedResponseForLifestyleQ.getErrorResponse());
			this.simulateAlcoholBingeResponse(this.getAlcoholBingeValueRange(),
					SimulatedResponseForLifestyleQ.getErrorResponse());
			this.simulateAlcoholFrequencyResponse(this.getAlcoholFrequencyValueRange(),
					SimulatedResponseForLifestyleQ.getErrorResponse());
			this.simulateAlcoholQuantityResponse(this.getAlcoholQuantityValueRange(),
					SimulatedResponseForLifestyleQ.getErrorResponse());
			this.simulateSmoke100cigarettesResponse(this.getSmoke100cigarettesValueRange(),
					SimulatedResponseForLifestyleQ.getErrorResponse());
			this.simulateSmokeDailyResponse(this.getSmokeDailyValueRange(),
					SimulatedResponseForLifestyleQ.getErrorResponse());
			this.simulateSmokeNowResponse(this.getSmokeNowValueRange(),
					SimulatedResponseForLifestyleQ.getErrorResponse());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public int simulateSmoke100cigarettesResponse(ValueRange valuerange, int errorresponse) {
		try {
			this.setSmoke100cigarettesValueRange(valuerange);
			this.setSmoke100cigarettessimulatedresponse(errorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseForLifestyleQ.minToGenerateErrorVal,
							SimulatedResponseForLifestyleQ.maxToGenerateErrorVal)))) {
				this.setSmoke100cigarettessimulatedresponse(
						this.getUtilities().randBetween((int) this.getSmoke100cigarettesValueRange().getMinimum(),
								(int) this.getSmoke100cigarettesValueRange().getMaximum()));
				return this.getSmoke100cigarettessimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return errorresponse;

	}

	public int simulateSmokeDailyResponse(ValueRange valuerange, int errorresponse) {
		try {
			this.setSmokeDailyValueRange(valuerange);
			this.setSmokedailysimulatedresponse(errorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseForLifestyleQ.minToGenerateErrorVal,
							SimulatedResponseForLifestyleQ.maxToGenerateErrorVal)))) {
				this.setSmokedailysimulatedresponse(
						this.getUtilities().randBetween((int) this.getSmokeDailyValueRange().getMinimum(),
								(int) this.getSmokeDailyValueRange().getMaximum()));
				return this.getSmokedailysimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return errorresponse;

	}

	public int simulateSmokeNowResponse(ValueRange valuerange, int errorresponse) {
		try {
			this.setSmokeNowValueRange(valuerange);
			this.setSmokenowsimulatedresponse(errorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseForLifestyleQ.minToGenerateErrorVal,
							SimulatedResponseForLifestyleQ.maxToGenerateErrorVal)))) {
				this.setSmokenowsimulatedresponse(
						this.getUtilities().randBetween((int) this.getSmokeNowValueRange().getMinimum(),
								(int) this.getSmokeNowValueRange().getMaximum()));
				return this.getSmokenowsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return errorresponse;

	}

}
