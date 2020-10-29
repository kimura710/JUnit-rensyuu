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

	public static class ‹ó‚Ìê‡ {
		ItemStock sut;

		@Before
		public void Setup() throws Exception {
			sut = new ItemStockImpl();
		}

		@Test
		public void size_A‚ª0‚ğ•Ô‚·() throws Exception {
			assertThat(sut.size("A"), is(0));
		}

		@Test
		public void contains_A‚Ífalse‚ğ•Ô‚·() throws Exception {
			assertThat(sut.contains("A"), is(false));
		}
	}

	public static class ¤•iA‚ğ1ŒŠÜ‚Şê‡ {
		ItemStock sut;

		@Before
		public void TestSetup() throws Exception {
			sut = new ItemStockImpl();
			sut.add("A", 1);
		}

		@Test
		public void size‚ª1‚ğ•Ô‚·() throws Exception {
			assertThat(sut.size("A"), is(1));
		}

		@Test
		public void contains_A‚Ítrue‚ğ•Ô‚·() throws Exception {
			assertThat(sut.contains("A"), is(true));
		}
	}

}