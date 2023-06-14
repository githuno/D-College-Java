package mvc.java.kadai.se.cat02.sec03_sogo.no001;
import java.math.BigDecimal;

public class IncentivePayModel implements PayModel {

	@Override
	public BigDecimal calcEmployeeCost(Employee employee) {
		// 従業員の病欠日数によってボーナスを増減する。

		BigDecimal salary = employee.getSalary();
		BigDecimal bonus = employee.getBonus();
		int sickDays = employee.getDaysOffSick();

		BigDecimal totalCost = salary;

		if (sickDays < 5) {
			// 病欠日数が5日未満でボーナスを10%増
			totalCost = totalCost.add((bonus.multiply(BigDecimal.valueOf(1.1))));
		} else if (sickDays >= 10) {
			// 病欠日数が10日以上でボーナスを10%減
			totalCost = totalCost.add((bonus.multiply(BigDecimal.valueOf(0.9))));
		} else {
			totalCost = totalCost.add(bonus);
		}
		return totalCost;

	}
}
