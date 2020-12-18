/*******************************************************************************
*                         Assignment 2 – Sorting Algorithms                    *
*                                                                              *
* PROGRAMMER:       Angel Rivera                                               *
* CLASS:            CS200                                                      *
* ASSIGNMENT:       1                                                          *
* INSTRUCTOR:       Dean Zeller                                                *
* SUBMISSION DATE:  10/04/19                                                   *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program will sort an arraylist using 4 different sorting algorithms.    *
*                                                                              *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
import java.util.*;

public class Sorting
{
   ArrayList<Integer> arr = new ArrayList<Integer>();
 
   public void getinput()
   {
       arr.clear();
       Scanner reader1 = new Scanner(System.in);
       String response="";
       int num=-1;
       int count=1;
       System.out.println("Enter the data, and end with a 0");
       while (num != 0)
       {
           System.out.print("Number "+count+" =>");
           response=reader1.nextLine();
           num = Integer.parseInt(response);
           if(num>0)
           arr.add(num);
           count++;
       }
       System.out.println();
   }
   
   public void random()
   {
       arr.clear();
       Random random = new Random();
       for(int i =0; i<10; i++)
       {
          int randomInteger = 9+random.nextInt(90);
          arr.add(randomInteger);
       }
   }
   public void tester()
   {
        arr.clear();
        arr.add(69);
        arr.add(81);
        arr.add(22);
        arr.add(48);
        arr.add(13);
        arr.add(38);
        arr.add(93);
        arr.add(14);
        arr.add(45);
        arr.add(58);
        arr.add(79);
        arr.add(72);
   }
  
   public void bubbleSort() 
   {    
        int ii=1;
        String space="";
        System.out.println("#####################################################################");
        System.out.println("Bubble Sort");
        System.out.println("#####################################################################");
        System.out.println();
        
        int iii=1;
        int iiii=1;
        int n = arr.size();  
        int temp = 0;
        
        for(int i=0; i < (n-1); i++)
        {  
           System.out.print("Loop #"+ii+"      Array =  ");
           for (int counter = 0; counter < arr.size(); counter++) 
           {         
              System.out.print(arr.get(counter)+" ");   
           }
           System.out.println();
           for(int j=1; j < (n); j++)
           {  
               int as=0;
               while(as!=arr.indexOf(arr.get(j-1)))
               {
                   space+=" "+" "+" ";
                   as++;
               }
               as=0;
               //System.out.println(arr.indexOf(arr.get(j-1)));
              System.out.println(String.format("%2s   ","    Comparison #"+iii)+space+"  "+arr.get(j-1)+" "+arr.get(j));
              space="";
              if(arr.get(j-1) > arr.get(j))
              {  
                 temp = arr.get(j-1);  
                 arr.set(j-1, arr.get(j));  
                 arr.set(j, temp);
                 while(as!=arr.indexOf(arr.get(j-1)))
                  {
                   space+=" "+" "+" ";
                   as++;
                  }
                 as=0;
                 System.out.println(String.format("%2s  ","    Swap #"+iiii)+"         "+space+arr.get(j-1)+" "+arr.get(j));
                 iiii++;
                 space="";
              }  
               iii++;           
           }
           ii++;
        }
        System.out.println();
      System.out.println("Analysis:");
      System.out.println(String.format("%s ","    Comparisons: ")+(iii-1));
      System.out.println(String.format("    %4s   ","    Swaps: ")+(iiii-1));
      System.out.println(String.format("     %4s   ","    Work: ")+(iii-1)+" + "+(iiii-1)+" * "+5+" = "+(5)*(iiii-1));
      System.out.println();
  }
   
  public void insertion()
  {
      String space="";
      int ii=1;
      int iii=1;
      int iiii=1;
      System.out.println("#####################################################################");
      System.out.println("Insertion Sort");
      System.out.println("#####################################################################");
      System.out.println();
      
      int n = arr.size(); 
      int temp;
        for (int i = 1; i < n; i++) 
        {
            System.out.print("Loop #"+ii+"    Array =  ");
            for (int counter = 0; counter < arr.size(); counter++) 
           {         
              System.out.print(arr.get(counter)+" ");   
           }
           System.out.println();
            for(int j = i ; j > 0 ; j--)
            {
               int as=0;
               while(as!=arr.indexOf(arr.get(j-1)))
               {
                   space+=" "+" "+" ";
                   as++;
               }
               as=0;
                System.out.println("    Comparison #"+iii+space+"   "+arr.get(j-1)+" "+arr.get(j));
                space="";
                if(arr.get(j) < arr.get(j-1))
                {
                    temp = arr.get(j);
                    arr.set(j,arr.get(j-1));
                    arr.set(j-1, temp);
                    while(as!=arr.indexOf(arr.get(j-1)))
                    {
                      space+=" "+" "+" ";
                      as++;
                    }
                    as=0;
                    System.out.println("    Swap #"+iiii+space+"         "+arr.get(j-1)+" "+arr.get(j));
                    iiii++;
                    space="";
                }
                iii++;
            }
            ii++;
        }
         System.out.println();
      System.out.println("Analysis:");
      System.out.println(String.format("%s ","    Comparisons: ")+(iii-1));
      System.out.println(String.format("    %4s   ","    Swaps: ")+(iiii-1));
      System.out.println(String.format("     %4s   ","    Work: ")+(iii-1)+" + "+(iiii-1)+" * "+5+" = "+(5)*(iiii-1));
      System.out.println();
  }
  
  public int check=0;
  public void selection()
  {
        String space="";
        String space2="";
        int ii=1;
        System.out.println("#####################################################################");
        System.out.println("Selection Sort");
        System.out.println("#####################################################################");
        System.out.println();
        
        int iii=1;
        
       int iiii=1;
       int n = arr.size(); 
       int a=n;
       for (int i = 0; i < (n-1); i++)  
       {  
           System.out.print("Loop #"+ii+"    Array =  ");
            for (int counter = 0; counter < arr.size(); counter++) 
           {         
              System.out.print(arr.get(counter)+" ");   
           }
           System.out.println();
           
            int index = i;  
            for (int j = (i+1); j < n; j++){  
                if (arr.get(j) < arr.get(index)){  
                    index = j;  
                }
                int as=0;
               while(as!=arr.indexOf(arr.get(j-1)))
               {
                   space+=" "+" "+" ";
                   as++;
               }
               as=0;
               int as2=0;
               while(as!=(n-arr.indexOf(arr.get(j-1))))
               {
                   space2+=" "+" "+" ";
                   as++;
               }
               as2=0;
                System.out.println("    Comparison #"+iii+space+"   "+arr.get(j-1) +space2+ "    min="+arr.get(index) +" "+ "arr["+i+']');
                space="";
                space2="";
                iii++;
                a--;
                check=(j);
            }
            int as=0;
               while(as!=arr.indexOf(arr.get(check)))
               {
                   space+=" "+" "+" ";
                   as++;
               }
               as=0;
               int as2=0;
               while(as!=(n-arr.indexOf(arr.get(check))))
               {
                   space2+=" "+" "+" ";
                   as++;
               }
               as2=0;
            System.out.println("    Comparison #"+iii+space+"   "+arr.get(check) +space2+ "    min="+arr.get(index) +" "+ "arr["+i+']');
            space="";
            space2="";
            a=n;
            int smallerNumber = arr.get(index);
            as2=0;
               while(as2!=((2+arr.indexOf(arr.get(index)))-((2+arr.indexOf(arr.get(i))))))
               {
                   space2+=" "+" ";
                   as2++;
               }
               as2=0;
            arr.set(index, arr.get(i));
            as=0;
            while(as!=(2+arr.indexOf(arr.get(i))))
            {
              space+=" "+" "+" ";
              as++;
            }
            as=0;
            
            System.out.println("    Swap #"+iiii+"  "+space+smallerNumber+"  "+space2+arr.get(i));
            space="";
            space2="";
            arr.set(i, smallerNumber); 
            ii++;
            
            iiii++;
        } 
       
       System.out.println();
       System.out.println();
      System.out.println("Analysis:");
      System.out.println(String.format("%s ","    Comparisons: ")+(iii));
      System.out.println(String.format("    %4s   ","    Swaps: ")+(iiii-1));
      System.out.println(String.format("     %4s   ","    Work: ")+(iii-1)+" + "+(iiii-1)+" * "+5+" = "+(5)*(iiii-1));
      System.out.println();
    }
  
  
  
  
  
  
  
  
  public int ii=1;
  public int iii=1;
  
  
  public void quicksortcall(){
 
        quickSort(0, arr.size()-1, 1);
      System.out.println("Analysis:");
      System.out.println(String.format("%s ","    Comparisons: ")+(ii-1));
      System.out.println(String.format("    %4s   ","    Swaps: ")+(ii-3));
      System.out.println(String.format("     %4s   ","    Work: ")+(ii-1)+" + "+(ii-3)+" * "+5+" = "+(5)*(ii-3));
      System.out.println();
        
    }
   public int only=0;
    public  void quickSort(int start, int end, int level)
    {
        
        if(only==0)
        {
            System.out.println("#####################################################################");
            System.out.println("QuickSort");
            System.out.println("#####################################################################");
            System.out.println();
            only=1;
        }
        only=1;
        System.out.println("Level = "+level);
        System.out.print("Loop #"+ii+"    Array =  ");
        for (int counter = 0; counter < arr.size(); counter++) 
        {         
            System.out.print(arr.get(counter)+" ");   
        }
        System.out.println();
        System.out.println("    Low = "+start);
        System.out.print("    Hi = "+end);
        
        
        int partition = partition(start, end);
        System.out.print("    Calling QS ("+start+","+(partition - 1)+")"+" and ("+(partition + 1)+","+end+")");
        System.out.println();
        System.out.println();
        if(partition-1>start) {
            quickSort( start, partition - 1, level+1);
        }
        if(partition+1<end) {
            quickSort( partition + 1, end, level+1);
        }
        
    }
 
    public  int partition(int start, int end)
    {
        String space="";
        int pivot = arr.get(end);
        System.out.println();
        
        System.out.println("    Pivot = " +pivot);
        for(int i=start; i<end; i++)
        {
            int as=0;
            while(as!=arr.indexOf(arr.get(i)))
            {
              space+=" "+" "+" ";
              as++;
            }
            as=0;
            System.out.println("    comparison #"+ii+"   "+space+arr.get(i));
            space="";
            ii++;
            if(arr.get(i)<pivot)
            {
                
                iii++;
                int temp= arr.get(start);
                arr.set(start, arr.get(i));
                arr.set(i,temp);
               as=0;
               while(as!=2+arr.indexOf(arr.get(start)))
               {
                   space+=" "+" "+" ";
                   as++;
               }
               as=0;
                System.out.println("    Swap #"+iii+"   "+space+arr.get(start)+" "+arr.get(i));
                space="";
                
                start++;
                
            }
        }
        
        int temp = arr.get(start);
        arr.set(start, pivot);
        arr.set(end, temp);
        int as=0;
        while(as!=3+arr.indexOf(arr.get(start)))
        {
           space+=" "+" "+" ";
           as++;
        }
        as=0;
        System.out.println("    Swap #"+(iii+1)+" "+space+arr.get(start)+" "+arr.get(end));
        iii++;
        
        return start;
        
    }
    
  
  
  
  
  
  
  
  
    
     
  
  
  }

   
    
