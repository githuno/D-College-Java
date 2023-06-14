package effectivityfinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EffectivityFinal {

	public static void main(String[] args) {

		// 変数の宣言と初期化
		int num = 10;
		int efNum = 10;

		// 変数の宣言
		String str;
		String efStr;

		// 変数の出力
		System.out.println("numの値は：" + (num += 20) );
		System.out.println("efNumの値は：" + efNum);

		// コンソールから入力
		String line = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("/** 何か入力して下さい **/");
			line = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 入力内容によって変数の初期化
		if (line != null && line.isEmpty()) {
			str = "入力無し";
			efStr = "入力無し";
		}else {
			str = "入力有り";
			efStr = "入力有り";
		}

		// 変数の出力
		System.out.println("strの値は：" + (str += "文字列更新") );
		System.out.println("efStrの値は：" + efStr);

		System.out.println("/** 変数efNumもefStr実質的Final **/");


		new Object() {
	        void metohd() {
	    		System.out.println("/** インナークラスからのアクセス **/");
	        	// 匿名クラスからエンクロージング環境の変数はFinalの場合アクセスできる
	    		System.out.println("efNumの値は：" + efNum);
	    		System.out.println("efStrの値は：" + efStr);
	        	// 匿名クラスからエンクロージング環境の変数はFinal出なない場合はアクセスできない
//	        	System.out.println(num);
//	        	System.out.println(str);
	        }
	    }.metohd();
	}

}
