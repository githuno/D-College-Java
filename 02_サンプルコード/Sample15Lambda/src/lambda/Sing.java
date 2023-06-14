package lambda;

public class Sing {

	public String name;

	public Sing(String name) {
		this.name = name;
	}

	public void singing() {
		try {
			System.out.println(name + "歌います");
			System.out.println("カエルの歌が");
			Thread.sleep(1500);
			System.out.println("聞こえてくるよ");
			Thread.sleep(1500);
			System.out.println("グワ");
			Thread.sleep(800);
			System.out.println("グワ");
			Thread.sleep(800);
			System.out.println("グワ");
			Thread.sleep(800);
			System.out.println("グワ");
			Thread.sleep(800);
			System.out.println("ゲゲゲゲゲゲゲゲ");
			Thread.sleep(800);
			System.out.println("グワ");
			Thread.sleep(400);
			System.out.println("グワ");
			Thread.sleep(400);
			System.out.println("グワ");
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
