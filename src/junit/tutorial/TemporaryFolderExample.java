package junit.tutorial;

import java.io.File;
import java.io.IOException;

public class TemporaryFolderExample {
	public static void mkDefaultFiles(File folder) {
		String rootPath = folder.getPath();
		File file = new File(rootPath + "/UnitTest");
		File file2 = new File(rootPath + "/readme.txt");
		try {
			file.createNewFile();
			file2.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
