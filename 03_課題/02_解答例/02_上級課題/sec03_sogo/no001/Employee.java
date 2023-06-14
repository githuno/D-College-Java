package mvc.java.kadai.se.cat02.sec03_sogo.no001;
import java.math.BigDecimal;

public interface Employee {

	/**
	 * 名前取得()
	 * @return
	 */
	public String getName();

	/**
	 *  給料取得
	 * @return
	 */
	public BigDecimal getSalary();

	/**
	 *  ボーナス取得
	 * @return
	 */
	public BigDecimal getBonus();

	/**
	 *  病欠日数取得
	 * @return
	 */
	public int getDaysOffSick();

}
