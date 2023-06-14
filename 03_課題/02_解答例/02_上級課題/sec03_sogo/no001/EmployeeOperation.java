package mvc.java.kadai.se.cat02.sec03_sogo.no001;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class EmployeeOperation {

	public static BigDecimal calcCostOfEmployee(List<Employee> employees, PayModel payModel) {

		BigDecimal totalCost = new BigDecimal(0);

		for (Employee emp : employees) {
			totalCost = totalCost.add(payModel.calcEmployeeCost(emp));
		}
		return totalCost.setScale(2, RoundingMode.HALF_UP);
	}

}
