import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*
 ###TODAY POINT###
 
 */

public class Ex02_ArrayList {
    public static void main(String[] args) {
        // List 인터페이스 구현: 순서가 있고, 중복이 허용되는 데이터 집합을 다룰 때 쓰는 클래스
        
        ArrayList arraylist = new ArrayList();
        // Object 타입을 가지는 정적 배열이 Heap에 만들어졌다!
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);
        
        for(int i = 0 ; i < arraylist.size() ; i++) {
            System.out.println(arraylist.get(i));
        }
        
        System.out.println(arraylist.toString());
        System.out.println(arraylist.get(0));
        
        // 순차적인 데이터를 다루는 것의 장단점
        // 데이터를 순서대로 놓을 수 있다는 이점이 있지만, (순서가 있는 데이터에 적합하다)
        // 중간에 데이터가 추가되거나 삭제되면 그 뒤에 있던 데이터들이 전부 이동해야 한다. 1명 추가하는데 99명이 이동. 성능Down
        // ㄴ> 비순차적인 데이터를 추가, 삭제하는 것에 대한 단점이 있다.
        
        // [100, 200, 300] >> [111,100, 200, 300]
        arraylist.add(0, 111);
        System.out.println(arraylist); // [111, 100, 200, 300]
        arraylist.add(400);
        System.out.println(arraylist); // [111, 100, 200, 300, 400]
        // 추가적으로 데이터를 삽입할 수 있지만, 자리이동이 일어난다.
        
//  arraylist.remove(100); // java.lang.IndexOutOfBoundsException: Index 100 out of bounds for length 5
        // 값이 아닌 인덱스 번호를 입력해야 한다.       ㄴ> 100번째 방은 없는뎅??
       
        // 현재 arraylist: [111, 100, 200, 300, 400]
        // ArrayList 함수공부 (String 함수 학습)
        System.out.println(arraylist.contains(200)); // ()안의 값을 가지고 있니? >> true
        System.out.println(arraylist.contains(2000)); // >> false
        
        arraylist.clear(); // 데이터만 삭제 , 공간은 유지된다.
        System.out.println(arraylist.size()); // >0
        System.out.println(arraylist.isEmpty()); // 너 비어있니? >> true
        
        arraylist.add(101);
        arraylist.add(102);
        arraylist.add(103);
        
        System.out.println(arraylist.isEmpty()); // >> false
        
        System.out.println("데이터 삭제 전: " + arraylist.size()); // >> 3
        //arraylist.remove(0); 0번째 방의 값을 삭제 -> 삭제된 값을 리턴해준다.
        Object value = arraylist.remove(0);
        System.out.println("value: " + value);
        System.out.println("데이터 삭제 후: " + arraylist.size());
        System.out.println(arraylist); // >> [102, 103]
        
        // ###POINT####
        // 개발자가 자주 쓰는 코드
        // 다형성 ... (확장성, 유연성 면에서 편하게 사용할 수 있다)
        List li = new ArrayList();
        // 이렇게 작성하면 li가 Vector의 주소도 받을 수 있다! 부모타입의 변수가 자식객체의 주소값을 가질 수 있다.
        li.add("가");
        li.add("나");
        li.add("다");
        li.add("라");
        
        List li2 = li.subList(0, 2); // subList를 통해서 데이터 집합을 하나 더 생성하겠다.
        System.out.println(li2.toString());
        
        ArrayList alist = new ArrayList();
        alist.add(50);
        alist.add(1);
        alist.add(7);
        alist.add(40);
        alist.add(46);
        alist.add(3);
        alist.add(15);
        
        System.out.println(alist.toString()); // [50, 1, 7, 40, 46, 3, 15] (0번째 방부터 순서대로 출력)
        Collections.sort(alist); // ######초급자는 버블정렬 등 정렬을 직접 할 줄 알아야한다!!! #######
                                    // 정렬 확실히 사용하기 전에 sort 사용하지 않기
        System.out.println(alist.toString());// [1, 3, 7, 15, 40, 46, 50]
        
        Collections.reverse(alist);
        System.out.println(alist.toString()); // [50, 46, 40, 15, 7, 3, 1]
        //ArrayList에 반기를 들고 개선한게 LinkedList
    }
}