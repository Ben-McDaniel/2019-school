import math
import time
import json



start_time = time.time()


def writeToJSONFile(path, fileName, data):
        filePathNameWExt = './' + path + '/' + fileName + '.json'
        with open(filePathNameWExt, 'a') as fp:
            json.dump(data, fp, indent="")




def main():



    i = 1;
    numcurrent = 1;
    numpast = 0;
    numnext = 1;
    while i <= 100000:
        print(numnext)
        numnext = numcurrent + numpast
        numpast = numcurrent
        numcurrent = numnext
         

 #       path = './'
  #      fileName = 'fibnumbers'
#
#
 #       data = {}
  #      data['SequenceNum'] = i
   #     data['FibNum'] = numcurrent



    #    writeToJSONFile(path, fileName, data)
        i += 1 
    print("Completed in %s seconds" % (time.time() - start_time))

main()








