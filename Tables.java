public class Tables {

	public void generateTable() {
		// Put the code for your times-table here
		int i = 1;
		for (i = 1; i <= 12; i++) {
			int j = 1;
			for (j = 1; j <= 12; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();

		}

	}
}
