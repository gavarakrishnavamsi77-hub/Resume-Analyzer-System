package com.GQT.resumeProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Manager {
	ArrayList<Resume> ar = new ArrayList<Resume>();
	public ArrayList<Resume> getResumes(){
		return ar;
	}

	public void readResume(String folderpath) throws IOException {
		File f = new File(folderpath);
//		System.out.println(f.exists());
//		System.out.println(f.isDirectory());
		File[] files = f.listFiles();
		for (File file : files) {
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			String name = "";
			String email = "";
			String skills = "";
			String number = "" ;
			boolean skillSection = false;

			while((line = br.readLine()) != null) {

			    if(name.isEmpty()) {
			        name = line.trim();
			    }

			    if(line.startsWith("Email:")) {
			        email = line.substring(6).trim();
			    }

			    if(line.toUpperCase().contains("SKILLS")) {
			        skillSection = true;
			        continue;
			    }
			  if(line.toLowerCase().startsWith("number:")) {
				  number = line.substring(7).trim();
			  }

			    if(skillSection) {
			        skills = line.trim();
			        skillSection = false;
			    }
			}
			
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//				if (line.startsWith("Name:")) {
//					name = line.substring(5).trim();
//				}
//				else if(line.startsWith("email:")) {
//					email = line.substring(6).trim();
//				}
//				else if(line.startsWith("skills:")) {
//					skills = line.substring(7).trim();
//				}
//			}
			br.close();
			ar.add(
					new Resume(name, skills, email,number));
		}
	}
	public void displayAll() {
		System.out.println("\n================RESUME ANALYSIS REPORT==================\n");
		int sno = 1;
		for(Resume r : ar){
		    System.out.println("Resume No : " + sno++);
	        System.out.println("....................................");
	        System.out.println("Name      : " + r.getName());
	        System.out.println("Email     : " + r.getEmail());
	        System.out.println("Skills    : " + r.getSkill());
	        System.out.println("Number    : " + r.getNumber());
	        System.out.println(".....................................\n");
		}
	}
	public void countResume() {
		System.out.println("Total Resumes processed : " + ar.size());
	}
	public void countJavaStudents() {
		int count = 0;
		for(Resume r : ar) {
			if(r.getSkill().
					toLowerCase().
					contains("java")) {
				count++;
			}
		}
		System.out.println("Java candidates  : " + count);
	
	}
	public void countPythonStudents() {
		int count = 0;
		for(Resume r : ar) {
			if(r.getSkill().
					toLowerCase().
					contains("python")) {
				count++;
			}
		}
		System.out.println("pyhton Candidates  : " + count);
	}
}
