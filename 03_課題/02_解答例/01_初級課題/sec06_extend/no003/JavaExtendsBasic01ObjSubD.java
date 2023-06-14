package mvc.java.kadai.se.cat01.sec06_extend.no003;

public class JavaExtendsBasic01ObjSubD extends JavaExtendsBasic01ObjSuper {

	public JavaExtendsBasic01ObjSubD(String className) {
		super(className);
	}

	@Override
	public void printShape(String mark, int count) {

		for (int i = 0; i < count; i++) {
			System.out.print(mark + "+");
		}
		System.out.println();

	}

}
