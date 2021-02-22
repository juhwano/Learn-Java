import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;
//쓰레드 아님

//Quiz 에 대한 정보 (문제 , 입력한 답 , 결과 )
class QuizInfo2 {
    String question;
    int answer;
    String result;
    
    public QuizInfo2(String question, int answer, String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }
    
    public String toString() {
        return "문제:"+this.question+" 쓴답:"+this.answer+" 채점:"+this.result;
    }
}


public class Ex06_GuGuDan {

	public static void main(String[] args) {
		//hint_1 : HashMap 구구단 만들기 
		HashMap<String, Integer> gugudan = new HashMap<String, Integer>();
		
		for(int i = 0 ; i < 5 ; i++) {
			int num1 = (int)(Math.random()*9)+1;
			int num2 = (int)(Math.random()*9)+1;
			gugudan.put(num1+"*"+num2, num1*num2);
		}
		//Map에 값을 전체 출력하기 위해서는 entrySet(), keySet() 메소드를 사용하면 되는데 
		//entrySet() 메서드는 key와 value의 값이 모두 필요한 경우 사용하고, keySet() 메서드는 key의 값만 필요한 경우 사용합니다.
		for(Map.Entry m : gugudan.entrySet()) {
			System.out.println(m.getKey() + "/" +m.getValue());
		}
		
		/*
		for(자료형 변수명 : 수식){
			문장
			}

			이 때 변수(객체)의 자료형은 원소의 자료형과 반드시 호환 가능해야 하며 명시된 변수는
			문장내에서 지역변수로 간주된다. 이건 뭐..당연한 이야기고
			그리고 수식은 데이터 집합을 나타내는 배열이나 여러 원소를 포함할 수 있는 자료형이어야 한다.

			중요!! 개선된 for문의 실행은 데이터 집합의 첫 번째 원소부터 순서대로 마지막 원소까지
			반복하여 몸체를 실행한다.
		*/
		//hint_3
		//처리 결과 (문제 , 사용자가 입력한 값 , 유무) 관리
		//class QuizInfo 
		ArrayList<QuizInfo> QuizUserInfo = new ArrayList<QuizInfo>();
		
		
		//hint_2
		//gugudan  문제와  답 비교하기 (문제 .... 답값 받기)
		Set keys = gugudan.keySet();
		Object[] keylist = keys.toArray();
		int answer=0;
		for(int i = 0 ; i < keylist.length ; i++) {
		    answer = Integer.parseInt(JOptionPane.showInputDialog((String)keylist[i]));
		    System.out.println(answer);
		    if(gugudan.get(keylist[i])==answer) {
		    	System.out.println("당신은 정답");
		    	QuizUserInfo.add(new QuizInfo((String)keylist[i], answer, "O"));
		    }else {
		    	System.out.println("당신은 오답");
		    	QuizUserInfo.add(new QuizInfo((String)keylist[i], answer, "X"));
		    }
		}
		
		for(int i = 0 ; i < QuizUserInfo.size() ; i++) {
			System.out.println(QuizUserInfo.get(i).toString());
		}
		
		
		

	}

}
