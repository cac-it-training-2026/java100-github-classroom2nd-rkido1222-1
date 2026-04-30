package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {
		//駅名を配列に
		String[] stations = { "品川", "大崎", "五反田", "目黒",
				"恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保", "高田馬場",
				"目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里",
				"鴬谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋",
				"浜松町", "田町", "高輪ゲートウェイ" };

		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("       ゲームスタート！");

		//駅が出ているかどうかを管理する配列
		boolean[] stationFlag = new boolean[stations.length];
		Arrays.fill(stationFlag, true);//全部先にまだ出ていないにする。

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Random rand = new Random();// コンピュータがランダムに駅を選ぶための Random
		boolean hitFlag = false;// 正解した時の判定フラグ
		int gameCount = 0;//両者が答えた合計

		do {
			String inputStationName = br.readLine();// プレイヤーに駅名を入力してもらう
			for (int i = 0; i < stations.length; i++) {// 入力した駅名がOKかどうかを判定するための繰り返し
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
			gameCount++;// プレイヤーが答えたから+1

			if (!hitFlag || (gameCount == stations.length)) {// プレイヤーが誤答した場合orもう全駅出た場合

				break;
			}

			hitFlag = false;// フラグをリセットしておく
			while (!hitFlag) {// コンピュータが回答するための繰り返し
				int num = rand.nextInt(stations.length);// 駅の数の範囲でランダムな番号を作成

				if (stationFlag[num]) {// まだ出ていない駅なら採用
					System.out.println(stations[num]);// 駅名を出力する
					stationFlag[num] = false;// 出たことにする
					hitFlag = true;// 正解した
				}
			}

			gameCount++;// コンピューターも答えたので＋１
			hitFlag = false;// フラグをリセットしておく

		} while (gameCount != stations.length);// 駅がすべて出るまで続ける

		// 駅が全部出たらプレイヤーの勝ち,それ以外は負け
		if (gameCount == stations.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}

}
