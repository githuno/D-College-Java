package java.kadai.se.cat02.sec02_modeling.no001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KadaiCar1 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {

			//キーボード入力
			String line;
			System.out.print("燃費(km/l)を入力してください:");
			line = reader.readLine();
			int efficency = Integer.parseInt(line);

			System.out.print("燃料(l)を入力してください:");
			line = reader.readLine();
			int gas = Integer.parseInt(line);

			System.out.println("距離(km)にマイナスの値を入力すると終了します。");
			System.out.println();

			//mainメソッド内でCarクラスを生成
			Car car = new Car();

			int distance = 0;
			do {

				System.out.println();
				System.out.print("距離(km)を入力してください:");

				// ここで、Carクラスのrunメソッドを実行！

			} while (distance > 0);



		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
