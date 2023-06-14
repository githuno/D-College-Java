package mvc.java.kadai.se.cat01.sec08_exception.no001;

public class JavaExceptionBasic01Obj {


	public void divide(int firstNum, int secondNum) {

		try {

			if (secondNum == 0) {
				throw new Exception();
			}

			int ans = firstNum / secondNum ;

			System.out.println(firstNum + "÷" + secondNum + "＝" + ans);


		} catch (Exception e) {
			System.out.println("0で割ることはできません。");
		}

	}

}
