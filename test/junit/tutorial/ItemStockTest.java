package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(Enclosed.class)
public class ItemStockTest {

	public static class ��̏ꍇ {
		ItemStock sut;

		@Before
		public void Setup() throws Exception {
			sut = new ItemStockImpl();
		}

		@Test
		public void size_A��0��Ԃ�() throws Exception {
			assertThat(sut.size("A"), is(0));
		}

		@Test
		public void contains_A��false��Ԃ�() throws Exception {
			assertThat(sut.contains("A"), is(false));
		}
	}

	public static class ���iA��1���܂ޏꍇ {
		ItemStock sut;

		@Before
		public void TestSetup() throws Exception {
			sut = new ItemStockImpl();
			sut.add("A", 1);
		}

		@Test
		public void size��1��Ԃ�() throws Exception {
			assertThat(sut.size("A"), is(1));
		}

		@Test
		public void contains_A��true��Ԃ�() throws Exception {
			assertThat(sut.contains("A"), is(true));
		}
	}

}