package com.smhrd.domain;

public class Member {
	
//회원가입해서 정보를 입력하면 세정보를 받아가지고 멤버라는 객체 안에 존재할수있도록 값들을 묶어줄거임 - 한꺼번에 묶을 객체를 Member클래스에 넣어놈
	private String id;
	private String pw;
	private String nick;
	
	
//	Member a = new Member(); //멤버객체() 생성 = 인스턴스 생성
//	Member b = new Member(); //멤버객체() 
	
	//메모리상 위치가 다름(다른주소에있음) - 인스턴스라고치면 타입은 같지만 서로 다른 인스턴스 (같은 객체가 필요하닌까 ! )
	
	
	public Member(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
		
	}

	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
	}


	public String getNick() {
		return nick;
	}
	
	

}
