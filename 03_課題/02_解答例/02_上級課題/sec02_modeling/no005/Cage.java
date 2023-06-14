package mvc.java.kadai.se.cat02.sec02_modeling.no005;
public class Cage {

	/** 猫を格納する配列 */
    private Cat[] catArray = new Cat[5];

    /** 鳥を格納する配列 */
    private Bird[] birdArray = new Bird[5];


    int catCounter = 0;
    int birdCounter = 0;

	/**
	 * 猫配列の先頭に猫を追加するメソッド
	 * @param cat
	 */
	public void putFirst(Cat cat) {

		if (catCounter >= catArray.length) {
			System.out.println("かごがいっぱいなので猫は入りません。");
			return;
		}

		for (int i = (catCounter - 1); i >= 0; i--) {
			if(i + 1 == catArray.length) {
				break;
			}
			this.catArray[i + 1] = this.catArray[i];
		}
		this.catArray[0] = cat;
		catCounter++;
		System.out.println("猫:" + cat.getCatName() + "をかごの先頭に入れました");

	}


    /**
     * 鳥配列の先頭に鳥を追加するメソッド
     * @param bird
     */
    public void putFirst(Bird bird){

        if(birdCounter >= birdArray.length) {
            System.out.println("かごがいっぱいなので鳥は入りません。");
            return;
        }

        for(int i = (birdCounter - 1); i >= 0; i--) {
			if(i + 1 == birdArray.length) {
				break;
			}
           this.birdArray[i + 1] = this.birdArray[i];
        }
        this.birdArray[0] = bird;
        birdCounter++;
        System.out.println("鳥:" + bird.getBirdName() + "をかごの先頭に入れました");

    }


    /**
     * 猫配列の末尾に猫を追加するメソッド
     * @param cat
     */
    public void putLast(Cat cat){

		if (catCounter >= catArray.length) {
			System.out.println("かごがいっぱいなので猫は入りません。");
			return;
		}

        this.catArray[catCounter] = cat;
        catCounter++;
        System.out.println("猫:" + cat.getCatName() + "をかごの末尾に入れました");
    }


    /**
     * 鳥配列の末尾に鳥を追加するメソッド
     * @param bird
     */
    public void putLast(Bird bird){

        if(birdCounter >= birdArray.length) {
            System.out.println("かごがいっぱいなので鳥は入りません。");
            return;
        }

        this.birdArray[birdCounter] = bird;
        birdCounter++;
        System.out.println("鳥:" + bird.getBirdName() + "をかごの末尾に入れました");
    }


    /**
     * 籠に入っている猫,鳥
     * 全ての名前を配列(String[])で返すメソッド
     */
    public String[] getAllAnimalNames(){

       String[] allNames = new String[catCounter + birdCounter];
       int nameCounter = 0;

       for(int i=0; i < catCounter; i++) {
           allNames[nameCounter] = catArray[i].getCatName();
           nameCounter++;
       }

       for(int j=0; j < birdCounter; j++) {
           allNames[nameCounter] = birdArray[j].getBirdName();
           nameCounter++;
       }

       return allNames;
    }


    /**
     * 猫配列の先頭の猫を取得するメソッド
     */
    public Cat getFirstCat(){
        return catArray[0];
    }

    /**
     *  猫配列の末尾の猫を取得するメソッド
     */
    public Cat getLastCat(){
        return catArray[catArray.length - 1];
    }

    /**
     *  鳥配列の先頭の鳥を取得するメソッド。
     */
    public Bird getFirstBird(){
        return birdArray[0];
    }

    /**
     *  鳥配列の末尾の鳥を取得するメソッド
     */
    public Bird getLastBird(){
        return birdArray[birdArray.length - 1];
    }

    /**
     *  指定した名前の猫を取得するメソッド
     * @param name
     */
    public Cat getCat(String name){
        for(int i=0; i <= catCounter; i++) {
            if(catArray[i].getCatName().equals(name)) {
                    return catArray[i];
            }
        }
        return null;
    }

    /**
     *  指定した名前の鳥を取得するメソッド
     * @param name
     */
    public Bird getBird(String name){
        for(int j=0; j <= birdCounter; j++) {
            if(birdArray[j].getBirdName().equals(name)) {
                return birdArray[j];
            }
        }
        return null;
    }

}
