package com.GQT.filejandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileHandlingpro1 {

	public static void main(String[] args)throws FileNotFoundException, IOException{
//		String p1 = "D:\\filehandling//input.txt";
//		String p2 = "D:\\filehandling//output.txt";
//		FileInputStream fis = new FileInputStream(p1);
//		int temp;
//		FileOutputStream fos = new FileOutputStream(p2);
//		while((temp = fis.read())!= -1) {
//			fos.write(temp);
//			
//		}
//		fis.close();
//		fos.close();
		
		String p1 = "D:\\filehandling//input4.txt";
		String p2 = "D:\\filehandling//output5.txt";
		FileInputStream fis = new FileInputStream(p1);
		int temp;
		FileOutputStream fos = new FileOutputStream(p2);
		while((temp = fis.read())!= -1) {
			fos.write(temp);
			
		}
		fis.close();
		fos.close();

	}

}
