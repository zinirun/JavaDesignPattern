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
				if(a.equals("����")||a.equals("����")||a.equals("��")) break;
				System.out.println("����: ����, ����, �� �� �ϳ��� �ٽ� �Է��ϼ���.");
			}
			
			
			while(true) {
				System.out.print("person-B >> ");
				b = sc.next();
				if(b.equals("����")||b.equals("����")||b.equals("��")) break;
				System.out.println("����: ����, ����, �� �� �ϳ��� �ٽ� �Է��ϼ���.");
			}
			
			if(a.equals("����")) {
				if(b.equals("����")) win = 'B';
				else if(b.equals("��")) win = 'A';
			}
			else if(a.equals("����")) {
				if(b.equals("��")) win = 'B';
				else if(b.equals("����")) win = 'A';
			}
			else if(a.equals("��")) {
				if(b.equals("����")) win = 'B';
				else if(b.equals("����")) win = 'A';
			}
			if(win == '0') System.out.println("���º��Դϴ�. �����մϴ�.");
		}
		
		System.out.println("���ڴ� person-" + win + " �Դϴ�." + "\n���ڸ� ���������Ƿ� ������ �����մϴ�.");
		
		sc.close();
	}

}
