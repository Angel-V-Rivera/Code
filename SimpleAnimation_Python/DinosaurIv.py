################################################################################
#                           Dinousaur movable object                           #
#                                                                              #
# PROGRAMMER:       Angel Rivera                                               #
# CLASS:            CG120                                                      #
# ASSIGNMENT:       Final Project                                              #
# INSTRUCTOR:       Dean Zeller                                                #
# TA:               Robert Carver                                              #
# SUBMISSION DATE:  November 30, 2018                                          #
#                                                                              #
# DESCRIPTION:                                                                 #
# This is the definition for a Dinousaur movable object.                       #
#                                                                              #
# COPYRIGHT:                                                                   #
# This program is (c) 2018 Angel Rivera and Dean Zeller. This is original      #
# work, without use of outside sources.                                        #
################################################################################
from tkinter import *
import random

class DinousaurIv:

    #####################################################################
    # __init__                                                          #
    #                                                                   #
    # purpose:                                                          #
    #     initialize attributes to parameters                           #
    # parameters:                                                       #
    #     canvas -- the canvas to draw the dinousaur                    #
    #     name   -- name of the dinousaur, used as a tag for animation  #
    #     headColor -- the color of the Dinosaur instance head          #
    #     bodyColor -- the color of the Dinosaur instance body          #
    # return value: none                                                #
    #####################################################################
    def __init__ (self, canvas, name="Blank", headColor = "lightgreen", bodyColor = "lightgreen",
                 eyeColor="skyblue",eyeBallColor="Black"):
        self.c = canvas
        self.name = name
        self.center = 0
        self.middle = 0
        self.headColor = headColor
        self.bodyColor = bodyColor
        self.eyeColor = eyeColor
        self.eyeBallColor = eyeBallColor

    #########################################################################
    # draw2                                                                 #
    #                                                                       #
    # purpose:                                                              #
    #     draws the dinousaur instance with its initial location and colors #
    # parameters:                                                           #
    #     none                                                              #
    # return value: none                                                    #
    #########################################################################
    def draw2(self):
        self.center = 200
        self.middle = 112
        headCoords = ((120,170),(150,150))
        bodyCoords = ((130,200),(150,170))
        leg1Coords = ((135,200),(140,205))
        leg2Coords = ((142.5,200),(147.5,205))
        tailCoords = ((150,190), (150,200),(160,200),(150,190))
        armCoords=((125,177.5),(135.5,182.5))
        arm2Coords=((125,175),(135,180))
        eyeCoords=((128,146.5),(135,154))
        eyeballCoords=((131,150),(132,151))
        self.c.create_rectangle(headCoords, fill=self.headColor,
                            tag = self.name)# head
        self.c.create_rectangle(bodyCoords, fill=self.bodyColor,
                            tag = self.name)# body
        self.c.create_rectangle(leg1Coords, fill=self.bodyColor,
                            tag = self.name)# legs
        self.c.create_rectangle(leg2Coords, fill=self.bodyColor,
                            tag = self.name)# legs
        self.c.create_polygon(tailCoords, fill=self.bodyColor,outline="black",
                            tag = self.name) # tail
        self.c.create_rectangle(armCoords, fill=self.bodyColor,
                            tag = self.name)# arm1
        self.c.create_rectangle(arm2Coords, fill=self.bodyColor,
                            tag = self.name)# arm2
        self.c.create_oval(eyeCoords, fill=self.eyeColor,
                            tag = self.name)# eye
        self.c.create_oval(eyeballCoords, fill=self.eyeBallColor,
                            tag = self.name)# eyeball
        self.c.update()
    #########################################################################
    # draw3                                                                 #
    #                                                                       #
    # purpose:                                                              #
    #     draws the plant instance with its initial location and colors     #
    # parameters:                                                           #
    #     none                                                              #
    # return value: none                                                    #
    #########################################################################
    def draw3(self):
        self.center = 200
        self.middle = 112
        unoCoords = ((95,100),(95,80))
        dosCoords = ((100,80),(90,90),(80,80),(90,70),(100,80))
        tresCoords = ((110,70),(100,80),(90,70),(100,60),(110,70))
        cuatroCoords = ((100,70),(90,80),(80,70),(90,60),(100,70))
        cincoCoords = ((110,80),(100,90),(90,80),(100,70),(110,80))
        self.c.create_line(unoCoords,tag = self.name)
        self.c.create_polygon(dosCoords,fill="green",
                             tag = self.name)
        self.c.create_polygon(tresCoords,fill="green",
                              tag = self.name)
        self.c.create_polygon(cuatroCoords,fill="green",
                              tag = self.name)
        self.c.create_polygon(cincoCoords,fill="green",
                              tag = self.name)           
        self.c.update()    

    #####################################################################
    # moveLeft                                                          #
    #                                                                   #
    # purpose:                                                          #
    #     moves the dinousaur to the left the specified distance        #
    # parameters:                                                       #
    #     dist       -- distance to move                                #
    #     prevDelay  -- amount of delay before the move (default of 0)  #
    #     afterDelay -- amount of delay after the move (default of 0)   #
    # return value: none                                                #
    #####################################################################
    def moveLeft(self, dist, prevDelay=0, afterDelay=0):
        self.center -= dist
        self.c.update()
        self.c.after(prevDelay)
        self.c.update()
        self.c.move(self.name, -dist,0)
        self.c.update()
        self.c.after(afterDelay)
        self.c.update()
        
    #####################################################################
    # moveRight                                                         #
    #                                                                   #
    # purpose:                                                          #
    #     moves the Dinosaur to the right the specified distance        #
    # parameters:                                                       #
    #     dist       -- distance to move                                #
    #     prevDelay  -- amount of delay before the move (default of 0)  #
    #     afterDelay -- amount of delay after the move (default of 0)   #
    # return value: none                                                #
    #####################################################################
    def moveRight(self, dist, prevDelay=0, afterDelay=0):
        self.moveLeft(-dist, prevDelay, afterDelay)

    #####################################################################
    # moveUP                                                            #
    #                                                                   #
    # purpose:                                                          #
    #     moves the dinousaur up to the specified distance              #
    # parameters:                                                       #
    #     dist       -- distance to move                                #
    #     prevDelay  -- amount of delay before the move (default of 0)  #
    #     afterDelay -- amount of delay after the move (default of 0)   #
    # return value: none                                                #
    #####################################################################
    def moveUp(self, dist, prevDelay=0, afterDelay=0):
        self.center -= dist
        self.c.update()
        self.c.after(prevDelay)
        self.c.update()
        self.c.move(self.name, 0,-dist)
        self.c.update()
        self.c.after(afterDelay)
        self.c.update()
        
    
    #####################################################################
    # moveDown                                                          #
    #                                                                   #
    # purpose:                                                          #
    #     moves the dinousaur down to the specified distance            #
    # parameters:                                                       #
    #     dist       -- distance to move                                #
    #     prevDelay  -- amount of delay before the move (default of 0)  #
    #     afterDelay -- amount of delay after the move (default of 0)   #
    # return value: none                                                #
    #####################################################################
    def moveDown(self, dist, prevDelay=0, afterDelay=0):
        self.center -= dist
        self.c.update()
        self.c.after(prevDelay)
        self.c.update()
        self.c.move(self.name, 0, dist)
        self.c.update()
        self.c.after(afterDelay)
        self.c.update()
        
    #####################################################################
    # Change color                                                      #
    #                                                                   #
    # purpose:                                                          #
    #     changes the color of the dinousaur                            #
    # parameters:                                                       #
    #                                                                   #
    #     prevDelay  -- amount of delay before the change (default of 0)#
    #     afterDelay -- amount of delay after the change (default of 0) #
    # return value: none                                                #
    #####################################################################
    def changeC(self, bodyColor,headColor,prevDelay=0, afterDelay=0):
        self.c.itemconfig(self.name,fill=bodyColor)
        self.c.update()
        self.c.after(prevDelay)
        self.c.update()
        self.c.itemconfig(self.name,fill=headColor)
        self.c.update()
        self.c.after(prevDelay)
        self.c.update()
    #####################################################################
    # rising water                                                      #
    #                                                                   #
    # purpose:                                                          #
    #     makes rising water                                            #
    # parameters:                                                       #
    #                                                                   #
    #     prevDelay  -- amount of delay before the rise (default of 0)  #
    #     afterDelay -- amount of delay after the rise (default of 0)   #
    # return value: none                                                #
    #####################################################################
    def risingwater(self,prevDelay=0, afterDelay=0):
        a=1
        for i in range(1000):
            c.create_rectangle((100,300),(200,100+a),fill="blue")
            a+=1

