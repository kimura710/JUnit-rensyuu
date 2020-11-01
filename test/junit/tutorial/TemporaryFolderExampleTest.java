package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.File;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderExampleTest {
	
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder();

	@Before
	public void before()throws Exception{
		tmpFolder.newFile("A");
		tmpFolder.newFile("B");
	}
	@SuppressWarnings("deprecation")
	@Test
	public void ADeleteTest() throws  Exception{
		assertThat(new File(tmpFolder.getRoot(),"A").exists(),is(true));
		assertThat(new File(tmpFolder.getRoot(),"B").exists(), is(true));
		
		new File(tmpFolder.getRoot(),"A").delete();
		
		assertThat(new File(tmpFolder.getRoot(),"A").exists(), is(false));
		assertThat(new File(tmpFolder.getRoot(),"B").exists(), is(true));
		
	}

}
