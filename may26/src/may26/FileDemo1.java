package may26;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {
		FileDemo1 fd=new FileDemo1();
		fd.learn_file1();
	}

	private void learn_file1() {
		File ff = new File("//home//santhiya//Desktop//Jailer.txt");
	
	try {
		ff.createNewFile();
		
			ff.createNewFile();
			FileWriter writer= new FileWriter(ff,true);
			BufferedWriter bufWriter = new BufferedWriter(writer);
			bufWriter.append("Suriya");
			bufWriter.append("SK");
			bufWriter.newLine();
			bufWriter.append("Vikram");
			bufWriter.append("VS");
			  
			bufWriter.flush();
			bufWriter.close();
//			writer.append("\nsanthiya\n");
//			writer.append("sakthiyaraj\n");
//			writer.close();
			
			
		} catch (IOException e) {
	//		e.printStackTrace();
		}
		

//		    try {
		      
//		      ff.createNewFile();
		      //System.out.println(ff.delete());
		      
//		    } catch (IOException e) {
		      // TODO Auto-generated catch block
//		      e.printStackTrace();
//		    }
	}

}
