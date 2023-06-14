package mvc.java.kadai.se.cat01.sec05_class.no026;

public class JavaClassBasic26Sub {

	private JavaClassBasic26Obj[] ucoArray = new JavaClassBasic26Obj[5];
	private int count = 0;

	public void addMember(JavaClassBasic26Obj uco) {

		if (count < ucoArray.length) {
			ucoArray[count] = uco;
			count++;
			String name = uco.getfName() + uco.getlName();
			System.out.println("[" + name + "]さんを格納しました");
		} else {
			System.out.println("これ以上格納できません");
		}

	}

	public void showAllMember() {
		System.out.println("◆従業員一覧");
		for (int i = 0; i < ucoArray.length; i++) {
			System.out.println(
					ucoArray[i].getfName() + ucoArray[i].getlName() + "(" + ucoArray[i].getAge() + ")");
		}
	}

}
