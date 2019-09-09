# user inputs how many digits of pi they want and computer spits it out 
#they can select just in terminal or in .json file


import math
import json


pi = math.pi

print(pi)


def main


def outputTerminal


def writeToJSONFile(path, fileName, data):
        filePathNameWExt = './' + path + '/' + fileName + '.json'
        with open(filePathNameWExt, 'a') as fp:
            json.dump(data, fp, indent="")
path = './'
fileName = 'fibnumbers'
data = {}
data['SequenceNum'] = i
data['FibNum'] = numcurrent
writeToJSONFile(path, fileName, data)