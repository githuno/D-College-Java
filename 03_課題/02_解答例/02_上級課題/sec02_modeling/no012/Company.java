package mvc.java.kadai.se.cat02.sec02_modeling.no012;
import java.util.ArrayList;

/**
 *
 * モデリング問題12 回答
 *
 */
public class Company {

	/** 従業員List */
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();

	/** 従業員を会社にいれる(Listに追加する)メソッド */
	public void add(Employee employee) {
		employeeList.add(employee);
		System.out.println(employee.getName() + "が入社しました");
	}

	/** 指定した名前に該当する従業員を取得するメソッド */
	public Employee get(String name) {

		for (int i = 0; i < employeeList.size(); i++) {
			Employee employee = employeeList.get(i);
			if (name.equals(employee.getName())) {
				System.out.println(employee.getName() + "を呼び出しました");
				return employee;
			}
		}
		// 該当なし
		return null;
	}

	/** 全従業員を働かせるメソッド(Listに格納されている全従業員のwork()メソッドを実行する) */
	public void doAllWork() {
		for (Employee employee : employeeList) {
			employee.work();
		}
	}

}
