package sk.tsystems.gamestudio.game.guessnumber;

import java.util.Scanner;

public class TipovaciaHra {
	public static void main(String[] args) {

		int rdmint = 0;
		int guess = 0;
		while (rdmint == 0) {
			rdmint = (int) (Math.random() * 10);
		}

		Scanner input = new Scanner(System.in);
		while (guess != rdmint) {
			System.out.print("Zadaj cislo medzi 0 a 10: ");
			String userinput = input.nextLine();
			try {
				guess = Integer.parseInt(userinput);
			} catch (NumberFormatException e) {
			}
			boolean range = ((guess < 100) && (guess > 0));
			if ((guess == rdmint) && range) {
				System.out.println("Spravne :D ");
			} else if ((guess > rdmint) && range) {
				System.out.println("Prilis vysoko");
			} else if ((guess < rdmint) && range) {
				System.out.println("Prilis nizko");
			} else {
				System.out.println("Zadal si blbost :D ");
			}
		}
	}
}
