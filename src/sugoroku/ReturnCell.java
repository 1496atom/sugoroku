/**
 * 
 */
package sugoroku;

/**
 * 戻されて悲しいマス目
 * @author 3d160
 */
public class ReturnCell extends Cell {

	/**
	 * このマスで撤退するコマ数（怖さ）
	 */
	private int amount;
	/**
	 * 
	 */
	public ReturnCell(int amount) {
		this.amount = amount;
	}

	@Override
	public boolean doEvent(Coma coma) {
		System.out.println("きけんなので戻ろう");
		coma.proceed( -amount );
		return true;
	}

	@Override
	public String getCaption() {
		return "ピラニアのいる川に差し掛かった。危ないっ";
	}
	
	@Override
	public String getMark() {
		return "<";
	}

}
