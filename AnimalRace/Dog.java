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
* This program creates the class for Dog                                       *
*                                                                              *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Dog extends Animal
{
    protected int squirrelLocation;
    protected boolean squirrel=false;
    String sq="        ";
    double ran;
    
    public Dog(String name_,String species_,double runningSpeed_,double variationOfSpeed_,double currentPostion_,int slocation_)
    {
        super(name_,species_,runningSpeed_,variationOfSpeed_,currentPostion_);
        this.squirrelLocation=slocation_;
        this.currentTime=0;
    }
    public void toggleSquirrel()
    {
        this.squirrel = !this.squirrel;
    }
    int onlyonce=0;
    public void updatePosition()
    {
        if(currentPosition >=this.squirrelLocation & onlyonce==0)
        {
           squirrel=true;
           onlyonce+=1;
        }
        if(squirrel==true)
        {
          Random r = new Random();
          ran = (-runningSpeed) + ((runningSpeed) - (-runningSpeed)) * r.nextDouble();
          this.currentPosition+=ran;
        }
        if(squirrel==true)
        {
            int rand = ThreadLocalRandom.current().nextInt(1, 10 + 1);
            sq="squirrel";
            if(rand==2 || rand==8)
            {
                squirrel=false;
                sq="        ";
            }
        }
        if (squirrel==false){
          Random r = new Random();
          ran = (runningSpeed-variationOfSpeed) + ((runningSpeed+variationOfSpeed) - (runningSpeed-variationOfSpeed)) * r.nextDouble();
          this.currentPosition+=ran;
        }
        this.currentTime+=1;
    }
    public void summary()
    {
       System.out.println("Constestant "+count+": "+name+""+" the "+ species);
       System.out.println("    runnig speed: "+String.format("    %8.1f",runningSpeed));
       System.out.println("    Variation of speed:    "+variationOfSpeed);
       System.out.println("    Squirrel location: "+String.format("   %4d",squirrelLocation)+" feet");
       System.out.println();
    }
    public String toString()
    {
       String table=String.format("|  %8.1f  %8.1f %s ",currentPosition,ran,sq);
       return table; 
    }
    public String header()
    {
      String header=String.format("%s","+------------------------------");
      return header;
    }
    public String header2()
    {
      String header2=String.format("|            %5s             ",name);
      return header2;
    }
    public String header3()
    {
      String fix="("+species+")"; 
      String header3=String.format("|           %8s           ",fix);
      return header3;
    }
    public String header4()
    {
      String fix="   position    Speed  comments";
      String header4=String.format("|%16s",fix);
      return header4;
    }
}