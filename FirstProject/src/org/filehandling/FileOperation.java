package org.filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;
import java.io.FileNotFoundException;
public class FileOperation {

	public static void main(String[] args) throws IOException,FileNotFoundException {
	//file Write	
FileWriter fw=new FileWriter("C:\\Users\\splpt777\\Desktop\\Javaprogram\\FirstProject\\java\\program.txt");
		fw.write("HI I AM Ragavi.I am Software Tester.562426w");
		fw.close();
		
		System.out.println("File is writed Successfully \n");
	

	//file read get output read data using scanner

	File reader=new File("C:\\Users\\splpt777\\Desktop\\Javaprogram\\FirstProject\\java\\program.txt");
	Scanner sc= new Scanner(reader);
	
	if(sc.hasNextLine()) {
		
	String data=sc.nextLine();
	System.out.println(data);
	sc.close();
	}
	else {
		System.out.println("No Data cannot readable");
	}
	
	}
	
	

}

	

	
	
	
