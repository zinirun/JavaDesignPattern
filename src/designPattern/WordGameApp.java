package designPattern;

import java.util.Scanner;

class Player {
	static Scanner plScanner = new Scanner(System.in);
	public String userName;
	public String userWord;
	
	void getWordFromUser() { //userWord(단어)를 입력받음
		userWord = plScanner.next();
	}
	
	boolean checkSuccess(char wordLast) {
		boolean c = false;
		if(wordLast == userWord.charAt(0)) { //끝말인지 판별
			c = true;
		}
		if(!c) {
			plScanner.close(); //끝말 아니면 게임 종료되므로 스캐너 닫음
		}
		return c;
	}
}

public class WordGameApp {
	static Scanner sc = new Scanner(System.in);
	
	static void run(int userCnt, Player[] pl) {
		String word = "아버지";
		System.out.println("시작하는 단어는 ["+word+"]입니다.");
		int cnt = 0;
		while(true) {
			int turn = (cnt % userCnt); //지속적으로 진행하기 위해 turn 별도 선언
			System.out.print(pl[turn].userName+">>");
			pl[turn].getWordFromUser();
			//player 클래스의 checkSucess 메소드로 끝말인지 판별
			if(pl[turn].checkSuccess(word.charAt(word.length()-1))) {
				word = pl[turn].userWord; //성공 시 word 교체
			} else { //실패 시 게임 종료
				System.out.println(pl[turn].userName+"님이 졌습니다. 게임을 종료합니다.");
				break;
			}
			++cnt;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.print("참가하는 인원은 몇명입니까 >>");
		int userCnt = sc.nextInt();
		
		Player[] pl = new Player[userCnt]; //userCnt만큼 player 클래스 생성
		
		for(int i=0; i<userCnt; i++) {
			System.out.print(i+1+"번 참가자의 이름을 입력하세요 >>");
			pl[i] = new Player();
			pl[i].userName = sc.next();
		}
		//생성 완료, 게임 진행
		run(userCnt, pl);
		//게임 종료(break)
		sc.close();
	}
}
