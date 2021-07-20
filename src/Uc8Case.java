
public class Uc8Case extends Uc12Case {
	public void uC8() {
		int random=(int)(Math.random()*9+1);
		if(gameBoard[random-1]==' ') {
			gameBoard[random-1]=this.pc;
		}else {
			uC8();
		}
	}
}
