package kr.or.bit;

public class Emp {
    private int empno;
    private String ename;
    private String job;  //3개 멤버필드 캡슐화
    
    public Emp() {  //디폴트 컨스트럭터
        
    }
    
    public Emp(int empno, String ename, String job) {   //오버로딩 컨스트럭터 3개의 멤버필드 초기화
        super();
        this.empno = empno;
        this.ename = ename;
        this.job = job;
    }

    public int getEmpno() {  //캡슐화된 멤버필드 접근할 수 있는 게터세터
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

    @Override
    public String toString() {  //각각의 멤버필드 값을 출력할 수 잇는 투스트링 오버라이드
        return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + "]";
    }
    
    
    

}
