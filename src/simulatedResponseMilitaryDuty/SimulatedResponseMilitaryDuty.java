/**
 * @author Lalitha Viswanathan
 * Affiliation: MAVERIC / VABHS
 */
package simulatedResponseMilitaryDuty;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import randomizer.UniformDistribution;

public class SimulatedResponseMilitaryDuty {

	// Move these to Military package
	// Assumption: Not mutually exclusive (equivalent of noise in responses)

	/**
	*
	*/
	private static int errorResponse;
	private static final int maximumtogenerateerrorresponse = 4;

	private static final int minimumtogenerateerrorresponse = 2;

	/**
	 * @return the errorResponse
	 */
	private static int getErrorResponse() {
		return errorResponse;
	}

	/**
	 * @return the maximumtogenerateerrorresponse
	 */
	private static int getMaximumtogenerateerrorresponse() {
		return maximumtogenerateerrorresponse;
	}

	/**
	 * @return the minimumtogenerateerrorresponse
	 */
	private static int getMinimumtogenerateerrorresponse() {
		try {
			return minimumtogenerateerrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return minimumtogenerateerrorresponse;

	}

	/**
	 * @param errorResponse the errorResponse to set
	 */
	private static void setErrorResponse(int errorResponse) {
		try {
			SimulatedResponseMilitaryDuty.errorResponse = errorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	private int DeployGulfsimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange DeployGulfValueRange;

	/**
	 *
	 */
	private int DeployOEFOIFsimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange DeployOEFOIFValueRange;

	/**
	 *
	 */
	private int MilitaryBranchAirForcesimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryBranchAirForceValueRange;

	/**
	 *
	 */
	private int MilitaryBranchArmysimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryBranchArmyValueRange;

	/**
	 *
	 */
	private int MilitaryBranchCoastGuardsimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryBranchCoastGuardValueRange;

	/**
	 *
	 */
	private int MilitaryBranchMilitaryCrosssimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryBranchMilitaryCrossValueRange;

	/**
	 *
	 */
	private int MilitaryBranchMMsimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryBranchMMValueRange;

	/**
	 *
	 */
	private int MilitaryBranchNationalGuardsimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryBranchNationalGuardValueRange;

	/**
	 *
	 */
	private int MilitaryBranchNavysimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryBranchNavyValueRange;

	/**
	 *
	 */
	private int MilitaryBranchNOAAsimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryBranchNOAAValueRange;

	/**
	 *
	 */
	private int MilitaryBranchPublicHealthServicesimulatederrorresponse;

	/**
	 *
	 */
	private int MilitaryService1simulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryService1ValueRange;

	/**
	 *
	 */
	private int MilitaryService2simulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryService2ValueRange;

	/**
	 *
	 */
	private int MilitaryService3simulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryService3ValueRange;

	/**
	 *
	 */
	private int MilitaryService4simulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryService4ValueRange;

	/**
	 *
	 */
	private int MilitaryService5simulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryService5ValueRange;

	/**
	 *
	 */
	private int MilitaryService6simulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryService6ValueRange;

	/**
	 *
	 */
	private int MilitaryService7simulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryService7ValueRange;

	/**
	 *
	 */
	private int MilitaryService8simulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryService8ValueRange;

	/**
	 *
	 */
	private int MilitaryService9simulatederrorresponse;

	/**
	 *
	 */
	private ValueRange MilitaryService9ValueRange;

	/**
	 *
	 */
	private int MilitaryServiceTypesimulatederrorresponse;

	// Not mutually exclusive
	/**
	*
	*/
	private ValueRange MilitaryServiceTypeValueRange;

	/**
	 *
	 */
	private ValueRange MltyBranchPublicHealthServiceValueRange;

	/**
	 *
	 */
	private int ServiceOutsideUSsimulatederrorresponse;

	// Not mutually exclusive
	/**
	*
	*/
	private ValueRange ServiceOutsideUSValueRange;

	/**
	 *
	 */
	private int StationAsiaFareastsimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange StationAsiaFareastValueRange;

	/**
	 *
	 */
	private int StationAsiaSouthPacificsimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange StationAsiaSouthPacificValueRange;

	/**
	 *
	 */
	private int StationCarribeansimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange StationCarribeanValueRange;

	/**
	 *
	 */
	private int StationEastEuropeansimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange StationEastEuropeanValueRange;

	/**
	 *
	 */
	private int StationMexicosimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange StationMexicoValueRange;

	/**
	 *
	 */
	private int StationMiddleEastsimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange StationMiddleEastValueRange;

	/**
	 *
	 */
	private int StationNortHCentralEuropeansimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange StationNorthCentralEuropeanValueRange;

	/**
	 *
	 */
	private int StationOthersimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange StationOtherValueRange;

	/**
	 *
	 */
	private int StationSouthCentralAmericansimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange StationSouthCentralAmericanValueRange;

	/**
	 *
	 */
	private int StationSouthEuropeanMediterraneansimulatederrorresponse;

	/**
	 *
	 */
	private ValueRange StationSouthEuropeanMediterraneanValueRange;

	/**
	 *
	 */
	private int StationUSCanadasimulatederrorresponse;
	/**
	 *
	 */
	private ValueRange StationUSCanadaValueRange;
	/**
	*
	*/
	private UniformDistribution uniformdist;

	/**
	 *
	 */
	private Utilities utilities;

	/**
	 *
	 */
	public SimulatedResponseMilitaryDuty() {
		// TODO Auto-generated constructor stub

		try {
			this.setUtilities(new Utilities());
			this.setUniformdist(
					new UniformDistribution(SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse()));
			SimulatedResponseMilitaryDuty.setErrorResponse(
					this.getUtilities().randBetween(SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse()));

			this.setMilitaryBranchArmyValueRange(ValueRange.of(0, 1));
			this.setMilitaryBranchArmysimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryBranchNavyValueRange(ValueRange.of(0, 1));
			this.setMilitaryBranchNavysimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryBranchAirForceValueRange(ValueRange.of(0, 1));
			this.setMilitaryBranchAirForcesimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryBranchMilitaryCrossValueRange(ValueRange.of(0, 1));
			this.setMilitaryBranchMilitaryCrosssimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryBranchCoastGuardValueRange(ValueRange.of(0, 1));
			this.setMilitaryBranchCoastGuardsimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryBranchMMValueRange(ValueRange.of(0, 1));
			this.setMilitaryBranchMMsimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryBranchNationalGuardValueRange(ValueRange.of(0, 1));
			this.setMilitaryBranchNationalGuardsimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryBranchNOAAValueRange(ValueRange.of(0, 1));
			this.setMilitaryBranchNOAAsimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMltyBranchPublicHealthServiceValueRange(ValueRange.of(0, 1));
			this.setMilitaryBranchPublicHealthServicesimulatedresponse(
					SimulatedResponseMilitaryDuty.getErrorResponse());
			// Not mutually exclusive
			this.setMilitaryServiceTypeValueRange(ValueRange.of(0, 1));
			this.setMilitaryServiceTypesimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryService1ValueRange(ValueRange.of(0, 1));
			this.setMilitaryService1simulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryService2ValueRange(ValueRange.of(0, 1));
			this.setMilitaryService2simulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryService4ValueRange(ValueRange.of(0, 1));
			this.setMilitaryService4simulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryService3ValueRange(ValueRange.of(0, 1));
			this.setMilitaryService3simulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryService5ValueRange(ValueRange.of(0, 1));
			this.setMilitaryService5simulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryService6ValueRange(ValueRange.of(0, 1));
			this.setMilitaryService6simulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryService8ValueRange(ValueRange.of(0, 1));
			this.setMilitaryService8simulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryService7ValueRange(ValueRange.of(0, 1));
			this.setMilitaryService7simulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setMilitaryService9ValueRange(ValueRange.of(0, 1));
			this.setMilitaryService9simulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			// Not mutually exclusive
			this.setServiceOutsideUSValueRange(ValueRange.of(0, 1));
			this.setServiceOutsideUSsimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setStationAsiaFareastValueRange(ValueRange.of(0, 1));
			this.setStationAsiaFareastsimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setStationCarribeanValueRange(ValueRange.of(0, 1));
			this.setStationCarribeansimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setStationEastEuropeanValueRange(ValueRange.of(0, 1));
			this.setStationEastEuropeansimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setStationAsiaSouthPacificValueRange(ValueRange.of(0, 1));
			this.setStationAsiaSouthPacificsimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setStationMiddleEastValueRange(ValueRange.of(0, 1));
			this.setStationMiddleEastsimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setStationNorthCentralEuropeanValueRange(ValueRange.of(0, 1));
			this.setStationNortHCentralEuropeansimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setStationMexicoValueRange(ValueRange.of(0, 1));
			this.setStationMexicosimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setStationSouthEuropeanMediterraneanValueRange(ValueRange.of(0, 1));
			this.setStationAsiaFareastsimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setStationSouthCentralAmericanValueRange(ValueRange.of(0, 1));
			this.setStationSouthCentralAmericansimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setStationOtherValueRange(ValueRange.of(0, 1));
			this.setStationOthersimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setStationUSCanadaValueRange(ValueRange.of(0, 1));
			this.setStationUSCanadasimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setDeployGulfValueRange(ValueRange.of(0, 1));
			this.setDeployGulfsimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
			this.setDeployOEFOIFValueRange(ValueRange.of(0, 1));
			this.setDeployOEFOIFsimulatedresponse(SimulatedResponseMilitaryDuty.getErrorResponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param MBArmy
	 * @param MBAsimulatedresponse
	 * @param MBNavy
	 * @param MBNavysimulatedresponse
	 * @param MBAirforce
	 * @param MBArforcesimulatedresponse
	 * @param MBMilitaryCross
	 * @param MBMilitaryCrosssimulatedresponse
	 * @param MBCoastGuard
	 * @param MBCoastGuardsimulatedresponse
	 * @param MBMM
	 * @param MBMMsimulatedresponse
	 * @param MBNationalGuard
	 * @param MBNationalGuardsimulatedresponse
	 * @param MBNOAA
	 * @param MBNOAAsimulatedresponse
	 * @param MBPHS
	 * @param MBPHSsimulatedresponse
	 * @param MilitaryServiceTypeValueRange
	 * @param MilitaryServiceTypesimulatedresponse
	 * @param MilitaryService1ValueRange
	 * @param MilitaryService1simulatedresponse
	 * @param MilitaryService2ValueRange
	 * @param MilitaryService2simulatedresponse
	 * @param MilitaryService3ValueRange
	 * @param MilitaryService3simulatedresponse
	 * @param MilitaryService4ValueRange
	 * @param MilitaryService4simulatedresponse
	 * @param MilitaryService5ValueRange
	 * @param MilitaryService5simulatedresponse
	 * @param MilitaryService6ValueRange
	 * @param MilitaryService6simulatedresponse
	 * @param MilitaryService7ValueRange
	 * @param MilitaryService7simulatedresponse
	 * @param MilitaryService8ValueRange
	 * @param MilitaryService8simulatedresponse
	 * @param MilitaryService9ValueRange
	 * @param MilitaryService9simulatedresponse
	 * @param ServiceOutsideUSValueRange
	 * @param SrvOutsideUSAsimulatedresponse
	 * @param StnAsiaFarEast
	 * @param StnAsiaFarEastimulatedresponse
	 * @param StnCarribean
	 * @param StnCarribeansimulatedresponse
	 * @param StationEastEuropeanValueRange
	 * @param StnEastEuropeansimulatedresponse
	 * @param StationAsiaSouthPacificValueRange
	 * @param StnAsiaSouthPacificsimulatedresponse
	 * @param StationMiddleEastValueRange
	 * @param StnMiddleEastsimulatedresponse
	 * @param StationNorthCentralEuropeanValueRange
	 * @param StnNorthCentralEuropeansimulatedresponse
	 * @param StationMexicoValueRange
	 * @param StnMexicosimulatedresponse
	 * @param StationSouthEuropeanMediterraneanValueRange
	 * @param StnSouthEuropeansimulatedresponse
	 * @param StationSouthCentralAmericanValueRange
	 * @param StnSouthCentralAmericansimulatedresponse
	 * @param StationOtherValueRange
	 * @param StnOthersimulatedresponse
	 * @param StationUSCanadaValueRange
	 * @param StnUSCanadasimulatedresponse
	 * @param DeployGulfValueRange
	 * @param DeployGulfsimulatedresponse
	 * @param DeployOEFOIFValueRange
	 * @param DeployOEFOIFsimulatedresponse
	 */
	public SimulatedResponseMilitaryDuty(ValueRange MBArmy, int MBAsimulatedresponse, ValueRange MBNavy,
			int MBNavysimulatedresponse, ValueRange MBAirforce, int MBArforcesimulatedresponse,
			ValueRange MBMilitaryCross, int MBMilitaryCrosssimulatedresponse, ValueRange MBCoastGuard,
			int MBCoastGuardsimulatedresponse, ValueRange MBMM, int MBMMsimulatedresponse, ValueRange MBNationalGuard,
			int MBNationalGuardsimulatedresponse, ValueRange MBNOAA, int MBNOAAsimulatedresponse, ValueRange MBPHS,
			int MBPHSsimulatedresponse, ValueRange MilitaryServiceType, int MilitaryServiceTypesimulatedresponse,
			ValueRange MilitaryService1, int MilitaryService1simulatedresponse, ValueRange MilitaryService2,
			int MilitaryService2simulatedresponse, ValueRange MilitaryService3, int MilitaryService3simulatedresponse,
			ValueRange MilitaryService4, int MilitaryService4simulatedresponse, ValueRange MilitaryService5,
			int MilitaryService5simulatedresponse, ValueRange MilitaryService6, int MilitaryService6simulatedresponse,
			ValueRange MilitaryService7, int MilitaryService7simulatedresponse, ValueRange MilitaryService8,
			int MilitaryService8simulatedresponse, ValueRange MilitaryService9, int MilitaryService9simulatedresponse,
			ValueRange ServiceOutsideUS, int SrvOutsideUSAsimulatedresponse, ValueRange StnAsiaFarEast,
			int StnAsiaFarEastimulatedresponse, ValueRange StnCarribean, int StnCarribeansimulatedresponse,
			ValueRange StnEastEuropean, int StnEastEuropeansimulatedresponse, ValueRange StnAsiaSouthPacific,
			int StnAsiaSouthPacificsimulatedresponse, ValueRange StnMiddleEast, int StnMiddleEastsimulatedresponse,
			ValueRange StnNorthCentralEuropean, int StnNorthCentralEuropeansimulatedresponse, ValueRange StnMexico,
			int StnMexicosimulatedresponse, ValueRange StnSouthEuropeanMediterranean,
			int StnSouthEuropeansimulatedresponse, ValueRange StnSouthCentralAmerican,
			int StnSouthCentralAmericansimulatedresponse, ValueRange StnOther, int StnOthersimulatedresponse,
			ValueRange StnUSCanada, int StnUSCanadasimulatedresponse, ValueRange DeployGulf,
			int DeployGulfsimulatedresponse, ValueRange DeployOEFOIF, int DeployOEFOIFsimulatedresponse) {
		// TODO Auto-generated constructor stub

		try {
			this.setMilitaryBranchArmyValueRange(MBArmy);
			/**
			 * ValueRange MBArmy, int MBAsimulatedresponse, ValueRange MBNavy, int
			 * MBNavysimulatedresponse, ValueRange MBAirforce, int
			 * MBArforcesimulatedresponse, ValueRange MBMilitaryCross, int
			 * MBMilitaryCrosssimulatedresponse, ValueRange MBCoastGuard, int
			 * MBCoastGuardsimulatedresponse, ValueRange MBMM, int MBMMsimulatedresponse,
			 * ValueRange MBNationalGuard, int MBNationalGuardsimulatedresponse, ValueRange
			 * MBNOAA, int MBNOAAsimulatedresponse, ValueRange MBPHS, int
			 * MBPHSsimulatedresponse, ValueRange MilitaryServiceTypeValueRange, int
			 * MilitaryServiceTypesimulatedresponse, ValueRange MilitaryService1ValueRange,
			 * int MilitaryService1simulatedresponse, ValueRange MilitaryService2ValueRange,
			 * int MilitaryService2simulatedresponse, ValueRange MilitaryService3ValueRange,
			 * int MilitaryService3simulatedresponse, ValueRange MilitaryService4ValueRange,
			 * int MilitaryService4simulatedresponse, ValueRange MilitaryService5ValueRange,
			 * int MilitaryService5simulatedresponse, ValueRange MilitaryService6ValueRange,
			 * int MilitaryService6simulatedresponse, ValueRange MilitaryService7ValueRange,
			 * int MilitaryService7simulatedresponse, ValueRange MilitaryService8ValueRange,
			 * int MilitaryService8simulatedresponse, ValueRange MilitaryService9ValueRange,
			 * int MilitaryService9simulatedresponse, ValueRange ServiceOutsideUSValueRange,
			 * int SrvOutsideUSAsimulatedresponse, ValueRange StnAsiaFarEast, int
			 * StnAsiaFarEastimulatedresponse, ValueRange StnCarribean, int
			 * StnCarribeansimulatedresponse, ValueRange StationEastEuropeanValueRange, int
			 * StnEastEuropeansimulatedresponse, ValueRange
			 * StationAsiaSouthPacificValueRange, int StnAsiaSouthPacificsimulatedresponse,
			 * ValueRange StationMiddleEastValueRange, int StnMiddleEastsimulatedresponse,
			 * ValueRange StationNorthCentralEuropeanValueRange, int
			 * StnNorthCentralEuropeansimulatedresponse, ValueRange StationMexicoValueRange,
			 * int StnMexicosimulatedresponse, ValueRange
			 * StationSouthEuropeanMediterraneanValueRange, int
			 * StnSouthEuropeansimulatedresponse, ValueRange
			 * StationSouthCentralAmericanValueRange, int
			 * StnSouthCentralAmericansimulatedresponse, ValueRange StationOtherValueRange,
			 * int StnOthersimulatedresponse, ValueRange StationUSCanadaValueRange, int
			 * StnUSCanadasimulatedresponse, ValueRange DeployGulfValueRange, int
			 * DeployGulfsimulatedresponse, ValueRange DeployOEFOIFValueRange, int
			 * DeployOEFOIFsimulatedresponse
			 **/

			this.setMilitaryBranchArmysimulatedresponse(MBAsimulatedresponse);
			this.setMilitaryBranchNavyValueRange(MBNavy);
			this.setMilitaryBranchNavysimulatedresponse(MBNavysimulatedresponse);
			this.setMilitaryBranchAirForceValueRange(MBAirforce);
			this.setMilitaryBranchAirForcesimulatedresponse(MBArforcesimulatedresponse);
			this.setMilitaryBranchMilitaryCrossValueRange(MBMilitaryCross);
			this.setMilitaryBranchMilitaryCrosssimulatedresponse(MBMilitaryCrosssimulatedresponse);
			this.setMilitaryBranchCoastGuardValueRange(MBCoastGuard);
			this.setMilitaryBranchCoastGuardsimulatedresponse(MBCoastGuardsimulatedresponse);
			this.setMilitaryBranchMMValueRange(MBMM);
			this.setMilitaryBranchMMsimulatedresponse(MBMMsimulatedresponse);
			this.setMilitaryBranchNationalGuardValueRange(MBNationalGuard);
			this.setMilitaryBranchNationalGuardsimulatedresponse(MBNationalGuardsimulatedresponse);
			this.setMilitaryBranchNOAAValueRange(MBNOAA);
			this.setMilitaryBranchNOAAsimulatedresponse(MBNOAAsimulatedresponse);
			this.setMltyBranchPublicHealthServiceValueRange(MBPHS);
			this.setMilitaryBranchPublicHealthServicesimulatedresponse(MBPHSsimulatedresponse);
			// Not mutually exclusive
			this.setMilitaryServiceTypeValueRange(MilitaryServiceType);
			this.setMilitaryServiceTypesimulatedresponse(MilitaryServiceTypesimulatedresponse);
			this.setMilitaryService1ValueRange(MilitaryService1);
			this.setMilitaryService1simulatedresponse(MilitaryService1simulatedresponse);
			this.setMilitaryService2ValueRange(MilitaryService2);
			this.setMilitaryService2simulatedresponse(MilitaryService2simulatedresponse);
			this.setMilitaryService4ValueRange(MilitaryService3);
			this.setMilitaryService4simulatedresponse(MilitaryService3simulatedresponse);
			this.setMilitaryService3ValueRange(MilitaryService4);
			this.setMilitaryService3simulatedresponse(MilitaryService4simulatedresponse);
			this.setMilitaryService5ValueRange(MilitaryService5);
			this.setMilitaryService5simulatedresponse(MilitaryService5simulatedresponse);
			this.setMilitaryService6ValueRange(MilitaryService6);
			this.setMilitaryService6simulatedresponse(MilitaryService6simulatedresponse);
			this.setMilitaryService8ValueRange(MilitaryService7);
			this.setMilitaryService8simulatedresponse(MilitaryService7simulatedresponse);
			this.setMilitaryService7ValueRange(MilitaryService8);
			this.setMilitaryService7simulatedresponse(MilitaryService8simulatedresponse);
			this.setMilitaryService9ValueRange(MilitaryService9);
			this.setMilitaryService9simulatedresponse(MilitaryService9simulatedresponse);
			// Not mutually exclusive
			this.setServiceOutsideUSValueRange(ServiceOutsideUS);
			this.setServiceOutsideUSsimulatedresponse(SrvOutsideUSAsimulatedresponse);
			this.setStationAsiaFareastValueRange(StnAsiaFarEast);
			this.setStationAsiaFareastsimulatedresponse(StnAsiaFarEastimulatedresponse);
			this.setStationCarribeanValueRange(StnCarribean);
			this.setStationCarribeansimulatedresponse(StnCarribeansimulatedresponse);
			this.setStationEastEuropeanValueRange(StnEastEuropean);
			this.setStationEastEuropeansimulatedresponse(StnEastEuropeansimulatedresponse);
			this.setStationAsiaSouthPacificValueRange(StnAsiaSouthPacific);
			this.setStationAsiaSouthPacificsimulatedresponse(StnAsiaSouthPacificsimulatedresponse);
			this.setStationMiddleEastValueRange(StnMiddleEast);
			this.setStationMiddleEastsimulatedresponse(StnMiddleEastsimulatedresponse);
			this.setStationNorthCentralEuropeanValueRange(StnNorthCentralEuropean);
			this.setStationNortHCentralEuropeansimulatedresponse(StnNorthCentralEuropeansimulatedresponse);
			this.setStationMexicoValueRange(StnMexico);
			this.setStationMexicosimulatedresponse(StnMexicosimulatedresponse);
			this.setStationSouthEuropeanMediterraneanValueRange(StnSouthEuropeanMediterranean);
			this.setStationSouthEuropeanMediterraneansimulatedresponse(StnSouthEuropeansimulatedresponse);
			this.setStationSouthCentralAmericanValueRange(StnSouthCentralAmerican);
			this.setStationSouthCentralAmericansimulatedresponse(StnSouthCentralAmericansimulatedresponse);
			this.setStationOtherValueRange(StnOther);
			this.setStationOthersimulatedresponse(StnOthersimulatedresponse);
			this.setStationUSCanadaValueRange(StnUSCanada);
			this.setStationUSCanadasimulatedresponse(StnUSCanadasimulatedresponse);
			this.setDeployGulfValueRange(DeployGulf);
			this.setDeployGulfsimulatedresponse(DeployGulfsimulatedresponse);
			this.setDeployOEFOIFValueRange(DeployOEFOIF);
			this.setDeployOEFOIFsimulatedresponse(DeployOEFOIFsimulatedresponse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @return the deployGulfsimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getDeployGulfsimulatedresponse() {
		try {
			return this.DeployGulfsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.DeployGulfsimulatederrorresponse;

	}

	/**
	 * @return the deployGulf
	 */
	/**
	 * @return
	 */
	private ValueRange getDeployGulfValueRange() {
		try {
			return this.DeployGulfValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.DeployGulfValueRange;
	}

	/**
	 * @return the deployOEFOIFsimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getDeployOEFOIFsimulatedresponse() {
		try {
			return this.DeployOEFOIFsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.DeployOEFOIFsimulatederrorresponse;

	}

	/**
	 * @return the deployOEFOIF
	 */
	/**
	 * @return
	 */
	private ValueRange getDeployOEFOIFValueRange() {
		try {
			return this.DeployOEFOIFValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.DeployOEFOIFValueRange;
	}

	/**
	 * @return the militaryBranchAirForcesimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryBranchAirForcesimulatedresponse() {
		try {
			return this.MilitaryBranchAirForcesimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchAirForcesimulatederrorresponse;

	}

	/**
	 * @return the mltyBranchAirForce
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryBranchAirForceValueRange() {
		try {
			return this.MilitaryBranchAirForceValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchAirForceValueRange;

	}

	/**
	 * @return the militaryBranchArmysimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryBranchArmysimulatedresponse() {
		try {
			return this.MilitaryBranchArmysimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchArmysimulatederrorresponse;

	}

	/**
	 * @return the militaryBranchArmy
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryBranchArmyValueRange() {
		try {
			return this.MilitaryBranchArmyValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchArmyValueRange;

	}

	/**
	 * @return the militaryBranchCoastGuardsimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryBranchCoastGuardsimulatedresponse() {
		try {
			return this.MilitaryBranchCoastGuardsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchCoastGuardsimulatederrorresponse;

	}

	/**
	 * @return the mltyBranchCoastGuard
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryBranchCoastGuardValueRange() {
		try {
			return this.MilitaryBranchCoastGuardValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchCoastGuardValueRange;

	}

	/**
	 * @return the militaryBranchMilitaryCrosssimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryBranchMilitaryCrosssimulatedresponse() {
		try {
			return this.MilitaryBranchMilitaryCrosssimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchMilitaryCrosssimulatederrorresponse;

	}

	/**
	 * @return the mltyBranchMilitaryCross
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryBranchMilitaryCrossValueRange() {
		try {
			return this.MilitaryBranchMilitaryCrossValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchMilitaryCrossValueRange;

	}

	/**
	 * @return the militaryBranchMMsimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryBranchMMsimulatedresponse() {
		try {
			return this.MilitaryBranchMMsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchMMsimulatederrorresponse;

	}

	/**
	 * @return the mltyBranchMM
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryBranchMMValueRange() {
		try {
			return this.MilitaryBranchMMValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchMMValueRange;

	}

	/**
	 * @return the militaryBranchNationalGuardsimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryBranchNationalGuardsimulatedresponse() {
		try {
			return this.MilitaryBranchNationalGuardsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchNationalGuardsimulatederrorresponse;

	}

	/**
	 * @return the mltyBranchNationalGuard
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryBranchNationalGuardValueRange() {
		try {
			return this.MilitaryBranchNationalGuardValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchNationalGuardValueRange;

	}

	/**
	 * @return the militaryBranchNavysimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryBranchNavysimulatedresponse() {
		try {
			return this.MilitaryBranchNavysimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchNavysimulatederrorresponse;

	}

	/**
	 * @return the militaryBranchNavy
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryBranchNavyValueRange() {
		try {
			return this.MilitaryBranchNavyValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchNavyValueRange;

	}

	/**
	 * @return the militaryBranchNOAAsimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryBranchNOAAsimulatedresponse() {
		try {
			return this.MilitaryBranchNOAAsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchNOAAsimulatederrorresponse;

	}

	/**
	 * @return the mltyBranchNOAA
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryBranchNOAAValueRange() {
		try {
			return this.MilitaryBranchNOAAValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchNOAAValueRange;

	}

	/**
	 * @return the militaryBranchPublicHealthServicesimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryBranchPublicHealthServicesimulatedresponse() {
		try {
			return this.MilitaryBranchPublicHealthServicesimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryBranchPublicHealthServicesimulatederrorresponse;

	}

	/**
	 * @return the militaryService1simulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryService1simulatedresponse() {
		try {
			return this.MilitaryService1simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService1simulatederrorresponse;

	}

	/**
	 * @return the militaryService1
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryService1ValueRange() {
		try {
			return this.MilitaryService1ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService1ValueRange;

	}

	/**
	 * @return the militaryService2simulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryService2simulatedresponse() {
		try {
			return this.MilitaryService2simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService2simulatederrorresponse;

	}

	/**
	 * @return the militaryService2
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryService2ValueRange() {
		try {
			return this.MilitaryService2ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService2ValueRange;

	}

	/**
	 * @return the militaryService3simulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryService3simulatedresponse() {
		try {
			return this.MilitaryService3simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService3simulatederrorresponse;

	}

	/**
	 * @return the militaryService3
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryService3ValueRange() {
		try {
			return this.MilitaryService3ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService3ValueRange;

	}

	/**
	 * @return the militaryService4simulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryService4simulatedresponse() {
		try {
			return this.MilitaryService4simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService4simulatederrorresponse;

	}

	/**
	 * @return the militaryService4
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryService4ValueRange() {
		try {
			return this.MilitaryService4ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService4ValueRange;

	}

	/**
	 * @return the militaryService5simulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryService5simulatedresponse() {
		try {
			return this.MilitaryService5simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService5simulatederrorresponse;

	}

	/**
	 * @return the militaryService5
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryService5ValueRange() {
		try {
			return this.MilitaryService5ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService5ValueRange;

	}

	/**
	 * @return the militaryService6simulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryService6simulatedresponse() {
		try {
			return this.MilitaryService6simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService6simulatederrorresponse;

	}

	/**
	 * @return the militaryService6
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryService6ValueRange() {
		try {
			return this.MilitaryService6ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService6ValueRange;

	}

	/**
	 * @return the militaryService7simulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryService7simulatedresponse() {
		try {
			return this.MilitaryService7simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService7simulatederrorresponse;

	}

	/**
	 * @return the militaryService7
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryService7ValueRange() {
		try {
			return this.MilitaryService7ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService7ValueRange;

	}

	/**
	 * @return the militaryService8simulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryService8simulatedresponse() {
		try {
			return this.MilitaryService8simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService8simulatederrorresponse;

	}

	/**
	 * @return the militaryService8
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryService8ValueRange() {
		try {
			return this.MilitaryService8ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService8ValueRange;

	}

	/**
	 * @return the militaryService9simulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryService9simulatedresponse() {
		try {
			return this.MilitaryService9simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService9simulatederrorresponse;

	}

	/**
	 * @return the militaryService9
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryService9ValueRange() {
		try {
			return this.MilitaryService9ValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryService9ValueRange;
	}

	/**
	 * @return the militaryServiceTypesimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getMilitaryServiceTypesimulatedresponse() {
		try {
			return this.MilitaryServiceTypesimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryServiceTypesimulatederrorresponse;

	}

	/**
	 * @return the militaryServiceType
	 */
	/**
	 * @return
	 */
	private ValueRange getMilitaryServiceTypeValueRange() {
		try {
			return this.MilitaryServiceTypeValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MilitaryServiceTypeValueRange;

	}

	/**
	 * @return the mltyBranchPublicHealthService
	 */
	/**
	 * @return
	 */
	private ValueRange getMltyBranchPublicHealthServiceValueRange() {
		try {
			return this.MltyBranchPublicHealthServiceValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.MltyBranchPublicHealthServiceValueRange;

	}

	/**
	 * @return the serviceOutsideUSsimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getServiceOutsideUSsimulatedresponse() {
		try {
			return this.ServiceOutsideUSsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ServiceOutsideUSsimulatederrorresponse;

	}

	/**
	 * @return the serviceOutsideUS
	 */
	/**
	 * @return
	 */
	private ValueRange getServiceOutsideUSValueRange() {
		try {
			return this.ServiceOutsideUSValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.ServiceOutsideUSValueRange;
	}

	/**
	 * @return the stationAsiaFareastsimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getStationAsiaFareastsimulatedresponse() {
		try {
			return this.StationAsiaFareastsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationAsiaFareastsimulatederrorresponse;

	}

	/**
	 * @return the stationAsiaFareast
	 */
	/**
	 * @return
	 */
	private ValueRange getStationAsiaFareastValueRange() {
		try {
			return this.StationAsiaFareastValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationAsiaFareastValueRange;

	}

	/**
	 * @return the stationAsiaSouthPacificsimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getStationAsiaSouthPacificsimulatedresponse() {
		try {
			return this.StationAsiaSouthPacificsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationAsiaSouthPacificsimulatederrorresponse;

	}

	/**
	 * @return the stnAsiaSouthPacific
	 */
	/**
	 * @return
	 */
	private ValueRange getStationAsiaSouthPacificValueRange() {
		try {
			return this.StationAsiaSouthPacificValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationAsiaSouthPacificValueRange;
	}

	/**
	 * @return the stationCarribeansimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getStationCarribeansimulatedresponse() {
		try {
			return this.StationCarribeansimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationCarribeansimulatederrorresponse;

	}

	/**
	 * @return the stationCarribean
	 */
	/**
	 * @return
	 */
	private ValueRange getStationCarribeanValueRange() {
		try {
			return this.StationCarribeanValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationCarribeanValueRange;
	}

	/**
	 * @return the stationEastEuropeansimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getStationEastEuropeansimulatedresponse() {
		try {
			return this.StationEastEuropeansimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationEastEuropeansimulatederrorresponse;

	}

	/**
	 * @return the stnEastEuropean
	 */
	/**
	 * @return
	 */
	private ValueRange getStationEastEuropeanValueRange() {
		try {
			return this.StationEastEuropeanValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationEastEuropeanValueRange;
	}

	/**
	 * @return the stationMexicosimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getStationMexicosimulatedresponse() {
		try {
			return this.StationMexicosimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationMexicosimulatederrorresponse;

	}

	/**
	 * @return the stnMexico
	 */
	/**
	 * @return
	 */
	private ValueRange getStationMexicoValueRange() {
		try {
			return this.StationMexicoValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationMexicoValueRange;
	}

	/**
	 * @return the stationMiddleEastsimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getStationMiddleEastsimulatedresponse() {
		try {
			return this.StationMiddleEastsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationMiddleEastsimulatederrorresponse;

	}

	/**
	 * @return the stnMiddleEast
	 */
	/**
	 * @return
	 */
	private ValueRange getStationMiddleEastValueRange() {
		try {
			return this.StationMiddleEastValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationMiddleEastValueRange;
	}

	/**
	 * @return the stationNortHCentralEuropeansimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getStationNortHCentralEuropeansimulatedresponse() {
		try {
			return this.StationNortHCentralEuropeansimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationNortHCentralEuropeansimulatederrorresponse;

	}

	/**
	 * @return the stnNorthCentralEuropean
	 */
	/**
	 * @return
	 */
	private ValueRange getStationNorthCentralEuropeanValueRange() {
		try {
			return this.StationNorthCentralEuropeanValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationNorthCentralEuropeanValueRange;
	}

	/**
	 * @return the stationOthersimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getStationOthersimulatedresponse() {
		try {
			return this.StationOthersimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationOthersimulatederrorresponse;

	}

	/**
	 * @return the stnOther
	 */
	/**
	 * @return
	 */
	private ValueRange getStationOtherValueRange() {
		try {
			return this.StationOtherValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationOtherValueRange;
	}

	/**
	 * @return the stationSouthCentralAmericansimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getStationSouthCentralAmericansimulatedresponse() {
		try {
			return this.StationSouthCentralAmericansimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationSouthCentralAmericansimulatederrorresponse;

	}

	/**
	 * @return the stnSouthCentralAmerican
	 */
	/**
	 * @return
	 */
	private ValueRange getStationSouthCentralAmericanValueRange() {
		try {
			return this.StationSouthCentralAmericanValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationSouthCentralAmericanValueRange;
	}

	/**
	 * @return the stationSouthEuropeanMediterraneansimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getStationSouthEuropeanMediterraneansimulatedresponse() {
		try {
			return this.StationSouthEuropeanMediterraneansimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationSouthEuropeanMediterraneansimulatederrorresponse;

	}

	/**
	 * @return the stnSouthEuropeanMediterranean
	 */
	/**
	 * @return
	 */
	private ValueRange getStationSouthEuropeanMediterraneanValueRange() {
		try {
			return this.StationSouthEuropeanMediterraneanValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationSouthEuropeanMediterraneanValueRange;
	}

	/**
	 * @return the stationUSCanadasimulatederrorresponse
	 */
	/**
	 * @return
	 */
	public int getStationUSCanadasimulatedresponse() {
		try {
			return this.StationUSCanadasimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationUSCanadasimulatederrorresponse;

	}

	/**
	 * @return the stnUSCanada
	 */
	/**
	 * @return
	 */
	private ValueRange getStationUSCanadaValueRange() {
		try {
			return this.StationUSCanadaValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.StationUSCanadaValueRange;
	}

	/**
	 * @return the uniformdist
	 */
	/**
	 * @return
	 */
	public UniformDistribution getUniformdist() {
		try {
			return this.uniformdist;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.uniformdist;
	}

	/**
	 * @return the utilities
	 */
	/**
	 * @return
	 */
	public Utilities getUtilities() {
		try {
			return this.utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.utilities;
	}

	/**
	 * @param deployGulfsimulatederrorresponse the deployGulfsimulatederrorresponse
	 *                                         to set
	 */
	/**
	 * @param deployGulfsimulatederrorresponse
	 */
	private void setDeployGulfsimulatedresponse(int deployGulfsimulatederrorresponse) {
		try {
			this.DeployGulfsimulatederrorresponse = deployGulfsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param deployGulf the deployGulf to set
	 */
	/**
	 * @param deployGulf
	 */
	private void setDeployGulfValueRange(ValueRange deployGulf) {
		try {
			this.DeployGulfValueRange = deployGulf;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param deployOEFOIFsimulatederrorresponse the
	 *                                           deployOEFOIFsimulatederrorresponse
	 *                                           to set
	 */
	/**
	 * @param deployOEFOIFsimulatederrorresponse
	 */
	private void setDeployOEFOIFsimulatedresponse(int deployOEFOIFsimulatederrorresponse) {
		try {
			this.DeployOEFOIFsimulatederrorresponse = deployOEFOIFsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param deployOEFOIF the deployOEFOIF to set
	 */
	/**
	 * @param deployOEFOIF
	 */
	private void setDeployOEFOIFValueRange(ValueRange deployOEFOIF) {
		try {
			this.DeployOEFOIFValueRange = deployOEFOIF;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryBranchAirForcesimulatederrorresponse the
	 *                                                     militaryBranchAirForcesimulatederrorresponse
	 *                                                     to set
	 */
	/**
	 * @param militaryBranchAirForcesimulatederrorresponse
	 */
	private void setMilitaryBranchAirForcesimulatedresponse(int militaryBranchAirForcesimulatederrorresponse) {
		try {
			this.MilitaryBranchAirForcesimulatederrorresponse = militaryBranchAirForcesimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mltyBranchAirForce the mltyBranchAirForce to set
	 */
	/**
	 * @param mltyBranchAirForce
	 */
	private void setMilitaryBranchAirForceValueRange(ValueRange mltyBranchAirForce) {
		try {
			this.MilitaryBranchAirForceValueRange = mltyBranchAirForce;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryBranchArmysimulatederrorresponse the
	 *                                                 militaryBranchArmysimulatederrorresponse
	 *                                                 to set
	 */
	/**
	 * @param militaryBranchArmysimulatederrorresponse
	 */
	private void setMilitaryBranchArmysimulatedresponse(int militaryBranchArmysimulatederrorresponse) {
		try {
			this.MilitaryBranchArmysimulatederrorresponse = militaryBranchArmysimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryBranchArmy the militaryBranchArmy to set
	 */
	/**
	 * @param militaryBranchArmy
	 */
	private void setMilitaryBranchArmyValueRange(ValueRange militaryBranchArmy) {
		try {
			this.MilitaryBranchArmyValueRange = militaryBranchArmy;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryBranchCoastGuardsimulatederrorresponse the
	 *                                                       militaryBranchCoastGuardsimulatederrorresponse
	 *                                                       to set
	 */
	/**
	 * @param militaryBranchCoastGuardsimulatederrorresponse
	 */
	private void setMilitaryBranchCoastGuardsimulatedresponse(int militaryBranchCoastGuardsimulatederrorresponse) {
		try {
			this.MilitaryBranchCoastGuardsimulatederrorresponse = militaryBranchCoastGuardsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mltyBranchCoastGuard the mltyBranchCoastGuard to set
	 */
	/**
	 * @param mltyBranchCoastGuard
	 */
	private void setMilitaryBranchCoastGuardValueRange(ValueRange mltyBranchCoastGuard) {
		try {
			this.MilitaryBranchCoastGuardValueRange = mltyBranchCoastGuard;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryBranchMilitaryCrosssimulatederrorresponse the
	 *                                                          militaryBranchMilitaryCrosssimulatederrorresponse
	 *                                                          to set
	 */
	/**
	 * @param militaryBranchMilitaryCrosssimulatederrorresponse
	 */
	private void setMilitaryBranchMilitaryCrosssimulatedresponse(
			int militaryBranchMilitaryCrosssimulatederrorresponse) {
		try {
			this.MilitaryBranchMilitaryCrosssimulatederrorresponse = militaryBranchMilitaryCrosssimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mltyBranchMilitaryCross the mltyBranchMilitaryCross to set
	 */
	/**
	 * @param mltyBranchMilitaryCross
	 */
	private void setMilitaryBranchMilitaryCrossValueRange(ValueRange mltyBranchMilitaryCross) {
		try {
			this.MilitaryBranchMilitaryCrossValueRange = mltyBranchMilitaryCross;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryBranchMMsimulatederrorresponse the
	 *                                               militaryBranchMMsimulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param militaryBranchMMsimulatederrorresponse
	 */
	private void setMilitaryBranchMMsimulatedresponse(int militaryBranchMMsimulatederrorresponse) {
		try {
			this.MilitaryBranchMMsimulatederrorresponse = militaryBranchMMsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mltyBranchMM the mltyBranchMM to set
	 */
	/**
	 * @param mltyBranchMM
	 */
	private void setMilitaryBranchMMValueRange(ValueRange mltyBranchMM) {
		try {
			this.MilitaryBranchMMValueRange = mltyBranchMM;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryBranchNationalGuardsimulatederrorresponse the
	 *                                                          militaryBranchNationalGuardsimulatederrorresponse
	 *                                                          to set
	 */
	/**
	 * @param militaryBranchNationalGuardsimulatederrorresponse
	 */
	private void setMilitaryBranchNationalGuardsimulatedresponse(
			int militaryBranchNationalGuardsimulatederrorresponse) {
		try {
			this.MilitaryBranchNationalGuardsimulatederrorresponse = militaryBranchNationalGuardsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mltyBranchNationalGuard the mltyBranchNationalGuard to set
	 */
	/**
	 * @param mltyBranchNationalGuard
	 */
	private void setMilitaryBranchNationalGuardValueRange(ValueRange mltyBranchNationalGuard) {
		try {
			this.MilitaryBranchNationalGuardValueRange = mltyBranchNationalGuard;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryBranchNavysimulatederrorresponse the
	 *                                                 militaryBranchNavysimulatederrorresponse
	 *                                                 to set
	 */
	/**
	 * @param militaryBranchNavysimulatederrorresponse
	 */
	private void setMilitaryBranchNavysimulatedresponse(int militaryBranchNavysimulatederrorresponse) {
		try {
			this.MilitaryBranchNavysimulatederrorresponse = militaryBranchNavysimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryBranchNavy the militaryBranchNavy to set
	 */
	/**
	 * @param militaryBranchNavy
	 */
	private void setMilitaryBranchNavyValueRange(ValueRange militaryBranchNavy) {
		try {
			this.MilitaryBranchNavyValueRange = militaryBranchNavy;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryBranchNOAAsimulatederrorresponse the
	 *                                                 militaryBranchNOAAsimulatederrorresponse
	 *                                                 to set
	 */
	/**
	 * @param militaryBranchNOAAsimulatederrorresponse
	 */
	private void setMilitaryBranchNOAAsimulatedresponse(int militaryBranchNOAAsimulatederrorresponse) {
		try {
			this.MilitaryBranchNOAAsimulatederrorresponse = militaryBranchNOAAsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mltyBranchNOAA the mltyBranchNOAA to set
	 */
	/**
	 * @param mltyBranchNOAA
	 */
	private void setMilitaryBranchNOAAValueRange(ValueRange mltyBranchNOAA) {
		try {
			this.MilitaryBranchNOAAValueRange = mltyBranchNOAA;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryBranchPublicHealthServicesimulatederrorresponse the
	 *                                                                militaryBranchPublicHealthServicesimulatederrorresponse
	 *                                                                to set
	 */
	/**
	 * @param militaryBranchPublicHealthServicesimulatederrorresponse
	 */
	private void setMilitaryBranchPublicHealthServicesimulatedresponse(
			int militaryBranchPublicHealthServicesimulatederrorresponse) {
		try {
			this.MilitaryBranchPublicHealthServicesimulatederrorresponse = militaryBranchPublicHealthServicesimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService1simulatederrorresponse the
	 *                                               militaryService1simulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param militaryService1simulatederrorresponse
	 */
	private void setMilitaryService1simulatedresponse(int militaryService1simulatederrorresponse) {
		try {
			this.MilitaryService1simulatederrorresponse = militaryService1simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService1 the militaryService1 to set
	 */
	/**
	 * @param militaryService1
	 */
	private void setMilitaryService1ValueRange(ValueRange militaryService1) {
		try {
			this.MilitaryService1ValueRange = militaryService1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService2simulatederrorresponse the
	 *                                               militaryService2simulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param militaryService2simulatederrorresponse
	 */
	private void setMilitaryService2simulatedresponse(int militaryService2simulatederrorresponse) {
		try {
			this.MilitaryService2simulatederrorresponse = militaryService2simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService2 the militaryService2 to set
	 */
	/**
	 * @param militaryService2
	 */
	private void setMilitaryService2ValueRange(ValueRange militaryService2) {
		try {
			this.MilitaryService2ValueRange = militaryService2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService3simulatederrorresponse the
	 *                                               militaryService3simulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param militaryService3simulatederrorresponse
	 */
	private void setMilitaryService3simulatedresponse(int militaryService3simulatederrorresponse) {
		try {
			this.MilitaryService3simulatederrorresponse = militaryService3simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService3 the militaryService3 to set
	 */
	/**
	 * @param militaryService3
	 */
	private void setMilitaryService3ValueRange(ValueRange militaryService3) {
		try {
			this.MilitaryService3ValueRange = militaryService3;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService4simulatederrorresponse the
	 *                                               militaryService4simulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param militaryService4simulatederrorresponse
	 */
	private void setMilitaryService4simulatedresponse(int militaryService4simulatederrorresponse) {
		try {
			this.MilitaryService4simulatederrorresponse = militaryService4simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService4 the militaryService4 to set
	 */
	/**
	 * @param militaryService4
	 */
	private void setMilitaryService4ValueRange(ValueRange militaryService4) {
		try {
			this.MilitaryService4ValueRange = militaryService4;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService5simulatederrorresponse the
	 *                                               militaryService5simulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param militaryService5simulatederrorresponse
	 */
	private void setMilitaryService5simulatedresponse(int militaryService5simulatederrorresponse) {
		try {
			this.MilitaryService5simulatederrorresponse = militaryService5simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService5 the militaryService5 to set
	 */
	/**
	 * @param militaryService5
	 */
	private void setMilitaryService5ValueRange(ValueRange militaryService5) {
		try {
			this.MilitaryService5ValueRange = militaryService5;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService6simulatederrorresponse the
	 *                                               militaryService6simulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param militaryService6simulatederrorresponse
	 */
	private void setMilitaryService6simulatedresponse(int militaryService6simulatederrorresponse) {
		try {
			this.MilitaryService6simulatederrorresponse = militaryService6simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService6 the militaryService6 to set
	 */
	/**
	 * @param militaryService6
	 */
	private void setMilitaryService6ValueRange(ValueRange militaryService6) {
		try {
			this.MilitaryService6ValueRange = militaryService6;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService7simulatederrorresponse the
	 *                                               militaryService7simulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param militaryService7simulatederrorresponse
	 */
	private void setMilitaryService7simulatedresponse(int militaryService7simulatederrorresponse) {
		try {
			this.MilitaryService7simulatederrorresponse = militaryService7simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService7 the militaryService7 to set
	 */
	/**
	 * @param militaryService7
	 */
	private void setMilitaryService7ValueRange(ValueRange militaryService7) {
		try {
			this.MilitaryService7ValueRange = militaryService7;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService8simulatederrorresponse the
	 *                                               militaryService8simulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param militaryService8simulatederrorresponse
	 */
	private void setMilitaryService8simulatedresponse(int militaryService8simulatederrorresponse) {
		try {
			this.MilitaryService8simulatederrorresponse = militaryService8simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService8 the militaryService8 to set
	 */
	/**
	 * @param militaryService8
	 */
	private void setMilitaryService8ValueRange(ValueRange militaryService8) {
		try {
			this.MilitaryService8ValueRange = militaryService8;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService9simulatederrorresponse the
	 *                                               militaryService9simulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param militaryService9simulatederrorresponse
	 */
	private void setMilitaryService9simulatedresponse(int militaryService9simulatederrorresponse) {
		try {
			this.MilitaryService9simulatederrorresponse = militaryService9simulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryService9 the militaryService9 to set
	 */
	/**
	 * @param militaryService9
	 */
	private void setMilitaryService9ValueRange(ValueRange militaryService9) {
		try {
			this.MilitaryService9ValueRange = militaryService9;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryServiceTypesimulatederrorresponse the
	 *                                                  militaryServiceTypesimulatederrorresponse
	 *                                                  to set
	 */
	/**
	 * @param militaryServiceTypesimulatederrorresponse
	 */
	private void setMilitaryServiceTypesimulatedresponse(int militaryServiceTypesimulatederrorresponse) {
		try {
			this.MilitaryServiceTypesimulatederrorresponse = militaryServiceTypesimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param militaryServiceType the militaryServiceType to set
	 */
	/**
	 * @param militaryServiceType
	 */
	private void setMilitaryServiceTypeValueRange(ValueRange militaryServiceType) {
		try {
			this.MilitaryServiceTypeValueRange = militaryServiceType;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mltyBranchPublicHealthService the mltyBranchPublicHealthService to set
	 */
	/**
	 * @param mltyBranchPublicHealthService
	 */
	private void setMltyBranchPublicHealthServiceValueRange(ValueRange mltyBranchPublicHealthService) {
		try {
			this.MltyBranchPublicHealthServiceValueRange = mltyBranchPublicHealthService;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param serviceOutsideUSsimulatederrorresponse the
	 *                                               serviceOutsideUSsimulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param serviceOutsideUSsimulatederrorresponse
	 */
	private void setServiceOutsideUSsimulatedresponse(int serviceOutsideUSsimulatederrorresponse) {
		try {
			this.ServiceOutsideUSsimulatederrorresponse = serviceOutsideUSsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param serviceOutsideUS the serviceOutsideUS to set
	 */
	/**
	 * @param serviceOutsideUS
	 */
	private void setServiceOutsideUSValueRange(ValueRange serviceOutsideUS) {
		try {
			this.ServiceOutsideUSValueRange = serviceOutsideUS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationAsiaFareastsimulatederrorresponse the
	 *                                                 stationAsiaFareastsimulatederrorresponse
	 *                                                 to set
	 */
	/**
	 * @param stationAsiaFareastsimulatederrorresponse
	 */
	private void setStationAsiaFareastsimulatedresponse(int stationAsiaFareastsimulatederrorresponse) {
		try {
			this.StationAsiaFareastsimulatederrorresponse = stationAsiaFareastsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationAsiaFareast the stationAsiaFareast to set
	 */
	/**
	 * @param stationAsiaFareast
	 */
	private void setStationAsiaFareastValueRange(ValueRange stationAsiaFareast) {
		try {
			this.StationAsiaFareastValueRange = stationAsiaFareast;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationAsiaSouthPacificsimulatederrorresponse the
	 *                                                      stationAsiaSouthPacificsimulatederrorresponse
	 *                                                      to set
	 */
	/**
	 * @param stationAsiaSouthPacificsimulatederrorresponse
	 */
	private void setStationAsiaSouthPacificsimulatedresponse(int stationAsiaSouthPacificsimulatederrorresponse) {
		try {
			this.StationAsiaSouthPacificsimulatederrorresponse = stationAsiaSouthPacificsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stnAsiaSouthPacific the stnAsiaSouthPacific to set
	 */
	/**
	 * @param stnAsiaSouthPacific
	 */
	private void setStationAsiaSouthPacificValueRange(ValueRange stnAsiaSouthPacific) {
		try {
			this.StationAsiaSouthPacificValueRange = stnAsiaSouthPacific;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationCarribeansimulatederrorresponse the
	 *                                               stationCarribeansimulatederrorresponse
	 *                                               to set
	 */
	/**
	 * @param stationCarribeansimulatederrorresponse
	 */
	private void setStationCarribeansimulatedresponse(int stationCarribeansimulatederrorresponse) {
		try {
			this.StationCarribeansimulatederrorresponse = stationCarribeansimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationCarribean the stationCarribean to set
	 */
	/**
	 * @param stationCarribean
	 */
	private void setStationCarribeanValueRange(ValueRange stationCarribean) {
		try {
			this.StationCarribeanValueRange = stationCarribean;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationEastEuropeansimulatederrorresponse the
	 *                                                  stationEastEuropeansimulatederrorresponse
	 *                                                  to set
	 */
	/**
	 * @param stationEastEuropeansimulatederrorresponse
	 */
	private void setStationEastEuropeansimulatedresponse(int stationEastEuropeansimulatederrorresponse) {
		try {
			this.StationEastEuropeansimulatederrorresponse = stationEastEuropeansimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stnEastEuropean the stnEastEuropean to set
	 */
	/**
	 * @param stnEastEuropean
	 */
	private void setStationEastEuropeanValueRange(ValueRange stnEastEuropean) {
		try {
			this.StationEastEuropeanValueRange = stnEastEuropean;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationMexicosimulatederrorresponse the
	 *                                            stationMexicosimulatederrorresponse
	 *                                            to set
	 */
	/**
	 * @param stationMexicosimulatederrorresponse
	 */
	private void setStationMexicosimulatedresponse(int stationMexicosimulatederrorresponse) {
		try {
			this.StationMexicosimulatederrorresponse = stationMexicosimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stnMexico the stnMexico to set
	 */
	/**
	 * @param stnMexico
	 */
	private void setStationMexicoValueRange(ValueRange stnMexico) {
		try {
			this.StationMexicoValueRange = stnMexico;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationMiddleEastsimulatederrorresponse the
	 *                                                stationMiddleEastsimulatederrorresponse
	 *                                                to set
	 */
	/**
	 * @param stationMiddleEastsimulatederrorresponse
	 */
	private void setStationMiddleEastsimulatedresponse(int stationMiddleEastsimulatederrorresponse) {
		try {
			this.StationMiddleEastsimulatederrorresponse = stationMiddleEastsimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stnMiddleEast the stnMiddleEast to set
	 */
	/**
	 * @param stnMiddleEast
	 */
	private void setStationMiddleEastValueRange(ValueRange stnMiddleEast) {
		try {
			this.StationMiddleEastValueRange = stnMiddleEast;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationNortHCentralEuropeansimulatederrorresponse the
	 *                                                          stationNortHCentralEuropeansimulatederrorresponse
	 *                                                          to set
	 */
	/**
	 * @param stationNortHCentralEuropeansimulatederrorresponse
	 */
	private void setStationNortHCentralEuropeansimulatedresponse(
			int stationNortHCentralEuropeansimulatederrorresponse) {
		try {
			this.StationNortHCentralEuropeansimulatederrorresponse = stationNortHCentralEuropeansimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stnNorthCentralEuropean the stnNorthCentralEuropean to set
	 */
	/**
	 * @param stnNorthCentralEuropean
	 */
	private void setStationNorthCentralEuropeanValueRange(ValueRange stnNorthCentralEuropean) {
		try {
			this.StationNorthCentralEuropeanValueRange = stnNorthCentralEuropean;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationOthersimulatederrorresponse the
	 *                                           stationOthersimulatederrorresponse
	 *                                           to set
	 */
	/**
	 * @param stationOthersimulatederrorresponse
	 */
	private void setStationOthersimulatedresponse(int stationOthersimulatederrorresponse) {
		try {
			this.StationOthersimulatederrorresponse = stationOthersimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stnOther the stnOther to set
	 */
	/**
	 * @param stnOther
	 */
	private void setStationOtherValueRange(ValueRange stnOther) {
		try {
			this.StationOtherValueRange = stnOther;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationSouthCentralAmericansimulatederrorresponse the
	 *                                                          stationSouthCentralAmericansimulatederrorresponse
	 *                                                          to set
	 */
	/**
	 * @param stationSouthCentralAmericansimulatederrorresponse
	 */
	private void setStationSouthCentralAmericansimulatedresponse(
			int stationSouthCentralAmericansimulatederrorresponse) {
		try {
			this.StationSouthCentralAmericansimulatederrorresponse = stationSouthCentralAmericansimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stnSouthCentralAmerican the stnSouthCentralAmerican to set
	 */
	/**
	 * @param stnSouthCentralAmerican
	 */
	private void setStationSouthCentralAmericanValueRange(ValueRange stnSouthCentralAmerican) {
		try {
			this.StationSouthCentralAmericanValueRange = stnSouthCentralAmerican;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationSouthEuropeanMediterraneansimulatederrorresponse the
	 *                                                                stationSouthEuropeanMediterraneansimulatederrorresponse
	 *                                                                to set
	 */
	/**
	 * @param stationSouthEuropeanMediterraneansimulatederrorresponse
	 */
	private void setStationSouthEuropeanMediterraneansimulatedresponse(
			int stationSouthEuropeanMediterraneansimulatederrorresponse) {
		try {
			this.StationSouthEuropeanMediterraneansimulatederrorresponse = stationSouthEuropeanMediterraneansimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stnSouthEuropeanMediterranean the stnSouthEuropeanMediterranean to set
	 */
	/**
	 * @param stnSouthEuropeanMediterranean
	 */
	private void setStationSouthEuropeanMediterraneanValueRange(ValueRange stnSouthEuropeanMediterranean) {
		try {
			this.StationSouthEuropeanMediterraneanValueRange = stnSouthEuropeanMediterranean;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stationUSCanadasimulatederrorresponse the
	 *                                              stationUSCanadasimulatederrorresponse
	 *                                              to set
	 */
	/**
	 * @param stationUSCanadasimulatederrorresponse
	 */
	private void setStationUSCanadasimulatedresponse(int stationUSCanadasimulatederrorresponse) {
		try {
			this.StationUSCanadasimulatederrorresponse = stationUSCanadasimulatederrorresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stnUSCanada the stnUSCanada to set
	 */
	/**
	 * @param stnUSCanada
	 */
	private void setStationUSCanadaValueRange(ValueRange stnUSCanada) {
		try {
			this.StationUSCanadaValueRange = stnUSCanada;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uniformdist the uniformdist to set
	 */
	/**
	 * @param uniformdist
	 */
	private void setUniformdist(UniformDistribution uniformdist) {
		try {
			this.uniformdist = uniformdist;
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
	 * @param deployedInGulfsimulatederrorresponse
	 * @return
	 */
	public int simulateDeployGulfResponse(ValueRange valuerange, int deployedInGulfsimulatederrorresponse) {
		try {
			this.setDeployGulfValueRange(valuerange);
			this.setDeployGulfsimulatedresponse(deployedInGulfsimulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setDeployGulfsimulatedresponse(
						this.getUtilities().randBetween((int) this.getDeployGulfValueRange().getMinimum(),
								(int) this.getDeployGulfValueRange().getMaximum()));
				return this.getDeployGulfsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return deployedInGulfsimulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateDeployOEFOIFResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setDeployOEFOIFValueRange(valuerange);
			this.setDeployOEFOIFsimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setDeployOEFOIFsimulatedresponse(
						this.getUtilities().randBetween((int) this.getDeployOEFOIFValueRange().getMinimum(),
								(int) this.getDeployOEFOIFValueRange().getMaximum()));
				return this.getDeployOEFOIFsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryBranchAirForceResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryBranchAirForceValueRange(valuerange);
			this.setMilitaryBranchAirForcesimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryBranchAirForcesimulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryBranchAirForceValueRange().getMinimum(),
								(int) this.getMilitaryBranchAirForceValueRange().getMaximum()));
				return this.getMilitaryBranchAirForcesimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryBranchArmyResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryBranchArmyValueRange(valuerange);
			this.setMilitaryBranchArmysimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryBranchArmysimulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryBranchArmyValueRange().getMinimum(),
								(int) this.getMilitaryBranchArmyValueRange().getMaximum()));
				return this.getMilitaryBranchArmysimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryBranchCoastGuardResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryBranchCoastGuardValueRange(valuerange);
			this.setMilitaryBranchCoastGuardsimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryBranchCoastGuardsimulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryBranchCoastGuardValueRange().getMinimum(),
								(int) this.getMilitaryBranchCoastGuardValueRange().getMaximum()));
				return this.getMilitaryBranchCoastGuardsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param raceDeployedInGulfsimulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryBranchMilitaryCrossResponse(ValueRange valuerange,
			int raceDeployedInGulfsimulatederrorresponse) {
		try {
			this.setMilitaryBranchMilitaryCrossValueRange(valuerange);
			this.setMilitaryBranchMilitaryCrosssimulatedresponse(raceDeployedInGulfsimulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryBranchMilitaryCrosssimulatedresponse(this.getUtilities().randBetween(
						(int) this.getMilitaryBranchMilitaryCrossValueRange().getMinimum(),
						(int) this.MilitaryBranchMilitaryCrossValueRange.getMaximum()));
				return this.getMilitaryBranchMilitaryCrosssimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return raceDeployedInGulfsimulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryBranchMMResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryBranchMMValueRange(valuerange);
			this.setMilitaryBranchMMsimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryBranchMMsimulatedresponse(
						this.utilities.randBetween((int) this.getMilitaryBranchMMValueRange().getMinimum(),
								(int) this.getMilitaryBranchMMValueRange().getMaximum()));
				return this.getMilitaryBranchMMsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryBranchNationalGuardResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryBranchNationalGuardValueRange(valuerange);
			this.setMilitaryBranchNationalGuardsimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryBranchNationalGuardsimulatedresponse(this.getUtilities().randBetween(
						(int) this.getMilitaryBranchNationalGuardValueRange().getMinimum(),
						(int) this.MilitaryBranchNationalGuardValueRange.getMaximum()));
				return this.getMilitaryBranchNationalGuardsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryBranchNavyResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryBranchNavyValueRange(valuerange);
			this.setMilitaryBranchNavysimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryBranchNavysimulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryBranchNavyValueRange().getMinimum(),
								(int) this.getMilitaryBranchNavyValueRange().getMaximum()));
				this.getMilitaryBranchNavysimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryBranchNOAAResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryBranchNOAAValueRange(valuerange);
			this.setMilitaryBranchNOAAsimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryBranchNOAAsimulatedresponse(
						this.utilities.randBetween((int) this.getMilitaryBranchNOAAValueRange().getMinimum(),
								(int) this.MilitaryBranchNOAAValueRange.getMaximum()));
				return this.getMilitaryBranchNOAAsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryBranchPublicHealthServiceResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMltyBranchPublicHealthServiceValueRange(valuerange);
			this.setMilitaryBranchPublicHealthServicesimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryBranchPublicHealthServicesimulatedresponse(this.getUtilities().randBetween(
						(int) this.getMltyBranchPublicHealthServiceValueRange().getMinimum(),
						(int) this.MltyBranchPublicHealthServiceValueRange.getMaximum()));
				return this.getMilitaryBranchPublicHealthServicesimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	public void simulateMilitaryDutyResponseVariables() throws Exception {
		try {
			this.simulateDeployGulfResponse(this.getDeployGulfValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateDeployOEFOIFResponse(this.getDeployOEFOIFValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryBranchAirForceResponse(this.getMilitaryBranchAirForceValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryBranchArmyResponse(this.getMilitaryBranchArmyValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryBranchCoastGuardResponse(this.getMilitaryBranchCoastGuardValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryBranchMMResponse(this.getMilitaryBranchMMValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryBranchMilitaryCrossResponse(this.getMilitaryBranchMilitaryCrossValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryBranchNationalGuardResponse(this.getMilitaryBranchNationalGuardValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryBranchNavyResponse(this.getMilitaryBranchNavyValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryBranchNOAAResponse(this.getMilitaryBranchNOAAValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryBranchPublicHealthServiceResponse(this.getMltyBranchPublicHealthServiceValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryService1Response(this.getMilitaryService1ValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryService2Response(this.getMilitaryService2ValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryService3Response(this.getMilitaryService3ValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryService4Response(this.getMilitaryService4ValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryService5Response(this.getMilitaryService5ValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryService6Response(this.getMilitaryService6ValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryService7Response(this.getMilitaryService7ValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryService8Response(this.getMilitaryService8ValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryService9Response(this.getMilitaryService9ValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateMilitaryServiceTypeResponse(this.getMilitaryServiceTypeValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateServiceOutsideUSResponse(this.getServiceOutsideUSValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateStationAsiaFareastResponse(this.getStationAsiaFareastValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateStationCarribeanResponse(this.getStationCarribeanValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateStationEastEuropeanResponse(this.getStationEastEuropeanValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateStationMexicoResponse(this.getStationMexicoValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateStationMiddleEastResponse(this.getStationMiddleEastValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateStationNorthCentralEuropeanResponse(this.getStationNorthCentralEuropeanValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateStationSouthCentralAmericanResponse(this.getStationSouthCentralAmericanValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());
			this.simulateStationUSCanadaResponse(this.getStationUSCanadaValueRange(),
					SimulatedResponseMilitaryDuty.getErrorResponse());

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryService1Response(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryService1ValueRange(valuerange);
			this.setMilitaryService1simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryService1simulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryService1ValueRange().getMinimum(),
								(int) this.MilitaryService1ValueRange.getMaximum()));
				return this.getMilitaryService1simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryService2Response(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryService2ValueRange(valuerange);
			this.setMilitaryService2simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryService2simulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryService2ValueRange().getMinimum(),
								(int) this.MilitaryService2ValueRange.getMaximum()));
				return this.getMilitaryService2simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryService3Response(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryService3ValueRange(valuerange);
			this.setMilitaryService3simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryService3simulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryService3ValueRange().getMinimum(),
								(int) this.getMilitaryService3ValueRange().getMaximum()));
				return this.getMilitaryService3simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryService4Response(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryService4ValueRange(valuerange);
			this.setMilitaryService4simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryService4simulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryService4ValueRange().getMinimum(),
								(int) this.getMilitaryService4ValueRange().getMaximum()));
				return this.getMilitaryService4simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryService5Response(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryService5ValueRange(valuerange);
			this.setMilitaryService5simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryService5simulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryService5ValueRange().getMinimum(),
								(int) this.getMilitaryService5ValueRange().getMaximum()));
				return this.getMilitaryService5simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryService6Response(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryService6ValueRange(valuerange);
			this.setMilitaryService6simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryService6simulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryService6ValueRange().getMinimum(),
								(int) this.getMilitaryService6ValueRange().getMaximum()));
				return this.getMilitaryService6simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryService7Response(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryService7ValueRange(valuerange);
			this.setMilitaryService7simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryService7simulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryService7ValueRange().getMinimum(),
								(int) this.getMilitaryService7ValueRange().getMaximum()));
				return this.getMilitaryService7simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryService8Response(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryService8ValueRange(valuerange);
			this.setMilitaryService8simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryService8simulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryService8ValueRange().getMinimum(),
								(int) this.getMilitaryService8ValueRange().getMaximum()));
				return this.getMilitaryService8simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryService9Response(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryService9ValueRange(valuerange);
			this.setMilitaryService9simulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryService9simulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryService9ValueRange().getMinimum(),
								(int) this.getMilitaryService9ValueRange().getMaximum()));
				return this.getMilitaryService9simulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateMilitaryServiceTypeResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setMilitaryServiceTypeValueRange(valuerange);
			this.setMilitaryServiceTypesimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setMilitaryServiceTypesimulatedresponse(
						this.getUtilities().randBetween((int) this.getMilitaryServiceTypeValueRange().getMinimum(),
								(int) this.getMilitaryServiceTypeValueRange().getMaximum()));
				return this.getMilitaryServiceTypesimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateServiceOutsideUSResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setServiceOutsideUSValueRange(valuerange);
			this.setServiceOutsideUSsimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setServiceOutsideUSsimulatedresponse(
						this.getUtilities().randBetween((int) this.getServiceOutsideUSValueRange().getMinimum(),
								(int) this.getServiceOutsideUSValueRange().getMaximum()));
				return this.getServiceOutsideUSsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateStationAsiaFareastResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setStationAsiaFareastValueRange(valuerange);
			this.setStationAsiaFareastsimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setStationAsiaFareastsimulatedresponse(
						this.getUtilities().randBetween((int) this.getStationAsiaFareastValueRange().getMinimum(),
								(int) this.getStationAsiaFareastValueRange().getMaximum()));
				return this.getStationAsiaFareastsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	public int simulateStationAsiaSouthPacificResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setStationAsiaSouthPacificValueRange(valuerange);
			this.setStationAsiaSouthPacificsimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setStationAsiaSouthPacificsimulatedresponse(
						this.getUtilities().randBetween((int) this.getStationAsiaSouthPacificValueRange().getMinimum(),
								(int) this.getStationAsiaSouthPacificValueRange().getMaximum()));
				return this.getStationAsiaSouthPacificsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateStationCarribeanResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setStationCarribeanValueRange(valuerange);
			this.setStationCarribeansimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setStationCarribeansimulatedresponse(
						this.getUtilities().randBetween((int) this.getStationCarribeanValueRange().getMinimum(),
								(int) this.getStationCarribeanValueRange().getMaximum()));
				return this.getStationCarribeansimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateStationEastEuropeanResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setStationEastEuropeanValueRange(valuerange);
			this.setStationEastEuropeansimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setStationEastEuropeansimulatedresponse(
						this.getUtilities().randBetween((int) this.getStationEastEuropeanValueRange().getMinimum(),
								(int) this.getStationEastEuropeanValueRange().getMaximum()));
				return this.getStationEastEuropeansimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateStationMexicoResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setStationMexicoValueRange(valuerange);
			this.setStationMexicosimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setStationMexicosimulatedresponse(
						this.getUtilities().randBetween((int) this.getStationMexicoValueRange().getMinimum(),
								(int) this.getStationMexicoValueRange().getMaximum()));
				return this.getStationMexicosimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateStationMiddleEastResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setStationMiddleEastValueRange(valuerange);
			this.setStationMiddleEastsimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setStationMiddleEastsimulatedresponse(
						this.getUtilities().randBetween((int) this.getStationMiddleEastValueRange().getMinimum(),
								(int) this.getStationMiddleEastValueRange().getMaximum()));
				return this.getStationMiddleEastsimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateStationNorthCentralEuropeanResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setStationNorthCentralEuropeanValueRange(valuerange);
			this.setStationNortHCentralEuropeansimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setStationNortHCentralEuropeansimulatedresponse(this.getUtilities().randBetween(
						(int) this.getStationNorthCentralEuropeanValueRange().getMinimum(),
						(int) this.getStationNorthCentralEuropeanValueRange().getMaximum()));
				return this.getStationNortHCentralEuropeansimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateStationOtherResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setStationOtherValueRange(valuerange);
			this.setStationOthersimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setStationOthersimulatedresponse(
						this.getUtilities().randBetween((int) this.getStationOtherValueRange().getMinimum(),
								(int) this.getStationOtherValueRange().getMaximum()));
				return this.getStationOthersimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateStationSouthCentralAmericanResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setStationSouthCentralAmericanValueRange(valuerange);
			this.setStationSouthCentralAmericansimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setStationSouthCentralAmericansimulatedresponse(this.getUtilities().randBetween(
						(int) this.getStationSouthCentralAmericanValueRange().getMinimum(),
						(int) this.getStationSouthCentralAmericanValueRange().getMaximum()));
				return this.getStationSouthCentralAmericansimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateStationSouthEuropeanMediterraneanResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setStationSouthEuropeanMediterraneanValueRange(valuerange);
			this.setStationSouthEuropeanMediterraneansimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setStationSouthEuropeanMediterraneansimulatedresponse(this.getUtilities().randBetween(
						(int) this.getStationSouthEuropeanMediterraneanValueRange().getMinimum(),
						(int) this.getStationSouthEuropeanMediterraneanValueRange().getMaximum()));
				return this.getStationSouthEuropeanMediterraneansimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 * @param valuerange
	 * @param simulatederrorresponse
	 * @return
	 */
	public int simulateStationUSCanadaResponse(ValueRange valuerange, int simulatederrorresponse) {
		try {
			this.setStationUSCanadaValueRange(valuerange);
			this.setStationUSCanadasimulatedresponse(simulatederrorresponse);
			if ((!this.getUniformdist()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							SimulatedResponseMilitaryDuty.getMinimumtogenerateerrorresponse(),
							SimulatedResponseMilitaryDuty.getMaximumtogenerateerrorresponse())))) {
				this.setStationSouthEuropeanMediterraneansimulatedresponse(
						this.utilities.randBetween((int) this.getStationUSCanadaValueRange().getMinimum(),
								(int) this.getStationUSCanadaValueRange().getMaximum()));
				return this.getStationSouthEuropeanMediterraneansimulatedresponse();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return error response (default)
		return simulatederrorresponse;
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "SimulatedResponseMilitaryDuty [MilitaryBranchArmyValueRange=" + this.MilitaryBranchArmyValueRange
				+ ", MilitaryBranchArmysimulatederrorresponse=" + this.MilitaryBranchArmysimulatederrorresponse
				+ ", MilitaryBranchNavyValueRange=" + this.MilitaryBranchNavyValueRange
				+ ", MilitaryBranchNavysimulatederrorresponse=" + this.MilitaryBranchNavysimulatederrorresponse
				+ ", MilitaryBranchAirForceValueRange=" + this.MilitaryBranchAirForceValueRange
				+ ", MilitaryBranchAirForcesimulatederrorresponse=" + this.MilitaryBranchAirForcesimulatederrorresponse
				+ ", MilitaryBranchMilitaryCrossValueRange=" + this.MilitaryBranchMilitaryCrossValueRange
				+ ", MilitaryBranchMilitaryCrosssimulatederrorresponse="
				+ this.MilitaryBranchMilitaryCrosssimulatederrorresponse + ", MilitaryBranchCoastGuardValueRange="
				+ this.MilitaryBranchCoastGuardValueRange + ", MilitaryBranchCoastGuardsimulatederrorresponse="
				+ this.MilitaryBranchCoastGuardsimulatederrorresponse + ", MilitaryBranchMMValueRange="
				+ this.MilitaryBranchMMValueRange + ", MilitaryBranchMMsimulatederrorresponse="
				+ this.MilitaryBranchMMsimulatederrorresponse + ", MilitaryBranchNationalGuardValueRange="
				+ this.MilitaryBranchNationalGuardValueRange + ", MilitaryBranchNationalGuardsimulatederrorresponse="
				+ this.MilitaryBranchNationalGuardsimulatederrorresponse + ", MilitaryBranchNOAAValueRange="
				+ this.MilitaryBranchNOAAValueRange + ", MilitaryBranchNOAAsimulatederrorresponse="
				+ this.MilitaryBranchNOAAsimulatederrorresponse + ", MltyBranchPublicHealthServiceValueRange="
				+ this.MltyBranchPublicHealthServiceValueRange
				+ ", MilitaryBranchPublicHealthServicesimulatederrorresponse="
				+ this.MilitaryBranchPublicHealthServicesimulatederrorresponse + ", MilitaryServiceTypeValueRange="
				+ this.MilitaryServiceTypeValueRange + ", MilitaryServiceTypesimulatederrorresponse="
				+ this.MilitaryServiceTypesimulatederrorresponse + ", MilitaryService1ValueRange="
				+ this.MilitaryService1ValueRange + ", MilitaryService1simulatederrorresponse="
				+ this.MilitaryService1simulatederrorresponse + ", MilitaryService2ValueRange="
				+ this.MilitaryService2ValueRange + ", MilitaryService2simulatederrorresponse="
				+ this.MilitaryService2simulatederrorresponse + ", MilitaryService4ValueRange="
				+ this.MilitaryService4ValueRange + ", MilitaryService4simulatederrorresponse="
				+ this.MilitaryService4simulatederrorresponse + ", MilitaryService3ValueRange="
				+ this.MilitaryService3ValueRange + ", MilitaryService3simulatederrorresponse="
				+ this.MilitaryService3simulatederrorresponse + ", MilitaryService5ValueRange="
				+ this.MilitaryService5ValueRange + ", MilitaryService5simulatederrorresponse="
				+ this.MilitaryService5simulatederrorresponse + ", MilitaryService6ValueRange="
				+ this.MilitaryService6ValueRange + ", MilitaryService6simulatederrorresponse="
				+ this.MilitaryService6simulatederrorresponse + ", MilitaryService8ValueRange="
				+ this.MilitaryService8ValueRange + ", MilitaryService8simulatederrorresponse="
				+ this.MilitaryService8simulatederrorresponse + ", MilitaryService7ValueRange="
				+ this.MilitaryService7ValueRange + ", MilitaryService7simulatederrorresponse="
				+ this.MilitaryService7simulatederrorresponse + ", MilitaryService9ValueRange="
				+ this.MilitaryService9ValueRange + ", MilitaryService9simulatederrorresponse="
				+ this.MilitaryService9simulatederrorresponse + ", ServiceOutsideUSValueRange="
				+ this.ServiceOutsideUSValueRange + ", ServiceOutsideUSsimulatederrorresponse="
				+ this.ServiceOutsideUSsimulatederrorresponse + ", StationAsiaFareastValueRange="
				+ this.StationAsiaFareastValueRange + ", StationAsiaFareastsimulatederrorresponse="
				+ this.StationAsiaFareastsimulatederrorresponse + ", StationCarribeanValueRange="
				+ this.StationCarribeanValueRange + ", StationCarribeansimulatederrorresponse="
				+ this.StationCarribeansimulatederrorresponse + ", StationEastEuropeanValueRange="
				+ this.StationEastEuropeanValueRange + ", StationEastEuropeansimulatederrorresponse="
				+ this.StationEastEuropeansimulatederrorresponse + ", StationAsiaSouthPacificValueRange="
				+ this.StationAsiaSouthPacificValueRange + ", StationAsiaSouthPacificsimulatederrorresponse="
				+ this.StationAsiaSouthPacificsimulatederrorresponse + ", StationMiddleEastValueRange="
				+ this.StationMiddleEastValueRange + ", StationMiddleEastsimulatederrorresponse="
				+ this.StationMiddleEastsimulatederrorresponse + ", StationNorthCentralEuropeanValueRange="
				+ this.StationNorthCentralEuropeanValueRange + ", StationNortHCentralEuropeansimulatederrorresponse="
				+ this.StationNortHCentralEuropeansimulatederrorresponse + ", StationMexicoValueRange="
				+ this.StationMexicoValueRange + ", StationMexicosimulatederrorresponse="
				+ this.StationMexicosimulatederrorresponse + ", StationSouthEuropeanMediterraneanValueRange="
				+ this.StationSouthEuropeanMediterraneanValueRange
				+ ", StationSouthEuropeanMediterraneansimulatederrorresponse="
				+ this.StationSouthEuropeanMediterraneansimulatederrorresponse
				+ ", StationSouthCentralAmericanValueRange=" + this.StationSouthCentralAmericanValueRange
				+ ", StationSouthCentralAmericansimulatederrorresponse="
				+ this.StationSouthCentralAmericansimulatederrorresponse + ", StationOtherValueRange="
				+ this.StationOtherValueRange + ", StationOthersimulatederrorresponse="
				+ this.StationOthersimulatederrorresponse + ", StationUSCanadaValueRange="
				+ this.StationUSCanadaValueRange + ", StationUSCanadasimulatederrorresponse="
				+ this.StationUSCanadasimulatederrorresponse + ", DeployGulfValueRange=" + this.DeployGulfValueRange
				+ ", DeployGulfsimulatederrorresponse=" + this.DeployGulfsimulatederrorresponse
				+ ", DeployOEFOIFValueRange=" + this.DeployOEFOIFValueRange + ", DeployOEFOIFsimulatederrorresponse="
				+ this.DeployOEFOIFsimulatederrorresponse + ", utilities=" + this.utilities + ", uniformdist="
				+ this.uniformdist + "]";
	}

}
