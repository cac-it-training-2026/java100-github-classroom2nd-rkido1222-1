/**
 * 第7章 武士のお仕事
 *
 * 問題15 インターフェースを拡張する
 *
 * 国家老インターフェースを作る。
 *
 * 勘定奉行インターフェースと文化人インターフェースを継承した
 * 国家老インターフェースIChiefRetainer（メソッドvoid stay）を作り、
 * 藩士クラスに実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 * 城で留守番するよ～。
 *
 */

package lesson07.challenge15;

//ここにIChiefTreasurerインターフェースを記述
interface IChiefTreasurer {
	void money();
}

//ここにICelebrityインターフェースを記述
interface ICelebrity {
	void otya();

}

//ここにIChiefRetainerインターフェースを記述
interface IChiefRetainer extends IChiefTreasurer, ICelebrity {
	void stay();

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

	public void stay() {
		System.out.println("城で留守番するよ～。");
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述;
		Retainer retainer = new Retainer();
		retainer.money();
		retainer.otya();
		retainer.stay();

	}
}
