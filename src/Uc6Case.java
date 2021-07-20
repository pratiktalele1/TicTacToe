
public class Uc6Case extends Uc7Case {
	public void uC6() {
		int firstMove = (int) Math.random() * 2;
		if (firstMove == 0) {
			System.out.println("computer move");
			int nextMove = (int) (Math.random() * 9);
			gameBoard[nextMove] = this.pc;
			//uC1Case();

		} else {
			System.out.println("player move");
		}

	}

}
