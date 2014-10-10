http://www.state.nj.us/lottery/data/cash5.dat

This is the output:
2012%11%22%Thursday%07%08%09%27%29%0.00%358.00%8.00%20121122%A

Fields are delimited by %

2012 11 22 Thursday 07 08 09 27 29 0.00 358.00 8.00 20121122 A

1st Field: Year
2nd Field: Month
3rd Field: Day
4th Field: Day of the week
5th - 9th Field: Lottery number
10th Field: 5/5 Payout
11th Field: 4/5 Payout
12th Field: 3/5 Payout
13th - 14th Field: ignore

pseudo code:
* Download file from web
* Put Fields into their own array. Ex: year array, month array, etc.
* Calculate mean

//The following code demonstrates how to open the lottery.txt file and read its contents back into the number array

	final int SIZE = 5;
	int numbers[] = new int[SIZE];
	int index = 0; //Loop control variable

	//Open the file
	File file = new File("lottery.txt")
	Scanner inputFile = new Scanner(file);

	//Read the file contents into the array
	while( inputFile.hasNext() && index < number.length)
	{
  		numbers[index] = inputFile.nextInt();
  		index++;
	}

	//Close the file
	inputFile.close();


	
//The following code demonstrates how to download the cash5.dat file from the NJ state website
	import java.net.*;
	import java.io.*;

	public class test {
   	 public static void main(String[] args) throws Exception {

	PrintWriter outputFile = new PrintWriter("cash5.dat");


        	URL oracle = new URL("http://www.state.nj.us/lottery/data/cash5.dat");
        	BufferedReader in = new BufferedReader(
        	new InputStreamReader(oracle.openStream()));

        	String inputLine;
        	while ((inputLine = in.readLine()) != null)
            		outputFile.println(inputLine);
        	
		in.close();
		outputFile.close();
    		}
	}
