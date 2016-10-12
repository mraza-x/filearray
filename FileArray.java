import java.io.*;
import java.util.*;

/**
Mohammed Raza
CSC 162 - Lab7 # 4 (class)
*/

public class FileArray
{

	public String filename;
	public int[] num;

  public FileArray() // Default constructor
  {


  }

  public FileArray(String f, int[] n) // Overloaded constructor
  {                                   // Accepts filename @param f
	  filename = f;                   // and num array @param n
	  num = n;
  }

  public static void writeArray(String f, int[] n) throws IOException // Handling IOException
  {

	  String filename;     // writeArray method accpets filename and array reference
	  int[] num;           // Should write array elements to file

	  filename = f;
	  num = n;


	  try
	  {
	     PrintWriter outputFile = new PrintWriter(filename);
	     outputFile.print(num);

	     outputFile.close();
	  }

	         catch (FileNotFoundException ref1)   // Handling Exception if file not found
	         {
	         	   System.out.println(ref1.toString());
	         }

	         catch (Exception ref2)               // Hnadling other exceptions
	         {
	             System.out.println(ref2.toString());
	         }


  }

  public static void readArray(String f, int[] n) throws IOException // Handling IOException
  {

	  String filename;      // readArray method should read first line of
	  int[] num;            // data from the specified filename

	  filename = f;
	  num = n;

	  try
	  {

	     File file = new File(filename);
	     Scanner inputFile = new Scanner(file);

	     String line = inputFile.nextLine();

	     System.out.println(line);

	     inputFile.close();
	 }

       catch (FileNotFoundException ref1)    // Handling Exception if file not found
       {
       	   System.out.println(ref1.toString());
       }

       catch (Exception ref2)                // Hnadling other exceptions
       {
           System.out.println(ref2.toString());
       }


  }
}