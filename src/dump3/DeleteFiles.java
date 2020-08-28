package dump3;

import java.io.File;

public class DeleteFiles {

	public static boolean deleteDir(File dir) {
		File[] files = dir.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					deleteDir(file);
				} else {
					file.delete();
				}
			}
		}
		return dir.delete();
	}
}
