package junit.tutorial;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutExampleTest {
	@SuppressWarnings("deprecation")
	@Rule
	public Timeout timeout = new Timeout(30);

	@Test
	public void �������Ԃ������邩��test() throws Exception{
		Thread.sleep(20);
	}

	

}
