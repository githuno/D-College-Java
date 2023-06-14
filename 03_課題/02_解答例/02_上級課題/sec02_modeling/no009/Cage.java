package mvc.java.kadai.se.cat02.sec02_modeling.no009;
public class Cage {

	/** 動物を格納する配列 */
    private Animal[] animalArray = new Animal[10];

    int catCounter = 0;
    int birdCounter = 0;

	/**
	 * 配列の先頭に動物を追加するメソッド
	 * @param animal
	 */
	public void putFirst(Animal animal) {

		if (catCounter >= animalArray.length) {
			System.out.println("かごがいっぱいなので動物は入りません。");
			return;
		}

		for (int i = (catCounter - 1); i >= 0; i--) {
			if(i + 1 == animalArray.length) {
				break;
			}
			this.animalArray[i + 1] = this.animalArray[i];
		}
		this.animalArray[0] = animal;
		catCounter++;
		System.out.println(animal.getName() + "をかごの先頭に入れました");

	}


    /**
     * 配列の末尾に動物を追加するメソッド
     * @param animal
     */
    public void putLast(Animal animal){

		if (catCounter >= animalArray.length) {
			System.out.println("かごがいっぱいなので動物は入りません。");
			return;
		}

        this.animalArray[catCounter] = animal;
        catCounter++;
        System.out.println(animal.getName() + "をかごの末尾に入れました");
    }



    /**
     * 籠に入っている動物
     * 全ての名前を配列(String[])で返すメソッド
     */
    public String[] getAllAnimalNames(){

       String[] allNames = new String[catCounter + birdCounter];
       int nameCounter = 0;

       for(int i=0; i < catCounter; i++) {
           allNames[nameCounter] = animalArray[i].getName();
           nameCounter++;
       }

       for(int j=0; j < birdCounter; j++) {
           allNames[nameCounter] = animalArray[j].getName();
           nameCounter++;
       }

       return allNames;
    }


    /**
     * 配列の先頭の動物を取得するメソッド
     */
    public Animal getFirst(){
        return animalArray[0];
    }

    /**
     *  配列の先頭の動物を取得するメソッド
     */
    public Animal getLast(){
        return animalArray[animalArray.length - 1];
    }

    /**
     *  指定した名前の動物を取得するメソッド
     * @param name
     */
    public Animal getAnimal(String name){
        for(int i=0; i <= catCounter; i++) {
            if(animalArray[i].getName().equals(name)) {
                    return animalArray[i];
            }
        }
        return null;
    }

}
