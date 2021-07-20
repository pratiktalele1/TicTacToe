import java.util.Scanner;

public class Uc2Case extends Uc3Case {
	public char player;
	public char pc;
	public void uC2() {
		System.out.print("Enter for player X or O - ");
		Scanner scanInput = new Scanner(System.in);
		char getUserInput = scanInput.next().charAt(0);

		if (getUserInput == 'X' || getUserInput == 'O') {
			if (getUserInput == 'X') {
				this.player = 'X';
				this.pc = 'O';
			} else {
				this.player = 'O';
				this.pc = 'X';
			}
		} else {
			System.out.println("wrong input");
			uC2();
		}
		System.out.println("player select - " + this.player + " pc select - " + this.pc);

	}

}
