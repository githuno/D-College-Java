package mvc.java.kadai.se.cat01.sec05_class.no009;

public class JavaClassBasic09Sub {

	public int cmpLarger(int fst, int scd) {
		if (fst > scd) {
			return fst; // 第1引数の方が大きい
		} else if (scd > fst) {
			return scd; // 第2引数の方が大きい
		} else {
			return fst; // 同値の場合
		}

	}

}
