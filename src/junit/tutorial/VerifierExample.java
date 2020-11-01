package junit.tutorial;

public class VerifierExample {

	 protected Integer value;

	    public void set(int i) {
	        value = i;
	    }

	    public void add(int i) {
	        value += i;
	    }

	    public void minus(int i) {
	        value -= i;
	    }

	    public Integer getValue() {
	        return value;
	    }

	    public void clear() {
	        value = 0;
	    }
	}
