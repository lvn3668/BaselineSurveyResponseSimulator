package cohort;

import java.time.Year;
import java.time.temporal.ValueRange;
import java.util.Date;

import Diseases.BreastCancer;
import Utilities.Utilities;
import randomizer.UniformDistribution;
import simulatedResponseRace.SimulatedResponseRace;

/**
 * @author Lalitha Viswanathan Affiliation VABHS / MAVERIC
 *
 */
/**
 * @author visu4
 *
 */
public class Sibling extends Cohort {

	// If Sibling 1-8 exists, etc.

	private static final int minToGenerateErrorVal = 2;
	private static final int maxToGenerateErrorVal = 4;
	private static int errorResponse;

	/**
	 * @return the errorResponse
	 */
	private static int getErrorResponse() {
		return errorResponse;
	}

	/**
	 * @param errorResponse the errorResponse to set
	 */
	private static void setErrorResponse(int errorResponse) {
		try {
			Sibling.errorResponse = errorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the mintogenerateerrorval
	 */
	private static int getMintogenerateerrorval() {
		return minToGenerateErrorVal;
	}

	/**
	 * @return the maxtogenerateerrorval
	 */
	private static int getMaxtogenerateerrorval() {
		return maxToGenerateErrorVal;
	}

	private ValueRange SiblingNSAlzheimersValueRange;
	private int siblingalzheimerspresenceabsencesimulatedresponse;
	private int siblingNumberAlzheimers;
	private ValueRange SiblingDoAsthmaValueRange;
	private int siblingasthmapresenceabsencesimulatedresponse;
	private int siblingNumberAsthma;
	private ValueRange SiblingMHBipolarDisorder;
	private int siblingbipolarpresenceabsencesimulatedresponse;
	private int siblingNumberMHBipolar;
	private ValueRange SiblingBreastCancer;
	private int siblingbreastcancersimulatedresponse;
	private int siblingNumberBreastCancer;
	private ValueRange SiblingColonCancer;
	private int siblingcoloncancersimulatedresponse;
	private int siblingNumberColonCancer;
	private ValueRange SiblingLungCancer;
	private int siblinglungcancersimulatedresponse;
	private int siblingNumberLungCancer;
	private ValueRange SiblingProstateCancer;
	private int siblingNumberProstateCancer;
	private int siblingprostatecancersimulatedresponse;
	private ValueRange SiblingSkinCancer;
	private int siblingNumberSkinCancer;
	private int siblingskincancersimulatedresponse;
	private ValueRange SiblingOtherCancer;
	private int siblingNumberOtherCancer;
	private int siblingothercancersimulatedresponse;
	private ValueRange SiblingLungDisease;
	private int siblingNumberLungDisease;
	private int siblinglungdiseasesimulatedresponse;
	private ValueRange SiblingCoronaryArteryDisease;
	private int siblingNumberCAD;
	private int siblingcoronaryarterydiseasesimulatedresponse;
	private ValueRange SiblingMHDepression;
	private int siblingNUmberMHDepression;
	private int siblingdepressionpresenceabsencesimulatedresponse;
	private ValueRange SiblingHypertension;
	private int siblingNumberHypertension;
	private int siblinghypertensionpresenceabsencesimulatedresponse;
	private ValueRange SiblingCholesterol;
	private int siblingNumberCholesterol;
	private int siblingcholesterolpresenceabsencesimulatedresponse;
	private ValueRange SiblingStroke;
	private int siblingNumberStroke;
	private int siblingstrokepresenceabsencesimulatedresponse;
	private ValueRange SiblingLiverDisease;
	private int siblingNumberLiverDisease;
	private int siblingliverdiseasepresenceabsencesimulatedresponse;
	private ValueRange SiblingKidneyNoDialysis;
	private int siblingNumberKidneyNoDialysis;
	private int siblingkidneynodialysispresenceabsencesimulatedresponse;
	private ValueRange SiblingDiabetesValueRange;
	private int siblingNumberDiabetes;
	private int siblingdiabetessimulatedresponse;
	private ValueRange siblingexistsValueRange;
	private int siblingexistssimulatedresponse;

	public Sibling() throws Exception {
		try {

		} catch (Exception e) {

		}
	}

	public Sibling(Cohort cohort) throws Exception {
		// TODO Auto-generated constructor stub
		super();
		try {
			setErrorResponse(this.getUtilities().randBetween(Sibling.getMintogenerateerrorval(),
					Sibling.getMaxtogenerateerrorval()));
			this.setSiblingNSAlzheimersValueRange(ValueRange.of(0, 1));
			this.setSiblingalzheimerspresenceabsencesimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingDoAsthmaValueRange(ValueRange.of(0, 1));
			this.setSiblingasthmapresenceabsencesimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingMHBipolarDisorder(ValueRange.of(0, 1));
			this.setSiblingbipolarpresenceabsencesimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingBreastCancer(ValueRange.of(0, 1));
			this.setSiblingbreastcancersimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingColonCancer(ValueRange.of(0, 1));
			this.setSiblingcoloncancersimulatedresponse(Sibling.getErrorResponse());

			// BreastCancer breastcancer = new BreastCancer(cohort);
			// breastcancer.getDiseasepresenceorabsencesimulatedepicresponse();

			this.setSiblingLungCancer(ValueRange.of(0, 1));
			this.setSiblinglungcancersimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingProstateCancer(ValueRange.of(0, 1));
			this.setSiblingprostatecancersimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingSkinCancer(ValueRange.of(0, 1));
			this.setSiblingskincancersimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingOtherCancer(ValueRange.of(0, 1));
			this.setSiblingothercancersimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingLungDisease(ValueRange.of(0, 1));
			this.setSiblinglungdiseasesimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingCoronaryArteryDisease(ValueRange.of(0, 1));
			this.setSiblingcoronaryarterydiseasesimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingMHDepression(ValueRange.of(0, 1));
			this.setSiblingdepressionpresenceabsencesimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingHypertension(ValueRange.of(0, 1));
			this.setSiblinghypertensionpresenceabsencesimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingCholesterol(ValueRange.of(0, 1));
			this.setSiblingcholesterolpresenceabsencesimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingStroke(ValueRange.of(0, 1));
			this.setSiblingstrokepresenceabsencesimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingLiverDisease(ValueRange.of(0, 1));
			this.setSiblingliverdiseasepresenceabsencesimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingKidneyNoDialysis(ValueRange.of(0, 1));
			this.setSiblingkidneynodialysispresenceabsencesimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingDiabetesValueRange(ValueRange.of(0, 1));
			this.setSiblingdiabetessimulatedresponse(Sibling.getErrorResponse());
			this.setSiblingexistsValueRange(ValueRange.of(1, 2));
			this.setSiblingexistssimulatedresponse(Sibling.getErrorResponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Year simulateYearOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int simulateAliveOrDead() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Year simulateYearOfDeath() {
		// TODO Auto-generated method stub
		return null;
	}

	public int simulateStrokeResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingStroke(valuerange);
			this.setSiblingstrokepresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingstrokepresenceabsencesimulatedresponse(this.getUtilities().randBetween(
						(int) this.getSiblingStroke().getMinimum(), (int) this.getSiblingStroke().getMaximum()));
				return this.getSiblingstrokepresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingstrokepresenceabsencesimulatedresponse();
	}

	public int simulateAlzheimersResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingNSAlzheimersValueRange(valuerange);
			this.setSiblingalzheimerspresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingalzheimerspresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingNSAlzheimersValueRange().getMinimum(),
								(int) this.getSiblingNSAlzheimersValueRange().getMaximum()));
				this.setSiblingNumberAlzheimers(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingalzheimerspresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingalzheimerspresenceabsencesimulatedresponse();
	}

	private int assignResponseVariablesToOneOfEightSiblings() {
		try {
			return this.getUtilities().randBetween(1, 8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getUtilities().randBetween(1, 8);
	}

	public int simulateBreastCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingBreastCancer(valuerange);
			this.setSiblingbreastcancersimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingbreastcancersimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingBreastCancer().getMinimum(),
								(int) this.getSiblingBreastCancer().getMaximum()));
				this.setSiblingNumberBreastCancer(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingbreastcancersimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingbreastcancersimulatedresponse();
	}

	public int simulateCholesterolResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingCholesterol(valuerange);
			this.setSiblingcholesterolpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingcholesterolpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingCholesterol().getMinimum(),
								(int) this.getSiblingCholesterol().getMaximum()));
				this.setSiblingNumberCholesterol(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingcholesterolpresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingcholesterolpresenceabsencesimulatedresponse();
	}

	public int simulateColonCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingColonCancer(valuerange);
			this.setSiblingcoloncancersimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingcoloncancersimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingColonCancer().getMinimum(),
								(int) this.getSiblingColonCancer().getMaximum()));
				this.setSiblingNumberColonCancer(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingcoloncancersimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingcoloncancersimulatedresponse();
	}

	public int simulateCoronaryArteryDiseaseResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingCoronaryArteryDisease(valuerange);
			this.setSiblingcoronaryarterydiseasesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingcoronaryarterydiseasesimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingCoronaryArteryDisease().getMinimum(),
								(int) this.getSiblingCoronaryArteryDisease().getMaximum()));
				this.setSiblingNumberCAD(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingcoronaryarterydiseasesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingcoronaryarterydiseasesimulatedresponse();
	}

	public int simulateDepressionResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingMHDepression(valuerange);
			this.setSiblingdepressionpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingdepressionpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingMHDepression().getMinimum(),
								(int) this.getSiblingMHDepression().getMaximum()));
				this.setSiblingNUmberMHDepression(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingdepressionpresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingdepressionpresenceabsencesimulatedresponse();
	}

	public int simulateDiabetesResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingMHDepression(valuerange);
			this.setSiblingdepressionpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingdepressionpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingMHDepression().getMinimum(),
								(int) this.getSiblingMHDepression().getMaximum()));
				this.setSiblingNumberDiabetes(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingdiabetessimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingdiabetessimulatedresponse();
	}

	public int simulateAsthmaResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingMHDepression(valuerange);
			this.setSiblingasthmapresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingdepressionpresenceabsencesimulatedresponse(this.getUtilities().randBetween(
						(int) this.getSiblingAsthma().getMinimum(), (int) this.getSiblingAsthma().getMaximum()));
				this.setSiblingNumberAsthma(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingasthmapresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingasthmapresenceabsencesimulatedresponse();
	}

	private ValueRange getSiblingAsthma() {
		// TODO Auto-generated method stub
		return null;
	}

	public int simulateHypertensionResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingMHDepression(valuerange);
			this.setSiblingdepressionpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingdepressionpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingMHDepression().getMinimum(),
								(int) this.getSiblingMHDepression().getMaximum()));
				this.setSiblingNumberHypertension(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblinghypertensionpresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblinghypertensionpresenceabsencesimulatedresponse();
	}

	public int simulateKidneyNoDialysisResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingMHDepression(valuerange);
			this.setSiblingdepressionpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingdepressionpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingMHDepression().getMinimum(),
								(int) this.getSiblingMHDepression().getMaximum()));
				this.setSiblingNumberKidneyNoDialysis(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingkidneynodialysispresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingkidneynodialysispresenceabsencesimulatedresponse();
	}

	public int simulateLiverDiseaseResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingMHDepression(valuerange);
			this.setSiblingdepressionpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingdepressionpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingMHDepression().getMinimum(),
								(int) this.getSiblingMHDepression().getMaximum()));
				this.setSiblingNumberLiverDisease(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingliverdiseasepresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingliverdiseasepresenceabsencesimulatedresponse();
	}

	public int simulateLungCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingLungCancer(valuerange);
			this.setSiblinglungcancersimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblinglungcancersimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingLungCancer().getMinimum(),
								(int) this.getSiblingLungCancer().getMaximum()));
				this.setSiblingNumberLungCancer(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblinglungcancersimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblinglungcancersimulatedresponse();
	}

	public int simulateLungDiseaseResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingLungDisease(valuerange);
			this.setSiblinglungdiseasesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblinglungdiseasesimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingLungDisease().getMinimum(),
								(int) this.getSiblingLungDisease().getMaximum()));
				this.setSiblingNumberLungDisease(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblinglungdiseasesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblinglungdiseasesimulatedresponse();
	}

	public int simulateBipolarDisorderResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingMHBipolarDisorder(valuerange);
			this.setSiblingbipolarpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingbipolarpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingMHBipolarDisorder().getMinimum(),
								(int) this.getSiblingMHBipolarDisorder().getMaximum()));
				this.setSiblingNumberMHBipolar(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingbipolarpresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingbipolarpresenceabsencesimulatedresponse();
	}

	public int simulateOtherCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingOtherCancer(valuerange);
			this.setSiblingothercancersimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingothercancersimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingOtherCancer().getMinimum(),
								(int) this.getSiblingOtherCancer().getMaximum()));
				this.setSiblingNumberOtherCancer(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingothercancersimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingothercancersimulatedresponse();
	}

	public int simulateProstateCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingProstateCancer(valuerange);
			this.setSiblingprostatecancersimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingprostatecancersimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingProstateCancer().getMinimum(),
								(int) this.getSiblingProstateCancer().getMaximum()));
				this.setSiblingNumberProstateCancer(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingprostatecancersimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingprostatecancersimulatedresponse();
	}

	public int simulateSkinCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSiblingSkinCancer(valuerange);
			this.setSiblingskincancersimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution().generatenoiseinresponsevariables(this.getUtilities()
					.randBetween(Sibling.getMintogenerateerrorval(), Sibling.getMaxtogenerateerrorval())))) {
				this.setSiblingskincancersimulatedresponse(
						this.getUtilities().randBetween((int) this.getSiblingSkinCancer().getMinimum(),
								(int) this.getSiblingSkinCancer().getMaximum()));
				this.setSiblingNumberSkinCancer(assignResponseVariablesToOneOfEightSiblings());
				return this.getSiblingskincancersimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSiblingskincancersimulatedresponse();
	}

	/**
	 * @return the siblingexistssimulatedresponse
	 */
	public int getSiblingexistssimulatedresponse() {
		try {
			return this.siblingexistssimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.siblingexistssimulatedresponse;
	}

	/**
	 * @param siblingexistssimulatedresponse the siblingexistssimulatedresponse to
	 *                                       set
	 */
	public void setSiblingexistssimulatedresponse(int siblingexistssimulatedresponse) {
		try {
			this.siblingexistssimulatedresponse = siblingexistssimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingexistsValueRange
	 */
	public ValueRange getSiblingexistsValueRange() {
		try {
			return this.siblingexistsValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.siblingexistsValueRange;
	}

	/**
	 * @param siblingexistsValueRange the siblingexistsValueRange to set
	 */
	public void setSiblingexistsValueRange(ValueRange siblingexistsValueRange) {
		try {
			this.siblingexistsValueRange = siblingexistsValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingNSAlzheimersValueRange
	 */
	private ValueRange getSiblingNSAlzheimersValueRange() {
		try {
			return this.SiblingNSAlzheimersValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.SiblingNSAlzheimersValueRange;
	}

	/**
	 * @param siblingNSAlzheimersValueRange the siblingNSAlzheimersValueRange to set
	 */
	private void setSiblingNSAlzheimersValueRange(ValueRange siblingNSAlzheimersValueRange) {
		try {
			this.SiblingNSAlzheimersValueRange = siblingNSAlzheimersValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingalzheimerspresenceabsencesimulatedresponse
	 */
	private int getSiblingalzheimerspresenceabsencesimulatedresponse() {
		return this.siblingalzheimerspresenceabsencesimulatedresponse;
	}

	/**
	 * @param siblingalzheimerspresenceabsencesimulatedresponse the
	 *                                                          siblingalzheimerspresenceabsencesimulatedresponse
	 *                                                          to set
	 */
	private void setSiblingalzheimerspresenceabsencesimulatedresponse(
			int siblingalzheimerspresenceabsencesimulatedresponse) {
		try {
			this.siblingalzheimerspresenceabsencesimulatedresponse = siblingalzheimerspresenceabsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingDoAsthmaValueRange
	 */
	private ValueRange getSiblingDoAsthmaValueRange() {
		return this.SiblingDoAsthmaValueRange;
	}

	/**
	 * @param siblingDoAsthmaValueRange the siblingDoAsthmaValueRange to set
	 */
	private void setSiblingDoAsthmaValueRange(ValueRange siblingDoAsthmaValueRange) {
		try {
			this.SiblingDoAsthmaValueRange = siblingDoAsthmaValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingasthmapresenceabsencesimulatedresponse
	 */
	private int getSiblingasthmapresenceabsencesimulatedresponse() {
		return this.siblingasthmapresenceabsencesimulatedresponse;
	}

	/**
	 * @param siblingasthmapresenceabsencesimulatedresponse the
	 *                                                      siblingasthmapresenceabsencesimulatedresponse
	 *                                                      to set
	 */
	private void setSiblingasthmapresenceabsencesimulatedresponse(int siblingasthmapresenceabsencesimulatedresponse) {
		try {
			this.siblingasthmapresenceabsencesimulatedresponse = siblingasthmapresenceabsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingMHBipolarDisorder
	 */
	private ValueRange getSiblingMHBipolarDisorder() {
		return this.SiblingMHBipolarDisorder;
	}

	/**
	 * @param siblingMHBipolarDisorder the siblingMHBipolarDisorder to set
	 */
	private void setSiblingMHBipolarDisorder(ValueRange siblingMHBipolarDisorder) {
		try {
			this.SiblingMHBipolarDisorder = siblingMHBipolarDisorder;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingbipolarpresenceabsencesimulatedresponse
	 */
	private int getSiblingbipolarpresenceabsencesimulatedresponse() {
		return this.siblingbipolarpresenceabsencesimulatedresponse;
	}

	/**
	 * @param siblingbipolarpresenceabsencesimulatedresponse the
	 *                                                       siblingbipolarpresenceabsencesimulatedresponse
	 *                                                       to set
	 */
	private void setSiblingbipolarpresenceabsencesimulatedresponse(int siblingbipolarpresenceabsencesimulatedresponse) {
		try {
			this.siblingbipolarpresenceabsencesimulatedresponse = siblingbipolarpresenceabsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingBreastCancer
	 */
	private ValueRange getSiblingBreastCancer() {
		return this.SiblingBreastCancer;
	}

	/**
	 * @param siblingBreastCancer the siblingBreastCancer to set
	 */
	private void setSiblingBreastCancer(ValueRange siblingBreastCancer) {
		try {
			this.SiblingBreastCancer = siblingBreastCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingbreastcancersimulatedresponse
	 */
	private int getSiblingbreastcancersimulatedresponse() {
		return this.siblingbreastcancersimulatedresponse;
	}

	/**
	 * @param siblingbreastcancersimulatedresponse the
	 *                                             siblingbreastcancersimulatedresponse
	 *                                             to set
	 */
	private void setSiblingbreastcancersimulatedresponse(int siblingbreastcancersimulatedresponse) {
		try {
			this.siblingbreastcancersimulatedresponse = siblingbreastcancersimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingColonCancer
	 */
	private ValueRange getSiblingColonCancer() {
		return this.SiblingColonCancer;
	}

	/**
	 * @param siblingColonCancer the siblingColonCancer to set
	 */
	private void setSiblingColonCancer(ValueRange siblingColonCancer) {
		try {
			this.SiblingColonCancer = siblingColonCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingcoloncancersimulatedresponse
	 */
	private int getSiblingcoloncancersimulatedresponse() {
		return this.siblingcoloncancersimulatedresponse;
	}

	/**
	 * @param siblingcoloncancersimulatedresponse the
	 *                                            siblingcoloncancersimulatedresponse
	 *                                            to set
	 */
	private void setSiblingcoloncancersimulatedresponse(int siblingcoloncancersimulatedresponse) {
		try {
			this.siblingcoloncancersimulatedresponse = siblingcoloncancersimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingLungCancer
	 */
	private ValueRange getSiblingLungCancer() {
		return this.SiblingLungCancer;
	}

	/**
	 * @param siblingLungCancer the siblingLungCancer to set
	 */
	private void setSiblingLungCancer(ValueRange siblingLungCancer) {
		try {
			this.SiblingLungCancer = siblingLungCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblinglungcancersimulatedresponse
	 */
	private int getSiblinglungcancersimulatedresponse() {
		return this.siblinglungcancersimulatedresponse;
	}

	/**
	 * @param siblinglungcancersimulatedresponse the
	 *                                           siblinglungcancersimulatedresponse
	 *                                           to set
	 */
	private void setSiblinglungcancersimulatedresponse(int siblinglungcancersimulatedresponse) {
		try {
			this.siblinglungcancersimulatedresponse = siblinglungcancersimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingProstateCancer
	 */
	private ValueRange getSiblingProstateCancer() {
		return this.SiblingProstateCancer;
	}

	/**
	 * @param siblingProstateCancer the siblingProstateCancer to set
	 */
	private void setSiblingProstateCancer(ValueRange siblingProstateCancer) {
		try {
			this.SiblingProstateCancer = siblingProstateCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingprostatecancersimulatedresponse
	 */
	private int getSiblingprostatecancersimulatedresponse() {
		return this.siblingprostatecancersimulatedresponse;
	}

	/**
	 * @param siblingprostatecancersimulatedresponse the
	 *                                               siblingprostatecancersimulatedresponse
	 *                                               to set
	 */
	private void setSiblingprostatecancersimulatedresponse(int siblingprostatecancersimulatedresponse) {
		try {
			this.siblingprostatecancersimulatedresponse = siblingprostatecancersimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingSkinCancer
	 */
	private ValueRange getSiblingSkinCancer() {
		return this.SiblingSkinCancer;
	}

	/**
	 * @param siblingSkinCancer the siblingSkinCancer to set
	 */
	private void setSiblingSkinCancer(ValueRange siblingSkinCancer) {
		try {
			this.SiblingSkinCancer = siblingSkinCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingskincancersimulatedresponse
	 */
	private int getSiblingskincancersimulatedresponse() {
		return this.siblingskincancersimulatedresponse;
	}

	/**
	 * @param siblingskincancersimulatedresponse the
	 *                                           siblingskincancersimulatedresponse
	 *                                           to set
	 */
	private void setSiblingskincancersimulatedresponse(int siblingskincancersimulatedresponse) {
		try {
			this.siblingskincancersimulatedresponse = siblingskincancersimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingOtherCancer
	 */
	private ValueRange getSiblingOtherCancer() {
		return this.SiblingOtherCancer;
	}

	/**
	 * @param siblingOtherCancer the siblingOtherCancer to set
	 */
	private void setSiblingOtherCancer(ValueRange siblingOtherCancer) {
		try {
			this.SiblingOtherCancer = siblingOtherCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingothercancersimulatedresponse
	 */
	private int getSiblingothercancersimulatedresponse() {
		return this.siblingothercancersimulatedresponse;
	}

	/**
	 * @param siblingothercancersimulatedresponse the
	 *                                            siblingothercancersimulatedresponse
	 *                                            to set
	 */
	private void setSiblingothercancersimulatedresponse(int siblingothercancersimulatedresponse) {
		try {
			this.siblingothercancersimulatedresponse = siblingothercancersimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingLungDisease
	 */
	private ValueRange getSiblingLungDisease() {
		return this.SiblingLungDisease;
	}

	/**
	 * @param siblingLungDisease the siblingLungDisease to set
	 */
	private void setSiblingLungDisease(ValueRange siblingLungDisease) {
		try {
			this.SiblingLungDisease = siblingLungDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblinglungdiseasesimulatedresponse
	 */
	private int getSiblinglungdiseasesimulatedresponse() {
		return this.siblinglungdiseasesimulatedresponse;
	}

	/**
	 * @param siblinglungdiseasesimulatedresponse the
	 *                                            siblinglungdiseasesimulatedresponse
	 *                                            to set
	 */
	private void setSiblinglungdiseasesimulatedresponse(int siblinglungdiseasesimulatedresponse) {
		try {
			this.siblinglungdiseasesimulatedresponse = siblinglungdiseasesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingCoronaryArteryDisease
	 */
	private ValueRange getSiblingCoronaryArteryDisease() {
		return this.SiblingCoronaryArteryDisease;
	}

	/**
	 * @param siblingCoronaryArteryDisease the siblingCoronaryArteryDisease to set
	 */
	private void setSiblingCoronaryArteryDisease(ValueRange siblingCoronaryArteryDisease) {
		try {
			this.SiblingCoronaryArteryDisease = siblingCoronaryArteryDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingcoronaryarterydiseasesimulatedresponse
	 */
	private int getSiblingcoronaryarterydiseasesimulatedresponse() {
		return this.siblingcoronaryarterydiseasesimulatedresponse;
	}

	/**
	 * @param siblingcoronaryarterydiseasesimulatedresponse the
	 *                                                      siblingcoronaryarterydiseasesimulatedresponse
	 *                                                      to set
	 */
	private void setSiblingcoronaryarterydiseasesimulatedresponse(int siblingcoronaryarterydiseasesimulatedresponse) {
		try {
			this.siblingcoronaryarterydiseasesimulatedresponse = siblingcoronaryarterydiseasesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingMHDepression
	 */
	private ValueRange getSiblingMHDepression() {
		return this.SiblingMHDepression;
	}

	/**
	 * @param siblingMHDepression the siblingMHDepression to set
	 */
	private void setSiblingMHDepression(ValueRange siblingMHDepression) {
		try {
			this.SiblingMHDepression = siblingMHDepression;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingdepressionpresenceabsencesimulatedresponse
	 */
	private int getSiblingdepressionpresenceabsencesimulatedresponse() {
		return this.siblingdepressionpresenceabsencesimulatedresponse;
	}

	/**
	 * @param siblingdepressionpresenceabsencesimulatedresponse the
	 *                                                          siblingdepressionpresenceabsencesimulatedresponse
	 *                                                          to set
	 */
	private void setSiblingdepressionpresenceabsencesimulatedresponse(
			int siblingdepressionpresenceabsencesimulatedresponse) {
		try {
			this.siblingdepressionpresenceabsencesimulatedresponse = siblingdepressionpresenceabsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingHypertension
	 */
	private ValueRange getSiblingHypertension() {
		return this.SiblingHypertension;
	}

	/**
	 * @param siblingHypertension the siblingHypertension to set
	 */
	private void setSiblingHypertension(ValueRange siblingHypertension) {
		try {
			this.SiblingHypertension = siblingHypertension;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblinghypertensionpresenceabsencesimulatedresponse
	 */
	private int getSiblinghypertensionpresenceabsencesimulatedresponse() {
		return this.siblinghypertensionpresenceabsencesimulatedresponse;
	}

	/**
	 * @param siblinghypertensionpresenceabsencesimulatedresponse the
	 *                                                            siblinghypertensionpresenceabsencesimulatedresponse
	 *                                                            to set
	 */
	private void setSiblinghypertensionpresenceabsencesimulatedresponse(
			int siblinghypertensionpresenceabsencesimulatedresponse) {
		try {
			this.siblinghypertensionpresenceabsencesimulatedresponse = siblinghypertensionpresenceabsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingCholesterol
	 */
	private ValueRange getSiblingCholesterol() {
		return this.SiblingCholesterol;
	}

	/**
	 * @param siblingCholesterol the siblingCholesterol to set
	 */
	private void setSiblingCholesterol(ValueRange siblingCholesterol) {
		try {
			this.SiblingCholesterol = siblingCholesterol;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingcholesterolpresenceabsencesimulatedresponse
	 */
	private int getSiblingcholesterolpresenceabsencesimulatedresponse() {
		return this.siblingcholesterolpresenceabsencesimulatedresponse;
	}

	/**
	 * @param siblingcholesterolpresenceabsencesimulatedresponse the
	 *                                                           siblingcholesterolpresenceabsencesimulatedresponse
	 *                                                           to set
	 */
	private void setSiblingcholesterolpresenceabsencesimulatedresponse(
			int siblingcholesterolpresenceabsencesimulatedresponse) {
		try {
			this.siblingcholesterolpresenceabsencesimulatedresponse = siblingcholesterolpresenceabsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingStroke
	 */
	private ValueRange getSiblingStroke() {
		return this.SiblingStroke;
	}

	/**
	 * @param siblingStroke the siblingStroke to set
	 */
	private void setSiblingStroke(ValueRange siblingStroke) {
		try {
			this.SiblingStroke = siblingStroke;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingstrokepresenceabsencesimulatedresponse
	 */
	private int getSiblingstrokepresenceabsencesimulatedresponse() {
		return this.siblingstrokepresenceabsencesimulatedresponse;
	}

	/**
	 * @param siblingstrokepresenceabsencesimulatedresponse the
	 *                                                      siblingstrokepresenceabsencesimulatedresponse
	 *                                                      to set
	 */
	private void setSiblingstrokepresenceabsencesimulatedresponse(int siblingstrokepresenceabsencesimulatedresponse) {
		try {
			this.siblingstrokepresenceabsencesimulatedresponse = siblingstrokepresenceabsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingLiverDisease
	 */
	private ValueRange getSiblingLiverDisease() {
		return this.SiblingLiverDisease;
	}

	/**
	 * @param siblingLiverDisease the siblingLiverDisease to set
	 */
	private void setSiblingLiverDisease(ValueRange siblingLiverDisease) {
		try {
			this.SiblingLiverDisease = siblingLiverDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingliverdiseasepresenceabsencesimulatedresponse
	 */
	private int getSiblingliverdiseasepresenceabsencesimulatedresponse() {
		return this.siblingliverdiseasepresenceabsencesimulatedresponse;
	}

	/**
	 * @param siblingliverdiseasepresenceabsencesimulatedresponse the
	 *                                                            siblingliverdiseasepresenceabsencesimulatedresponse
	 *                                                            to set
	 */
	private void setSiblingliverdiseasepresenceabsencesimulatedresponse(
			int siblingliverdiseasepresenceabsencesimulatedresponse) {
		try {
			this.siblingliverdiseasepresenceabsencesimulatedresponse = siblingliverdiseasepresenceabsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingKidneyNoDialysis
	 */
	private ValueRange getSiblingKidneyNoDialysis() {
		return this.SiblingKidneyNoDialysis;
	}

	/**
	 * @param siblingKidneyNoDialysis the siblingKidneyNoDialysis to set
	 */
	private void setSiblingKidneyNoDialysis(ValueRange siblingKidneyNoDialysis) {
		try {
			this.SiblingKidneyNoDialysis = siblingKidneyNoDialysis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingkidneynodialysispresenceabsencesimulatedresponse
	 */
	private int getSiblingkidneynodialysispresenceabsencesimulatedresponse() {
		return this.siblingkidneynodialysispresenceabsencesimulatedresponse;
	}

	/**
	 * @param siblingkidneynodialysispresenceabsencesimulatedresponse the
	 *                                                                siblingkidneynodialysispresenceabsencesimulatedresponse
	 *                                                                to set
	 */
	private void setSiblingkidneynodialysispresenceabsencesimulatedresponse(
			int siblingkidneynodialysispresenceabsencesimulatedresponse) {
		try {
			this.siblingkidneynodialysispresenceabsencesimulatedresponse = siblingkidneynodialysispresenceabsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingDiabetesValueRange
	 */
	private ValueRange getSiblingDiabetesValueRange() {
		return this.SiblingDiabetesValueRange;
	}

	/**
	 * @param siblingDiabetesValueRange the siblingDiabetesValueRange to set
	 */
	private void setSiblingDiabetesValueRange(ValueRange siblingDiabetesValueRange) {
		try {
			this.SiblingDiabetesValueRange = siblingDiabetesValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingdiabetessimulatedresponse
	 */
	private int getSiblingdiabetessimulatedresponse() {
		return this.siblingdiabetessimulatedresponse;
	}

	/**
	 * @param siblingdiabetessimulatedresponse the siblingdiabetessimulatedresponse
	 *                                         to set
	 */
	private void setSiblingdiabetessimulatedresponse(int siblingdiabetessimulatedresponse) {
		try {
			this.siblingdiabetessimulatedresponse = siblingdiabetessimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the siblingNumberAlzheimers
	 */
	public int getSiblingNumberAlzheimers() {
		return siblingNumberAlzheimers;
	}

	/**
	 * @param siblingNumberAlzheimers the siblingNumberAlzheimers to set
	 */
	public void setSiblingNumberAlzheimers(int siblingNumberAlzheimers) {
		this.siblingNumberAlzheimers = siblingNumberAlzheimers;
	}

	/**
	 * @return the siblingNumberAsthma
	 */
	public int getSiblingNumberAsthma() {
		return siblingNumberAsthma;
	}

	/**
	 * @param siblingNumberAsthma the siblingNumberAsthma to set
	 */
	public void setSiblingNumberAsthma(int siblingNumberAsthma) {
		this.siblingNumberAsthma = siblingNumberAsthma;
	}

	/**
	 * @return the siblingNumberMHBipolar
	 */
	public int getSiblingNumberMHBipolar() {
		return siblingNumberMHBipolar;
	}

	/**
	 * @param siblingNumberMHBipolar the siblingNumberMHBipolar to set
	 */
	public void setSiblingNumberMHBipolar(int siblingNumberMHBipolar) {
		this.siblingNumberMHBipolar = siblingNumberMHBipolar;
	}

	/**
	 * @return the siblingNumberBreastCancer
	 */
	public int getSiblingNumberBreastCancer() {
		return siblingNumberBreastCancer;
	}

	/**
	 * @param siblingNumberBreastCancer the siblingNumberBreastCancer to set
	 */
	public void setSiblingNumberBreastCancer(int siblingNumberBreastCancer) {
		this.siblingNumberBreastCancer = siblingNumberBreastCancer;
	}

	/**
	 * @return the siblingNumberColonCancer
	 */
	public int getSiblingNumberColonCancer() {
		return siblingNumberColonCancer;
	}

	/**
	 * @param siblingNumberColonCancer the siblingNumberColonCancer to set
	 */
	public void setSiblingNumberColonCancer(int siblingNumberColonCancer) {
		this.siblingNumberColonCancer = siblingNumberColonCancer;
	}

	/**
	 * @return the siblingNumberLungCancer
	 */
	public int getSiblingNumberLungCancer() {
		return siblingNumberLungCancer;
	}

	/**
	 * @param siblingNumberLungCancer the siblingNumberLungCancer to set
	 */
	public void setSiblingNumberLungCancer(int siblingNumberLungCancer) {
		this.siblingNumberLungCancer = siblingNumberLungCancer;
	}

	/**
	 * @return the siblingNumberProstateCancer
	 */
	public int getSiblingNumberProstateCancer() {
		return siblingNumberProstateCancer;
	}

	/**
	 * @param siblingNumberProstateCancer the siblingNumberProstateCancer to set
	 */
	public void setSiblingNumberProstateCancer(int siblingNumberProstateCancer) {
		this.siblingNumberProstateCancer = siblingNumberProstateCancer;
	}

	/**
	 * @return the siblingNumberSkinCancer
	 */
	public int getSiblingNumberSkinCancer() {
		return siblingNumberSkinCancer;
	}

	/**
	 * @param siblingNumberSkinCancer the siblingNumberSkinCancer to set
	 */
	public void setSiblingNumberSkinCancer(int siblingNumberSkinCancer) {
		this.siblingNumberSkinCancer = siblingNumberSkinCancer;
	}

	/**
	 * @return the siblingNumberOtherCancer
	 */
	public int getSiblingNumberOtherCancer() {
		return siblingNumberOtherCancer;
	}

	/**
	 * @param siblingNumberOtherCancer the siblingNumberOtherCancer to set
	 */
	public void setSiblingNumberOtherCancer(int siblingNumberOtherCancer) {
		this.siblingNumberOtherCancer = siblingNumberOtherCancer;
	}

	/**
	 * @return the siblingNumberLungDisease
	 */
	public int getSiblingNumberLungDisease() {
		return siblingNumberLungDisease;
	}

	/**
	 * @param siblingNumberLungDisease the siblingNumberLungDisease to set
	 */
	public void setSiblingNumberLungDisease(int siblingNumberLungDisease) {
		this.siblingNumberLungDisease = siblingNumberLungDisease;
	}

	/**
	 * @return the siblingNumberCAD
	 */
	public int getSiblingNumberCAD() {
		return siblingNumberCAD;
	}

	/**
	 * @param siblingNumberCAD the siblingNumberCAD to set
	 */
	public void setSiblingNumberCAD(int siblingNumberCAD) {
		this.siblingNumberCAD = siblingNumberCAD;
	}

	/**
	 * @return the siblingNUmberMHDepression
	 */
	public int getSiblingNUmberMHDepression() {
		return siblingNUmberMHDepression;
	}

	/**
	 * @param siblingNUmberMHDepression the siblingNUmberMHDepression to set
	 */
	public void setSiblingNUmberMHDepression(int siblingNUmberMHDepression) {
		this.siblingNUmberMHDepression = siblingNUmberMHDepression;
	}

	/**
	 * @return the siblingNumberHypertension
	 */
	public int getSiblingNumberHypertension() {
		return siblingNumberHypertension;
	}

	/**
	 * @param siblingNumberHypertension the siblingNumberHypertension to set
	 */
	public void setSiblingNumberHypertension(int siblingNumberHypertension) {
		this.siblingNumberHypertension = siblingNumberHypertension;
	}

	/**
	 * @return the siblingNumberCholesterol
	 */
	public int getSiblingNumberCholesterol() {
		return siblingNumberCholesterol;
	}

	/**
	 * @param siblingNumberCholesterol the siblingNumberCholesterol to set
	 */
	public void setSiblingNumberCholesterol(int siblingNumberCholesterol) {
		this.siblingNumberCholesterol = siblingNumberCholesterol;
	}

	/**
	 * @return the siblingNumberDiabetes
	 */
	public int getSiblingNumberDiabetes() {
		return siblingNumberDiabetes;
	}

	/**
	 * @param siblingNumberDiabetes the siblingNumberDiabetes to set
	 */
	public void setSiblingNumberDiabetes(int siblingNumberDiabetes) {
		this.siblingNumberDiabetes = siblingNumberDiabetes;
	}

	/**
	 * @return the siblingNumberKidneyNoDialysis
	 */
	public int getSiblingNumberKidneyNoDialysis() {
		return siblingNumberKidneyNoDialysis;
	}

	/**
	 * @param siblingNumberKidneyNoDialysis the siblingNumberKidneyNoDialysis to set
	 */
	public void setSiblingNumberKidneyNoDialysis(int siblingNumberKidneyNoDialysis) {
		this.siblingNumberKidneyNoDialysis = siblingNumberKidneyNoDialysis;
	}

	/**
	 * @return the siblingNumberLiverDisease
	 */
	public int getSiblingNumberLiverDisease() {
		return siblingNumberLiverDisease;
	}

	/**
	 * @param siblingNumberLiverDisease the siblingNumberLiverDisease to set
	 */
	public void setSiblingNumberLiverDisease(int siblingNumberLiverDisease) {
		this.siblingNumberLiverDisease = siblingNumberLiverDisease;
	}

	/**
	 * @return the siblingNumberStroke
	 */
	public int getSiblingNumberStroke() {
		return siblingNumberStroke;
	}

	/**
	 * @param siblingNumberStroke the siblingNumberStroke to set
	 */
	public void setSiblingNumberStroke(int siblingNumberStroke) {
		this.siblingNumberStroke = siblingNumberStroke;
	}

}
