package com.adacom.recruitingprocess.step2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * This class is responsible to write words line by line in files.
 * @author Nikolaos Raptis
 * @version 1.0
 */
public class WordWriter {

	/**
	 * This method takes a word list and path and writes the word
	 * line by line in the given path - file
	 * @param wordList The list of words
	 * @param path The output path - file
	 */
	public static void write(ArrayList<String> wordList, String path){
		
		PrintWriter writer = null;
		
		try {
			/* Initialize an output Stream */
			OutputStream outputFileStream = new FileOutputStream(path);
			
			/* Initialize the writer which will write to the file */
			writer = new PrintWriter(outputFileStream);
			
			/* Add every word of the list in the file */
			for(String word:wordList){
				writer.println(word);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			
			/* Clean up.. */
			writer.flush();
			writer.close();
		}
		
	}
	
}
