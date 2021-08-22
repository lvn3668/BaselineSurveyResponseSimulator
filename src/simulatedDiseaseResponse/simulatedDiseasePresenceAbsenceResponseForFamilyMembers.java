package simulatedDiseaseResponse;

import java.time.temporal.ValueRange;

import Utilities.Utilities;
import randomizer.UniformDistribution;

public class simulatedDiseasePresenceAbsenceResponseForFamilyMembers {

	private static int errorResponse;
	private static final int maxToGenerateErrorVal = 4;
	// If Sibling 1-8 exists, etc.
	private static final int minToGenerateErrorVal = 2;

	/**
	 * @return the errorResponse
	 */
	private static int getErrorResponse() {
		return errorResponse;
	}

	/**
	 * @return the maxtogenerateerrorval
	 */
	private static int getMaxtogenerateerrorval() {
		return maxToGenerateErrorVal;
	}

	/**
	 * @return the mintogenerateerrorval
	 */
	private static int getMintogenerateerrorval() {
		return minToGenerateErrorVal;
	}

	/**
	 * @param errorResponse the errorResponse to set
	 */
	private static void setErrorResponse(int errorResponse) {
		try {
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers.errorResponse = errorResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int alzheimerspresenceabsencesimulatedresponse;
	private ValueRange alzheimersValueRange;
	private int asthmapresenceabsencesimulatedresponse;
	private ValueRange asthmaValueRange;
	private ValueRange bipolarDisorderValueRange;
	private int bipolarpresenceabsencesimulatedresponse;
	private int breastcancersimulatedresponse;
	private ValueRange breastcancerValueRange;
	private int cholesterolpresenceabsencesimulatedresponse;
	private ValueRange cholesterolValueRange;
	private int coloncancerpresenceabsencesimulatedresponse;
	private ValueRange colonCancerValueRange;
	private int coronaryarterydiseasesimulatedresponse;
	private ValueRange coronaryArteryDiseaseValueRange;
	private int depressionpresenceabsencesimulatedresponse;
	private ValueRange depressionValueRange;
	private int diabetessimulatedresponse;
	private ValueRange diabetesValueRange;
	private int hypertensionpresenceabsencesimulatedresponse;
	private ValueRange hypertensionValueRange;
	private int kidneynodialysispresenceabsencesimulatedresponse;
	private ValueRange kidneyNoDialysisValueRange;
	private int liverdiseasepresenceabsencesimulatedresponse;
	private ValueRange liverDiseaseValueRange;
	private int lungcancersimulatedresponse;
	private ValueRange lungCancerValueRange;
	private int lungdiseasesimulatedresponse;
	private ValueRange lungDiseaseValueRange;
	private int othercancersimulatedresponse;

	private ValueRange otherCancerValueRange;
	private int prostatecancersimulatedresponse;

	private ValueRange prostateCancerValueRange;
	private int skincancersimulatedresponse;

	private ValueRange skinCancerValueRange;

	private int strokepresenceabsencesimulatedresponse;

	private ValueRange strokeValueRange;

	private UniformDistribution uniformDistribution;
	private Utilities utilities;

	private ValueRange schizophreniaValueRange;
	private int schizophreniapresenceabsencesimulatedresponse;
	
	// If Sibling 1-8 exists, etc.
	public simulatedDiseasePresenceAbsenceResponseForFamilyMembers(int cohortSex) {
		try {
			this.setUtilities(new Utilities());
			this.setUniformdistribution(new UniformDistribution(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval()));
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers.setErrorResponse(this.getUtilities().randBetween(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval()));
			this.setAlzheimersValueRange(ValueRange.of(0, 1));
			this.setAlzheimerspresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setAsthmaValueRange(ValueRange.of(0, 1));
			this.setAsthmapresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setBipolarDisorderValueRange(ValueRange.of(0, 1));
			this.setBipolarpresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setBreastcancerValueRange(ValueRange.of(0, 1));
			this.setBreastcancersimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setCholesterolValueRange(ValueRange.of(0, 1));
			this.setCholesterolpresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setColonCancerValueRange(ValueRange.of(0, 1));
			this.setColoncancerpresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setLungCancerValueRange(ValueRange.of(0, 1));
			this.setLungcancersimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setProstateCancerValueRange(ValueRange.of(0, 1));
			this.setProstatecancersimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setSkinCancerValueRange(ValueRange.of(0, 1));
			this.setSkincancersimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setOtherCancerValueRange(ValueRange.of(0, 1));
			this.setOthercancersimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setLungDiseaseValueRange(ValueRange.of(0, 1));
			this.setLungdiseasepresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setCoronaryArteryDiseaseValueRange(ValueRange.of(0, 1));
			this.setCoronaryarterydiseasesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setDepressionValueRange(ValueRange.of(0, 1));
			this.setDepressionpresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setHypertensionValueRange(ValueRange.of(0, 1));
			this.setHypertensionpresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setCholesterolValueRange(ValueRange.of(0, 1));
			this.setCholesterolpresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setStrokeValueRange(ValueRange.of(0, 1));
			this.setStrokepresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setLiverDiseaseValueRange(ValueRange.of(0, 1));
			this.setLiverdiseasepresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setKidneyNoDialysisValueRange(ValueRange.of(0, 1));
			this.setKidneynodialysispresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.setDiabetesValueRange(ValueRange.of(0, 1));
			this.setDiabetespresenceabsencesimulatedresponse(
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());

			
			//this.printsimulatedresponses();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printsimulatedresponses() throws Exception
	{
		try {
			System.out.println("Alzheimers " +this.getAlzheimerspresenceabsencesimulatedresponse());
			System.out.println("Asthma " +this.getAsthmapresenceabsencesimulatedresponse());
			System.out.println("Bipolar " +this.getBipolarpresenceabsencesimulatedresponse());
			System.out.println("Breast Cancer " +this.getBreastcancersimulatedresponse());
			System.out.println("Cholesterol " +this.getCholesterolpresenceabsencesimulatedresponse());
			System.out.println("Colon Cancer " +this.getColoncancerpresenceabsencesimulatedresponse());
			System.out.println("Coronary Artery Disease " +this.getCoronaryarterydiseasesimulatedresponse());
			System.out.println("Depression " +this.getDepressionpresenceabsencesimulatedresponse());
			System.out.println("Diabetes " +this.getDiabetespresenceabsencesimulatedresponse());
			System.out.println("Hypertension " +this.getHypertensionpresenceabsencesimulatedresponse());
			System.out.println("Kidney Disease " +this.getKidneynodialysispresenceabsencesimulatedresponse());
			System.out.println("Liver Disease " +this.getLiverdiseasepresenceabsencesimulatedresponse());
			System.out.println("Lung Cancer " +this.getLungcancerpresenceabsencesimulatedresponse());
			System.out.println("Lung Disease " +this.getLungdiseasepresenceabsencesimulatedresponse());
			System.out.println("Other Cancer " +this.getOthercancersimulatedresponse());
			System.out.println("Prostate Cancer " +this.getProstatecancersimulatedresponse());
			System.out.println("Skin Cancer " +this.getSkincancersimulatedresponse());
			System.out.println("Stroke " +this.getStrokepresenceabsencesimulatedresponse());
			System.out.println("Schizophrenia "+ this.getSchizophreniapresenceabsencesimulatedresponse());
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @return the alzheimerspresenceabsencesimulatedresponse
	 */
	public int getAlzheimerspresenceabsencesimulatedresponse() {
		return this.alzheimerspresenceabsencesimulatedresponse;
	}

	/**
	 * @return the nSAlzheimersValueRange
	 */
	private ValueRange getAlzheimersValueRange() {
		return this.alzheimersValueRange;
	}

	/**
	 * @return the asthmapresenceabsencesimulatedresponse
	 */
	public int getAsthmapresenceabsencesimulatedresponse() {
		return this.asthmapresenceabsencesimulatedresponse;
	}

	/**
	 * @return the doAsthmaValueRange
	 */
	private ValueRange getAsthmaValueRange() {
		return this.asthmaValueRange;
	}

	/**
	 * @return the mHBipolarDisorderValueRange
	 */
	private ValueRange getBipolarDisorderValueRange() {
		return this.bipolarDisorderValueRange;
	}

	/**
	 * @return the bipolarpresenceabsencesimulatedresponse
	 */
	public int getBipolarpresenceabsencesimulatedresponse() {
		return this.bipolarpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the breastcancersimulatedresponse
	 */
	public int getBreastcancersimulatedresponse() {
		return this.breastcancersimulatedresponse;
	}

	/**
	 * @return the breastCancerValueRange
	 */
	private ValueRange getBreastcancerValueRange() {
		return this.breastcancerValueRange;
	}

	/**
	 * @return the cholesterolpresenceabsencesimulatedresponse
	 */
	public int getCholesterolpresenceabsencesimulatedresponse() {
		return this.cholesterolpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the cholesterolValueRange
	 */
	private ValueRange getCholesterolValueRange() {
		return this.cholesterolValueRange;
	}

	/**
	 * @return the coloncancerpresenceabsencesimulatedresponse
	 */
	public int getColoncancerpresenceabsencesimulatedresponse() {
		return this.coloncancerpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the colonCancerValueRange
	 */
	private ValueRange getColonCancerValueRange() {
		return this.colonCancerValueRange;
	}

	/**
	 * @return the coronaryarterydiseasesimulatedresponse
	 */
	public int getCoronaryarterydiseasesimulatedresponse() {
		return this.coronaryarterydiseasesimulatedresponse;
	}

	/**
	 * @return the coronaryArteryDiseaseValueRange
	 */
	private ValueRange getCoronaryArteryDiseaseValueRange() {
		return this.coronaryArteryDiseaseValueRange;
	}

	/**
	 * @return the depressionpresenceabsencesimulatedresponse
	 */
	public int getDepressionpresenceabsencesimulatedresponse() {
		return this.depressionpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the mHDepressionValueRange
	 */
	private ValueRange getDepressionValueRange() {
		return this.depressionValueRange;
	}

	/**
	 * @return the diabetessimulatedresponse
	 */
	public int getDiabetespresenceabsencesimulatedresponse() {
		return this.diabetessimulatedresponse;
	}

	/**
	 * @return the diabetesValueRange
	 */
	private ValueRange getDiabetesValueRange() {
		return this.diabetesValueRange;
	}

	/**
	 * @return the hypertensionpresenceabsencesimulatedresponse
	 */
	public int getHypertensionpresenceabsencesimulatedresponse() {
		return this.hypertensionpresenceabsencesimulatedresponse;
	}

	/**
	 * @return the hypertensionValueRange
	 */
	private ValueRange getHypertensionValueRange() {
		return this.hypertensionValueRange;
	}

	/**
	 * @return the kidneynodialysispresenceabsencesimulatedresponse
	 */
	public int getKidneynodialysispresenceabsencesimulatedresponse() {
		return this.kidneynodialysispresenceabsencesimulatedresponse;
	}

	/**
	 * @return the kidneyNoDialysisValueRange
	 */
	private ValueRange getKidneyNoDialysisValueRange() {
		return this.kidneyNoDialysisValueRange;
	}

	/**
	 * @return the liverdiseasepresenceabsencesimulatedresponse
	 */
	public int getLiverdiseasepresenceabsencesimulatedresponse() {
		return this.liverdiseasepresenceabsencesimulatedresponse;
	}

	/**
	 * @return the liverDiseaseValueRange
	 */
	private ValueRange getLiverDiseaseValueRange() {
		return this.liverDiseaseValueRange;
	}

	/**
	 * @return the lungcancersimulatedresponse
	 */
	public int getLungcancerpresenceabsencesimulatedresponse() {
		return this.lungcancersimulatedresponse;
	}

	/**
	 * @return the lungCancerValueRange
	 */
	private ValueRange getLungCancerValueRange() {
		return this.lungCancerValueRange;
	}

	/**
	 * @return the lungdiseasesimulatedresponse
	 */
	public int getLungdiseasepresenceabsencesimulatedresponse() {
		return this.lungdiseasesimulatedresponse;
	}

	/**
	 * @return the lungDiseaseValueRange
	 */
	private ValueRange getLungDiseaseValueRange() {
		return this.lungDiseaseValueRange;
	}

	/**
	 * @return the othercancersimulatedresponse
	 */
	public int getOthercancersimulatedresponse() {
		return this.othercancersimulatedresponse;
	}

	/**
	 * @return the otherCancerValueRange
	 */
	private ValueRange getOtherCancerValueRange() {
		return this.otherCancerValueRange;
	}

	/**
	 * @return the prostatecancersimulatedresponse
	 */
	public int getProstatecancersimulatedresponse() {
		return this.prostatecancersimulatedresponse;
	}

	/**
	 * @return the prostateCancerValueRange
	 */
	private ValueRange getProstateCancerValueRange() {
		return this.prostateCancerValueRange;
	}

	/**
	 * @return the skincancersimulatedresponse
	 */
	public int getSkincancersimulatedresponse() {
		return this.skincancersimulatedresponse;
	}

	/**
	 * @return the skinCancerValueRange
	 */
	private ValueRange getSkinCancerValueRange() {
		return this.skinCancerValueRange;
	}

	/**
	 * @return the strokepresenceabsencesimulatedresponse
	 */
	public int getStrokepresenceabsencesimulatedresponse() {
		return this.strokepresenceabsencesimulatedresponse;
	}

	/**
	 * @return the strokeValueRange
	 */
	private ValueRange getStrokeValueRange() {
		return this.strokeValueRange;
	}

	/**
	 * @return the uniformDistribution
	 */
	private UniformDistribution getUniformdistribution() {
		return this.uniformDistribution;
	}

	/**
	 * @return the utilities
	 */
	private Utilities getUtilities() {
		return this.utilities;
	}

	/**
	 * @param alzheimerspresenceabsencesimulatedresponse the
	 *                                                   alzheimerspresenceabsencesimulatedresponse
	 *                                                   to set
	 */
	private void setAlzheimerspresenceabsencesimulatedresponse(int alzheimerspresenceabsencesimulatedresponse) {
		this.alzheimerspresenceabsencesimulatedresponse = alzheimerspresenceabsencesimulatedresponse;
	}

	/**
	 * @param nSAlzheimersValueRange the nSAlzheimersValueRange to set
	 */
	private void setAlzheimersValueRange(ValueRange nSAlzheimersValueRange) {
		this.alzheimersValueRange = nSAlzheimersValueRange;
	}

	/**
	 * @param asthmapresenceabsencesimulatedresponse the
	 *                                               asthmapresenceabsencesimulatedresponse
	 *                                               to set
	 */
	private void setAsthmapresenceabsencesimulatedresponse(int asthmapresenceabsencesimulatedresponse) {
		this.asthmapresenceabsencesimulatedresponse = asthmapresenceabsencesimulatedresponse;
	}

	/**
	 * @param doAsthmaValueRange the doAsthmaValueRange to set
	 */
	private void setAsthmaValueRange(ValueRange doAsthmaValueRange) {
		this.asthmaValueRange = doAsthmaValueRange;
	}

	/**
	 * @param mHBipolarDisorderValueRange the mHBipolarDisorderValueRange to set
	 */
	private void setBipolarDisorderValueRange(ValueRange mHBipolarDisorderValueRange) {
		this.bipolarDisorderValueRange = mHBipolarDisorderValueRange;
	}

	/**
	 * @param bipolarpresenceabsencesimulatedresponse the
	 *                                                bipolarpresenceabsencesimulatedresponse
	 *                                                to set
	 */
	private void setBipolarpresenceabsencesimulatedresponse(int bipolarpresenceabsencesimulatedresponse) {
		this.bipolarpresenceabsencesimulatedresponse = bipolarpresenceabsencesimulatedresponse;
	}

	/**
	 * @param breastcancersimulatedresponse the breastcancersimulatedresponse to set
	 */
	private void setBreastcancersimulatedresponse(int breastcancersimulatedresponse) {
		this.breastcancersimulatedresponse = breastcancersimulatedresponse;
	}

	/**
	 * @param breastCancerValueRange the breastCancerValueRange to set
	 */
	private void setBreastcancerValueRange(ValueRange breastCancerValueRange) {
		this.breastcancerValueRange = breastCancerValueRange;
	}

	/**
	 * @param cholesterolpresenceabsencesimulatedresponse the
	 *                                                    cholesterolpresenceabsencesimulatedresponse
	 *                                                    to set
	 */
	private void setCholesterolpresenceabsencesimulatedresponse(int cholesterolpresenceabsencesimulatedresponse) {
		this.cholesterolpresenceabsencesimulatedresponse = cholesterolpresenceabsencesimulatedresponse;
	}

	/**
	 * @param cholesterolValueRange the cholesterolValueRange to set
	 */
	private void setCholesterolValueRange(ValueRange cholesterolValueRange) {
		this.cholesterolValueRange = cholesterolValueRange;
	}

	/**
	 * @param coloncancerpresenceabsencesimulatedresponse the
	 *                                                    coloncancerpresenceabsencesimulatedresponse
	 *                                                    to set
	 */
	private void setColoncancerpresenceabsencesimulatedresponse(int coloncancerpresenceabsencesimulatedresponse) {
		this.coloncancerpresenceabsencesimulatedresponse = coloncancerpresenceabsencesimulatedresponse;
	}

	/**
	 * @param colonCancerValueRange the colonCancerValueRange to set
	 */
	private void setColonCancerValueRange(ValueRange colonCancerValueRange) {
		this.colonCancerValueRange = colonCancerValueRange;
	}

	/**
	 * @param coronaryarterydiseasesimulatedresponse the
	 *                                               coronaryarterydiseasesimulatedresponse
	 *                                               to set
	 */
	private void setCoronaryarterydiseasesimulatedresponse(int coronaryarterydiseasesimulatedresponse) {
		this.coronaryarterydiseasesimulatedresponse = coronaryarterydiseasesimulatedresponse;
	}

	/**
	 * @param coronaryArteryDiseaseValueRange the coronaryArteryDiseaseValueRange to
	 *                                        set
	 */
	private void setCoronaryArteryDiseaseValueRange(ValueRange coronaryArteryDiseaseValueRange) {
		this.coronaryArteryDiseaseValueRange = coronaryArteryDiseaseValueRange;
	}

	/**
	 * @param depressionpresenceabsencesimulatedresponse the
	 *                                                   depressionpresenceabsencesimulatedresponse
	 *                                                   to set
	 */
	private void setDepressionpresenceabsencesimulatedresponse(int depressionpresenceabsencesimulatedresponse) {
		this.depressionpresenceabsencesimulatedresponse = depressionpresenceabsencesimulatedresponse;
	}

	/**
	 * @param mHDepressionValueRange the mHDepressionValueRange to set
	 */
	private void setDepressionValueRange(ValueRange mHDepressionValueRange) {
		this.depressionValueRange = mHDepressionValueRange;
	}

	/**
	 * @param diabetessimulatedresponse the diabetessimulatedresponse to set
	 */
	private void setDiabetespresenceabsencesimulatedresponse(int diabetessimulatedresponse) {
		this.diabetessimulatedresponse = diabetessimulatedresponse;
	}

	/**
	 * @param diabetesValueRange the diabetesValueRange to set
	 */
	private void setDiabetesValueRange(ValueRange diabetesValueRange) {
		this.diabetesValueRange = diabetesValueRange;
	}

	/**
	 * @param hypertensionpresenceabsencesimulatedresponse the
	 *                                                     hypertensionpresenceabsencesimulatedresponse
	 *                                                     to set
	 */
	private void setHypertensionpresenceabsencesimulatedresponse(int hypertensionpresenceabsencesimulatedresponse) {
		this.hypertensionpresenceabsencesimulatedresponse = hypertensionpresenceabsencesimulatedresponse;
	}

	/**
	 * @param hypertensionValueRange the hypertensionValueRange to set
	 */
	private void setHypertensionValueRange(ValueRange hypertensionValueRange) {
		this.hypertensionValueRange = hypertensionValueRange;
	}

	/**
	 * @param kidneynodialysispresenceabsencesimulatedresponse the
	 *                                                         kidneynodialysispresenceabsencesimulatedresponse
	 *                                                         to set
	 */
	private void setKidneynodialysispresenceabsencesimulatedresponse(
			int kidneynodialysispresenceabsencesimulatedresponse) {
		this.kidneynodialysispresenceabsencesimulatedresponse = kidneynodialysispresenceabsencesimulatedresponse;
	}

	/**
	 * @param kidneyNoDialysisValueRange the kidneyNoDialysisValueRange to set
	 */
	private void setKidneyNoDialysisValueRange(ValueRange kidneyNoDialysisValueRange) {
		this.kidneyNoDialysisValueRange = kidneyNoDialysisValueRange;
	}

	/**
	 * @param liverdiseasepresenceabsencesimulatedresponse the
	 *                                                     liverdiseasepresenceabsencesimulatedresponse
	 *                                                     to set
	 */
	private void setLiverdiseasepresenceabsencesimulatedresponse(int liverdiseasepresenceabsencesimulatedresponse) {
		this.liverdiseasepresenceabsencesimulatedresponse = liverdiseasepresenceabsencesimulatedresponse;
	}

	/**
	 * @param liverDiseaseValueRange the liverDiseaseValueRange to set
	 */
	private void setLiverDiseaseValueRange(ValueRange liverDiseaseValueRange) {
		this.liverDiseaseValueRange = liverDiseaseValueRange;
	}

	/**
	 * @param lungcancersimulatedresponse the lungcancersimulatedresponse to set
	 */
	private void setLungcancersimulatedresponse(int lungcancersimulatedresponse) {
		this.lungcancersimulatedresponse = lungcancersimulatedresponse;
	}

	/**
	 * @param lungCancerValueRange the lungCancerValueRange to set
	 */
	private void setLungCancerValueRange(ValueRange lungCancerValueRange) {
		this.lungCancerValueRange = lungCancerValueRange;
	}

	/**
	 * @param lungdiseasesimulatedresponse the lungdiseasesimulatedresponse to set
	 */
	private void setLungdiseasepresenceabsencesimulatedresponse(int lungdiseasesimulatedresponse) {
		this.lungdiseasesimulatedresponse = lungdiseasesimulatedresponse;
	}

	/**
	 * @param lungDiseaseValueRange the lungDiseaseValueRange to set
	 */
	private void setLungDiseaseValueRange(ValueRange lungDiseaseValueRange) {
		this.lungDiseaseValueRange = lungDiseaseValueRange;
	}

	/**
	 * @param othercancersimulatedresponse the othercancersimulatedresponse to set
	 */
	private void setOthercancersimulatedresponse(int othercancersimulatedresponse) {
		this.othercancersimulatedresponse = othercancersimulatedresponse;
	}

	/**
	 * @param otherCancerValueRange the otherCancerValueRange to set
	 */
	private void setOtherCancerValueRange(ValueRange otherCancerValueRange) {
		this.otherCancerValueRange = otherCancerValueRange;
	}

	/**
	 * @param prostatecancersimulatedresponse the prostatecancersimulatedresponse to
	 *                                        set
	 */
	private void setProstatecancersimulatedresponse(int prostatecancersimulatedresponse) {
		this.prostatecancersimulatedresponse = prostatecancersimulatedresponse;
	}

	/**
	 * @param prostateCancerValueRange the prostateCancerValueRange to set
	 */
	private void setProstateCancerValueRange(ValueRange prostateCancerValueRange) {
		this.prostateCancerValueRange = prostateCancerValueRange;
	}

	/**
	 * @param skincancersimulatedresponse the skincancersimulatedresponse to set
	 */
	private void setSkincancersimulatedresponse(int skincancersimulatedresponse) {
		this.skincancersimulatedresponse = skincancersimulatedresponse;
	}

	/**
	 * @param skinCancerValueRange the skinCancerValueRange to set
	 */
	private void setSkinCancerValueRange(ValueRange skinCancerValueRange) {
		this.skinCancerValueRange = skinCancerValueRange;
	}

	/**
	 * @param strokepresenceabsencesimulatedresponse the
	 *                                               strokepresenceabsencesimulatedresponse
	 *                                               to set
	 */
	private void setStrokepresenceabsencesimulatedresponse(int strokepresenceabsencesimulatedresponse) {
		this.strokepresenceabsencesimulatedresponse = strokepresenceabsencesimulatedresponse;
	}

	/**
	 * @param strokeValueRange the strokeValueRange to set
	 */
	private void setStrokeValueRange(ValueRange strokeValueRange) {
		this.strokeValueRange = strokeValueRange;
	}

	/**
	 * @param uniformDistribution the uniformDistribution to set
	 */
	private void setUniformdistribution(UniformDistribution uniformDistribution) {
		this.uniformDistribution = uniformDistribution;
	}

	/**
	 * @param utilities the utilities to set
	 */
	private void setUtilities(Utilities utilities) {
		this.utilities = utilities;
	}

	private int simulateAlzheimersResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setAlzheimersValueRange(valuerange);
			this.setAlzheimerspresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setAlzheimerspresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getAlzheimersValueRange().getMinimum(),
								(int) this.getAlzheimersValueRange().getMaximum()));
				return this.getAlzheimerspresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getAlzheimerspresenceabsencesimulatedresponse();
	}

	private int simulateAsthmaResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setDepressionValueRange(valuerange);
			this.setDepressionpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setDepressionpresenceabsencesimulatedresponse(this.getUtilities().randBetween(
						(int) this.getAsthmaValueRange().getMinimum(), (int) this.getAsthmaValueRange().getMaximum()));
				return this.getAsthmapresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getAsthmapresenceabsencesimulatedresponse();
	}

	private int simulateBipolarDisorderResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setBipolarDisorderValueRange(valuerange);
			this.setBipolarpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setBipolarpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getBipolarDisorderValueRange().getMinimum(),
								(int) this.getBipolarDisorderValueRange().getMaximum()));
				return this.getBipolarpresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getBipolarpresenceabsencesimulatedresponse();
	}

	private int simulateBreastCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setBreastcancerValueRange(valuerange);
			this.setBreastcancersimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setBreastcancersimulatedresponse(
						this.getUtilities().randBetween((int) this.getBreastcancerValueRange().getMinimum(),
								(int) this.getBreastcancerValueRange().getMaximum()));
				return this.getBreastcancersimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getBreastcancersimulatedresponse();
	}

	private int simulateCholesterolResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setCholesterolValueRange(valuerange);
			this.setCholesterolpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setCholesterolpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getCholesterolValueRange().getMinimum(),
								(int) this.getCholesterolValueRange().getMaximum()));
				return this.getCholesterolpresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getCholesterolpresenceabsencesimulatedresponse();
	}

	private int simulateColonCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setColonCancerValueRange(valuerange);
			this.setColoncancerpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setColoncancerpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getColonCancerValueRange().getMinimum(),
								(int) this.getColonCancerValueRange().getMaximum()));
				return this.getColoncancerpresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getColoncancerpresenceabsencesimulatedresponse();
	}

	private int simulateCoronaryArteryDiseaseResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setCoronaryArteryDiseaseValueRange(valuerange);
			this.setCoronaryarterydiseasesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setCoronaryarterydiseasesimulatedresponse(
						this.getUtilities().randBetween((int) this.getCoronaryArteryDiseaseValueRange().getMinimum(),
								(int) this.getCoronaryArteryDiseaseValueRange().getMaximum()));
				return this.getCoronaryarterydiseasesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getCoronaryarterydiseasesimulatedresponse();
	}

	private int simulateDepressionResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setDepressionValueRange(valuerange);
			this.setDepressionpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setDepressionpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getDepressionValueRange().getMinimum(),
								(int) this.getDepressionValueRange().getMaximum()));
				return this.getDepressionpresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getDepressionpresenceabsencesimulatedresponse();
	}

	private int simulateDiabetesResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setDiabetesValueRange(valuerange);
			this.setDiabetespresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setDiabetespresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getDiabetesValueRange().getMinimum(),
								(int) this.getDiabetesValueRange().getMaximum()));
				return this.getDiabetespresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getDiabetespresenceabsencesimulatedresponse();
	}

	private int simulateHypertensionResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setHypertensionValueRange(valuerange);
			this.setHypertensionpresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setHypertensionpresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getHypertensionValueRange().getMinimum(),
								(int) this.getHypertensionValueRange().getMaximum()));
				return this.getHypertensionpresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getHypertensionpresenceabsencesimulatedresponse();
	}

	private int simulateKidneyNoDialysisResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setKidneyNoDialysisValueRange(valuerange);
			this.setKidneynodialysispresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setKidneynodialysispresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getKidneyNoDialysisValueRange().getMinimum(),
								(int) this.getKidneyNoDialysisValueRange().getMaximum()));
				return this.getKidneynodialysispresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getKidneynodialysispresenceabsencesimulatedresponse();
	}

	private int simulateLiverDiseaseResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setLiverDiseaseValueRange(valuerange);
			this.setLiverdiseasepresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setLiverdiseasepresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getLiverDiseaseValueRange().getMinimum(),
								(int) this.getLiverDiseaseValueRange().getMaximum()));
				return this.getLiverdiseasepresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getLiverdiseasepresenceabsencesimulatedresponse();
	}

	private int simulateLungCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setLungCancerValueRange(valuerange);
			this.setLungcancersimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setLungcancersimulatedresponse(
						this.getUtilities().randBetween((int) this.getLungCancerValueRange().getMinimum(),
								(int) this.getLungCancerValueRange().getMaximum()));
				return this.getLungcancerpresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getLungcancerpresenceabsencesimulatedresponse();
	}

	private int simulateLungDiseaseResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setLungDiseaseValueRange(valuerange);
			this.setLungdiseasepresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setLungdiseasepresenceabsencesimulatedresponse(
						this.getUtilities().randBetween((int) this.getLungDiseaseValueRange().getMinimum(),
								(int) this.getLungDiseaseValueRange().getMaximum()));
				return this.getLungdiseasepresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getLungdiseasepresenceabsencesimulatedresponse();
	}

	private int simulateOtherCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setOtherCancerValueRange(valuerange);
			this.setOthercancersimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setOthercancersimulatedresponse(
						this.getUtilities().randBetween((int) this.getOtherCancerValueRange().getMinimum(),
								(int) this.getOtherCancerValueRange().getMaximum()));
				return this.getOthercancersimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getOthercancersimulatedresponse();
	}

	private int simulateProstateCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setProstateCancerValueRange(valuerange);
			this.setProstatecancersimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setProstatecancersimulatedresponse(
						this.getUtilities().randBetween((int) this.getProstateCancerValueRange().getMinimum(),
								(int) this.getProstateCancerValueRange().getMaximum()));
				return this.getProstatecancersimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getProstatecancersimulatedresponse();
	}

	public void simulateResponseVariablesForFamilyMembers(int cohortSex) {
		try {
			this.simulateAlzheimersResponse(this.getAlzheimersValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateAsthmaResponse(this.getAsthmaValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateBipolarDisorderResponse(this.getBipolarDisorderValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateBreastCancerResponse(this.getBreastcancerValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateCholesterolResponse(this.getCholesterolValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateColonCancerResponse(this.getColonCancerValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateCoronaryArteryDiseaseResponse(this.getCoronaryArteryDiseaseValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateDepressionResponse(this.getDepressionValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateDiabetesResponse(this.getDiabetesValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateHypertensionResponse(this.getHypertensionValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateKidneyNoDialysisResponse(this.getKidneyNoDialysisValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateLiverDiseaseResponse(this.getLiverDiseaseValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateLungCancerResponse(this.getLungCancerValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateLungDiseaseResponse(this.getLungDiseaseValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateOtherCancerResponse(this.getOtherCancerValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateSkinCancerResponse(this.getSkinCancerValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateSchizophreniaResponse(this.getSchizophreniaValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			this.simulateProstateCancerResponse(this.getProstateCancerValueRange(),
					simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			if (cohortSex == 1) {
				this.simulateLungCancerResponse(this.getLungCancerValueRange(),
						simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getErrorResponse());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int simulateSkinCancerResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSkinCancerValueRange(valuerange);
			this.setSkincancersimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setSkincancersimulatedresponse(
						this.getUtilities().randBetween((int) this.getSkinCancerValueRange().getMinimum(),
								(int) this.getSkinCancerValueRange().getMaximum()));
				return this.getSkincancersimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSkincancersimulatedresponse();
	}

	private int simulateStrokeResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setStrokeValueRange(valuerange);
			this.setStrokepresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setStrokepresenceabsencesimulatedresponse(this.getUtilities().randBetween(
						(int) this.getStrokeValueRange().getMinimum(), (int) this.getStrokeValueRange().getMaximum()));
				return this.getStrokepresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getStrokepresenceabsencesimulatedresponse();
	}
	
	private int simulateSchizophreniaResponse(ValueRange valuerange, int simulatedresponse) {
		try {
			this.setSchizophreniaValueRange(valuerange);
			this.setSchizophreniapresenceabsencesimulatedresponse(simulatedresponse);
			if ((!this.getUniformdistribution()
					.generatenoiseinresponsevariables(this.getUtilities().randBetween(
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMintogenerateerrorval(),
							simulatedDiseasePresenceAbsenceResponseForFamilyMembers.getMaxtogenerateerrorval())))) {
				this.setSchizophreniapresenceabsencesimulatedresponse(this.getUtilities().randBetween(
						(int) this.getSchizophreniaValueRange().getMinimum(), (int) this.getSchizophreniaValueRange().getMaximum()));
				return this.getSchizophreniapresenceabsencesimulatedresponse();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return this.getSchizophreniapresenceabsencesimulatedresponse();
	}

	/**
	 * @return the schizophreniaValueRange
	 */
	public ValueRange getSchizophreniaValueRange() {
		try {
			return this.schizophreniaValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.schizophreniaValueRange;
	}

	/**
	 * @param schizophreniaValueRange the schizophreniaValueRange to set
	 */
	public void setSchizophreniaValueRange(ValueRange schizophreniaValueRange) {
		try {
			this.schizophreniaValueRange = schizophreniaValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the schizophreniapresenceabsencesimulatedresponse
	 */
	public int getSchizophreniapresenceabsencesimulatedresponse() {
		try {
			return this.schizophreniapresenceabsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.schizophreniapresenceabsencesimulatedresponse;
	}

	/**
	 * @param schizophreniapresenceabsencesimulatedresponse the schizophreniapresenceabsencesimulatedresponse to set
	 */
	public void setSchizophreniapresenceabsencesimulatedresponse(int schizophreniapresenceabsencesimulatedresponse) {
		try {
			this.schizophreniapresenceabsencesimulatedresponse = schizophreniapresenceabsencesimulatedresponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
