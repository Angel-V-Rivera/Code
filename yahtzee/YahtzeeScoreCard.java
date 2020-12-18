/*******************************************************************************
*                           Final Project- SoloApp                             *
*                                                                              *
* PROGRAMMER:       Angel Rivera                                               *
* CLASS:            CG102                                                      *
* ASSIGNMENT:       Final Project                                              *
* INSTRUCTOR:       Dean Zeller                                                *
* SUBMISSION DATE:  4/27/19                                                    *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program makes the solo game into an app like game                       *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
import java.util.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class YahtzeeScoreCard
{
   public YahtzeeObject hand;
   public int onesScore= -1;
   public int twosScore= -1; 
   public int threesScore= -1; 
   public int foursScore= -1; 
   public int fivesScore= -1; 
   public int sixesScore= -1; 
   public int bonusScore= 0; 
   public int threeKindScore= -1; 
   public int fourKindScore= -1; 
   public int fullHouseScore= -1; 
   public int smallStraightScore= -1; 
   public int largeStraightScore= -1; 
   public int yahtzeeScore= -1; 
   public int chanceScore= -1; 
   public int totalScore= 0;
   public int count=1;
   public int count2=1;
   public boolean ava=true;
   public boolean ava2=true;
   public boolean ava3=true;
   public boolean ava4=true;
   public boolean ava5=true;
   public boolean ava6=true;
   public boolean ava7=true;
   public boolean ava8=true;
   public boolean ava9=true;
   public boolean ava10=true;
   public boolean ava11=true;
   public boolean ava12=true;
   public boolean ava13=true;
   public boolean check=true;
   public JFrame f; 
   public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
   
   /*******************************************************************************
   * Construtor                                                                   *
   *                                                                              *
   * Purpose:  Creates an instance of the YahtzeeObject                           *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public YahtzeeScoreCard()
   {
       this.hand=new YahtzeeObject();
   }
   /*******************************************************************************
   * rollDice                                                                     *
   *                                                                              *
   * Purpose:  will roll each die if the respective boolean is call               *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void rollDice(boolean d1, boolean d2, boolean d3, boolean d4, boolean d5)
   {
       this.hand.rollDice(d1,d2,d3,d4,d5);
   }
   /*******************************************************************************
   * scoreOnes                                                                    *
   *                                                                              *
   * Purpose:  This method calculates the score of ones and set boolean to false  *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreOnes()
   {
       this.onesScore=hand.oneValue();
       ava=false;
   }
   /*******************************************************************************
   * scoreTwos                                                                    *
   *                                                                              *
   * Purpose:  This method calculates the score of twos and set boolean to false  *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreTwos()
   {
       this.twosScore=hand.twosValue();
       ava2=false;
   }
   /*******************************************************************************
   * scoreThrees                                                                  *
   *                                                                              *
   * Purpose: This method calculates the score of threes and set boolean to false *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreThrees()
   {
       this.threesScore=hand.threesValue();
       ava3=false;
   }
   /*******************************************************************************
   * scoreFours                                                                   *
   *                                                                              *
   * Purpose: This method calculates the score of fours and set boolean to false  *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreFours()
   {
       this.foursScore=hand.foursValue();
       ava4=false;
   }
   /*******************************************************************************
   * scoreFives                                                                   *
   *                                                                              *
   * Purpose: This method calculates the score of fives and set boolean to false  *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreFives()
   {
       this.fivesScore=hand.fivesValue();
       ava5=false;
   }
   /*******************************************************************************
   * scoreSixes                                                                   *
   *                                                                              *
   * Purpose: This method calculates the score of sixes and set boolean to false  *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreSixes()
   {
       this.sixesScore=hand.sixesValue();
       ava6=false;
   }
   /*******************************************************************************
   * scoreThreeKind                                                               *
   *                                                                              *
   * Purpose: This method calculates the score of T-Kind and set boolean to false *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreThreeKind()
   {
       this.threeKindScore=hand.threeKindValue();
       ava7=false;
   }
   /*******************************************************************************
   * scoreFourKind                                                                *
   *                                                                              *
   * Purpose: This method calculates the score of F-Kind and set boolean to false *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreFourKind()
   {
       this.fourKindScore=hand.fourKindValue();
       ava8=false;
   }
   /*******************************************************************************
   * scoreFullHouse                                                               *
   *                                                                              *
   * Purpose: This method calculates the score of F-House and set boolean to false*
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreFullHouse()
   {
       this.fullHouseScore=hand.fullHouseValue();
       ava9=false;
   }
   /*******************************************************************************
   * scoreSmallStraight                                                           *
   *                                                                              *
   * Purpose: This method calculates the score of S-Straight and set boolean      *
   * to false                                                                     *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreSmallStraight()
   {
       this.smallStraightScore=hand.smallStraighValue();
       ava10=false;
   }
   /*******************************************************************************
   * scoreLargeStraight                                                           *
   *                                                                              *
   * Purpose: This method calculates the score of L-Straight and set boolean      *
   * to false                                                                     *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreLargeStraight()
   {
       this.largeStraightScore=hand.largeStraightValue();
       ava11=false;
   }
   /*******************************************************************************
   * scoreYahtzee                                                                 *
   *                                                                              *
   * Purpose: This method calculates the score of Yahtzee and set boolean to false*
   *                                                                              *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreYahtzee()
   {
       this.yahtzeeScore=hand.yahtzeeValue();
       ava12=false;
   }
   /*******************************************************************************
   * scoreChance                                                                  *
   *                                                                              *
   * Purpose: This method calculates the score of chance and set boolean to false *
   *                                                                              *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void scoreChance()
   {
       this.chanceScore=hand.chanceValue();
       ava13=false;
   }
   /*******************************************************************************
   * bonusScore                                                                   *
   *                                                                              *
   * Purpose: This method calculates the score of bonus score                     *
   *                                                                              *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void bonusScore()
   {
       if((onesScore+twosScore+threesScore+foursScore+fivesScore+sixesScore)>=63)
           bonusScore=35;
       else
           bonusScore=0;
   }
   /*******************************************************************************
   * totalScore                                                                   *
   *                                                                              *
   * Purpose: This method calculates the score of totalScore                      *
   *                                                                              *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void totalScore()
   {
       int a,b,c,d,e,f,g,h,i,j,k,l,m,n;
       if(onesScore>0)
          a=onesScore;
       else
           a=0;
       if(twosScore>0)
          b=twosScore;
       else
           b=0;
       if(threesScore>0)
          c=threesScore;
       else
           c=0;
       if(foursScore>0)
          d=foursScore;
       else
           d=0;
       if(fivesScore>0)
          e=fivesScore;
       else
           e=0;
       if(sixesScore>0)
          f=sixesScore;
       else
           f=0;
       if(threeKindScore>0)
          g=threeKindScore;
       else
           g=0;
       if(fourKindScore>0)
          h=fourKindScore;
       else
           h=0;
       if(fullHouseScore>0)
          i=fullHouseScore;
       else
           i=0;
       if(smallStraightScore>0)
          j=smallStraightScore;
       else
           j=0;
       if(largeStraightScore>0)
          k=largeStraightScore;
       else
           k=0;
       if(yahtzeeScore>0)
          l=yahtzeeScore;
       else
           l=0;
       if(chanceScore>0)
          m=chanceScore;
       else
           m=0;
       if(bonusScore>0)
          n=bonusScore;
       else
           n=0;
       totalScore=(a+b+c+d+e+f+g+h+i+j+k+l+m+n);
   }
   /*******************************************************************************
   * displayScoresheet                                                            *
   *                                                                              *
   * Purpose: This method is to display a formated table and make some most of the*
   * logic for the game                                                           *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void displayScoresheet()
   {
       String sec;
       boolean d1,d2,d3,d4,d5;
       d1=false;
       d2=false;
       d3=false;
       d4=false;
       d5=false;
       Scanner reader1 = new Scanner(System.in);
       System.out.println("Turn #"+count+" of 13"); count++;
       System.out.println();
       if(onesScore>=0)System.out.println("  1. Ones: "+String.format("%14d", onesScore));
       else System.out.println("  1. Ones: ");
       if(twosScore>=0)System.out.println("  2. Twos:"+String.format("%15d", twosScore));
       else System.out.println("  2. Twos:");
       if(threesScore>=0)System.out.println("  3. Threes:"+String.format("%13d", threesScore));
       else System.out.println("  3. Threes:");
       if(foursScore>=0)System.out.println("  4. Fours:"+String.format("%14d", foursScore));
       else System.out.println("  4. Fours:");
       if(fivesScore>=0)System.out.println("  5. Fives:"+String.format("%14d", fivesScore));
       else System.out.println("  5. Fives:");
       if(sixesScore>=0)System.out.println("  6. Sixes:"+String.format("%14d", sixesScore));
       else System.out.println("  6. Sixes:");
       System.out.println("Bonus:"+ String.format("%19d", (bonusScore)));
       if(threeKindScore>=0)System.out.println("  7. 3-Kind:"+String.format("%13d", threeKindScore));
       else System.out.println("  7. 3-Kind:");
       if(fourKindScore>=0)System.out.println("  8. 4-Kind:"+String.format("%13d", fourKindScore));
       else System.out.println("  8. 4-Kind:");
       if(fullHouseScore>=0)System.out.println("  9. Full House:"+String.format("%9d", fullHouseScore));
       else System.out.println("  9. Full House:");
       if(smallStraightScore>=0)System.out.println(" 10. Small Straight:"+String.format("%5d", smallStraightScore));
       else System.out.println(" 10. Small Straight:");
       if(largeStraightScore>=0)System.out.println(" 11. Large Straight:"+String.format("%5d", largeStraightScore));
       else System.out.println(" 11. Large Straight:");
       if(yahtzeeScore>=0)System.out.println(" 12. Yahtzee:"+String.format("%12d", yahtzeeScore));
       else System.out.println(" 12. Yahtzee:");
       if(chanceScore>=0)System.out.println(" 13. Chance:"+String.format("%13d", chanceScore));
       else System.out.println(" 13. Chance:");
       System.out.println(" Total:"+String.format("%18d", (totalScore)));
       System.out.println();
       System.out.println("Dice Thrown #1:  "+toString());
       System.out.print("Dice to throw: ");
       sec = reader1.nextLine();
       int i;
       for (i=0;i<sec.length();i++)
       {
           char c = sec.charAt(i);
           if (c == '1') d1 = true;
           if (c == '2') d2 = true;
           if (c == '3') d3 = true;
           if (c == '4') d4 = true;
           if (c == '5') d5 = true;
      }
      hand.rollDice(d1,d2,d3,d4,d5);
      d1=false;
      d2=false;
      d3=false;
      d4=false;
      d5=false;
      System.out.println("Dice Thrown #2:  "+toString());
      System.out.print("Dice to throw: ");
      sec = reader1.nextLine();
      for (i=0;i<sec.length();i++)
      {
          char c = sec.charAt(i);
          if (c == '1') d1 = true;
          if (c == '2') d2 = true;
          if (c == '3') d3 = true;
          if (c == '4') d4 = true;
          if (c == '5') d5 = true;
      }
      hand.rollDice(d1,d2,d3,d4,d5);
      d1=false;
      d2=false;
      d3=false;
      d4=false;
      d5=false;
      System.out.println("Dice Thrown #3:  "+toString());
      System.out.println();
      System.out.print("Use in row: ");
      String r="";
      int v=0;
      while(true)
      {
          sec = reader1.nextLine();
          if(sec.equals("1")&&ava) break;
          else if(sec.equals("2")&&ava2) break;
          else if(sec.equals("3")&&ava3) break;
          else if(sec.equals("4")&&ava4) break;
          else if(sec.equals("5")&&ava5) break;
          else if(sec.equals("6")&&ava6) break;
          else if(sec.equals("7")&&ava7) break;
          else if(sec.equals("8")&&ava8) break;
          else if(sec.equals("9")&&ava9) break;
          else if(sec.equals("10")&&ava10) break;
          else if(sec.equals("11")&&ava11) break;
          else if(sec.equals("12")&&ava12) break;
          else if(sec.equals("13")&&ava13) break;
      }
      if(sec.equals("1")) {scoreOnes(); r="Ones"; v=onesScore; }
      if(sec.equals("2")) {scoreTwos(); r="Twos"; v=twosScore;}
      if(sec.equals("3")) {scoreThrees(); r="Threes"; v=threesScore;}
      if(sec.equals("4")) {scoreFours(); r="Fours"; v=foursScore;}
      if(sec.equals("5")) {scoreFives(); r="Fives"; v=fivesScore;}
      if(sec.equals("6")) {scoreSixes(); r="Sixes"; v=sixesScore;}
      if(sec.equals("7")) {scoreThreeKind(); r="T-Kind"; v=threeKindScore;}
      if(sec.equals("8")) {scoreFourKind(); r="F-Kind"; v=fourKindScore;}
      if(sec.equals("9")) {scoreFullHouse(); r="Full House"; v=fullHouseScore;}
      if(sec.equals("10")) {scoreSmallStraight(); r="Smal Straight"; v=smallStraightScore;}
      if(sec.equals("11")) {scoreLargeStraight(); r="Large Straight"; v=largeStraightScore;}
      if(sec.equals("12")) {scoreYahtzee(); r="Yahtzee"; v=yahtzeeScore;}
      if(sec.equals("13")) {scoreChance(); r="Chance"; v=chanceScore;}
      System.out.println();
      System.out.println("Score of "+v+" saved");
      System.out.println("In row "+sec+" "+r);
      System.out.println();
      totalScore();
   }
   /*******************************************************************************
   * lastTable                                                                    *
   *                                                                              *
   * Purpose: This method is to display the last table of the game                *
   *                                                                              *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: No return                                                      *
   *******************************************************************************/
   public void lastTable()
   {
       System.out.println("Final Scoresheet:"); 
       System.out.println();
       if(onesScore>=0)System.out.println("  1. Ones: "+String.format("%14d", onesScore));
       else System.out.println("  1. Ones: ");
       if(twosScore>=0)System.out.println("  2. Twos:"+String.format("%15d", twosScore));
       else System.out.println("  2. Twos:");
       if(threesScore>=0)System.out.println("  3. Threes:"+String.format("%13d", threesScore));
       else System.out.println("  3. Threes:");
       if(foursScore>=0)System.out.println("  4. Fours:"+String.format("%14d", foursScore));
       else System.out.println("  4. Fours:");
       if(fivesScore>=0)System.out.println("  5. Fives:"+String.format("%14d", fivesScore));
       else System.out.println("  5. Fives:");
       if(sixesScore>=0)System.out.println("  6. Sixes:"+String.format("%14d", sixesScore));
       else System.out.println("  6. Sixes:");
       System.out.println("Bonus:"+ String.format("%19d", (bonusScore)));
       if(threeKindScore>=0)System.out.println("  7. 3-Kind:"+String.format("%13d", threeKindScore));
       else System.out.println("  7. 3-Kind:");
       if(fourKindScore>=0)System.out.println("  8. 4-Kind:"+String.format("%13d", fourKindScore));
       else System.out.println("  8. 4-Kind:");
       if(fullHouseScore>=0)System.out.println("  9. Full House:"+String.format("%9d", fullHouseScore));
       else System.out.println("  9. Full House:");
       if(smallStraightScore>=0)System.out.println(" 10. Small Straight:"+String.format("%5d", smallStraightScore));
       else System.out.println(" 10. Small Straight:");
       if(largeStraightScore>=0)System.out.println(" 11. Large Straight:"+String.format("%5d", largeStraightScore));
       else System.out.println(" 11. Large Straight:");
       if(yahtzeeScore>=0)System.out.println(" 12. Yahtzee:"+String.format("%12d", yahtzeeScore));
       else System.out.println(" 12. Yahtzee:");
       if(chanceScore>=0)System.out.println(" 13. Chance:"+String.format("%13d", chanceScore));
       else System.out.println(" 13. Chance:");
       System.out.println(" Total:"+String.format("%18d", (totalScore)));
       System.out.println();
   }
   /*******************************************************************************
   * toString                                                                     *
   *                                                                              *
   * Purpose: This method is to display the dice as a string                      *
   *                                                                              *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: String                                                         *
   *******************************************************************************/
   public String toString()
   {
       return hand.toString();
   }
   /*******************************************************************************
   * User                                                                         *
   *                                                                              *
   * Purpose: This method will make the game look like an app                     *
   *                                                                              *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: None                                                           *
   *******************************************************************************/
   public boolean d1,d2,d3,d4,d5;
   public double as=0;
   public String sec="";
   public String q="";
   public String w="";
   public String y="";
   public String r="";
   public String t="";
   public JCheckBox cb1,cb2,cb3,cb4,cb5;
   public JCheckBox cb6,cb7,cb8,cb9,cb10;
   public JButton b3; 
   public JButton b4;
   public JButton b5;
   public JComboBox cb;
   public String row[]={"1","2","3","4","5","6","7","8","9","10","11","12","13"};
   public void user()
   {
       f=new JFrame();
 
       d1=false;
       d2=false;
       d3=false;
       d4=false;
       d5=false;
       f.setSize(300,900);
       f.setLocationRelativeTo(null);
       f.setLayout(null);
       
       JLabel L = new JLabel("JLabel Set Icon Example.");
       f.add(L);
       L.setIcon(new ImageIcon("download.jpg"));
       L.setBounds(50,50, 200,80);
       l1=new JLabel("Turn #"+count2+ " of 13");  count2++;
       l1.setBounds(50,70, 200,200);
       f.add(l1);
       if(onesScore>=0)System.out.println(l1=new JLabel("1. Ones:"+String.format("%25d", onesScore)));
       else System.out.println(l1=new JLabel("1. Ones:"));
       l1.setBounds(50,90, 200,200);
       f.add(l1);
       if(twosScore>=0)System.out.println(l2=new JLabel("2. Twos:"+String.format("%25d", twosScore)));
       else System.out.println(l2=new JLabel("2. Twos:"));
       l2.setBounds(50,110, 200,200);
       f.add(l2);
       if(threesScore>=0)System.out.println(l3=new JLabel("3. Threes:"+String.format("%22d", threesScore)));
       else System.out.println(l3=new JLabel("3. Threes:"));
       l3.setBounds(50,130, 200,200);
       f.add(l3);
       if(foursScore>=0)System.out.println(l4=new JLabel("4. Fours:"+String.format("%25d", foursScore)));
       else System.out.println(l4=new JLabel("4. Fours:"));
       l4.setBounds(50,150, 200,200);
       f.add(l4);
       if(fivesScore>=0)System.out.println(l5=new JLabel("5. Fives:"+String.format("%26d", fivesScore)));
       else System.out.println(l5=new JLabel("5. Fives:"));
       l5.setBounds(50,170, 200,200);
       f.add(l5);
       if(sixesScore>=0)System.out.println(l6=new JLabel("6. Sixes:"+String.format("%25d", sixesScore)));
       else System.out.println(l6=new JLabel("6. Sixes:"));
       l6.setBounds(50,190, 200,200);
       f.add(l6);
       l7=new JLabel("Bonus"+"      "+bonusScore);
       l7.setBounds(50,210, 200,200);
       f.add(l7);
       if(threeKindScore>=0)System.out.println(l8=new JLabel("7. 3-Kind:"+"      "+String.format("%18d", threeKindScore)));
       else System.out.println(l8=new JLabel("7. 3-Kind:"));
       l8.setBounds(50,230, 200,200);
       f.add(l8);
       if(fourKindScore>=0)System.out.println(l9=new JLabel("8. 4-Kind:"+"      "+String.format("%18d", fourKindScore)));
       else System.out.println(l9=new JLabel("8. 4-Kind:"));
       l9.setBounds(50,250, 200,200);
       f.add(l9);
       if(fullHouseScore>=0)System.out.println(l10=new JLabel("9. Full House:"+String.format("%17d", fullHouseScore)));
       else System.out.println(l10=new JLabel("9. Full House:"));
       l10.setBounds(50,270, 200,200);
       f.add(l10);
       if(smallStraightScore>=0)System.out.println(l11=new JLabel("10. Small Straight:"+String.format("%7d", smallStraightScore)));
       else System.out.println(l11=new JLabel("10. Small Straight:"));
       l11.setBounds(50,290, 200,200);
       f.add(l11);
       if(largeStraightScore>=0)System.out.println(l12=new JLabel("11. Large Straight:"+String.format("%7d", largeStraightScore)));
       else System.out.println(l12=new JLabel("11. Large Straight:"));
       l12.setBounds(50,310, 200,200);
       f.add(l12);
       if(yahtzeeScore>=0)System.out.println(l13=new JLabel("12. Yahtzee:"+String.format("%19d", yahtzeeScore)));
       else System.out.println(l13=new JLabel("12. Yahtzee:"));
       l13.setBounds(50,330, 200,200);
       f.add(l13);
       if(chanceScore>=0)System.out.println(l14=new JLabel("13. Chance:"+String.format("%19d", chanceScore)));
       else System.out.println(l14=new JLabel("13. Chance:"));
       l14.setBounds(50,350, 200,200);
       f.add(l14);
       l15=new JLabel("Total:      "+"      "+totalScore);
       l15.setBounds(50,370, 200,200);
       f.add(l15);
       l16=new JLabel("Dice Thrown #1:  "+toString());
       l16.setBounds(50,400, 200,200);
       f.add(l16);
       l17=new JLabel("Dice to throw: :  ");
       l17.setBounds(50,420, 200,200);
       f.add(l17);
       cb1=new JCheckBox("1");  
       cb1.setBounds(50,540,35,15);  
       cb2=new JCheckBox("2");  
       cb2.setBounds(90,540,35,15);  
       cb3=new JCheckBox("3");  
       cb3.setBounds(130,540,35,15);
       cb4=new JCheckBox("4");  
       cb4.setBounds(170,540,35,15);  
       cb5=new JCheckBox("5");  
       cb5.setBounds(210,540,35,15);
       f.add(cb1);
       f.add(cb2);
       f.add(cb3);
       f.add(cb4);
       f.add(cb5);
       JButton b = new JButton("Roll");
       JButton b2 = new JButton("Set");
       b4 = new JButton("Roll");
       b3 = new JButton("set");
       b5 = new JButton("F. Turn");
       b2.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               if(cb1.isSelected()){  
                   q="1";  
               }  
               if(cb2.isSelected()){  
                   w="2"; 
               }  
               if(cb3.isSelected()){  
                   y="3";
               }
               if(cb4.isSelected()){  
                   r="4";  
               }  
               if(cb5.isSelected()){  
                   t="5"; 
               }
               sec=q+w+y+r+t;
               for (int i=0;i<sec.length();i++)
               {
                   char c = sec.charAt(i);
                   if (c == '1') d1 = true;
                   if (c == '2') d2 = true;
                   if (c == '3') d3 = true;
                   if (c == '4') d4 = true;
                   if (c == '5') d5 = true;
               }
           }
       });
       b2.setBounds(150,565,95,30);  
       f.add(b2);
       System.out.println(sec);
       b.addActionListener(new ActionListener()
       {
       public void actionPerformed(ActionEvent e)
       {
            hand.rollDice(d1,d2,d3,d4,d5);
            System.out.println("trow set to false");
            l18=new JLabel("Dice Thrown #2:  "+hand.toString());
            l18.setBounds(50,520, 500,200);
            f.add(l18);
            l19=new JLabel("Dice to throw: :  ");
            l19.setBounds(50,540, 500,200);
            f.add(l19);
            d1=false;
            d2=false;
            d3=false;
            d4=false;
            d5=false;
            System.out.println(d5);
            cb6=new JCheckBox("1");  
            cb6.setBounds(50,660,35,15);  
            cb7=new JCheckBox("2");  
            cb7.setBounds(90,660,35,15);  
            cb8=new JCheckBox("3");  
            cb8.setBounds(130,660,35,15);
            cb9=new JCheckBox("4");  
            cb9.setBounds(170,660,35,15);  
            cb10=new JCheckBox("5");  
            cb10.setBounds(210,660,35,15);
            f.add(cb6);
            f.add(cb7);
            f.add(cb8);
            f.add(cb9);
            f.add(cb10);
            f.revalidate();
            f.repaint();
            b3.addActionListener(new ActionListener()
           {
           public void actionPerformed(ActionEvent e)
           {
               sec="";
               d1=false;
               d2=false;
               d3=false;
               d4=false;
               d5=false;
               q="";
               w="";
               r="";
               t="";
               y="";
               if(cb6.isSelected()){  
                   q="1";
               }  
               if(cb7.isSelected()){  
                   w="2"; 
               }  
               if(cb8.isSelected()){  
                   y="3";
               }
               if(cb9.isSelected()){  
                   r="4";  
               }  
               if(cb10.isSelected()){  
                   t="5"; 
               }
               sec=q+w+y+r+t;
               for (int i=0;i<sec.length();i++)
               {
                   char c = sec.charAt(i);
                   if (c == '1') d1 = true;
                   if (c == '2') d2 = true;
                   if (c == '3') d3 = true;
                   if (c == '4') d4 = true;
                   if (c == '5') d5 = true;
               }
           }
       });
       b3.setBounds(150,685,95,30);  
       f.add(b3);
       b4.addActionListener(new ActionListener()
       {
       public void actionPerformed(ActionEvent e)
       {
           hand.rollDice(d1,d2,d3,d4,d5);
           l20=new JLabel("Dice Thrown #3:  "+hand.toString());
           l20.setBounds(50,640, 500,200);
           f.add(l20);
           l21=new JLabel("Use in row:");
           l21.setBounds(50,660, 200,200);
           f.add(l21);    
           cb=new JComboBox(row);    
           cb.setBounds(50, 775,90,20);    
           f.add(cb);
           f.revalidate();
           f.repaint();
           b5.addActionListener(new ActionListener()
           {
               public void actionPerformed(ActionEvent e)
               {
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("1") && ava==true) {scoreOnes();
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("1") && ava==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("2")&& ava2==true) {scoreTwos(); 
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("2") && ava2==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("3")&& ava3==true) {scoreThrees(); 
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("3") && ava3==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("4")&& ava4==true) {scoreFours(); 
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("4") && ava4==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("5")&& ava5==true) {scoreFives();
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("5") && ava5==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("6")&& ava6==true) {scoreSixes(); 
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("6") && ava6==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("7")&& ava7==true) {scoreThreeKind();
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("7") && ava7==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("8")&& ava8==true) {scoreFourKind();
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("8") && ava8==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("9")&& ava9==true) {scoreFullHouse();
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("9") && ava9==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("10")&& ava10==true) {scoreSmallStraight();
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("10") && ava10==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("11")&& ava11==true) {scoreLargeStraight();
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("11") && ava11==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("12")&& ava12==true) {scoreYahtzee();
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("12") && ava12==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
                   if(cb.getItemAt(cb.getSelectedIndex()).equals("13")&& ava13==true) {scoreChance();
                       f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                       d1=false;
                       d2=false;
                       d3=false;
                       d4=false;
                       d5=false;
                       q="";
                       w="";
                       r="";
                       t="";
                       y="";
                       totalScore();}
                   else if(cb.getItemAt(cb.getSelectedIndex()).equals("13") && ava13==false) {JOptionPane.showMessageDialog(f,"Row already selected","Alert",JOptionPane.WARNING_MESSAGE);}
               }    
           });
           b5.setBounds(150,775,95,30);  
           f.add(b5);
       }    
       });
       b4.setBounds(50,685,95,30);  
       f.add(b4);
       }
       });
       b.setBounds(50,565,95,30);  
       f.add(b);
       f.setVisible(true);
   }
   /*******************************************************************************
   * tries                                                                        *
   *                                                                              *
   * Purpose: Adds a pause between each card                                      *
   *                                                                              *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: None                                                           *
   *******************************************************************************/
   public void tries()
   {
     String a="";
     Scanner reader1 = new Scanner(System.in);
     a = reader1.nextLine();
   }
   /*******************************************************************************
   * Last                                                                         *
   *                                                                              *
   * Purpose: Adds the last card that does not require user interaction           *
   *                                                                              *
   * Parameters:                                                                  *
   *     No parameters                                                            *
   * Return Value: None                                                           *
   *******************************************************************************/
   public void last()
   {
       f=new JFrame();
       f.setSize(300,600);
       f.setLayout(null);
       f.setLocationRelativeTo(null);
       f.setVisible(true);
       JLabel L = new JLabel("JLabel Set Icon Example.");
       f.add(L);
       L.setIcon(new ImageIcon("download.jpg"));
       L.setBounds(50,50, 200,80);
       l1=new JLabel("Turn #13 of 13");  count2++;
       l1.setBounds(50,70, 200,200);
       f.add(l1);
       if(onesScore>=0)System.out.println(l1=new JLabel("1. Ones:"+String.format("%25d", onesScore)));
       else System.out.println(l1=new JLabel("1. Ones:"));
       l1.setBounds(50,90, 200,200);
       f.add(l1);
       if(twosScore>=0)System.out.println(l2=new JLabel("2. Twos:"+String.format("%25d", twosScore)));
       else System.out.println(l2=new JLabel("2. Twos:"));
       l2.setBounds(50,110, 200,200);
       f.add(l2);
       if(threesScore>=0)System.out.println(l3=new JLabel("3. Threes:"+String.format("%22d", threesScore)));
       else System.out.println(l3=new JLabel("3. Threes:"));
       l3.setBounds(50,130, 200,200);
       f.add(l3);
       if(foursScore>=0)System.out.println(l4=new JLabel("4. Fours:"+String.format("%25d", foursScore)));
       else System.out.println(l4=new JLabel("4. Fours:"));
       l4.setBounds(50,150, 200,200);
       f.add(l4);
       if(fivesScore>=0)System.out.println(l5=new JLabel("5. Fives:"+String.format("%26d", fivesScore)));
       else System.out.println(l5=new JLabel("5. Fives:"));
       l5.setBounds(50,170, 200,200);
       f.add(l5);
       if(sixesScore>=0)System.out.println(l6=new JLabel("6. Sixes:"+String.format("%25d", sixesScore)));
       else System.out.println(l6=new JLabel("6. Sixes:"));
       l6.setBounds(50,190, 200,200);
       f.add(l6);
       l7=new JLabel("Bonus"+"      "+bonusScore);
       l7.setBounds(50,210, 200,200);
       f.add(l7);
       if(threeKindScore>=0)System.out.println(l8=new JLabel("7. 3-Kind:"+"      "+String.format("%18d", threeKindScore)));
       else System.out.println(l8=new JLabel("7. 3-Kind:"));
       l8.setBounds(50,230, 200,200);
       f.add(l8);
       if(fourKindScore>=0)System.out.println(l9=new JLabel("8. 4-Kind:"+"      "+String.format("%18d", fourKindScore)));
       else System.out.println(l9=new JLabel("8. 4-Kind:"));
       l9.setBounds(50,250, 200,200);
       f.add(l9);
       if(fullHouseScore>=0)System.out.println(l10=new JLabel("9. Full House:"+String.format("%17d", fullHouseScore)));
       else System.out.println(l10=new JLabel("9. Full House:"));
       l10.setBounds(50,270, 200,200);
       f.add(l10);
       if(smallStraightScore>=0)System.out.println(l11=new JLabel("10. Small Straight:"+String.format("%7d", smallStraightScore)));
       else System.out.println(l11=new JLabel("10. Small Straight:"));
       l11.setBounds(50,290, 200,200);
       f.add(l11);
       if(largeStraightScore>=0)System.out.println(l12=new JLabel("11. Large Straight:"+String.format("%7d", largeStraightScore)));
       else System.out.println(l12=new JLabel("11. Large Straight:"));
       l12.setBounds(50,310, 200,200);
       f.add(l12);
       if(yahtzeeScore>=0)System.out.println(l13=new JLabel("12. Yahtzee:"+String.format("%19d", yahtzeeScore)));
       else System.out.println(l13=new JLabel("12. Yahtzee:"));
       l13.setBounds(50,330, 200,200);
       f.add(l13);
       if(chanceScore>=0)System.out.println(l14=new JLabel("13. Chance:"+String.format("%19d", chanceScore)));
       else System.out.println(l14=new JLabel("13. Chance:"));
       l14.setBounds(50,350, 200,200);
       f.add(l14);
       l15=new JLabel("Total:      "+"      "+totalScore);
       l15.setBounds(50,370, 200,200);
       f.add(l15);
       f.setVisible(true);
       f.repaint();
   }
}