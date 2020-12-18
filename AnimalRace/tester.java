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
* This program creates the tester to run all the program                       *
*                                                                              *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
import java.util.*;
public class tester
{
    public static void main(String args[])
    {
        ArrayList<Animal> contestants= new ArrayList<Animal>();
        Animal one= new Animal("Tommy","Tortoise",2,.2,0);
        Hare two= new Hare("Harry","Hare",12,2,0,5,20);
        contestants.add(one);
        contestants.add(two);
        Race race= new Race(100,contestants);
        race.runRace();
        
        contestants.clear();
        Animal tres= new Animal("Speedy","Tortoise",2,.5,0);
        Hare cuatro= new Hare("Tuper","Hare",10,1.5,0,60,80);
        Dog cinco= new Dog("Douug","Dog",6.5,.75,0,200);
        contestants.add(tres);
        contestants.add(cuatro);
        contestants.add(cinco);
        Race race2= new Race(500,contestants);
        race2.runRace();
        
        contestants.clear();
        Animal seis= new Animal("Creepy","Tortoise",2.1,1,0);
        Hare siete= new Hare("Buggs","Hare",11,2,0,80,250);
        Dog ocho= new Dog("Pluto","Dog",9,.5,0,600);
        Animal nueve= new Animal("Gary","Snail",1,.25,0);
        contestants.add(seis);
        contestants.add(siete);
        contestants.add(ocho);
        contestants.add(nueve);
        Race race3= new Race(1000,contestants);
        System.out.print("Current document is out of sync with the Interactions Pane and should be recompiled!Current document is out of sync with the Interactions Pane and should be recompiled!");
        race3.runRace();
       
        
        
        
    }
}