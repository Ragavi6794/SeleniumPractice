package org.filehandling;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
import java.io.*;
public class BufferFile {

	public static void main(String[] args) throws IOException {
	FileWriter f=new FileWriter("C:\\Users\\splpt777\\Desktop\\Javaprogram\\FirstProject\\java\\java.txt");
	BufferedWriter bfw=new BufferedWriter(f);
   bfw.write("Automation Testing .");
//   bfw.newLine();
   bfw.write("Java program.");
   bfw.newLine();
   bfw.close();
   System.out.println("File is writed Successfully \n");
   
   FileReader fr = new FileReader("C:\\Users\\splpt777\\Desktop\\Javaprogram\\FirstProject\\java\\java.txt");
//int read = fr.read();
//System.out.println(read); //65 it just print ASCII value of first letter 
   int count=0;
   BufferedReader bfr = new  BufferedReader(fr);
//   if(bfr!=null) {
//   String read = bfr.readLine();
// count++;}
//   System.out.println(count);
   String read = bfr.readLine();
   System.out.println(read);
	}

}
