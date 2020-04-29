import java.util.Scanner;

public class Rock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char win = '0';
		while(win == '0') {
			String a, b;

			while(true) {
				System.out.print("person-A >> ");
				a = sc.next();
				if(a.equals("가위")||a.equals("바위")||a.equals("보")) break;
				System.out.println("오류: 가위, 바위, 보 중 하나를 다시 입력하세요.");
			}
			
			
			while(true) {
				System.out.print("person-B >> ");
				b = sc.next();
				if(b.equals("가위")||b.equals("바위")||b.equals("보")) break;
				System.out.println("오류: 가위, 바위, 보 중 하나를 다시 입력하세요.");
			}
			
			if(a.equals("가위")) {
				if(b.equals("바위")) win = 'B';
				else if(b.equals("보")) win = 'A';
			}
			else if(a.equals("바위")) {
				if(b.equals("보")) win = 'B';
				else if(b.equals("가위")) win = 'A';
			}
			else if(a.equals("보")) {
				if(b.equals("가위")) win = 'B';
				else if(b.equals("바위")) win = 'A';
			}
			if(win == '0') System.out.println("무승부입니다. 재경기합니다.");
		}
		
		System.out.println("승자는 person-" + win + " 입니다." + "\n승자를 가려냈으므로 게임을 종료합니다.");
		
		sc.close();
	}

}
