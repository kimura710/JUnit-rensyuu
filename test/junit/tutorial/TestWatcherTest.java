package junit.tutorial;

import static org.junit.Assert.*;

import java.util.logging.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TestWatcherTest {

	@Rule
	public TestWatcher testWatcher = new TestWatcher() {
		@Override
		protected void starting(Description desc) {
			Logger.getAnonymousLogger().info("start:" + desc.getMethodName());
		}

		@Override
		protected void succeeded(Description desc) {
			Logger.getAnonymousLogger().info("succeeded:" + desc.getMethodName());
		}

		@Override
		protected void failed(Throwable e, Description desc) {
			Logger.getAnonymousLogger().log(Level.WARNING, "failed: " + desc.getMethodName(), e);
		}

		@Override
		protected void finished(Description desc) {
			Logger.getAnonymousLogger().info("finished: " + desc.getMethodName());
		}
	};
	@Test
	public void 成功するテスト()throws Exception{
		
	}
	@Test
	public void 失敗するテスト()throws Exception{
		fail("NG");
		
	}
	
}
