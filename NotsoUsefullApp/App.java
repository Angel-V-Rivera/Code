import java.util.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
public class App 
{
    public  JFrame f;
/*******************************************************************************
* intro                                                                        *
*                                                                              *
*******************************************************************************/
    public void intro()
    {
       f=new JFrame();
       f.setSize(500,900);
       f.getContentPane().setBackground(new java.awt.Color(204, 166, 166)); 
       f.setLocationRelativeTo(null);
       f.setLayout(null);
       f.setVisible(true); 
       JLabel l1,l2;
       
       l1=new JLabel("Multipurpose App");
       l1.setFont (l1.getFont ().deriveFont (34.0f));
       l1.setBounds(100,100, 300,100);  
       l2=new JLabel("Welcome to my second App on Java.");
       l2.setFont (l2.getFont ().deriveFont (24.0f));
       l2.setBounds(50,200, 450,100);  
       f.add(l1); f.add(l2);
       
       JLabel image = new JLabel();
       f.add(image);
       image.setIcon(new ImageIcon("download.png"));
       image.setBounds(100,300, 400,150);
       
       JButton MainMenu=new JButton("Get Started");  
       MainMenu.setBounds(200,550,100,50);
       
       MainMenu.addActionListener(new ActionListener(){  
           public void actionPerformed(ActionEvent e){
              f.getContentPane().removeAll();
              f.repaint();
              mainMenu();
           }  
       }); 
       f.add(MainMenu);
       f.revalidate();
       f.repaint();
    }
/*******************************************************************************
* mainMenu                                                                     *
*                                                                              *
*******************************************************************************/
    JButton Develop;
    JLabel image;
    public void mainMenu()
    {
       image = new JLabel();
       f.add(image);
       image.setIcon(new ImageIcon("app.jpg"));
       image.setBounds(100,550, 400,200);
       
       Develop=new JButton("Develop");
       Develop.setFont (Develop.getFont ().deriveFont (14.0f));
       Develop.setBounds(260,760,120,30);
       Develop.addActionListener(new ActionListener(){  
           public void actionPerformed(ActionEvent e)
           {
             image.setIcon(new ImageIcon("dtt.jpeg"));
             f.remove(Develop);
             f.revalidate();
             f.repaint();
           }  
       }); 
       f.add(Develop);
       f.revalidate();
       f.repaint();
        
       JLabel l1;
       l1=new JLabel("Choose a Function");
       l1.setFont (l1.getFont ().deriveFont (24.0f));
       l1.setBounds(130,30, 300,100);
       f.add(l1);
       f.revalidate();
       f.repaint();
       
       JButton Sorting=new JButton("Sorting");
       Sorting.setFont (l1.getFont ().deriveFont (24.0f));
       Sorting.setBounds(140,150,230,50);
       Sorting.addActionListener(new ActionListener(){  
           public void actionPerformed(ActionEvent e){
              f.getContentPane().removeAll();
              f.repaint();
              Sorting();
           }  
       }); 
       f.add(Sorting);
       f.revalidate();
       f.repaint();
       
       JButton roman=new JButton("Int to roman");
       roman.setFont (l1.getFont ().deriveFont (24.0f));
       roman.setBounds(140,220,230,50);
       roman.addActionListener(new ActionListener(){  
           public void actionPerformed(ActionEvent e){
              f.getContentPane().removeAll();
              f.repaint();
              introman();
           }  
       }); 
       f.add(roman);
       f.revalidate();
       f.repaint();
       
       JButton cs1=new JButton("Frequency");
       cs1.setFont (l1.getFont ().deriveFont (24.0f));
       cs1.setBounds(140,290,230,50);
       cs1.addActionListener(new ActionListener(){  
           public void actionPerformed(ActionEvent e){
              f.getContentPane().removeAll();
              f.repaint();
              frequency();
           }  
       }); 
       f.add(cs1);
       f.revalidate();
       f.repaint();
       
       JButton cs2=new JButton("Temperature");
       cs2.setFont (l1.getFont ().deriveFont (24.0f));
       cs2.setBounds(140,360,230,50);
       cs2.addActionListener(new ActionListener(){  
           public void actionPerformed(ActionEvent e){
              f.getContentPane().removeAll();
              f.repaint();
              temperature();
           }  
       }); 
       f.add(cs2);
       f.revalidate();
       f.repaint();
       
       JButton cs3=new JButton("DNA Generator");
       cs3.setFont (l1.getFont ().deriveFont (24.0f));
       cs3.setBounds(140,430,230,50);
       cs3.addActionListener(new ActionListener(){  
           public void actionPerformed(ActionEvent e){
              f.getContentPane().removeAll();
              f.repaint();
              DNA();
           }  
       }); 
       f.add(cs3);
       f.revalidate();
       f.repaint();
       
    }
    
/*******************************************************************************
* Sorting                                                                      *
*                                                                              *
*******************************************************************************/    
    JTextField text1;
    int num;
    JTextArea area;
    JTextArea sorted;
    ArrayList<Integer> nums = new ArrayList<Integer>();
    public void Sorting()
    {
       JLabel l1,l2;
       l1=new JLabel("Sorting");
       l1.setFont (l1.getFont ().deriveFont (34.0f));
       l1.setBounds(200,30, 300,100);
       l2=new JLabel("Here you can sort any set of numbers");
       l2.setFont (l2.getFont ().deriveFont (14.0f));
       l2.setBounds(120,90, 450,100);  
       f.add(l1); f.add(l2);
       f.revalidate();
       f.repaint();
       
       JLabel l3;
       l3=new JLabel("Enter a number one by one");
       l3.setFont (l3.getFont ().deriveFont (14.0f));
       l3.setBounds(40,130, 300,100);
       f.add(l3);
       f.revalidate();
       f.repaint();
       
         
       text1=new JTextField();  
       text1.setBounds(40,200, 200,30);
       f.add(text1);
       f.revalidate();
       f.repaint();
       
       JButton Add=new JButton("Add");
       Add.setFont (l1.getFont ().deriveFont (14.0f));
       Add.setBounds(250,200,80,30);
       Add.addActionListener(new ActionListener(){  
           public void actionPerformed(ActionEvent e)
           {
             sorted.setText("");
             String number=text1.getText();
             num=Integer.parseInt(number);
             nums.add(num);
             text1.setText("");
             area.setText("");
             String fix="";
             fix=nums+"";
             area.append(fix.replaceAll("(.{70})", "$1\n"));
             text1.requestFocus();
           }  
       }); 
       f.add(Add);
       f.revalidate();
       f.repaint();
       
       JLabel l4;
       l4=new JLabel("Numbers:");
       l4.setFont (l4.getFont ().deriveFont (14.0f));
       l4.setBounds(40,200, 300,100);
       f.add(l4);
       f.revalidate();
       f.repaint();
       
       area=new JTextArea();
       area.setEditable(false);
       area.setBounds(40,260, 300,100);  
       f.add(area); 
      
       
       JButton sort=new JButton("Sort");
       sort.setFont (l1.getFont ().deriveFont (14.0f));
       sort.setBounds(40,360, 80,30);
       sort.addActionListener(new ActionListener(){  
           public void actionPerformed(ActionEvent e){
              Collections.sort(nums);
              String fix="";
              fix=nums+"";
              sorted.append(fix.replaceAll("(.{70})", "$1\n"));
              nums.clear();
           }  
       }); 
       f.add(sort);
       f.revalidate();
       f.repaint();
       
       JLabel l5;
       l5=new JLabel("Sorted Numbers:");
       l5.setFont (l5.getFont ().deriveFont (14.0f));
       l5.setBounds(40,360, 300,100);
       f.add(l5);
       f.revalidate();
       f.repaint();
       
       sorted=new JTextArea();  
       sorted.setBounds(40,420, 300,100);
       sorted.setEditable(false);
       f.add(sorted);
       
       JButton Mainmenu=new JButton("Go back");
       Mainmenu.setFont (l1.getFont ().deriveFont (14.0f));
       Mainmenu.setBounds(40,530, 100,30);
       Mainmenu.addActionListener(new ActionListener(){  
           public void actionPerformed(ActionEvent e){
              f.getContentPane().removeAll();
              f.repaint();
              mainMenu();
           }  
       }); 
       f.add(Mainmenu);
       f.revalidate();
       f.repaint();
    }
    
/*******************************************************************************
* int to roman                                                                 *
*                                                                              *
*******************************************************************************/
String roman="";
public void introman()
{
    JLabel l1,l2;
    l1=new JLabel("Int to Roman");
    l1.setFont (l1.getFont ().deriveFont (34.0f));
    l1.setBounds(170,30, 300,100);
    l2=new JLabel("Trasform any number into Roman numbers (1-3999)");
    l2.setFont (l2.getFont ().deriveFont (14.0f));
    l2.setBounds(80,90, 450,100);  
    f.add(l1); f.add(l2);
    f.revalidate();
    f.repaint();
    
    JLabel l3;
    l3=new JLabel("Enter a number ");
    l3.setFont (l3.getFont ().deriveFont (14.0f));
    l3.setBounds(40,130, 300,100);
    f.add(l3);
    f.revalidate();
    f.repaint();
    
    text1=new JTextField();  
    text1.setBounds(40,200, 200,30);
    f.add(text1);
    f.revalidate();
    f.repaint();
    text1.requestFocus();
    
    JButton Convert=new JButton("Convert");
    Convert.setFont (l1.getFont ().deriveFont (14.0f));
    Convert.setBounds(250,200,120,30);
    Convert.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e)
        {
            String number=text1.getText();
            num=Integer.parseInt(number);
            roman="";
            area.setText("");
            while(num>=1000)
            {
                roman+="M";
                num-=1000;
            }
            while(num>=900)
            {
                roman+="CM";
                num-=900;
            }
            while(num>=500)
            {
                roman+="D";
                num-=500;
            }
            while(num>=400)
            {
                roman+="CD";
                num-=400;
            }
            while(num>=100)
            {
                roman+="C";
                num-=100;
            }
            while(num>=90)
            {
                roman+="XC";
                num-=90;
            }
            while(num>=50)
            {
                roman+="L";
                num-=50;
            }
            while(num>=40)
            {
                roman+="XL";
                num-=40;
            }
            while(num>=10)
            {
                roman+="X";
                num-=10;
            }
            while(num>=9)
            {
                roman+="IX";
                num-=9;
            }
            while(num>=5)
            {
                roman+="V";
                num-=5;
            }
            while(num>=4)
            {
                roman+="IV";
                num-=4;
            }
            while(num>=1)
            {
                roman+="I";
                num-=1;
            }
            area.append(roman);
            
            
        }  
    }); 
    f.add(Convert);
    f.revalidate();
    f.repaint();
    
    JLabel l4;
    l4=new JLabel("Roman numbers:");
    l4.setFont (l4.getFont ().deriveFont (14.0f));
    l4.setBounds(40,200, 300,100);
    f.add(l4);
    f.revalidate();
    f.repaint();
    
    area=new JTextArea();
    area.setEditable(false);
    area.setBounds(40,260, 300,100);  
    f.add(area);
    
    JButton Mainmenu=new JButton("Go back");
    Mainmenu.setFont (l1.getFont ().deriveFont (14.0f));
    Mainmenu.setBounds(40,530, 100,30);
    Mainmenu.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            f.getContentPane().removeAll();
            f.repaint();
            mainMenu();
        }  
    }); 
    f.add(Mainmenu);
    f.revalidate();
    f.repaint();
}
/*******************************************************************************
* frequency                                                                    *
*                                                                              *
*******************************************************************************/
String frequenzy="";
public void frequency()
{
   
   JLabel l1,l2;
   l1=new JLabel("Frequency of Characters");
   l1.setFont (l1.getFont ().deriveFont (34.0f));
   l1.setBounds(60,30, 420,100);
   l2=new JLabel("Get the frequency of all characters on a string");
   l2.setFont (l2.getFont ().deriveFont (14.0f));
   l2.setBounds(40,90, 450,100);  
   f.add(l1); f.add(l2);
   f.revalidate();
   f.repaint(); 
   
   JLabel l3;
   l3=new JLabel("Enter any String");
   l3.setFont (l3.getFont ().deriveFont (14.0f));
   l3.setBounds(40,130, 300,100);
   f.add(l3);
   f.revalidate();
   f.repaint();
   
   
   text1=new JTextField();  
   text1.setBounds(40,200, 200,30);
   f.add(text1);
   f.revalidate();
   f.repaint();
   text1.requestFocus();
   
   JButton Analyze=new JButton("Analyze");
   Analyze.setFont (l1.getFont ().deriveFont (14.0f));
   Analyze.setBounds(250,200,110,30);
   Analyze.addActionListener(new ActionListener(){  
       public void actionPerformed(ActionEvent e)
       {
           String frequenzy=text1.getText();
           ArrayList<String> ar = new ArrayList<String>();
           area.setText("");
           ar.clear();
           int[] freq = new int[frequenzy.length()];  
           int i, j;  
           char string[] = frequenzy.toCharArray();  
           for(i = 0; i <frequenzy.length(); i++) {  
               freq[i] = 1;  
               for(j = i+1; j <frequenzy.length(); j++) {  
                   if(string[i] == string[j]) {  
                       freq[i]++;  
                       string[j] = '0';  
                   }  
               }  
           } 
           
           String a="";
           for(i = 0; i <freq.length; i++) {  
               if(string[i] != ' ' && string[i] != '0')
               {
                   a=string[i]+""+" "+freq[i]+"";
                   ar.add(a);
               }  
           }
           Collections.sort(ar);
           String fix="";
           fix=ar+"";
           area.append(fix.replaceAll("(.{70})", "$1\n"));
           text1.requestFocus();
       }  
   }); 
   f.add(Analyze);
   f.revalidate();
   f.repaint();
   
   JLabel l4;
   l4=new JLabel("Frequenzy:");
   l4.setFont (l4.getFont ().deriveFont (14.0f));
   l4.setBounds(40,200, 300,100);
   f.add(l4);
   f.revalidate();
   f.repaint();
   
   area=new JTextArea();
   area.setEditable(false);
   area.setBounds(40,260, 300,100);  
   f.add(area);
   
   JButton Mainmenu=new JButton("Go back");
    Mainmenu.setFont (l1.getFont ().deriveFont (14.0f));
    Mainmenu.setBounds(40,530, 100,30);
    Mainmenu.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            f.getContentPane().removeAll();
            f.repaint();
            mainMenu();
        }  
    }); 
    f.add(Mainmenu);
    f.revalidate();
    f.repaint();
}
/*******************************************************************************
* temperature                                                                  *
*                                                                              *
*******************************************************************************/
JTextField text2;
double cel=0;
double fare=0;
DecimalFormat df = new DecimalFormat("####0.00");
public void temperature()
{
    image = new JLabel();
    f.add(image);
    image.setBounds(100,270, 400,200);
    
   JLabel l1,l2;
   l1=new JLabel("Temperature converter");
   l1.setFont (l1.getFont ().deriveFont (34.0f));
   l1.setBounds(60,30, 420,100);
   l2=new JLabel("Convert °C to °F and °F to °C");
   l2.setFont (l2.getFont ().deriveFont (14.0f));
   l2.setBounds(40,90, 450,100);  
   f.add(l1); f.add(l2);
   f.revalidate();
   f.repaint();
   
   JLabel l3;
   l3=new JLabel("°C");
   l3.setFont (l3.getFont ().deriveFont (14.0f));
   l3.setBounds(40,130, 300,100);
   f.add(l3);
   f.revalidate();
   f.repaint();
   
   JLabel l4;
   l4=new JLabel("°F");
   l4.setFont (l4.getFont ().deriveFont (14.0f));
   l4.setBounds(270,130, 300,100);
   f.add(l4);
   f.revalidate();
   f.repaint();
   
   text1=new JTextField();  
   text1.setBounds(60,165, 100,30);
   f.add(text1);
   f.revalidate();
   f.repaint();
   text1.requestFocus();
   
   text2=new JTextField();  
   text2.setBounds(290,165, 100,30);
   f.add(text2);
   f.revalidate();
   f.repaint();
   
   JButton Convert=new JButton("Convert");
   Convert.setFont (l1.getFont ().deriveFont (14.0f));
   Convert.setBounds(40,200,110,30);
   Convert.addActionListener(new ActionListener(){  
       public void actionPerformed(ActionEvent e)
       {
          String number=text1.getText();
          cel=Double.parseDouble(number);
          double a=1.8;
          fare=(cel*a)+32;
          text2.setText(fare+"");
          if(cel<=-20)
          image.setIcon(new ImageIcon("ice.jpg"));
          if(cel>=-20&cel<=20)
          image.setIcon(new ImageIcon("cold.jpg"));
          else if(cel>=20&cel<=40)
          image.setIcon(new ImageIcon("warm.jpg"));
          else if(cel>=40&cel<=60)
          image.setIcon(new ImageIcon("hot.jpg"));
          else if(cel>=60)
          image.setIcon(new ImageIcon("hell.jpg"));
       }  
   }); 
   f.add(Convert);
   f.revalidate();
   f.repaint();
   
   JButton Conver2=new JButton("Convert");
   Conver2.setFont (l1.getFont ().deriveFont (14.0f));
   Conver2.setBounds(270,200,110,30);
   Conver2.addActionListener(new ActionListener(){  
       public void actionPerformed(ActionEvent e)
       {
          String number=text2.getText();
          fare=Double.parseDouble(number);
          double a=(5.0/9.0);
          cel=(fare-32)*a;
          
          text1.setText(df.format(cel)+"");
          if(cel<=-20)
          image.setIcon(new ImageIcon("ice.jpg"));
          if(cel>=-20&cel<=20)
          image.setIcon(new ImageIcon("cold.jpg"));
          else if(cel>=20&cel<=40)
          image.setIcon(new ImageIcon("warm.jpg"));
          else if(cel>=40&cel<=60)
          image.setIcon(new ImageIcon("hot.jpg"));
          else if(cel>=60)
          image.setIcon(new ImageIcon("hell.jpg"));
       }  
   }); 
   f.add(Conver2);
   f.revalidate();
   f.repaint();
   
   JButton Mainmenu=new JButton("Go back");
    Mainmenu.setFont (l1.getFont ().deriveFont (14.0f));
    Mainmenu.setBounds(40,530, 100,30);
    Mainmenu.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            f.getContentPane().removeAll();
            f.repaint();
            mainMenu();
        }  
    }); 
    f.add(Mainmenu);
    f.revalidate();
    f.repaint();
}
/*******************************************************************************
* DNA                                                                          *
*                                                                              *
*******************************************************************************/
JTextField text3=new JTextField(); 
JTextField text4=new JTextField(); 
JTextField text5=new JTextField();
public void DNA()
{
   JLabel l1,l2;
   l1=new JLabel("DNA Genrator");
   l1.setFont (l1.getFont ().deriveFont (34.0f));
   l1.setBounds(60,30, 420,100);
   l2=new JLabel("Generate DNA based on weights");
   l2.setFont (l2.getFont ().deriveFont (14.0f));
   l2.setBounds(40,90, 450,100);  
   f.add(l1); f.add(l2);
   f.revalidate();
   f.repaint();
   
   JLabel l3;
   l3=new JLabel("Weights%");
   l3.setFont (l3.getFont ().deriveFont (14.0f));
   l3.setBounds(40,130, 300,100);
   f.add(l3);
   f.revalidate();
   f.repaint();
   
   JLabel l4;
   l4=new JLabel("A's");
   l4.setFont (l3.getFont ().deriveFont (14.0f));
   l4.setBounds(40,170, 300,100);
   f.add(l4);
   f.revalidate();
   f.repaint();
   
   text1=new JTextField();  
   text1.setBounds(65,205, 30,30);
   f.add(text1);
   f.revalidate();
   f.repaint();
   text1.requestFocus();
   
   JLabel l5;
   l5=new JLabel("T's");
   l5.setFont (l3.getFont ().deriveFont (14.0f));
   l5.setBounds(100,170, 300,100);
   f.add(l5);
   f.revalidate();
   f.repaint();
   
   text2=new JTextField();  
   text2.setBounds(125,205, 30,30);
   f.add(text2);
   f.revalidate();
   f.repaint();
  
   
   JLabel l6;
   l6=new JLabel("C's");
   l6.setFont (l3.getFont ().deriveFont (14.0f));
   l6.setBounds(160,170, 300,100);
   f.add(l6);
   f.revalidate();
   f.repaint();
   
   text3=new JTextField();  
   text3.setBounds(185,205, 30,30);
   f.add(text3);
   f.revalidate();
   f.repaint();
   
   JLabel l7;
   l7=new JLabel("G's");
   l7.setFont (l3.getFont ().deriveFont (14.0f));
   l7.setBounds(220,170, 300,100);
   f.add(l7);
   f.revalidate();
   f.repaint();
   
   text4=new JTextField();  
   text4.setBounds(240,205, 30,30);
   f.add(text4);
   f.revalidate();
   f.repaint();
   
   JLabel l8;
   l8=new JLabel("Amount of characters");
   l8.setFont (l3.getFont ().deriveFont (14.0f));
   l8.setBounds(40,235, 300,100);
   f.add(l8);
   f.revalidate();
   f.repaint();
   
   text5=new JTextField();  
   text5.setBounds(40,305, 60,30);
   f.add(text5);
   f.revalidate();
   f.repaint();
   
   JButton Generate=new JButton("Generate");
   Generate.setFont (l1.getFont ().deriveFont (14.0f));
   Generate.setBounds(40,345, 100,30);
   Generate.addActionListener(new ActionListener(){  
       public void actionPerformed(ActionEvent e)
       {
         int a,b,c,d;
         int x=0;
         String as=text1.getText();
         a=Integer.parseInt(as);
         String ts=text2.getText();
         b=Integer.parseInt(ts);
         String cs=text3.getText();
         c=Integer.parseInt(cs);
         String gs=text4.getText();
         d=Integer.parseInt(gs);
         String am=text5.getText();
         x=Integer.parseInt(am);
         
         String dan="";
         int size=x;
         int index=0;
         Random r = new Random();
         while(size>0)
         {
             index=r.nextInt((99 - 0) + 1) + 0;
             if(0<= index & index <a)
                 dan+="A";
             if(a<=index & index <a+b)
                 dan+="T";
             if((a+b)<=index & index <(a+b+c))
                 dan+="C";
             if((a+b+c)<= index & index<(a+b+c+d))
                 dan+="G";
             size--;
         }
         area.append(dan.replaceAll("(.{51})", "$1\n"));
          
       }  
   }); 
   f.add(Generate);
   f.revalidate();
   f.repaint();
   
   JLabel l9;
   l9=new JLabel("DNA");
   l9.setFont (l3.getFont ().deriveFont (14.0f));
   l9.setBounds(40,375, 300,100);
   f.add(l9);
   f.revalidate();
   f.repaint();
   
   area=new JTextArea();
   area.setEditable(false);
   area.setBounds(40,440, 420,300);  
  
   
   JScrollPane scroll = new JScrollPane(area);
   scroll.setBounds(40,440, 420,300);
   f.getContentPane().add(scroll);
   
   JButton Mainmenu=new JButton("Go back");
    Mainmenu.setFont (l1.getFont ().deriveFont (14.0f));
    Mainmenu.setBounds(40,750, 100,30);
    Mainmenu.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            f.getContentPane().removeAll();
            f.repaint();
            mainMenu();
        }  
    }); 
    f.add(Mainmenu);
    f.revalidate();
    f.repaint();
}
}