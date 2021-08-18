package simulatedResponseVAUseVars;

import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Timestamp;
import java.time.temporal.ValueRange;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.sql.rowset.serial.SerialBlob;
import Utilities.Utilities;
import randomizer.UniformDistribution;

/**
 * @author visu4
 *
 */
// Store 495 simulated responses
// Utilities to write out to file
// Number of cohorts = 1M
public class SimulatedResponseVAUseVars {

	/**
	 * @author visu4
	 *
	 */
	public class VAUseResponses {

		/**
		*
		*/
		private Date _LoadDate_DefaultSimulatedValue;
		/**
		*
		*/
		private boolean _RecordStatus_DefaultSimulatedValue;
		/**
		*
		*/
		private long _VersionNumber_DefaultSimulatedValue;
		// default empty
		/**
		*
		*/
		private SerialBlob completedFormDefaultSimulatedValue;
		// default empty
		/**
		*
		*/
		private String CSIDDefaultSimulatedResponse;
		/**
		 *
		 */
		private boolean editStatusDefaultSimulatedValue;
		
		private boolean formcompletionstatusDefaultSimulatedValue;
		/**
		 *
		 */
		private File form_IdDefaultSimulatedValue;
		/**
		 *
		 */
		private boolean formDuplicationStatusDefaultSimulatedValue;
		/**
		 *
		 */
		private Date formScanDateDefaultSimulatedValue;
		/**
		*
		*/
		private int helpCompletingFormsimulatedresponse;
		// tbd
		/**
		*
		*/
		private ValueRange helpCompletingFormValueRange;
		// tbd
		// default empty
		/**
		*
		*/
		private BufferedImage imageFileDefaultSimulatedValue;
		// default empty
		/**
		*
		*/
		private int mailCodeDefaultSimulatedValue;
		// 5 non-VAHS drop off sites
		/**
		*
		*/
		private ValueRange nonVAHospResponseDropffSiteValueRange;
		/**
		 *
		 */
		private int nonVAHospResponseDropOffSitesimulatedresponse;
		/**
		 *
		 */
		private int nonVANonRxsimulatedresponse;
		// Interventions other than Rx at non-VA sites
		/**
		*
		*/
		private ValueRange nonVANonRxValueRange;
		/**
		 *
		 */
		private int nonVARxsimulatedresponse;
		/**
		 *
		 */
		private ValueRange nonVARxValueRange;
		/**
		 *
		 */
		private int num_Complete_SecFDefaultSimulatedResponse;
		/**
		 *
		 */
		private int num_Complete_SecGDefaultSimulatedResponse;
		/**
		 *
		 */
		private int numQ_Complete_SecADefaultSimulatedResponse;
		/**
		 *
		 */
		private int numQ_Complete_SecBDefaultSimulatedResponse;
		/**
		 *
		 */
		private int numQ_Complete_SecCDefaultSimulatedResponse;
		/**
		 *
		 */
		private int numQ_Complete_SecDDefaultSimulatedResponse;
		/**
		 *
		 */
		private int numQ_Complete_SecEDefaultSimulatedResponse;
		/**
		 *
		 */
		private int numQ_CompleteDefaultSimulatedResponse;
		// default empty
		/**
		 *
		 */
		private File output_FilenameDefaultSimulatedValue;
		// default empty
		/**
		*
		*/
		private Timestamp timestampFormCompletionDefaultSimulatedValue;
		/**
		 *
		 */
		private UniformDistribution uniformDistribution;
		/**
		 *
		 */
		private Utilities utilities;
		/**
		 *
		 */
		private int VAHospResponseDropoffSitesimulatedresponse;
		// 5 VA drop off sites
		/**
		*
		*/
		private ValueRange VAHospResponseDropoffSiteValueRange;
		/**
		 *
		 */
		private int VANonRxsimulatedresponse;
		// Interventions other than prescriptions at the VA
		/**
		*
		*/
		private ValueRange VANonRxValueRange;
		/**
		 *
		 */
		private int VARxsimulatedresponse;
		/**
		 *
		 */
		private ValueRange VARxValueRange;
		/**
		 *
		 */
		private ValueRange VAUseValueRange;
		
		private int VAUseSimulatedResponse;

		/**
		 *
		 */

		protected VAUseResponses() {

			this.setUtilities(new Utilities());
			this.setHelpCompletingFormValueRange(SimulatedResponseVAUseVars.getHelpcompletionvaluerange());
			this.setHelpCompletingFormsimulatedresponse(-10);
			this.setImageFileDefaultSimulatedValue(SimulatedResponseVAUseVars.getImagefile());
			this.setFormcompletionstatusDefaultSimulatedValue(SimulatedResponseVAUseVars.isDefaultformcompletionstatus());
			this.setUniformDistribution(new UniformDistribution(SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(),
					SimulatedResponseVAUseVars.getMaxtogenerateerrorval()));
			this.setVAUseValueRange(SimulatedResponseVAUseVars.getVausevalsvaluerange());
			// 5 VA drop off sites
			this.setVAHospResponseDropoffSite(SimulatedResponseVAUseVars.getVahospdropoffsitevaluerange());
			// 5 non-VAHS drop off sites
			this.setNonVAHospResponseDropOffSiteValueRange(
					SimulatedResponseVAUseVars.getNonvahospdropoffsitevaluerange());
			this.setNonVARx(SimulatedResponseVAUseVars.getNonVARxValueRangeDefaultVals());
			this.setNonVARxsimulatedresponse(SimulatedResponseVAUseVars.getUtilitiesstaticinstance().randBetween
					((int)SimulatedResponseVAUseVars.getNonVARxValueRangeDefaultVals().getMinimum(), 
							(int)SimulatedResponseVAUseVars.getNonVARxValueRangeDefaultVals().getMaximum()));
			this.setVARx(SimulatedResponseVAUseVars.getVarxvaluerange());
			// Interventions other than prescriptions at the VA
			this.setVANonRx(SimulatedResponseVAUseVars.getNonVARxValueRangeDefaultVals());
			// Interventions other than Rx at non-VA sites
			this.setNonVANonRx(SimulatedResponseVAUseVars.getNonvanonrxvaluerange());
			//this.setNonVANonRxsimulatedresponse();
			// default empty
			// to be changed
			// Properties file / class
			this.setOutput_FilenameDefaultSimulatedValue(SimulatedResponseVAUseVars.getDefaultOutputFile());
			// default empty
			this.setTimestampFormCompletionDefaultSimulatedValue(SimulatedResponseVAUseVars.getTimestamp());
			// default empty
			this.setImageFileDefaultSimulatedValue(SimulatedResponseVAUseVars.getImagefile());
			// default empty
			this.setCSIDDefaultSimulatedResponse(SimulatedResponseVAUseVars.getCSIDDefaultResponse());
			// Set to default of now
			this.setFormScanDateDefaultSimulatedValue(SimulatedResponseVAUseVars.getDefaultFormScanDate());
			// set to 00000 (from Properties)
			this.setForm_IdDefaultSimulatedValue(SimulatedResponseVAUseVars.getDefaultformid());
			// default empty
			this.setCompletedFormDefaultSimulatedValue(SimulatedResponseVAUseVars.getDefaultformobject());
			// default empty
			//
			this.setMailCodeDefaultSimulatedValue(SimulatedResponseVAUseVars.getDefaultmailcode());
			this.setNum_Complete(SimulatedResponseVAUseVars.getDefaultnumcomplete());
			String Num_Complete = null;
			// set to random value (whether duplicate form submission or not)
			this.setFormDuplicationStatusDefaultSimulatedValue(
					SimulatedResponseVAUseVars.getDefaultformduplicationstatus());
			this.setEditStatusDefaultSimulatedValue(SimulatedResponseVAUseVars.getDefaultformEditStatus());
			this.setNumQ_Complete_SecADefaultSimulatedResponse(SimulatedResponseVAUseVars.getDefaultNumCompletedA());
			this.setNumQ_Complete_SecBDefaultSimulatedResponse(SimulatedResponseVAUseVars.getDefaultNumCompletedB());
			this.setNumQ_Complete_SecCDefaultSimulatedResponse(SimulatedResponseVAUseVars.getDefaultNumCompletedC());
			this.setNumQ_Complete_SecDDefaultSimulatedResponse(SimulatedResponseVAUseVars.getDefaultNumCompletedD());
			this.setNumQ_Complete_SecEDefaultSimulatedResponse(SimulatedResponseVAUseVars.getDefaultNumCompletedE());
			this.setNum_Complete_SecFDefaultSimulatedResponse(SimulatedResponseVAUseVars.getDefaultNumCompletedF());
			this.setNum_Complete_SecGDefaultSimulatedResponse(SimulatedResponseVAUseVars.getDefaultNumCompletedG());
			this.set_VersionNumber_DefaultSimulatedValue(SimulatedResponseVAUseVars.getDefaultVersionNumber());
			this.set_RecordStatus_DefaultSimulatedValue(SimulatedResponseVAUseVars.isDefaultrecordstatus());
			this.set_LoadDate_DefaultSimulatedValue(SimulatedResponseVAUseVars.getDefaultformloaddate());
		}

		/**
		 * @return the _LoadDate_
		 */
		/**
		 * @return
		 */
		public Date get_LoadDate_DefaultSimulatedValue() {
			try {
				return this._LoadDate_DefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this._LoadDate_DefaultSimulatedValue;
		}

		/**
		 * @return the _RecordStatus_
		 */
		/**
		 * @return
		 */
		public boolean get_RecordStatus_DefaultSimulatedValue() {
			try {
				return this._RecordStatus_DefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this._RecordStatus_DefaultSimulatedValue;
		}

		/**
		 * @return the _VersionNumber_
		 */
		/**
		 * @return
		 */
		public long get_VersionNumber_DefaultSimulatedValue() {
			try {
				return this._VersionNumber_DefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this._VersionNumber_DefaultSimulatedValue;

		}

		/**
		 * @return the form
		 */
		/**
		 * @return
		 */
		protected SerialBlob getCompletedFormDefaultSimulatedValue() {
			try {
				return this.completedFormDefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.completedFormDefaultSimulatedValue;

		}

		/**
		 * @return the cSID
		 */
		/**
		 * @return
		 */
		public String getCSIDDefaultSimulatedResponse() {
			try {
				return this.CSIDDefaultSimulatedResponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.CSIDDefaultSimulatedResponse;

		}

		/**
		 * @return the editStatus
		 */
		/**
		 * @return
		 */
		public boolean getEditStatusDefaultSimulatedValue() {
			try {
				return this.editStatusDefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.editStatusDefaultSimulatedValue;

		}

		/**
		 * @return the form_Id
		 */
		/**
		 * @return
		 */
		public File getForm_IdDefaultSimulatedValue() {
			try {
				return this.form_IdDefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.form_IdDefaultSimulatedValue;

		}

		/**
		 * @return the dupStatus
		 */
		/**
		 * @return
		 */
		public boolean getFormDuplicationStatusDefaultSimulatedValue() {
			try {
				return this.formDuplicationStatusDefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.formDuplicationStatusDefaultSimulatedValue;

		}

		/**
		 * @return the scanDate
		 */
		/**
		 * @return
		 */
		public Date getFormScanDateDefaultSimulatedValue() {
			try {
				return this.formScanDateDefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.formScanDateDefaultSimulatedValue;

		}

		/**
		 * @return the helpCompletingFormsimulatedresponse
		 */
		/**
		 * @return
		 */
		public int getHelpCompletingFormsimulatedresponse() {
			try {
				return this.helpCompletingFormsimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.helpCompletingFormsimulatedresponse;

		}

		/**
		 * @return the helpCompletingForm
		 */
		/**
		 * @return
		 */
		private ValueRange getHelpCompletingFormValueRange() {
			try {
				return this.helpCompletingFormValueRange;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.helpCompletingFormValueRange;

		}

		/**
		 * @return the imageFile
		 */
		/**
		 * @return
		 */
		public BufferedImage getImageFileDefaultSimulatedValue() {
			try {
				return this.imageFileDefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.imageFileDefaultSimulatedValue;

		}

		/**
		 * @return the mailCode
		 */
		/**
		 * @return
		 */
		public int getMailCodeDefaultSimulatedValue() {
			try {
				return this.mailCodeDefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.mailCodeDefaultSimulatedValue;

		}

		/**
		 * @return the nonVAHospResponseDropffSite
		 */
		/**
		 * @return
		 */
		private ValueRange getNonVAHospResponseDropffSiteValueRange() {
			try {
				return this.nonVAHospResponseDropffSiteValueRange;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.nonVAHospResponseDropffSiteValueRange;

		}

		/**
		 * @return the nonVAHospResponseDropOffSitesimulatedresponse
		 */
		/**
		 * @return
		 */
		public int getNonVAHospResponseDropOffSitesimulatedresponse() {
			try {
				return this.nonVAHospResponseDropOffSitesimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.nonVAHospResponseDropOffSitesimulatedresponse;

		}

		/**
		 * @return the nonVANonRxsimulatedresponse
		 */
		/**
		 * @return
		 */
		public int getNonVANonRxsimulatedresponse() {
			try {
				return this.nonVANonRxsimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.nonVANonRxsimulatedresponse;

		}

		/**
		 * @return the nonVANonRxValueRange
		 */
		/**
		 * @return
		 */
		private ValueRange getNonVANonRxValueRange() {
			try {
				return this.nonVANonRxValueRange;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.nonVANonRxValueRange;

		}

		/**
		 * @return the nonVARxsimulatedresponse
		 */
		/**
		 * @return
		 */
		public int getNonVARxsimulatedresponse() {
			try {
				return this.nonVARxsimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.nonVARxsimulatedresponse;

		}

		/**
		 * @return the nonVARx
		 */
		/**
		 * @return
		 */
		private ValueRange getNonVARxValueRange() {
			try {
				return this.nonVARxValueRange;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.nonVARxValueRange;

		}

		/**
		 * @return the num_Complete_F
		 */
		/**
		 * @return
		 */
		public int getNum_Complete_SecFDefaultSimulatedResponse() {
			try {
				return this.num_Complete_SecFDefaultSimulatedResponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.num_Complete_SecFDefaultSimulatedResponse;

		}

		/**
		 * @return the num_Complete_G
		 */
		/**
		 * @return
		 */
		protected int getNum_Complete_SecGDefaultSimulatedResponse() {
			try {
				return this.num_Complete_SecGDefaultSimulatedResponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.num_Complete_SecGDefaultSimulatedResponse;

		}

		/**
		 * @return the num_Complete_A
		 */
		/**
		 * @return
		 */
		public int getNumQ_Complete_SecADefaultSimulatedResponse() {
			try {
				return this.numQ_Complete_SecADefaultSimulatedResponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.numQ_Complete_SecADefaultSimulatedResponse;

		}

		/**
		 * @return the num_Complete_B
		 */
		/**
		 * @return
		 */
		public int getNumQ_Complete_SecBDefaultSimulatedResponse() {
			try {
				return this.numQ_Complete_SecBDefaultSimulatedResponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.numQ_Complete_SecBDefaultSimulatedResponse;

		}

		/**
		 * @return the num_Complete_C
		 */
		/**
		 * @return
		 */
		public int getNumQ_Complete_SecCDefaultSimulatedResponse() {
			try {
				return this.numQ_Complete_SecCDefaultSimulatedResponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.numQ_Complete_SecCDefaultSimulatedResponse;

		}

		/**
		 * @return the num_Complete_D
		 */
		/**
		 * @return
		 */
		public int getNumQ_Complete_SecDDefaultSimulatedResponse() {
			return this.numQ_Complete_SecDDefaultSimulatedResponse;
		}

		/**
		 * @return the num_Complete_E
		 */
		/**
		 * @return
		 */
		public int getNumQ_Complete_SecEDefaultSimulatedResponse() {
			try {
				return this.numQ_Complete_SecEDefaultSimulatedResponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.numQ_Complete_SecEDefaultSimulatedResponse;

		}

		/**
		 * @return the num_Complete
		 */
		/**
		 * @return
		 */
		public int getNumQ_CompleteDefaultSimulatedResponse() {
			try {
				return this.numQ_CompleteDefaultSimulatedResponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.numQ_CompleteDefaultSimulatedResponse;

		}

		/**
		 * @return the output_Filename
		 */
		/**
		 * @return
		 */
		public File getOutput_FilenameDefaultSimulatedValue() {
			try {
				return this.output_FilenameDefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.output_FilenameDefaultSimulatedValue;

		}

		/**
		 * @return the time_Stamp
		 */
		/**
		 * @return
		 */
		protected Timestamp getTimestampFormCompletionDefaultSimulatedValue() {
			try {
				return this.timestampFormCompletionDefaultSimulatedValue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.timestampFormCompletionDefaultSimulatedValue;

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
		 * @return the vAHospResponseDropoffSitesimulatedresponse
		 */
		/**
		 * @return
		 */
		public int getVAHospResponseDropoffSitesimulatedresponse() {
			try {
				return this.VAHospResponseDropoffSitesimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.VAHospResponseDropoffSitesimulatedresponse;

		}

		/**
		 * @return the vAHospResponseDropoffSiteValueRange
		 */
		/**
		 * @return
		 */
		private ValueRange getVAHospResponseDropoffSiteValueRange() {
			try {
				return this.VAHospResponseDropoffSiteValueRange;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.VAHospResponseDropoffSiteValueRange;

		}

		/**
		 * @return the vANonRxsimulatedresponse
		 */
		/**
		 * @return
		 */
		protected int getVANonRxsimulatedresponse() {
			try {
				return this.VANonRxsimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.VANonRxsimulatedresponse;

		}

		/**
		 * @return the vANonRxValueRange
		 */
		/**
		 * @return
		 */
		private ValueRange getVANonRxValueRange() {
			try {
				return this.VANonRxValueRange;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.VANonRxValueRange;

		}

		/**
		 * @return the vARxsimulatedresponse
		 */
		/**
		 * @return
		 */
		public int getVARxsimulatedresponse() {
			try {
				return this.VARxsimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.VARxsimulatedresponse;

		}

		/**
		 * @return the vARx
		 */
		/**
		 * @return
		 */
		private ValueRange getVARxValueRange() {
			try {
				return this.VARxValueRange;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.VARxValueRange;

		}

		/**
		 * @return the vAUse
		 */
		/**
		 * @return
		 */
		protected ValueRange getVAUseValueRange() {
			try {
				return this.VAUseValueRange;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.VAUseValueRange;

		}

		/**
		 * @param _LoadDate_ the _LoadDate_ to set
		 */
		/**
		 * @param _LoadDate_
		 */
		private void set_LoadDate_DefaultSimulatedValue(Date _LoadDate_) {
			try {
				this._LoadDate_DefaultSimulatedValue = _LoadDate_;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this._LoadDate_DefaultSimulatedValue = _LoadDate_;

		}

		/**
		 * @param b the _RecordStatus_ to set
		 */
		/**
		 * @param b
		 */
		private void set_RecordStatus_DefaultSimulatedValue(boolean b) {
			try {
				this._RecordStatus_DefaultSimulatedValue = b;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param _VersionNumber_ the _VersionNumber_ to set
		 */
		/**
		 * @param _VersionNumber_
		 */
		private void set_VersionNumber_DefaultSimulatedValue(long _VersionNumber_) {
			try {
				this._VersionNumber_DefaultSimulatedValue = _VersionNumber_;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param form the form to set
		 */
		/**
		 * @param form
		 */
		private void setCompletedFormDefaultSimulatedValue(SerialBlob form) {
			try {
				this.completedFormDefaultSimulatedValue = form;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param cSID the cSID to set
		 */
		/**
		 * @param cSID
		 */
		private void setCSIDDefaultSimulatedResponse(String cSID) {
			try {
				this.CSIDDefaultSimulatedResponse = cSID;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param b the editStatus to set
		 */
		/**
		 * @param b
		 */
		private void setEditStatusDefaultSimulatedValue(boolean b) {
			try {
				this.editStatusDefaultSimulatedValue = b;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param file the form_Id to set
		 */
		/**
		 * @param file
		 */
		private void setForm_IdDefaultSimulatedValue(File file) {
			try {
				this.form_IdDefaultSimulatedValue = file;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param dupStatus the dupStatus to set
		 */
		/**
		 * @param dupStatus
		 */
		private void setFormDuplicationStatusDefaultSimulatedValue(boolean dupStatus) {
			try {
				this.formDuplicationStatusDefaultSimulatedValue = dupStatus;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param scanDate the scanDate to set
		 */
		/**
		 * @param scanDate
		 */
		private void setFormScanDateDefaultSimulatedValue(Date scanDate) {
			try {
				this.formScanDateDefaultSimulatedValue = scanDate;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param helpCompletingFormsimulatedresponse the
		 *                                            helpCompletingFormsimulatedresponse
		 *                                            to set
		 */
		/**
		 * @param helpCompletingFormsimulatedresponse
		 */
		private void setHelpCompletingFormsimulatedresponse(int helpCompletingFormsimulatedresponse) {
			try {
				this.helpCompletingFormsimulatedresponse = helpCompletingFormsimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param helpCompletingForm the helpCompletingForm to set
		 */
		/**
		 * @param helpCompletingForm
		 */
		private void setHelpCompletingFormValueRange(ValueRange helpCompletingForm) {
			try {
				this.helpCompletingFormValueRange = helpCompletingForm;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param imageFile the imageFile to set
		 */
		/**
		 * @param imageFile
		 */
		private void setImageFileDefaultSimulatedValue(BufferedImage imageFile) {
			try {
				this.imageFileDefaultSimulatedValue = imageFile;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param i the mailCode to set
		 */
		/**
		 * @param i
		 */
		private void setMailCodeDefaultSimulatedValue(int i) {
			try {
				this.mailCodeDefaultSimulatedValue = i;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param nonVAHospResponseDropOffSitesimulatedresponse the
		 *                                                      nonVAHospResponseDropOffSitesimulatedresponse
		 *                                                      to set
		 */
		/**
		 * @param nonVAHospResponseDropOffSitesimulatedresponse
		 */
		private void setNonVAHospResponseDropOffSitesimulatedresponse(
				int nonVAHospResponseDropOffSitesimulatedresponse) {
			try {
				this.nonVAHospResponseDropOffSitesimulatedresponse = nonVAHospResponseDropOffSitesimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param nonVAHospResponseDropffSiteValueRange the
		 *                                              nonVAHospResponseDropffSiteValueRange
		 *                                              to set
		 */
		/**
		 * @param nonVAHospResponseDropffSiteValueRange
		 */
		private void setNonVAHospResponseDropOffSiteValueRange(ValueRange nonVAHospResponseDropffSiteValueRange) {
			try {
				this.nonVAHospResponseDropffSiteValueRange = nonVAHospResponseDropffSiteValueRange;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param nonVANonRx the nonVANonRx to set
		 */
		/**
		 * @param nonVANonRx
		 */
		private void setNonVANonRx(ValueRange nonVANonRx) {
			try {
				this.nonVANonRxValueRange = nonVANonRx;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param nonVANonRxsimulatedresponse the nonVANonRxsimulatedresponse to set
		 */
		/**
		 * @param nonVANonRxsimulatedresponse
		 */
		private void setNonVANonRxsimulatedresponse(int nonVANonRxsimulatedresponse) {
			try {
				this.nonVANonRxsimulatedresponse = nonVANonRxsimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param nonVARx the nonVARx to set
		 */
		/**
		 * @param nonVARxValueRangeDefaultVals
		 */
		private void setNonVARx(ValueRange nonVARxValueRange) {
			try {
				this.nonVARxValueRange = nonVARxValueRange;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param nonVARxsimulatedresponse the nonVARxsimulatedresponse to set
		 */
		/**
		 * @param nonVARxsimulatedresponse
		 */
		private void setNonVARxsimulatedresponse(int nonVARxsimulatedresponse) {
			try {
				this.nonVARxsimulatedresponse = nonVARxsimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param i the num_Complete to set
		 */
		/**
		 * @param i
		 */
		private void setNum_Complete(int i) {
			try {
				this.numQ_CompleteDefaultSimulatedResponse = i;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param num_Complete_F the num_Complete_F to set
		 */
		/**
		 * @param num_Complete_F
		 */
		private void setNum_Complete_SecFDefaultSimulatedResponse(int num_Complete_F) {
			try {
				this.num_Complete_SecFDefaultSimulatedResponse = num_Complete_F;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param num_Complete_G the num_Complete_G to set
		 */
		/**
		 * @param num_Complete_G
		 */
		private void setNum_Complete_SecGDefaultSimulatedResponse(int num_Complete_G) {
			try {
				this.num_Complete_SecGDefaultSimulatedResponse = num_Complete_G;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param i the num_Complete_A to set
		 */
		/**
		 * @param i
		 */
		private void setNumQ_Complete_SecADefaultSimulatedResponse(int i) {
			try {
				this.numQ_Complete_SecADefaultSimulatedResponse = i;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param i the num_Complete_B to set
		 */
		/**
		 * @param i
		 */
		private void setNumQ_Complete_SecBDefaultSimulatedResponse(int i) {
			try {
				this.numQ_Complete_SecBDefaultSimulatedResponse = i;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param i the num_Complete_C to set
		 */
		/**
		 * @param i
		 */
		private void setNumQ_Complete_SecCDefaultSimulatedResponse(int i) {
			try {
				this.numQ_Complete_SecCDefaultSimulatedResponse = i;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param i the num_Complete_D to set
		 */
		/**
		 * @param i
		 */
		private void setNumQ_Complete_SecDDefaultSimulatedResponse(int i) {
			try {
				this.numQ_Complete_SecDDefaultSimulatedResponse = i;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param i the num_Complete_E to set
		 */
		/**
		 * @param i
		 */
		private void setNumQ_Complete_SecEDefaultSimulatedResponse(int i) {
			try {
				this.numQ_Complete_SecEDefaultSimulatedResponse = i;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param output_Filename the output_Filename to set
		 */
		/**
		 * @param output_Filename
		 */
		private void setOutput_FilenameDefaultSimulatedValue(File output_Filename) {
			try {
				this.output_FilenameDefaultSimulatedValue = output_Filename;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param time_Stamp the time_Stamp to set
		 */
		/**
		 * @param time_Stamp
		 */
		private void setTimestampFormCompletionDefaultSimulatedValue(Timestamp time_Stamp) {
			try {
				this.timestampFormCompletionDefaultSimulatedValue = time_Stamp;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
			}
		}

		/**
		 * @param vAHospResponseDropoffSiteValueRange the vAHospResponseDropoffSite to
		 *                                            set
		 */
		/**
		 * @param vAHospResponseDropoffSiteValueRange
		 */
		private void setVAHospResponseDropoffSite(ValueRange vAHospResponseDropoffSiteValueRange) {
			try {
				this.VAHospResponseDropoffSiteValueRange = vAHospResponseDropoffSiteValueRange;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param vAHospResponseDropoffSitesimulatedresponse the
		 *                                                   vAHospResponseDropoffSitesimulatedresponse
		 *                                                   to set
		 */
		/**
		 * @param vAHospResponseDropoffSitesimulatedresponse
		 */
		private void setVAHospResponseDropoffSitesimulatedresponse(int vAHospResponseDropoffSitesimulatedresponse) {
			try {
				this.VAHospResponseDropoffSitesimulatedresponse = vAHospResponseDropoffSitesimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param vANonRx the vANonRx to set
		 */
		/**
		 * @param vANonRx
		 */
		private void setVANonRx(ValueRange vANonRx) {
			try {
				this.VANonRxValueRange = vANonRx;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param vANonRxsimulatedresponse the vANonRxsimulatedresponse to set
		 */
		/**
		 * @param vANonRxsimulatedresponse
		 */
		private void setVANonRxsimulatedresponse(int vANonRxsimulatedresponse) {
			try {
				this.VANonRxsimulatedresponse = vANonRxsimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param vARx the vARx to set
		 */
		/**
		 * @param vARx
		 */
		private void setVARx(ValueRange vARx) {
			try {
				this.VARxValueRange = vARx;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param vARxsimulatedresponse the vARxsimulatedresponse to set
		 */
		/**
		 * @param vARxsimulatedresponse
		 */
		private void setVARxsimulatedresponse(int vARxsimulatedresponse) {
			try {
				this.VARxsimulatedresponse = vARxsimulatedresponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param vAUse the vAUse to set
		 */
		/**
		 * @param vAUse
		 */
		private void setVAUseValueRange(ValueRange vAUse) {
			try {
				this.VAUseValueRange = vAUse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @param valuerange
		 * @param errorresponse
		 * @return
		 * @throws Exception
		 */
		public int simulateHelpCompletingFormsimulatedresponse(ValueRange valuerange, int errorresponse)
				throws Exception {
			try {
				this.setHelpCompletingFormValueRange(valuerange);
				this.setHelpCompletingFormsimulatedresponse(errorresponse);
				if (
				// SimulatedResponseVAUse errorResponse to be initialized in its constructor
						((!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
								SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), SimulatedResponseVAUseVars.getMaximumtogenerateerrorvalforhelpcompleting()))))
						)
						{
					this.setHelpCompletingFormsimulatedresponse(
							this.getUtilities().randBetween((int) this.getHelpCompletingFormValueRange().getMinimum(),
									(int) this.getHelpCompletingFormValueRange().getMaximum()));
					return this.getHelpCompletingFormsimulatedresponse();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return errorresponse;
		}

		/**
		 * @param valuerange
		 * @param errorresponse
		 * @return
		 * @throws Exception
		 */
		public int simulateNonVAHospResponseDropOffSitesimulatedresponse(ValueRange valuerange, int errorresponse)
				throws Exception {
			try {
				this.setNonVAHospResponseDropOffSiteValueRange(valuerange);
				this.setNonVAHospResponseDropOffSitesimulatedresponse(errorresponse);
				if (
				// SimulatedResponseVAUse errorResponse to be initialized in its constructor
				(!this.getUniformDistribution().generatenoiseinresponsevariables(this.getUtilities().randBetween(
						SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(),
						SimulatedResponseVAUseVars.getMaximumtogeneratevahospresponsedropoffsiteerrorval())))) {
					this.setNonVAHospResponseDropOffSitesimulatedresponse(
							this.getUtilities().randBetween((int) this.getNonVAHospResponseDropffSiteValueRange().getMinimum(),
									(int) this.getNonVAHospResponseDropffSiteValueRange().getMaximum()));
					return this.getNonVAHospResponseDropOffSitesimulatedresponse();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return errorresponse;
		}

		/**
		 * @param valuerange
		 * @param errorresponse
		 * @return
		 * @throws Exception
		 */
		public int simulateNonVANonRxsimulatedresponse(ValueRange valuerange, int errorresponse) throws Exception {
			try {
				this.setNonVANonRx(valuerange);
				this.setNonVANonRxsimulatedresponse(errorresponse);
				if (
				// SimulatedResponseVAUse errorResponse to be initialized in its constructor
				(!this.getUniformDistribution().generatenoiseinresponsevariables(
						this.getUtilities().randBetween(SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), 
								SimulatedResponseVAUseVars.getMaxtogenerateerrorval())))) {
					this.setNonVANonRxsimulatedresponse(
							this.getUtilities().randBetween((int) this.getNonVANonRxValueRange().getMinimum(),
									(int) this.getNonVANonRxValueRange().getMaximum()));
					return this.getNonVANonRxsimulatedresponse();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return errorresponse;
		}

		/**
		 * @param valuerange
		 * @param errorresponse
		 * @return
		 * @throws Exception
		 */
		public int simulateNonVARxsimulatedresponse(ValueRange valuerange, int errorresponse) throws Exception {
			try {
				this.setNonVARx(valuerange);
				this.setNonVARxsimulatedresponse(errorresponse);
				if (
				// SimulatedResponseVAUse errorResponse to be initialized in its constructor
				(!this.getUniformDistribution().generatenoiseinresponsevariables(
						this.getUtilities().randBetween(SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), 
								SimulatedResponseVAUseVars.getMaxtogenerateerrorval())))) {
					this.setNonVARxsimulatedresponse(this.getUtilities().randBetween(
							(int) this.getNonVARxValueRange().getMinimum(), (int) this.getNonVARxValueRange().getMaximum()));
					return this.getNonVARxsimulatedresponse();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return errorresponse;
		}

		public int simulateVAUsesimulatedresponse(ValueRange valuerange, int errorresponse) throws Exception {
			try {
				this.setVAUseValueRange(valuerange);
				this.setVAUseSimulatedResponse(errorresponse);
				if (
				// SimulatedResponseVAUse errorResponse to be initialized in its constructor
				(!this.getUniformDistribution().generatenoiseinresponsevariables(
						this.getUtilities().randBetween(SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), 
								SimulatedResponseVAUseVars.getMaxtogenerateerrorval())))) {
					this.setVAUseSimulatedResponse(this.getUtilities().randBetween(
							(int) this.getVAUseValueRange().getMinimum(), (int) this.getVAUseValueRange().getMaximum()));
					return this.getVAUseSimulatedResponse();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return errorresponse;
		}
		/**
		 * @param valuerange
		 * @param errorresponse
		 * @return
		 * @throws Exception
		 */
		public int simulateVAHospResponseDropoffSitesimulatedresponse(ValueRange valuerange, int errorresponse)
				throws Exception {
			try {
				this.setVAHospResponseDropoffSite(valuerange);
				this.setVAHospResponseDropoffSitesimulatedresponse(errorresponse);
				if (
				// SimulatedResponseVAUse errorResponse to be initialized in its constructor
				(!this.getUniformDistribution().generatenoiseinresponsevariables(
						this.getUtilities().randBetween(0, SimulatedResponseVAUseVars.getMaxtogenerateerrorval())))) {
					this.setVANonRxsimulatedresponse(
							this.getUtilities().randBetween((int) this.getVAHospResponseDropoffSiteValueRange().getMinimum(),
									(int) this.getVAHospResponseDropoffSiteValueRange().getMaximum()));
					return this.getVAHospResponseDropoffSitesimulatedresponse();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return errorresponse;
		}

		/**
		 * @param valuerange
		 * @param errorresponse
		 * @return
		 * @throws Exception
		 */
		public int simulateVANonRxsimulatedresponse(ValueRange valuerange, int errorresponse) throws Exception {
			try {
				this.setVANonRx(valuerange);
				this.setVANonRxsimulatedresponse(errorresponse);
				if (
				// SimulatedResponseVAUse errorResponse to be initialized in its constructor
				(!this.getUniformDistribution().generatenoiseinresponsevariables(
						this.getUtilities().randBetween(SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), SimulatedResponseVAUseVars.getMaxtogenerateerrorval())))) {
					this.setVANonRxsimulatedresponse(this.getUtilities().randBetween(
							(int) this.getVANonRxValueRange().getMinimum(), (int) this.getVANonRxValueRange().getMaximum()));
					return this.getVANonRxsimulatedresponse();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return errorresponse;
		}

		/**
		 * @param valuerange
		 * @param errorresponse
		 * @return
		 * @throws Exception
		 */
		public int simulateVARxsimulatedresponse(ValueRange valuerange, int errorresponse) throws Exception {
			try {
				this.setVARx(valuerange);
				this.setVARxsimulatedresponse(errorresponse);
				if (
				// SimulatedResponseVAUse errorResponse to be initialized in its constructor
				(!this.getUniformDistribution().generatenoiseinresponsevariables(
						this.getUtilities().randBetween(SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), 
								SimulatedResponseVAUseVars.getMaxtogenerateerrorval())))) {
					this.setVARxsimulatedresponse(this.getUtilities().randBetween((int) this.getVARxValueRange().getMinimum(),
							(int) this.getVARxValueRange().getMaximum()));
					return this.getVARxsimulatedresponse();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return errorresponse;
		}

		/**
		 * @return the utilities
		 */
		private Utilities getUtilities() {
			return this.utilities;
		}

		/**
		 * @param utilities the utilities to set
		 */
		private void setUtilities(Utilities utilities) {
			this.utilities = utilities;
		}

		/**
		 * @param formcompletionstatusDefaultSimulatedValue the formcompletionstatusDefaultSimulatedValue to set
		 */
		private void setFormcompletionstatusDefaultSimulatedValue(boolean formcompletionstatusDefaultSimulatedValue) {
			this.formcompletionstatusDefaultSimulatedValue = formcompletionstatusDefaultSimulatedValue;
		}

		/**
		 * @param vAUseSimulatedResponse the vAUseSimulatedResponse to set
		 */
		private void setVAUseSimulatedResponse(int vAUseSimulatedResponse) {
			this.VAUseSimulatedResponse = vAUseSimulatedResponse;
		}

		/**
		 * @return the vAUseSimulatedResponse
		 */
		public int getVAUseSimulatedResponse() {
			return this.VAUseSimulatedResponse;
		}

		public String getTimestampFormCompletiongDefaultSimulatedValue() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getNumQ_Complete_SecGDefaultSimulatedResponse() {
			// TODO Auto-generated method stub
			return null;
		}

	}

	/**
	*
	*/
	private static Calendar calendar = new GregorianCalendar();
	/**
	*
	*/
	
	private static int errorResponse;
	private static String CSIDDefaultResponse;
	/**
	*
	*/
	private static boolean defaultformcompletionstatus;

	/**
	 *
	 */
	private static boolean defaultformduplicationstatus;
	/**
	 *
	 */
	private static boolean defaultformEditStatus;
	/**
	 *
	 */
	private static File defaultFormId;
	/**
	*
	*/
	private static Date defaultFormLoadDate;
	/**
	*
	*/
	private static SerialBlob defaultformobject;
	/**
	*
	*/
	private static Date defaultFormScanDate;
	/**
	*
	*/
	private static int defaultmailCode;
	/**
	*
	*/
	private static int defaultNumCompletedA;
	/**
	 *
	 */
	private static int defaultNumCompletedB;
	/**
	 *
	 */
	private static int defaultNumCompletedC;
	/**
	*
	*/
	private static int defaultNumCompletedD;
	/**
	 *
	 */
	private static int defaultNumCompletedE;
	/**
	 *
	 */
	private static int defaultNumCompletedF;
	/**
	*
	*/
	private static int defaultNumCompletedG;
	/**
	 *
	 */
	private static int defaultNumQuestionsComplete;
	/**
	 *
	 */
	private static File defaultOutputFile;
	/**
	 *
	 */
	private static boolean defaultRecordStatus;
	/**
	 *
	 */
	private static Timestamp defaulttimestampformcompletion;
	/**
	 *
	 */
	private static int defaultVersionNumber;
	/**
	 *
	 */
	private static int errorValToIntroduceNoise;
	/**
	 *
	 */
	private static ValueRange helpCompletionValueRange;
	/**
	 *
	 */
	private static BufferedImage ImageFile;
	/**
	 *
	 */
	private static final int maximumtogenerateerrorvalforHelpCompleting = 1;
	/**
	 *
	 */
	private static final int maximumTogenerateRandomValsForNumA_GCompletion = 495;
	/**
	 *
	 */
	private static final int maximumTogenerateRandomValsForNumCompleted = 495;
	/**
	 *
	 */
	private static final int maximumtogeneratererrorvalForVAUseResponseVars = 6;
	/**
	*
	*/
	private static final int maximumtogenerateVAHospResponseDropoffSiteerrorval = 5;
	/**
	*
	*/
	private static final int maxToGenerateErrorVal = 4;
	/**
	*
	*/
	private static final int minimumtogenerateerrorval = 1;
	/**
	 *
	 */
	private static ValueRange nonVAHospDropOffSiteValueRange;
	/**
	 *
	 */
	private static ValueRange nonVAnonRxValueRange;
	/**
	*
	*/
	private static ValueRange nonVARxValueRangeDefaultVals;
	/**
	 *
	 */
	/**
	 *
	 */
	private static Utilities utilitiesstaticinstance;
	/**
	*
	*/
	private static ValueRange vaHospDropOffSiteValueRange;
	/**
	 *
	 */
	private static ValueRange VARxValueRangeDefaultValue;
	/**
	 *
	 */
	private static ValueRange vaUseValsValueRange;

	/**
	 * @return the calendar
	 */
	/**
	 * @return
	 */
	private static Calendar getCalendar() {
		return calendar;
	}

	/**
	 * @return the cSIDDefaultResponse
	 */
	/**
	 * @return
	 */
	private static String getCSIDDefaultResponse() {
		try {
			return CSIDDefaultResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CSIDDefaultResponse;

	}

	/**
	 * @return the defaultformduplicationstatus
	 */
	/**
	 * @return
	 */
	private static boolean getDefaultformduplicationstatus() {
		try {
			return defaultformduplicationstatus;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultformduplicationstatus;

	}

	/**
	 * @return
	 */
	private static boolean getDefaultformEditStatus() {
		try {
			return defaultformEditStatus;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultformEditStatus;
	}

	/**
	 * @return the defaultformid
	 */
	/**
	 * @return
	 */
	private static File getDefaultformid() {
		try {
			return defaultFormId;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultFormId;

	}

	/**
	 * @return the defaultformloaddate
	 */
	/**
	 * @return
	 */
	private static Date getDefaultformloaddate() {
		try {
			return defaultFormLoadDate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultFormLoadDate;

	}

	/**
	 * @return the defaultformobject
	 */
	/**
	 * @return
	 */
	private static SerialBlob getDefaultformobject() {
		try {
			return defaultformobject;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultformobject;

	}

	/**
	 * @return the defaultFormScanDate
	 */
	/**
	 * @return
	 */
	private static Date getDefaultFormScanDate() {
		try {
			return defaultFormScanDate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultFormScanDate;

	}

	/**
	 * @return the defaultmailcode
	 */
	/**
	 * @return
	 */
	private static int getDefaultmailcode() {
		try {
			return defaultmailCode;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultmailCode;

	}

	/**
	 * @return the defaultnumcomplete
	 */
	/**
	 * @return
	 */
	private static int getDefaultnumcomplete() {
		try {
			return defaultNumQuestionsComplete;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultNumQuestionsComplete;

	}

	/**
	 * @return the defaultNumCompletedA
	 */
	/**
	 * @return
	 */
	private static int getDefaultNumCompletedA() {
		try {
			return defaultNumCompletedA;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultNumCompletedA;

	}

	/**
	 * @return the defaultNumCompletedB
	 */
	/**
	 * @return
	 */
	private static int getDefaultNumCompletedB() {
		try {
			return defaultNumCompletedB;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultNumCompletedB;

	}

	/**
	 * @return the defaultNumCompletedC
	 */
	/**
	 * @return
	 */
	private static int getDefaultNumCompletedC() {
		try {
			return defaultNumCompletedC;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultNumCompletedC;

	}

	/**
	 * @return the defaultNumCompletedD
	 */
	/**
	 * @return
	 */
	private static int getDefaultNumCompletedD() {
		try {
			return defaultNumCompletedD;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultNumCompletedD;

	}

	/**
	 * @return the defaultNumCompletedE
	 */
	/**
	 * @return
	 */
	private static int getDefaultNumCompletedE() {
		try {
			return defaultNumCompletedE;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultNumCompletedE;

	}

	/**
	 * @return the defaultNumCompletedF
	 */
	/**
	 * @return
	 */
	private static int getDefaultNumCompletedF() {
		try {
			return defaultNumCompletedF;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultNumCompletedF;

	}

	/**
	 * @return the defaultNumCompletedG
	 */
	/**
	 * @return
	 */
	private static int getDefaultNumCompletedG() {
		try {
			return defaultNumCompletedG;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultNumCompletedG;

	}

	/**
	 * @return the defaultOutputFile
	 */
	/**
	 * @return
	 */
	private static File getDefaultOutputFile() {
		try {
			return defaultOutputFile;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultOutputFile;

	}

	/**
	 * @return the defaultVersionNumber
	 */
	/**
	 * @return
	 */
	private static int getDefaultVersionNumber() {
		try {
			return defaultVersionNumber;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultVersionNumber;

	}


	/**
	 * @return the helpcompletionvaluerange
	 */
	/**
	 * @return
	 */
	private static ValueRange getHelpcompletionvaluerange() {
		try {
			return helpCompletionValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return helpCompletionValueRange;

	}

	/**
	 * @return the imagefile
	 */
	/**
	 * @return
	 */
	private static BufferedImage getImagefile() {
		try {
			return ImageFile;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ImageFile;

	}


	/**
	 * @return the maximumtogenerateerrorvalforhelpcompleting
	 */
	/**
	 * @return
	 */
	private static int getMaximumtogenerateerrorvalforhelpcompleting() {
		try {
			return maximumtogenerateerrorvalforHelpCompleting;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maximumtogenerateerrorvalforHelpCompleting;

	}

	/**
	 * @return the maximumtogeneraterandomvalsfornumaGcompletion
	 */
	/**
	 * @return
	 */
	private static int getMaximumtogeneraterandomvalsfornumaGcompletion() {
		try {
			return maximumTogenerateRandomValsForNumA_GCompletion;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maximumTogenerateRandomValsForNumA_GCompletion;

	}

	/**
	 * @return the maximumtogeneraterandomvalsfornumcompleted
	 */
	/**
	 * @return
	 */
	private static int getMaximumtogeneraterandomvalsfornumcompleted() {
		try {
			return maximumTogenerateRandomValsForNumCompleted;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maximumTogenerateRandomValsForNumCompleted;

	}

	/**
	 * @return the maximumtogeneratererrorvalforvauseresponsevars
	 */
	/**
	 * @return
	 */
	private static int getMaximumtogeneratererrorvalforvauseresponsevars() {
		try {
			return maximumtogeneratererrorvalForVAUseResponseVars;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maximumtogeneratererrorvalForVAUseResponseVars;

	}

	/**
	 * @return the maximumtogeneratevahospresponsedropoffsiteerrorval
	 */
	/**
	 * @return
	 */
	private static int getMaximumtogeneratevahospresponsedropoffsiteerrorval() {
		try {
			return maximumtogenerateVAHospResponseDropoffSiteerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maximumtogenerateVAHospResponseDropoffSiteerrorval;

	}

	// separate simulation for each variable
	// wrapper for all
	/**
	 * @return the maxtogenerateerrorval
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	private static int getMaxtogenerateerrorval() {
		try {
			return maxToGenerateErrorVal;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maxToGenerateErrorVal;

	}

	/**
	 * @return the minimumtogenerateerrorval
	 */
	/**
	 * @return
	 */
	private static int getMinimumtogenerateerrorval() {
		try {
			return minimumtogenerateerrorval;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return minimumtogenerateerrorval;

	}

	/**
	 * @return the nonvahospdropoffsitevaluerange
	 */
	/**
	 * @return
	 */
	private static ValueRange getNonvahospdropoffsitevaluerange() {
		try {
			return nonVAHospDropOffSiteValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nonVAHospDropOffSiteValueRange;

	}

	/**
	 * @return the nonvanonrxvaluerange
	 */
	/**
	 * @return
	 */
	private static ValueRange getNonvanonrxvaluerange() {
		try {
			return nonVAnonRxValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nonVAnonRxValueRange;

	}

	/**
	 * @return the nonVARxValueRangeDefaultVals
	 */
	/**
	 * @return
	 */
	private static ValueRange getNonVARxValueRangeDefaultVals() {
		try {
			return nonVARxValueRangeDefaultVals;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nonVARxValueRangeDefaultVals;

	}



	/**
	 * @return the timestamp
	 */
	/**
	 * @return
	 */
	private static Timestamp getTimestamp() {
		try {
			return defaulttimestampformcompletion;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaulttimestampformcompletion;

	}

	/**
	 * @return the utilitiesstaticinstance
	 */
	/**
	 * @return
	 */
	private static Utilities getUtilitiesstaticinstance() {
		try {
			return utilitiesstaticinstance;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return utilitiesstaticinstance;

	}

	/**
	 * @return the vahospdropoffsitevaluerange
	 */
	/**
	 * @return
	 */
	private static ValueRange getVahospdropoffsitevaluerange() {
		try {
			return vaHospDropOffSiteValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vaHospDropOffSiteValueRange;

	}

	/**
	 * @return the errorresponse
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	private static int getValForNoiseInSimulatedResponse() {
		try {
			return errorValToIntroduceNoise;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return errorValToIntroduceNoise;

	}

	/**
	 * @return the varxvaluerange
	 */
	/**
	 * @return
	 */
	private static ValueRange getVarxvaluerange() {
		try {
			return VARxValueRangeDefaultValue;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return VARxValueRangeDefaultValue;

	}

	/**
	 * @return the vausevalsvaluerange
	 */
	/**
	 * @return
	 */
	private static ValueRange getVausevalsvaluerange() {
		try {
			return vaUseValsValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vaUseValsValueRange;

	}

	/**
	 * @return the defaultformcompletionstatus
	 */
	/**
	 * @return
	 */
	private static boolean isDefaultformcompletionstatus() {
		try {
			return defaultformcompletionstatus;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultformcompletionstatus;

	}

	/**
	 * @return the defaultrecordstatus
	 */
	/**
	 * @return
	 */
	private static boolean isDefaultrecordstatus() {
		try {
			return defaultRecordStatus;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultRecordStatus;

	}

	/**
	 * @param calendar the calendar to set
	 */
	/**
	 * @param calendar
	 */
	private static void setCalendar(Calendar calendar) {
		try {
			SimulatedResponseVAUseVars.calendar = calendar;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param cSIDDefaultResponse the cSIDDefaultResponse to set
	 */
	/**
	 * @param cSIDDefaultResponse
	 */
	private static void setCSIDDefaultResponse(String cSIDDefaultResponse) {
		try {
			CSIDDefaultResponse = cSIDDefaultResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultformcompletionstatus the defaultformcompletionstatus to set
	 */
	/**
	 * @param defaultformcompletionstatus
	 */
	private static void setDefaultformcompletionstatus(boolean defaultformcompletionstatus) {
		try {
			SimulatedResponseVAUseVars.defaultformcompletionstatus = defaultformcompletionstatus;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param b the defaultformduplicationstatus to set
	 */
	/**
	 * @param b
	 */
	private static void setDefaultformduplicationstatus(boolean b) {
		try {
			SimulatedResponseVAUseVars.defaultformduplicationstatus = b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultformEditStatus the defaultformEditStatus to set
	 */
	/**
	 * @param defaultformEditStatus
	 */
	private static void setDefaultformEditStatus(boolean defaultformEditStatus) {
		try {
			SimulatedResponseVAUseVars.defaultformEditStatus = defaultformEditStatus;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultFormId the defaultFormId to set
	 */
	/**
	 * @param defaultFormId
	 */
	private static void setDefaultFormId(File defaultFormId) {
		try {
			SimulatedResponseVAUseVars.defaultFormId = defaultFormId;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultFormLoadDate the defaultFormLoadDate to set
	 */
	/**
	 * @param defaultFormLoadDate
	 */
	private static void setDefaultFormLoadDate(Date defaultFormLoadDate) {
		try {
			SimulatedResponseVAUseVars.defaultFormLoadDate = defaultFormLoadDate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultformobject the defaultformobject to set
	 */
	/**
	 * @param defaultformobject
	 */
	private static void setDefaultformobject(SerialBlob defaultformobject) {
		try {
			SimulatedResponseVAUseVars.defaultformobject = defaultformobject;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultFormScanDate the defaultFormScanDate to set
	 */
	/**
	 * @param defaultFormScanDate
	 */
	private static void setDefaultFormScanDate(Date defaultFormScanDate) {
		try {
			SimulatedResponseVAUseVars.defaultFormScanDate = defaultFormScanDate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultmailCode the defaultmailCode to set
	 */
	/**
	 * @param defaultmailCode
	 */
	private static void setDefaultmailCode(int defaultmailCode) {
		try {
			SimulatedResponseVAUseVars.defaultmailCode = defaultmailCode;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultNumCompletedA the defaultNumCompletedA to set
	 */
	/**
	 * @param defaultNumCompletedA
	 */
	private static void setDefaultNumCompletedA(int defaultNumCompletedA) {
		try {
			SimulatedResponseVAUseVars.defaultNumCompletedA = defaultNumCompletedA;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultNumCompletedB the defaultNumCompletedB to set
	 */
	/**
	 * @param defaultNumCompletedB
	 */
	private static void setDefaultNumCompletedB(int defaultNumCompletedB) {
		try {
			SimulatedResponseVAUseVars.defaultNumCompletedB = defaultNumCompletedB;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultNumCompletedC the defaultNumCompletedC to set
	 */
	/**
	 * @param defaultNumCompletedC
	 */
	private static void setDefaultNumCompletedC(int defaultNumCompletedC) {
		try {
			SimulatedResponseVAUseVars.defaultNumCompletedC = defaultNumCompletedC;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultNumCompletedD the defaultNumCompletedD to set
	 */
	/**
	 * @param defaultNumCompletedD
	 */
	private static void setDefaultNumCompletedD(int defaultNumCompletedD) {
		try {
			SimulatedResponseVAUseVars.defaultNumCompletedD = defaultNumCompletedD;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultNumCompletedE the defaultNumCompletedE to set
	 */
	/**
	 * @param defaultNumCompletedE
	 */
	private static void setDefaultNumCompletedE(int defaultNumCompletedE) {
		try {
			SimulatedResponseVAUseVars.defaultNumCompletedE = defaultNumCompletedE;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultNumCompletedF the defaultNumCompletedF to set
	 */
	/**
	 * @param defaultNumCompletedF
	 */
	private static void setDefaultNumCompletedF(int defaultNumCompletedF) {
		try {
			SimulatedResponseVAUseVars.defaultNumCompletedF = defaultNumCompletedF;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultNumCompletedG the defaultNumCompletedG to set
	 */
	/**
	 * @param defaultNumCompletedG
	 */
	private static void setDefaultNumCompletedG(int defaultNumCompletedG) {
		try {
			SimulatedResponseVAUseVars.defaultNumCompletedG = defaultNumCompletedG;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultNumQuestionsComplete the defaultNumQuestionsComplete to set
	 */
	/**
	 * @param defaultNumQuestionsComplete
	 */
	private static void setDefaultNumQuestionsComplete(int defaultNumQuestionsComplete) {
		try {
			SimulatedResponseVAUseVars.defaultNumQuestionsComplete = defaultNumQuestionsComplete;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultOutputFile the defaultOutputFile to set
	 */
	/**
	 * @param defaultOutputFile
	 */
	private static void setDefaultOutputFile(File defaultOutputFile) {
		try {
			SimulatedResponseVAUseVars.defaultOutputFile = defaultOutputFile;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultRecordStatus the defaultRecordStatus to set
	 */
	/**
	 * @param defaultRecordStatus
	 */
	private static void setDefaultRecordStatus(boolean defaultRecordStatus) {
		try {
			SimulatedResponseVAUseVars.defaultRecordStatus = defaultRecordStatus;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaulttimestampformcompletion the defaulttimestampformcompletion to
	 *                                       set
	 */
	/**
	 * @param defaulttimestampformcompletion
	 */
	private static void setDefaulttimestampformcompletion(Timestamp defaulttimestampformcompletion) {
		try {
			SimulatedResponseVAUseVars.defaulttimestampformcompletion = defaulttimestampformcompletion;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param defaultVersionNumber the defaultVersionNumber to set
	 */
	/**
	 * @param defaultVersionNumber
	 */
	private static void setDefaultVersionNumber(int defaultVersionNumber) {
		try {
			SimulatedResponseVAUseVars.defaultVersionNumber = defaultVersionNumber;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	/**
	 *
	 */
	private static void setErrorresponse() {
		try {
			errorValToIntroduceNoise = utilitiesstaticinstance.randBetween(getMinimumtogenerateerrorval(),
					getMaxtogenerateerrorval());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param helpCompletionValueRange the helpCompletionValueRange to set
	 */
	/**
	 * @param helpCompletionValueRange
	 */
	private static void setHelpCompletionValueRange(ValueRange helpCompletionValueRange) {
		try {
			SimulatedResponseVAUseVars.helpCompletionValueRange = helpCompletionValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param imageFile the imageFile to set
	 */
	/**
	 * @param imageFile
	 */
	private static void setImageFile(BufferedImage imageFile) {
		try {
			ImageFile = imageFile;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param nonVAHospDropOffSiteValueRange the nonVAHospDropOffSiteValueRange to
	 *                                       set
	 */
	/**
	 * @param nonVAHospDropOffSiteValueRange
	 */
	private static void setNonVAHospDropOffSiteValueRange(ValueRange nonVAHospDropOffSiteValueRange) {
		try {
			SimulatedResponseVAUseVars.nonVAHospDropOffSiteValueRange = nonVAHospDropOffSiteValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param nonVAnonRxValueRange the nonVAnonRxValueRange to set
	 */
	/**
	 * @param nonVAnonRxValueRange
	 */
	private static void setNonVAnonRxValueRange(ValueRange nonVAnonRxValueRange) {
		try {
			SimulatedResponseVAUseVars.nonVAnonRxValueRange = nonVAnonRxValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param nonVARxValueRangeDefaultVals the nonVARxValueRangeDefaultVals to set
	 */
	/**
	 * @param nonVARxValueRangeDefaultVals
	 */
	private static void setNonVARxValueRangeDefaultVals(ValueRange nonVARxValueRange) {
		try {
			SimulatedResponseVAUseVars.nonVARxValueRangeDefaultVals = nonVARxValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param utilitiesstaticinstance the utilitiesstaticinstance to set
	 */
	/**
	 * @param utilitiesstaticinstance
	 */
	private static void setUtilitiesstaticinstance(Utilities utilitiesstaticinstance) {
		try {
			SimulatedResponseVAUseVars.utilitiesstaticinstance = utilitiesstaticinstance;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vaHospDropOffSiteValueRange the vaHospDropOffSiteValueRange to set
	 */
	/**
	 * @param vaHospDropOffSiteValueRange
	 */
	private static void setVaHospDropOffSiteValueRange(ValueRange vaHospDropOffSiteValueRange) {
		try {
			SimulatedResponseVAUseVars.vaHospDropOffSiteValueRange = vaHospDropOffSiteValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vARxValueRange the vARxValueRange to set
	 */
	/**
	 * @param vARxValueRange
	 */
	private static void setVARxValueRangeDefaultValue(ValueRange vARxValueRange) {
		try {
			VARxValueRangeDefaultValue = vARxValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param vaUseValsValueRange the vaUseValsValueRange to set
	 */
	/**
	 * @param vaUseValsValueRange
	 */
	private static void setVaUseValsValueRange(ValueRange vaUseValsValueRange) {
		try {
			SimulatedResponseVAUseVars.vaUseValsValueRange = vaUseValsValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	private VAUseResponses vauseresponses;

	/**
	 *
	 */
	public SimulatedResponseVAUseVars() {
		try {
			setUtilitiesstaticinstance(new Utilities());
			setCalendar(new GregorianCalendar());
			setHelpCompletionValueRange(ValueRange.of(0, 1));
			setNonVAHospDropOffSiteValueRange(ValueRange.of(1, 5));
			setNonVAnonRxValueRange(ValueRange.of(1, 6));
			setNonVARxValueRangeDefaultVals(ValueRange.of(1, 6));
			setVaHospDropOffSiteValueRange(ValueRange.of(1, 5));
			setVARxValueRangeDefaultValue(ValueRange.of(1, 6));
			setVaUseValsValueRange(ValueRange.of(1, 6));
			setDefaultmailCode(0);
			setDefaulttimestampformcompletion(new Timestamp(calendar.getTime().getTime()));
			setDefaultFormScanDate(calendar.getTime());
			setDefaultNumQuestionsComplete(getUtilitiesstaticinstance().randBetween(0,
					SimulatedResponseVAUseVars.getMaximumtogeneraterandomvalsfornumcompleted()));
			setDefaultNumCompletedA(getUtilitiesstaticinstance().randBetween(0,
					SimulatedResponseVAUseVars.getMaximumtogeneraterandomvalsfornumaGcompletion()));
			setDefaultNumCompletedB(getUtilitiesstaticinstance().randBetween(0,
					SimulatedResponseVAUseVars.getMaximumtogeneraterandomvalsfornumaGcompletion()));
			setDefaultNumCompletedC(getUtilitiesstaticinstance().randBetween(0,
					SimulatedResponseVAUseVars.getMaximumtogeneraterandomvalsfornumaGcompletion()));
			setDefaultNumCompletedD(getUtilitiesstaticinstance().randBetween(0,
					SimulatedResponseVAUseVars.getMaximumtogeneraterandomvalsfornumaGcompletion()));
			setDefaultNumCompletedE(getUtilitiesstaticinstance().randBetween(0,
					SimulatedResponseVAUseVars.getMaximumtogeneraterandomvalsfornumaGcompletion()));
			setDefaultNumCompletedF(getUtilitiesstaticinstance().randBetween(0,
					SimulatedResponseVAUseVars.getMaximumtogeneraterandomvalsfornumaGcompletion()));
			setDefaultNumCompletedG(getUtilitiesstaticinstance().randBetween(0,
					SimulatedResponseVAUseVars.getMaximumtogeneraterandomvalsfornumaGcompletion()));
			setCSIDDefaultResponse("");
			setDefaultVersionNumber(1);
			setDefaultformEditStatus(false);
			setDefaultformduplicationstatus(false);
			setDefaultformcompletionstatus(false);

			setDefaultformobject(new SerialBlob(new byte[1]));
			setImageFile(new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB));
			setDefaultFormId(new File("null.txt"));
			setDefaultFormLoadDate(SimulatedResponseVAUseVars.getCalendar().getTime());
			setDefaultRecordStatus(false);
			setDefaultOutputFile(new File("null.txt"));
			this.setVauseresponses(new VAUseResponses());
			
				this.getVauseresponses().simulateHelpCompletingFormsimulatedresponse(this.getVauseresponses().getHelpCompletingFormValueRange(),
						SimulatedResponseVAUseVars.getUtilitiesstaticinstance().randBetween(
								SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), SimulatedResponseVAUseVars.getMaximumtogenerateerrorvalforhelpcompleting()));
				this.getVauseresponses().simulateNonVAHospResponseDropOffSitesimulatedresponse(this.getVauseresponses().getNonVAHospResponseDropffSiteValueRange(), 
						SimulatedResponseVAUseVars.getUtilitiesstaticinstance().randBetween(
								SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), SimulatedResponseVAUseVars.getMaximumtogeneratererrorvalforvauseresponsevars()));
				this.getVauseresponses().simulateNonVANonRxsimulatedresponse(this.getVauseresponses().getNonVAHospResponseDropffSiteValueRange(), 
						SimulatedResponseVAUseVars.getUtilitiesstaticinstance().randBetween(
								SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), SimulatedResponseVAUseVars.getMaximumtogeneratererrorvalforvauseresponsevars()));
				this.getVauseresponses().simulateNonVARxsimulatedresponse(this.getVauseresponses().getNonVAHospResponseDropffSiteValueRange(), 
						SimulatedResponseVAUseVars.getUtilitiesstaticinstance().randBetween(
								SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), SimulatedResponseVAUseVars.getMaximumtogeneratererrorvalforvauseresponsevars()));
				this.getVauseresponses().simulateVAHospResponseDropoffSitesimulatedresponse(this.getVauseresponses().getVAHospResponseDropoffSiteValueRange(), 
						SimulatedResponseVAUseVars.getUtilitiesstaticinstance().randBetween(
								SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), SimulatedResponseVAUseVars.getMaximumtogeneratevahospresponsedropoffsiteerrorval()));

				this.getVauseresponses().simulateVANonRxsimulatedresponse(this.getVauseresponses().getVANonRxValueRange(), 
						SimulatedResponseVAUseVars.getUtilitiesstaticinstance().randBetween(
								SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), SimulatedResponseVAUseVars.getMaximumtogeneratererrorvalforvauseresponsevars()));
				this.getVauseresponses().simulateVARxsimulatedresponse(this.getVauseresponses().getVARxValueRange(), 
						SimulatedResponseVAUseVars.getUtilitiesstaticinstance().randBetween(
								SimulatedResponseVAUseVars.getMinimumtogenerateerrorval(), SimulatedResponseVAUseVars.getMaximumtogeneratererrorvalforvauseresponsevars()));
				
				
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	// access getters from inner class for load date, record status, version number,completed form, csid, edit status, 
	// form id, form duplication status, form scan date, help completing form, image, mail code, non va hosp drop off site,
	// non va non rx, non va rx, num completed, num completed a-f, output filename, form completion time

	/**
	 * @return the vausevars
	 */
	/**
	 * @return
	 */
	public VAUseResponses getVauseresponses() {
		try {
			return this.vauseresponses;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.vauseresponses;
	}

	/**
	 * @param vausevars the vausevars to set
	 */
	/**
	 * @param vausevars
	 */
	private void setVauseresponses(VAUseResponses vausevars) {
		try {
			this.vauseresponses = vausevars;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int getErrorvaltointroducenoise() {
		// TODO Auto-generated method stub
		return maximumtogeneratererrorvalForVAUseResponseVars;
	}
}
