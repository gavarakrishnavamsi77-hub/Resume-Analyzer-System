package com.GQT.filejandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class fileprogram2 {

	public static void main(String[] args) throws IOException {
//		String p1 = "D:\\filehandling//input1.txt";
//		String p2 = "D:\\filehandling//output2.txt";
//		FileReader fr = new FileReader(p1);
//		int temp;
//		FileWriter fw = new FileWriter(p2);
//		while((temp = fr.read()) != -1) {
//			fw.write(temp);
//		}
//		fr.close();
//		fw.close();
		
		String p1 = "D:\\filehandling//input5.txt";
		String p2 = "D:\\filehandling//output6.txt";
		FileReader fr = new FileReader(p1);
		int temp;
		FileWriter fw = new FileWriter(p2);
		while((temp = fr.read()) != -1) {
			fw.write(temp);
		}
		fr.close();
		fw.close();

	}

}
