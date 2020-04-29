package designPattern;

import java.util.Scanner;

class Player {
	static Scanner plScanner = new Scanner(System.in);
	public String userName;
	public String userWord;
	
	void getWordFromUser() { //userWord(�ܾ�)�� �Է¹���
		userWord = plScanner.next();
	}
	
	boolean checkSuccess(char wordLast) {
		boolean c = false;
		if(wordLast == userWord.charAt(0)) { //�������� �Ǻ�
			c = true;
		}
		if(!c) {
			plScanner.close(); //���� �ƴϸ� ���� ����ǹǷ� ��ĳ�� ����
		}
		return c;
	}
}

public class WordGameApp {
	static Scanner sc = new Scanner(System.in);
	
	static void run(int userCnt, Player[] pl) {
		String word = "�ƹ���";
		System.out.println("�����ϴ� �ܾ�� ["+word+"]�Դϴ�.");
		int cnt = 0;
		while(true) {
			int turn = (cnt % userCnt); //���������� �����ϱ� ���� turn ���� ����
			System.out.print(pl[turn].userName+">>");
			pl[turn].getWordFromUser();
			//player Ŭ������ checkSucess �޼ҵ�� �������� �Ǻ�
			if(pl[turn].checkSuccess(word.charAt(word.length()-1))) {
				word = pl[turn].userWord; //���� �� word ��ü
			} else { //���� �� ���� ����
				System.out.println(pl[turn].userName+"���� �����ϴ�. ������ �����մϴ�.");
				break;
			}
			++cnt;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("�����ձ� ������ �����մϴ�.");
		System.out.print("�����ϴ� �ο��� ����Դϱ� >>");
		int userCnt = sc.nextInt();
		
		Player[] pl = new Player[userCnt]; //userCnt��ŭ player Ŭ���� ����
		
		for(int i=0; i<userCnt; i++) {
			System.out.print(i+1+"�� �������� �̸��� �Է��ϼ��� >>");
			pl[i] = new Player();
			pl[i].userName = sc.next();
		}
		//���� �Ϸ�, ���� ����
		run(userCnt, pl);
		//���� ����(break)
		sc.close();
	}
}
