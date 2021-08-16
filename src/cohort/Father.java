package cohort;

import java.time.Instant;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;

import Diseases.ProstateCancer;
import Interfaces.Birthdeathinterfacemethods;

/**
 * @author Lalitha Viswanathan
 * Affiliation MAVERIC / VABHS 
 *
 */
public class Father extends Cohort implements Birthdeathinterfacemethods{
	// Only presence / absence is recorded
	// Not year diagnosed or whether meds administered

	ProstateCancer FatherProstateCancer;
	public Father(Cohort cohort) throws Exception {
		// TODO Auto-generated constructor stub
		FatherProstateCancer = new ProstateCancer(cohort);
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
	/**
	 * MomBrthYr,Year MomLive,"{0,1}" MomDthYr,Year TBD
	 */
	
	public Date simulateDateOfBirth(Cohort cohort) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(cohort.getBirthDateSimulated());
	
			// Father's DOB precedes Cohorts DOB
			Date simulatedDOB = Date.from(Instant.ofEpochSecond(ThreadLocalRandom.current().nextLong(
					(new GregorianCalendar(calendar.get(Calendar.YEAR) - 40, 0, 0).getTime()).getTime(),
					(new GregorianCalendar(calendar.get(Calendar.YEAR) - 20, 0, 0).getTime()).getTime())));
			this.setBirthDateSimulated(simulatedDOB);
			calendar.setTime(simulatedDOB);
			this.setBirthyear(Year.parse(new StringBuilder(calendar.get(Calendar.YEAR))));
			return this.getBirthDateSimulated();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getBirthDateSimulated();
	}
	
	 /** DadBrthYr,Year
	 DadLive,"{0,1}"
	 DadDthYr,Year **/

	//
}
