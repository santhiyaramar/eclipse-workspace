package may26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDemo2 {

	public static void main(String[] args) {
		FileDemo2 fd=new FileDemo2();
//		fd.learnfile();
//		fd.fileonly();
//		fd.filefolderonly();
//		fd.learnfiles();
		fd.learn_file2();
		
	}

	private void learn_file2() {
		try {
	//		  File ff = new File("//home//santhiya//Desktop//Jailer1.text");
			  File input_file = new File("//home//santhiya//Desktop//1.png");
			  File output_file = new File("//home//santhiya//Desktop//2.png");

			InputStream reader = new FileInputStream(input_file);
			OutputStream writer = new FileOutputStream(output_file);
			  int r = reader.read();
			  while(r!=-1)
			  {
			    writer.write(r);
			    r = reader.read();
			  }
			  
//			  FileReader reader = new FileReader(ff);
//			  BufferedReader bufReader = new BufferedReader(reader);
//			  String line = bufReader.readLine();
//			  while(line!=null) {
//			  System.out.println(line);
//			  line = bufReader.readLine();
//			  }
//			  bufReader.close();
//			  int count=0;
//			  int space_count=0;
//			
//			  int r = reader.read();
//			  while(r!=-1)
//			  {
//				  count++;
//				  char ch=(char)r;
//				  if(ch==' ') 
//					  space_count++;
//				  System.out.print((char)r);
//				  r = reader.read();
//			  }
//			  System.out.println(count);
//			  System.out.println("No. of words: "+space_count);
				  
//			  System.out.println(r);
			  } catch (FileNotFoundException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	private void learnfiles() {
		File ff = new File("//home//santhiya//Desktop");
		 String[] st  =    ff.list();
		// for(int i=0; i<st.length;i++)
		// {
		//   System.out.println(st[i]);
		// }
		 //for each String abcd in String array st
		 for(String abcd:st)
		 {
		   System.out.println(abcd);
		 }
	}

	private void filefolderonly() {
		File ff = new File("//home//santhiya//Desktop");
		File[] files_folders = ff.listFiles();
		for(int i=0; i<files_folders.length;i++)
		{
		  File file_folder = files_folders[i];
		  if(file_folder.isDirectory())
		  {
		  System.out.println(file_folder);  
		  }
		}
	}

	private void fileonly() {
		File ff = new File("//home//santhiya//Desktop");
		File[] files_folders = ff.listFiles();
		for(int i=0; i<files_folders.length;i++)
		{
		  File file_folder = files_folders[i];
		  if(file_folder.isFile())
		  {
		  System.out.println(file_folder);  
		  }
		}
	}

	private void learnfile() {
		File ff = new File("//home//santhiya//Desktop");
		String[] files_folders = ff.list();
		for(int i=0; i<files_folders.length;i++)
		{
		  String st = files_folders[i];
		  if(st.endsWith(".pdf") && st.contains("Certificate"))
		  {
		    System.out.println(st);
		  }
	}
		
	}

}
	
