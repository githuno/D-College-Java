package mvc.java.kadai.se.cat02.sec03_sogo.no001;
import java.math.BigDecimal;

public interface PayModel {

	/**
	 * 従業員人件費算出
	 * @param employee
	 * @return
	 */
	public BigDecimal calcEmployeeCost(Employee employee);

}
