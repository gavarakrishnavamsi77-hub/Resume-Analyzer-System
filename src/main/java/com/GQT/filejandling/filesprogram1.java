package com.GQT.filejandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filesprogram1 {

	public static void main(String[] args) throws IOException {
//		String p1 = "D:\\\\filehandling//file1.txt";
//		File f1 = new File(p1);
//		f1.createNewFile();// create the file specified in the path
//		System.out.println(f1.exists());// checks if the file path present or not
//		System.out.println(f1.canExecute());// checks if the file is have execute rigths
//		System.out.println(f1.canRead());// checks if the file can be read
//		System.out.println(f1.getAbsolutePath());// display the file path
//		System.out.println(f1.getCanonicalPath());// display the file path
//		System.out.println(f1.getFreeSpace());// display the spaces unallocated in bytes
//		System.out.println(f1.getName());// display the file name
//		System.out.println(f1.getParent());// display the root path
//		System.out.println(f1.getPath());// display the file path
//		System.out.println(f1.getTotalSpace());// display the space availBLE in bytes
//		System.out.println(f1.getUsableSpace());// display the usable space
//		System.out.println(f1.hashCode());// unique value for file object
//		System.out.println(f1.isAbsolute());// checks if it an absolute path
//		System.out.println(f1.isDirectory());// check if the path points to directory
//		System.out.println(f1.isFile());// checks if the path points to file
//		System.out.println(f1.isHidden());// checks if the file is hidden
//		File f2 = new File("D:\\\\\\\\filehandling//file2.txt");
//		System.out.println(f2.isHidden());
//		System.out.println(f2.lastModified());// last modified values in terms of long
//		System.out.println(f2.length());// prints the total number of characters in the file
		try {
			String p1 = "D:\\filehandling//file3.txt";
			FileWriter fw = new FileWriter(p1);
			fw.write("hello wellcome to GQT");
			fw.close();
			System.out.println("Reading the data from the file ");
			FileReader fr = new FileReader(p1);
			Scanner s = new Scanner(fr);
			while(s.hasNextLine()) {
				String temp = s.next();
				System.out.print(temp);
				
			}
			fr.close();
			s.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
