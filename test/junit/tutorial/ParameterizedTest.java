package junit.tutorial;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ParameterizedTest {

	@RunWith(Theories.class)
	public static class 数値の場合 {
		@DataPoint
		public static int INT_PARAM_1 = 3;
		@DataPoint
		public static int INT_PARAM_2 = 4;

		@Theory
		public void testCase(int num) throws Exception {
			System.out.println("入力値：" + num);
		}

	}

	@RunWith(Theories.class)
	public static class 文字列の場合 {
		@DataPoint
		public static String STR_PARAM_1 = "Hello";
		@DataPoint
		public static String STR_PARAM_2 = "World";

		@Theory
		public void testCase(String str) throws Exception {
			System.out.println("入力値：" + str);
		}

	}

	@RunWith(Theories.class)
	public static class 数値と文字列の場合 {
		@DataPoint
		public static int INT_PARAM_1 = 3;
		@DataPoint
		public static int INT_PARAM_2 = 4;
		@DataPoint
		public static String STR_PARAM_1 = "Hello";
		@DataPoint
		public static String STR_PARAM_2 = "World";

		@Theory
		public void testCase(int num, String str) throws Exception {
			System.out.println("入力値：" + num + "、" + str);
		}

	}

	@RunWith(Theories.class)
	public static class 数値と数値の場合 {
		@DataPoint
		public static int INT_PARAM_1 = 3;
		@DataPoint
		public static int INT_PARAM_2 = 4;

		@Theory
		public void testCase(int num1, int num2) throws Exception {
			System.out.println("入力値：" + num1 + "、" + num2);
		}

	}

}
