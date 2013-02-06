package com.adacom.recruitingprocess.step2;

import java.util.ArrayList;
/**
 * This class is responsible to provide various methods to
 * manipulate words...
 * @author Nikolaos Raptis
 * @version 1.0
 */
public class WordUtilities {
	
	/**
	 * This method finds common words contained in a List 
	 * @param wordList The word list
	 * @return A List with the common words only
	 */
	public static ArrayList<String> findCommonWords(ArrayList<String> wordList){
		
		/* Will hold the common words */
		ArrayList<String> commonWordList = new ArrayList<String>();
		
		/* Iterate and find the common words. The is a simple
		 * passing by pointing to each element and comparing it
		 * with the rest of the list. */
		for(int i = 0; i < wordList.size(); i++) {
			for(int j=i+1; j<wordList.size(); j++) {
				if(wordList.get(i).equals(wordList.get(j))){
					
					/* If we didn't add it already then add it */
					if(!commonWordList.contains(wordList.get(i))){
						
						/* Add the common word found to the list */
						commonWordList.add(wordList.get(i));
						
						/* We found it once so its enough so..*/
						break;
					}
				}
				
			}
		}
		
		return commonWordList;
		
	}
	
}
