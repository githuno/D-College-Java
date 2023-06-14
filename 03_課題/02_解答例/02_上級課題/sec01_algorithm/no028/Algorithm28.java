package mvc.java.kadai.se.cat02.sec01_algorithm.no028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm28 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.print("配列のサイズを入力してください:");

			// x
			String line = reader.readLine();
			int size = Integer.parseInt(line);
			int[] x = new int[size];

			System.out.println("値を入力してください。");
			for (int i = 0; i < size; i++) {
				System.out.print("x[" + i + "]=");
				line = reader.readLine();
				int value = Integer.parseInt(line);
				x[i] = value;
			}

			System.out.print("配列のサイズを入力してください:");

			// y
			line = reader.readLine();
			size = Integer.parseInt(line);
			int[] y = new int[size];

			System.out.println("値を入力してください。");
			for (int i = 0; i < size; i++) {
				System.out.print("y[" + i + "]=");
				line = reader.readLine();
				int value = Integer.parseInt(line);
				y[i] = value;
			}

			// z
			int[] z = joinArrayCopy(x, y);

			System.out.println("連結して新しい配列を作成しました。");

			for (int i = 0; i < z.length; i++) {
				System.out.println("z[" + i + "]=" + z[i]);
			}

			System.out.println("元の配列を表示します。");

			for (int i = 0; i < x.length; i++) {
				System.out.println("x[" + i + "]=" + x[i]);
			}
			for (int i = 0; i < y.length; i++) {
				System.out.println("y[" + i + "]=" + y[i]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ２つのint型の配列を連結して新しい配列を生成し、その参照を返すメソッド
	 */
	public static int[] joinArrayCopy(int[] x, int[] y) {
		int[] z = new int[x.length + y.length];

		int count = 0;
		for (int i = 0; i < x.length; i++) {
			z[count] = x[i];
			count++;
		}

		for (int i = 0; i < y.length; i++) {
			z[count] = y[i];
			count++;
		}

		// System.arraycopy()を使用した場合
		// System.arraycopy(x, 0, z, 0, x.length);
		// System.arraycopy(y, 0, z, x.length, y.length);

		return z;
	}

}
