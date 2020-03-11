// Lab 13 Part 1
/*
1)	Write a program that will ask for the user to input a filename of a text file that contains 
   an unknown number of integers. And also an output filename to display results.  You will 
   read all of the integers from the input file, and store them in an array. (You may need to 
   read all the values in the file once just to get the total count)  Using this array you will 
   find the max number, min number, average value, and standard deviation.  These results will be
   reported to both the screen and placed into the output file that the user choose. 
	Output to screen and file could look like this:

		Read from file: 12 values
			Maximum value = 20
		Minimum value = 3
		Average value = 13.34
		Standard Deviation = 2.15

*/


import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FileInputOutputLab {

   // getting the maximum value
   public static int getMaxValue(int[] array) {
       int maxValue = array[0];
       for (int i = 1; i < array.length; i++) {
           if (array[i] > maxValue) {
               maxValue = array[i];
           }
       }
       return maxValue;
   }

   // getting the miniumum value
   public static int getMinValue(int[] array) {
       int minValue = array[0];
       for (int i = 1; i < array.length; i++) {
           if (array[i] < minValue) {
               minValue = array[i];
           }
       }
       return minValue;
   }
   
   // getting the average value
   public static double getAverageValue(int[] array) {
      double averageValue = 0.0;
      double sum = 0.0;
      for (int i = 0; i < array.length; i++) {
         sum += array[i];
      }
      averageValue = (double) sum / array.length;
      
      // return statement
      return averageValue; 
      
   }
   
   // getting the standard deviation
   public static double getStandardDeviation(int numArray[]) {
        double sum = 0.0;
        double standardDeviation = 0.0;
        int arraySize = numArray.length; 
         
        for(double num : numArray) {
            sum += num;
        }

        double mean = sum / arraySize;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation / arraySize);
    }    


   // Make sure to implement FileNotFoundException after Main Method
   public static void main(String[] args) throws FileNotFoundException {
      
      System.out.println("Hello World!");
      System.out.println(); // blank space
      
      // DecimalFormat object
      DecimalFormat javaFormat = new DecimalFormat("0.00");
      
      // Create a Scanner object
      Scanner javaScanner = new Scanner(System.in);
      
      // Prompt user to enter a filename
      System.out.print("Please enter the name of a file that contains an unknown number of integers: ");
      String fileName = javaScanner.nextLine();
      String formattedName = fileName + ".txt";
      
      // Prompt user to enter output file
      System.out.print("Please enter the name of the output file: ");
      String outputFile = javaScanner.nextLine();
      String outputName = outputFile + ".txt";
      
      // Create a File version of the string and a Scanner to read that particular File
      File javaFile = new File(formattedName);
      File secondJavaFile = new File(outputName);
      Scanner inputFile = new Scanner(javaFile);
      
      // Create a new Scanner
      // Scanner secondInputFile = new Scanner(javaFile);
      
      // Count the number of integers in the file
      int numberIntegers = 0;
      while (inputFile.hasNext()) {
         inputFile.nextInt();
         numberIntegers++;
      }
      // Close the file
      inputFile.close();
      
      // Reopen the Scanner to reset it
      inputFile = new Scanner(javaFile);
      
      // Create an array
      System.out.println("Number of integers: " + numberIntegers);
      int[] javaArray = new int[numberIntegers];
      
      // Fill in the array
      int i = 0;
      while(inputFile.hasNext()) {
         javaArray[i++] = inputFile.nextInt();
      }
      // Close the file
      // secondInputFile.close();
      
      // Create an output stream
      FileOutputStream javaOutput = new FileOutputStream(secondJavaFile);
      
      // Create a printwriter
      PrintWriter outtext = new PrintWriter(javaOutput);
      
      
      // Find the min, max, average value, standard deviation of integers in the array
      int minimumValue = getMinValue(javaArray);
      int maximumValue = getMaxValue(javaArray);
      double averageValue = getAverageValue(javaArray);
      double standardDeviation = getStandardDeviation(javaArray);
      
      // Displaying the Final Output
      outtext.println("Read from File: " + numberIntegers + " values");
      outtext.println("     Maximum value = " + maximumValue);
      outtext.println("     Minimum value = " + minimumValue);
      outtext.println("     Average value = " + averageValue);
      outtext.println("     Standard Deviation = " + javaFormat.format(standardDeviation));     
      
      // Close the stream
      outtext.close();
      
      // Displaying the Final Output here in the program
      System.println("Read from File: " + numberIntegers + " values");
      System.println("     Maximum value = " + maximumValue);
      System.println("     Minimum value = " + minimumValue);
      System.println("     Average value = " + averageValue);
      System.println("     Standard Deviation = " + javaFormat.format(standardDeviation));      
      
   
   }
   
  


}