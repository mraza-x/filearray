import java.io.*;
import java.util.*;

/**
Mohammed Raza
CSC 162 - Lab7 # 4 (main)
*/

public class FileArrayDemo
{

   public static void main(String[] args)
   {

		   String filename = "C:/file.txt"; // Filename as string

           int[] num = {1, 2, 3, 4, 5, 6, 7, 8}; // num array

	       FileArray obj = new FileArray(filename, num); // Passing filename and array to
	       												 // FileArray class using object ref obj


		   // Professor, both the FileArray class and FileArrayDemo
		   // class compile without errors, but it will not write to file.
   }
}


