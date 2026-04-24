/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] konC = new int[5];
		int[] konD = new int[5];
		int[] konE = new int[5];

		//ここに配列に値を代入する処理を記述する。(要素はランダム)
		for (int i = 0; i < 5; i++) {
			int hantei = (int) (Math.random() * 10) % 4;
			konC[i] = (int) (Math.random() * 10 % 10) + 1;

			if (hantei == 0) {
				konC[i] = 0;
			}
		}

		for (int i = 0; i < 5; i++) {
			int hantei = (int) (Math.random() * 10) % 4;
			konD[i] = (int) (Math.random() * 10 % 10) + 1;

			if (hantei == 0) {
				konD[i] = 0;
			}
		}

		for (int i = 0; i < 5; i++) {
			int hantei = (int) (Math.random() * 10) % 4;
			konE[i] = (int) (Math.random() * 10 % 10) + 1;

			if (hantei == 0) {
				konE[i] = 0;
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < konC.length; i++) {
			if (i == 4) {
				System.out.print(konC[i]);
			} else {
				System.out.print(konC[i] + ",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < konD.length; i++) {
			if (i == 4) {
				System.out.print(konD[i]);
			} else {
				System.out.print(konD[i] + ",");
			}
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < konE.length; i++) {
			if (i == 4) {
				System.out.print(konE[i]);
			} else {
				System.out.print(konE[i] + ",");
			}

		}

		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する
		for (int j = 0; j < konC.length; j++) {
			for (int i = 0; i < konC.length - 1; i++) {
				if (konC[i] == 0 && konC[i + 1] != 0) {
					int zero = 0;
					zero = konC[i + 1];
					konC[i + 1] = konC[i];
					konC[i] = zero;
				}
			}
		}

		for (int j = 0; j < konC.length; j++) {
			for (int i = 0; i < konC.length - 1; i++) {
				if (konC[i] == 0 && konC[i + 1] != 0) {
					int zero = 0;
					zero = konC[i + 1];
					konC[i + 1] = konC[i];
					konC[i] = zero;
				}
			}
		}

		for (int j = 0; j < konD.length; j++) {
			for (int i = 0; i < konD.length - 1; i++) {
				if (konD[i] == 0 && konD[i + 1] != 0) {
					int zero = 0;
					zero = konD[i + 1];
					konD[i + 1] = konD[i];
					konD[i] = zero;
				}
			}
		}

		for (int j = 0; j < konE.length; j++) {
			for (int i = 0; i < konE.length - 1; i++) {
				if (konE[i] == 0 && konE[i + 1] != 0) {
					int zero = 0;
					zero = konE[i + 1];
					konE[i + 1] = konE[i];
					konE[i] = zero;
				}
			}
		}
		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < 5; i++) {
			if (i == 4) {
				System.out.print(konC[i]);
			} else {
				System.out.print(konC[i] + ",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < 5; i++) {
			if (i == 4) {
				System.out.print(konD[i]);
			} else {
				System.out.print(konD[i] + ",");
			}
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < 5; i++) {
			if (i == 4) {
				System.out.print(konE[i]);
			} else {
				System.out.print(konE[i] + ",");
			}
		}

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
