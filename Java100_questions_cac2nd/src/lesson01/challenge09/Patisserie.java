/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String args[]) throws IOException {
		int a = 30;
		int b = 30;
		int c = 30;
		System.out.println("本日のおすすめ商品です。");
		System.out.println();
		System.out.println("シトロン     \\" + 250 + "・・・ 残り" + a + "個");
		System.out.println("ショコラ     \\" + 280 + "・・・ 残り" + b + "個");
		System.out.println("ピスターシュ \\" + 320 + "・・・ 残り" + c + "個\n");

		System.out.println("それぞれ何個ずつ買いますか?(最大30個まで)");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン     >");
		String str = reader.readLine();
		double num = Double.parseDouble(str);

		System.out.print("ショコラ     >");
		String str2 = reader.readLine();
		double num2 = Double.parseDouble(str2);

		System.out.print("ピスターシュ >");
		String str3 = reader.readLine();
		double num3 = Double.parseDouble(str3);

		System.out.println("シトロン      " + str + "個");
		System.out.println("ショコラ      " + str2 + "個");
		System.out.println("ピスターシュ  " + str3 + "個\n");

		int seki = (int) ((num * 250) + (num2 * 280) + (num3 * 320));

		System.out.println("合計個数      " + (num + num2 + num3) + "個");
		System.out.println("合計金額      " + seki + "円");

		System.out.println();
		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");
		System.out.println();

		int kosuu = (int) (a - num);
		int kosuu2 = (int) (b - num2);
		int kosuu3 = (int) (c - num3);

		System.out.println("本日のおすすめ商品です。");
		System.out.println();
		System.out.println("シトロン     \\" + 250 + "・・・ 残り" + kosuu + "個");
		System.out.println("ショコラ     \\" + 280 + "・・・ 残り" + kosuu2 + "個");
		System.out.println("ピスターシュ \\" + 320 + "・・・ 残り" + kosuu3 + "個\n");

		System.out.println("閉店のお時間となりました。");
		System.out.println("またのお越しをお待ちしております。\n");

		System.out.println("売上の割合");
		System.out.println("売上合計   \\" + seki);

		System.out.println("\n内訳");
		System.out.println("シトロン       \\" + (int) (num * 250) + "・・・" + (int) (((num * 250) / seki) * 100) + "%");
		System.out.println("ショコラ       \\" + (int) (num2 * 280) + "・・・" + (int) (((num2 * 280) / seki) * 100) + "%");
		System.out.println("ピスターシュ   \\" + (int) (num3 * 320) + "・・・" + (int) (((num3 * 320) / seki) * 100) + "%\n");

		System.out.println("明日の3食マカロンの配合率が決まりました!\n");

		System.out.println("シトロン     ・・・" + (int) (((num * 250) / seki) * 100) + "%");
		System.out.println("ショコラ     ・・・" + (int) (((num2 * 280) / seki) * 100) + "%");
		System.out.println("ピスターシュ ・・・" + (int) (((num3 * 320) / seki) * 100) + "%\n");

		System.out.println("が楽しめます!\n");

		int nedan = (seki / (int) (num + num2 + num3));
		System.out.println("値段は\\" + nedan / 10 * 10 + "です。");

	}
}
