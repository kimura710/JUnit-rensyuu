package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.File;
import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderExampleTest {
	
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder();

	@SuppressWarnings("deprecation")
	@Test
	public void mkFiles‚É‚æ‚Á‚Ä2‚Â‚Ìƒtƒ@ƒCƒ‹‚ª¶¬‚³‚ê‚é() throws Exception {
		File folder = tmpFolder.getRoot();
		TemporaryFolderExample.mkDefaultFiles(folder);
		String[] actualFiles = folder.list();
		Arrays.sort(actualFiles);
		assertThat(actualFiles.length, is(2));
		assertThat(actualFiles[0], is("UnitTest"));
		assertThat(actualFiles[1], is("readme.txt"));
	}

}
