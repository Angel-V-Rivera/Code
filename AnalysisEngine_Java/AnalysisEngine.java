/*******************************************************************************
*                         Assignment 6 – File IO                               *
*                                                                              *
* PROGRAMMER:       Angel Rivera                                               *
* CLASS:            CG102                                                      *
* ASSIGNMENT:       6                                                          *
* INSTRUCTOR:       Dean Zeller                                                *
* SUBMISSION DATE:  3/29/19                                                    *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program will perform several calculations by using uset input or        *
* by reading input from a file. it also makes a table.                         *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
import java.util.*;
import java.io.File;
import java.util.Collections;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.Collections;
public class AnalysisEngine 
{
    String studyLeader;
    String studyTitle;
    String studyDate;
    String inputFilename;
    String outputFilename;
    double sum;
    double average;
    double variance;
    double stdev;
    double min;
    double max;
    double median;
    int inputN =0;
    String response;
    List<Double> rawData = new ArrayList<Double>();
    List<Double> sortedData = new ArrayList<Double>();
    Scanner reader1 = new Scanner(System.in);
    double mini = 999999;
    double maxi = -999999;
    
   /*******************************************************************************
   * Construtor                                                                   *
   *                                                                              *
   * Purpose:  instantiate a new AnalysisEngine object                            *
   * Parameters:                                                                  *
   * StudyLeader, studyTitle, studyDate, studyDate, inputFilename, outputFilename *
   * Return Value: No return                                                      *
   *******************************************************************************/    
    public AnalysisEngine(String studyLeader_, String studyTitle_, String studyDate_, String inputFilename_ , String outputFilename_ )
    {
        this.studyLeader=studyLeader_;
        this.studyTitle=studyTitle_;
        this.studyDate=studyDate_;
        this.inputFilename=inputFilename_;
        this.outputFilename=outputFilename_;
        
        System.out.println("Welcome to Assignment 6, Data Processing");
        System.out.println();
        System.out.println("Title of Study:  "+studyTitle);
        System.out.println();
        System.out.println("Head of Research:  "+studyLeader);
        System.out.println();
        System.out.println("Study Date:  "+studyDate);
        System.out.println();
        System.out.println("Input filename:  "+inputFilename);
        System.out.println();
        System.out.println("Output filename:  "+outputFilename);
        System.out.println("Warning: any existing file will ve overwritten");
        System.out.println();
    }
   /*******************************************************************************
   * Construtor                                                                   *
   *                                                                              *
   * Purpose:  instantiate a new AnalysisEngine object                            *
   * Parameters:                                                                  *
   *   inputFilename, outputFilename                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/    
    public AnalysisEngine(String inputFilename_ , String outputFilename_ )
    {
        
         System.out.println("Welcome to Assignment 6, Data Processing");
         System.out.println();
         System.out.print("Enter the title of the study => ");
         studyTitle= reader1.nextLine();
         System.out.println("Name of study set to "+ studyTitle);
         System.out.println();
         System.out.print("Enter the head of research for this study =>");
         studyLeader= reader1.nextLine();
         System.out.println("Hello, "+ studyLeader);
         System.out.println();
         System.out.print("Enter the date of this study => ");
         studyDate= reader1.nextLine();
         System.out.println();
         this.inputFilename=inputFilename_;
         this.outputFilename=outputFilename_;
    }
   /*******************************************************************************
   * Construtor                                                                   *
   *                                                                              *
   * Purpose:  instantiate a new AnalysisEngine object                            *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/ 
    public AnalysisEngine()
    {
         System.out.println("Welcome to Assignment 6, Data Processing");
         System.out.println();
         System.out.print("Enter the title of the study => ");
         studyTitle= reader1.nextLine();
         System.out.println("Name of study set to "+ studyTitle);
         System.out.println();
         System.out.print("Enter the head of research for this study =>");
         studyLeader= reader1.nextLine();
         System.out.println("Hello, "+ studyLeader);
         System.out.println();
         System.out.print("Enter the date of this study => ");
         studyDate= reader1.nextLine();
         System.out.println();
         System.out.print("Enter the input data file for the study (blank for user-entry) => ");
         inputFilename= reader1.nextLine();
         if(inputFilename.equals(""))
         {System.out.println("No input data file entered, supplying input from user");}
         else {System.out.println("Input file "+inputFilename+" recorded");}
         System.out.println();
         System.out.print("Enter the output data file for the study (blank for no file output) => ");
         outputFilename= reader1.nextLine();
         if(outputFilename.equals(""))
         {System.out.println("No output data file entered, supplying output from user");}
         else {
             System.out.println("Output file of "+outputFilename+" created");
             System.out.println("Warning: an existing file will be overwritten!");
         }
         System.out.println();
    }
   /*******************************************************************************
   * phase1                                                                       *
   *                                                                              *
   * Purpose: prints information for phase 1 and reads from file                  *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void phase1()
    {
        System.out.println("Introduction:");
        System.out.println("This program will calculate various statistics for a list");
        System.out.println("of numbers.  It will run in three phases:");
        System.out.println("     Phase 1 – Gather user input");
        System.out.println("     Phase 2 – Calculate sum, average, variance, stdev, min, max, median");
        System.out.println("     Phase 3 – Output results to shell, graphic display, and file");
        System.out.println();
        if(inputFilename.equals(""))
        {
            System.out.println("Phase 1: Gather user input");
            System.out.println("--------------------------");
            System.out.println("Input file not specified.  Completing user input.  To enter the data ");
            System.out.println("correctly, the program needs to know how many numbers are in the dataset.");
            System.out.print("    Size of dataset  => ");
            response= reader1.nextLine();
            inputN=Integer.parseInt(response);
            System.out.println("    Data will have "+ inputN +" elements, indexed 0 through " +(inputN-1)+".");
            System.out.println();
            System.out.println("Enter integer and floating-point values: ");
            int i=0;
            double a=0;
            while(i<inputN)
            {
                System.out.print("    Index "+ i+" =>");
                response= reader1.nextLine();
                a=Double.parseDouble(response);
                rawData.add(a);
                i++;
            }
            System.out.print("Data entered: "); 
            for(double d: rawData)
            {
                System.out.print(d+" ");  
            }
            System.out.println();
        }
        else 
        {
            try
        {
            Scanner userInput = new Scanner(System.in);
            File inputFile = new File(inputFilename);      
            Scanner inputScanner = new Scanner(inputFile);
            while (inputScanner.hasNextLine())
            {
                String line = inputScanner.nextLine();
                double num = Double.parseDouble(line);
                rawData.add(num);
            }
            inputScanner.close();    
            System.out.println("Phase 1: Gather user input");
            System.out.println("-----------------------------");
            System.out.println("Input filename: "+inputFilename);
            System.out.println("    Size of dataset:  "+rawData.size()+", indexed 0 through "+(rawData.size()-1));
            System.out.println();
            System.out.print("Data read: ");
            for(double d: rawData)
            {
                System.out.print(d+" ");  
            }
            System.out.println();
            System.out.println();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error has occurred: "+e);
        }
        }
    }
   /*******************************************************************************
   * createSortedData                                                             *
   *                                                                              *
   * Purpose: sorts the data in the arraylist                                     *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void createSortedData()
    {
        for(double d: rawData)
            sortedData.add(d);
        Collections.sort(sortedData);
    }
   /*******************************************************************************
   * calcSum                                                                      *
   *                                                                              *
   * Purpose: calculates sum                                                      *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void calcSum()
    {
        for (double i:rawData)
        {
            sum+=i;
        }
    }
   /*******************************************************************************
   * calcAverage                                                                  *
   *                                                                              *
   * Purpose: calculates average                                                  *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void calcAverage()
    {
       int size = rawData.size();
       average = sum/size;
    }
   /*******************************************************************************
   * calcVariance                                                                 *
   *                                                                              *
   * Purpose: calculates variance                                                 *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void calcVariance()
    {
        double total=0;
        int size = rawData.size();
        for (double i:rawData)
        {
            total += Math.pow((i-average), 2);
        }
        variance = total/ (size-1);
    }
   /*******************************************************************************
   * calcStdev                                                                    *
   *                                                                              *
   * Purpose: calculates standard deviation                                       *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void calcStdev()
    {
        stdev = Math.sqrt(variance);
    }
   /*******************************************************************************
   * calmin                                                                       *
   *                                                                              *
   * Purpose: calculates the smallest number in the array                         *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void calmin()
    {
        for (double i:rawData)
        {
           if (i < mini)
           {
               mini = i;
           }
        }
        min=mini;
    }
   /*******************************************************************************
   * calMax                                                                       *
   *                                                                              *
   * Purpose: calculates the biggest number in the array                          *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void calMax()
    {
        for (double i:rawData)
        {
           if (i > maxi)
           {
               maxi = i;
           } 
        }
        max=maxi;
    }
   /*******************************************************************************
   * calcMedian                                                                   *
   *                                                                              *
   * Purpose: calculates the median from the data in the array                    *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void calcMedian()
    {
        int size = rawData.size();
        int midpoint;
        if (sortedData.size() % 2 == 0)
             median = (sortedData.get(sortedData.size()/2) + sortedData.get(sortedData.size()/2 - 1))/2;
        else
             median = sortedData.get(sortedData.size()/2);
    }
   /*******************************************************************************
   * phase2                                                                       *
   *                                                                              *
   * Purpose: calls several methods and prints calculated data                    *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void phase2()
    {
       createSortedData();
       calcSum();
       calcAverage();
       calcVariance();
       calcStdev();
       calmin();
       calMax();
       calcMedian();
       System.out.println("Phase 2: Perform calculations");
       System.out.println("-----------------------------");
       System.out.print("    Raw data: ");
       for(double d: rawData)
       {
          System.out.print(d+" ");  
       }
       System.out.println();
       System.out.print("    Sorted data: ");
       for(double e: sortedData)
       {
          System.out.print(e+" ");  
       }
       System.out.println();
       System.out.println("    Calculated sum "+sum);
       System.out.println("    Calculated average "+average);
       System.out.println("    Calcualted variance "+variance);
       System.out.println("    Calculated standard deviation " +stdev);
       System.out.println("    Calculated min "+min);
       System.out.println("    Calculated max "+max);
       System.out.println("    Calculated median "+median);
       System.out.println();
       System.out.println("Phase 2 complete");
    }
   /*******************************************************************************
   * printReport                                                                  *
   *                                                                              *
   * Purpose: prints a formated table                                             *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void printReport()
    {
        System.out.println("+---------------------------------------------+");
        System.out.println(String.format("| %-44s|",studyTitle ));  
        System.out.println(String.format("| by %-40s |",studyLeader ));
        System.out.println(String.format("| Date: %-37s |",studyDate ));
        System.out.println("+---------------------------------------------+");
        System.out.println(String.format("| Input File:%-33s|","                   "+inputFilename ));
        System.out.println(String.format("| Output File:%-32s|","                  "+outputFilename )); 
        System.out.println(String.format("| N:%37s     |",rawData.size()));
        System.out.println(String.format("| Sum:%39.3f |",sum ));  
        System.out.println(String.format("| Mean:%38.3f |",average )); 
        System.out.println(String.format("| Variance:%34.3f |",variance )); 
        System.out.println(String.format("| Standard Deviation:%24.3f |",stdev )); 
        System.out.println(String.format("| Min::%38.3f |",min )); 
        System.out.println(String.format("| Max::%38.3f |",max ));
        System.out.println(String.format("| Median:%36.3f |",median )); 
        System.out.println("+---------------------------------------------+");
    }
   /*******************************************************************************
   * outpurReport                                                                 *
   *                                                                              *
   * Purpose: prints the table into a file                                        *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void outpurReport()
    {
        int a=0;
        if(outputFilename.equals("")) a++; 
        else
        {
        try
        {
            FileWriter outputFile = new FileWriter(outputFilename);
            outputFile.write("+---------------------------------------------+\n");
            outputFile.write(String.format("| %-44s|\n",studyTitle ));  
            outputFile.write(String.format("| by %-40s |\n",studyLeader ));
            outputFile.write(String.format("| Date: %-37s |\n",studyDate ));
            outputFile.write("+---------------------------------------------+\n");
            outputFile.write(String.format("| Input File:%-33s|\n","                   "+inputFilename ));
            outputFile.write(String.format("| Output File:%-32s|\n","                  "+outputFilename )); 
            outputFile.write(String.format("| N:%37s     |\n",rawData.size()));
            outputFile.write(String.format("| Sum:%39.3f |\n",sum ));  
            outputFile.write(String.format("| Mean:%38.3f |\n",average )); 
            outputFile.write(String.format("| Variance:%34.3f |\n",variance )); 
            outputFile.write(String.format("| Standard Deviation:%24.3f |\n",stdev )); 
            outputFile.write(String.format("| Min::%38.3f |\n",min )); 
            outputFile.write(String.format("| Max::%38.3f |\n",max ));
            outputFile.write(String.format("| Median:%36.3f |\n",median )); 
            outputFile.write("+---------------------------------------------+\n");
            outputFile.close();
            
        }
        catch (IOException e)
        {
            System.out.println("An error has occurred: "+e);
        }
        }
    }
   /*******************************************************************************
   * phase3                                                                       *
   *                                                                              *
   * Purpose: calls some methods and prints some lines                            *
   * Parameters:                                                                  *
   *   No parameters                                                              *
   * Return Value: No return                                                      *
   *******************************************************************************/
    public void phase3()
    {
        System.out.println();
        System.out.println("Phase 3: Output tables");
        System.out.println("-----------------------------");
        printReport();
        outpurReport();
        System.out.println();
        if(outputFilename.equals(""))
        {
           System.out.println("Output was not recorded");
           System.out.println("Phase 3 complete");
           System.out.println("Existing program");
           System.out.println();
           System.out.println();
           System.out.println();
        }
        else
        {
           System.out.println("Output written to file "+outputFilename);
           System.out.println("Phase 3 complete");
           System.out.println("Existing program");
           System.out.println();
           System.out.println();
           System.out.println();
        }
    }
}