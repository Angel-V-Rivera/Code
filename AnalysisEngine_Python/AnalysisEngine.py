################################################################################
#                           Standard Deviation                                 #
#                                                                              #
# PROGRAMMER:       Angel Rivera                                               #
# CLASS:            CS120                                                      #
# ASSIGNMENT:       Assignment 4                                               #
# INSTRUCTOR:       Dean Zeller                                                #
# TA:               Robert Carver                                              #
# SUBMISSION DATE:  October 12, 2018                                           #
#                                                                              #
# DESCRIPTION:                                                                 #
# This Object will calculate the Sum, average, variance, and standar deviation #
# of any set of numbers entered by the user. In addtion it will print the      #
# output in a formated table.                                                  #
#                                                                              #
# COPYRIGHT:                                                                   #
# This program is (c) 2018 Angel Rivera and Dean Zeller. This is original      #
# work, without use of outside sources.                                        #
################################################################################
import statistics
import math

class AnalysisEngine:

    #####################################################################
    # __init__                                                          #
    #                                                                   #
    # purpose:                                                          3
    #     - initialize the attributes to default values                 #
    # parameters: none                                                  #
    # return value: none                                                #
    #####################################################################
    def __init__ (self):
        self.leader   = ""
        self.title    = ""
        self.data     = []
        self.sum      = 0
        self.average  = 0.0
        self.variance = 0.0
        self.stdev    = 0.0
        

    #####################################################################
    # introduction                                                      #
    #                                                                   #
    # purpose:                                                          #
    #     - accept user input for user and study name                   #
    #     - display instructions for user                               #
    # parameters: none                                                  #
    # return value: none                                                #
    #####################################################################
    def introduction(self):
        print("Welcome to Assignment 4, Standard Deviation")
        print()
        self.title = input("Enter the title of the study => ")
        print("Name of study set to",self.title)
        print()
        self.leader = input("Enter the head of research for this study => ")
        print("Hello,",self.leader+".")
        print()
        print("Introduction:")
        print("This program will calculate the standard deviation on")
        print("a list of values entered by the user. It will run in three phases:")
        print("    Phase 1 -- Gather input from user")
        print("    Phase 2 -- Calculate sum, average, variance, and stdev")
        print("    Phase 3 -- Output results")
        print()
        
    #####################################################################
    # gatherData                                                        #
    #                                                                   #
    # purpose:                                                          #
    #     - accept user input for the self.data attribute               #
    # parameters: none                                                  #
    # return value: none                                                #
    #####################################################################
    def gatherData(self):
        print("Phase 1:  Gather user input")
        print("---------------------------")
        print("To enter the data correctly, the program needs to know how many")
        print("numbers are in the dataset.")
        NoN = int(input("   Size of dataset => "))
        print("   Data will have",NoN,"elements, indexed 0 through",str(NoN-1)+".")
        print()
        print("Enter integer and floating-point values:")
        self.data = []
        for i in range (NoN):
            number = float(input("   Index " + str(i) + " => "))
            self.data.append(number)
        print("Data entered:  ", end="")
        for i in self.data:
            print(i, end=", ")
        print("")
        print()
        print("Phase 1 complete.")
        print()

    #####################################################################
    # calcSum                                                           #
    #                                                                   #
    # purpose:                                                          #
    #     - calculate and print the sum of self.data                    #
    # parameters: none                                                  #
    # return value: none                                                #
    #####################################################################
    def calcSum(self):
        self.sum =0
        for d in self.data:
            self.sum += d
        print("    Calculated sum ("+str(self.sum)+")")

    #####################################################################
    # calcAverage                                                       #
    #                                                                   #
    # purpose:                                                          #
    #     - calculate and print the average of self.data                #
    # parameters: none                                                  #
    # return value: none                                                #
    #####################################################################
    def calcAverage(self):
        self.average = self.sum/len(self.data)
        print("    Calculated average ("+str(self.average)+")")

    #####################################################################
    # calcVariance                                                      #
    #                                                                   #
    # purpose:                                                          #
    #     - calculate and print the variance of self.data               #
    # parameters: none                                                  #
    # return value: none                                                #
    #####################################################################
    def calcVariance(self):
        total = 0.0
        for d in self.data:
            total += (d-self.average)**2
        self.variance = total/ (len(self.data)-1)    
        print("    Calculated variance ("+str(self.variance)+")")

    #####################################################################
    # calcStdev                                                         #
    #                                                                   #
    # purpose:                                                          #
    #     - calculate and print the (sample) standard deviation of      #
    #       self.data                                                   #
    # parameters: none                                                  #
    # return value: none                                                #
    #####################################################################
    def calcStdev(self):
        self.stdev = math.sqrt(self.variance)
        print("    Calculated standard deviation ("+str(self.stdev)+")")

    #####################################################################
    # performCalculations                                               #
    #                                                                   #
    # purpose:                                                          #
    #     - perform all calculations, with appropriate header           #
    # parameters: none                                                  #
    # return value: none                                                #
    #####################################################################
    def performCalculations(self):
        print("Phase 2:  Perform Calculations")
        print("------------------------------")
        self.calcSum()
        self.calcAverage()
        self.calcVariance()
        self.calcStdev()
        print("Phase 2 complete")
        print()

    #####################################################################
    # compareResultsReport                                               #
    #                                                                   #
    # purpose:                                                          #
    #     - perform all calculations, with appropriate header           #
    # parameters: none                                                  #
    # return value: none                                                #
    #####################################################################
    def compareResultsReport(self):
        self.realsum = sum(self.data)
        self.realAverage = statistics.mean(self.data)
        self.realVariance = statistics.variance(self.data) 
        self.realStdev = statistics.stdev(self.data)
        
        
    #####################################################################
    # printReport                                                       #
    #                                                                   #
    # purpose:                                                          #
    #     - print a summary report of the study                         #
    # parameters: none                                                  #
    # return value: none                                                #
    #####################################################################
    def printReport(self):
        print("Phase 3:  Output table")
        print("----------------------")
        horizline = "+--------------------------------------------------+"
        print(horizline)
        print("| %-48s |" % (self.title))
        print("| by %-45s |" % (self.leader))
        print(horizline)
        print("|  %-27s calcualted   actual |" % (""))
        print("| Sum:                  %15.3f %10.3f |" % (self.sum, self.realsum))
        print("| Mean:                 %15.3f %10.3f |" % (self.average, self.realAverage))
        print("| Variance:             %15.3f %10.3f |" % (self.variance, self.realVariance))
        print("| Standard Deviation:   %15.3f %10.3f |" % (self.stdev, self.realStdev))
        print(horizline)
        print()

    #####################################################################
    # closing                                                           #
    #                                                                   #
    # purpose:                                                          #
    #     - print closing remarks                                       #
    # parameters: none                                                  #
    # return value: none                                                #
    #####################################################################
    def closing(self):
        print("phase 3 complete")
        print("Exiting study",self.title)
        print("Goodbye!")

