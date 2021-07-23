package ticTacToe;

public class ThreeXThree {
	static void board() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("___"+"  ");
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		board();
	}

}
