// Lottery Program

import java.io.*;
import java.net.*;
import java.util.*;

public class lottery5
{

	public static void main(String[] args) throws IOException
 	{  
           //Declarations
           
	   PrintWriter outputFile = new PrintWriter("cash5.dat");
           URL url = new URL("http://www.state.nj.us/lottery/data/cash5.dat");
           BufferedReader inputStream = new BufferedReader(new InputStreamReader(url.openStream()));
           String inputLine;
           
           final int SIZE = 5;
           int numbers[] = new int[SIZE];
           int index = 0; //Loop Control
           File file = new File("cash5.dat");
           Scanner inputFile = new Scanner(file);
           
           
           //This will download the dat file from the specified url and save it locally.
           
           while ((inputLine = inputStream.readLine()) != null)
           	   outputFile.println(inputLine);
           inputStream.close();
           outputFile.close();
           
           //This will read the cash5.dat file and place it's contents into the numbers array.
           //ERROR: Fields need to be delimited; cannot store String into int array!
           /*
           while (inputFile.hasNext() && index < numbers.length)
           {
           	   numbers[index] = inputFile.nextInt();
           	   index++;
           inputFile.close();
           }
           */
	}  
}
