import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class ShipTest 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		ArrayList<Ship> shipList = new ArrayList<Ship>();
		String flex ="", nom="", yb="";
		int weight, tourist;
		File file = new File("Ships-2.csv");
		Scanner inputFile = new Scanner(file);
			
		while (inputFile.hasNext()) 
			{
			String line = inputFile.nextLine();
			StringTokenizer token= new StringTokenizer(line, ",");

			if (token.nextToken().equals("CruiseShip"))
			{
				nom = token.nextToken();
				yb = token.nextToken();
				flex = token.nextToken();
				tourist = Integer.parseInt(flex);
				shipList.add(new CruiseShip(nom, yb, tourist));
			}
			}
		File file1 = new File("Ships-2.csv");
		Scanner inputFile1 = new Scanner(file1);
		while (inputFile1.hasNext()) 
		{
			String line1 = inputFile1.nextLine();
			StringTokenizer token1= new StringTokenizer(line1, ",");

			 if (token1.nextToken().equals("CargoShip"))
			{
				nom = token1.nextToken();
				yb = token1.nextToken();
				flex = token1.nextToken();
				weight = Integer.parseInt(flex);
				shipList.add(new CargoShip(nom, yb, weight));
			}
		}
	
		File file2 = new File("Ships-2.csv");
		Scanner inputFile2 = new Scanner(file2);
		while (inputFile2.hasNext()) 
		{
		String line2 = inputFile2.nextLine();
		StringTokenizer token2= new StringTokenizer(line2, ",");

			if (token2.nextToken().equals("Ship"))
			{
				nom = token2.nextToken();
				yb = token2.nextToken();
				shipList.add(new Ship(nom, yb));
			}
		}
			
		
			

		for (int index= 0; index < shipList.size(); index++) {
			Ship list = shipList.get(index);
			System.out.println(list.toString(nom, yb));
		}
		

		inputFile.close();
		inputFile1.close();
	
	}

		
}
		

		
	
	
	


