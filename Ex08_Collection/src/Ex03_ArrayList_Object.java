import java.lang.reflect.Array;
import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        //사원 1명 만드세요.
        Emp emp = new Emp(100, "김유신", "군인");
        System.out.println(emp.toString());
        
        //사원 2명을 만드세요.
        //Array
        Emp[] emplist = {new Emp(100, "김씨", "일반") , new Emp(200, "박씨", "학생")};
        for(Emp e : emplist) {
            System.out.println(e.toString());
        }

        //problem : 1명 입사를 더 했어요. 추가해주세요
        //기존방법 : 방 2개 고정... 방 3개 새로 생성해서 해야함
        //1. Emp[] emplist = new Emp[3];
        //2. 기존 데이터 이동 ... 
        
        //해결방법 : Collection ...
        //ArrayList
        ArrayList elist = new ArrayList();
        elist.add(new Emp(1, "강", "IT"));
        elist.add(new Emp(2, "김", "IT"));
        
        //1명 입사
        elist.add(new Emp(3, "이", "IT"));
        System.out.println(elist.size());
        for(int i = 0; i < elist.size(); i++) {
//            System.out.println(elist.get(i));
//            Emp e = elist.get(i); -> 못 씀, ArrayList가 가지고있는 배열 타입 Object[] ...
            Object obj = elist.get(i); //Object로 받으면 가능함~~
//            System.out.println(obj);  //재정의한 toString()을 호출해버린것
            Emp e = (Emp)obj;
            System.out.println(e.getEmpno() + " / " + e.getEname() + " / " + e.getJob());
        }
        
        for(Object e : elist) {
            //목적에 따라서는 down casting이 필요할 때가 있다.
            Emp e2 = (Emp)e;
        }
        
        
        //개발자가 제일 casting 예외 싫어함
        //개짜증..
        //Object 싫어.. 안 쓰고 싶어
        //JAVA 만든 사람에게 요청
        //generic 타입(객체 생성 타입 강제)
        //현업에서 90% 제너릭 ... 안 쓰면 맞아요
        
        ArrayList<Emp> list2 = new ArrayList<Emp>();
        list2.add(new Emp(1, "A" , "IT"));  //<-Emp 주소값만 들어감
        
        for(Emp e : list2) {
            System.out.println(e.getEmpno());
        }
        
        
        
    }

}
