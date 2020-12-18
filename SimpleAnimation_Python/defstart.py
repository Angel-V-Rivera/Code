################################################################################
#                             Start scenery                                    #
#                                                                              #
# PROGRAMMER:       Angel Rivera                                               #
# CLASS:            CG120                                                      #
# ASSIGNMENT:       Final Project                                              #
# INSTRUCTOR:       Dean Zeller                                                #
# TA:               Robert Carver                                              #
# SUBMISSION DATE:  November 30,2018                                           #
#                                                                              #
# DESCRIPTION:                                                                 #
# This program is a function that draws a Start scenery on the canvas provided #
# as a parameter.                                                              #
#                                                                              #
# COPYRIGHT:                                                                   #
# This program is (c) 2018 Angel Rivera and Dean Zeller. This is original      #
# work, without use of outside sources.                                        #
################################################################################
import random
def Scenarystart(c):
    c.create_oval((350,300),(450,400))
    c.create_rectangle((400,300),(-30,400),outline="",fill="bisque")
    c.create_rectangle((400,300),(830,400),outline="",fill="bisque")
    c.create_rectangle((350,300),(450,-30),outline="",fill="bisque")
    c.create_rectangle((350,400),(450,750),outline="",fill="bisque")
    c.create_rectangle((350,300),(-30,-30),fill="lightgreen")
    c.create_rectangle((450,300),(830,-30),fill="lightgreen")
    c.create_rectangle((350,400),(-30,730),fill="lightgreen")
    c.create_rectangle((450,400),(830,730),fill="lightgreen")
    c.update()  
 
