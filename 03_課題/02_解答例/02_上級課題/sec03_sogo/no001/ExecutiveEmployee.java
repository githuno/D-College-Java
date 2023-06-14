package mvc.java.kadai.se.cat02.sec03_sogo.no001;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExecutiveEmployee extends AbstractEmployee {

	/**
	 * コンストラクタ
	 * @param name
	 * @param salary
	 * @param sickDays
	 */
	public ExecutiveEmployee(String name, BigDecimal salary, int sickDays) {
		super(name, salary, sickDays);
	}

	@Override
	public BigDecimal getBonus() {
		// ExecutiveEmployee：ボーナスは月給（12ヶ月分）の50％
		return getSalary().multiply(BigDecimal.valueOf(0.5)).setScale(2,RoundingMode.HALF_UP);
	}

}
