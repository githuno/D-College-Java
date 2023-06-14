package mvc.java.kadai.se.cat02.sec02_modeling.no004;

public class Cd {

	/** CD名
	 *  ※変数には、役割を反映させた名前をつけましょう！
	 */
   private String cdName = null;

	/** 価格
	 *  ※変数には、役割を反映させた名前をつけましょう！
	 */
   private int cdPrice = 0;

	/** アーティスト名
	 *  ※変数には、役割を反映させた名前をつけましょう！
	 */
   private String cdArtist = null;

   /**
    * CDを作るために必要な情報を入れるための コンストラクタ
    *
    * @param name   CDの名前
    * @param price  CDの価格
    * @param artist アーティスト名
    *
    */
   public Cd(String name,int price, String artist) {
       cdName = name;
       cdPrice = price;
       cdArtist = artist;
   }

   /**
    * CD名称を取得する
    * @return String CD名称
    *
    */
   public String getCdName() {
       return cdName;
   }

   /**
    * 価格を取得する
    * @return int CDの価格
    *
    */
   public int getCdPrice() {
       return cdPrice;
   }

   /**
    * アーティスト名を取得する。
    * @return String アーティスト名
    *
    */
   public String getCdArtist() {
       return cdArtist;
   }
}
