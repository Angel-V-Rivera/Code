/*******************************************************************************
*                         Assignment 4 � Yatzee Hand                           *
*                                                                              *
* PROGRAMMER:       Angel Rivera                                               *
* CLASS:            CG102                                                      *
* ASSIGNMENT:       4                                                          *
* INSTRUCTOR:       Dean Zeller                                                *
* SUBMISSION DATE:  2/23/19                                                    *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program is a YatzeeTesteruse here we can use the methods created on the *
* Yatzee object.                                                               *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is (c) 2019 Angel Rivera and Dean Zeller. This is original work,*
* without use of outside sources.                                              *
*******************************************************************************/
public class YahtzeeTester
{
    public static void main(String args[])
    {
        //Ten test in formated table
        YahtzeeObject t = new YahtzeeObject();
        t.rollDice();
        t.setDice(2,1,3,6,1);
        t.reportHeader();
        t.report(1);
        System.out.println();
        t.rollDice();
        t.setDice(6,2,5,3,4);
        t.report(2);
        System.out.println();
        t.rollDice();
        t.setDice(5,5,2,1,5);
        t.report(3);
        System.out.println();
        t.rollDice();
        t.setDice(2,2,4,2,4);
        t.report(4);
        System.out.println();
        t.rollDice();
        t.setDice(4,4,4,4,4);
        t.report(5);
        System.out.println();
        t.rollDice();
        t.setDice(2,3,4,5,4);
        t.report(6);
        System.out.println();
        t.rollDice();
        t.setDice(6,2,6,6,6);
        t.report(7);
        System.out.println();
        t.rollDice();
        t.report(8);
        System.out.println();
        t.rollDice();
        t.report(9);
        System.out.println();
        t.rollDice();
        t.report(10);
        System.out.println();
        //report with averages and percentages
        int j = 0;
        int h1=0;
        int h2=0;
        int h3=0;
        int h4=0;
        int h5=0;
        int h6=0;
        int h7=0;
        int h8=0;
        int h9=0;
        int h10=0;
        int h11=0;
        int h12=0;
        int h13=0;
        int count1s=0;
        int count2s=0;
        int count3s=0;
        int count4s=0;
        int count5s=0;
        int count6s=0;
        int count3k=0;
        int count4k=0;
        int countFH=0;
        int countSt=0;
        int countLT=0;
        int countYT=0;
        int countCV=0;
        double nz1,nz2,nz3,nz4,nz5,nz6,nz7,nz8,nz9,nz10,nz11,nz12,nz13;
        double av,av1,av2,av3,av4,av5,av6,av7,av8,av9,av10,av11,av12;
        while(j < 1000)
        {
           t.rollDice();
           if(t.oneValue()>0)
           {
               h1++;
           }
           if(t.twosValue()>0)
           {
               h2++;
           }
           if(t.threesValue()>0)
           {
               h3++;
           }
           if(t.foursValue()>0)
           {
               h4++;
           }
           if(t.fivesValue()>0)
           {
               h5++;
           }
           if(t.sixesValue()>0)
           {
               h6++;
           }
           if(t.threeKindValue()>0)
           {
               h7++;
           }
           if(t.fourKindValue()>0)
           {
               h8++;
           }
           if(t.fullHouseValue()>0)
           {
               h9++;
           }
           if(t.smallStraighValue()>0)
           {
               h10++;
           }
           if(t.largeStraightValue()>0)
           {
               h11++;
           }
           if(t.yahtzeeValue()>0)
           {
               h12++;
           }
           if(t.chanceValue()>0)
           {
               h13++;
           }
            
           count1s += t.oneValue();
           count2s+= t.twosValue();
           count3s+= t.threesValue();
           count4s+= t.foursValue();
           count5s+= t.fivesValue();
           count6s+= t.sixesValue();
           count3k+= t.threeKindValue();
           count4k+= t.fourKindValue();
           countFH+= t.fullHouseValue();
           countSt+= t.smallStraighValue();
           countLT+= t.largeStraightValue();
           countYT+= t.yahtzeeValue();
           countCV+= t.chanceValue();
           
           
            
           j++;
        }
       
       av=(double)count1s/j;
       av1=(double)count2s/j;
       av2=(double)count3s/j;
       av3=(double)count4s/j;
       av4=(double)count5s/j;
       av5=(double)count6s/j;
       av6=(double)count3k/j;
       av7=(double)count4k/j;
       av8=(double)countFH/j;
       av9=(double)countSt/j;
       av10=(double)countLT/j;
       av11=(double)countYT/j;
       av12=(double)countCV/j;
       nz1=(double)h1/j;
       nz2=(double)h2/j;
       nz3=(double)h3/j;
       nz4=(double)h4/j;
       nz5=(double)h5/j;
       nz6=(double)h6/j;
       nz7=(double)h7/j;
       nz8=(double)h8/j;
       nz9=(double)h9/j;
       nz10=(double)h10/j;
       nz11=(double)h11/j;
       nz12=(double)h12/j;
       nz13=(double)h13/j;
       System.out.println();
       System.out.println();
       System.out.println();
       t.averages();
       System.out.println();
       System.out.println();
       System.out.format("%2s %10.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f","% Non-Zero",(nz1)*100,
                          (nz2)*100,(nz3)*100,(nz4)*100,(nz5)*100,(nz6)*100,(nz7)*100,(nz8)*100,
                         (nz9)*100,(nz10)*100,(nz11)*100,(nz12)*100,(nz13*100));
       System.out.println();
       System.out.println();
       System.out.format("%2s %6.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %5.2f %6.2f","Average Score",av,
                          av1,av2,av3,av4,av5,av6,av7,av8,av9,av10,av11,av12);
        
       
        
        
    }
}
   