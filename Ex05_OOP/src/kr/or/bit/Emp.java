package kr.or.bit;
//get,set는 각각 읽고 쓸거야

public class Emp {
	private int empno;
	private String ename;
	
	
	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}


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

//	Object가 가지는 toString 재정의 , toString은 멤버필드들이 갖고 있는 값을 찍는 용도
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
//	Object toString()가지고있는데, 원하면 이거 재정의해서 써
//	개발자 >> member field 값 검증하는 용도 >>별도로 함수를 만들지 않고, 주소값or멤버필드 출력
	
	

}
