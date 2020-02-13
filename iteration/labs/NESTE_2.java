package labs;

import java.util.Scanner;

public class NESTE_2 {

	public void go() {
		System.out.println("Input values in the following format: {NUMB} {CHAR}");
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			try {
				int count = Integer.valueOf(line.substring(0, line.indexOf(" ")));
				String value = line.substring(line.indexOf(" ") + 1);

				for (int i = 0; i <= count; i++) {
					for (int i2 = count; i2 > i; i2--)
						System.out.print(value);
					System.out.println();
				}
			} catch (Exception ex) {
				System.out.println("Error in input, please try again in the following format: {NUMB} {CHAR}");
			}
		}

		scanner.close();
	}
	
}
