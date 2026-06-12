package com.GQT.filejandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class fileprogram3 {

	public static void main(String[] args) throws IOException {
		String p1 = "D:\\filehandling//input2.txt";
		String p2 = "D:\\filehandling//output3.txt";
		FileReader fr = new FileReader(p1);
		BufferedReader br = new BufferedReader(fr);
		int temp;
		FileWriter fw = new FileWriter(p2);
		BufferedWriter bw =  new BufferedWriter(fw);
		while((temp = br.read()) != -1) {
			bw.write(temp);
		}
		bw.close();
		br.close();
		fr.close();
		fw.close();

		
	}

}
