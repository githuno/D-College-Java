package jp.co.opst.mvc.use;

import jp.co.opst.mvc.resolve.extendition.Android;
import jp.co.opst.mvc.resolve.extendition.Iphone;

public class NonPolymorphism {

	public static void main(String[] args) {

		String usePhone = "iPhone";

		if ("iPhone".equals(usePhone)) {
			Iphone iPhone = new Iphone();
			iPhone.callingPhone("03-1111-2222");
			iPhone.sendMail("aaa@mvc.com");
			iPhone.takeAPhoto();
			iPhone.connectWWW();


		} else if ("android".equals(usePhone)) {
			Android android = new Android();
			android.callingPhone("03-1111-2222");
			android.sendMail("aaa@mvc.com");
			android.takeAPhoto();
			android.connectWWW();

		}

	}

}
