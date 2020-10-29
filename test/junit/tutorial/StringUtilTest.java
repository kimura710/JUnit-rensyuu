package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@SuppressWarnings("deprecation")
	@Test
	public void isEmptyOrNullは空文字列でtrueを返す() throws Exception {
		// SetUp
		String input = "";
		boolean expected = true;
		// Exercise
		boolean actual = StringUtilTest.isEmptyOrNull(input);
		// Verify
		assertThat(actual, is(expected));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void isEmptyOrNullはAAAでtrueを返す() throws Exception {
		// SetUp
		String input = "AAA";
		boolean expected = true;
		// Exercise
		boolean actual = StringUtilTest.isEmptyOrNull(input);
		// Verify
		assertThat(actual, is(expected));

	}

	private static boolean isEmptyOrNull(String input) {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

}
