package sugoroku;

/**
 * 普通な実装クラス
 * @author 3d160
 *
 */
public class NormalCell extends Cell {

	/**
	 * コンストラクタ
	 */
	public NormalCell() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	
	@Override
	public boolean doEvent(Coma coma) {	
		coma.addPoint(100);
		return true;
	}

	@Override
	public String getCaption() {
		return "風が吹いてる…";
	}
	
	@Override
	public String getMark() {
		return "~";
	}

}
