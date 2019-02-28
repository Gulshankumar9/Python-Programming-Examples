
import random 
l=['r','p','s']
comp_score = 0
user_score = 0
	
while True:
	u=input("enter choice:")
	print("user chooses",u)
	c=random.choice(l)
	print("computer chooses",c)
	
	if u =='q':
		print("game ends:")
		exit()
	elif u == c:
		print("tie!:",comp_score,user_score)
	elif u == 'r' and c == 'p':
		comp_score=comp_score+1
		
	
		
		print("computer wins :","comp_score",comp_score,"user_score",user_score)
	elif u == 'p' and c == 's':
		comp_score=comp_score+1
		
	
		print("computer wins :","comp_score",comp_score,"user_score",user_score)
	elif u == 's' and c == 'r':
		comp_score=comp_score + 1
		
	
		print("computer wins :","comp_score",comp_score,"user_score",user_score)
			
	elif u == 's' and c == 'p':
		user_score=user_score+1
		
	
		print("user wins :","comp_score",comp_score,"user_score",user_score)
	elif u == 'p' and c == 'r':
		user_score=user_score+1
		
	
		print("user wins :","comp_score",comp_score,"user_score",user_score)
	elif u == 'r' and c == 's':
		user_score=user_score+1
		
	
		print("user wins :","comp_score",comp_score,"user_score",user_score)
	else:
		print("invalid character :",comp_score,user_score)

	if user_score==10:
		print("user wins","user_score = ",user_score)
		exit()
	elif comp_score==10:
		print("computer wins","comp_score = ",comp_score)
		exit()

		
	
	