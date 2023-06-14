package jp.co.opst.mvc.use;

import jp.co.opst.mvc.resolve.extendition.Android;
import jp.co.opst.mvc.resolve.extendition.Iphone;
import jp.co.opst.mvc.resolve.extendition.SmartPhone;

public class Polymorphism {

	public static void main(String[] args) {

		String usePhone = "iPhone";

		SmartPhone smartPhone = null;
		if ("iPhone".equals(usePhone)) {
			smartPhone = new Iphone();
		} else if ("android".equals(usePhone)) {
			smartPhone = new Android();
		}

		smartPhone.callingPhone("03-1111-2222");
		smartPhone.sendMail("aaa@mvc.com");
		smartPhone.takeAPhoto();
		smartPhone.connectWWW();

	}

}
