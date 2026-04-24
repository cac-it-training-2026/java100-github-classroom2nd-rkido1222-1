package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String[] stations = { "品川", "大崎", "五反田", "目黒",
				"恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保", "高田馬場",
				"目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里",
				"鴬谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋",
				"浜松町", "田町", "高輪ゲートウェイ" };

		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("       ゲームスタート！");

		boolean[] stationFlag = new boolean[stations.length];
		Arrays.fill(stationFlag, true);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Random rand = new Random();// 元々使えるrandomというクラスで初期化
		boolean hitFlag = false;// 正解した時にtrueとなるフラグ
		int gameCount = 0;// ゲームの実行回数（プレイヤーとコンピュータがそれぞれ回答する度にプラス１）

		do {
			String inputStationName = br.readLine();// プレイヤーに駅名を入力してもらう
			for (int i = 0; i < stations.length; i++) {// プレイヤーの入力した駅名がOKかどうかを判定するための繰り返し（駅の総数まで繰り返す）
				if (stations[i].equals(inputStationName)) {// プレイヤーの入力した駅名が配列に含まれていれば
					if (stationFlag[i]) {// / その番号の駅が既出でないか判定する
						hitFlag = true;// 正解したという目印にフラグを立てる
						stationFlag[i] = false;// この駅名はもう答えましたという意味でfalseに変えておく
						break;// 内側のループを抜ける
						// 入力した駅名が既出であればゲームオーバー
					} else {

						break;// 内側のループを抜ける
					}
				}
			}
			gameCount++;// ゲームの実行回数を一つ増やす

			if (!hitFlag || (gameCount == stations.length)) {// プレイヤーが誤答した場合または全ての駅名が出尽くした場合

				break;// 外側のループを抜けて終了処理へ
			}

			hitFlag = false;// フラグをクリアしておく
			while (!hitFlag) {// コンピュータが回答するための繰り返し（正解するまで繰り返す）
				int num = rand.nextInt(stations.length);// 総駅数の範囲で乱数を取得

				if (stationFlag[num]) {// その番号の駅が既出でないか判定する
					System.out.println(stations[num]);// 既出でなければ駅名を出力する
					stationFlag[num] = false;// この駅名はもう答えましたという意味でfalseに変えておく
					hitFlag = true;// 正解したという目印にフラグを立てる
				}
			}

			gameCount++;// ゲームの実行回数を一つ増やす
			hitFlag = false;// フラグをクリアしておく

		} while (gameCount != stations.length);// 駅名が出尽くした場合ループを抜ける

		// 駅名が出尽くしていればプレイヤーの勝ち、そうでなければ負け
		if (gameCount == stations.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}

}
