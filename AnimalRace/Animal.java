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
* This program creates the class for Animal that can be used for any animal    *
*                                                                              *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
import java.util.*;
public class Animal
{
    protected String name;
    protected String species;
    protected double runningSpeed;
    protected double variationOfSpeed;
    protected double currentPosition;
    protected int currentTime;
    public int count=1;
    double ran;
    
    public Animal(String name_,String species_,double runningSpeed_,double variationOfSpeed_,double currentPostion_)
    {
        this.name=name_;
        this.species=species_;
        this.runningSpeed=runningSpeed_;
        this.variationOfSpeed=variationOfSpeed_;
        this.currentPosition=currentPostion_;
        this.currentTime=0;
    }
    public Animal(String name_,String species_,double runningSpeed_,double variationOfSpeed_)
    {
        this.name=name_;
        this.species=species_;
        this.runningSpeed=runningSpeed_;
        this.variationOfSpeed=variationOfSpeed_;
        this.currentTime=0;
    }
    public Animal(String name_,String species_,double runningSpeed_)
    {
        this.name=name_;
        this.species=species_;
        this.runningSpeed=runningSpeed_;
        this.variationOfSpeed=(runningSpeed/10);
        this.currentTime=0;
    }
    public Animal()
    {}
    public String getname()
    {
        return name;
    }
    public String getspecies()
    {
        return species;
    }
    public double getrunningSpeed()
    {
        return runningSpeed;
    }
    public double getvariationOfSpeed()
    {
        return variationOfSpeed;
    }
    public double getcurrentPosition()
    {
        return currentPosition;
    }
    public int getcurrentTime()
    {
        return currentTime;
    }
    public void updatePosition()
    {
      Random r = new Random();
      ran = (runningSpeed-variationOfSpeed) + ((runningSpeed+variationOfSpeed) - (runningSpeed-variationOfSpeed)) * r.nextDouble();
      this.currentPosition+=ran;
      this.currentTime+=1;
    }
    public void summary()
    {
        System.out.println("Constestant "+count+": "+name+""+" the "+ species);
        System.out.println("    runnig speed: "+String.format("    %8.1f",runningSpeed));
        System.out.println("    Variation of speed:    "+variationOfSpeed);
        System.out.println();
    }
    public String toString()
    {
       String table=String.format("|  %8.1f   %8.1f ",currentPosition,ran);
       return table; 
    }
    public String header()
    {
      String header=String.format("%s","+----------------------");
      return header;
    }
    public String header2()
    {
      String header2=String.format("|     %8s         ",name);
      return header2;
    }
    public String header3()
    {
      String fix="("+species+")";
      String header3=String.format("|   %11s        ",fix);
      return header3;
    }
    public String header4()
    {
      String fix="      position  Speed";
      String header4=String.format("|%16s ",fix);
      return header4;
    }
     
}