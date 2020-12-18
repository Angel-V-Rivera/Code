/*******************************************************************************
*                         Assignment 2 – Sorting Algorithms tester             *
*                                                                              *
* PROGRAMMER:       Angel Rivera                                               *
* CLASS:            CS200                                                      *
* ASSIGNMENT:       1                                                          *
* INSTRUCTOR:       Dean Zeller                                                *
* SUBMISSION DATE:  10/04/19                                                   *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program is the tester for sorting                                       *
*                                                                              *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
public class tester
{
    public static void main(String args[])
    {
        
        Sorting one = new Sorting();
       one.random();
        one.bubbleSort();
        one.random();
        one.insertion();
        one.random();
        one.selection();
        one.random();
        one.quicksortcall();
        
        
    }
}