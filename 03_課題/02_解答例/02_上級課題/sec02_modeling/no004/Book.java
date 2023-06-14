package mvc.java.kadai.se.cat02.sec02_modeling.no004;

public class Book {

	/** 書名
	 *  ※変数には、役割を反映させた名前をつけましょう！
	 */
   private String bookName;

   /** 価格
    *  ※変数には、役割を反映させた名前をつけましょう！
	*/
   private int bookPrice;

   /** 著者
    *  ※変数には、役割を反映させた名前をつけましょう！
    */
   private String bookAuthor;

   /**
    * 本を作るときに必要な情報を入れるための コンストラクタ
    *
    * @param name 本の名前
    * @param price 本の価格
    * @param author 著作者
    *
    */
   public Book(String name, int price, String author) {
       this.bookName = name;
       this.bookPrice = price;
       this.bookAuthor = author;
   }

   /**
    *
    * 書名を取得する。
    * @return String 本の名前
    *
    */
   public String getBookName() {
       return bookName;
   }

   /**
    * 本の価格を取得する。
    * @return int 本の価格
    *
    */
   public int getBookPrice() {
       return bookPrice;
   }

   /**
    * 著者の名前を取得する。
    * @return String 著作者の名前
    *
    */
   public String getBookAuthor() {
       return bookAuthor;
   }

}

