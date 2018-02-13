import java.io.*;
import java.util.StringTokenizer;

public class ReadFiles {

	File file  = new File("/Users/subodh/Desktop/stock/dow.csv");
	int row = 0;
	String[] [] items;
	
	//check if the file is a file
	public boolean checkIsFile() {
		return file.isFile();
	}
	
	//finds the nubmer of rows in csv file
	public int findRowNumber() {
		row = 0;
		if (checkIsFile()) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				while((reader.readLine())!= null){
					row++;
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("This is not a file");
		}
		return row;
	}
	
	//converts csv files into an array 
	public void convertToArray() {
		int r = 0;
		items = new String[findRowNumber()] [7];
		
		try {
			BufferedReader reader = new BufferedReader (new FileReader (file));
			String line = null;
			
			while((line=reader.readLine()) != null) {
				StringTokenizer z = new StringTokenizer(line,",");
				while(z.hasMoreTokens()) {
					for (int c = 0; c < 7; c++) {
					items[r][c] = z.nextToken();	
				}
				r++;
			}
		}
	}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//prints outs ITEMS array
	public void ptinyArray() {
		for(int x = 0; x < items.length; x++) {
			System.out.printf("%s -",x);
			for(int y=0; y<items[x].length; y++) {
				System.out.printf("%s ", items[x][y]);
			}
			System.out.println();
		}
	}
	// return array ITEMS
	public String[][] getArray(){
		return items;
	}
	
}
