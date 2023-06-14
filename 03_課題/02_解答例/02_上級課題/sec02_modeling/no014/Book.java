package mvc.java.kadai.se.cat02.sec02_modeling.no014;
/**
 * モデリング問題14 回答例
 * 本の情報を入れておくクラス。
 *
 *
 *
 */
public class Book extends ShelfEntry {

   /** 価格
    *  ※変数には、役割を反映させた名前をつけましょう！
	*/
   private int price;

   /** 著者
    *  ※変数には、役割を反映させた名前をつけましょう！
    */
   private String author;

   /**
    * 本を作るときに必要な情報を入れるための コンストラクタ
    *
    * @param price 本の価格
    * @param author 著作者
    *
    */
   public Book(String name, int price, String author) {
	   super(name);
       this.price = price;
       this.author = author;
   }

   /**
    * 本の価格を取得する。
    * @return int 本の価格
    *
    */
   public int getPrice() {
       return price;
   }

   /**
    * 著者の名前を取得する。
    * @return String 著作者の名前
    *
    */
   public String getAuthor() {
       return author;
   }

}
