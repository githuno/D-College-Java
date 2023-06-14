package mvc.java.kadai.se.cat02.sec03_sogo.no001;
import java.math.BigDecimal;

/**
 * 人件費算出パターン：SimplePayModel
 * @author user
 *
 */
public class SimplePayModel implements PayModel {

	@Override
	public BigDecimal calcEmployeeCost(Employee employee) {
		// 従業員の年収(月給12か月分＋ボーナス)に無条件で15％を上乗せする。
		return (employee.getSalary().add(employee.getBonus())).multiply(BigDecimal.valueOf(1.15));
	}

}
