package mvc.java.kadai.se.cat02.sec03_sogo.no001;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class LowPaidEmployee extends AbstractEmployee {

	public LowPaidEmployee(String name, BigDecimal salary, int sickDays) {
		super(name, salary, sickDays);
	}

	@Override
	public BigDecimal getBonus() {
		// LowPaidEmployee：ボーナスは月給（12ヶ月分）の40％
		return getSalary().multiply(BigDecimal.valueOf(0.4)).setScale(2,RoundingMode.HALF_UP);
	}
}
