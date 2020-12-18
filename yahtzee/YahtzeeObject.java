 /*******************************************************************************
*                         Assignment 4 – Yatzee Hand                           *
*                                                                              *
* PROGRAMMER:       Angel Rivera                                               *
* CLASS:            CG102                                                      *
* ASSIGNMENT:       4                                                          *
* INSTRUCTOR:       Dean Zeller                                                *
* SUBMISSION DATE:  2/23/19                                                    *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program is a YatzeeObject we can use in the tester of several purposes. *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class YahtzeeObject
{
    //array as a attribute
    List<Die>dice;
    
    public Random rand = new Random();
    // constructor 2 parameters
    public YahtzeeObject(int numberOfDice, int numberOfSides)
    {
        this.dice = new ArrayList<Die>();
        for (int i=0; i<numberOfDice; i++)
        {
            Die dado = new Die(numberOfSides);
            dice.add(dado);
        } 
    }
    //constructor 1 parameter
    public YahtzeeObject (int numberOfDice)
    {
        this(numberOfDice,6);
    }
    //constructor no parameter
    public YahtzeeObject()
    {
        this(5,6);
    }
    //roll dice
    public void rollDice()
    {
        for(Die d: this.dice)
        {
            d.roll();
        }
    }
    public void rollDice(boolean d1, boolean d2, boolean d3, boolean d4, boolean d5)
    {
        if(d1){ this.dice.get(0).roll();}
        if(d2){ this.dice.get(1).roll();}
        if(d3){ this.dice.get(2).roll();}
        if(d4){ this.dice.get(3).roll();}
        if(d5){ this.dice.get(4).roll();};           
    }
    //toString
    public String toString()
    {
        String s="";
        for(Die d: this.dice)
        {
            s+=d+" ";
        }
        return s;
    }
    //count dice
    public int countDice(int k)
    {
        int count=0;
        for(Die d: this.dice)
        {
            if((d.currentValue)==k)
            {
                 count++;
            }
        }
        return count;
    }
    //set dice
    public void setDice(int d1, int d2, int d3, int d4,int d5)
    {
        this.dice.get(0).cheat(d1);
        this.dice.get(1).cheat(d2);
        this.dice.get(2).cheat(d3);
        this.dice.get(3).cheat(d4);
        this.dice.get(4).cheat(d5);
    }
    //onevalue
    public int oneValue()
    {
     int count=0;
        for(Die d: this.dice)
        {
            if((d.currentValue)==1)
            {
                 count++;
            }
        }
        if(count>0)
            return count;
        else return 0;
    }
    //twosvalue
    public int twosValue()
    {
        int count=0;
        for(Die d: this.dice)
        {
            if((d.currentValue)==2)
            {
                 count+=2;
            }
        }
        if(count>0)
            return count;
        else return 0;
    }
    //threesvalue
    public int threesValue()
    {
     int count=0;
        for(Die d: this.dice)
        {
            if((d.currentValue)==3)
            {
                 count+=3;
            }
        }
        if(count>0)
            return count;
        else return 0;
    }
    //foursvalue
    public int foursValue()
    {
     int count=0;
        for(Die d: this.dice)
        {
            if((d.currentValue)==4)
            {
                 count+=4;
            }
        }
        if(count>0)
            return count;
        else return 0;
    }
    //fivesvalue
    public int fivesValue()
    {
     int count=0;
        for(Die d: this.dice)
        {
            if((d.currentValue)==5)
            {
                 count+=5;
            }
        }
        if(count>0)
            return count;
        else return 0;
    }
    //sixesvalues
    public int sixesValue()
    {
     int count=0;
        for(Die d: this.dice)
        {
            if((d.currentValue)==6)
            {
                 count+=6;
            }
        }
        if(count>0)
            return count;
        else return 0;
    }
    //threeKindValue
    public int threeKindValue()
    {
        int sum=0;
        int numberOfOnes = 0;
        int numberOfTwos = 0;
        int numberOfThrees = 0;
        int numberOfFours = 0;
        int numberOfFives = 0;
        int numberOfSixes = 0;
        for(Die d: this.dice)
        {
            if(d.currentValue == 1)
                numberOfOnes++;
            else if(d.currentValue == 2)
                numberOfTwos++;
            else if(d.currentValue == 3)
                numberOfThrees++;
            else if(d.currentValue == 4)
                numberOfFours++;
            else if(d.currentValue == 5)
                numberOfFives++;
            else
                numberOfSixes++;
        }
        if(numberOfOnes>=3||numberOfTwos>=3||numberOfThrees>=3||numberOfFours>=3||numberOfFives>=3||numberOfSixes>=3)
        {  
            for(Die d : this.dice)
            {
                sum += d.currentValue;
            }
      
        }
        return sum;
    }
    //fourKindValue
    public int fourKindValue()
    {
        int sum=0;
        int numberOfOnes = 0;
        int numberOfTwos = 0;
        int numberOfThrees = 0;
        int numberOfFours = 0;
        int numberOfFives = 0;
        int numberOfSixes = 0;
        for(Die d: this.dice)
        {
            if(d.currentValue == 1)
                numberOfOnes++;
            else if(d.currentValue == 2)
                numberOfTwos++;
            else if(d.currentValue == 3)
                numberOfThrees++;
            else if(d.currentValue == 4)
                numberOfFours++;
            else if(d.currentValue == 5)
                numberOfFives++;
            else
                numberOfSixes++;
        }
        if(numberOfOnes==4||numberOfTwos==4||numberOfThrees==4||numberOfFours==4||numberOfFives==4||numberOfSixes==4)
        {  
            for(Die d : this.dice)
            {
                sum += d.currentValue;
            }
      
        }
        return sum;
    }
    //FullHouse
    public int fullHouseValue()
    {
        int numberOfOnes = 0;
        int numberOfTwos = 0;
        int numberOfThrees = 0;
        int numberOfFours = 0;
        int numberOfFives = 0;
        int numberOfSixes = 0;
        for(Die d: this.dice)
        {
            if(d.currentValue == 1)
                numberOfOnes++;
            else if(d.currentValue == 2)
                numberOfTwos++;
            else if(d.currentValue == 3)
                numberOfThrees++;
            else if(d.currentValue == 4)
                numberOfFours++;
            else if(d.currentValue == 5)
                numberOfFives++;
            else
                numberOfSixes++;
        }
        if((numberOfOnes==3||numberOfTwos==3||numberOfThrees==3||numberOfFours==3||numberOfFives==3||numberOfSixes==3)&&
        (numberOfOnes==2||numberOfTwos==2||numberOfThrees==2||numberOfFours==2||numberOfFives==2||numberOfSixes==2))
        {  
            return 25;
        }
        if(numberOfOnes==5||numberOfTwos==5||numberOfThrees==5||numberOfFours==5||numberOfFives==5||numberOfSixes==5)
        {
            return 25;
        }
       return 0;
    }
    //SmallStraighValue
    public int smallStraighValue()
    {
        int numberOfOnes = 0;
        int numberOfTwos = 0;
        int numberOfThrees = 0;
        int numberOfFours = 0;
        int numberOfFives = 0;
        int numberOfSixes = 0;
        for(Die d: this.dice)
        {
            if(d.currentValue == 1)
                numberOfOnes++;
            else if(d.currentValue == 2)
                numberOfTwos++;
            else if(d.currentValue == 3)
                numberOfThrees++;
            else if(d.currentValue == 4)
                numberOfFours++;
            else if(d.currentValue == 5)
                numberOfFives++;
            else
                numberOfSixes++;
        }
        if((numberOfOnes==1&&numberOfTwos==1&&numberOfThrees==1&&numberOfFours==1)||
        (numberOfTwos==1&&numberOfThrees==1&&numberOfFours==1&&numberOfFives==1)||
        (numberOfThrees==1&&numberOfFours==1&&numberOfFives==1&&numberOfSixes==1))
        {  
            return 30;
        }
        return 0;
    }
    //LargeStraightValue
    public int largeStraightValue()
    {
        int numberOfOnes = 0;
        int numberOfTwos = 0;
        int numberOfThrees = 0;
        int numberOfFours = 0;
        int numberOfFives = 0;
        int numberOfSixes = 0;
        for(Die d: this.dice)
        {
            if(d.currentValue == 1)
                numberOfOnes++;
            else if(d.currentValue == 2)
                numberOfTwos++;
            else if(d.currentValue == 3)
                numberOfThrees++;
            else if(d.currentValue == 4)
                numberOfFours++;
            else if(d.currentValue == 5)
                numberOfFives++;
            else
                numberOfSixes++;
        }
        if(numberOfOnes==1&&numberOfTwos==1&&numberOfThrees==1&&numberOfFours==1&&numberOfFives==1)
        {  
            return 40;
        }
        if(numberOfTwos==1&&numberOfThrees==1&&numberOfFours==1&&numberOfFives==1&&numberOfSixes==1)
        {  
            return 40;
        }
        return 0;
    }
    //yahtzeeValue
    public int yahtzeeValue()
    {
        int numberOfOnes = 0;
        int numberOfTwos = 0;
        int numberOfThrees = 0;
        int numberOfFours = 0;
        int numberOfFives = 0;
        int numberOfSixes = 0;
        for(Die d: this.dice)
        {
            if(d.currentValue == 1)
                numberOfOnes++;
            else if(d.currentValue == 2)
                numberOfTwos++;
            else if(d.currentValue == 3)
                numberOfThrees++;
            else if(d.currentValue == 4)
                numberOfFours++;
            else if(d.currentValue == 5)
                numberOfFives++;
            else
                numberOfSixes++;
        }
        if(numberOfOnes==5||numberOfTwos==5||numberOfThrees==5||numberOfFours==5||numberOfFives==5||numberOfSixes==5)
        {
            return 50;
        }
        else return 0;
    }
    //chanceValue
    public int chanceValue()
    {
       int sum=0;
       for(Die d : this.dice)
       {
           sum += d.currentValue;
       }
       return sum;
    }
    //report
    public void report(int lineNum)
    {  
        System.out.format("%d %12s %2d %5d %5d %5d %5d %5d %5d %5d %5d %5d %5d %5d %5d",lineNum,toString(),oneValue(),
                          twosValue(),threesValue(),foursValue(),fivesValue(),sixesValue(),threeKindValue(),
    fourKindValue(),fullHouseValue(),smallStraighValue(),largeStraightValue(),yahtzeeValue(),chanceValue());
    }
    //reportheader
    public void reportHeader()
    {
        System.out.println("Yahtzee Hand Report");
        System.out.println("Creating 10 Manual YahzteeHand examples");
        System.out.print("    "+ "Dice"+"        "+"1s"+"    "+"2s"+"    "+"3s"+"    "+"4s"+"    "+"5s"+"    "
                        +"6s"+"    "+"3k"+"    "+"4k"+"    "+"FH"+"    "+"Sm"+"    "+"Lg"+"    "+"Yt"+"    "+
        "Ch");
        System.out.println();
    }
    //averages
    public void averages()
    {
       System.out.println("Running 1000 random YahtzeeHand examples");
       System.out.println("<output omitted>");
       System.out.print("    "+ "    "+"        "+"1s"+"    "+"2s"+"    "+"3s"+"    "+"4s"+"    "+"5s"+"    "
                        +"6s"+"    "+"3k"+"    "+"4k"+"    "+"FH"+"    "+"Sm"+"    "+"Lg"+"    "+"Yt"+"    "+
        "Ch");
      
       
    }
}