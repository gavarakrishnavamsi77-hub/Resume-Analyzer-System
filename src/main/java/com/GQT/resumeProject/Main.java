package com.GQT.resumeProject;

public class Main {

	public static void main(String[] args) throws Exception {
		Manager rm = new Manager();
		rm.readResume("C:\\Users\\gavar\\Downloads\\ResumeReader\\ResumeReader\\samples");
		rm.countResume();
		rm.displayAll();
		rm.countJavaStudents();
		rm.countPythonStudents();

	}

}
