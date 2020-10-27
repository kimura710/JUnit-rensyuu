package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

public class CalculatorTest {

	@SuppressWarnings("deprecation")
	@Test
	public void muitiply‚Å3‚Æ4‚ÌZŒ‹‰Ê‚ªæ“¾‚Å‚«‚é() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multply(3, 4);
		assertThat(actual,is(expected));
	}
	@SuppressWarnings("deprecation")
	@Test
	public void muitiply‚Å5‚Æ7‚ÌæZŒ‹‰Ê‚ªæ“¾‚Å‚«‚é() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.multply(5, 7);
		assertThat(actual,is(expected));
	}
	@Test
	public void divide‚Å3‚Æ2‚ÌœZŒ‹‰Ê‚ªæ“¾‚Å‚«‚é() {
	Calculator calc= new Calculator();
	float expected = 1.5f;
	float actual = calc.divide(3, 2);
	assertThat(actual, is(expected));
	
	}
	@Test(expected = IllegalArgumentException.class)
	public void divide‚Å5‚Æ0‚Ì‚Æ‚«IllegalArgumentException‚ğ‘—o‚·‚é() {
		Calculator calc = new Calculator();
		calc.divide(5, 0);
		
	}
	

}