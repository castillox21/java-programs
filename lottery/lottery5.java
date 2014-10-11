// Lottey Program

import java.io.*;
import java.net.*;

public class lottery5
{

	public static void main(String[] args) throws IOException
 	{  
           //This will download the dat file from the specified url and save it locally. 
	   PrintWriter outputFile = new PrintWriter("cash5.dat");
           URL url = new URL("http://www.state.nj.us/lottery/data/cash5.dat");
           BufferedReader inputStream = new BufferedReader(new InputStreamReader(url.openStream()));
           String inputLine;
           
           while ((inputLine = inputStream.readLine()) != null)
                 outputFile.println(inputLine);

           inputStream.close();
           outputFile.close();
           
	}	
}
