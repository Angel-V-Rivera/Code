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
* This program makes all the contestants participate in a race                 *
*                                                                              *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
import java.util.*;
public class Race
{
    Animal one= new Animal();
    protected String event;
    protected int length=1000;
    protected ArrayList<Animal> contestants= new ArrayList<Animal>();
    boolean raceover=false;
    
    public Race(int length_, ArrayList<Animal> constestant_)
    {
        this.length=length_;
        this.contestants=constestant_;
    }
    public Race(ArrayList<Animal> constestant_)
    {
        this.contestants=constestant_;
        this.length=1000;
    }
    public void runRace()
    {
        int pr=0;
        System.out.print("Event: ");
        while(pr < (contestants.size()-1))
        {
           System.out.print(contestants.get(pr).getspecies()+" v. "); 
           pr++;
        }
        System.out.print(contestants.get(pr).getspecies());
        System.out.println();
        System.out.println();
        System.out.println("Race distance (feet): "+length);
        System.out.println();
        int pe=0;
        while(pe < contestants.size())
        {
           contestants.get(pe).count=(pe+1);
           contestants.get(pe).summary();// using polymorphisims
           pe++;
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Aaaaaaaaand.. we're OFF!!!");
        System.out.println();
        
        
        
       
        String header=String.format("%s","+-----");
        for(Animal a :contestants)
        {
          header+=a.header();// using polymorphisims
        }
        header+="+";// using polymorphisims
        System.out.println(header);
        String header2=String.format("%s","|     ");
        for(Animal a :contestants)
        {
          header2+=a.header2();// using polymorphisims
        }
        header2+="|";
        System.out.println(header2);
        String header3=String.format("%s","|     ");
        for(Animal a :contestants)
        {
          header3+=a.header3();// using polymorphisims
        }
        header3+="|";
        System.out.println(header3);
        String header4=String.format("%s","| Time");
        for(Animal a :contestants)
        {
          header4+=a.header4();// using polymorphisims
        }
        header4+="|";
        System.out.println(header4);
        
        
        
        String winner="";
        int currentTime=0;
        while(true)
        {
            String line=String.format("| %3d ",currentTime);
            for(Animal a :contestants)
            {
                a.updatePosition();// using polymorphisims
                line+=a;
            }
            line+="|";
            currentTime++;
            System.out.println(line);
            for(Animal b :contestants)
            {
                if(b.getcurrentPosition() > length)
                {
                    raceover=true;
                    winner=b.getspecies();
                }
            }
            if(raceover==true)
                break;
    }
        System.out.println(header);
        System.out.println();
        System.out.println("Race is over in "+(currentTime-1)+" seconds");
        System.out.println(winner+" Wins!!!");
        System.out.println();
    }
}