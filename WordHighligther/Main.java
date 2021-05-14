package com.company;

import java.awt.*;
import javax.swing.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Main {

    public  JFrame f;
    JTextArea area;
    JTextField FiledSelected;
    JTextField StringToMatch;

    class MyhHighlightPainter extends DefaultHighlighter.DefaultHighlightPainter {
        public MyhHighlightPainter(Color color) {
            super(color);
        }
    }
    Highlighter.HighlightPainter myHighlightPainter = new MyhHighlightPainter(Color.blue);
    public void removeHighlights (JTextComponent textcomp){
        Highlighter hilite = textcomp.getHighlighter();
        Highlighter.Highlight[] hilites = hilite.getHighlights();
        for (int i=0; i<hilites.length; i++){
            if(hilites[i].getPainter() instanceof MyhHighlightPainter){
                hilite.removeHighlight(hilites[i]);
            }
        }
    }

    public void  highlight(JTextComponent textComp, String pattern){
        try{
            Highlighter hilite = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0,doc.getLength());
            int pos = 0;
            while ((pos=text.toUpperCase().indexOf(pattern.toUpperCase(),pos))>=0){
                hilite.addHighlight(pos, pos+pattern.length(), myHighlightPainter);
                pos += pattern.length();
            }
        }catch (Exception e){
            System.out.print("It seems something when wrong");
        }
    }

    public void intro()
    {
        f=new JFrame();
        f.setSize(1000,500);
        f.getContentPane().setBackground(new java.awt.Color(200, 200, 200));
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);

        JLabel l1;
        l1=new JLabel("File Contents");
        l1.setFont (l1.getFont ().deriveFont (12.0f));
        l1.setBounds(10,0, 300,50);
        f.add(l1);

        area=new JTextArea();
        area.setEditable(false);
        area.setBounds(20,50, 420,200);

        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(20,50, 420,200);
        f.getContentPane().add(scroll);


        FiledSelected=new JTextField();
        FiledSelected.setBounds(500,50, 200,30);
        FiledSelected.setEditable(false);
        f.add(FiledSelected);
        f.revalidate();
        f.repaint();

        JButton Select=new JButton("Select");
        Select.setFont (l1.getFont ().deriveFont (14.0f));
        Select.setBounds(720,50,80,30);
        Select.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String FilePath = "";
                String actual="";
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Specify a file to save");

                int userSelection = fileChooser.showSaveDialog(f);

                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                    FilePath = fileToSave.getAbsolutePath();
                }
                Path fileName = Path.of(FilePath);
                try {
                    actual = Files.readString(fileName);
                }
                catch(IOException ev) {
                    System.out.print("Selection cancelled by user");
                }
                area.append(actual.replaceAll("(.{70})", "$1\n"));
                FiledSelected.setText(FilePath);
            }
        });
        f.add(Select);

        StringToMatch=new JTextField();
        StringToMatch.setBounds(500,100, 200,30);
        f.add(StringToMatch);

        JButton Highlight=new JButton("Highlight");
        Highlight.setFont (l1.getFont ().deriveFont (14.0f));
        Highlight.setBounds(720,100,100,30);
        Highlight.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                removeHighlights(area);
                String WordTofind = StringToMatch.getText();
                highlight(area,WordTofind);
            }
        });
        f.add(Highlight);

        JButton Clear =new JButton("Clear");
        Clear.setFont (l1.getFont ().deriveFont (14.0f));
        Clear.setBounds(720,150,80,30);
        Clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                area.setText("");
                StringToMatch.setText("");
                FiledSelected.setText("");
            }
        });
        f.add(Clear);


        JButton Close =new JButton("Close");
        Close.setFont (l1.getFont ().deriveFont (14.0f));
        Close.setBounds(810,150,80,30);
        Close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        f.add(Close);
        f.revalidate();
        f.repaint();
    }
}
