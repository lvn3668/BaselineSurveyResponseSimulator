package mvpBaselineSurveyResponseSimulator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;
import java.util.Random;

/**
 * @author Lalitha Viswanathan
 * Affiliation MAVERIC / VABHS 
 *
 */
public class mvpbaselinedatasimulator {

	private final static String COMMA_DELIMITER = ",";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			new BufferedWriter(new FileWriter("/data/MVPresponses.csv"));

			BufferedReader br = new BufferedReader(new FileReader("/data/BaselineSurveyVariables.csv"));

			List<List<String>> result = new ArrayList<>();
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(COMMA_DELIMITER);
				values[1].replace("\"", "").replace("{", "").replace("}", "").split(COMMA_DELIMITER);

			}

			// System.out.println(result);
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException n) {
			n.printStackTrace();
		}
	}

	// TBD:
	// Simulate cohort
	// Simulate responses for adjunct (M, F, Mgp, Fgp, Sib)
//  Write out to file 
}
