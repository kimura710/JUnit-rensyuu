package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthGraphicsUtils;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

@SuppressWarnings("deprecation")
public class CalculatorTest {

	@SuppressWarnings("deprecation")
	@Test
	public void muitiplyで3と4の算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multply(3, 4);
		assertThat(actual,is(expected));
	}
	@SuppressWarnings("deprecation")
	@Test
	public void muitiplyで5と7の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.multply(5, 7);
		assertThat(actual,is(expected));
	}
	@Test
	public void divideで3と2の除算結果が取得できる() {
	Calculator calc= new Calculator();
	float expected = 1.5f;
	float actual = calc.divide(3, 2);
	assertThat(actual, is(expected));
	
	}
	@Test(expected = IllegalArgumentException.class)
	public void divideで5と0のときIllegalArgumentExceptionを送出する() {
		Calculator calc = new Calculator();
		calc.divide(5, 0);
		
	}
	@Test
	public void 要素が2つ追加された状態で要素をremoveするとsizeが1となる（）throws Exception{
		// SetUp
		ArrayList<String> str = new ArrayList<String>();
	    str.add("Hello");
	    str.add("World");
	    // Exercise
	    str.remove(0);
	    // Verify
	    assertThat(str.size(), is(1));
	    assertThat(str.get(0), is("World"));
	
	}
	

}