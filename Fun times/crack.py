

import math
import time


def main():
    print("Enter Password:")
    crack_pass = []
    user_password = []
    user_password = input() 
    start_time = time.time()




    while crack_pass != user_password:
        your_list = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&&*()_-=+:.'
        crack_pass = []
        for current in range(10):
            a = [i for i in your_list]
            for y in range(current):
                a = [x+i for i in your_list for x in a]
            complete_list = a
        print(complete_list)


    print("Password: %s" % (crack_pass))
    print("Completed in %s seconds" % (time.time() - start_time))




main()