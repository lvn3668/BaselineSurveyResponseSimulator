package Utilities;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import simulatedDiseaseResponse.simulatedDiseasePresenceAbsenceResponseForFamilyMembers;

public class Utilities {

	private Random random;

	public Utilities() {
		// TODO Auto-generated constructor stub
		this.random = new Random();
	}

	public int checkIfSiblingHasAlzheimers(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAlzheimerspresenceabsencesimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAlzheimers(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getAlzheimerspresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasAlzheimers(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAlzheimerspresenceabsencesimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAlzheimers(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAlzheimerspresenceabsencesimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAlzheimers(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getAlzheimerspresenceabsencesimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAlzheimers(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getAlzheimerspresenceabsencesimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAlzheimers(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getAlzheimerspresenceabsencesimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAlzheimers(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling7 != null && sibling7 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling7.getAlzheimerspresenceabsencesimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAlzheimers(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling7 != null && sibling7 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling7.getAlzheimerspresenceabsencesimulatedresponse() == 1)
				|| (sibling8 != null && sibling8 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling8.getAlzheimerspresenceabsencesimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAsthma(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAsthmapresenceabsencesimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAsthma(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getAsthmapresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasAsthma(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAsthmapresenceabsencesimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAsthma(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAsthmapresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAsthma(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getAsthmapresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAsthma(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getAsthmapresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAsthma(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getAsthmapresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAsthma(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling7 != null && sibling7 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling7.getAsthmapresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasAsthma(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling7 != null && sibling7 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling7.getAsthmapresenceabsencesimulatedresponse() == 1)
				|| (sibling8 != null && sibling8 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling8.getAsthmapresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBipolar(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getBipolarpresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasBipolarDisorder(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBipolarpresenceabsencesimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBipolarDisorder(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBipolarpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBipolarDisorder(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBipolarpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBipolarDisorder(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getBipolarpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBipolarDisorder(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getBipolarpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBipolarDisorder(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getBipolarpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBipolarDisorder(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling7 != null && sibling7 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling7.getBipolarpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBipolarDisorder(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling7 != null && sibling7 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling7.getBipolarpresenceabsencesimulatedresponse() == 1)
				|| (sibling8 != null && sibling8 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling8.getBipolarpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBreastCancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBreastcancersimulatedresponse() == 1)) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBreastCancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getBreastcancersimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasBreastCancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBreastcancersimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBreastcancersimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBreastCancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBreastcancersimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBreastcancersimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBreastcancersimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBreastCancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBreastcancersimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBreastcancersimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBreastcancersimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getBreastcancersimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBreastCancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBreastcancersimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBreastcancersimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBreastcancersimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getBreastcancersimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getBreastcancersimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBreastCancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBreastcancersimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBreastcancersimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBreastcancersimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getBreastcancersimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getBreastcancersimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getBreastcancersimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBreastCancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBreastcancersimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBreastcancersimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBreastcancersimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getBreastcancersimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getBreastcancersimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getBreastcancersimulatedresponse() == 1)
				|| (sibling7 != null && sibling7 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling7.getBreastcancersimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasBreastCancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getBreastcancersimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getBreastcancersimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getBreastcancersimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getBreastcancersimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getBreastcancersimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getBreastcancersimulatedresponse() == 1)
				|| (sibling7 != null && sibling7 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling7.getBreastcancersimulatedresponse() == 1)
				|| (sibling8 != null && sibling8 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling8.getBreastcancersimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasCholesterol(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getCholesterolpresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasCholesterol(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1 != null && sibling1 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
				&& sibling1.getCholesterolpresenceabsencesimulatedresponse() == 1)
				|| (sibling2 != null && sibling2 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling2.getCholesterolpresenceabsencesimulatedresponse() == 1)
				|| (sibling3 != null && sibling3 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling3.getCholesterolpresenceabsencesimulatedresponse() == 1)
				|| (sibling4 != null && sibling4 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling4.getCholesterolpresenceabsencesimulatedresponse() == 1)
				|| (sibling5 != null && sibling5 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling5.getCholesterolpresenceabsencesimulatedresponse() == 1)
				|| (sibling6 != null && sibling6 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling6.getCholesterolpresenceabsencesimulatedresponse() == 1)
				|| (sibling7 != null && sibling7 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling7.getCholesterolpresenceabsencesimulatedresponse() == 1)
				|| (sibling8 != null && sibling8 instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
						&& sibling8.getCholesterolpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasColoncancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getColoncancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling2.getColoncancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling3.getColoncancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling4.getColoncancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling5.getColoncancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling6.getColoncancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling7.getColoncancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling8.getColoncancerpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasColonCancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getColoncancerpresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasCoronaryarterydisease(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getCoronaryarterydiseasesimulatedresponse() == 1)
				|| (sibling2.getCoronaryarterydiseasesimulatedresponse() == 1)
				|| (sibling3.getCoronaryarterydiseasesimulatedresponse() == 1)
				|| (sibling4.getCoronaryarterydiseasesimulatedresponse() == 1)
				|| (sibling5.getCoronaryarterydiseasesimulatedresponse() == 1)
				|| (sibling6.getCoronaryarterydiseasesimulatedresponse() == 1)
				|| (sibling7.getCoronaryarterydiseasesimulatedresponse() == 1)
				|| (sibling8.getCoronaryarterydiseasesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasCoronaryArteryDisease(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getCoronaryarterydiseasesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasDepression(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getDepressionpresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasDepression(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getDepressionpresenceabsencesimulatedresponse() == 1)
				|| (sibling2.getDepressionpresenceabsencesimulatedresponse() == 1)
				|| (sibling3.getDepressionpresenceabsencesimulatedresponse() == 1)
				|| (sibling4.getDepressionpresenceabsencesimulatedresponse() == 1)
				|| (sibling5.getDepressionpresenceabsencesimulatedresponse() == 1)
				|| (sibling6.getDepressionpresenceabsencesimulatedresponse() == 1)
				|| (sibling7.getDepressionpresenceabsencesimulatedresponse() == 1)
				|| (sibling8.getDepressionpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasDiabetes(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getDiabetespresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasDiabetes(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getDiabetespresenceabsencesimulatedresponse() == 1)
				|| (sibling2.getDiabetespresenceabsencesimulatedresponse() == 1)
				|| (sibling3.getDiabetespresenceabsencesimulatedresponse() == 1)
				|| (sibling4.getDiabetespresenceabsencesimulatedresponse() == 1)
				|| (sibling5.getDiabetespresenceabsencesimulatedresponse() == 1)
				|| (sibling6.getDiabetespresenceabsencesimulatedresponse() == 1)
				|| (sibling7.getDiabetespresenceabsencesimulatedresponse() == 1)
				|| (sibling8.getDiabetespresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasHypertension(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getHypertensionpresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasHypertension(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getHypertensionpresenceabsencesimulatedresponse() == 1)
				|| (sibling2.getHypertensionpresenceabsencesimulatedresponse() == 1)
				|| (sibling3.getHypertensionpresenceabsencesimulatedresponse() == 1)
				|| (sibling4.getHypertensionpresenceabsencesimulatedresponse() == 1)
				|| (sibling5.getHypertensionpresenceabsencesimulatedresponse() == 1)
				|| (sibling6.getHypertensionpresenceabsencesimulatedresponse() == 1)
				|| (sibling7.getHypertensionpresenceabsencesimulatedresponse() == 1)
				|| (sibling8.getHypertensionpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasKidneynodialysis(
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getKidneynodialysispresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasKidneynodialysis(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getKidneynodialysispresenceabsencesimulatedresponse() == 1)
				|| (sibling2.getKidneynodialysispresenceabsencesimulatedresponse() == 1)
				|| (sibling3.getKidneynodialysispresenceabsencesimulatedresponse() == 1)
				|| (sibling4.getKidneynodialysispresenceabsencesimulatedresponse() == 1)
				|| (sibling5.getKidneynodialysispresenceabsencesimulatedresponse() == 1)
				|| (sibling6.getKidneynodialysispresenceabsencesimulatedresponse() == 1)
				|| (sibling7.getKidneynodialysispresenceabsencesimulatedresponse() == 1)
				|| (sibling8.getKidneynodialysispresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasLiverdisease(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getLiverdiseasepresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasLiverdisease(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getLiverdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling2.getLiverdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling3.getLiverdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling4.getLiverdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling5.getLiverdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling6.getLiverdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling7.getLiverdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling8.getLiverdiseasepresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasLungcancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getLungcancerpresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasLungcancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getLungcancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling2.getLungcancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling3.getLungcancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling4.getLungcancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling5.getLungcancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling6.getLungcancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling7.getLungcancerpresenceabsencesimulatedresponse() == 1)
				|| (sibling8.getLungcancerpresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasLungdisease(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getLungdiseasepresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasLungdisease(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getLungdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling2.getLungdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling3.getLungdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling4.getLungdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling5.getLungdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling6.getLungdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling7.getLungdiseasepresenceabsencesimulatedresponse() == 1)
				|| (sibling8.getLungdiseasepresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasOthercancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getOthercancersimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasOthercancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getOthercancersimulatedresponse() == 1) || (sibling2.getOthercancersimulatedresponse() == 1)
				|| (sibling3.getOthercancersimulatedresponse() == 1)
				|| (sibling4.getOthercancersimulatedresponse() == 1)
				|| (sibling5.getOthercancersimulatedresponse() == 1)
				|| (sibling6.getOthercancersimulatedresponse() == 1)
				|| (sibling7.getOthercancersimulatedresponse() == 1)
				|| (sibling8.getOthercancersimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasProstatecancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getProstatecancersimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasProstatecancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getProstatecancersimulatedresponse() == 1) || (sibling2.getProstatecancersimulatedresponse() == 1)
				|| (sibling3.getProstatecancersimulatedresponse() == 1)
				|| (sibling4.getProstatecancersimulatedresponse() == 1)
				|| (sibling5.getProstatecancersimulatedresponse() == 1)
				|| (sibling6.getProstatecancersimulatedresponse() == 1)
				|| (sibling7.getProstatecancersimulatedresponse() == 1)
				|| (sibling8.getProstatecancersimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasSkincancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getSkincancersimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasSkincancer(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getSkincancersimulatedresponse() == 1) || (sibling2.getSkincancersimulatedresponse() == 1)
				|| (sibling3.getSkincancersimulatedresponse() == 1) || (sibling4.getSkincancersimulatedresponse() == 1)
				|| (sibling5.getSkincancersimulatedresponse() == 1) || (sibling6.getSkincancersimulatedresponse() == 1)
				|| (sibling7.getSkincancersimulatedresponse() == 1) || (sibling8.getSkincancersimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public int checkIfSiblingHasStroke(simulatedDiseasePresenceAbsenceResponseForFamilyMembers... siblingargs) {
		for (simulatedDiseasePresenceAbsenceResponseForFamilyMembers simulateddiseaseresponse : siblingargs) {
			if (simulateddiseaseresponse != null
					&& simulateddiseaseresponse instanceof simulatedDiseasePresenceAbsenceResponseForFamilyMembers
					&& simulateddiseaseresponse.getStrokepresenceabsencesimulatedresponse() == 1) {
				return 1;
			}
		}
		return 0;
	}

	public int checkIfSiblingHasStroke(simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling1,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling2,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling3,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling4,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling5,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling6,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling7,
			simulatedDiseasePresenceAbsenceResponseForFamilyMembers sibling8) {
		if ((sibling1.getStrokepresenceabsencesimulatedresponse() == 1)
				|| (sibling2.getStrokepresenceabsencesimulatedresponse() == 1)
				|| (sibling3.getStrokepresenceabsencesimulatedresponse() == 1)
				|| (sibling4.getStrokepresenceabsencesimulatedresponse() == 1)
				|| (sibling5.getStrokepresenceabsencesimulatedresponse() == 1)
				|| (sibling6.getStrokepresenceabsencesimulatedresponse() == 1)
				|| (sibling7.getStrokepresenceabsencesimulatedresponse() == 1)
				|| (sibling8.getStrokepresenceabsencesimulatedresponse() == 1)

		) {
			return 1;
		}
		return 0;
	}

	public Year extractYearFromDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return Year.of(calendar.get(Calendar.YEAR));
	}

	public Year extractYearFromDate(LocalDate localdate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(Date.from(localdate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		return Year.of(calendar.get(Calendar.YEAR));
	}

	public int generateRandomNumber(int upperbound) {
		return (this.random.nextInt(upperbound));
	}

	private Random getRandom() {
		return this.random;
	}

	public int randBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}

	public float randFloatBetween(int start, int end) {
		return (start + this.getRandom().nextFloat() * (end - start));
	}

}
