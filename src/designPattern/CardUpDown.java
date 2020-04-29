package designPattern;

import java.util.Scanner;

public class CardUpDown {
	
	static Scanner sc = new Scanner(System.in);
	
	static boolean keepgame() {
		System.out.print("Collect! More game?(y/n)");
		String keep = sc.next();
		if(keep.equals("y")||keep.equals("Y")) return true;
		else if(keep.equals("n")||keep.equals("N")) return false;
		else return false;
	}
	
	public static void game_dowhile() {
		boolean userKeep = false;
		do {
			int answer = makeRandom();
			System.out.println("Hidden number (1~100) is created. Try it!");
			
			int userAnswer;
			
			do {
				userAnswer = sc.nextInt();
				if(userAnswer > answer) {
					System.out.println("Lower!");
				}
				else if(userAnswer < answer) {
					System.out.println("Higher!");
				} else {
					userKeep = keepgame();
					if(userKeep == true) continue;
					else if(userKeep == false) break;
				}
			} while (userAnswer != answer);
			
		} while(userKeep);
	}
	
	public static void game_while() {
		boolean userKeep = true;
		while(userKeep) {
			int answer = makeRandom();
			System.out.println("Hidden number (1~100) is created. Try it!");
			
			int userAnswer = 0;
			
			while(userAnswer != answer) {
				userAnswer = sc.nextInt();
				if(userAnswer > answer) {
					System.out.println("Lower!");
				}
				else if(userAnswer < answer) {
					System.out.println("Higher!");
				} else {
					userKeep = keepgame();
					if(userKeep == true) continue;
					else if(userKeep == false) break;
				}
			}
			
		}
	}
	
	public static void game_for() {
		boolean userKeep = true;
		for(;userKeep;) {
			int answer = makeRandom();
			System.out.println("Hidden number (1~100) is created. Try it!");
			
			int userAnswer = 0;
			
			for(;userAnswer != answer;) {
				userAnswer = sc.nextInt();
				if(userAnswer > answer) {
					System.out.println("Lower!");
				}
				else if(userAnswer < answer) {
					System.out.println("Higher!");
				} else {
					userKeep = keepgame();
					if(userKeep == true) continue;
					else if(userKeep == false) break;
				}
			} 
			
		}
	}
	
	static int makeRandom() {
		int num = (int)((Math.random() * 100)+1);
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.print("Welcome!\nChoice loop style 1) Do-While 2) While 3) For :");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1: game_dowhile(); break;
				case 2: game_while(); break;
				case 3: game_for(); break;
				default: break;
			}
			
			System.out.println("Game Exited!");
			sc.close();
	}

}
