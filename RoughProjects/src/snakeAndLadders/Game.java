package snakeAndLadders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter player 1 name:");
		String p1 = scan.next();
		System.out.print("enter player 2 name:");
		String p2 = scan.next();
		int positionOfP1 = 0, positionOfP2 = 0, counter = 0, p1x = 0, p1y = 0, p2x = 0, p2y = 0;
		boolean loop = true;
		while (loop) {
			if (counter % 2 == 0) {
				System.out.print("its player " + p1 + " chance(press r to roll):");
				char ch = scan.next().charAt(0);
				int rolled = rand();
				System.out.println("you got:" + rolled);
				if (rolled == 6) {
					System.out.print("u got 6 so u can throw again(press r to throw):");
					ch = scan.next().charAt(0);
					int rolledAgain = rand();
					rolled = 6 + rolledAgain;
					System.out.println("you got:6+" + rolledAgain + "=" + rolled);
				}
				positionOfP1 = positionOfP1 + rolled;
				p1x = positionOfP1 / 10;
				p1y = positionOfP1 % 10;
				counter++;
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						if (p1x == i && p1y == j) {
							System.out.print("[x_x]");
						} else {
							if (p2x == i && p2y == j) {
								System.out.print("[-_-]");
							} else {
								System.out.print("[   ]");
							}
						}
					}
					System.out.println();
				}
			} else {
				System.out.print("its player " + p2 + " chance(press r to roll):");
				char ch = scan.next().charAt(0);
				int rolled = rand();
				System.out.println("you got:" + rolled);
				if (rolled == 6) {
					System.out.print("u got 6 so u can throw again(press r to throw):");
					ch = scan.next().charAt(0);
					int rolledAgain = rand();
					rolled = 6 + rolledAgain;
					System.out.println("you got:6+" + rolledAgain + "=" + rolled);
				}
				positionOfP2 = positionOfP2 + rolled;
				p2x = positionOfP2 / 10;
				p2y = positionOfP2 % 10;
				counter++;
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						if (p2x == i && p2y == j) {
							System.out.print("[-_-]");
						} else {
							if (p1x == i && p1y == j) {
								System.out.print("[x_x]");
							} else {
								System.out.print("[   ]");
							}
						}
					}
					System.out.println();
				}
			}
			if (positionOfP1 >= 99 || positionOfP2 >= 99) {
				if (positionOfP1 >= 99)
					System.out.println("player " + p1 + " won");
				if (positionOfP2 >= 99)
					System.out.println("player " + p2 + " won");
				loop = false;
			}
		}
		System.out.println("thanks for playing the game");
		scan.close();
	}

	static int rand() {
		int value;
		ArrayList<Integer> dice = new ArrayList<Integer>();
		dice.add(1);
		dice.add(2);
		dice.add(3);
		dice.add(4);
		dice.add(5);
		dice.add(6);
		Collections.shuffle(dice);
		value = dice.get(0);
		return value;
	}

}
