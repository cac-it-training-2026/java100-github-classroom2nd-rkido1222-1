package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Robot {

	String makeshrinp(int shrinp, int rice, int buro, int mayo, int chiri) {
		String food;
		if (shrinp >= 1 && rice >= 50) {
			food = "エビ寿司";
		} else if (shrinp >= 5 && mayo >= 30) {
			food = "エビマヨ";
		} else if (shrinp >= 10 && chiri >= 30) {
			food = "エビチリ";
		} else if (buro >= 5 && shrinp >= 10) {
			food = "ガーリックシュリンプ";
		} else {
			food = null;
		}

		return food;
	}
}

public class SuperRobot {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("エビの個数を入力してください＞");
		String shrinpNumStr = br.readLine();
		int shrinp = Integer.parseInt(shrinpNumStr);

		System.out.print("\nお米の量を入力してください（グラム）＞");
		String riceNumStr = br.readLine();
		int rice = Integer.parseInt(riceNumStr);

		System.out.print("\nブロッコリーの個数を入力してください＞");
		String buroNumStr = br.readLine();
		int buro = Integer.parseInt(buroNumStr);

		System.out.print("\nマヨネーズの量を入力してください（グラム）＞");
		String mayoNumStr = br.readLine();
		int mayo = Integer.parseInt(mayoNumStr);

		System.out.print("\nチリソースの量を入力してください（グラム）＞");
		String chiriNumStr = br.readLine();
		int chiri = Integer.parseInt(chiriNumStr);

		Robot robot = new Robot();
		String food = robot.makeshrinp(shrinp, rice, buro, mayo, chiri);
		if (food == null) {
			System.out.println("何も作れません。");
		} else {
			System.out.println(food + "が出来ました。");
		}

	}

}
