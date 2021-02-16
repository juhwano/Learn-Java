import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Set 인터페이스 : 순서(x) , 중복(x)
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		hs.add("C");
		System.out.println(hs.toString());
//		넣은 순서대로 나오는게 아니라 원 안의 어디선가 있을건데 우연히 쪼로록 나옴
		
//		TreeSet
//		순서(x) 중복허용(x) 근데 정렬 좀 해주면 안돼? -> TreeSet!(중복허용x , 순서유지x, 정렬저장o) -> lotto 아녀?
//		순서와 정렬은 다름.. 정렬은 데이터 순
//		검색하거나 정렬이 필요할때 사용하는 자료구조(데이터 집합)
//		밸런스트리 - 하나가 가질 수 있는 최대 2개(이진트리)
//		class TreeNode {
//			TreeNode left;  왼쪽 자식노드
//			Object element; 저장할 객체
//			TreeNode right; 오른쪽 자식노드
		
//		1.이진검색트리구조
//		2.데이터가 저장될 때 정렬된다. 넣을때!
//		-데이터 읽을 때는 부메랑처럼 읽음 ^ . 
//		그냥 로또...
//		탄생배경 : 검색
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i = 0; lotto.size() < 6 ; i++) {
			lotto.add((int)(Math.random()*45 + 1));
		}
		System.out.println(lotto.toString());
		
	}
}
