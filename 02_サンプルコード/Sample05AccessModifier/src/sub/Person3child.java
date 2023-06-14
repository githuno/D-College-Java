package sub;

public class Person3child extends Person3parent {

    @Override
	//Person3parentクラスのprintMemoryメソッドをオーバーライド
    public void printMemory() {
        System.out.println("Person3child この人の記憶は「" + this.memory + "」");
    }

    public void setMemoryChild(String memory) {
        // 親クラスのprotectedのメソッド
        //setMemory(memory);
        // 親クラスのprotectedのフィールド
        this.memory = memory;
    }
}
