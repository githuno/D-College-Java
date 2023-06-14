package mvc.java.kadai.se.cat01.sec08_exception.no003;

public class JavaExceptionBasic03ObjB {


	// ↓↓↓JavaExceptionBasic03ObjB#divideメソッド定義 ここから↓↓↓
	public void divide(int firstNum, int secondNum) throws Exception {

		System.out.print("JavaExceptionBasic03ObjB#divideメソッドです。");

		if(secondNum == 0) {
			throw new Exception();
		}

		int ans = firstNum / secondNum ;

		System.out.println(firstNum + "÷" + secondNum + "＝" + ans);
	}
	// ↑↑↑JavaExceptionBasic03ObjB#divideメソッド定義 ここまで↑↑↑

}
