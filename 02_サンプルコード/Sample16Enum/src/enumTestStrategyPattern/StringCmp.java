package enumTestStrategyPattern;

import java.util.Comparator;

// Strategyパターンをenumで実装する
// インターフェイスの抽象メソッドを列挙子で実装する
public enum StringCmp implements Comparator<String> {

	INTEGER{
		@Override
		public int compare(String o1, String o2) {
			return Long.valueOf(o1).compareTo(Long.valueOf(o2));
		}
	},
	FLOAT{
		@Override
		public int compare(String o1, String o2) {
			return Double.valueOf(o1).compareTo(Double.valueOf(o2));
		}
	},
	STRING{
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	},
	REVERSE{
		@Override
		public int compare(String o1, String o2) {
			return new StringBuilder(o1).reverse().toString().compareTo(new StringBuilder(o2).reverse().toString());
		}
	}
}
