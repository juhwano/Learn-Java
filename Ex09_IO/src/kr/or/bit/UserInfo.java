package kr.or.bit;

import java.io.Serializable;

/*
객체 통신
객체 (Car , Tv ) 네트워크 또는 파일(txt write,read) 간,  프로세스 간에 통신
직렬화 : 객체를 분해해서 줄을 세워 보내는 과정
역직렬화 : 객체를 다시 조립하는 과정

실습
대상 >> File >> UserInfo 객체 write (직렬화)

대상 >> file >> 직렬화된 UserInfo 객체를 read 조립(역직렬화)

조립식 : 본드 붙여서
레고식 : 붙였다 띠었다

UserInfo implements Serializable (조립 분해)
*/
public class UserInfo implements Serializable {
	private String name;
	private String pwd;
	private int age;
	
	public UserInfo() {
		super();
	}

	public UserInfo(String name, String pwd, int age) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getPwd() {
		return pwd;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
	
}







