import java.util.Scanner;

public class Uc3Case extends Uc4Case {
	public void uC3() {
		System.out.print("Enter location number between 1-9 - ");
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();

		if (getUserInput > 0 && getUserInput < 10) {

			if (gameBoard[getUserInput - 1] == ' ') {
				System.out.println("empty location");
				uC4(getUserInput);

			} else {
				System.out.println("filled location");
				uC3();
			}
		} else {
			System.out.println("wrong input");
		}
	}

}
