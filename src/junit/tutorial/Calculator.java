package junit.tutorial;

public class Calculator {
	
	public int multply(int x,int y) {
		return x * y;
	}
	public float divide(int x,int y) {
		if(y == 0) throw new IllegalArgumentException("divide by zero.");
		return (float)x/(float)y;
	}
	public void init() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}
	public int add(int i, int j) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return i + j;
	}
	
 

}