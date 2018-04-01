package ReadingFileDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;

public class ReadingFromFile {

	
	// define random generator
		private Random rg = new Random();
		
		//define the file name 
		private String fileName = "C:\\Users\\raycs\\eclipse-workspace\\ReadingFromFile\\src\\TextFile" ; 

		//Random generated text from the file 
		//private String randomTextFromTheFile;
		
		//define an array to store the fortunes 
		private static List<String> allFortunes ; 
		
		public ReadingFromFile(){
			
		}
		
		@PostConstruct
		public void loadTheFile() {
			
			File theFile = new File(fileName);
			
			//Checking the existence of the file.
			System.out.println("File exists: " + theFile.exists());
			
			
			//initialize the list
			allFortunes = new ArrayList<String>();
			
			//Read strings from the file 
			try(BufferedReader br = new BufferedReader(new FileReader(theFile))){
				
				String tempLine;
				
				while ((tempLine = br.readLine())!= null) {
					allFortunes.add(tempLine);
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}

		}
		
		// get method that returns string from the file
		public String getStringFromFile() {
			
			System.out.println(">> Test: inside the getStringFromFile().");
			
			//pick a random string from the array
			int index = rg.nextInt(allFortunes.size());
			
			String tempFortune = allFortunes.get(index);
			
			return tempFortune;
		}

}
