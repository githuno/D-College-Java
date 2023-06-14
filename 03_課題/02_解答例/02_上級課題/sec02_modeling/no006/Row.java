package mvc.java.kadai.se.cat02.sec02_modeling.no006;

public class Row {

	/** 従業員番号(int empno) */
	private int empno;

	/** 従業員名(String ename) */
	private String ename;

	/** 役職(String job) */
	private String job;

	/** 給料(int sal) */
	private int sal;

	// コンストラクタ
	public Row(int empno, String ename, String job, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	// セッター・ゲッター
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

}
