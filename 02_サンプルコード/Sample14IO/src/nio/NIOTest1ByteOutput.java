package nio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NIOTest1ByteOutput {

	public static void main(String[] args) {
		byte[] bytes = { -29, -127, -109, -29, -126, -109, -29, -127, -85, -29, -127, -95, -29, -127, -81 };

		try {
			/* **************************************************************************************/
			// [1] byte配列をファイルに書き込む

			// Pathsクラスのgetを使ってPathオブジェクトを取得する
			Path dst = Paths.get("testNIO1_1.dat");

			// Filesクラスのwriteメソッドで書き込む
			// ※writeメソッドは、正常に書き込まれた、または 例外がスローされたとき、
			// 　必ずファイルクローズする。
			// 第一引数：Pathオブジェクト
			// 第二引数：書込む内容
			// 第三引数：ファイルオプション（複数可）
			// ※ファイルオプションは
			// 	StandardOpenOption.CREATE:
			// 		ファイルが無かったら作成する
			// 	StandardOpenOption.TRUNCATE_EXISTING:
			// 		ファイルがすでに存在した場合ファイルの内容を0にする

			Files.write(dst, bytes, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

			/* **************************************************************************************/
			// [2] 16進数文字列をファイルに書き込む
			// Java11でjavax.xml.bind.DatatypeConverterクラスは廃止

			// 16進数文字列をbyte配列に変換
			// 	※16進数2桁で1byte、
			// 		utf-8における日本語1文字のbyte数は3～4byte
			// 		大半が3byte、第3・第4水準漢字の半数が4byte
			// 	→日本語1文字は16進数文字列6～8文字
//			String hexString = "E38193" + "E38293" + "E381AB" + "E381A1" + "E381AF";
//			byte[] bytes16 = DatatypeConverter.parseHexBinary(hexString);

			// Filesクラスのwriteメソッドで書き込む
			// ※ファイルオプションは
			// 	StandardOpenOption.APPEND:
			// 		ファイル最後から書き込む
//			Files.write(dst, bytes16, StandardOpenOption.APPEND);

			/* **************************************************************************************/
			// [3] 文字列を書き込む
			// 		Iterable<? extends CharSequence> 今回はList<String>

			List<String> strs = new ArrayList<String>();
			strs.add("\r\n");
			strs.add("文字列を書き込む");

			// Filesクラスのwriteメソッドで書き込む
			Files.write(dst, strs, StandardOpenOption.APPEND);

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}