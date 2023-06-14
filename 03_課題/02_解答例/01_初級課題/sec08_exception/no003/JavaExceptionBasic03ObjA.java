package mvc.java.kadai.se.cat01.sec08_exception.no003;

public class JavaExceptionBasic03ObjA {


	// ↓↓↓JavaExceptionBasic03ObjA#divideメソッド定義 ここから↓↓↓
	public void divide(int firstNum, int secondNum) throws Exception {

		System.out.print("JavaExceptionBasic03ObjA#divideメソッドです。");

		if(secondNum == 0) {
			throw new Exception();
		}

		int ans = firstNum / secondNum ;

		System.out.println(firstNum + "÷" + secondNum + "＝" + ans);
	}
	// ↑↑↑JavaExceptionBasic03ObjA#divideメソッド定義 ここまで↑↑↑


}
