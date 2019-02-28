import random 

d = 0
p = 0

while True: 
	r = input("press r to roll dice , q to quit the game :")

	if r == 'r':
		d = random.randint(1,6)
		print("you got :",d)
	if r =='q':
		print("good bye!:")
		exit()
	if d == 6:
		print("congratulations u can play now :")
		break
	else:
		print("roll the dice till u get 6:")


while True:
	r = input("press r to roll dice , q to quit the game :")
	if r =='q':
		print("good bye!:")
		exit()
	if r == 'r':
		d = random.randint(1,6)
		print("you got :",d)
		p = p+d
		if p == 8:
			p = 37
			print(" wow , a ladder . go up",p)
		if p == 13:
			p = 34
			print(" wow , a ladder . go up",p)
		if p == 40:
			p = 68
			print(" wow , a ladder . go up",p)
		if p == 52:
			p = 81
			print(" wow , a ladder . go up",p)
		if p == 76:
			p = 97
			print(" wow , a ladder . go up",p)
		if p == 11:
			p = 2
			print("u have been bitten by snake :",p)
		if p == 25:
			p = 4
			print("u have been bitten by snake :",p)
		if p == 38:
			p = 9
			print("u have been bitten by snake :",p)
		if p == 89:
			p = 70
			print("u have been bitten by snake :",p)
		if p == 93:
			p = 64
			print("u have been bitten by snake :",p)
		if p == 65:
			p = 46
			print("u have been bitten by snake :",p)
		if p > 100:
			p = p-d
			print("come back to same position & wait till u get :",100-p,"or less")
		print("ur new position is : ",p)

		if p == 100:
			print("u won :")
			exit()
		elif r == 'q':
			print("bye!")
			  
