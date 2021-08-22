package cohortUtils;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ValueRange;
import java.util.Date;

import Utilities.Utilities;
import randomizer.UniformDistribution;

public class CohortUtilities {

	protected static LocalDate deathDate = LocalDate.of(0001, 1, 1);

	/**
	 * @return the yearOfDeath
	 */
	protected static LocalDate getDeathDate() {
		try {
			return deathDate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deathDate;
	}

	/**
	 * @param yearOfDeath the yearOfDeath to set
	 */
	protected static void setDeathDate(LocalDate yearOfDeath) {
		try {
			CohortUtilities.deathDate = yearOfDeath;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	protected int aliveSimulatedResponse;
	// Dt,Year (2010)
	/**
	 *
	 */
	private java.util.Date birthDtSimulatedResponse;

	/**
	 *
	 */
	private int sexSimulatedResponse;

	/**
	 *
	 */
	private ValueRange sexValueRange;
	protected UniformDistribution uniformdistribution;
	private Utilities utilities;
	/**
	 *
	 */
	protected Year yearOfBirth; // extract from simulated birth date
	private Year yearOfDeath;

	protected CohortUtilities() throws Exception {
		try {
			this.setUtilities(new Utilities());
			this.setSexValueRange(ValueRange.of(0, 1));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return the aliveSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getAliveSimulatedResponse() {
		try {
			return this.aliveSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.aliveSimulatedResponse;

	}

	/**
	 * @return the birthDt
	 */
	/**
	 * @return
	 */
	public Date getBirthDateSimulated() {
		try {
			return this.birthDtSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.birthDtSimulatedResponse;

	}

	/**
	 * @return the sexSimulatedResponse
	 */
	/**
	 * @return
	 */
	public int getSexSimulatedResponse() {
		try {
			return this.sexSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sexSimulatedResponse;

	}

	/**
	 * @return the sexValueRange
	 */
	/**
	 * @return
	 */
	protected ValueRange getSexValueRange() {
		try {
			return this.sexValueRange;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.sexValueRange;

	}

	/**
	 * @return the uniformDistribution
	 */
	protected UniformDistribution getUniformdistribution() {
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
	protected Utilities getUtilities() {
		try {
			return this.utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.utilities;
	}

	/**
	 * @return the birthyear
	 */
	/**
	 * @return
	 */
	public Year getYearOfBirth() {
		try {
			return this.yearOfBirth;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.yearOfBirth;
	}

	/**
	 * @return the yearOfDeath
	 */
	public Year getYearOfDeath() {
		try {
			return this.yearOfDeath;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.yearOfDeath;
	}

	/**
	 * @param aliveSimulatedResponse the aliveSimulatedResponse to set
	 */
	/**
	 * @param aliveSimulatedResponse
	 */
	protected void setAliveSimulatedResponse(int aliveSimulatedValue) {
		try {
			this.aliveSimulatedResponse = aliveSimulatedValue;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param birthDt the birthDt to set
	 */
	/**
	 * @param birthDt
	 */
	protected void setBirthDateSimulated(java.util.Date birthDt) {
		try {
			this.birthDtSimulatedResponse = birthDt;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sexSimulatedResponse the sexSimulatedResponse to set
	 */
	/**
	 * @param sexSimulatedResponse
	 */
	protected void setSexSimulatedResponse(int sexSimulatedResponse) {
		try {
			this.sexSimulatedResponse = sexSimulatedResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param sexValueRange the sexValueRange to set
	 */
	/**
	 * @param sex
	 */
	protected void setSexValueRange(ValueRange sex) {
		try {
			this.sexValueRange = sex;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uniformDistribution the uniformDistribution to set
	 */
	protected void setUniformdistribution(UniformDistribution uniformDistribution) {
		try {
			this.uniformdistribution = uniformDistribution;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param utilities the utilities to set
	 */
	protected void setUtilities(Utilities utilities) {
		try {
			this.utilities = utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param birthyear the birthyear to set
	 */
	/**
	 * @param birthyear
	 * @throws Exception
	 */
	protected void setYearOfBirth(Year birthyear) throws Exception {
		try {
			this.yearOfBirth = birthyear;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param yearOfDeath the yearOfDeath to set
	 */
	protected void setYearOfDeath(Year yearOfDeath) {
		try {
			this.yearOfDeath = yearOfDeath;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected int simulateAliveOrDead() {
		// TODO Auto-generated method stub
		return 1;
	}

	/**
	 * @return
	 */
	protected int simulateSexValue() {
		try {
			this.setSexSimulatedResponse(this.getUtilities().randBetween((int) this.getSexValueRange().getMinimum(),
					(int) this.getSexValueRange().getMaximum()));
			return this.getSexSimulatedResponse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.getSexSimulatedResponse();
	}

	protected void simulateYearOfBirth(Year birthyear) {
		// TODO Auto-generated method stub
		try {
			this.setYearOfBirth(birthyear);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void simulateYearOfDeath() {
		// TODO Auto-generated method stub
		try {
			this.setYearOfDeath(this.getUtilities().extractYearFromDate(CohortUtilities.getDeathDate()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
