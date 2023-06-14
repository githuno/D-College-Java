package sub;

@SuppressWarnings("unused")
public class Person2 {

    // 記憶
    private String memory = "書き換えられていません";

    public void printMemory() {
        System.out.println("Person2 この人の記憶は「" + memory + "」");
    }

    private void setMemory(String memory) {
        this.memory = memory;
    }
}
