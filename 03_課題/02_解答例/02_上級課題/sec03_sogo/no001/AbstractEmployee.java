package mvc.java.kadai.se.cat02.sec03_sogo.no001;
import java.math.BigDecimal;

public abstract class AbstractEmployee implements Employee {

	/**
	 * 従業員名
	 */
	private String name;

	/**
	 * 給料(月給12か月分)
	 */
	private BigDecimal salary;

	/**
	 * 病欠日数
	 */
	private int sickDays;

	/**
	 * コンストラクタ
	 * @param name
	 * @param salary
	 * @param sickDays
	 */
	public AbstractEmployee(String name, BigDecimal salary, int sickDays){
		this.name = name;
		this.salary = salary;
		this.sickDays = sickDays;

	}

	@Override
	public int getDaysOffSick() {
		return sickDays;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public BigDecimal getSalary() {
		return salary;
	}




}
