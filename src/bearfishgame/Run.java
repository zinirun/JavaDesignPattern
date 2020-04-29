package bearfishgame;

import java.util.Scanner;

abstract class GameObject{
	protected int distance;
	protected int x, y;
	public GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	public int getX() { return x; }
	public int getY() {	return y; }
	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY()) return true;
		else return false;
	}
	public abstract void move();
	public abstract char getShape();
}

class Bear extends GameObject{ // move by user
	protected Scanner sc = new Scanner(System.in);
	
	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}
	
	@Override
	public void move() {
		System.out.print("키를 입력하세요 (▲D ▼S ◀A ▶F) -> ");
		String userKey = sc.next(); // user typing
		
		Game.drawArray[this.x][this.y] = '-'; // re-define previous array 
		
		switch(userKey.toLowerCase()) {
		case "a":
			if(y-distance>=0) y-=distance; // if it's out of array's size, just keep this direction
			else y=0;
			break;
		case "s":
			if(x+distance<=9) x+=distance;
			else x=9;
			break;
		case "d":
			if(x-distance>=0) x-=distance;
			else x=0;
			break;
		case "f":
			if(y+distance<=19) y+=distance;
			else y=19;
			break;
		default: System.out.println("(a/s/d/f)만 입력하세요!"); break; // print error if's not direction key 
		}
		
		Game.drawArray[x][y] = this.getShape(); // update array with changed x,y
	}
	
	@Override
	public char getShape() {
		return 'ß';
	}
	
	public void endGame() {
		sc.close();
	}
}

class Fish extends GameObject{ // move by system
	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}
	
	@Override
	public void move() {
		int direction = (int) (Math.random()*4); // create 0~3 random number to make direction
		Game.drawArray[this.x][this.y] = '-'; // re-define previous array
		
		switch(direction) {
		case 0: // must consider distance is not always 1..
			if(y-distance>=0) y-=distance; // if it's out of array's size, just keep this direction
			else y=0;
			break;
		case 1:
			if(x+distance<=9) x+=distance;
			else x=9;
			break;
		case 2:
			if(x-distance>=0) x-=distance;
			else x=0;
			break;
		case 3:
			if(y+distance<=19) y+=distance;
			else y=19;
			break;
		}
		Game.drawArray[x][y] = this.getShape(); // update array with changed x,y
	}
	
	@Override
	public char getShape() {
		return 'Ð';
	}
}

class Game{
	
	Bear bear;
	Fish fish;
	
	public static char drawArray[][] = new char[10][20];
	
	public void set() { // initialize bear, fish, drawArray 
		bear = new Bear(0, 0, 1);
		fish = new Fish(4, 4, 1);
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 20; j++) drawArray[i][j] = '-';
		}
		
		drawArray[bear.x][bear.y] = bear.getShape();
		drawArray[fish.x][fish.y] = fish.getShape();
	}
	
	public void show() { // show drawArray
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 20; j++) System.out.print(drawArray[i][j]);
			System.out.println();
		}
	}
	
	public void win(int gameCnt) { // display if user win (collide)
		drawArray[bear.x][bear.y] = drawArray[fish.x][fish.y] = '#';
		show();
		System.out.println(gameCnt+"번의 시도 끝에 곰이 이겼습니다!");
		bear.endGame();
	}
	
	public void run() {
		int fishCnt, rand; // fishCnt: count for fish moved
		int gameCnt = 0; // to print at method win()
		
		while(true) {
			
			fishCnt = 0; // initialize if tried count is 5
			
			for(int i=0; i<5; i++) {
				show();
				bear.move(); // user typing
				gameCnt++;
				rand = (int)(Math.random()*2); // 50% move, 50% no-move
				
				if(rand == 1) { // if move
					if((++fishCnt)<=2) { // move fish if fish moved under 3
						fish.move();
					}
				}
				
				if((i == 3 && fishCnt == 0)||(i == 4 && fishCnt == 1)) { // if i-3, fishCnt-0 / i-4, fishCnt-1(it's rule) -> force move
					fish.move();
					fishCnt++;
				}
				
				if((bear.collide(fish)) == true) { // if bear.x, bear.y same with fish.x, fish.y -> win and return
					win(gameCnt); // display win
					return;
				}
			}
		}
	}
}

public class Run {
	public static void main(String[] args) {
		Game g = new Game();
		g.set(); // set game info first before run
		g.run(); // run game
		System.out.println("게임이 종료되었습니다.");
	}
}