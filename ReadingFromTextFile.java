package ReadingFileDemo;



public class ReadingFromTextFile {
	
	// Main method to test the reading file
	public static void main(String[] args) {
		
		ReadingFromFile rdf = new ReadingFromFile();
		
		rdf.loadTheFile();		
		System.out.println(rdf.getStringFromFile());
		
	}

}
