package sub;

public class Person3parent {

    // 記憶
    protected String memory = "書き換えられていません";

    public void printMemory() {
        System.out.println("Person3parent この人の記憶は「" + memory + "」");
    }

    protected void setMemory(String memory) {
        this.memory = memory;
    }
}
