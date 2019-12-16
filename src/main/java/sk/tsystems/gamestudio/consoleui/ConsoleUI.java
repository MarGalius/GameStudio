//package sk.tsystems.gamestudio.consoleui;
//
//import java.util.Scanner;
//
//import sk.tsystems.gamestudio.Menu;
//import sk.tsystems.gamestudio.game.minesweeper.Minesweeper;
//
//public class ConsoleUI implements Menu {

//	private Scanner scanner;
//	
//	public ConsoleUI () {
//		scanner = new Scanner(System.in);
//	}
//	
//	@Override
//	public void display () {
//		do {
//			update();
//		} while (processInput());
//		
//		System.out.println("Howdy howdy");
//	}
//	private void update() {
//		System.out.println("Welcome !");
//		System.out.println("Select a game");
//		System.out.println("----------------------");
//		System.out.println("Minesweeper");
//		System.out.println("Puzzle");
//		System.out.println("Guess the number");
//		System.out.println("Exit");
//	}
//	
//	private boolean processInput() {
//		try {
//			int input = Integer.parseInt(scanner.nextLine());
//			switch (input) {
//			case 1:
//				runGame(new Minesweeper(3));
//				return true;
//			case 2:
//				runGame(new Puzzle(3));
//				return true;
//			case 3:
//				runGame(new GuessTheNumber(3));
//				return true;
//			case 4:
//				return false;
//			default:
//				System.err.println("Wrong number");
//			}			
//		} catch (NumberFormatException ex) {
//			System.err.println("Wrong input format");
//		}
//		
//	}
//	
//	private void runGame(Game game) {
//		displayScores(game.getName());
//		updateScore(game);
//	}
//	
//    
//	
//	
//	
//	
//	
//	
//	
////	
//	
//}
