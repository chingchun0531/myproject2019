package exercise;

import java.io.File;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("C:\\upfile");
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File f : files) {
				if (f.isFile()) {
					System.out.println(f.getName());
				}
			}
			System.out.println(dir.mkdir());
			File dd = new File(dir, "aaaaa");
			System.out.println(dd.mkdir());
//System.out.println(dd.delete());
		}

		/*
		 * System.out.println(dir.canExecute()); 
		 * System.out.println(dir.exists());
		 * System.out.println(dir.isDirectory());
		 *  System.out.println(dir.length());
		 * System.out.println(dir.getName()); 
		 * System.out.println(dir.getAbsolutePath());
		 */
	}

}
