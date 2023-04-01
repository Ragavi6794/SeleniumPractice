package org.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
File f= new File("C:\\Users\\splpt777\\Desktop\\Javaprogram\\FirstProject\\java");
//		 
//    	boolean mkdir = f.mkdir();
//		System.out.println("Make Directory\t:"+mkdir);
		
		boolean createNewFile = f.createNewFile();//create new file 
     	System.out.println("File created \t:"+createNewFile);
		
     	
		String absolutePath = f.getAbsolutePath();//get file path
		System.out.println("File Path \t:"+absolutePath);
		
		boolean canWrite = f.canWrite(); //can write
		System.out.println("Writable \t"+canWrite);
		
	   boolean canRead = f.canRead();//can read
	   System.out.println("Readable \t"+canRead);
	   
	   String name = f.getName();//get filename
	   System.out.println("File Name \t"+name);
	   
	   long length = f.length(); //file length
	   System.out.println("File Length \t "+length);
	   
	   boolean exists = f.exists();//if file present or not
		System.out.println("Present or not\t"+exists);
		
		boolean canExecute = f.canExecute();
		System.out.println(canExecute);
		
//		boolean delete = f.delete();
//		System.out.println("File delete \t" +delete );
		
//		File newname=new File("C:\\Users\\splpt777\\Desktop\\Javaprogram\\FirstProject\\java\\python.txt")
//				boolean renameTo = f.renameTo(newname);
//				System.out.println(renameTo);
	   
	 	
		//other logic
	
		File ff=new File("C:\\Users\\splpt777\\Desktop\\Javaprogram\\FirstProject\\my1.txt");
		
		//ragavi.txt incase of not inthis file we can create if already there not creted
				if(!ff.exists()) {
					boolean cn = ff.createNewFile();
					System.out.println("File created\t:" +cn);
					
					String absolutePath1 = ff.getAbsolutePath();//get file path
					System.out.println("File Path \t:"+absolutePath1);
					
					boolean canWrite1 = ff.canWrite(); //can write
					System.out.println("Writable \t"+canWrite1);
					
				   boolean canRead1 =ff.canRead();//can read
				   System.out.println("Readable \t"+canRead1);
				   
				   String name1 = ff.getName();//get filename
				   System.out.println("File Name \t"+name1);
				   
				   long length1 = ff.length(); //file length
				   System.out.println("File Length \t"+length1);
				   
				}
				
				else {
					System.out.println("\n Alredy exist File Not created");
				}
			}

		
//		try {
//			if(!f.exists()) {
//			boolean createNewFile = f.createNewFile();
//			System.out.println(createNewFile);}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println(e);
//		}
		
		
		
		
	
		
	}

	

