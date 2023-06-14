package mvc.java.kadai.se.cat02.sec02_modeling.no007;

public class RowDept {

	/** 部門番号 */
	private int deptno;

	/** 部門名称 */
	private String dname;

	/** コンストラクタ */
	public RowDept(int deptno, String dname) {
		this.deptno = deptno;
		this.dname = dname;
	}

	public int getDeptno() {
		return deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}


}
