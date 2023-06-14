package mvc.java.kadai.se.cat01.sec05_class.no015;

public class JavaClassBasic15Sub {

	private JavaClassBasic15Obj uco;

	public JavaClassBasic15Sub(JavaClassBasic15Obj uco) {
		this.uco = uco;
	}

	public void showCdInfo() {

		System.out.println("◆CDの情報");
		System.out.println("タイトル：" + this.uco.getCdTitle());
		System.out.println("価格：" + this.uco.getCdPrice());
		System.out.println("アーティスト：" + this.uco.getCdArtist());

	}


}
