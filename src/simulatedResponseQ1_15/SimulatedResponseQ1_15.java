// Author: Lalitha Viswanathan
// Affiliation: MAVERIC (VA BHS)

/**
 * @author Lalitha Viswanathan
 * Affiliation: MAVERIC / VABHS
 */
package simulatedResponseQ1_15;

import java.time.temporal.ValueRange;
import java.util.Random;

import Utilities.Utilities;
import randomizer.UniformDistribution;

public class SimulatedResponseQ1_15 {

	// Different error responses for different variables
	// Anything not in valuerange is error;\
	// TBD
	/**
	 *
	 */
	private static int errorResponse;
	/**
	 *
	 */
	private static int maxValToGenerateErrorResponse = 10;
	/**
	 *
	 */
	private static int minValToGenerateErrorResponse = 7;

	/**
	 * @return the errorResponse
	 */
	/**
	 * @return
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
	 * @return the maxValToGenerateErrorResponse
	 */
	/**
	 * @return
	 */
	private static int getMaxValToGenerateErrorResponse() {
		try {
			return maxValToGenerateErrorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return errorResponse;
	}

	/**
	 * @return the minValToGenerateErrorResponse
	 */
	/**
	 * @return
	 */
	private static int getMinValToGenerateErrorResponse() {
		try {
			return minValToGenerateErrorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return minValToGenerateErrorResponse;
	}

	/**
	*
	*/
	private UniformDistribution uniformdistribution;
	/**
	*
	*/
	private Utilities utilities;

	/**
	 *
	 */
	private int vr12Q10simulatedresponse;

	/**
	 *
	 */
	private ValueRange vr12Q10ValueRange;

	/**
	 *
	 */
	private int vr12Q11simulatedresponse;

	/**
	 *
	 */
	private ValueRange vr12Q11ValueRange;

	/**
	 *
	 */
	private int vr12Q12simulatedresponse;

	/**
	 *
	 */
	private ValueRange vr12Q12ValueRange;

	/**
	 *
	 */
	private int vr12Q13simulatedresponse;

	/**
	 *
	 */
	private ValueRange vr12Q13ValueRange;

	/**
	 *
	 */
	private int vr12Q14simulatedresponse;

	/**
	 *
	 */
	private ValueRange vr12Q14ValueRange;

	/**
	 *
	 */
	private int vr12Q15simulatedresponse;

	/**
	 *
	 */
	private ValueRange vr12Q15ValueRange;

	/**
	 *
	 */
	private int vr12Q1simulatedresponse;

	// Move the response for these questions to Utilities package
	/**
	*
	*/
	private ValueRange vr12Q1ValueRange;

	/**
	 *
	 */
	private int vr12Q2simulatedresponse;

	/**
	 *
	 */
	private ValueRange vr12Q2ValueRange;

	/**
	 *
	 */
	private int vr12Q3simulatedresponse;

	/**
	 *
	 */
	private ValueRange vr12Q3ValueRange;

	/**
	 *
	 */
	private int vr12Q4simulatedresponse;

	/**
	 *
	 */
	private ValueRange vr12Q4ValueRange;
	/**
	*
	*/
	private int vr12Q5simulatedresponse;
	/**
	*
	*/
	private ValueRange vr12Q5ValueRange;
	/**
	*
	*/
	private int vr12Q6simulatedresponse;
	/**
	*
	*/
	private ValueRange vr12Q6ValueRange;
	/**
	*
	*/
	private int vr12Q7simulatedresponse;
	/**
	*
	*/
	private ValueRange vr12Q7ValueRange;
	/**
	*
	*/
	private int vr12Q8simulatedresponse;
	/**
	*
	*/
	private ValueRange vr12Q8ValueRange;
	/**
	*
	*/
	private int vr12Q9simulatedresponse;
	/**
	*
	*/
	private ValueRange vr12Q9ValueRange;

	/**
	*
	*/
	public SimulatedResponseQ1_15() {
		try {
			this.setUtilities(new Utilities());
			this.setErrorResponse(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse()));

			this.setUniformdistribution(
					new UniformDistribution(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse()));
			// TODO Auto-generated constructor stub
			this.setVr12Q10ValueRange(ValueRange.of(1, 6));
			this.setVr12Q1simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q12ValueRange(ValueRange.of(1, 6));
			this.setVr12Q12simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q13ValueRange(ValueRange.of(1, 5));
			this.setVr12Q13simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q14ValueRange(ValueRange.of(1, 5));
			this.setVr12Q14simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q15ValueRange(ValueRange.of(1, 5));
			this.setVr12Q15simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q1ValueRange(ValueRange.of(1, 5));
			this.setVr12Q1simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q2ValueRange(ValueRange.of(1, 3));
			this.setVr12Q2simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q3ValueRange(ValueRange.of(1, 3));
			this.setVr12Q3simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q4ValueRange(ValueRange.of(1, 5));
			this.setVr12Q4simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q5ValueRange(ValueRange.of(1, 5));
			this.setVr12Q5simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q6ValueRange(ValueRange.of(1, 5));
			this.setVr12Q6simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q7ValueRange(ValueRange.of(1, 5));
			this.setVr12Q7simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q8ValueRange(ValueRange.of(1, 5));
			this.setVr12Q8simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q9ValueRange(ValueRange.of(1, 5));
			this.setVr12Q9simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
			this.setVr12Q11ValueRange(ValueRange.of(1, 6));
			this.setVr12Q11simulatedresponse(SimulatedResponseQ1_15.getErrorResponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the uniformdistribution
	 */
	/**
	 * @return
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
	 * @return the vR12Q10simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q10simulatedresponse() {
		try {
			return this.vr12Q10simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q10simulatedresponse;
	}

	/**
	 * @return the vR12Q10
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q10ValueRange() {
		try {
			return this.vr12Q10ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q10ValueRange;
	}

	/**
	 * @return the vR12Q11simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q11simulatedresponse() {
		try {
			return this.vr12Q11simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q11simulatedresponse;

	}

	/**
	 * @return the vR12Q11
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q11ValueRange() {
		try {
			return this.vr12Q11ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q1ValueRange;
	}

	/**
	 * @return the vR12Q12simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q12simulatedresponse() {
		try {
			return this.vr12Q12simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q12simulatedresponse;
	}

	/**
	 * @return the vR12Q12
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q12ValueRange() {
		try {
			return this.vr12Q12ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q12ValueRange;
	}

	/**
	 * @return the vR12Q13simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q13simulatedresponse() {
		try {
			return this.vr12Q13simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q13simulatedresponse;
	}

	/**
	 * @return the vR12Q13
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q13ValueRange() {
		try {
			return this.vr12Q13ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q13ValueRange;
	}

	/**
	 * @return the vR12Q14simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q14simulatedresponse() {
		try {
			return this.vr12Q14simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q14simulatedresponse;
	}

	/**
	 * @return the vR12Q14
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q14ValueRange() {
		try {
			return this.vr12Q14ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q14ValueRange;
	}

	/**
	 * @return the vR12Q15simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q15simulatedresponse() {
		try {
			return this.vr12Q15simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q15simulatedresponse;
	}

	/**
	 * @return the vR12Q15
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q15ValueRange() {
		try {
			return this.vr12Q15ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q15ValueRange;
	}

	/**
	 * @return the vR12Q1simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q1simulatedresponse() {
		try {
			return this.vr12Q1simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q1simulatedresponse;

	}

	/**
	 * @return the vR12Q1
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q1ValueRange() {
		try {
			return this.vr12Q1ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q1ValueRange;
	}

	/**
	 * @return the vR12Q2simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q2simulatedresponse() {
		try {
			return this.vr12Q2simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q2simulatedresponse;

	}

	/**
	 * @return the vR12Q2
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q2ValueRange() {
		try {
			return this.vr12Q2ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q2ValueRange;
	}

	/**
	 * @return the vR12Q3simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q3simulatedresponse() {
		try {
			return this.vr12Q3simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q3simulatedresponse;
	}

	/**
	 * @return the vR12Q3
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q3ValueRange() {
		try {
			return this.vr12Q3ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q3ValueRange;
	}

	/**
	 * @return the vR12Q4simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q4simulatedresponse() {
		try {
			return this.vr12Q4simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q4simulatedresponse;

	}

	/**
	 * @return the vR12Q4
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q4ValueRange() {
		try {
			return this.vr12Q4ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q4ValueRange;
	}

	/**
	 * @return the vR12Q5simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q5simulatedresponse() {
		try {
			return this.vr12Q5simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q5simulatedresponse;
	}

	/**
	 * @return the vR12Q5
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q5ValueRange() {
		try {
			return this.vr12Q5ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q5ValueRange;
	}

	/**
	 * @return the vR12Q6simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q6simulatedresponse() {
		try {
			return this.vr12Q6simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q6simulatedresponse;
	}

	/**
	 * @return the vR12Q6
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q6ValueRange() {
		try {
			return this.vr12Q6ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q6ValueRange;
	}

	/**
	 * @return the vR12Q7simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q7simulatedresponse() {
		try {
			return this.vr12Q7simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q7simulatedresponse;

	}

	/**
	 * @return the vR12Q7
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q7ValueRange() {
		try {
			return this.vr12Q7ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q7ValueRange;
	}

	/**
	 * @return the vR12Q8simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q8simulatedresponse() {
		try {
			return this.vr12Q8simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q8simulatedresponse;

	}

	/**
	 * @return the vR12Q8
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q8ValueRange() {
		try {
			return this.vr12Q8ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q8ValueRange;
	}

	/**
	 * @return the vR12Q9simulatedresponse
	 */
	/**
	 * @return
	 */
	public int getVr12Q9simulatedresponse() {
		try {
			return this.vr12Q9simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q9simulatedresponse;

	}

	/**
	 * @return the vR12Q9
	 */
	/**
	 * @return
	 */
	private ValueRange getVr12Q9ValueRange() {
		try {
			return this.vr12Q9ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vr12Q1ValueRange;
	}

	/**
	 * @param errorResponse the errorResponse to set
	 */
	/**
	 * @param errorResponse
	 */
	private void setErrorResponse(int ErrorResponse) {
		try {
			SimulatedResponseQ1_15.errorResponse = ErrorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uniformdistribution the uniformdistribution to set
	 */
	/**
	 * @param uniformdistribution
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
	/**
	 * @param utilities
	 */
	private void setUtilities(Utilities utilities) {
		try {
			this.utilities = utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q10simulatedresponse the vR12Q10simulatedresponse to set
	 */
	/**
	 * @param vR12Q10simulatedresponse
	 */
	private void setVr12Q10simulatedresponse(int vR12Q10simulatedresponse) {
		try {
			this.vr12Q10simulatedresponse = vR12Q10simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q10 the vR12Q10 to set
	 */
	/**
	 * @param vR12Q10
	 */
	private void setVr12Q10ValueRange(ValueRange vR12Q10) {
		try {
			this.vr12Q10ValueRange = vR12Q10;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q11simulatedresponse the vR12Q11simulatedresponse to set
	 */
	/**
	 * @param vR12Q11simulatedresponse
	 */
	private void setVr12Q11simulatedresponse(int vR12Q11simulatedresponse) {
		try {
			this.vr12Q11simulatedresponse = vR12Q11simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q11 the vR12Q11 to set
	 */
	/**
	 * @param vR12Q11
	 */
	private void setVr12Q11ValueRange(ValueRange vR12Q11) {
		try {
			this.vr12Q11ValueRange = vR12Q11;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q12simulatedresponse the vR12Q12simulatedresponse to set
	 */
	/**
	 * @param vR12Q12simulatedresponse
	 */
	private void setVr12Q12simulatedresponse(int vR12Q12simulatedresponse) {
		try {
			this.vr12Q12simulatedresponse = vR12Q12simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q12 the vR12Q12 to set
	 */
	/**
	 * @param vR12Q12
	 */
	private void setVr12Q12ValueRange(ValueRange vR12Q12) {
		try {
			this.vr12Q12ValueRange = vR12Q12;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q13simulatedresponse the vR12Q13simulatedresponse to set
	 */
	/**
	 * @param vR12Q13simulatedresponse
	 */
	private void setVr12Q13simulatedresponse(int vR12Q13simulatedresponse) {
		try {
			this.vr12Q13simulatedresponse = vR12Q13simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q13 the vR12Q13 to set
	 */
	/**
	 * @param vR12Q13
	 */
	private void setVr12Q13ValueRange(ValueRange vR12Q13) {
		try {
			this.vr12Q13ValueRange = vR12Q13;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q14simulatedresponse the vR12Q14simulatedresponse to set
	 */
	/**
	 * @param vR12Q14simulatedresponse
	 */
	private void setVr12Q14simulatedresponse(int vR12Q14simulatedresponse) {
		try {
			this.vr12Q14simulatedresponse = vR12Q14simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q14 the vR12Q14 to set
	 */
	/**
	 * @param vR12Q14
	 */
	private void setVr12Q14ValueRange(ValueRange vR12Q14) {
		try {
			this.vr12Q14ValueRange = vR12Q14;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q15simulatedresponse the vR12Q15simulatedresponse to set
	 */
	/**
	 * @param vR12Q15simulatedresponse
	 */
	private void setVr12Q15simulatedresponse(int vR12Q15simulatedresponse) {
		try {
			this.vr12Q15simulatedresponse = vR12Q15simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q15 the vR12Q15 to set
	 */
	/**
	 * @param vR12Q15
	 */
	private void setVr12Q15ValueRange(ValueRange vR12Q15) {
		try {
			this.vr12Q15ValueRange = vR12Q15;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q1simulatedresponse the vR12Q1simulatedresponse to set
	 */
	/**
	 * @param vR12Q1simulatedresponse
	 */
	private void setVr12Q1simulatedresponse(int vR12Q1simulatedresponse) {
		try {
			this.vr12Q1simulatedresponse = vR12Q1simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q1 the vR12Q1 to set
	 */
	/**
	 * @param vR12Q1
	 */
	private void setVr12Q1ValueRange(ValueRange vR12Q1) {
		try {
			this.vr12Q1ValueRange = vR12Q1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q2simulatedresponse the vR12Q2simulatedresponse to set
	 */
	/**
	 * @param vR12Q2simulatedresponse
	 */
	private void setVr12Q2simulatedresponse(int vR12Q2simulatedresponse) {
		try {
			this.vr12Q2simulatedresponse = vR12Q2simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q2 the vR12Q2 to set
	 */
	/**
	 * @param vR12Q2
	 */
	private void setVr12Q2ValueRange(ValueRange vR12Q2) {
		try {
			this.vr12Q2ValueRange = vR12Q2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q3simulatedresponse the vR12Q3simulatedresponse to set
	 */
	/**
	 * @param vR12Q3simulatedresponse
	 */
	private void setVr12Q3simulatedresponse(int vR12Q3simulatedresponse) {
		try {
			this.vr12Q3simulatedresponse = vR12Q3simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q3 the vR12Q3 to set
	 */
	/**
	 * @param vR12Q3
	 */
	private void setVr12Q3ValueRange(ValueRange vR12Q3) {
		try {
			this.vr12Q3ValueRange = vR12Q3;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q4simulatedresponse the vR12Q4simulatedresponse to set
	 */
	/**
	 * @param vR12Q4simulatedresponse
	 */
	private void setVr12Q4simulatedresponse(int vR12Q4simulatedresponse) {
		try {
			this.vr12Q4simulatedresponse = vR12Q4simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q4 the vR12Q4 to set
	 */
	/**
	 * @param vR12Q4
	 */
	private void setVr12Q4ValueRange(ValueRange vR12Q4) {
		try {
			this.vr12Q4ValueRange = vR12Q4;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q5simulatedresponse the vR12Q5simulatedresponse to set
	 */
	/**
	 * @param vR12Q5simulatedresponse
	 */
	private void setVr12Q5simulatedresponse(int vR12Q5simulatedresponse) {
		try {
			this.vr12Q5simulatedresponse = vR12Q5simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q5 the vR12Q5 to set
	 */
	/**
	 * @param vR12Q5
	 */
	private void setVr12Q5ValueRange(ValueRange vR12Q5) {
		try {
			this.vr12Q5ValueRange = vR12Q5;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q6simulatedresponse the vR12Q6simulatedresponse to set
	 */
	/**
	 * @param vR12Q6simulatedresponse
	 */
	private void setVr12Q6simulatedresponse(int vR12Q6simulatedresponse) {
		try {
			this.vr12Q6simulatedresponse = vR12Q6simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q6 the vR12Q6 to set
	 */
	/**
	 * @param vR12Q6
	 */
	private void setVr12Q6ValueRange(ValueRange vR12Q6) {
		try {
			this.vr12Q6ValueRange = vR12Q6;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q7simulatedresponse the vR12Q7simulatedresponse to set
	 */
	/**
	 * @param vR12Q7simulatedresponse
	 */
	private void setVr12Q7simulatedresponse(int vR12Q7simulatedresponse) {
		try {
			this.vr12Q7simulatedresponse = vR12Q7simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q7 the vR12Q7 to set
	 */
	/**
	 * @param vR12Q7
	 */
	private void setVr12Q7ValueRange(ValueRange vR12Q7) {
		try {
			this.vr12Q7ValueRange = vR12Q7;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q8simulatedresponse the vR12Q8simulatedresponse to set
	 */
	/**
	 * @param vR12Q8simulatedresponse
	 */
	private void setVr12Q8simulatedresponse(int vR12Q8simulatedresponse) {
		try {
			this.vr12Q8simulatedresponse = vR12Q8simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q8 the vR12Q8 to set
	 */
	/**
	 * @param vR12Q8
	 */
	private void setVr12Q8ValueRange(ValueRange vR12Q8) {
		try {
			this.vr12Q8ValueRange = vR12Q8;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q9simulatedresponse the vR12Q9simulatedresponse to set
	 */
	/**
	 * @param vR12Q9simulatedresponse
	 */
	private void setVr12Q9simulatedresponse(int vR12Q9simulatedresponse) {
		try {
			this.vr12Q9simulatedresponse = vR12Q9simulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vR12Q9 the vR12Q9 to set
	 */
	/**
	 * @param vR12Q9
	 */
	private void setVr12Q9ValueRange(ValueRange vR12Q9) {
		try {
			this.vr12Q9ValueRange = vR12Q9;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void simulateQ1_Q15responseVariables() throws Exception {
		try {

			this.simulateVR12Q1response(this.getVr12Q1ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q2response(this.getVr12Q2ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q3response(this.getVr12Q3ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q4response(this.getVr12Q4ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q5response(this.getVr12Q5ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q6response(this.getVr12Q6ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q7response(this.getVr12Q7ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q8response(this.getVr12Q8ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q9response(this.getVr12Q9ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q10response(this.getVr12Q10ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q11response(this.getVr12Q11ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q12response(this.getVr12Q12ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q13response(this.getVr12Q13ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q14response(this.getVr12Q14ValueRange(), SimulatedResponseQ1_15.getErrorResponse());
			this.simulateVR12Q15response(this.getVr12Q15ValueRange(), SimulatedResponseQ1_15.getErrorResponse());

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q10response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q10ValueRange(valuerange);
			this.setVr12Q10simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q10simulatedresponse(
						this.getUtilities().randBetween((int) this.getVr12Q10ValueRange().getMinimum(),
								(int) this.getVr12Q10ValueRange().getMaximum()));
				return this.getVr12Q10simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q11response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q11ValueRange(valuerange);
			this.setVr12Q11simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q14simulatedresponse(
						this.getUtilities().randBetween((int) this.getVr12Q11ValueRange().getMinimum(),
								(int) this.getVr12Q11ValueRange().getMaximum()));
				return this.getVr12Q11simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q12response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q12ValueRange(valuerange);
			this.setVr12Q12simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q12simulatedresponse(
						this.getUtilities().randBetween((int) this.getVr12Q12ValueRange().getMinimum(),
								(int) this.getVr12Q12ValueRange().getMaximum()));
				return this.getVr12Q12simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q13response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q13ValueRange(valuerange);
			this.setVr12Q13simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q13simulatedresponse(
						this.getUtilities().randBetween((int) this.getVr12Q13ValueRange().getMinimum(),
								(int) this.getVr12Q13ValueRange().getMaximum()));
				return this.getVr12Q13simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q14response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q14ValueRange(valuerange);
			this.setVr12Q14simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q14simulatedresponse(
						this.getUtilities().randBetween((int) this.getVr12Q14ValueRange().getMinimum(),
								(int) this.getVr12Q14ValueRange().getMaximum()));
				return this.getVr12Q14simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q15response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q12ValueRange(valuerange);
			this.setVr12Q12simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q15simulatedresponse(
						this.getUtilities().randBetween((int) this.getVr12Q15ValueRange().getMinimum(),
								(int) this.getVr12Q15ValueRange().getMaximum()));
				return this.getVr12Q15simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q1response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q1ValueRange(valuerange);
			this.setVr12Q1simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				Random random = new Random();
				this.setVr12Q1simulatedresponse(random.nextInt((int) this.getVr12Q1ValueRange().getMaximum()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q2response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q2ValueRange(valuerange);
			this.setVr12Q2simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q2simulatedresponse(this.getUtilities().randBetween(
						(int) this.getVr12Q2ValueRange().getMinimum(), (int) this.getVr12Q2ValueRange().getMaximum()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q3response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q3ValueRange(valuerange);
			this.setVr12Q3simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q3simulatedresponse(this.getUtilities().randBetween(
						(int) this.getVr12Q3ValueRange().getMinimum(), (int) this.getVr12Q3ValueRange().getMaximum()));
				return this.getVr12Q3simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q4response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q4ValueRange(valuerange);
			this.setVr12Q4simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q4simulatedresponse(this.getUtilities().randBetween(
						(int) this.getVr12Q4ValueRange().getMinimum(), (int) this.getVr12Q4ValueRange().getMaximum()));
				return this.getVr12Q4simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q5response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q5ValueRange(valuerange);
			this.setVr12Q5simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q5simulatedresponse(this.getUtilities().randBetween(
						(int) this.getVr12Q5ValueRange().getMinimum(), (int) this.getVr12Q5ValueRange().getMaximum()));
				return this.getVr12Q5simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q6response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q6ValueRange(valuerange);
			this.setVr12Q6simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q6simulatedresponse(this.getUtilities().randBetween(
						(int) this.getVr12Q6ValueRange().getMinimum(), (int) this.getVr12Q6ValueRange().getMaximum()));
				return this.getVr12Q6simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q7response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q7ValueRange(valuerange);
			this.setVr12Q7simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q7simulatedresponse(this.getUtilities().randBetween(
						(int) this.getVr12Q7ValueRange().getMinimum(), (int) this.getVr12Q7ValueRange().getMaximum()));
				return this.getVr12Q7simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q8response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q8ValueRange(valuerange);
			this.setVr12Q8simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q8simulatedresponse(this.getUtilities().randBetween(
						(int) this.getVr12Q8ValueRange().getMinimum(), (int) this.getVr12Q8ValueRange().getMaximum()));
				return this.getVr12Q8simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatedresponse
	 * @return
	 * @throws Exception
	 */
	private int simulateVR12Q9response(ValueRange valuerange, int simulatederrorresponse) throws Exception {
		try {
			this.setVr12Q9ValueRange(valuerange);
			this.setVr12Q9simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseQ1_15.getMinValToGenerateErrorResponse(),
							SimulatedResponseQ1_15.getMaxValToGenerateErrorResponse())))) {
				this.setVr12Q9simulatedresponse(this.getUtilities().randBetween(
						(int) this.getVr12Q9ValueRange().getMinimum(), (int) this.getVr12Q9ValueRange().getMaximum()));
				return this.getVr12Q9simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TBD: Correct what simulation function is returning
		return simulatederrorresponse;
	}

}
