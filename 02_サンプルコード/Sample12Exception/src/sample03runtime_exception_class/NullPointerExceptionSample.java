package sample03runtime_exception_class;

public class NullPointerExceptionSample {

	public static void main(String[] args) {

		String[] strArray = new String[5];

		if(strArray[0].equals("abc")) {		// 参照が無く、メンバにアクセスすると発生
			System.out.println("文字列は等しいです");
		}

	}

}
