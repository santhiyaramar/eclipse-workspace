package com.santhiya;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileDemoo1 {

	public static void main(String[] args) {
		FileDemoo1 fd= new FileDemoo1();
		fd.learn_file2();
	}

	private void learn_file2() {
		File ff= new File("//home//santhiya//Desktop//Jailer1.text");
		try {
			ff.createNewFile();
			FileWriter writer=new FileWriter(ff,true);
			BufferedWriter bufWriter=new BufferedWriter(writer);
			bufWriter.append("suriya");
			bufWriter.append("SK");
			bufWriter.newLine();
			bufWriter.append("ajith");
			bufWriter.append("AK");
			bufWriter.flush();
//			writer.append("\nvijai\n");
//			writer.append("suriya\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		try {
//			ff.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
	//	}
		
	}

}
