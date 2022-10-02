import java.util.ArrayList;
import java.util.Random;

public class PocketMonMain {

	public static void main(String[] args) {
		
		//생성자 메소드, 게터세터
		
		//객체 : 설계도를 통해서 실제로 만들어지는 것
		//설계도 -> 객체화 되는 이과정을 인스턴스 화라고 함. 그리고 실제로 만들어진무언가가 객체
		
		//객체를 생성하는 키워드? new 
		PocketMon mon1 = new PocketMon("피카츄", "전기",30,100,40);
		//내가 만들고 싶은 포켓몬 내용 지정하기 ==>만들고나서 내용집어넣는 방법1번
//		mon1.name = "피카츄";
//		mon1.type = "전기";
//		mon1.attack = 30;
//		mon1.hp = 100;
//		mon1.defence = 40;
		
		//생성자메소드 -> 위처럼 내가어떤생명체를 만들고나서 그 생명체에 내용을 집어넣는게 아니라, 생명체를 만들때 같이 내용을 만들어서
		//2단계로 이루어질 걸 1단계로 줄이기위해서 사용됨.
		
		//객체를 생성함과 동시에 원하는 속성값 지정하기 -> 생성자 메소드 사용!  ==>생성자 오버로딩해줘야함.클래스에
		PocketMon mon2 = new PocketMon("파이리","불", 30, 55, 60);
		
		System.out.println("mon1의 이름  : "+ mon1.getName());
		System.out.println("mon1의 타입  : "+ mon1.getType());
		System.out.println();
		System.out.println("mon2의 이름 :" + mon2.getName());
		System.out.println("mon2의 타입 :" + mon2.getType());
		
		//로켓단의 만행(정보를 바꿔버림 건들여버림) ==> 설계도에 접근제한을 private로 보호해주기
		//mon1.type = "물";
		
		mon1.setAttack(60);
		
		//객체배열(주소) 생성하기  ==> 크기가지정된 
		PocketMon[] ball = new PocketMon[2];
		ball[0] = mon1;
		ball[1] = mon2;
		
		//==> 객체배열주소를적고 .getName같은걸로 뭔가져오겠다는 명령어 적어줘야함
		System.out.println(ball[0].getName());
		
		
		//크기가 지정되지 않은 배열 -> 가변 리스트 -> ArrayList
		//<E> -> 이꺽새를 제네릭이라고 부름
		ArrayList<PocketMon> balls = new ArrayList<>();
		balls.add(mon1);
		balls.add(mon2);		//데이터추가하기
		
		//데이터 값출력하기 
		//mon1전체데이터 arrayList접근할땐 get이라는 메소드 사용해아함
//		System.out.println(balls.get(0).getName());
//		System.out.println(balls.get(0).getType());
//		System.out.println(balls.get(0).getAttrack());
//		System.out.println(balls.get(0).getHp());
//		System.out.println(balls.get(0).getDefence());
//		
		
		for(int i = 0 ; i < balls.size();i++) {
			System.out.println(balls.get(i).getName());
			System.out.println(balls.get(i).getType());
			System.out.println(balls.get(i).getAttrack());
			System.out.println(balls.get(i).getHp());
			System.out.println(balls.get(i).getDefence());
			System.out.println();
		}

		Random rd = new Random();
		int num = rd.nextInt(balls.size());
		
		
		
	}

}
