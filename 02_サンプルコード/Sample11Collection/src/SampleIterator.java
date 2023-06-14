
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleIterator {
	public static void main(String[] args) {
		// 「データの集まり」を用意
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(100);
		scores.add(200);
		scores.add(300);
		scores.add(400);

		// イテレータを使ってみる
		Iterator<Integer> it = scores.iterator();
		while (it.hasNext()) {
			Integer score = it.next();
			System.out.println(score);
		}
	}
}
