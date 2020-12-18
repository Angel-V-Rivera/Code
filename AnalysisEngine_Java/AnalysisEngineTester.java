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
* This program is the tester of AnalysisEngine                                 *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
public class AnalysisEngineTester
{
    public static void main(String args[])
    {
        AnalysisEngine one = new AnalysisEngine("Gern Blanston","Another so-so Study","April 1, 2019","study1.txt","output1.txt");
        one.phase1();
        one.phase2();
        one.phase3();
        AnalysisEngine two = new AnalysisEngine();
        two.phase1();
        two.phase2();
        two.phase3();
        AnalysisEngine three = new AnalysisEngine("study2.txt","output3.txt");
        three.phase1();
        three.phase2();
        three.phase3();
    }
}