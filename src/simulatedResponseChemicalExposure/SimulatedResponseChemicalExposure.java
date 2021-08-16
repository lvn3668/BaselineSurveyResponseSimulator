/**
 *  @author Lalitha Viswanathan
 *  Affiliation: MAVERIC / VABHS 
 */
package simulatedResponseChemicalExposure;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import randomizer.UniformDistribution;

public class SimulatedResponseChemicalExposure {

	// For Chemical Exposure, possible values are 0,1, 2
	// Hence value from 3 to 10 is set as error response temporarily
	/**
	*
	*/
	private static int errorResponse;
	/**
	*
	*/
	private static final int maxToGenerateErrorVal = 10;
	/**
	*
	*/
	private static final int minToGenerateErrorVal = 3;

	/**
	 * @return the errorresponse
	 */
	/**
	 * @return
	 */
	private static int getErrorresponse() {
		try {
			return errorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return errorResponse;

	}

	/**
	 * @return the getMaxToGenerateErrorVal()
	 */
	/**
	 * @return
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
	/**
	 * @return
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
		SimulatedResponseChemicalExposure.errorResponse = errorResponse;
	}

	/**
	 *
	 */
	private ValueRange ExposurePyrBrValueRange;

	/**
	 *
	 */
	private int exposurePyrByrsimulatedresponse;

	/**
	 *
	 */
	private int exposureToAgentOSimulatedResponse;

	// Move these to exposure package
	/**
	*
	*/
	private ValueRange ExposureToAgentOValueRange;

	/**
	 *
	 */
	private int exposureToAnthraxsimulatedresponse;

	/**
	 *
	 */
	private ValueRange ExposureToAnthraxValueRange;

	/**
	 *
	 */
	private ValueRange ExposureToChemBioAgentsValueRange;

	/**
	 *
	 */
	private int exposureToChemicalBioAgentssimulatedresponse;

	/**
	 *
	 */
	private UniformDistribution uniformDistribution;

	/**
	 *
	 */
	private Utilities utilities;

	/**
	 * @throws Exception
	 */
	public SimulatedResponseChemicalExposure() throws Exception {
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(
					new UniformDistribution(SimulatedResponseChemicalExposure.getMinToGenerateErrorVal(),
							SimulatedResponseChemicalExposure.getMaxToGenerateErrorVal()));
			SimulatedResponseChemicalExposure.setErrorResponse(
					this.getUtilities().randBetween(SimulatedResponseChemicalExposure.getMinToGenerateErrorVal(),
							SimulatedResponseChemicalExposure.getMaxToGenerateErrorVal()));
			this.setExposureToAgentOValueRange(ValueRange.of(0, 2));
			this.setExposureToAgentOSimulatedResponse(SimulatedResponseChemicalExposure.getErrorresponse());
			this.setExposureToChemBioAgentsValueRange(ValueRange.of(0, 2));
			this.setExposureToChemicalBioAgentssimulatedresponse(SimulatedResponseChemicalExposure.getErrorresponse());
			this.setExposureToAnthraxValueRange(ValueRange.of(0, 2));
			this.setExposureToAnthraxsimulatedresponse(SimulatedResponseChemicalExposure.getErrorresponse());
			this.setExposurePyrBrValueRange(ValueRange.of(0, 2));
			this.setExposurePyrBrsimulatedresponse(SimulatedResponseChemicalExposure.getErrorresponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}

	// Overloaded constructor
	/**
	 * @param valuerangeagento
	 * @param simulatedresponseagento
	 * @param valuerangechembioagents
	 * @param simulatedresponsechembioagents
	 * @param valuerangeanthrax
	 * @param simulatedresponseanthrax
	 * @param valuerangepyrbr
	 * @param simulatedresponsepyrbr
	 * @throws Exception
	 */
	public SimulatedResponseChemicalExposure(ValueRange valuerangeagento, int simulatedresponseagento,
			ValueRange valuerangechembioagents, int simulatedresponsechembioagents, ValueRange valuerangeanthrax,
			int simulatedresponseanthrax, ValueRange valuerangepyrbr, int simulatedresponsepyrbr) throws Exception {
		try {
			this.utilities = new Utilities();
			this.uniformDistribution = new UniformDistribution(
					SimulatedResponseChemicalExposure.getMinToGenerateErrorVal(),
					SimulatedResponseChemicalExposure.getMaxToGenerateErrorVal());
			SimulatedResponseChemicalExposure.errorResponse = this.getUtilities().randBetween(
					SimulatedResponseChemicalExposure.getMinToGenerateErrorVal(),
					SimulatedResponseChemicalExposure.getMaxToGenerateErrorVal());
			this.setExposureToAgentOValueRange(valuerangeagento);
			this.setExposureToAgentOSimulatedResponse(simulatedresponseagento);
			this.setExposureToChemBioAgentsValueRange(valuerangechembioagents);
			this.setExposureToChemicalBioAgentssimulatedresponse(simulatedresponsechembioagents);
			this.setExposureToAnthraxValueRange(valuerangeanthrax);
			this.setExposureToAnthraxsimulatedresponse(simulatedresponseanthrax);
			this.setExposurePyrBrValueRange(valuerangepyrbr);
			this.setExposurePyrBrsimulatedresponse(simulatedresponsepyrbr);
			this.utilities = new Utilities();
			this.uniformDistribution = new UniformDistribution();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * @return the exposurePyrByrsimulatedresponse
	 */
	/**
	 * @return
	 */
	public int getExposurePyrBrsimulatedresponse() {
		try {
			return this.exposurePyrByrsimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.exposurePyrByrsimulatedresponse;
	}

	/**
	 * @return the exposurePyrBr
	 */
	/**
	 * @return
	 */
	private ValueRange getExposurePyrBrValueRange() {
		try {
			return this.ExposurePyrBrValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ExposurePyrBrValueRange;
	}

	/**
	 * @return the exposurePyrByrsimulatedresponse
	 */
	public int getExposurePyrByrsimulatedresponse() {
		return this.exposurePyrByrsimulatedresponse;
	}

	/**
	 * @return the exposureToAgentOSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getExposureToAgentOSimulatedResponse() {
		try {
			return this.exposureToAgentOSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.exposureToAgentOSimulatedResponse;
	}

	/**
	 * @return the exposureToAgentO
	 */
	/**
	 * @return
	 */
	private ValueRange getExposureToAgentOValueRange() {
		try {
			return this.ExposureToAgentOValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ExposureToAgentOValueRange;

	}

	/**
	 * @return the exposureToAnthraxsimulatedresponse
	 */
	/**
	 * @return
	 */
	public int getExposureToAnthraxsimulatedresponse() {
		try {
			return this.exposureToAnthraxsimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.exposureToAnthraxsimulatedresponse;

	}

	/**
	 * @return the exposureToAnthrax
	 */
	/**
	 * @return
	 */
	private ValueRange getExposureToAnthraxValueRange() {
		try {
			return this.ExposureToAnthraxValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ExposureToAnthraxValueRange;

	}

	/**
	 * @return the exposureToChemBioAgents
	 */
	/**
	 * @return
	 */
	private ValueRange getExposureToChemBioAgentsValueRange() {
		try {
			return this.ExposureToChemBioAgentsValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ExposureToChemBioAgentsValueRange;

	}

	/**
	 * @return the exposureToChemicalBioAgentssimulatedresponse
	 */
	/**
	 * @return
	 */
	public int getExposureToChemicalBioAgentssimulatedresponse() {
		try {
			return this.exposureToChemicalBioAgentssimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.exposureToChemicalBioAgentssimulatedresponse;

	}

	/**
	 * @return the uniformDistribution
	 */
	/**
	 * @return
	 */
	private UniformDistribution getUniformDistribution() {
		try {
			return this.uniformDistribution;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.uniformDistribution;

	}

	/**
	 * @return the utilities
	 */
	/**
	 * @return
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
	 * @param exposurePyrByrsimulatedresponse the exposurePyrByrsimulatedresponse to
	 *                                        set
	 */
	/**
	 * @param exposurePyrByrsimulatedresponse
	 */
	private void setExposurePyrBrsimulatedresponse(int exposurePyrByrsimulatedresponse) {
		try {
			this.exposurePyrByrsimulatedresponse = exposurePyrByrsimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * @param exposurePyrBr the exposurePyrBr to set
	 */
	/**
	 * @param exposurePyrBr
	 */
	private void setExposurePyrBrValueRange(ValueRange exposurePyrBr) {
		try {
			this.ExposurePyrBrValueRange = exposurePyrBr;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param exposureToAgentOSimulatedResponse the
	 *                                          exposureToAgentOSimulatedResponse to
	 *                                          set
	 */
	/**
	 * @param exposureToAgentOSimulatedResponse
	 */
	private void setExposureToAgentOSimulatedResponse(int exposureToAgentOSimulatedResponse) {
		try {
			this.exposureToAgentOSimulatedResponse = exposureToAgentOSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param exposureToAgentO the exposureToAgentO to set
	 */
	/**
	 * @param exposureToAgentO
	 */
	private void setExposureToAgentOValueRange(ValueRange exposureToAgentO) {
		try {
			this.ExposureToAgentOValueRange = exposureToAgentO;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param exposureToAnthraxsimulatedresponse the
	 *                                           exposureToAnthraxsimulatedresponse
	 *                                           to set
	 */
	/**
	 * @param exposureToAnthraxsimulatedresponse
	 */
	private void setExposureToAnthraxsimulatedresponse(int exposureToAnthraxsimulatedresponse) {
		try {
			this.exposureToAnthraxsimulatedresponse = exposureToAnthraxsimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param exposureToAnthrax the exposureToAnthrax to set
	 */
	/**
	 * @param exposureToAnthrax
	 */
	private void setExposureToAnthraxValueRange(ValueRange exposureToAnthrax) {
		try {
			this.ExposureToAnthraxValueRange = exposureToAnthrax;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param exposureToChemBioAgents the exposureToChemBioAgents to set
	 */
	/**
	 * @param exposureToChemBioAgents
	 */
	private void setExposureToChemBioAgentsValueRange(ValueRange exposureToChemBioAgents) {
		try {
			this.ExposureToChemBioAgentsValueRange = exposureToChemBioAgents;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param exposureToChemicalBioAgentssimulatedresponse the
	 *                                                     exposureToChemicalBioAgentssimulatedresponse
	 *                                                     to set
	 */
	/**
	 * @param exposureToChemicalBioAgentssimulatedresponse
	 */
	private void setExposureToChemicalBioAgentssimulatedresponse(int exposureToChemicalBioAgentssimulatedresponse) {
		try {
			this.exposureToChemicalBioAgentssimulatedresponse = exposureToChemicalBioAgentssimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param uniformDistribution the uniformDistribution to set
	 */
	/**
	 * @param uniformDistribution
	 */
	private void setUniformDistribution(UniformDistribution uniformDistribution) {
		try {
			this.uniformDistribution = uniformDistribution;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param utilities the utilities to set
	 */
	/**
	 * @param utilities
	 */
	private void setUtilities(Utilities utilities) {
		try {
			this.utilities = utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	public void simulateChemicalExposureResponseVariables() throws Exception {
		try {
			this.simulateExposurePyrBr(this.getExposurePyrBrValueRange(),
					SimulatedResponseChemicalExposure.getErrorresponse());
			this.simulateExposureToAgentO(this.getExposureToAgentOValueRange(),
					SimulatedResponseChemicalExposure.getErrorresponse());
			this.simulateExposureToAnthrax(this.getExposureToAnthraxValueRange(),
					SimulatedResponseChemicalExposure.getErrorresponse());
			this.simulateExposureToChemBioAgents(this.getExposureToChemBioAgentsValueRange(),
					SimulatedResponseChemicalExposure.getErrorresponse());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Simulate for each variable
	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	public int simulateExposurePyrBr(ValueRange valuerange, int simulatedresponse) throws Exception {
		try {
			this.setExposurePyrBrValueRange(valuerange);
			this.setExposurePyrBrsimulatedresponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseChemicalExposure.getMinToGenerateErrorVal(),
							SimulatedResponseChemicalExposure.getMaxToGenerateErrorVal())))) {
				this.setExposurePyrBrsimulatedresponse(
						this.getUtilities().randBetween((int) this.getExposurePyrBrValueRange().getMinimum(),
								(int) this.getExposurePyrBrValueRange().getMaximum()));
				return this.getExposurePyrBrsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

		return simulatedresponse;
	}

	// Simulate for each variable
	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	public int simulateExposureToAgentO(ValueRange valuerange, int simulatedresponse) throws Exception {
		try {
			this.setExposureToAgentOValueRange(valuerange);
			this.setExposureToAgentOSimulatedResponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseChemicalExposure.getMinToGenerateErrorVal(),
							SimulatedResponseChemicalExposure.getMaxToGenerateErrorVal())))) {
				this.setExposureToAgentOSimulatedResponse(
						this.getUtilities().randBetween((int) this.getExposureToAgentOValueRange().getMinimum(),
								(int) this.getExposureToAgentOValueRange().getMaximum()));
				return this.getExposureToAgentOSimulatedResponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		// TBD: Correct what simulation function is returning
		return simulatedresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	public int simulateExposureToAnthrax(ValueRange valuerange, int simulatedresponse) throws Exception {
		try {
			this.setExposureToAnthraxValueRange(valuerange);
			this.setExposureToAnthraxsimulatedresponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseChemicalExposure.getMinToGenerateErrorVal(),
							SimulatedResponseChemicalExposure.getMaxToGenerateErrorVal())))) {
				this.setExposureToAnthraxsimulatedresponse(
						this.getUtilities().randBetween((int) this.getExposureToAnthraxValueRange().getMinimum(),
								(int) this.getExposureToAnthraxValueRange().getMaximum()));
				return this.getExposureToAnthraxsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		// TBD: Correct what simulation function is returning
		return this.getExposureToAnthraxsimulatedresponse();
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	public int simulateExposureToChemBioAgents(ValueRange valuerange, int simulatedresponse) throws Exception {
		try {
			this.setExposureToChemBioAgentsValueRange(valuerange);
			this.setExposureToChemicalBioAgentssimulatedresponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseChemicalExposure.getMinToGenerateErrorVal(),
							SimulatedResponseChemicalExposure.getMaxToGenerateErrorVal())))) {
				this.setExposureToChemicalBioAgentssimulatedresponse(
						this.getUtilities().randBetween((int) this.getExposureToChemBioAgentsValueRange().getMinimum(),
								(int) this.getExposureToChemBioAgentsValueRange().getMaximum()));
				return this.getExposureToChemicalBioAgentssimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		// TBD: Correct what simulation function is returning
		return simulatedresponse;
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "SimulatedResponseChemicalExposure [ExposureToAgentOValueRange=" + this.ExposureToAgentOValueRange
				+ ", exposureToAgentOSimulatedResponse=" + this.exposureToAgentOSimulatedResponse
				+ ", ExposureToChemBioAgentsValueRange=" + this.ExposureToChemBioAgentsValueRange
				+ ", exposureToChemicalBioAgentssimulatedresponse=" + this.exposureToChemicalBioAgentssimulatedresponse
				+ ", ExposureToAnthraxValueRange=" + this.ExposureToAnthraxValueRange
				+ ", exposureToAnthraxsimulatedresponse=" + this.exposureToAnthraxsimulatedresponse
				+ ", ExposurePyrBrValueRange=" + this.ExposurePyrBrValueRange + ", exposurePyrByrsimulatedresponse="
				+ this.exposurePyrByrsimulatedresponse + ", utilities=" + this.utilities + ", uniformDistribution="
				+ this.uniformDistribution + "]";
	}

}
