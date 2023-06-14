package jp.co.opst.mvc.use;

import jp.co.opst.mvc.resolve.extendition.Android;
import jp.co.opst.mvc.resolve.extendition.Iphone;

public class UsePhone {

	public static void main(String[] args) {

		Android android = new Android();
		android.callingPhone("03-1111-1111");

		Iphone iphone = new Iphone();
		iphone.callingPhone("03-2222-2222");
	}

}
