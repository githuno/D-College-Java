package mvc.java.kadai.se.cat01.sec05_class.no020;

public class JavaClassBasic20Obj {

	private int savingMoney;

	public JavaClassBasic20Obj(int money) {
		System.out.println("貯金が" + money + "円あります");
		savingMoney = money;
	}

	public void withdrawMoney(int price) {
		System.out.println("お引き出し金額：" + price);

		if (savingMoney < price) {
			System.out.println("お金を引き出せません");
			return;
		}
		savingMoney = savingMoney - price;
	}

	public void showSavingMoney() {
		System.out.println("残高：" + savingMoney);
	}

}
