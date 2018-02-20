import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		ArrayList<String> locations = new ArrayList<String>();
		locations.add("2");
		locations.add("3");
		locations.add("4");
		dot.setLocationCells(locations);
		String result;
		boolean flag = false;
		int muda = 0;
		String userguess = "1";
		result = dot.checkYourself(userguess);
		do {
			muda = Integer.parseInt(userguess);
			muda = muda + 1;
			userguess = muda + "";
			result = dot.checkYourself(userguess);
			System.out.println(userguess+ "<-> hit");

			if (locations.isEmpty()) {
				flag = false;
			} else {
				flag = true;
			}

		} while (flag);
	}
}
