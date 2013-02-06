package com.adacom.recruitingprocess.step2;

import java.util.ArrayList;
import java.util.Collections;

/** 
 * This is the Main class for testing the program
 * @author Nikolaos Raptis
 * @version 1.0
 * */
public class Main {
	
	/**
	 * Main function is the entry point of the program. 
	 * @param args The arguments. In this example they should contain 3 file paths.
	 */
	public static void main(String[] args){
		
		System.out.println("\nStarting...");
		
		/* The number of path passed in the args */
		int pathNumber = args.length;
		
		/* Check if number of arguments is not 3 and output an error to the user 
		 * and then exit
		 * */
		if(pathNumber!=3){
			System.out.println("Arguments must be 3 paths. Two for Input words and the third for the output file.");
			System.exit(0);
		}else{
			
			/* Seperate input paths with output path */
			String[] inputPaths = new String[pathNumber-1];
			String	 outPutPath = args[pathNumber-1];
			
			/* Print the Input Paths */
			for(int i=0; i<pathNumber-1; i++){
				inputPaths[i] = args[i];
				System.out.println("Input Path "+(i+1)+" is: "+inputPaths[i]);
			}
			
			/* Print the Output Path */
			System.out.println("Output Path is: "+outPutPath);
			
			/* Read the words of the input files */
			ArrayList<String> wordList = WordReader.read(inputPaths);
			
			/* Find Common words */
			wordList = WordUtilities.findCommonWords(wordList);
			
			/* Sort the final word list lexicographically */
			Collections.sort(wordList);
			
			/* Print the final word list */
			System.out.println("\n--------------------");
			System.out.println("Common words: "+wordList.size());
			for(String commonWord : wordList){
				System.out.println(commonWord);
			}
			System.out.println("--------------------\n");
			
			/* Write the word list to the third file */
			System.out.println("Writing common words to "+outPutPath+"...");
			WordWriter.write(wordList, outPutPath);
			System.out.println("Finish!");
		}
	}
	
}
