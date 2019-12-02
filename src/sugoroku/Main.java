package sugoroku;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
/**
 * @author 3d166
 *
 */
public class Main {
	
	/**
	 * すごろくインスタンスで使用する乱数発生装置
	 */
	private Random rand = new Random();
	/**
	 * すごろくインスタンスで使用する入力装置
	 */
	private Scanner input = new Scanner(System.in); 
	/**
	 * すごろくマス目配置
	 */
	private Cell[] path;
	/**
	 * プレイヤーのコマ
	 */
	private Coma[] players;
	/**
	 * すごろくメインプログラム
	 * @param arg 起動時引数
	 */
	public static void main(String[] args) {
		
//		ダイスがあるはず
//		マス目があるはず
//			振り出し・あがりその他のりおいろなマスがあるはず
//		プレイヤーが存在するはず
//			どの位置にいるのかを記録する必要があるはず
//			お金の概念はいれるのか
//
//		どんなマスが存在しているのか 画面に出たほうがいいよね
//		競争するなら、それぞれのプレイヤーの位置がどこかわからないとね
		
//	Main m = new Main();
//	m.run();
	new Main().run();
	}
	
	/**
	 * すごろくプログラムの動作
	 */
	
	private void run() {
		initGame();
		
		//ターンの繰り返し
		boolean goal = false;
		do {
			showPath();
			
			boolean 
			for(int i =0;i<players.length; i++) {
			
				if( i ==0 ) {
					// プレイヤーがダイスを振る
					System.out.println("ダイスを振ってね（エンターキー入力！）");
					input.nextLine();	
			}
			int proceed = rand.nextInt(4)+1; //1~4適当に
			System.out.println(proceed + "がでたよ");

			//コマを出目分進める
			players[i].proceed(proceed);
			
			int pos = players[i].getPosition();
			if( pos < path.length) {
				Cell now = path[pos];
				//どんな
				System.out.println( now.getCaption());
				//マスに割りふられたイベントが発動する
				now.doEvent(players[i]);
				players[i].showProfile();
			}
			
			// もしゴールだったら終了
			goal = path.length -1 <= players[i].getPosition();
			if(goal) {
				System.out.println("ゴールやで");
				break;		
			}
			
		}while(!goal);
		
		exitGame();
	}
	
	/**
	 * 現状のすごろくの状態を表示する
	 */
	private void showPath() {
		for(int i = 0; i< path.length;i++) {
			if(i<10) {
				System.out.print("");
			}
			System.out.print( i +"");
		}
		//
		System.out.println();//改行
		
		//マス目のイメージを表示
		System.out.print(" ");
		for(int i= 0; i < path.length; i++) {
			System.out.print(" " + path[i].getMark() + " ");
		}
		System.out.println();//改行
		
		//プレイヤー位置を表示
		for(int i= 0; i < players.length; i++) {
			showComaPos( i );
		}

	}
	
	private void showComaPos(int pid) {
		Coma coma = players[pid];
		System.out.print( pid + ":");
		for(int i = 0; i< path.length;i++) {
			if(i != coma.getPosition()) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
		System.out.println();//改行
	}
	
	/**
	 * ゲームが終わった時の処理
	 */
	private void exitGame() {
		System.out.println("----最終結果----");
		showPath();
	}
	/**
	 * ゲームを始めるための下準備
	 */
	private void initGame() {
		//すごろくフィールド
		path = new Cell[] {
			new StartCell(),
			new NormalCell(),
			new ReturnCell(2),
			new NormalCell(),
			new NormalCell(),
			new NormalCell(),
			new NormalCell(),
			new ReturnCell(2),
			new NormalCell(),
			new NormalCell(),
			new NormalCell(),
			new NormalCell(),
			new NormalCell(),
			new NormalCell(),
			new ReturnCell(7),
			new NormalCell(),
			new ReturnCell(6),
			new NormalCell(),
			new NormalCell(),
			new GoalCell(),
		};
		
		players = new Coma[] {
				new Coma("(+_+)"),
				new Coma("COM1"),
				new Coma("COM2"),
				new Coma("COM3"),
				new Coma("COM4"),
		};
		System.out.println(path[0].getCaption());
		}
	}
	
} 