package hint;

public class Japanese extends Language{
	//자판기에 사용하려면 language 타입이여야함.
		//어 너 랭귀지 상속받았어? 그럼 미구현된 메소드들 구체화(구현)시켜야해 ->강제적
	//add-unemplemented methods 
	
	@Override
	public String getTitleMSG() {
		// TODO Auto-generated method stub
		return "곤니찌와";
	}

	@Override
	public String getInputMoneyMSG() {
		// TODO Auto-generated method stub
		return "insert coin please >>";
	}

	@Override
	public String getShowMenuMSG1() {
		// TODO Auto-generated method stub
		return "choose your flavor";
	}


	@Override
	public String getReturnChange1() {
		// TODO Auto-generated method stub
		return "not enough money.";
	}

	@Override
	public String getReturnChange2(int money) {
		// TODO Auto-generated method stub
		return "You have" + money + "won left";
	}
	
	
	

}
