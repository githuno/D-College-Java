package mvc.java.kadai.se.cat02.sec02_modeling.no010;
/**
 * モデリング問題10 回答例
 *  CDの情報を格納しておくクラス。
 *
 */
public class Cd extends ShelfEntry {

	/** 価格
	 *  ※変数には、役割を反映させた名前をつけましょう！
	 */
   private int price = 0;

	/** アーティスト名
	 *  ※変数には、役割を反映させた名前をつけましょう！
	 */
   private String artist = null;

   /**
    * CDを作るために必要な情報を入れるための コンストラクタ
    *
    * @param price  CDの価格
    * @param artist アーティスト名
    *
    */
   public Cd(String name,int price, String artist) {
	   super(name);
       this.price = price;
       this.artist = artist;
   }

   /**
    * 価格を取得する
    * @return int CDの価格
    *
    */
   public int getPrice() {
       return price;
   }

   /**
    * アーティスト名を取得する。
    * @return String アーティスト名
    *
    */
   public String getArtist() {
       return artist;
   }
}
