package sy;
import java.util.Scanner;

public class VendingMachine {
	//자판기 클래스  ->동작하는 방법이나 설계가 쭉들어있는
	 Scanner sc = new Scanner(System.in);
	 
	 
	 int money;
	
	 int itemMoney;
	 
	 int choice;
	
	 
	 public void showTitle() {
	 System.out.println("===자판기 프로그램===");
	 }

     public void insertMoney(){
    System.out.print("돈을 넣으세요 >> ");
     money = sc.nextInt();
     }
     
     
     public void chooseMenu() {
    	 System.out.println("메뉴를 선택하세요");
	     System.out.print("1.물(700) 2.콜라(1000) 3.커피(500) >>");
		
     choice = sc.nextInt();
     
     if(choice == 1){
         itemMoney = 700;
      }else if(choice == 2){
         itemMoney = 1000;
      }else if(choice == 3){
         itemMoney = 500;
      }
//     }
//     
//     
//      
//     public void showbalance(){
    	 
     if(money - itemMoney < 0){
        System.out.println("돈이 부족합니다.");
     }else{
        money -= itemMoney;
        System.out.println(money+"원이 남았습니다.");
     }
     }
     
	
	
	
	
     
}

