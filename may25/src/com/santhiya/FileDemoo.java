package com.santhiya;

import java.io.File;
import java.io.IOException;

public class FileDemoo {

	public static void main(String[] args) {
		FileDemoo fd= new FileDemoo();
		fd.learn_file();
	}

	private void learn_file() {
	//	File ff= new File("//home//santhiya//Desktop//addd.text");//namba create pannafile
//	File ff= new File("//home//santhiya//Desktop//Jailer1.text");//ethu java create pandra file
//	File ff= new File("//home//santhiya//Desktop//Leo.text");//illatha file irukanu paakanum
//	File ff= new File("//home//santhiya//Desktop//Ajith");// folder create panna
	File ff= new File("//home//santhiya//Desktop//Leaders//Gandhi//Anna"); //folder kulla folder
//	System.out.println(ff.delete());
//	System.out.println(ff.exists());
//	ff.mkdir();              //folder create pandra metho ff. mkdir
	ff.mkdirs();	//folder kulla folder crete pann
//	try
//	{
	
//			ff.createNewFile();
	//		System.out.println(ff.delete());
//			ff.exists()
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

		
	}


