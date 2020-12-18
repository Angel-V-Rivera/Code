################################################################################
#                             Lonely Journey                                   #
#                                                                              #
# PROGRAMMER:       Angel Rivera                                               #
# CLASS:            CG120                                                      #
# ASSIGNMENT:       Final Project                                              #
# INSTRUCTOR:       Dean Zeller                                                #
# TA:               Robert Carver                                              #
# SUBMISSION DATE:  November 30, 2018                                          #
#                                                                              #
# DESCRIPTION:                                                                 #
# This is the interactive story of Timmy the last dinosaur on Earth.           #
#                                                                              #
# EXTERNAL FILES:                                                              #
# This program references the following files for the story:                   #
#     Dinosaur.py, the Dinosaur object, used as the main character             #
#     DinosaurIv.py, the Dinosaur object, used as the main character           #
#     EarthScenary.py, the EarthScenery function, serves as the story scenery  #
#     defstart the Scenarystart funtion, serves as the story scenery           #
#     defEast the ScenaryEast funtion, serves as the story scenery             #
#     defNorth the ScenaryNorth funtion, serves as the story scenery           #
#     defSouth the ScenarySouth funtion, serves as the story scenery           #
#     defWest the scenaryWest funtion, serves as the story scenary             #
# COPYRIGHT:                                                                   #
# This program is (c) 2018 Angel Rivea and Dean Zeller. This is original       #
# work, without use of outside sources.                                        #
################################################################################
from tkinter import *
import random
from Dinosaur import Dinousaur
from DinosaurIv import DinousaurIv
from defstart import Scenarystart
from defEast import ScenaryEast
from defNorth import scenaryNorth
from defSouth import scenarysouth
from defWest import ScenaryWest
c = Canvas(width=800,height=700,bg="white")
c.pack(expand=YES, fill=BOTH)

Scenarystart(c)
c.update()
c.after(1000)
c.update()

c.create_text(125,50, text="This is the interactive story of Timmy, the T-rex", tag="annotation")
c.create_text(150,65, text="During the animation you will decide were Timmy goes.", tag="annotation")
c.create_text(150,80, text="be carefull your choices can have serious consequences.", tag="annotation")
c.create_text(20,350, text="West", tag="annotation")
c.create_text(400,20, text="North.", tag="annotation")
c.create_text(400,680, text="South", tag="annotation")
c.create_text(750,350, text="East.", tag="annotation")
Timmy = Dinousaur(c, name="Timmy")
Timmy.draw()
Timmy.moveRight(275)
Timmy.moveDown(180)
print("where do you want to go?")
direction = input("which direction? => ")

if(direction=="East"):
    for i in range(220):
        Timmy.moveRight(2,afterDelay=20)
    c.delete(ALL)
    ScenaryEast(c)
    Timmy = Dinousaur(c, name="Timmy")
    Timmy.draw()
    Timmy.moveLeft(20)
    Timmy.moveDown(80)
    for i in range(170):
        Timmy.moveRight(2,afterDelay=20)
    Plant=DinousaurIv(c, name="Plant")
    Plant.draw3()
    Plant.moveRight(600)
    Plant.moveDown(175)
    c.create_text(200,100, text="It seems that Timmy found a strange plant", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(200,100, text="Timmy has not eaten in days and is hungry", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(100,100, text="should he eat it?", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    print("yes or no?")
    eat=input("? => ")
    if(eat=="yes"):
        for i in range(115):
            Timmy.moveRight(2,afterDelay=20)
        c.delete("Plant")
        c.delete("annotation")
        c.create_text(200,100, text="ohh no, Timmy is high", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        colors=["red","green","blue","brown","purple","yellow","pink","gray","white"]
        for i in range(350):
            color=random.choice(colors)
            Timmy.changeC(color,color,2,2)
        c.delete("annotation")
        Timmy.changeC("black","black")
        c.create_text(200,100, text="ohh no you killed Timmy good job", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete(ALL)
        creditText="""
        Lonely Journey
        by
        Angel Rivera


        Completed for my final project.

               
        PLOT and DIALOG
        Angel Rivera

        SCENERY DESIGN
        Angel Rivera

        CHARACTER DESIGN
        Angel Rivera

        (c)2018 Angel Rivera Productions, all rights reserved."""

        credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                                justify=CENTER)
        for i in range(1300):
            c.move(credits,0,-1)
            c.after(10)
            c.update()   
        
    elif(eat=="no"):
        c.delete("annotation")
        c.create_text(200,100, text="Okay, Okay", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete("Timmy")
        Timmy = DinousaurIv(c, name="Timmy")
        Timmy.draw2()
        Timmy.moveRight(360)
        Timmy.moveDown(80)
        for i in range(300):
            Timmy.moveLeft(2,afterDelay=20)
        c.delete("annotation")
        c.create_text(200,100, text="you are not my mother Susan!!", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete("Timmy")
        Timmy = Dinousaur(c, name="Timmy")
        Timmy.draw()
        Timmy.moveLeft(80)
        Timmy.moveDown(80)
        for i in range(320):
            Timmy.moveRight(2,afterDelay=20)
        c.delete("Plant")
        c.delete("annotation")
        c.create_text(200,100, text="ohh no, Timmy is high", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        colors=["red","green","blue","brown","purple","yellow","pink","gray","white"]
        for i in range(350):
            color=random.choice(colors)
            Timmy.changeC(color,color,2,2)
        c.delete("annotation")
        Timmy.changeC("black","black")
        c.delete("annotation")
        c.create_text(200,100, text="and now he is dead", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
    c.delete(ALL)
    creditText="""
    Lonely Journey
    by
    Angel Rivera


    Completed for my final project.

           
    PLOT and DIALOG
    Angel Rivera

    SCENERY DESIGN
    Angel Rivera

    CHARACTER DESIGN
    Angel Rivera

    (c)2018 Angel Rivera Productions, all rights reserved."""

    credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                            justify=CENTER)
    for i in range(1300):
        c.move(credits,0,-1)
        c.after(10)
        c.update()
elif(direction =="West"):
    c.delete("Timmy")
    Timmy = DinousaurIv(c, name="Timmy")
    Timmy.draw2()
    Timmy.moveRight(275)
    Timmy.moveDown(180)
    for i in range(220):
        Timmy.moveLeft(2, afterDelay=20)
    c.delete(ALL)
    ScenaryWest(c)
    Timmy = DinousaurIv(c, name="Timmy")
    Timmy.draw2()
    Timmy.moveRight(600)
    Timmy.moveLeft(20)
    Timmy.moveDown(80)
    for i in range(220):
        Timmy.moveLeft(2, afterDelay=20)
    c.create_text(200,100, text="it seems to be a dead end", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(200,100, text="do you want to go back?", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    anwser=input("? =>")
    if(anwser=="yes"):
        c.delete("Timmy")
        Timmy = Dinousaur(c, name="Timmy")
        Timmy.draw()
        Timmy.moveLeft(20)
        Timmy.moveDown(80)
        Timmy.moveRight(140)
        for i in range(50):
            Timmy.moveRight(2, afterDelay=20)
        c.create_rectangle((770,0),(800,330),fill="brown")
        c.delete("annotation")
        c.create_text(200,100, text="Ooh no it is a trap", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete("annotation")
        c.create_text(200,100, text="you can save Timmy by anwsering correctly", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete("annotation")
        c.create_text(200,100, text="Which is the correct name of the class?", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        print("choose carefully")
        num = input("CS102,CS120, or CS122 => ")
        if(num=="CS120"):
            c.delete("annotation")
            c.create_text(200,100, text="That is correct congratulations you won", tag="annotation")
            c.update()
            c.after(3000)
            c.update()
            c.delete(ALL)
            creditText="""
            Lonely Journey
            by
            Angel Rivera


            Completed for my final project.

                   
            PLOT and DIALOG
            Angel Rivera

            SCENERY DESIGN
            Angel Rivera

            CHARACTER DESIGN
            Angel Rivera

            (c)2018 Angel Rivera Productions, all rights reserved."""

            credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                                    justify=CENTER)
            for i in range(1300):
                c.move(credits,0,-1)
                c.after(10)
                c.update()
        else:
            c.delete("annotation")
            c.create_text(200,100, text="Sorry that is incorrect, you lose", tag="annotation")
            c.update()
            c.after(3000)
            c.update()
            c.delete("annotation")
            c.create_text(200,100, text="Now timmy will drown because of you", tag="annotation")
            c.update()
            c.after(3000)
            c.update()
            c.delete("annotation")
            c.create_text(200,100, text="Gooodbye", tag="annotation")
            c.update()
            c.after(3000)
            c.update()
            a=1
            for i in range(200):
                c.create_rectangle((30,330),(770,329+a),fill="lightblue")
                c.update()
                c.after(50)
                c.update()
                a+=-1
            c.delete(ALL)
            creditText="""
            Lonely Journey
            by
            Angel Rivera


            Completed for my final project.

                   
            PLOT and DIALOG
            Angel Rivera

            SCENERY DESIGN
            Angel Rivera

            CHARACTER DESIGN
            Angel Rivera

            (c)2018 Angel Rivera Productions, all rights reserved."""

            credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                                    justify=CENTER)
            for i in range(1300):
                c.move(credits,0,-1)
                c.after(10)
                c.update()    
    elif(anwser=="no"):
        c.create_rectangle((770,0),(800,330),fill="brown")
        c.delete("annotation")
        c.create_text(200,100, text="Ooh no it is a trap", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete("annotation")
        c.create_text(200,100, text="you can save Timmy by anwsering correctly", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete("annotation")
        c.create_text(200,100, text="Which is the correct name of the class?", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        num = input("CS102,CS120, or CS122? => ")
        if(num=="CS120"):
            c.delete("annotation")
            c.create_text(200,100, text="That is correct congratulations you won", tag="annotation")
            c.update()
            c.after(3000)
            c.update()
            c.delete(ALL)
            creditText="""
            Lonely Journey
            by
            Angel Rivera


            Completed for my final project.

                   
            PLOT and DIALOG
            Angel Rivera

            SCENERY DESIGN
            Angel Rivera

            CHARACTER DESIGN
            Angel Rivera

            (c)2018 Angel Rivera Productions, all rights reserved."""

            credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                                    justify=CENTER)
            for i in range(1300):
                c.move(credits,0,-1)
                c.after(10)
                c.update()
        else:
            c.delete("annotation")
            c.create_text(200,100, text="Sorry that is incorrect, you lose", tag="annotation")
            c.update()
            c.after(3000)
            c.update()
            c.delete("annotation")
            c.create_text(200,100, text="Now timmy will drown because of you", tag="annotation")
            c.update()
            c.after(3000)
            c.update()
            c.delete("annotation")
            c.create_text(200,100, text="Gooodbye", tag="annotation")
            c.update()
            c.after(3000)
            c.update()
            a=1
            for i in range(200):
                c.create_rectangle((30,330),(770,329+a),fill="lightblue")
                c.update()
                c.after(50)
                c.update()
                a+=-1
            c.delete(ALL)
            creditText="""
            Lonely Journey
            by
            Angel Rivera


            Completed for my final project.

                   
            PLOT and DIALOG
            Angel Rivera

            SCENERY DESIGN
            Angel Rivera

            CHARACTER DESIGN
            Angel Rivera

            (c)2018 Angel Rivera Productions, all rights reserved."""

            credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                                    justify=CENTER)
            for i in range(1300):
                c.move(credits,0,-1)
                c.after(10)
                c.update()
elif(direction=="North"):
    for i in range (200):
        Timmy.moveUp(2,afterDelay=25)
    c.delete(ALL)
    scenaryNorth(c)
    Timmy = Dinousaur(c, name="Timmy")
    Timmy.draw()
    Timmy.moveLeft(20)
    Timmy.moveDown(80)
    for i in range(20):
        Timmy.moveRight(2,afterDelay=25)
    Timmy1 = DinousaurIv(c, name="Timmy1")
    Timmy1.draw2()
    Timmy1.moveLeft(20)
    Timmy1.moveDown(80)
    Timmy1.moveRight(200)
    Timmy1.changeC("red","red")
    Timmy2 = DinousaurIv(c, name="Timmy2")
    Timmy2.draw2()
    Timmy2.moveLeft(20)
    Timmy2.moveDown(80)
    Timmy2.moveRight(350)
    Timmy2.changeC("blue","blue")
    Timmy3 = DinousaurIv(c, name="Timmy3")
    Timmy3.draw2()
    Timmy3.moveLeft(20)
    Timmy3.moveDown(80)
    Timmy3.moveRight(500)
    Timmy3.changeC("white","white")
    c.create_text(200,100, text="look there are some other dinosaurs", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(200,100, text="but wait they seem different", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(400,100, text="they may be dangerous, to make sure Timmy remains safe lets try to blend with them", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(400,100, text="write the correct color of the dinousar in front of Timmy", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(400,100, text="so he can change color and keep moving", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    print("what color does Timmy needs to change?")
    a=input("=> ")
    if(a=="red"):
        Timmy.changeC("red","red")
        for i in range(125):
            Timmy.moveRight(2,afterDelay=20)
        c.delete("annotation")
        c.create_text(200,100, text="Excellent let's keep moveing", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete("annotation")
        print("what color does Timmy needs to change?")
        b=input("=> ")
        if(b=="blue"):
            Timmy.changeC("blue","blue")
            for i in range(75):
                Timmy.moveRight(2,afterDelay=20)
            c.delete("annotation")
            c.create_text(200,100, text="Excellent let's keep moveing", tag="annotation")
            c.update()
            c.after(3000)
            c.update()
            c.delete("annotation")
            print("what color does Timmy needs to change?")
            d=input("=> ")
            if(d=="white"):
                Timmy.changeC("white","white")
                for i in range(80):
                    Timmy.moveRight(2,afterDelay=20)
                c.delete("annotation")
                c.create_text(200,100, text="Congratulations you won", tag="annotation")
                c.update()
                c.after(3000)
                c.update()
                c.delete(ALL)
                creditText="""
                Lonely Journey
                by
                Angel Rivera


                Completed for my final project.

                       
                PLOT and DIALOG
                Angel Rivera

                SCENERY DESIGN
                Angel Rivera

                CHARACTER DESIGN
                Angel Rivera

                (c)2018 Angel Rivera Productions, all rights reserved."""

                credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                                        justify=CENTER)
                for i in range(1300):
                    c.move(credits,0,-1)
                    c.after(10)
                    c.update()
            else:
                for i in range(30):
                    Timmy3.moveLeft(2, afterDelay=20)
                c.delete("Timmy")
                c.delete("annotation")
                c.create_text(200,100, text="Oh!! god they killed Timmy", tag="annotation")
                c.update()
                c.after(3000)
                c.update()
                c.delete("annotation")
                c.create_text(200,100, text="you lose", tag="annotation")
                c.update()
                c.after(3000)
                c.update()
                c.delete(ALL)
                creditText="""
                Lonely Journey
                by
                Angel Rivera


                Completed for my final project.

                       
                PLOT and DIALOG
                Angel Rivera

                SCENERY DESIGN
                Angel Rivera

                CHARACTER DESIGN
                Angel Rivera

                (c)2018 Angel Rivera Productions, all rights reserved."""

                credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                                        justify=CENTER)
                for i in range(1300):
                    c.move(credits,0,-1)
                    c.after(10)
                    c.update()
        
        else:
            for i in range(30):
                    Timmy2.moveLeft(2, afterDelay=20)
            c.delete("Timmy")
            c.delete("annotation")
            c.create_text(200,100, text="Oh!! god they killed Timmy", tag="annotation")
            c.update()
            c.after(3000)
            c.update()
            c.delete("annotation")
            c.create_text(200,100, text="you lose", tag="annotation")
            c.update()
            c.after(3000)
            c.update()
            c.delete(ALL)
            creditText="""
            Lonely Journey
            by
            Angel Rivera


            Completed for my final project.

                   
            PLOT and DIALOG
            Angel Rivera

            SCENERY DESIGN
            Angel Rivera

            CHARACTER DESIGN
            Angel Rivera

            (c)2018 Angel Rivera Productions, all rights reserved."""

            credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                                    justify=CENTER)
            for i in range(1300):
                c.move(credits,0,-1)
                c.after(10)
                c.update()
        
    else:
        for i in range(80):
                    Timmy1.moveLeft(2, afterDelay=20)
        c.delete("Timmy")
        c.delete("annotation")
        c.create_text(200,100, text="Oh!! god they killed Timmy", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete("annotation")
        c.create_text(200,100, text="you lose", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete(ALL)
        creditText="""
        Lonely Journey
        by
        Angel Rivera


        Completed for my final project.

               
        PLOT and DIALOG
        Angel Rivera

        SCENERY DESIGN
        Angel Rivera

        CHARACTER DESIGN
        Angel Rivera

        (c)2018 Angel Rivera Productions, all rights reserved."""

        credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                                justify=CENTER)
        for i in range(1300):
            c.move(credits,0,-1)
            c.after(10)
            c.update()
        
    
elif(direction == "South"):
    c.delete("Timmy")
    Timmy = DinousaurIv(c, name="Timmy")
    Timmy.draw2()
    Timmy.moveRight(275)
    Timmy.moveDown(180)
    for i in range(220):
        Timmy.moveDown(2, afterDelay=20)
    c.delete(ALL)
    scenarysouth(c)
    Timmy = DinousaurIv(c, name="Timmy")
    Timmy.draw2()
    Timmy.moveRight(600)
    Timmy.moveLeft(20)
    Timmy.moveDown(80)
    for i in range(180):
        Timmy.moveLeft(2, afterDelay=20)
    dinousaurs=[]
    for i in range (4):
        x= random.randrange(0,60)
        y= random.randrange(0,10)
        Timmo = Dinousaur(c, name="Timmo"+str(i))
        Timmo.draw()
        Timmo.moveLeft(20)
        Timmo.moveDown(80)
        Timmo.moveLeft(x)
        Timmo.moveDown(y)
        dinousaurs.append(Timmo)
        dinousaurs[i].changeC("red","red")
    c.create_text(200,100, text="look there are some other dinosaurs", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(200,100, text="but wait they seem different", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(200,100, text="they may be dangerous, but they seem to waiting", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(200,100, text="to test your knowledge", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(200,100, text="so awnser this true/false question and Timmy wiil be ok", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    c.delete("annotation")
    c.create_text(250,100, text="pineapple belongs on pizza?", tag="annotation")
    c.update()
    c.after(3000)
    c.update()
    print("true or false?")
    a=input("=> ")
    if(a=="true"):
        for j in range(60):
            for i in range(4):
                dinousaurs[i].moveLeft(2,afterDelay=20)
        c.delete("annotation")
        c.create_text(200,100, text="look they are leaving, you saved Timmy's life", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete("annotation")
        c.create_text(200,100, text="Congratulations you won", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete(ALL)
        creditText="""
        Lonely Journey
        by
        Angel Rivera


        Completed for my final project.

               
        PLOT and DIALOG
        Angel Rivera

        SCENERY DESIGN
        Angel Rivera

        CHARACTER DESIGN
        Angel Rivera

        (c)2018 Angel Rivera Productions, all rights reserved."""

        credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                                justify=CENTER)
        for i in range(1300):
            c.move(credits,0,-1)
            c.after(10)
            c.update()
    if(a=="false"):
        c.delete("annotation")
        c.create_text(200,100, text="Oh not they seem angry", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        for j in range(65):
            for i in range(4):
                dinousaurs[i].moveRight(4,afterDelay=20)
        c.delete("Timmy")
        c.delete("annotation")
        c.create_text(200,100, text="Oh!! god they killed Timmy", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete("annotation")
        c.create_text(200,100, text="you lose", tag="annotation")
        c.update()
        c.after(3000)
        c.update()
        c.delete(ALL)
        creditText="""
        Lonely Journey
        by
        Angel Rivera


        Completed for my final project.

               
        PLOT and DIALOG
        Angel Rivera

        SCENERY DESIGN
        Angel Rivera

        CHARACTER DESIGN
        Angel Rivera

        (c)2018 Angel Rivera Productions, all rights reserved."""

        credits = c.create_text(200,800,text=creditText, font=("Courier",9),
                                justify=CENTER)
        for i in range(1300):
            c.move(credits,0,-1)
            c.after(10)
            c.update()
        
      
    

         




