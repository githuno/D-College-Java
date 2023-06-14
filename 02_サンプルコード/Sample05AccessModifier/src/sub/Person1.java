package sub;

public class Person1 {

    // 記憶
    private String memory = "書き換えられていません";

    public void printMemory() {
        System.out.println("Person1 この人の記憶は「" + memory + "」");
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
