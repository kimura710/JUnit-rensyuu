package junit.tutorial;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutExampleTest {
	@SuppressWarnings("deprecation")
	@Rule
	public Timeout timeout = new Timeout(30);

	@Test
	public void ’·‚¢ŽžŠÔ‚ª‚©‚©‚é‚©‚àtest() throws Exception{
		Thread.sleep(20);
	}

	

}
