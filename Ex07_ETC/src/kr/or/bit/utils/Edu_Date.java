package kr.or.bit.utils;

import java.util.Calendar;

//날짜의 형식을 제공하는 설계도
//많이 사용 >> 편하게 >> 기능이 >> new (x) >> static 함수 >> 하나의 이름 (오버로딩)


public class Edu_Date {
	public static String DateString(Calendar date) {
		return  date.get(Calendar.YEAR) + "년" +
				(date.get(Calendar.MONTH)+1) +"월" +
				date.get(Calendar.DATE) + "일";
		
	}
	public static String DateString(Calendar date ,String opr) {
		return  date.get(Calendar.YEAR) + opr +
				(date.get(Calendar.MONTH)+1) +opr +
				date.get(Calendar.DATE);
		
	}
	//요구사항
	//2021년2월17일
	//1~9월 >> 01 , 02 ...
	//10  11  12 >> 그대로
	public static String monthFormat_DateString(Calendar date) {

		String month="";
		if((date.get(Calendar.MONTH) +1) < 10) {
			month = "0"+ (date.get(Calendar.MONTH) +1);
		}else {
			month = String.valueOf((date.get(Calendar.MONTH) +1)); //String.valueOf(정수) >> 문자열 
		}
		//String.valueOf()  숫자를 -> 문자로
		//Integer.parseInt(s)  문자를  -> 정수로
		return date.get(Calendar.YEAR) + "년" 
				+ month + "월" 
				+ date.get(Calendar.DATE) +"일" ;
	}
	
}
/*
int month =5;
String res=""; //빈 문자열로 초기화
switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: res="31";
			break;
		case 4:
		case 6:
		case 9:
		case 11: res="30";
			break;
		case 2: res="29";
		    break;
		default : res ="월 데이터가 아닙니다" ;   
}
 System.out.println(month + "  달의 일수는 " + res);

*/
