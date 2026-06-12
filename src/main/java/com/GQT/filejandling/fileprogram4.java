package com.GQT.filejandling;

import java.io.*;

public class fileprogram4 {

	public static void main(String[] args)throws FileNotFoundException, IOException{
		String p1 = "D:\\filehandling//nvm.jpeg";
		String p2 = "D:\\filehandling//copy.jpeg";
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
