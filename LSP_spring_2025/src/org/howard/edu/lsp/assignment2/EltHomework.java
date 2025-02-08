package org.howard.edu.lsp.assignment2;

//import necessary 
import java.io.*; // imports all classes within package instead of having to manually import them singularly https://www.tutorialspoint.com/java/java_files_io.htm 
import java.util.ArrayList; //I found what class to import to use to store data in list from stack overflow https://stackoverflow.com/questions/32940784/what-should-be-imported-to-create-a-list

/** 
 * import java.io.BufferedReader; 
 * import java.io.BufferedWriter;
 * import java.io.FileReader; // I found what class to import to read and write list from geeksforgeeks https://www.geeksforgeeks.org/different-ways-reading-text-file-java/#
 * import java.io.FileWriter; 
**/


public class EltHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current directory: " + new File(".").getAbsolutePath());
		String inputFilepath = "data/products.csv"; //input file
		String outputFilepath = "data/transformed_products.csv"; //output file
		
		ArrayList<String[]> transformedData = new ArrayList<>(); // list to store trnasformed rows https://stackoverflow.com/questions/32940784/what-should-be-imported-to-create-a-list
		try {
			BufferedReader br = new BufferedReader(new FileReader(inputFilepath)); // open file for redaing ; i found to use "Buffered Reader" to read and write list from https://www.geeksforgeeks.org/different-ways-reading-text-file-java/# and adjusted as was necessary 
			String line;
			boolean isHeader = true;
			
			while ((line = br.readLine()) != null) { //  to read each line
				line = line.trim(); // Remove spaces and newlines https://coderanch.com/t/276221/java/skip-blank-lines-reading-text  https://www.geeksforgeeks.org/java-string-trim-method-example/#
                if (line.isEmpty()) { 
                    continue; // Skip empty lines
                }
				if(isHeader) {
					transformedData.add(new String[]{"ProductID", "Name", "Price", "Category", "PriceRange"}); //https://stackoverflow.com/questions/30564462/read-data-from-a-text-file-and-create-an-object
					isHeader = false; // ignore header row
					continue;
					
				}
				//System.out.println("line 40");
				String[] values = line.split(","); //you mentioned line split in class and i did more research on it https://www.geeksforgeeks.org/split-string-java-examples/
				transformedData.add(transform(values)); // transform and store data
			}
			br.close();
			//System.out.println("line 40");
			saveToFile(outputFilepath, transformedData); 
			System.out.println("ETL process completed. Output saved to " + outputFilepath); // https://www.geeksforgeeks.org/system-out-println-in-java/#
		
		}catch (Exception e) {
            System.out.println("Error: Could not read file. Make sure it exists in the 'data' folder.");
        }
	}
	private static String[] transform(String[] data) {
		String productID = data[0];
		String name = data[1].toUpperCase();
		double price =  Double.parseDouble(data[2]);
		String category = data[3];
		
		if (category.equalsIgnoreCase("Electronics")) {
			price = price * 0.9; // discount on electronics
		}
		
		if (price > 500) {
			category = "Premium Electronics"; //category change if price >500
		}
		
		price = Math.round(price *100.0) / 100.0; // round to 2 dp
		
		//determine price range
		String priceRange = "Low";
		if (price > 10 && price <= 100) priceRange = "Medium";
		if (price > 100 && price <= 500) priceRange = "High";
		if (price > 500) priceRange = "Premium";
		
		return new String[]{productID, name, String.format("%.2f", price),category, priceRange};//return transformed data
	}
	
	private static void saveToFile(String filePath, ArrayList<String[]> data) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)); //https://www.geeksforgeeks.org/io-bufferedwriter-class-methods-java/
			for (String[] row : data) {
				writer.write(String.join(",", row));
				writer.newLine();
			}
		writer.close();
		}catch (Exception e) {
            System.out.println("Error: Could not write to the output file.");
        }
		
	}

}

