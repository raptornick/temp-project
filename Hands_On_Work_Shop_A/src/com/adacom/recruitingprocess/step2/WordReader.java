package com.adacom.recruitingprocess.step2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is responsible to read words from files
 * @author Nikolaos Raptis
 * @version 1.0
 */
public class WordReader {
	
	/**
	 * This method is used to read line by line every file is
	 * given by parameter.
	 * @param filePaths The array of the paths - files
	 * @return An ArrayList with the words found in each line of the files
	 */
	public static ArrayList<String> read(String... filePaths){
		
		/* The list which will hold the total words found */
		ArrayList<String> totalWordList = new ArrayList<String>();
		
		/* For every path given */
		for(String path:filePaths){
			
			try {
				
				/* Initialize the Scanner passing the path*/
				Scanner fileScanner = new Scanner(new File(path));
				
				/* While it has a line put it into the total list */
				while (fileScanner.hasNextLine()){
					totalWordList.add(fileScanner.nextLine());
				}
				
				/* Close the Scanner */
				fileScanner.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return totalWordList;
	}
}
