package mvc.java.kadai.se.cat02.sec03_sogo.no001;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PartTimePaidEmployee extends AbstractEmployee {

	public PartTimePaidEmployee(String name, BigDecimal salary, int sickDays) {
		super(name, salary, sickDays);
	}

	@Override
	public BigDecimal getBonus() {
		// 給料3か月
		return (getSalary().divide(BigDecimal.valueOf(12))).multiply(BigDecimal.valueOf(3)).setScale(2,RoundingMode.HALF_UP);
	}
}
