package mvc.java.kadai.se.cat02.sec03_sogo.no001;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class KadaiSogo1 {
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		// 佐藤さんは今年、月給12か月で「800万円」病欠日数は20日間でした。
		Employee emp1 = new ExecutiveEmployee("佐藤", BigDecimal.valueOf(8000000), 20);
		System.out.println(emp1.getName() + "さんは、月収12か月分は" + emp1.getSalary().toString() + "、ボーナスは"
				+ emp1.getBonus().toString() + "円です");
		employeeList.add(emp1);

		// 鈴木さんは今年、月給12か月で「1250万円」病欠日数は4日間でした。
		Employee emp2 = new ExecutiveEmployee("鈴木", BigDecimal.valueOf(12500000), 4);
		System.out.println(emp2.getName() + "さんは、月収12か月分は" + emp2.getSalary().toString() + "、ボーナスは"
				+ emp2.getBonus().toString() + "円です");
		employeeList.add(emp2);

		// 高橋さんは今年、月給12か月で「128万円」病欠日数は3日間でした。
		Employee emp3 = new LowPaidEmployee("高橋", BigDecimal.valueOf(1280000), 3);
		System.out.println(emp3.getName() + "さんは、月収12か月分は" + emp3.getSalary().toString() + "、ボーナスは"
				+ emp3.getBonus().toString() + "円です");
		employeeList.add(emp3);

		// 高橋さんは今年、月給12か月で「157万円」病欠日数は8日間でした。
		Employee emp4 = new LowPaidEmployee("田中", BigDecimal.valueOf(1570000), 8);
		System.out.println(emp4.getName() + "さんは、月収12か月分は" + emp4.getSalary().toString() + "、ボーナスは"
				+ emp4.getBonus().toString() + "円です");
		employeeList.add(emp4);

		// 伊藤さんは今年、月給12か月で「421万2000円」病欠日数は18日間でした。
		Employee emp5 = new LowPaidEmployee("伊藤", BigDecimal.valueOf(4212000), 18);
		System.out.println(emp5.getName() + "さんは、月収12か月分は" + emp5.getSalary().toString() + "、ボーナスは"
				+ emp5.getBonus().toString() + "円です");
		employeeList.add(emp5);


		System.out.println();

		PayModel simplePayModel = new SimplePayModel();
		BigDecimal cost1 = EmployeeOperation.calcCostOfEmployee(employeeList, simplePayModel);
		System.out.println("■会社の年間人件費(SimplePayModelパターン):" + cost1.toString() + "円");

		PayModel insentivepayModel = new IncentivePayModel();
		BigDecimal cost2 = EmployeeOperation.calcCostOfEmployee(employeeList, insentivepayModel);
		System.out.println("■会社の年間人件費(IncentivePayModelパターン):" + cost2.toString() + "円");
		System.out.println();

		// 渡辺さんは今年、月給12か月で「110万円」病欠日数は10日間でした。
		Employee emp6 = new PartTimePaidEmployee("渡辺", BigDecimal.valueOf(1200000), 10);
		System.out.println(emp6.getName() + "さんは、月収12か月分は" + emp6.getSalary().toString() + "、ボーナスは"
				+ emp6.getBonus().toString() + "円です");
		employeeList.add(emp6);

		// 山本さんは今年、月給12か月で「120万円」病欠日数は9日間でした。
		Employee emp7 = new PartTimePaidEmployee("山本", BigDecimal.valueOf(1500000), 9);
		System.out.println(emp7.getName() + "さんは、月収12か月分は" + emp7.getSalary().toString() + "、ボーナスは"
				+ emp7.getBonus().toString() + "円です");
		employeeList.add(emp7);

		// 中村さんは今年、月給12か月で「130万円」病欠日数は4日間でした。
		Employee emp8 = new PartTimePaidEmployee("中村", BigDecimal.valueOf(1800000), 4);
		System.out.println(emp8.getName() + "さんは、月収12か月分は" + emp8.getSalary().toString() + "、ボーナスは"
				+ emp8.getBonus().toString() + "円です");
		employeeList.add(emp8);

		System.out.println();

		cost1 = EmployeeOperation.calcCostOfEmployee(employeeList, simplePayModel);
		System.out.println("■会社の年間人件費(SimplePayModelパターン):" + cost1.toString() + "円");

		cost2 = EmployeeOperation.calcCostOfEmployee(employeeList, insentivepayModel);
		System.out.println("■会社の年間人件費(IncentivePayModelパターン):" + cost2.toString() + "円");


	}

}
