package cohort;

import java.time.Instant;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;

import Interfaces.Birthdeathinterfacemethods;

/**
 * @author Lalitha Viswanathan
 * Affiliation MAVERIC / VABHS 
 *
 */
public class Mother extends Cohort implements Birthdeathinterfacemethods {
	public Mother(Cohort cohort) throws Exception {
		// TODO Auto-generated constructor stub

	}

	@Override
	public int simulateAliveOrDead() {
		// TODO Auto-generated method stub
		return 1;
	}

	/**
	 * MomBrthYr,Year MomLive,"{0,1}" MomDthYr,Year TBD
	 */

	public Date simulateDateOfBirth(Cohort cohort) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(cohort.getBirthDateSimulated());

			// Mother's DOB precedes Cohorts DOB
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

	@Override
	public Year simulateYearOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.time.Year simulateYearOfDeath() {
		// TODO Auto-generated method stub
		return null;
	}

}
