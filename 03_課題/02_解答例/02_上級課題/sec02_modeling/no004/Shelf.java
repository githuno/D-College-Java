package mvc.java.kadai.se.cat02.sec02_modeling.no004;

public class Shelf {

	  /** 本を格納する配列 */
	  private Book[] bookArray = new Book[10];

	  /** CDを格納する配列 */
	  private Cd[]   cdArray   = new Cd[10];

	  int bookCount = 0;
	  int cdCount = 0;

	  /**
	   * 本を1冊格納します
	   * @param book
	   */
		public void add(Book book) {

			if (book != null) {

				if (bookCount < bookArray.length) {
					this.bookArray[bookCount] = book;
					bookCount++;
					System.out.println("本:" + book.getBookName() + "を格納しました");
				} else {
					System.out.println("棚がいっぱいです");
				}

			}

		}

	  /**
	   * CDを1枚格納します
	   * @param cd
	   */
		public void add(Cd cd) {

			if (cd != null) {

				if (cdCount < cdArray.length) {
					this.cdArray[cdCount] = cd;
					cdCount++;
					System.out.println("CD:" + cd.getCdName() + "を格納しました");
				} else {
					System.out.println("棚がいっぱいです");
				}

			}

		}

	  /**
	   * 指定した本の名前で本の情報を取得します。
	   * @param name 本の名前
	   * @return Book 指定した本情報
	   *
	   */
	  public Book searchBook(String name) {
		  for(int i=0; i< bookCount; i++) {
	          if(bookArray[i].getBookName().equals(name)) {
	              return bookArray[i];
	          }
	      }
	      return null;
	  }

	  /**
	   * 指定したCDの名前でCDの情報を取得します。
	   * @param name CDの名前
	   * @return Cd 指定した名前のCD情報
	   *
	   */
	  public Cd searchCd(String name) {
	      for(int i=0; i < cdCount; i++) {
	          if(cdArray[i].getCdName().equals(name)) {
	              return cdArray[i];
	          }
	      }
	      return null;
	  }

	  /**
	   * Shelfに入っている本とCDの名前すべて取得します。
	   *
	   * @return String[] Shelfに入っているすべての名前。
	   */
	  public String[] getAllNames() {
	      String[] allNames = new String[bookCount+cdCount];

	      int nameCount = 0;

	      for(int i=0; i < bookCount; i++) {
	          allNames[nameCount] = bookArray[i].getBookName();
	          nameCount++;
	      }

	      for(int j=0; j < cdCount; j++) {
	          allNames[nameCount] = cdArray[j].getCdName();
	          nameCount++;
	      }
	      return allNames;
	  }
	}
