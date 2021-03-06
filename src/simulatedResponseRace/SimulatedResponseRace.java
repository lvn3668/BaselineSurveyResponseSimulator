/**
 *  @author: Lalitha Viswanathan
 *
 *  Affiliation: MAVERIC / VABHS
 */

package simulatedResponseRace;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import randomizer.RandomizingDistribution;

/**
 * @author visu4
 *
 */
public class SimulatedResponseRace {

	/**
	 *
	 */
	private static int errorValToIntroduceNoise;
	/**
	 *
	 */
	private static final int maxToGenerateErrorResponse = 4;
	/**
	 *
	 */
	private static final int minToGenerateErrorResponse = 2;

	/**
	 * @return the errorresponse
	 */
	/**
	 * @return
	 */
	private static int getErrorResponse() {
		try {
			return errorValToIntroduceNoise;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return errorValToIntroduceNoise;
	}

	// separate simulation for each variable
	// wrapper for all

	/**
	 * @return
	 */
	private static int getMaximumtogenerateerrorresponse() {
		try {
			return maxToGenerateErrorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maxToGenerateErrorResponse;
	}

	/**
	 * @return the mintogenerateerrorval
	 */
	/**
	 * @return
	 */
	private static int getMinimumtogenerateerrorresponse() {
		try {
			return minToGenerateErrorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return minToGenerateErrorResponse;
	}

	/**
	*
	*/
	private static void setErrorresponse(int errorResponse) throws Exception {
		try {
			errorValToIntroduceNoise = errorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	*
	*/
	private int raceAfricanAmericansimulatedresponse;
	/**
	*
	*/
	private ValueRange raceAfricanAmericanValueRange;
	/**
	*
	*/
	private int raceAmericanIndiansimulatedresponse;
	/**
	*
	*/
	private ValueRange raceAmericanIndianValueRange;
	private int raceAsianChinesesimulatedresponse;
	private ValueRange raceAsianChineseValueRange;
	/**
	*
	*/
	private int raceAsianFilipinosimulatedresponse;
	/**
	*
	*/
	private ValueRange raceAsianFilipinoValueRange;
	/**
	*
	*/
	private int raceAsianIndiansimulatedresponse;
	/**
	*
	*/
	private ValueRange raceAsianIndianValueRange;
	/**
	*
	*/
	private int raceAsianJapansimulatedresponse;
	/**
	*
	*/
	private ValueRange raceAsianJapanValueRange;
	/**
	*
	*/
	private int raceAsianOthersimulatedresponse;
	/**
	*
	*/
	private ValueRange raceAsianOtherValueRange;
	/**
	*
	*/
	private int raceAsianPacificIslandersimulatedresponse;
	/**
	*
	*/
	private ValueRange raceAsianPacificIslanderValueRange;
	/**
	*
	*/
	private int raceOthersimulatedresponse;
	/**
	*
	*/
	private ValueRange raceOtherValueRange;
	/**
	*
	*/
	private int racePacificIslandersimulatedresponse;
	/**
	*
	*/
	private ValueRange racePacificIslanderValueRange;

	/**
	 *
	 */
	private int raceWhitesimulatedresponse;
	/**
	 *
	 */
	private ValueRange raceWhiteValueRange;
	/**
	 *
	 */
	private RandomizingDistribution uniformdistribution;
	/**
	 *
	 */
	private Utilities utilities;

	/**
	 *
	 */
	public SimulatedResponseRace() {
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution(SimulatedResponseRace.minToGenerateErrorResponse,
					SimulatedResponseRace.maxToGenerateErrorResponse));
			// set error response
			setErrorresponse(this.getUtilities().randBetween(SimulatedResponseRace.getMinimumtogenerateerrorresponse(),
					SimulatedResponseRace.getMaximumtogenerateerrorresponse()));
			this.setRaceWhiteValueRange(ValueRange.of(0, 1));
			this.setRaceWhitesimulatedresponse(SimulatedResponseRace.getErrorResponse());
			this.setRaceAfricanAmericanValueRange(ValueRange.of(0, 1));
			this.setRaceAfricanAmericansimulatedresponse(SimulatedResponseRace.getErrorResponse());
			this.setRaceAmericanIndianValueRange(ValueRange.of(0, 1));
			this.setRaceAmericanIndiansimulatedresponse(SimulatedResponseRace.getErrorResponse());
			this.setRacePacificIslanderValueRange(ValueRange.of(0, 1));
			this.setRacePacificIslandersimulatedresponse(SimulatedResponseRace.getErrorResponse());
			this.setRaceAsianJapanValueRange(ValueRange.of(0, 1));
			this.setRaceAsianJapansimulatedresponse(SimulatedResponseRace.getErrorResponse());
			this.setRaceAsianIndianValueRange(ValueRange.of(0, 1));
			this.setRaceAsianIndiansimulatedresponse(SimulatedResponseRace.getErrorResponse());
			this.setRaceAsianOtherValueRange(ValueRange.of(0, 1));
			this.setRaceAsianOthersimulatedresponse(SimulatedResponseRace.getErrorResponse());
			this.setRaceAsianFilipinoValueRange(ValueRange.of(0, 1));
			this.setRaceAsianFilipinosimulatedresponse(SimulatedResponseRace.getErrorResponse());
			this.setRacePacificIslanderValueRange(ValueRange.of(0, 1));
			this.setRacePacificIslandersimulatedresponse(SimulatedResponseRace.getErrorResponse());
			this.setRaceOtherValueRange(ValueRange.of(0, 1));
			this.setRaceOthersimulatedresponse(SimulatedResponseRace.getErrorResponse());
			this.setRaceAsianChineseValueRange(ValueRange.of(0, 1));
			this.setRaceAsianChinesesimulatedresponse(SimulatedResponseRace.getErrorResponse());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceWhiteValueRange
	 * @param racewhitesimulatedepicresponse
	 * @param raceAfricanAmerican
	 * @param raceafricanamericansimulatedepicresponse
	 * @param RaceAmericanIndian
	 * @param raceamericanindiansimulatedepicresponse
	 * @param RaceAsianPacificIslander
	 * @param raceasianPacificIslandersimulatedepicresponse
	 * @param RaceAsianJapan
	 * @param raceasianjapansimulatedepicresponse
	 * @param RaceAsianIndian
	 * @param raceasianindiansimulatedepicresponse
	 * @param RaceAsianOther
	 * @param raceasianothersimulatedepicresponse
	 * @param RaceAsianFilipino
	 * @param raceasianfilipinosimulatedepicresponse
	 * @param RacePacificIslander
	 * @param racepacificislandersimulatedepicresponse
	 * @param RaceOther
	 * @param raceothersimulatedepicresponse
	 */
	public SimulatedResponseRace(ValueRange raceWhite, int racewhitesimulatedepicresponse,
			ValueRange raceAfricanAmerican, int raceafricanamericansimulatedepicresponse, ValueRange RaceAmericanIndian,
			int raceamericanindiansimulatedepicresponse, ValueRange RaceAsianPacificIslander,
			int raceasianPacificIslandersimulatedepicresponse, ValueRange RaceAsianJapan,
			int raceasianjapansimulatedepicresponse, ValueRange RaceAsianIndian,
			int raceasianindiansimulatedepicresponse, ValueRange RaceAsianOther,
			int raceasianothersimulatedepicresponse, ValueRange RaceAsianFilipino,
			int raceasianfilipinosimulatedepicresponse, ValueRange RacePacificIslander,
			int racepacificislandersimulatedepicresponse, ValueRange RaceOther, int raceothersimulatedepicresponse) {
		// TODO Auto-generated constructor stub
		try {
			// To be reworked
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new RandomizingDistribution());

			this.setRaceWhiteValueRange(raceWhite);
			this.setRaceWhitesimulatedresponse(racewhitesimulatedepicresponse);
			this.setRaceAfricanAmericanValueRange(raceAfricanAmerican);
			this.setRaceAfricanAmericansimulatedresponse(raceafricanamericansimulatedepicresponse);
			this.setRaceAmericanIndianValueRange(RaceAmericanIndian);
			this.setRaceAmericanIndiansimulatedresponse(raceamericanindiansimulatedepicresponse);
			this.setRacePacificIslanderValueRange(RaceAsianPacificIslander);
			this.setRacePacificIslandersimulatedresponse(raceasianPacificIslandersimulatedepicresponse);
			this.setRaceAsianJapanValueRange(RaceAsianJapan);
			this.setRaceAsianJapansimulatedresponse(raceasianjapansimulatedepicresponse);
			this.setRaceAsianFilipinoValueRange(RaceAsianFilipino);
			this.setRaceAsianIndiansimulatedresponse(raceasianindiansimulatedepicresponse);
			this.setRaceAsianOtherValueRange(RaceAsianOther);
			this.setRaceAsianOthersimulatedresponse(raceasianothersimulatedepicresponse);
			this.setRaceAsianFilipinoValueRange(RaceAsianFilipino);
			this.setRaceAsianFilipinosimulatedresponse(raceasianfilipinosimulatedepicresponse);
			this.setRacePacificIslanderValueRange(RacePacificIslander);
			this.setRacePacificIslandersimulatedresponse(racepacificislandersimulatedepicresponse);
			this.setRaceOtherValueRange(RaceOther);
			this.setRaceOthersimulatedresponse(raceothersimulatedepicresponse);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @return the raceafricanamericansimulatedepicresponse
	 */
	/**
	 * @return
	 */
	public int getRaceAfricanAmericansimulatedresponse() {
		try {
			return this.raceAfricanAmericansimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAfricanAmericansimulatedresponse;
	}

	/**
	 * @return the raceAfricanAmerican
	 */
	/**
	 * @return
	 */
	private ValueRange getRaceAfricanAmericanValueRange() {
		try {
			return this.raceAfricanAmericanValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAfricanAmericanValueRange;
	}

	/**
	 * @return the raceamericanindiansimulatedepicresponse
	 */
	/**
	 * @return
	 */
	public int getRaceAmericanIndiansimulatedresponse() {
		try {
			return this.raceAmericanIndiansimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAmericanIndiansimulatedresponse;
	}

	/**
	 * @return the raceAmericanIndianValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getRaceAmericanIndianValueRange() {
		try {
			return this.raceAmericanIndianValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAmericanIndianValueRange;
	}

	/**
	 * @return the raceAsianChinesesimulatedresponse
	 */
	public int getRaceAsianChinesesimulatedresponse() {
		return this.raceAsianChinesesimulatedresponse;
	}

	/**
	 * @return the raceAsianChineseValueRange
	 */
	private ValueRange getRaceAsianChineseValueRange() {
		return this.raceAsianChineseValueRange;
	}

	/**
	 * @return the raceasianfilipinosimulatedepicresponse
	 */
	/**
	 * @return
	 */
	public int getRaceAsianFilipinosimulatedresponse() {
		try {
			return this.raceAsianFilipinosimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAsianFilipinosimulatedresponse;
	}

	/**
	 * @return the raceAsianFilipinoValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getRaceAsianFilipinoValueRange() {
		try {
			return this.raceAsianFilipinoValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAsianFilipinoValueRange;
	}

	/**
	 * @return the raceasianindiansimulatedepicresponse
	 */
	/**
	 * @return
	 */
	public int getRaceAsianIndiansimulatedresponse() {
		try {
			return this.raceAsianIndiansimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAsianIndiansimulatedresponse;
	}

	/**
	 * @return the raceAsianIndianValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getRaceAsianIndianValueRange() {
		try {
			return this.raceAsianIndianValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAsianIndianValueRange;
	}

	/**
	 * @return the raceasianjapansimulatedepicresponse
	 */
	/**
	 * @return
	 */
	public int getRaceAsianJapansimulatedresponse() {
		try {
			return this.raceAsianJapansimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAsianJapansimulatedresponse;
	}

	/**
	 * @return the raceAsianJapanValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getRaceAsianJapanValueRange() {
		try {
			return this.raceAsianJapanValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAsianJapanValueRange;
	}

	/**
	 * @return the raceasianothersimulatedepicresponse
	 */
	/**
	 * @return
	 */
	public int getRaceAsianOthersimulatedresponse() {
		try {
			return this.raceAsianOthersimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @return the raceAsianOtherValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getRaceAsianOtherValueRange() {
		try {
			return this.raceAsianOtherValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAsianOtherValueRange;
	}

	/**
	 * @return the raceothersimulatedepicresponse
	 */
	/**
	 * @return
	 */
	public int getRaceOthersimulatedresponse() {
		try {
			return this.raceOthersimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceOthersimulatedresponse;
	}

	/**
	 * @return the raceOtherValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getRaceOtherValueRange() {
		try {
			return this.raceOtherValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceOtherValueRange;
	}

	/**
	 * @return the raceasianPacificIslandersimulatedepicresponse
	 */
	/**
	 * @return
	 */
	public int getRacePacificIslandersimulatedresponse() {
		try {
			return this.raceAsianPacificIslandersimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAsianPacificIslandersimulatedresponse;
	}

	/**
	 * @return the raceAsianPacificIslanderValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getRacePacificIslanderValueRange() {
		try {
			return this.raceAsianPacificIslanderValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceAsianPacificIslanderValueRange;
	}

	/**
	 * @return the racewhitesimulatedepicresponse
	 */
	/**
	 * @return
	 */
	public int getRaceWhitesimulatedresponse() {
		try {
			return this.raceWhitesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceWhitesimulatedresponse;
	}

	/**
	 * @return the raceWhiteValueRange
	 */
	/**
	 * @return
	 */
	private ValueRange getRaceWhiteValueRange() {
		try {
			return this.raceWhiteValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.raceWhiteValueRange;
	}

	/**
	 * @return the uniformdistribution
	 */
	/**
	 * @return
	 */
	private RandomizingDistribution getUniformdistribution() {
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

	public void raceResponseVariables() throws Exception {
		try {
			this.simulateRaceAfricanAmericanResponse(this.getRaceAfricanAmericanValueRange(),
					SimulatedResponseRace.getErrorResponse());
			this.simulateRaceAmericanIndianResponse(this.getRaceAmericanIndianValueRange(),
					SimulatedResponseRace.getErrorResponse());
			this.simulateRaceAsianFilipinoResponse(this.getRaceAsianFilipinoValueRange(),
					SimulatedResponseRace.getErrorResponse());
			this.simulateRaceAsianIndianResponse(this.getRaceAsianIndianValueRange(),
					SimulatedResponseRace.getErrorResponse());
			this.simulateRaceAsianJapanResponse(this.getRaceAsianJapanValueRange(),
					SimulatedResponseRace.getErrorResponse());
			this.simulateRacePacificIslanderResponse(this.getRacePacificIslanderValueRange(),
					SimulatedResponseRace.getErrorResponse());
			this.simulateRaceWhiteResponse(this.getRaceWhiteValueRange(), SimulatedResponseRace.getErrorResponse());
			this.simulateRaceAsianOtherResponse(this.getRaceAsianOtherValueRange(),
					SimulatedResponseRace.getErrorResponse());
			this.simulateRaceOtherResponse(this.getRaceOtherValueRange(), SimulatedResponseRace.getErrorResponse());

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param raceafricanamericanerrorresponse the raceafricanamericanerrorresponse
	 *                                         to set
	 */
	/**
	 * @param raceafricanamericanerrorresponse
	 */
	private void setRaceAfricanAmericansimulatedresponse(int raceafricanamericanerrorresponse) {
		try {
			this.raceAfricanAmericansimulatedresponse = raceafricanamericanerrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceAfricanAmerican the raceAfricanAmerican to set
	 */
	/**
	 * @param raceAfricanAmerican
	 */
	private void setRaceAfricanAmericanValueRange(ValueRange raceAfricanAmerican) {
		try {
			this.raceAfricanAmericanValueRange = raceAfricanAmerican;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceamericanindianerrorresponse the
	 *                                        raceamericanindiansimulatedepicresponse
	 *                                        to set
	 */
	/**
	 * @param raceamericanindianerrorresponse
	 */
	private void setRaceAmericanIndiansimulatedresponse(int raceamericanindianerrorresponse) {
		try {
			this.raceAmericanIndiansimulatedresponse = raceamericanindianerrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceAmericanIndianValueRange the raceAmericanIndianValueRange to set
	 */
	/**
	 * @param raceAmericanIndianValueRange
	 */
	private void setRaceAmericanIndianValueRange(ValueRange raceAmericanIndian) {
		try {
			this.raceAmericanIndianValueRange = raceAmericanIndian;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceAsianChinesesimulatedresponse the
	 *                                          raceAsianChinesesimulatedresponse to
	 *                                          set
	 */
	private void setRaceAsianChinesesimulatedresponse(int raceAsianChinesesimulatedresponse) {
		this.raceAsianChinesesimulatedresponse = raceAsianChinesesimulatedresponse;
	}

	/**
	 * @param raceAsianChineseValueRange the raceAsianChineseValueRange to set
	 */
	private void setRaceAsianChineseValueRange(ValueRange raceAsianChineseValueRange) {
		this.raceAsianChineseValueRange = raceAsianChineseValueRange;
	}

	/**
	 * @param raceasianfilipinoerrorresponse the
	 *                                       raceasianfilipinosimulatedepicresponse
	 *                                       to set
	 */
	/**
	 * @param raceasianfilipinoerrorresponse
	 */
	private void setRaceAsianFilipinosimulatedresponse(int raceasianfilipinoerrorresponse) {
		try {
			this.raceAsianFilipinosimulatedresponse = raceasianfilipinoerrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceAsianFilipinoValueRange the raceAsianFilipinoValueRange to set
	 */
	/**
	 * @param raceAsianFilipinoValueRange
	 */
	private void setRaceAsianFilipinoValueRange(ValueRange raceAsianFilipino) {
		try {
			this.raceAsianFilipinoValueRange = raceAsianFilipino;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceasianindianerrorresponse the raceasianindiansimulatedepicresponse
	 *                                     to set
	 */
	/**
	 * @param raceasianindianerrorresponse
	 */
	private void setRaceAsianIndiansimulatedresponse(int raceasianindianerrorresponse) {
		try {
			this.raceAsianIndiansimulatedresponse = raceasianindianerrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceAsianIndianValueRange the raceAsianIndianValueRange to set
	 */
	/**
	 * @param raceAsianIndianValueRange
	 */
	private void setRaceAsianIndianValueRange(ValueRange raceAsianIndian) {
		try {
			this.raceAsianIndianValueRange = raceAsianIndian;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceasianjapanerrorresponse the raceasianjapansimulatedepicresponse to
	 *                                    set
	 */
	/**
	 * @param raceasianjapanerrorresponse
	 */
	private void setRaceAsianJapansimulatedresponse(int raceasianjapanerrorresponse) {
		try {
			this.raceAsianJapansimulatedresponse = raceasianjapanerrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceAsianJapanValueRange the raceAsianJapanValueRange to set
	 */
	/**
	 * @param raceAsianJapanValueRange
	 */
	private void setRaceAsianJapanValueRange(ValueRange raceAsianJapan) {
		try {
			this.raceAsianJapanValueRange = raceAsianJapan;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceasianothererrorresponse the raceasianothersimulatedepicresponse to
	 *                                    set
	 */
	/**
	 * @param raceasianothererrorresponse
	 */
	private void setRaceAsianOthersimulatedresponse(int raceasianothererrorresponse) {
		try {
			this.raceAsianOthersimulatedresponse = raceasianothererrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceAsianOtherValueRange the raceAsianOtherValueRange to set
	 */
	/**
	 * @param raceAsianOtherValueRange
	 */
	private void setRaceAsianOtherValueRange(ValueRange raceAsianOther) {
		try {
			this.raceAsianOtherValueRange = raceAsianOther;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceothersimulatedepicresponse the raceothersimulatedepicresponse to
	 *                                       set
	 */
	/**
	 * @param raceothersimulatedepicresponse
	 */
	private void setRaceOthersimulatedresponse(int raceothersimulatedepicresponse) {
		try {
			this.raceOthersimulatedresponse = raceothersimulatedepicresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceOtherValueRange the raceOtherValueRange to set
	 */
	/**
	 * @param raceOtherValueRange
	 */
	private void setRaceOtherValueRange(ValueRange raceOther) {
		try {
			this.raceOtherValueRange = raceOther;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceasianPacificIslandererrorresponse the
	 *                                              raceasianPacificIslandersimulatedepicresponse
	 *                                              to set
	 */
	/**
	 * @param raceasianPacificIslandererrorresponse
	 */
	private void setRacePacificIslandersimulatedresponse(int raceasianPacificIslandererrorresponse) {
		try {
			this.raceAsianPacificIslandersimulatedresponse = raceasianPacificIslandererrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceAsianPacificIslanderValueRange the
	 *                                           raceAsianPacificIslanderValueRange
	 *                                           to set
	 */
	/**
	 * @param raceAsianPacificIslanderValueRange
	 */
	private void setRacePacificIslanderValueRange(ValueRange raceAsianPacificIslander) {
		try {
			this.raceAsianPacificIslanderValueRange = raceAsianPacificIslander;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param racewhiteresponse the racewhitesimulatedepicresponse to set
	 */
	/**
	 * @param racewhiteerrorresponse
	 */
	private void setRaceWhitesimulatedresponse(int racewhiteerrorresponse) {
		try {
			this.raceWhitesimulatedresponse = racewhiteerrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param raceWhiteValueRange the raceWhiteValueRange to set
	 */
	/**
	 * @param raceWhiteValueRange
	 */
	private void setRaceWhiteValueRange(ValueRange raceWhite) {
		try {
			this.raceWhiteValueRange = raceWhite;
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
	private void setUniformdistribution(RandomizingDistribution uniformdist) {
		try {
			this.uniformdistribution = uniformdist;
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
	 * @param valuerange
	 * @param raceafricanamericanserrorresponse
	 * @return
	 */
	private int simulateRaceAfricanAmericanResponse(ValueRange valuerange, int raceafricanamericanserrorresponse) {
		try {
			this.setRaceAfricanAmericanValueRange(valuerange);
			this.setRaceAfricanAmericansimulatedresponse(raceafricanamericanserrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseRace.getMinimumtogenerateerrorresponse(),
							SimulatedResponseRace.getMaximumtogenerateerrorresponse())))) {
				this.setRaceAfricanAmericansimulatedresponse(
						this.getUtilities().randBetween((int) this.getRaceAfricanAmericanValueRange().getMinimum(),
								(int) this.getRaceAfricanAmericanValueRange().getMaximum()));
				return this.getRaceAfricanAmericansimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return raceafricanamericanserrorresponse;
	}

	/**
	 * @param valuerange
	 * @param raceamericanindianerrorresponse
	 * @return
	 */
	private int simulateRaceAmericanIndianResponse(ValueRange valuerange, int raceamericanindianerrorresponse) {
		try {
			this.setRaceAmericanIndianValueRange(valuerange);
			this.setRaceAmericanIndiansimulatedresponse(raceamericanindianerrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseRace.getMinimumtogenerateerrorresponse(),
							SimulatedResponseRace.getMaximumtogenerateerrorresponse())))) {
				this.setRaceAmericanIndiansimulatedresponse(
						this.getUtilities().randBetween((int) this.getRaceAmericanIndianValueRange().getMinimum(),
								(int) this.getRaceAmericanIndianValueRange().getMaximum()));
				return this.getRaceAmericanIndiansimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return raceamericanindianerrorresponse;
	}

	private int simulateRaceAsianChineseResponse(ValueRange valuerange, int raceasianChineseerrorresponse) {
		try {
			this.setRaceAsianChineseValueRange(valuerange);
			this.setRaceAsianChinesesimulatedresponse(raceasianChineseerrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseRace.getMinimumtogenerateerrorresponse(),
							SimulatedResponseRace.getMaximumtogenerateerrorresponse())))) {
				this.setRaceAsianJapansimulatedresponse(
						this.getUtilities().randBetween((int) this.getRaceAsianChineseValueRange().getMinimum(),
								(int) this.getRaceAsianChineseValueRange().getMaximum()));
				return this.getRaceAsianChinesesimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return raceasianChineseerrorresponse;
	}

	/**
	 * @param valuerange
	 * @param raceasianFilipinoerrorresponse
	 * @return
	 */
	private int simulateRaceAsianFilipinoResponse(ValueRange valuerange, int raceasianFilipinoerrorresponse) {
		try {
			this.setRaceAsianFilipinoValueRange(valuerange);
			this.setRaceAsianFilipinosimulatedresponse(raceasianFilipinoerrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseRace.getMinimumtogenerateerrorresponse(),
							SimulatedResponseRace.getMaximumtogenerateerrorresponse())))) {

				this.setRaceAsianFilipinosimulatedresponse(
						this.getUtilities().randBetween((int) this.getRaceAsianFilipinoValueRange().getMinimum(),
								(int) this.getRaceAsianFilipinoValueRange().getMaximum()));
				return this.getRaceAsianFilipinosimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return raceasianFilipinoerrorresponse;
	}

	/**
	 * @param valuerange
	 * @param raceasianIndianerrorresponse
	 * @return
	 */
	private int simulateRaceAsianIndianResponse(ValueRange valuerange, int raceasianIndianerrorresponse) {
		try {
			this.setRaceAsianIndianValueRange(valuerange);
			this.setRaceAsianIndiansimulatedresponse(raceasianIndianerrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseRace.getMinimumtogenerateerrorresponse(),
							SimulatedResponseRace.getMaximumtogenerateerrorresponse())))) {
				;
			}
			{
				this.setRaceAsianIndiansimulatedresponse(
						this.getUtilities().randBetween((int) this.getRaceAsianIndianValueRange().getMinimum(),
								(int) this.getRaceAsianIndianValueRange().getMaximum()));
				return this.getRaceAsianFilipinosimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return raceasianIndianerrorresponse;
	}

	/**
	 * @param valuerange
	 * @param raceasianJapanerrorresponse
	 * @return
	 */
	private int simulateRaceAsianJapanResponse(ValueRange valuerange, int raceasianJapanerrorresponse) {
		try {
			this.setRaceAsianJapanValueRange(valuerange);
			this.setRaceAsianJapansimulatedresponse(raceasianJapanerrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseRace.getMinimumtogenerateerrorresponse(),
							SimulatedResponseRace.getMaximumtogenerateerrorresponse())))) {
				this.setRaceAsianJapansimulatedresponse(
						this.getUtilities().randBetween((int) this.getRaceAsianJapanValueRange().getMinimum(),
								(int) this.getRaceAsianJapanValueRange().getMaximum()));
				return this.getRaceAsianJapansimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return raceasianJapanerrorresponse;
	}

	/**
	 * @param valuerange
	 * @param raceasianOthererrorresponse
	 * @return
	 */
	private int simulateRaceAsianOtherResponse(ValueRange valuerange, int raceasianOthererrorresponse) {
		try {
			this.setRaceAsianOtherValueRange(valuerange);
			this.setRaceAsianOthersimulatedresponse(raceasianOthererrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseRace.getMinimumtogenerateerrorresponse(),
							SimulatedResponseRace.getMaximumtogenerateerrorresponse())))) {
				this.setRaceAsianOthersimulatedresponse(
						this.getUtilities().randBetween((int) this.getRaceAsianOtherValueRange().getMinimum(),
								(int) this.getRaceAsianOtherValueRange().getMaximum()));
				return this.getRaceAsianOthersimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return raceasianOthererrorresponse;
	}

	private int simulateRaceOtherResponse(ValueRange valuerange, int raceOthererrorresponse) {
		try {
			this.setRaceOtherValueRange(valuerange);
			this.setRaceOthersimulatedresponse(raceOthererrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseRace.getMinimumtogenerateerrorresponse(),
							SimulatedResponseRace.getMaximumtogenerateerrorresponse())))) {
				this.setRaceOthersimulatedresponse(
						this.getUtilities().randBetween((int) this.getRaceOtherValueRange().getMinimum(),
								(int) this.getRaceOtherValueRange().getMaximum()));
				return this.getRaceOthersimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return raceOthererrorresponse;
	}

	/**
	 * @param valuerange
	 * @param raceasianPacificIslandererrorresponse
	 * @return
	 */
	private int simulateRacePacificIslanderResponse(ValueRange valuerange, int raceasianPacificIslandererrorresponse)
			throws Exception {
		try {
			this.setRacePacificIslanderValueRange(valuerange);
			this.setRacePacificIslandersimulatedresponse(raceasianPacificIslandererrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseRace.getMinimumtogenerateerrorresponse(),
							SimulatedResponseRace.getMaximumtogenerateerrorresponse())))) {
				this.setRacePacificIslandersimulatedresponse(
						(this.getUtilities().randBetween((int) this.getRacePacificIslanderValueRange().getMinimum(),
								(int) this.getRacePacificIslanderValueRange().getMaximum())));
				return this.getRacePacificIslandersimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return raceasianPacificIslandererrorresponse;
	}

	public void simulateRaceResponseVariables() throws Exception {
		try {
			this.simulateRaceAfricanAmericanResponse(this.getRaceAfricanAmericanValueRange(),
					this.getRaceAfricanAmericansimulatedresponse());
			this.simulateRaceAmericanIndianResponse(this.getRaceAmericanIndianValueRange(),
					this.getRaceAmericanIndiansimulatedresponse());
			this.simulateRaceAsianFilipinoResponse(this.getRaceAsianFilipinoValueRange(),
					this.getRaceAsianFilipinosimulatedresponse());
			this.simulateRaceAsianIndianResponse(this.getRaceAsianIndianValueRange(),
					this.getRaceAsianIndiansimulatedresponse());
			this.simulateRaceAsianJapanResponse(this.getRaceAsianJapanValueRange(),
					this.getRaceAsianJapansimulatedresponse());
			this.simulateRaceAsianOtherResponse(this.getRaceAsianOtherValueRange(),
					this.getRaceAsianOthersimulatedresponse());
			this.simulateRaceOtherResponse(this.getRaceOtherValueRange(), this.getRaceOthersimulatedresponse());
			this.simulateRacePacificIslanderResponse(this.getRacePacificIslanderValueRange(),
					this.getRacePacificIslandersimulatedresponse());
			this.simulateRaceAsianChineseResponse(this.getRaceAsianChineseValueRange(),
					this.getRaceAsianChinesesimulatedresponse());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	private int simulateRaceWhiteResponse(ValueRange valuerange, int racewhiteerrorresponse) {
		try {
			this.setRaceAfricanAmericanValueRange(valuerange);
			this.setRaceAfricanAmericansimulatedresponse(racewhiteerrorresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(
					this.getUtilities().randBetween(SimulatedResponseRace.getMinimumtogenerateerrorresponse(),
							SimulatedResponseRace.getMaximumtogenerateerrorresponse())))) {
				this.setRaceAfricanAmericansimulatedresponse(
						this.getUtilities().randBetween((int) this.getRaceWhiteValueRange().getMinimum(),
								(int) this.getRaceWhiteValueRange().getMaximum()));
				return this.getRaceAfricanAmericansimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return racewhiteerrorresponse;
	}

	@Override
	public String toString() {
		try {
			return Messages.getString("SimulatedResponseRace.0") //$NON-NLS-1$
					+ this.raceAfricanAmericansimulatedresponse + Messages.getString("SimulatedResponseRace.1") //$NON-NLS-1$
					+ this.raceAfricanAmericanValueRange + Messages.getString("SimulatedResponseRace.2") //$NON-NLS-1$
					+ this.raceAmericanIndianValueRange + Messages.getString("SimulatedResponseRace.3") //$NON-NLS-1$
					+ this.raceAmericanIndiansimulatedresponse + Messages.getString("SimulatedResponseRace.4") //$NON-NLS-1$
					+ this.raceAsianFilipinoValueRange + Messages.getString("SimulatedResponseRace.5") //$NON-NLS-1$
					+ this.raceAsianFilipinosimulatedresponse + Messages.getString("SimulatedResponseRace.6") //$NON-NLS-1$
					+ this.raceAsianIndianValueRange + Messages.getString("SimulatedResponseRace.7") //$NON-NLS-1$
					+ this.raceAsianIndiansimulatedresponse + Messages.getString("SimulatedResponseRace.8") //$NON-NLS-1$
					+ this.raceAsianJapanValueRange + Messages.getString("SimulatedResponseRace.9") //$NON-NLS-1$
					+ this.raceAsianJapansimulatedresponse + Messages.getString("SimulatedResponseRace.10") //$NON-NLS-1$
					+ this.raceAsianOtherValueRange + Messages.getString("SimulatedResponseRace.11") //$NON-NLS-1$
					+ this.raceAsianOthersimulatedresponse + Messages.getString("SimulatedResponseRace.12") //$NON-NLS-1$
					+ this.raceAsianPacificIslanderValueRange + Messages.getString("SimulatedResponseRace.13") //$NON-NLS-1$
					+ this.raceAsianPacificIslandersimulatedresponse + Messages.getString("SimulatedResponseRace.14") //$NON-NLS-1$
					+ this.raceOtherValueRange + Messages.getString("SimulatedResponseRace.15") + this.raceOthersimulatedresponse //$NON-NLS-1$
					+ Messages.getString("SimulatedResponseRace.16") + this.racePacificIslanderValueRange //$NON-NLS-1$
					+ Messages.getString("SimulatedResponseRace.17") + this.racePacificIslandersimulatedresponse //$NON-NLS-1$
					+ Messages.getString("SimulatedResponseRace.18") + this.raceWhiteValueRange + Messages.getString("SimulatedResponseRace.19") //$NON-NLS-1$ //$NON-NLS-2$
					+ this.raceWhitesimulatedresponse + Messages.getString("SimulatedResponseRace.20") + this.uniformdistribution //$NON-NLS-1$
					+ Messages.getString("SimulatedResponseRace.21") + this.utilities + Messages.getString("SimulatedResponseRace.22"); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Messages.getString("SimulatedResponseRace.23") //$NON-NLS-1$
				+ this.raceAfricanAmericansimulatedresponse + Messages.getString("SimulatedResponseRace.24") //$NON-NLS-1$
				+ this.raceAfricanAmericanValueRange + Messages.getString("SimulatedResponseRace.25") //$NON-NLS-1$
				+ this.raceAmericanIndianValueRange + Messages.getString("SimulatedResponseRace.26") //$NON-NLS-1$
				+ this.raceAmericanIndiansimulatedresponse + Messages.getString("SimulatedResponseRace.27") //$NON-NLS-1$
				+ this.raceAsianFilipinoValueRange + Messages.getString("SimulatedResponseRace.28") //$NON-NLS-1$
				+ this.raceAsianFilipinosimulatedresponse + Messages.getString("SimulatedResponseRace.29") //$NON-NLS-1$
				+ this.raceAsianIndianValueRange + Messages.getString("SimulatedResponseRace.30") //$NON-NLS-1$
				+ this.raceAsianIndiansimulatedresponse + Messages.getString("SimulatedResponseRace.31") + this.raceAsianJapanValueRange //$NON-NLS-1$
				+ Messages.getString("SimulatedResponseRace.32") + this.raceAsianJapansimulatedresponse //$NON-NLS-1$
				+ Messages.getString("SimulatedResponseRace.33") + this.raceAsianOtherValueRange + Messages.getString("SimulatedResponseRace.34") //$NON-NLS-1$ //$NON-NLS-2$
				+ this.raceAsianOthersimulatedresponse + Messages.getString("SimulatedResponseRace.35") //$NON-NLS-1$
				+ this.raceAsianPacificIslanderValueRange + Messages.getString("SimulatedResponseRace.36") //$NON-NLS-1$
				+ this.raceAsianPacificIslandersimulatedresponse + Messages.getString("SimulatedResponseRace.37") + this.raceOtherValueRange //$NON-NLS-1$
				+ Messages.getString("SimulatedResponseRace.38") + this.raceOthersimulatedresponse + Messages.getString("SimulatedResponseRace.39") //$NON-NLS-1$ //$NON-NLS-2$
				+ this.racePacificIslanderValueRange + Messages.getString("SimulatedResponseRace.40") //$NON-NLS-1$
				+ this.racePacificIslandersimulatedresponse + Messages.getString("SimulatedResponseRace.41") + this.raceWhiteValueRange //$NON-NLS-1$
				+ Messages.getString("SimulatedResponseRace.42") + this.raceWhitesimulatedresponse + Messages.getString("SimulatedResponseRace.43") //$NON-NLS-1$ //$NON-NLS-2$
				+ this.uniformdistribution + Messages.getString("SimulatedResponseRace.44") + this.utilities + Messages.getString("SimulatedResponseRace.45"); //$NON-NLS-1$ //$NON-NLS-2$

	}

}
