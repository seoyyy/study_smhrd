package 추상;

public class Main {

	public static void main(String[] args) {
		
	//디폴드생성자메소드가아닌 따로 생성자메소드줬으니 그 형식대로 데이터넣어줌	
	RegularEmployee regular = new RegularEmployee("SMHRD001","홍ㅇ동", 4000, 400);
	
		System.out.println(regular.print());
		
		System.out.println(regular.getMoneyPay() + "만원");
		
		System.out.println();
		
	TempEmployee temp = new TempEmployee("SMHRD002","박ㅇ수",3000);
	
	System.out.println(temp.print());
	System.out.println(temp.getMoneyPay() + "만원");
	
	
	PartTimeEmployee part = new PartTimeEmployee("SMHRD003","김ㅇ독",10,10);
	System.out.println(part.print());
	System.out.println(part.getMoneyPay()+"만원");
	
	}
}
