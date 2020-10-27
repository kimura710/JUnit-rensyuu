package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class CalculatorTest {

	@Test
	public void muitiplyで3と4の算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multply(3, 4);
		assertThat(actual,is(expected));
	}
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
	// 標準的な振る舞いを検証するテスト
	@Test
	public void addに3と4を与えると7を返す() throws Exception{
	 // SetUp-初期化
		Calculator sut = new Calculator();
		sut.init();
	 // Exercise-テストの実行
		int actual = sut.add(3,4);
     // Verifyー検証
		assertThat(actual, is(7));
	// Tear Downー後処理
		
	}
	

}