package data_structures;

public class Snake {
	int viciousness;
	boolean venomnous;
	
	public Snake(int viciousness1, boolean venomnous1) {
		viciousness = viciousness1;
		venomnous = venomnous1;
		System.out.println(venomnous1);
	}
	
	int getVisiousness() {
		return viciousness;
	}
	
	boolean getVenomnous() {
		return venomnous;
	}
}
