package simulatedDiseaseResponse;

import Diseases.AcuteSpinalCordInjury;
import Diseases.Alzheimers;
import Diseases.AmytrophicLateralSclerosis;
import Diseases.Asthma;
import Diseases.BenignProstaticHyperplasia;
import Diseases.Blindness;
import Diseases.BloodClots;
import Diseases.BreastCancer;
import Diseases.Cataract;
import Diseases.Cholesterol;
import Diseases.CirculatoryDiseaseOther;
import Diseases.ColonCancer;
import Diseases.CongestiveHeartFailure;
import Diseases.CoronaryArteryDisease;
import Diseases.Dementia;
import Diseases.Diabetes;
import Diseases.Epilepsy;
import Diseases.GIAcidReflux;
import Diseases.GICeliacDisease;
import Diseases.GICrohnsDisease;
import Diseases.GIDiseaseOther;
import Diseases.GIIrritableBowelSyndrome;
import Diseases.GIObstruction;
import Diseases.GIPolyp;
import Diseases.GIUlcer;
import Diseases.GIUlceritiveColitis;
import Diseases.Glaucoma;
import Diseases.HIV;
import Diseases.HearingLoss;
import Diseases.HeartAttack;
import Diseases.HepatitisC;
import Diseases.HighBloodPressureDisease;
import Diseases.Hypertension;
import Diseases.InfectiousDiseaseOther;
import Diseases.KidneyDialysis;
import Diseases.KidneyDiseaseAcute;
import Diseases.KidneyNoDialysis;
import Diseases.LiverDisease;
import Diseases.LossOfConsciousness;
import Diseases.LungCancer;
import Diseases.LungDisease;
import Diseases.MacularDegeneration;
import Diseases.MemoryLoss;
import Diseases.MentalHealthADHD;
import Diseases.MentalHealthAnxietyPanic;
import Diseases.MentalHealthBipolarDisorder;
import Diseases.MentalHealthDepression;
import Diseases.MentalHealthEatingDisorder;
import Diseases.MentalHealthOther;
import Diseases.MentalHealthPersonalityDisorder;
import Diseases.MentalHealthPostTraumaticStressDisorder;
import Diseases.MentalHealthSchizophrenia;
import Diseases.MentalHealthSocPh;
import Diseases.Migrane;
import Diseases.MultipleSclerosis;
import Diseases.NeuroStimulatoryDiseaseOther;
import Diseases.NeuroStimulatoryDiseaseTBI;
import Diseases.OsteopathicDiseaseOther;
import Diseases.OsteopathicDiseaseSkin;
import Diseases.OtherCancer;
import Diseases.ParkinsonsDisease;
import Diseases.ProstateCancer;
import Diseases.PulmonaryVascularDisease;
import Diseases.SkinCancer;
import Diseases.SkinMsArthritis;
import Diseases.SknMSGout;
import Diseases.SknMSOA;
import Diseases.SknMSOthr;
import Diseases.SknMsRA;
import Diseases.SleepApnea;
import Diseases.Stroke;
import Diseases.Thyroid;
import Diseases.Tinitus;
import Diseases.TransientIschemicAttack;
import Diseases.Tuberculosis;
import cohort.Cohort;

/**
 * @author Lalitha Viswanathan Affiliation: VABHS / MAVERIC
 *
 */
public class SimulatedDiseaseResponse {

	private AcuteSpinalCordInjury acutespinalcordinjury;
	private Alzheimers alzheimers;
	private AmytrophicLateralSclerosis amytrophiclateralsclerosis;
	private Asthma asthma;
	private Blindness blindness;
	private BloodClots bloodclots;
	private BenignProstaticHyperplasia BPH;
	private BreastCancer breastCancer;
	private OtherCancer cancerOther;
	private Cataract cataract;
	private Cholesterol cholesterol;
	private CirculatoryDiseaseOther circulatorydiseaseother;
	private ColonCancer colonCancer;
	private CongestiveHeartFailure congestiveheartfailure;
	private CoronaryArteryDisease coronaryarterydisease;
	private Dementia dementia;
	private Diabetes diabetes;
	private Epilepsy epilepsy;
	private GIAcidReflux giAcidReflux;
	private GICeliacDisease giCeliacDisease;
	private GICrohnsDisease giCrohnsDisease;
	private GIIrritableBowelSyndrome giIrritableBowelSyndrome;
	private GIObstruction giobstruction;
	private GIDiseaseOther giOtherDisease;
	private GIPolyp giPolyp;
	private GIUlcer giUlcer;
	private GIUlceritiveColitis giUlceritiveColitis;
	private Glaucoma glaucoma;
	private HearingLoss hearingLoss;
	private HeartAttack heartAttack;
	private HepatitisC hepatisisC;
	private HighBloodPressureDisease highBloodPressureDisease;
	private HIV hiv;
	private Hypertension hypertension;
	private InfectiousDiseaseOther IDOther;
	private KidneyDialysis kidneyDialysis;
	private KidneyDiseaseAcute kidneyDiseaseAcute;
	private KidneyNoDialysis kidneyNoDialysis;
	private LiverDisease liverDisease;
	private LossOfConsciousness lossofconsciousness;
	private LungCancer lungCancer;
	private LungDisease lungDisease;
	private MacularDegeneration maculardegeneration;
	private MemoryLoss memoryLoss;
	// Only presence / absence is recorded
	// Not year diagnosed or whether meds administered
	private MentalHealthADHD mentalhealthADHD;
	private MentalHealthAnxietyPanic mentalhealthAnxietyPanic;
	private MentalHealthBipolarDisorder mentalhealthBipolarDisorder;
	private MentalHealthDepression mentalhealthDepression;
	private MentalHealthEatingDisorder mentalhealthEatingDisorder;
	private MentalHealthOther mentalhealthother;
	private MentalHealthPersonalityDisorder mentalhealthpersonalitydisorder;
	private MentalHealthPostTraumaticStressDisorder mentalhealthptsd;
	private MentalHealthSchizophrenia mentalhealthschizophrenia;
	private MentalHealthSocPh mentalhealthsocph;
	private Migrane migrane;
	private MultipleSclerosis multiplesclerosis;
	private NeuroStimulatoryDiseaseOther neurostimulatorydiseaseother;
	private NeuroStimulatoryDiseaseTBI neurostimulatorydiseasetbi;
	private OsteopathicDiseaseOther osteopathicdiseaseother;
	private OsteopathicDiseaseSkin osteopathicdiseaseskin;
	private ParkinsonsDisease parkinsons;
	private ProstateCancer prostateCancer;
	private PulmonaryVascularDisease pulmonaryvasculardisease;
	private SkinCancer skinCancer;
	private SknMSGout skinMSGout;
	private SknMSOA skinMSOA;
	private SknMsRA skinMsRA;
	private SkinMsArthritis sknMSArthritis;
	private SknMSOthr sknMSOthr;
	private SleepApnea sleepApnea;
	private Stroke stroke;
	private Thyroid thyroid;
	private TransientIschemicAttack tia;
	private Tinitus tinitus;
	private Tuberculosis tuberculosis;

	public SimulatedDiseaseResponse(Cohort cohort) throws Exception {

		try {
			this.setAcuteSpinalCordInjury(new AcuteSpinalCordInjury(cohort));
			this.setAlzheimers(new Alzheimers(cohort));
			this.setAmytrophiclateralsclerosis(new AmytrophicLateralSclerosis(cohort));
			this.setArthritis(new SkinMsArthritis(cohort));
			this.setAsthma(new Asthma(cohort));
			this.setBPH(new BenignProstaticHyperplasia(cohort));
			this.setBlindness(new Blindness(cohort));
			this.setBloodclots(new BloodClots(cohort));
			this.setBreastCancer(new BreastCancer(cohort));
			this.setCataract(new Cataract(cohort));
			this.setCad(new CoronaryArteryDisease(cohort));
			this.setCholesterol(new Cholesterol(cohort));
			this.setCirculatorydiseaseother(new CirculatoryDiseaseOther(cohort));
			this.setColonCancer(new ColonCancer(cohort));
			this.setCongestiveheartfailure(new CongestiveHeartFailure(cohort));
			this.setCoronaryarterydisease(new CoronaryArteryDisease(cohort));
			this.setDementia(new Dementia(cohort));
			this.setEpilepsy(new Epilepsy(cohort));
			this.setGIAcidReflux(new GIAcidReflux(cohort));
			this.setGICeliacDisease(new GICeliacDisease(cohort));
			this.setGICrohnsDisease(new GICrohnsDisease(cohort));
			this.setGiOtherDisease(new GIDiseaseOther(cohort));
			this.setGiIrritableBowelSyndrome(new GIIrritableBowelSyndrome(cohort));
			this.setGIObstruction(new GIObstruction(cohort));
			this.setGiPolyp(new GIPolyp(cohort));
			this.setGiUlceritiveColitis(new GIUlceritiveColitis(cohort));
			this.setGiUlcer(new GIUlcer(cohort));
			this.setGlaucoma(new Glaucoma(cohort));
			this.setHearingLoss(new HearingLoss(cohort));
			this.setHeartAttack(new HeartAttack(cohort));
			this.setHepatisisC(new HepatitisC(cohort));
			this.setHiv(new HIV(cohort));
			this.setHighBloodPressureDisease(new HighBloodPressureDisease(cohort));
			this.setHypertension(new Hypertension(cohort));
			this.setIDOther(new InfectiousDiseaseOther(cohort));
			this.setKidneyDialysis(new KidneyDialysis(cohort));
			this.setKidneyDiseaseAcute(new KidneyDiseaseAcute(cohort));
			this.setKidneyNoDialysis(new KidneyNoDialysis(cohort));
			this.setLiverDisease(new LiverDisease(cohort));
			this.setLossofconsciousness(new LossOfConsciousness(cohort));
			this.setLungCancer(new LungCancer(cohort));
			this.setLungDisease(new LungDisease(cohort));
			this.setMaculardegeneration(new MacularDegeneration(cohort));
			this.setMemoryLoss(new MemoryLoss(cohort));
			this.setMentalhealthADHD(new MentalHealthADHD(cohort));
			this.setMentalhealthAnxietyPanic(new MentalHealthAnxietyPanic(cohort));
			this.setMentalhealthBipolarDisorder(new MentalHealthBipolarDisorder(cohort));
			this.setMentalhealthDepression(new MentalHealthDepression(cohort));
			this.setMentalhealthEatingDisorder(new MentalHealthEatingDisorder(cohort));
			this.setMentalhealthother(new MentalHealthOther(cohort));
			this.setMentalhealthpersonalitydisorder(new MentalHealthPersonalityDisorder(cohort));
			this.setMentalhealthptsd(new MentalHealthPostTraumaticStressDisorder(cohort));
			this.setMentalhealthschizophrenia(new MentalHealthSchizophrenia(cohort));
			this.setMentalhealthsocph(new MentalHealthSocPh(cohort));
			this.setMigrane(new Migrane(cohort));
			this.setNeurostimulatorydiseaseother(new NeuroStimulatoryDiseaseOther(cohort));
			this.setAcuteSpinalCordInjury(new AcuteSpinalCordInjury(cohort));
			this.setNSTBI(new NeuroStimulatoryDiseaseTBI(cohort));
			this.setOsteopathicdiseaseother(new OsteopathicDiseaseOther(cohort));
			this.setOsteopathicdiseaseskin(new OsteopathicDiseaseSkin(cohort));
			this.setCancerOther(new OtherCancer(cohort));
			this.setParkinsons(new ParkinsonsDisease(cohort));
			this.setProstateCancer(new ProstateCancer(cohort));
			this.setPulmonaryvasculardisease(new PulmonaryVascularDisease(cohort));
			this.setSkinCancer(new SkinCancer(cohort));
			this.setSkinMSGout(new SknMSGout(cohort));
			this.setSkinMSOA(new SknMSOA(cohort));
			this.setSkinMsRA(new SknMsRA(cohort));
			this.setSknMSOthr(new SknMSOthr(cohort));
			this.setSleepApnea(new SleepApnea(cohort));
			this.setStroke(new Stroke(cohort));
			this.setThyroid(new Thyroid(cohort));
			this.setTia(new TransientIschemicAttack(cohort));
			this.setTinitus(new Tinitus(cohort));
			this.setTuberculosis(new Tuberculosis(cohort));
			this.setMultiplesclerosis(new MultipleSclerosis(cohort));
			this.setDiabetes(new Diabetes(cohort));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	/**
	 * @return the nSSci
	 */
	public AcuteSpinalCordInjury getAcuteSpinalCordInjury() {
		try {
			return this.acutespinalcordinjury;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.acutespinalcordinjury;
	}

	/**
	 * @return the alzheimers
	 */
	public Alzheimers getAlzheimers() {
		try {
			return this.alzheimers;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.alzheimers;

	}

	/**
	 * @return the amytrophiclateralsclerosis
	 */
	public AmytrophicLateralSclerosis getAmytrophiclateralsclerosis() {
		try {
			return this.amytrophiclateralsclerosis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.amytrophiclateralsclerosis;

	}

	/**
	 * @return the arthritis
	 */
	public SkinMsArthritis getArthritis() {
		try {
			return this.sknMSArthritis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sknMSArthritis;

	}

	/**
	 * @return the asthma
	 */
	public Asthma getAsthma() {
		try {
			return this.asthma;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.asthma;

	}

	/**
	 * @return the blindness
	 */
	public Blindness getBlindness() {
		try {
			return this.blindness;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.blindness;

	}

	/**
	 * @return the bloodclots
	 */
	public BloodClots getBloodclots() {
		try {
			return this.bloodclots;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.bloodclots;

	}

	/**
	 * @return the bPH
	 */
	public BenignProstaticHyperplasia getBPH() {
		try {
			return this.BPH;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.BPH;

	}

	/**
	 * @return the breastCancer
	 */
	public BreastCancer getBreastCancer() {
		try {
			return this.breastCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.breastCancer;

	}

	/**
	 * @return the cad
	 */
	public CoronaryArteryDisease getCad() {
		try {
			return this.coronaryarterydisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.coronaryarterydisease;

	}

	/**
	 * @return the cataract
	 */
	public Cataract getCataract() {
		try {
			return this.cataract;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.cataract;

	}

	/**
	 * @return the chf
	 */
	public CongestiveHeartFailure getChf() {
		try {
			return this.congestiveheartfailure;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.congestiveheartfailure;

	}

	/**
	 * @return the cholesterol
	 */
	public Cholesterol getCholesterol() {
		try {
			return this.cholesterol;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.cholesterol;

	}

	/**
	 * @return the circulatorydiseaseother
	 */
	public CirculatoryDiseaseOther getCirculatorydiseaseother() {
		try {
			return this.circulatorydiseaseother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.circulatorydiseaseother;

	}

	/**
	 * @return the colonCancer
	 */
	public ColonCancer getColonCancer() throws Exception {
		try {
			return this.colonCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.colonCancer;

	}

	/**
	 * @return the congestiveheartfailure
	 */
	public CongestiveHeartFailure getCongestiveheartfailure() {
		try {
			return this.congestiveheartfailure;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.congestiveheartfailure;

	}

	/**
	 * @return the coronaryarterydisease
	 */
	public CoronaryArteryDisease getCoronaryarterydisease() {
		try {
			return this.coronaryarterydisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.coronaryarterydisease;

	}

	/**
	 * @return the dementia
	 */
	public Dementia getDementia() {
		try {
			return this.dementia;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.dementia;

	}

	/**
	 * @return the diabetes
	 */
	public Diabetes getDiabetes() {
		try {
			return this.diabetes;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.diabetes;

	}

	/**
	 * @return the epilepsy
	 */
	public Epilepsy getEpilepsy() {
		try {
			return this.epilepsy;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.epilepsy;

	}

	/**
	 * @return the giAcidReflux
	 */
	public GIAcidReflux getGiAcidReflux() {
		try {
			return this.giAcidReflux;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.giAcidReflux;

	}

	/**
	 * @return the giCeliacDisease
	 */
	public GICeliacDisease getGiCeliacDisease() {
		try {
			return this.giCeliacDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.giCeliacDisease;

	}

	/**
	 * @return the giCrohnsDisease
	 */
	public GICrohnsDisease getGiCrohnsDisease() {
		try {
			return this.giCrohnsDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.giCrohnsDisease;

	}

	/**
	 * @return the giIrritableBowelSyndrome
	 */
	public GIIrritableBowelSyndrome getGiIrritableBowelSyndrome() {
		try {
			return this.giIrritableBowelSyndrome;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.giIrritableBowelSyndrome;

	}

	/**
	 * @return the giobstruction
	 */
	public GIObstruction getGiobstruction() {
		return this.giobstruction;
	}

	/**
	 * @return the giOtherDisease
	 */
	public GIDiseaseOther getGiOtherDisease() {
		try {
			return this.giOtherDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.giOtherDisease;

	}

	/**
	 * @return the giPolyp
	 */
	public GIPolyp getGiPolyp() {
		try {
			return this.giPolyp;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.giPolyp;

	}

	/**
	 * @return the giUlcer
	 */
	public GIUlcer getGiUlcer() {
		try {
			return this.giUlcer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.giUlcer;

	}

	/**
	 * @return the giUlceritiveColitis
	 */
	public GIUlceritiveColitis getGiUlceritiveColitis() {
		try {
			return this.giUlceritiveColitis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.giUlceritiveColitis;

	}

	/**
	 * @return the glaucoma
	 */
	public Glaucoma getGlaucoma() {
		try {
			return this.glaucoma;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.glaucoma;

	}

	/**
	 * @return the hearingLoss
	 */
	public HearingLoss getHearingLoss() {
		try {
			return this.hearingLoss;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.hearingLoss;

	}

	/**
	 * @return the heartAttack
	 */
	public HeartAttack getHeartAttack() {
		try {
			return this.heartAttack;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.heartAttack;

	}

	/**
	 * @return the hepatisisC
	 */
	public HepatitisC getHepatisisC() {
		try {
			return this.hepatisisC;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.hepatisisC;

	}

	/**
	 * @return the highBloodPressureDisease
	 */
	public HighBloodPressureDisease getHighBloodPressureDisease() throws Exception {
		try {
			return this.highBloodPressureDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.highBloodPressureDisease;
	}

	/**
	 * @return the hiv
	 */
	public HIV getHiv() {
		try {
			return this.hiv;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.hiv;

	}

	/**
	 * @return the cohortHypertension
	 */
	public Hypertension getHypertension() throws Exception {
		try {
			return this.hypertension;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.hypertension;

	}

	/**
	 * @return the iDOther
	 */
	public InfectiousDiseaseOther getIDOther() {
		try {
			return this.IDOther;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.IDOther;

	}

	/**
	 * @return the kidneyDialysis
	 */
	public KidneyDialysis getKidneyDialysis() {
		try {
			return this.kidneyDialysis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.kidneyDialysis;

	}

	/**
	 * @return the kidneyDiseaseAcute
	 */
	public KidneyDiseaseAcute getKidneyDiseaseAcute() {
		try {
			return this.kidneyDiseaseAcute;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.kidneyDiseaseAcute;

	}

	/**
	 * @return the kidneyNoDialysis
	 */
	public KidneyNoDialysis getKidneyNoDialysis() {
		try {
			return this.kidneyNoDialysis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.kidneyNoDialysis;

	}

	/**
	 * @return the liverDisease
	 */
	public LiverDisease getLiverDisease() {
		try {
			return this.liverDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.liverDisease;

	}

	/**
	 * @return the lossofconsciousness
	 */
	public LossOfConsciousness getLossofconsciousness() {
		try {
			return this.lossofconsciousness;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.lossofconsciousness;

	}

	/**
	 * @return the lungCancer
	 */
	public LungCancer getLungCancer() {
		try {
			return this.lungCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.lungCancer;

	}

	/**
	 * @return the lungDisease
	 */
	public LungDisease getLungDisease() {
		try {
			return this.lungDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.lungDisease;

	}

	/**
	 * @return the maculardegeneration
	 */
	public MacularDegeneration getMaculardegeneration() {
		try {
			return this.maculardegeneration;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.maculardegeneration;

	}

	/**
	 * @return the memoryLoss
	 */
	public MemoryLoss getMemoryLoss() {
		try {
			return this.memoryLoss;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.memoryLoss;

	}

	/**
	 * @return the mentalhealthADHD
	 */
	public MentalHealthADHD getMentalhealthADHD() {
		try {
			return this.mentalhealthADHD;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.mentalhealthADHD;
	}

	/**
	 * @return the mentalhealthAnxietyPanic
	 */
	public MentalHealthAnxietyPanic getMentalhealthAnxietyPanic() {
		try {
			return this.mentalhealthAnxietyPanic;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.mentalhealthAnxietyPanic;
	}

	/**
	 * @return the mentalhealthBipolarDisorder
	 */
	public MentalHealthBipolarDisorder getMentalhealthBipolarDisorder() {
		try {
			return this.mentalhealthBipolarDisorder;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.mentalhealthBipolarDisorder;
	}

	/**
	 * @return the mentalhealthDepression
	 */
	public MentalHealthDepression getMentalhealthDepression() {
		try {
			return this.mentalhealthDepression;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.mentalhealthDepression;

	}

	/**
	 * @return the mentalhealthEatingDisorder
	 */
	public MentalHealthEatingDisorder getMentalhealthEatingDisorder() {
		try {
			return this.mentalhealthEatingDisorder;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.mentalhealthEatingDisorder;

	}

	/**
	 * @return the mentalhealthother
	 */
	public MentalHealthOther getMentalhealthother() {
		try {
			return this.mentalhealthother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.mentalhealthother;

	}

	/**
	 * @return the mentalhealthpersonalitydisorder
	 */
	public MentalHealthPersonalityDisorder getMentalhealthpersonalitydisorder() {
		try {
			return this.mentalhealthpersonalitydisorder;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.mentalhealthpersonalitydisorder;

	}

	/**
	 * @return the mentalhealthptsd
	 */
	public MentalHealthPostTraumaticStressDisorder getMentalhealthptsd() {
		try {
			return this.mentalhealthptsd;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.mentalhealthptsd;

	}

	/**
	 * @return the mentalhealthschizophrenia
	 */
	public MentalHealthSchizophrenia getMentalhealthschizophrenia() {
		try {
			return this.mentalhealthschizophrenia;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.mentalhealthschizophrenia;

	}

	/**
	 * @return the mentalhealthsocph
	 */
	public MentalHealthSocPh getMentalhealthsocph() {
		try {
			return this.mentalhealthsocph;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.mentalhealthsocph;

	}

	/**
	 * @return the migrane
	 */
	public Migrane getMigrane() {
		try {
			return this.migrane;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.migrane;

	}

	/**
	 * @return the multiplesclerosis
	 */
	public MultipleSclerosis getMultiplesclerosis() {
		return this.multiplesclerosis;
	}

	/**
	 * @return the nSDOth
	 */
	public NeuroStimulatoryDiseaseOther getNeurostimulatorydiseaseother() {
		try {
			return this.neurostimulatorydiseaseother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.neurostimulatorydiseaseother;

	}

	/**
	 * @return the neurostimulatorydiseasetbi
	 */
	public NeuroStimulatoryDiseaseTBI getNeurostimulatorydiseasetbi() {
		return this.neurostimulatorydiseasetbi;
	}

	/**
	 * @return the osteopathicdiseaseother
	 */
	public OsteopathicDiseaseOther getOsteopathicdiseaseother() {
		try {
			return this.osteopathicdiseaseother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.osteopathicdiseaseother;

	}

	/**
	 * @return the osteopathicdiseaseskin
	 */
	public OsteopathicDiseaseSkin getOsteopathicdiseaseskin() {
		try {
			return this.osteopathicdiseaseskin;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.osteopathicdiseaseskin;

	}

	/**
	 * @return the cancerOther
	 */
	public OtherCancer getOtherCancer() throws Exception {
		try {
			return this.cancerOther;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.cancerOther;
	}

	/**
	 * @return the parkinsons
	 */
	public ParkinsonsDisease getParkinsons() {
		try {
			return this.parkinsons;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.parkinsons;

	}

	/**
	 * @return the prostateCancer
	 */
	public ProstateCancer getProstateCancer() {
		try {
			return this.prostateCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.prostateCancer;

	}

	/**
	 * @return the pulmonaryvasculardisease
	 */
	public PulmonaryVascularDisease getPulmonaryvasculardisease() {
		try {
			return this.pulmonaryvasculardisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.pulmonaryvasculardisease;

	}

	/**
	 * @return the skinCancer
	 */
	public SkinCancer getSkinCancer() {
		try {
			return this.skinCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.skinCancer;

	}

	/**
	 * @return the skinMSGout
	 */
	public SknMSGout getSkinMSGout() {
		try {
			return this.skinMSGout;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.skinMSGout;

	}

	/**
	 * @return the skinMSOA
	 */
	public SknMSOA getSkinMSOA() {
		try {
			return this.skinMSOA;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.skinMSOA;

	}

	/**
	 * @return the skinMsRA
	 */
	public SknMsRA getSkinMsRA() {
		try {
			return this.skinMsRA;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.skinMsRA;

	}

	/**
	 * @return the sknMSOthr
	 */
	public SknMSOthr getSknMSOthr() {
		try {
			return this.sknMSOthr;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sknMSOthr;

	}

	/**
	 * @return the sleepApnea
	 */
	public SleepApnea getSleepApnea() {
		try {
			return this.sleepApnea;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sleepApnea;

	}

	/**
	 * @return the stroke
	 */
	public Stroke getStroke() throws Exception {
		try {
			return this.stroke;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.stroke;

	}

	/**
	 * @return the thyroid
	 */
	public Thyroid getThyroid() {
		try {
			return this.thyroid;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.thyroid;

	}

	/**
	 * @return the tia
	 */
	public TransientIschemicAttack getTia() {
		try {
			return this.tia;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.tia;

	}

	/**
	 * @return the tinitus
	 */
	public Tinitus getTinitus() {
		try {
			return this.tinitus;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.tinitus;

	}

	/**
	 * @return the tuberculosis
	 */
	public Tuberculosis getTuberculosis() {
		try {
			return this.tuberculosis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.tuberculosis;

	}

	/**
	 * @param nSSci the nSSci to set
	 */
	private void setAcuteSpinalCordInjury(AcuteSpinalCordInjury acutespinalcordinjury) {
		try {
			this.acutespinalcordinjury = acutespinalcordinjury;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param alzheimers the alzheimers to set
	 */
	private void setAlzheimers(Alzheimers alzheimers) {
		try {
			this.alzheimers = alzheimers;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param amytrophiclateralsclerosis the amytrophiclateralsclerosis to set
	 */
	private void setAmytrophiclateralsclerosis(AmytrophicLateralSclerosis als) {
		try {
			this.amytrophiclateralsclerosis = als;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param arthritis the arthritis to set
	 */
	private void setArthritis(SkinMsArthritis arthritis) {
		try {
			this.sknMSArthritis = arthritis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param asthma the asthma to set
	 */
	private void setAsthma(Asthma asthma) {
		try {
			this.asthma = asthma;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param blindness the blindness to set
	 */
	private void setBlindness(Blindness blindness) {
		try {
			this.blindness = blindness;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param bloodclots the bloodclots to set
	 */
	private void setBloodclots(BloodClots bloodclots) {
		try {
			this.bloodclots = bloodclots;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param bPH the bPH to set
	 */
	private void setBPH(BenignProstaticHyperplasia bPH) {
		try {
			this.BPH = bPH;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param breastCancer the breastCancer to set
	 */
	private void setBreastCancer(BreastCancer breastCancer) {
		try {
			this.breastCancer = breastCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param cad the cad to set
	 */
	private void setCad(CoronaryArteryDisease cad) {
		this.coronaryarterydisease = cad;
	}

	/**
	 * @param cancerOther the cancerOther to set
	 */
	private void setCancerOther(OtherCancer cancerOther) {
		this.cancerOther = cancerOther;
	}

	/**
	 * @param cataract the cataract to set
	 */
	private void setCataract(Cataract cataract) {
		try {
			this.cataract = cataract;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param cohortCholesterol the cohortCholesterol to set
	 */
	private void setCholesterol(Cholesterol cholesterol) throws Exception {
		try {
			this.cholesterol = cholesterol;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param circulatorydiseaseother the circulatorydiseaseother to set
	 */
	private void setCirculatorydiseaseother(CirculatoryDiseaseOther circulatorydiseaseother) {
		try {
			this.circulatorydiseaseother = circulatorydiseaseother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param colonCancer the colonCancer to set
	 */
	private void setColonCancer(ColonCancer cohortColonCancer) throws Exception {
		try {
			this.colonCancer = cohortColonCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param congestiveheartfailure the congestiveheartfailure to set
	 */
	private void setCongestiveheartfailure(CongestiveHeartFailure congestiveheartfailure) {
		try {
			this.congestiveheartfailure = congestiveheartfailure;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param coronaryarterydisease the coronaryarterydisease to set
	 */
	private void setCoronaryarterydisease(CoronaryArteryDisease coronaryarterydisease) {
		try {
			this.coronaryarterydisease = coronaryarterydisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param dementia the dementia to set
	 */
	private void setDementia(Dementia dementia) {
		try {
			this.dementia = dementia;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param diabetes the diabetes to set
	 */
	private void setDiabetes(Diabetes diabetes) {
		this.diabetes = diabetes;
	}

	/**
	 * @param epilepsy the epilepsy to set
	 */
	private void setEpilepsy(Epilepsy epilepsy) {
		try {
			this.epilepsy = epilepsy;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param giAcidReflux the giAcidReflux to set
	 */
	private void setGIAcidReflux(GIAcidReflux giacidreflux) {
		try {
			this.giAcidReflux = giacidreflux;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param giCeliacDisease the giCeliacDisease to set
	 */
	private void setGICeliacDisease(GICeliacDisease giCeliacDisease) {
		try {
			this.giCeliacDisease = giCeliacDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param giCrohnsDisease the giCrohnsDisease to set
	 */
	private void setGICrohnsDisease(GICrohnsDisease giCrohnsDisease) {
		try {
			this.giCrohnsDisease = giCrohnsDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param giIrritableBowelSyndrome the giIrritableBowelSyndrome to set
	 */
	private void setGiIrritableBowelSyndrome(GIIrritableBowelSyndrome giibs) {
		try {
			this.giIrritableBowelSyndrome = giibs;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param giobstruction the giobstruction to set
	 */
	private void setGIObstruction(GIObstruction giobstruction) {
		try {
			this.giobstruction = giobstruction;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param giOtherDisease the giOtherDisease to set
	 */
	private void setGiOtherDisease(GIDiseaseOther giOtherDisease) {
		this.giOtherDisease = giOtherDisease;
	}

	/**
	 * @param giPolyp the giPolyp to set
	 */
	private void setGiPolyp(GIPolyp giPolyp) {
		this.giPolyp = giPolyp;
	}

	/**
	 * @param giUlcer the giUlcer to set
	 */
	private void setGiUlcer(GIUlcer giulcer) {
		try {
			this.giUlcer = giulcer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param giUlceritiveColitis the giUlceritiveColitis to set
	 */
	private void setGiUlceritiveColitis(GIUlceritiveColitis giuc) {
		try {
			this.giUlceritiveColitis = giuc;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param glaucoma the glaucoma to set
	 */
	private void setGlaucoma(Glaucoma glaucoma) {
		try {
			this.glaucoma = glaucoma;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param hearingLoss the hearingLoss to set
	 */
	private void setHearingLoss(HearingLoss hearingloss) {
		try {
			this.hearingLoss = hearingloss;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param heartAttack the heartAttack to set
	 */
	private void setHeartAttack(HeartAttack heartAttack) {
		try {
			this.heartAttack = heartAttack;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param hepatisisC the hepatisisC to set
	 */
	private void setHepatisisC(HepatitisC hepatisisC) {
		try {
			this.hepatisisC = hepatisisC;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param highBloodPressureDisease the highBloodPressureDisease to set
	 */
	private void setHighBloodPressureDisease(HighBloodPressureDisease cohortHBPD) throws Exception {
		try {
			this.highBloodPressureDisease = cohortHBPD;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param hiv the hiv to set
	 */
	private void setHiv(HIV hiv) {
		try {
			this.hiv = hiv;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param cohortHypertension the cohortHypertension to set
	 */
	private void setHypertension(Hypertension hypertension) throws Exception {
		try {
			this.hypertension = hypertension;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param iDOther the iDOther to set
	 */
	private void setIDOther(InfectiousDiseaseOther iDOther) {
		try {
			this.IDOther = iDOther;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param kidneyDialysis the kidneyDialysis to set
	 */
	private void setKidneyDialysis(KidneyDialysis kidneydialysis) {
		try {
			this.kidneyDialysis = kidneydialysis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param kidneyDiseaseAcute the kidneyDiseaseAcute to set
	 */
	private void setKidneyDiseaseAcute(KidneyDiseaseAcute kidneydiseaseacute) {
		try {
			this.kidneyDiseaseAcute = kidneydiseaseacute;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param kidneyNoDialysis the kidneyNoDialysis to set
	 */
	private void setKidneyNoDialysis(KidneyNoDialysis kidneynodialysis) {
		try {
			this.kidneyNoDialysis = kidneynodialysis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param liverDisease the liverDisease to set
	 */
	private void setLiverDisease(LiverDisease liverDisease) {
		try {
			this.liverDisease = liverDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param lossofconsciousness the lossofconsciousness to set
	 */
	private void setLossofconsciousness(LossOfConsciousness lossofconsciousness) {
		try {
			this.lossofconsciousness = lossofconsciousness;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * For siblings asthma presence / absence Alzheimers presence / absence Bipolar
	 * disorder presence / absence Breast cancer presence / absence Colon cancer
	 * presence / absence Lung Cancer presence / absence Prostate Cancer presence /
	 * absence (interrelated with gender of SimulatedDiseaseResponse) Skin Cancer
	 * presence / absence Other Cancer presence / absence Depression presence /
	 * absence DoDM presence / absence Hypertension presence / absence Cholesterol
	 * presence / absence Kidney Disease presence / absence Liver disease presence /
	 * absence Stroke presence / absence generate response for each of above
	 * varables and assign to one of 8 randomly generated siblings
	 */

	// Which sibling

	/**
	 * @param lungCancer the lungCancer to set
	 */
	private void setLungCancer(LungCancer lungCancer) {
		try {
			this.lungCancer = lungCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param lungDisease the lungDisease to set
	 */
	private void setLungDisease(LungDisease lungDisease) {
		try {
			this.lungDisease = lungDisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param maculardegeneration the maculardegeneration to set
	 */
	private void setMaculardegeneration(MacularDegeneration maculardegeneration) {
		try {
			this.maculardegeneration = maculardegeneration;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param memoryLoss the memoryLoss to set
	 */
	private void setMemoryLoss(MemoryLoss memoryLoss) {
		try {
			this.memoryLoss = memoryLoss;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mentalhealthADHD the mentalhealthADHD to set
	 */
	private void setMentalhealthADHD(MentalHealthADHD mentalhealthADHD) {
		try {
			this.mentalhealthADHD = mentalhealthADHD;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mentalhealthAnxietyPanic the mentalhealthAnxietyPanic to set
	 */
	private void setMentalhealthAnxietyPanic(MentalHealthAnxietyPanic mentalhealthanxietypanic) {
		try {
			this.mentalhealthAnxietyPanic = mentalhealthanxietypanic;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mentalhealthBipolarDisorder the mentalhealthBipolarDisorder to set
	 */
	private void setMentalhealthBipolarDisorder(MentalHealthBipolarDisorder mentalhealthbipolardisorder) {
		try {
			this.mentalhealthBipolarDisorder = mentalhealthbipolardisorder;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mentalhealthDepression the mentalhealthDepression to set
	 */
	private void setMentalhealthDepression(MentalHealthDepression mentalhealthdepression) {
		try {
			this.mentalhealthDepression = mentalhealthdepression;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mentalhealthEatingDisorder the mentalhealthEatingDisorder to set
	 */
	private void setMentalhealthEatingDisorder(MentalHealthEatingDisorder mentalhealtheatingdisorder) {
		try {
			this.mentalhealthEatingDisorder = mentalhealtheatingdisorder;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mentalhealthother the mentalhealthother to set
	 */
	private void setMentalhealthother(MentalHealthOther mentalhealthother) {
		try {
			this.mentalhealthother = mentalhealthother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mentalhealthpersonalitydisorder the mentalhealthpersonalitydisorder to
	 *                                        set
	 */
	private void setMentalhealthpersonalitydisorder(MentalHealthPersonalityDisorder mentalhealthpersonalitydisorder) {
		try {
			this.mentalhealthpersonalitydisorder = mentalhealthpersonalitydisorder;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mentalhealthptsd the mentalhealthptsd to set
	 */
	private void setMentalhealthptsd(MentalHealthPostTraumaticStressDisorder mentalhealthptsd) {
		try {
			this.mentalhealthptsd = mentalhealthptsd;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mentalhealthschizophrenia the mentalhealthschizophrenia to set
	 */
	private void setMentalhealthschizophrenia(MentalHealthSchizophrenia mentalhealthschizophrenia) {
		try {
			this.mentalhealthschizophrenia = mentalhealthschizophrenia;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mentalhealthsocph the mentalhealthsocph to set
	 */
	private void setMentalhealthsocph(MentalHealthSocPh mentalhealthsocph) {
		try {
			this.mentalhealthsocph = mentalhealthsocph;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param migrane the migrane to set
	 */
	private void setMigrane(Migrane migrane) {
		try {
			this.migrane = migrane;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param multiplesclerosis the multiplesclerosis to set
	 */
	private void setMultiplesclerosis(MultipleSclerosis multiplesclerosis) {
		this.multiplesclerosis = multiplesclerosis;
	}

	/**
	 * @param neurostimulatorydiseaseother the neurostimulatorydiseaseother to set
	 */
	private void setNeurostimulatorydiseaseother(NeuroStimulatoryDiseaseOther neurostimulatorydiseaseother) {
		this.neurostimulatorydiseaseother = neurostimulatorydiseaseother;
	}

	/**
	 * @param nSTBI the nSTBI to set
	 */
	private void setNSTBI(NeuroStimulatoryDiseaseTBI neurostimulatorydiseasetbi) {
		try {
			this.neurostimulatorydiseasetbi = neurostimulatorydiseasetbi;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param osteopathicdiseaseother the osteopathicdiseaseother to set
	 */
	private void setOsteopathicdiseaseother(OsteopathicDiseaseOther osteopathicdiseaseother) {
		try {
			this.osteopathicdiseaseother = osteopathicdiseaseother;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param osteopathicdiseaseskin the osteopathicdiseaseskin to set
	 */
	private void setOsteopathicdiseaseskin(OsteopathicDiseaseSkin osteopathicdiseaseskin) {
		try {
			this.osteopathicdiseaseskin = osteopathicdiseaseskin;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param parkinsons the parkinsons to set
	 */
	private void setParkinsons(ParkinsonsDisease parkinsons) {
		try {
			this.parkinsons = parkinsons;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param prostateCancer the prostateCancer to set
	 */
	private void setProstateCancer(ProstateCancer prostateCancer) {
		try {
			this.prostateCancer = prostateCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param pulmonaryvasculardisease the pulmonaryvasculardisease to set
	 */
	private void setPulmonaryvasculardisease(PulmonaryVascularDisease pulmonaryvasculardisease) {
		try {
			this.pulmonaryvasculardisease = pulmonaryvasculardisease;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param skinCancer the skinCancer to set
	 */
	private void setSkinCancer(SkinCancer skinCancer) {
		try {
			this.skinCancer = skinCancer;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param skinMSGout the skinMSGout to set
	 */
	private void setSkinMSGout(SknMSGout skinMSGout) {
		try {
			this.skinMSGout = skinMSGout;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param skinMSOA the skinMSOA to set
	 */
	private void setSkinMSOA(SknMSOA skinMSOA) {
		try {
			this.skinMSOA = skinMSOA;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param skinMsRA the skinMsRA to set
	 */
	private void setSkinMsRA(SknMsRA skinMsRA) {
		try {
			this.skinMsRA = skinMsRA;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sknMSOthr the sknMSOthr to set
	 */
	private void setSknMSOthr(SknMSOthr sknMSOthr) {
		try {
			this.sknMSOthr = sknMSOthr;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sleepApnea the sleepApnea to set
	 */
	private void setSleepApnea(SleepApnea sleepApnea) {
		try {
			this.sleepApnea = sleepApnea;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param stroke the stroke to set
	 */
	private void setStroke(Stroke cohortStroke) throws Exception {
		try {
			this.stroke = cohortStroke;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param thyroid the thyroid to set
	 */
	private void setThyroid(Thyroid thyroid) {
		try {
			this.thyroid = thyroid;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param tia the tia to set
	 */
	private void setTia(TransientIschemicAttack tia) {
		try {
			this.tia = tia;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param tinitus the tinitus to set
	 */
	private void setTinitus(Tinitus tinitus) {
		try {
			this.tinitus = tinitus;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param tuberculosis the tuberculosis to set
	 */
	private void setTuberculosis(Tuberculosis tuberculosis) {
		try {
			this.tuberculosis = tuberculosis;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
