package com.lynda.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) {
		
		try {
			File f1 = new File("loremipsum.txt");
			File f2 = new File("target.txt");
			File f3 = new File("target2.txt");
			
			FileUtils.copyFile(f1, f2);
			FileUtils.copyFile(f1, f3);
			
			System.out.println("Files copied!");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
