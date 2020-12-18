/*******************************************************************************
*                Assignment 3 – Tortoise v. Hare, Inheritance Edition          *
*                                                                              *
* PROGRAMMER:       Angel Rivera                                               *
* CLASS:            CS200                                                      *
* ASSIGNMENT:       3                                                          *
* INSTRUCTOR:       Dean Zeller                                                *
* SUBMISSION DATE:  11/01/19                                                   *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program creates the class for Hare                                       *
*                                                                              *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
import java.util.*;
public class Hare extends Animal
{
    protected int napStartTime;
    protected int napDuration;
    protected boolean napping=false;
    double ran;
    String hare="";
    int napcount=1;
 
    public Hare(String name_,String species_,double runningSpeed_,double variationOfSpeed_,double currentPostion_,int napStart_, int napduration_)
    {
        super(name_,species_,runningSpeed_,variationOfSpeed_,currentPostion_);
        this.napStartTime=napStart_;
        this.napDuration=napduration_;
        this.currentTime=0;
    }
    public void updatePosition()
    {
        if(napStartTime==currentTime)
        {
            napping=true;
        }
        if(napping==true)
        {
            napDuration-=1;
            if(napcount<10)
            hare="nap-"+napcount+" ";
            if(napcount>10)
            hare="nap-"+napcount+"";
            napcount++;
            if(napDuration==0)
            napping=false;
        }
        else if (napping==false)
        {
          hare="      ";
          Random r = new Random();
          ran = (runningSpeed-variationOfSpeed) + ((runningSpeed+variationOfSpeed) - (runningSpeed-variationOfSpeed)) * r.nextDouble();
          currentPosition+=ran;
        }
        currentTime+=1; 
    }
    public void summary()
    {
        System.out.println("Constestant "+count+": "+name+" "+" the "+species);
        System.out.println("    runnig speed:  "+String.format("    %8.1f",runningSpeed));
        System.out.println("    Variation of speed:    "+variationOfSpeed);
        String fix=napStartTime+""+" seconds";
        System.out.println("    Star nap: "+String.format("     %18s",fix));
        String fix2=napDuration+""+" seconds";
        System.out.println("    Nap duration: "+String.format("  %17s",fix2));
        System.out.println();
    }
    public String toString()
    {
       String table=String.format("|  %8.1f %7.1f  %3s   ",currentPosition,ran,hare);
       return table; 
    }
    public String header()
    {
     
      String header=String.format("%s","+-----------------------------");
      return header;
    }
    public String header2()
    {
      String header2=String.format("|            %5s            ",name);
      return header2;
    }
    public String header3()
    {
      String fix="("+species+")";
      String header3=String.format("|          %8s           ",fix);
      return header3;
    }
    public String header4()
    {
      String fix="   position  Speed  comments ";
      String header4=String.format("|%16s",fix);
      return header4;
    }
}