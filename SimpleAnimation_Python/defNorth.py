################################################################################
#                             North scenery                                    #
#                                                                              #
# PROGRAMMER:       Angel Rivera                                               #
# CLASS:            CG120                                                      #
# ASSIGNMENT:       Final Project                                              #
# INSTRUCTOR:       Dean Zeller                                                #
# TA:               Robert Carver                                              #
# SUBMISSION DATE:  November 30,2018                                           #
#                                                                              #
# DESCRIPTION:                                                                 #
# This program is a function that draws a North scenery on the canvas provided #
# as a parameter.                                                              #
#                                                                              #
# COPYRIGHT:                                                                   #
# This program is (c) 2018 Angel Rivera and Dean Zeller. This is original      #
# work, without use of outside sources.                                        #
################################################################################
import random
def scenaryNorth(c):
    c.create_rectangle((0,  0), (800,300), fill="sky blue")     
    c.create_rectangle((0,250), (800,300), fill="bisque")          
    c.create_rectangle((400,300),(-30,450),outline="",fill="lightgreen")
    c.create_rectangle((400,300),(830,450),outline="",fill="lightgreen")
    for i in range (150):
        x= random.randrange(-30,800)
        y= random.randrange(0,1)
        width= random.randrange(50,90)
        high= random.randrange(50,80)
        c.create_oval((x,y),(x+width,y+high),fill="white", outline="")
    c.update()  
 
