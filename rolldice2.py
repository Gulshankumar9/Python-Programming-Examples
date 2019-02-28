import random

while True:
	
	d = input("press r to roll the dice , press q to quit :")
	if d == 'r':
		print("you got : ",random.randint(1,6))
	elif d == 'q':
		print("bye")
		exit()	
