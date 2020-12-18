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

class Dinousaur:

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
    # draw                                                                  #
    #                                                                       #
    # purpose:                                                              #
    #     draws the dinousaur instance with its initial location and colors #
    # parameters:                                                           #
    #     none                                                              #
    # return value: none                                                    #
    #########################################################################
    def draw(self):
        self.center = 200
        self.middle = 112
        headCoords = ((120,170),(150,150))
        bodyCoords = ((120,200),(140,170))
        leg1Coords = ((125,200),(130,205))
        leg2Coords = ((132.5,200),(137.5,205))
        tailCoords = ((110,200), (120,200),(120,190),(110,200))
        armCoords=((140,177.5),(145.5,182.5))
        arm2Coords=((140,175),(145,180))
        eyeCoords=((138,146.5),(145,154))
        eyeballCoords=((141,150),(142,151))
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
    #     prevDelay  -- amount of delay before the chage (default of 0) #
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
