/**
 * 第7章 武士のお仕事
 *
 * 問題14 複数のインターフェースを実装する
 *
 * 勘定奉行インタフェース、文化人インターフェースを実装する。
 *
 * 藩士クラスに勘定奉行インターフェースと文化人インターフェースを
 * 実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 *
 */

package lesson07.challenge14;

//ここにIChiefTreasurerインターフェースを記述
interface IChiefTreasurer {
	void money();
}

//ここにICelebrityインターフェースを記述
interface ICelebrity {
	void otya();

}

//ここにSamuraiクラスを記述
abstract class Samurai {
	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	abstract void work();
}

//ここにRetainerクラスを記述
class Retainer extends Samurai {
	protected String domain;

	void getpaid() {
		System.out.println("給料をもらうよ～。");
	}

	public String toString() {
		String rename = "拙者は" + domain + "、" + name + "ともうす。";

		return rename;
	}

	public boolean equals(Object object) {
		Retainer retainer = (Retainer) object;
		if (this.domain.equals(retainer.domain)) {
			return true;
		} else {
			return false;
		}

	}

	public void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}

	public void money() {
		System.out.println("藩の資産を計算するよ～。");
	}

	public void otya() {
		System.out.println("茶道を嗜むよ～。");
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述;
		Retainer retainer = new Retainer();
		retainer.money();
		retainer.otya();
	}
}
