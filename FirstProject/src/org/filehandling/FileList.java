package org.filehandling;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		File f= new File("C:\\Users\\splpt777\\Desktop\\Javaprogram\\FirstProject\\java");
		 
		   //list method
		   System.out.println("\n List methods ");
		   System.out.println("============= ");
		   
		   String[] list = f.list();                  //get all files in folder
		   for(int i=0;i<list.length;i++) {
			   if(list[i].charAt(0)=='j') {             //get only start j files
				   System.out.println(list[i]);
			   }
			   
		   }
		   
//		   for (String i:list) {                        //foreach
//			 System.out.println(i);
//		 }
//		   System.out.println("No of files \t"+list);
		    
		   //list files method
		   
		   File[] listFiles = f.listFiles();          //filearray get filepath
		   for(int i=0;i<listFiles.length;i++) {
			   if(listFiles[i].isDirectory()){          //get only diretory in folder
				   System.out.println(listFiles[i]);  
			   }
//			   if(listFiles[i].isFile()) {                //get only files
//				   System.out.println(listFiles[i]);
//			   }
			   
			//   System.out.println(listFiles[i]);
		   }
		   
		for(File li:listFiles) {
			if(li.isFile()) {                          //get only files
				String fname = li.getName();
				int lastIndexOf = fname.lastIndexOf(".");        //get extension 
				String extension= fname.substring(lastIndexOf+1); //txt,html,docx,jpg
				if(extension.equals("txt")) {                     //compare two string
					System.out.println("\n"+fname);
					
					if(fname.length()>10) {                      //get file size above 10bytes
					System.out.println("\t size:" +fname.length()+"bytes");
					}
				}
				
			}
				
				//System.out.println(extension);
				
			}
		
		

	}

}
