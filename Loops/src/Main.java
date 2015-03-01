
public class Main {

	static private String[] months=
		{"Januari", "Februari", "March",
		"April", "May", "June", "July",
		"August", "September", "October",
		"November", "December"};
	
	
	public static void main(String[] args) {
		// Counter loops
//		for (int i = 0; i < months.length; i++) {
//			System.out.println(months[i]);
//		}
		
		
		// For each loop
//		for (String month : months) {
//			System.out.println(month);
//		}
		
		
		// While loop
//		int counter = 0;
//		while (counter < months.length) {
//			System.out.println(months[counter]);
//			counter++;
//		}
		
		
		// do while loop
		int counter = 0;
		 do {
			System.out.println(months[counter]);
			counter++;
		} while (counter < months.length);

	}

}
