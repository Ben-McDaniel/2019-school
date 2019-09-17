
import time

attempts = 1


def login():
    global attempts
    print("Enter Password")
    password = input()
    

    if password == "ben1":
        print("Password Accepted on the {} attempt".format(attempts))
    else:
#        print("Login Failed, try again in 5 seconds")
#        time.sleep(5)
#        print("|")
#        print("|")
#        print("|")
#        print("|")
#        print("|")
        attempts = attempts + 1
        login()

login()
