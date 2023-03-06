package com.wecodee.practice.regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ThreadUtil {

	public static void executeInNewThread(Runnable runnable) {
		new Thread(runnable).start();
	}
}

class FileReaderForMobileAndEmail {

	public void fileReaderForMobileNumber() throws Exception {

		PrintWriter out = new PrintWriter("C:\\Users\\Hp\\Documents\\3. MY_NOTES\\Input-output\\numbers.txt");

		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");

		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\Hp\\Documents\\3. MY_NOTES\\Input-output\\input.txt"));

		String line = br.readLine();

		while (line != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				out.println(m.group());
			}
			line = br.readLine();
		}
		out.flush();

	}

	public void fileReaderForEmailId() throws Exception {

		PrintWriter out = new PrintWriter("C:\\Users\\Hp\\Documents\\3. MY_NOTES\\Input-output\\emails.txt");

		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");

		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\Hp\\Documents\\3. MY_NOTES\\Input-output\\input.txt"));

		String line = br.readLine();

		while (line != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				out.println(m.group());
			}
			line = br.readLine();
		}
		out.flush();
	}

	public void filesReaderFromFolder() {

		int count = 0;

//		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9 _.-]*[.]txt");
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9 _.-]*[.](java|class)");

		File f = new File(
				"D:\\Java-projects\\Java8-features\\Java8-features\\src\\main\\java\\com\\wecodee\\Java8features\\lamda");

		File f1 = new File(
				"D:\\Java-projects\\Java8-features\\Java8-features\\target\\classes\\com\\wecodee\\Java8features\\lamda");

		String[] s = f1.list();

		for (String s1 : s) {
			Matcher m = p.matcher(s1);
			if (m.find() && m.group().equals(s1)) {
				count++;
				System.out.println(s1 + "\n");
			}
		}

		System.out.println("Total number of files : " + count);
	}

}

public class RegexDemoForFileReader {

	public static void main(String[] args) throws Exception {

		new FileReaderForMobileAndEmail().fileReaderForMobileNumber();

		new FileReaderForMobileAndEmail().filesReaderFromFolder();
		
		new FileReaderForMobileAndEmail().fileReaderForEmailId();

//		ThreadUtil.executeInNewThread(() -> {
//			try {
//				new FileReaderForMobileAndEmail().fileReaderForEmailId();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		});

	}

}
