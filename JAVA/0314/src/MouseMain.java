
public class MouseMain {

	public static void main(String[] args) {
	
		Mouse m1 = new Mouse();
		m1.left();
		m1.right();
		m1.drag();
		
		WheelMouse m2 = new WheelMouse();
		m2.left();
		m2.right();
		m2.drag();
		m2.scroll();
		
		HumanMouse m3 = new HumanMouse();
		m3.left();
		m3.right();
		m3.drag();
		m3.relief();
		
		

	}

}
