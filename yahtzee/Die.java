/*******************************************************************************
*                         Assignment 3 – Die Object                            *
*                                                                              *
* PROGRAMMER:       Angel Rivera                                               *
* CLASS:            CG102                                                      *
* ASSIGNMENT:       3                                                          *
* INSTRUCTOR:       Dean Zeller                                                *
* SUBMISSION DATE:  2/15/19                                                    *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program is a die object that we can use in the tester, and it does.     *
* contains several methods.                                                    *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
import java.util.Random;
public class Die
{
    public Random rand = new Random();

    public int numSides;
    public int currentValue;
    
    //constructor with numsides
    public Die(int numSides_)
    {
        this.numSides=numSides_;
    }
    //constructor no parameters
    public Die()
    {
        this(6);
    }
    //getnumSides
    public int getnumSides()
    {
        return this.numSides;
    }
    //roll
    public void roll()
    {
        this.currentValue = rand.nextInt(this.numSides)+1; 
    }
    //toString
    public String toString()
    {
        return Integer.toString(this.currentValue);
    }
    //returns
    public int getcurrentValue()
    {
        return this.currentValue;
    }
    //cheat
    public void cheat (int currentValue_)
    {
        if (currentValue_<0)
        {
            System.out.println("Warning: cannot set currentValue to elss than 0.0.");
            System.out.println("Attribute not changed");
            return;
        }
        if (currentValue_>(numSides))
        {
            System.out.println("Warning: cannot set currentValue to more than the number of sides");
            System.out.println("Attribute not changed");
            return;
        }
        this.currentValue = currentValue_;
    }
    //really cheat
    public void reallyCheat (int currentValue_)
    {
        this.currentValue = currentValue_;
    }
    
}