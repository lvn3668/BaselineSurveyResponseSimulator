package SimulatedResponseAncestry;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import randomizer.UniformDistribution;

/**
 * @author Lalitha Viswanathan
 * Affiliation: VABHS / MAVERIC
 *
 */
public class SimulatedResponseAncestry {
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
		return maxValToGenerateErrorResponse;
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
	 * @param errorResponse the errorResponse to set
	 */
	private static void setErrorResponse(int errorResponse) {
		try {
			errorResponse = errorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int ancestryafricansimulatedepicresponse;
	private ValueRange AncestryAfricanValueRange;
	private int ancestryeastasiansimulatedepicresponse;

	private ValueRange AncestryEastAsianValueRange;
	private int ancestrymiddleeasternsimulatedepicresponse;

	private ValueRange AncestryMiddleEasternValueRange;

	private int ancestrynorthamericansimulatedepicresponse;

	private ValueRange AncestryNorthAmericanValueRange;

	private int ancestrynortheuropeansimulatedepicresponse;

	private ValueRange AncestryNorthEuropeanValueRange;

	private int ancestrysamoaamericansimulatedepicresponse;

	private ValueRange AncestrySamoaAmericanValueRange;

	private int ancestrysoutheurasiansimulatedepicresponse;

	private ValueRange AncestrySouthEurasianValueRange;

	private int ancestrysouthwestasiansimulatedepicresponse;

	private ValueRange AncestrySouthWestAsianValueRange;

	private randomizer.UniformDistribution uniformDistribution;

	private Utilities utilities;

	// default constructor
	public SimulatedResponseAncestry() {
		try {
			this.setUtilities(new Utilities());
			this.setUniformDistribution(
					new randomizer.UniformDistribution(SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
							SimulatedResponseAncestry.getMaxValToGenerateErrorResponse()));
			SimulatedResponseAncestry.setErrorResponse(
					this.getUtilities().randBetween(SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
							SimulatedResponseAncestry.getMaxValToGenerateErrorResponse()));
			// TODO Auto-generated constructor stub
			this.setAncestryAfricanValueRange(ValueRange.of(0, 1));
			this.setAncestryafricansimulatedepicresponse(SimulatedResponseAncestry.getErrorResponse());
			this.setAncestryEastAsianValueRange(ValueRange.of(0, 1));
			this.setAncestryeastasiansimulatedepicresponse(SimulatedResponseAncestry.getErrorResponse());
			this.setAncestryMiddleEasternValueRange(ValueRange.of(0, 1));
			this.setAncestrymiddleeasternsimulatedepicresponse(SimulatedResponseAncestry.getErrorResponse());
			this.setAncestryNorthAmericanValueRange(ValueRange.of(0, 1));
			this.setAncestrynorthamericansimulatedepicresponse(SimulatedResponseAncestry.getErrorResponse());
			this.setAncestryNorthEuropeanValueRange(ValueRange.of(0, 1));
			this.setAncestrynortheuropeansimulatedepicresponse(SimulatedResponseAncestry.getErrorResponse());
			this.setAncestrySamoaAmericanValueRange(ValueRange.of(0, 1));
			this.setAncestrysamoaamericansimulatedepicresponse(SimulatedResponseAncestry.getErrorResponse());
			this.setAncestrySouthEurasianValueRange(ValueRange.of(0, 1));
			this.setAncestrysoutheurasiansimulatedepicresponse(SimulatedResponseAncestry.getErrorResponse());
			this.setAncestrySouthWestAsianValueRange(ValueRange.of(0, 1));
			this.setAncestrysouthwestasiansimulatedepicresponse(SimulatedResponseAncestry.getErrorResponse());
			this.setUniformDistribution(new randomizer.UniformDistribution());
			this.setUtilities(new Utilities());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public SimulatedResponseAncestry(ValueRange africanancestry, int afrsimulatedresponse,
			ValueRange easstasianancestry, int eastasiansimulatedresponse, ValueRange middleeasternancestry,
			int middleeasternsimulatedresponse, ValueRange northamericanancestry, int northamericansimulatedresponse,
			ValueRange northeuropeanancestry, int northeuropeansimulatedresponse, ValueRange samoaamericanancestry,
			int samoaamericansimulatedresponse, ValueRange southeurasianancestry, int southeurasiansimulatedresponse,
			ValueRange southwestasianancestry, int southwestasiansimulatedresponse) {
		try {
			// TODO Auto-generated constructor stub
			this.utilities = new Utilities();
			this.uniformDistribution = new UniformDistribution(
					SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
					SimulatedResponseAncestry.getMaxValToGenerateErrorResponse());
			SimulatedResponseAncestry.errorResponse = this.getUtilities().randBetween(
					SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
					SimulatedResponseAncestry.getMaxValToGenerateErrorResponse());
			this.setAncestryAfricanValueRange(africanancestry);
			this.setAncestryafricansimulatedepicresponse(afrsimulatedresponse);
			this.setAncestryEastAsianValueRange(easstasianancestry);
			this.setAncestryeastasiansimulatedepicresponse(eastasiansimulatedresponse);
			this.setAncestryMiddleEasternValueRange(middleeasternancestry);
			this.setAncestrymiddleeasternsimulatedepicresponse(middleeasternsimulatedresponse);
			this.setAncestryNorthAmericanValueRange(northamericanancestry);
			this.setAncestrynorthamericansimulatedepicresponse(northamericansimulatedresponse);
			this.setAncestryNorthEuropeanValueRange(northeuropeanancestry);
			this.setAncestrynortheuropeansimulatedepicresponse(northeuropeansimulatedresponse);
			this.setAncestrySamoaAmericanValueRange(samoaamericanancestry);
			this.setAncestrysamoaamericansimulatedepicresponse(samoaamericansimulatedresponse);
			this.setAncestrySouthEurasianValueRange(southeurasianancestry);
			this.setAncestrysoutheurasiansimulatedepicresponse(southeurasiansimulatedresponse);
			this.setAncestrySouthWestAsianValueRange(southwestasianancestry);
			this.setAncestrysouthwestasiansimulatedepicresponse(southwestasiansimulatedresponse);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the ancestryafricansimulatedepicresponse
	 */
	private int getAncestryafricansimulatedepicresponse() {
		try {
			return this.ancestryafricansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ancestryafricansimulatedepicresponse;

	}

	/**
	 * @return the ancestryAfrican
	 */
	private ValueRange getAncestryAfricanValueRange() {
		try {
			return this.AncestryAfricanValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AncestryAfricanValueRange;

	}

	/**
	 * @return the ancestryeastasiansimulatedepicresponse
	 */
	private int getAncestryeastasiansimulatedepicresponse() {
		try {
			return this.ancestryeastasiansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ancestryeastasiansimulatedepicresponse;

	}

	/**
	 * @return the ancestryEastAsian
	 */
	private ValueRange getAncestryEastAsianValueRange() {
		try {
			return this.AncestryEastAsianValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AncestryEastAsianValueRange;

	}

	/**
	 * @return the ancestrymiddleeasternsimulatedepicresponse
	 */
	private int getAncestrymiddleeasternsimulatedepicresponse() {
		try {
			return this.ancestrymiddleeasternsimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ancestrymiddleeasternsimulatedepicresponse;

	}

	/**
	 * @return the ancestryMiddleEastern
	 */
	private ValueRange getAncestryMiddleEasternValueRange() {
		try {
			return this.AncestryMiddleEasternValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AncestryMiddleEasternValueRange;

	}

	/**
	 * @return the ancestrynorthamericansimulatedepicresponse
	 */
	private int getAncestrynorthamericansimulatedepicresponse() {
		try {
			return this.ancestrynorthamericansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ancestrynorthamericansimulatedepicresponse;

	}

	/**
	 * @return the ancestryNorthAmerican
	 */
	private ValueRange getAncestryNorthAmericanValueRange() {
		try {
			return this.AncestryNorthAmericanValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AncestryNorthAmericanValueRange;

	}

	/**
	 * @return the ancestrynortheuropeansimulatedepicresponse
	 */
	private int getAncestrynortheuropeansimulatedepicresponse() {
		try {
			return this.ancestrynortheuropeansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ancestrynortheuropeansimulatedepicresponse;

	}

	/**
	 * @return the ancestryNorthEuropean
	 */
	private ValueRange getAncestryNorthEuropeanValueRange() {
		try {
			return this.AncestryNorthEuropeanValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AncestryNorthEuropeanValueRange;

	}

	/**
	 * @return the ancestrysamoaamericansimulatedepicresponse
	 */
	private int getAncestrysamoaamericansimulatedepicresponse() {
		try {
			return this.ancestrysamoaamericansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ancestrysamoaamericansimulatedepicresponse;

	}

	/**
	 * @return the ancestrySamoaAmerican
	 */
	private ValueRange getAncestrySamoaAmericanValueRange() {
		try {
			return this.AncestrySamoaAmericanValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AncestrySamoaAmericanValueRange;

	}

	/**
	 * @return the ancestrysoutheurasiansimulatedepicresponse
	 */
	private int getAncestrysoutheurasiansimulatedepicresponse() {
		try {
			return this.ancestrysoutheurasiansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ancestrysoutheurasiansimulatedepicresponse;

	}

	/**
	 * @return the ancestrySouthEurasian
	 */
	private ValueRange getAncestrySouthEurasianValueRange() {
		try {
			return this.AncestrySouthEurasianValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AncestrySouthEurasianValueRange;

	}

	/**
	 * @return the ancestrysouthwestasiansimulatedepicresponse
	 */
	private int getAncestrysouthwestasiansimulatedepicresponse() {
		try {
			return this.ancestrysouthwestasiansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ancestrysouthwestasiansimulatedepicresponse;

	}

	/**
	 * @return the ancestrySouthWestAsian
	 */
	private ValueRange getAncestrySouthWestAsianValueRange() {
		try {
			return this.AncestrySouthWestAsianValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.AncestrySouthWestAsianValueRange;

	}

	/**
	 * @return the uniformDistribution
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
	 * @param ancestryafricansimulatedepicresponse the
	 *                                             ancestryafricansimulatedepicresponse
	 *                                             to set
	 */
	private void setAncestryafricansimulatedepicresponse(int ancestryafricansimulatedepicresponse) {
		try {
			this.ancestryafricansimulatedepicresponse = ancestryafricansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestryAfrican the ancestryAfrican to set
	 */
	private void setAncestryAfricanValueRange(ValueRange ancestryAfrican) {
		try {
			this.AncestryAfricanValueRange = ancestryAfrican;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestryeastasiansimulatedepicresponse the
	 *                                               ancestryeastasiansimulatedepicresponse
	 *                                               to set
	 */
	private void setAncestryeastasiansimulatedepicresponse(int ancestryeastasiansimulatedepicresponse) {
		try {
			this.ancestryeastasiansimulatedepicresponse = ancestryeastasiansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestryEastAsian the ancestryEastAsian to set
	 */
	private void setAncestryEastAsianValueRange(ValueRange ancestryEastAsian) {
		try {
			this.AncestryEastAsianValueRange = ancestryEastAsian;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestrymiddleeasternsimulatedepicresponse the
	 *                                                   ancestrymiddleeasternsimulatedepicresponse
	 *                                                   to set
	 */
	private void setAncestrymiddleeasternsimulatedepicresponse(int ancestrymiddleeasternsimulatedepicresponse) {
		try {
			this.ancestrymiddleeasternsimulatedepicresponse = ancestrymiddleeasternsimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestryMiddleEastern the ancestryMiddleEastern to set
	 */
	private void setAncestryMiddleEasternValueRange(ValueRange ancestryMiddleEastern) {
		try {
			this.AncestryMiddleEasternValueRange = ancestryMiddleEastern;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestrynorthamericansimulatedepicresponse the
	 *                                                   ancestrynorthamericansimulatedepicresponse
	 *                                                   to set
	 */
	private void setAncestrynorthamericansimulatedepicresponse(int ancestrynorthamericansimulatedepicresponse) {
		try {
			this.ancestrynorthamericansimulatedepicresponse = ancestrynorthamericansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestryNothAmerican the ancestryNothAmerican to set
	 */
	private void setAncestryNorthAmericanValueRange(ValueRange ancestryNothAmerican) {
		try {
			this.AncestryNorthAmericanValueRange = ancestryNothAmerican;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestrynortheuropeansimulatedepicresponse the
	 *                                                   ancestrynortheuropeansimulatedepicresponse
	 *                                                   to set
	 */
	private void setAncestrynortheuropeansimulatedepicresponse(int ancestrynortheuropeansimulatedepicresponse) {
		try {
			this.ancestrynortheuropeansimulatedepicresponse = ancestrynortheuropeansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestryNothEuropean the ancestryNothEuropean to set
	 */
	private void setAncestryNorthEuropeanValueRange(ValueRange ancestryNothEuropean) {
		try {
			this.AncestryNorthEuropeanValueRange = ancestryNothEuropean;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestrysamoaamericansimulatedepicresponse the
	 *                                                   ancestrysamoaamericansimulatedepicresponse
	 *                                                   to set
	 */
	private void setAncestrysamoaamericansimulatedepicresponse(int ancestrysamoaamericansimulatedepicresponse) {
		try {
			this.ancestrysamoaamericansimulatedepicresponse = ancestrysamoaamericansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestrySamoaAmerican the ancestrySamoaAmerican to set
	 */
	private void setAncestrySamoaAmericanValueRange(ValueRange ancestrySamoaAmerican) {
		try {
			this.AncestrySamoaAmericanValueRange = ancestrySamoaAmerican;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestrysoutheurasiansimulatedepicresponse the
	 *                                                   ancestrysoutheurasiansimulatedepicresponse
	 *                                                   to set
	 */
	private void setAncestrysoutheurasiansimulatedepicresponse(int ancestrysoutheurasiansimulatedepicresponse) {
		try {
			this.ancestrysoutheurasiansimulatedepicresponse = ancestrysoutheurasiansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestrySouthEurasian the ancestrySouthEurasian to set
	 */
	private void setAncestrySouthEurasianValueRange(ValueRange ancestrySouthEurasian) {
		try {
			this.AncestrySouthEurasianValueRange = ancestrySouthEurasian;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestrysouthwestasiansimulatedepicresponse the
	 *                                                    ancestrysouthwestasiansimulatedepicresponse
	 *                                                    to set
	 */
	private void setAncestrysouthwestasiansimulatedepicresponse(int ancestrysouthwestasiansimulatedepicresponse) {
		try {
			this.ancestrysouthwestasiansimulatedepicresponse = ancestrysouthwestasiansimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param ancestrySouthWestAsian the ancestrySouthWestAsian to set
	 */
	private void setAncestrySouthWestAsianValueRange(ValueRange ancestrySouthWestAsian) {
		try {
			this.AncestrySouthWestAsianValueRange = ancestrySouthWestAsian;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uniformDistribution the uniformDistribution to set
	 */
	private void setUniformDistribution(UniformDistribution uniformdist) {
		try {
			this.uniformDistribution = uniformdist;
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

	public int simulateAncestryAfricanResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setAncestryAfricanValueRange(valuerange);
			this.setAncestryafricansimulatedepicresponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
							SimulatedResponseAncestry.getMaxValToGenerateErrorResponse())))) {
				this.setAncestryafricansimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getAncestryAfricanValueRange().getMinimum(),
								(int) this.getAncestryAfricanValueRange().getMaximum()));
				return this.getAncestryafricansimulatedepicresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatedresponse;
	}

	public int simulateAncestryEastAsianResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setAncestryEastAsianValueRange(valuerange);
			this.setAncestryeastasiansimulatedepicresponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
							SimulatedResponseAncestry.getMaxValToGenerateErrorResponse())))) {
				this.setAncestryeastasiansimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getAncestryEastAsianValueRange().getMinimum(),
								(int) this.getAncestryEastAsianValueRange().getMaximum()));
				return this.getAncestryeastasiansimulatedepicresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatedresponse;
	}

	public int simulateAncestryMiddleEasternResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setAncestryMiddleEasternValueRange(valuerange);
			this.setAncestrymiddleeasternsimulatedepicresponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
							SimulatedResponseAncestry.getMaxValToGenerateErrorResponse())))) {
				this.setAncestrymiddleeasternsimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getAncestryMiddleEasternValueRange().getMinimum(),
								(int) this.getAncestryMiddleEasternValueRange().getMaximum()));
				return this.getAncestrymiddleeasternsimulatedepicresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatedresponse;
	}

	public int simulateAncestryNorthAmericanResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setAncestryNorthAmericanValueRange(valuerange);
			this.setAncestrynorthamericansimulatedepicresponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
							SimulatedResponseAncestry.getMaxValToGenerateErrorResponse())))) {
				this.setAncestrynorthamericansimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getAncestryNorthAmericanValueRange().getMinimum(),
								(int) this.getAncestryNorthAmericanValueRange().getMaximum()));
				return this.getAncestrynorthamericansimulatedepicresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatedresponse;
	}

	public int simulateAncestryNorthEuropeanResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setAncestryNorthEuropeanValueRange(valuerange);
			this.setAncestrynortheuropeansimulatedepicresponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
							SimulatedResponseAncestry.getMaxValToGenerateErrorResponse())))) {
				this.setAncestrynortheuropeansimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getAncestryNorthEuropeanValueRange().getMinimum(),
								(int) this.getAncestryNorthEuropeanValueRange().getMaximum()));
				return this.getAncestrynortheuropeansimulatedepicresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatedresponse;
	}

	public void simulateAncestryResponseVariables() throws Exception {
		try {
			// replace by getters for Value Range
			this.simulateAncestryEastAsianResponse(this.getAncestryEastAsianValueRange(),
					SimulatedResponseAncestry.getErrorResponse());
			this.simulateAncestryMiddleEasternResponse(this.getAncestryMiddleEasternValueRange(),
					SimulatedResponseAncestry.getErrorResponse());
			this.simulateAncestryNorthAmericanResponse(this.getAncestryNorthAmericanValueRange(),
					SimulatedResponseAncestry.getErrorResponse());
			this.simulateAncestryNorthEuropeanResponse(this.getAncestryNorthEuropeanValueRange(),
					SimulatedResponseAncestry.getErrorResponse());
			this.simulateAncestrySamoaAmericanResponse(this.getAncestrySamoaAmericanValueRange(),
					SimulatedResponseAncestry.getErrorResponse());
			this.simulateAncestrySouthEurasianResponse(this.getAncestrySouthEurasianValueRange(),
					SimulatedResponseAncestry.getErrorResponse());
			this.simulateAncestrySouthWestAsianResponse(this.getAncestrySouthWestAsianValueRange(),
					SimulatedResponseAncestry.getErrorResponse());
			this.simulateAncestryAfricanResponse(this.getAncestryAfricanValueRange(),
					SimulatedResponseAncestry.getErrorResponse());

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public int simulateAncestrySamoaAmericanResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setAncestrySamoaAmericanValueRange(valuerange);
			this.setAncestrysamoaamericansimulatedepicresponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
							SimulatedResponseAncestry.getMaxValToGenerateErrorResponse())))) {
				this.setAncestrysamoaamericansimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getAncestrySamoaAmericanValueRange().getMinimum(),
								(int) this.getAncestrySamoaAmericanValueRange().getMaximum()));
				return this.getAncestrysamoaamericansimulatedepicresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatedresponse;
	}

	public int simulateAncestrySouthEurasianResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setAncestrySouthEurasianValueRange(valuerange);
			this.setAncestrysoutheurasiansimulatedepicresponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
							SimulatedResponseAncestry.getMaxValToGenerateErrorResponse())))) {
				this.setAncestrysoutheurasiansimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getAncestrySouthEurasianValueRange().getMinimum(),
								(int) this.getAncestrySouthEurasianValueRange().getMaximum()));
				return this.getAncestrysoutheurasiansimulatedepicresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatedresponse;
	}

	public int simulateAncestrySouthWestAsianResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setAncestrySouthWestAsianValueRange(valuerange);
			this.setAncestrysouthwestasiansimulatedepicresponse(simulatedresponse);
			if ((!this.getUniformDistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseAncestry.getMinValToGenerateErrorResponse(),
							SimulatedResponseAncestry.getMaxValToGenerateErrorResponse())))) {
				this.setAncestrysouthwestasiansimulatedepicresponse(
						this.getUtilities().randBetween((int) this.getAncestrySouthWestAsianValueRange().getMinimum(),
								(int) this.getAncestrySouthWestAsianValueRange().getMaximum()));
				return this.getAncestrysouthwestasiansimulatedepicresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatedresponse;
	}

	@Override
	public String toString() {
		return "SimulatedResponseAncestry [AncestryEastAsianValueRange=" + this.AncestryEastAsianValueRange
				+ ", ancestryeastasiansimulatedepicresponse=" + this.ancestryeastasiansimulatedepicresponse
				+ ", AncestryAfricanValueRange=" + this.AncestryAfricanValueRange
				+ ", ancestryafricansimulatedepicresponse=" + this.ancestryafricansimulatedepicresponse
				+ ", AncestryMiddleEasternValueRange=" + this.AncestryMiddleEasternValueRange
				+ ", ancestrymiddleeasternsimulatedepicresponse=" + this.ancestrymiddleeasternsimulatedepicresponse
				+ ", AncestryNorthAmericanValueRange=" + this.AncestryNorthAmericanValueRange
				+ ", ancestrynorthamericansimulatedepicresponse=" + this.ancestrynorthamericansimulatedepicresponse
				+ ", AncestrySouthEurasianValueRange=" + this.AncestrySouthEurasianValueRange
				+ ", ancestrysoutheurasiansimulatedepicresponse=" + this.ancestrysoutheurasiansimulatedepicresponse
				+ ", AncestryNorthEuropeanValueRange=" + this.AncestryNorthEuropeanValueRange
				+ ", ancestrynortheuropeansimulatedepicresponse=" + this.ancestrynortheuropeansimulatedepicresponse
				+ ", AncestrySamoaAmericanValueRange=" + this.AncestrySamoaAmericanValueRange
				+ ", ancestrysamoaamericansimulatedepicresponse=" + this.ancestrysamoaamericansimulatedepicresponse
				+ ", AncestrySouthWestAsianValueRange=" + this.AncestrySouthWestAsianValueRange
				+ ", ancestrysouthwestasiansimulatedepicresponse=" + this.ancestrysouthwestasiansimulatedepicresponse
				+ ", uniformDistribution=" + this.uniformDistribution + ", utilities=" + this.utilities + "]";
	}

}
