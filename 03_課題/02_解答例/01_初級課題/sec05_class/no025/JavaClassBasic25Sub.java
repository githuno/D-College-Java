package mvc.java.kadai.se.cat01.sec05_class.no025;

public class JavaClassBasic25Sub {

	private String[] strArray = new String[5];
	private int count = 0;

	public void addStr(String str) {

		if (count < strArray.length) {
			strArray[count] = str;
			count++;
			System.out.println("[" + str + "]を格納しました");
		} else {
			System.out.println("これ以上格納できません");
		}
	}

	public void showAllStrDesc() {
		System.out.println("◆strArray文字列一覧(新しく格納された順)");
		for (int i = count - 1; 0 <= i; i--) {
			System.out.println(strArray[i]);
		}
	}

}
