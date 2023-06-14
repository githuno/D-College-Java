package mvc.java.kadai.se.cat02.sec02_modeling.no007;

public class Row {

	/** 従業員番号(int empno) */
	private int empno;

	/** 従業員名(String ename) */
	private String ename;

	/** 役職(String job) */
	private String job;

	/** 給料(int sal) */
	private int sal;

	/** 【追加】部門番号(int deptno) */
	private int deptno;

	// コンストラクタ
	public Row(int empno, String ename, String job, int sal, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		// 【追加】
		this.deptno = deptno;
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

	// 【追加】deptnoのセッター・ゲッター

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

}
