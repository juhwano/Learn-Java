import java.util.HashMap;
import java.util.Set;

//구구단 게임 or 랜덤 퀴즈

//Map : 
//key:  중복x   value:  중복o

//key들의 집합을 뽑아낸것  >> 규칙이 있다 >> 순서(x) >> 중복(x) -> Set 안에 add add add 하고 return한 것
//왜 리턴값이 Set일까? Set객체를 만들고 거기에 집어넣는것
class QuizInfo {
    String question;
    String answer;
    String result;
    
    public QuizInfo(String question, String answer, String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }

	@Override
	public String toString() {
		return "QuizInfo [question=" + question + ", answer=" + answer + ", result=" + result + "]";
	}
    
}
public class Ex15_HashMap_Quiz {

	public static void main(String[] args) {
		HashMap<String, String> quiz = new HashMap<>();
		quiz.put("1+1", "2");
		quiz.put("1+2", "3");
		quiz.put("1+3", "4");
		
		for(int i = 0 ; i < quiz.size() ; i++) {
			Set set =quiz.keySet();  //키의 집합 뽑았어.
			Object[] obj= set.toArray();   //Set을 toArray를 이용해서 배열로 만듬. 작은 숫자 먼저 들어가는게 아니라 랜덤이다. key를 get으로 던지면 답이 나옴.
//			System.out.println(obj.length);
			System.out.println("문제 : " + obj[i]);
			System.out.println(quiz.keySet().toArray()[i]);
//			위의 두 값은 출력방식이 다를 뿐 같은 말인거다. 담아서 출력하나. 그냥 출력하나
			System.out.println(quiz.get(quiz.keySet().toArray()[i]));  //value값을 얻어냄. 문제를 내고 답을 내는 퀴즈
		}

	}

}