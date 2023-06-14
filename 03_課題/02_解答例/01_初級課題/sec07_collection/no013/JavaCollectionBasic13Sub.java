package mvc.java.kadai.se.cat01.sec07_collection.no013;

import java.util.ArrayList;

public class JavaCollectionBasic13Sub {

	private ArrayList<JavaCollectionBasic13Obj> bookList = new ArrayList<>();

	public void addBook(JavaCollectionBasic13Obj obj) {
		bookList.add(obj);
		System.out.println("[" + obj.getBookTitle() + "]を入荷しました");
	}

	public void searchBook(String word) {
		System.out.println("お客さん「すみません、[" + word + "]はありますか？」");
		System.out.println("本屋さん「少々お待ちください…」");

		for (JavaCollectionBasic13Obj obj : bookList) {

			String bookTitle = obj.getBookTitle();
			if(bookTitle.equals(word)) {
				System.out.println("本屋さん「お待たせいたしました。お求めの商品ございました。」");
				obj.showBookInfo();
				return;
			}

		}
		System.out.println("本屋さん「申し訳ございません。在庫切れです。」");

	}

}
