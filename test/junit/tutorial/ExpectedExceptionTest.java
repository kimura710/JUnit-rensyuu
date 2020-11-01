package junit.tutorial;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionTest {
	// 例外発生を期待しない場合のためにExpectedException.none()にする
	@Rule
	public ExpectedException exException = ExpectedException.none();

	@Test
	public void 例外メッセージをルールを使って検証するテスト()throws Exception{
		exException.expect(ArithmeticException.class);
		exException.expectMessage(containsString("by zero"));
		int result = 1/0;
		System.out.println(result);
	}

}
