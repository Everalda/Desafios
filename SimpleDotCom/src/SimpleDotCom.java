import java.util.ArrayList;

public class SimpleDotCom {

	private ArrayList<String> locationCells;

	public void setLocationCells(ArrayList<String> cells) {
		locationCells = cells;
	}

	public String checkYourself(String stringGuess) {

		int index = locationCells.indexOf(stringGuess);
		String result = "miss";
		if (index >= 0) {
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		return result;
	}
}
