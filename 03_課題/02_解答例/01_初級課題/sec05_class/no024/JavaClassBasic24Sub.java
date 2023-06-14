package mvc.java.kadai.se.cat01.sec05_class.no024;

public class JavaClassBasic24Sub {

	private int[] intArray = new int[10];
	private int count = 0;

	public void addInt(int number) {

		if (count < intArray.length) {
			intArray[count] = number;
			count++;
			System.out.println("[" + number + "]を格納しました");
		} else {
			System.out.println("これ以上格納できません");
		}

	}

	public int getAllSum() {
		int sum = 0;
		for(int i = 0; i < intArray.length; i++) {
			sum = sum + intArray[i];
		}
		return sum;
	}

}
