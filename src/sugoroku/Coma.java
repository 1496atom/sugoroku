/**
 * 
 */
package sugoroku;

/**
 * すごろくのプレイヤー位置を表すコマクラス
 * @author 3d160
 */
public class Coma {
	
	private String name;
	
	/**
	 * 現在位置
	 */
	private int position;
	private int point;
	
	/**
	 * コンストラクタ
	 * @param name プレイヤー名
	 */
	public Coma( String name ) {
		this.name = name;
		this.position = 0;
	}
	/**
	 * このコマの現在位置を返します
	 * @return 位置を表す数値
	 */
	public int getPosition() {
		return this.position;
	}
	/**
	 * このコマが指定された分量進みます 
	 * @param amount すすむ量
	 */
	public void proceed(int amount) {	
		this.position += amount;
	}
	public void addPoint( int amount ) {
		System.out.println(name + "は" + amount + "ポイントをゲットした！");
		this.point += amount;
	}
	/**
	 * このコマの現在の状態を表示します
	 */
	public void showProfile() {
		System.out.println( name
				+ "の現在のポイントは" + point + "で、"
				+ position + "コマ目にいます");
	}

}
