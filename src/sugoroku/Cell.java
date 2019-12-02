package sugoroku;

/**
 * すごろくに使用されるマス目を表現する抽象基底クラス
 * @author 3d160
 *
 */
public abstract class Cell {

	/**
	 * コンストラクタ
	 */
	protected Cell() {
		
	}
	/**
	 * なにかしらイベントを実行できる予定
	 * @param coma イベントの対象となるコマ
	 * @return イベント処理の結果何かが変わるかどうかの情報を返す予定
	 */
	public abstract boolean doEvent( Coma coma );
	/**
	 * このマスの表示名
	 * @return 表示文字列
	 */
	public abstract String getCaption();
	/**
	 * このマス目のイメージ文字
	 * @return 
	 */
	
	public abstract String getMark();
}
