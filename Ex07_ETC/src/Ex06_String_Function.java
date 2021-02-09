


public class Ex06_String_Function {

	public static void main(String[] args) {
		// 일상적으로 다루는 데이터 : 문자열, 숫자, 날짜 >> 함수(시스템 함수) , 자바를 만든 사람들의 api
		
		//concat
		String str ="hello";
		String concatstr = str.concat(" world");
		System.out.println(concatstr);
		System.out.println("--------------");
		//contain
		boolean bo = str.contains("ello");
		System.out.println(bo);

		bo = str.contains("elo");
		System.out.println(bo);
		System.out.println("--------------");
		//length
		String str2 = "a b c d"; // [a][ ][b][ ][c][ ][d]
		System.out.println(str2.length());
		System.out.println("--------------");
		//indexOf (숫자)
		String filename = "hello java world";
		System.out.println(filename.indexOf("j"));
		System.out.println(filename.indexOf("java"));
		System.out.println(filename.indexOf("개폭망")); //***배열에서 값이 없다는 -1로 표현
		
		//신문 사설 ... 단어or문자 포함되있는지 확인하고싶음 ..
		//"폭망" .. 있을까? 0보다 큰 값이 나오면 최소 1개는 사설 안에 포함되어있다.
		// -1 return 폭망이 없구나 ..
		if(filename.indexOf("wo") != -1){
			System.out.println("wo 하나라도 가지고 있구나.");
		}
		System.out.println("--------------");
		//lastIndexOf
		System.out.println(filename.lastIndexOf("a"));
		
		//length() , indexOf(), substring() , replace(), split()
		System.out.println("--------------");
		String result = "superman";
		System.out.println(result.substring(0)); //그 시점부터 뒤에거 쫙~ superman
		System.out.println(result.substring(2)); // perman
		System.out.println(result.substring(1, 2)); // u >> endindex - 1 >> 자기자신
		System.out.println(result.substring(0, 0)); // (0, -1)
		
		//Quiz
		String jumin = "h.jpeg"; //또는 파일명이 hong.png 또는 파일명이 h.tmp
		//여기서 파일명과 확장자를 분리해서 화면에 출력하세요.
		//1.파일명 h
		//2.확장자 jpeg
		//위에서 배운 함수만 쓰세요.
		
		//공통점을 찾아라    . 앞 뒤 처럼
		int position2 = jumin.indexOf(".");
		String file = jumin.substring(0, position2);
		
		String extention2 = jumin.substring(position2+1, jumin.length());
		String extention = jumin.substring(++position2);
		
		System.out.println(file);
		System.out.println(extention);
		System.out.println(extention2);
		
		//replace (치환함수)
		String str3 = "ABCDADDDDDA";
		String result3 = str3.replace("DDDD", "오늘은 월요일");
		System.out.println(result3); //ABCDA오늘은 월요일DA
		
		result3 = str3.replace("A", "a");
		System.out.println(result3);
		
		//ETC
		
		//charAt (값)
		System.out.println(str3.charAt(0));
		System.out.println(str3.charAt(3));
		
		//endsWith
		System.out.println(str3.endsWith("DDDA")); //뒤에서 어떤 문자가 포함되어있냐 ? true값
		System.out.println(str3.endsWith("BDDDA"));
		
		//equalsIgnoreCase
		System.out.println(str3.equalsIgnoreCase("abcDADDDDDA")); //대소문자 구별없이 일치 유무 T / F
		
		//Today Point (Split)
//		String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
//		// , 기준으로 뽑으면 분리할 수 있겠다.
//		
//		String[] namearray = str4.split(",");
//		for(String s : namearray) {
//			System.out.println(s);
//		}

//      경로를 잡아라
//      String path = "C:\\Temp";      \\두개가 \하나를 표현한것
//      자바가 가진 특징 : \를 이스케이프 문자로 보기 때문
        
        String str4 = "슈퍼맨.팬티.노랑색.우하하.우하하";
        // , 기준으로 뽑으면 분리할 수 있겠다.
        String[] namearray = str4.split("\\.");  // . <-정규표현을 표현하기 위해 첫번째 \ escape ,두번째 \정규표현식
        for(String s : namearray) {
            System.out.println(s);
        }
        
        ////String[] java.lang.String.split(String regex) 
        //split > 정규표현식 문법 따라감
        //정규표현식은 표준화 되어있다(java, javascript, Oracle, C#) 언어에서 정규표현식 도입
        //어떤 문자를 만들때 [규칙] >> 유효성 판단 근거 만들자
        //ex) 주민번호 >> 숫자 6자리 - 숫자 7자리 : {\d6}-{\d7} 십진수 6,7자리가 와야 true
        //    입력값 123-1234567 >> false, 요즘 웹사이트는 다 정규표현식 쓴다.
        //ex2)핸드폰번호, 차량번호 , 우편번호, 한글 처리(ㄱ-ㅎ), 도메인 주소, 이메일 주소
        //    이미 정규표현식은 다 있다(만들지는 못해도 정규표현식 읽을 줄 알아야 한다)
        
        
        
        
        
        //TIP) Java 특수문자

        //이스케이프 문자 >> 특정 문자 앞에 \
        char sing = '\''; 

        // 야 나는 ' 하나를 표현하고 싶어 .... 역슬러시라는 문자와 결합해서 사용하면 ... 문자 인정 
        System.out.println(sing);

        //홍"길"동 이라는 문자를 String 변수에 저장하고 화면에 출력
        String ename = "홍\"길\"동";

        System.out.println(ename);
        
        
        //정규표현식 ... 할거에요
    
		
		
		
		
		//넌센스Quiz
		//1.
		String str6 = "홍              길            동";
		//"홍길동"
		//저장 >> 공백 제거 >> "홍길동" 출력
		
		//공백을 제거하는 함수는 없다. replace 활용
		System.out.println(str6.replace(" ", ""));
		
		//2.
		//양쪽공백 제거 함수는 따로 있다. >> trim 함수
		String str7 = "             홍길동               ";
		System.out.println(">"+str7+"<");
		System.out.println(">"+str7.trim()+"<");
		
		
		//3.
		String str8 = "      홍        길           동     ";
		String result5 = str8.trim();
		String result6 = result5.replace(" ", "");
		System.out.println(result6);
		
		//자바에서 여러 개의 함수를 적용할 때 method chain 기법을 적용
		System.out.println(str8.trim().replace(" ", "").substring(2));
		
		
		 //Quiz-1
		   int sum=0;
		   String[] numarr = {"1","2","3","4","5"};
		   //문제: 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 : 결과 15
		   
		   for(String s : numarr) {
			   sum+=Integer.parseInt(s);    //문자열 값을 정수로
			   //Double .parseDouble(result6) 문자열 값을 실수로
		   }
		   System.out.println("sum : " + sum);
		   
		   
		   
		 //Quiz-2
		   String jumin1="123456-1234567";
		   //위 주민번호의 합을 구하세요_1
		   int sum2=0;
		   for(int i = 0 ; i < jumin1.length() ; i++) {
			   String numstr =jumin1.substring(i, i+1);
			   if(numstr.equals("-")) continue;
			   sum2+= Integer.parseInt(numstr);
		   } 
		   System.out.println("주민번호 합:" + sum2);
		   
		 //위 주민번호의 합을 구하세요_2
		 //String jumin="123456-1234567";
		   String[] numarr2 = jumin1.replace("-","").split("");
		   int sum3=0;
		   for(String i : numarr2) {
			   sum3+= Integer.parseInt(i);
		   }
		   System.out.println("주민번호 합2:" + sum3);
		   
		 //위 주민번호의 합을 구하세요_3
		   String jumin4 = jumin1.replace("-", "");
		   int sum4=0;
		   for(int i = 0 ; i < jumin4.length() ;i++) {
			   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
		   }
		   System.out.println("주민번호 합4:" + sum4);

	}

}
