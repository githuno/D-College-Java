package mvc.java.kadai.se.cat02.sec01_algorithm.no031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm31 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("2つの整数を入力してください。");

			System.out.print("整数A:");
			String line = reader.readLine();
			int value_a = Integer.parseInt(line);

			System.out.print("整数B:");
			line = reader.readLine();
			int value_b = Integer.parseInt(line);

			int[] ans = new int[5];
			calculate(value_a, value_b, ans);

			System.out.println("和:" + ans[0]);
			System.out.println("差:" + ans[1]);
			System.out.println("積:" + ans[2]);
			System.out.println("商:" + ans[3]);
			System.out.println("余:" + ans[4]);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void calculate(int x, int y, int[] ans) {
		// 和
		ans[0] = x + y;
		// 差
		ans[1] = x - y;
		// 積
		ans[2] = x * y;
		// 商
		ans[3] = x / y;
		// 剰余
		ans[4] = x % y;
	}
}
