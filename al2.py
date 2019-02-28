#Name:Jahnavi T
#Branch:CSE
#Batch:AL-2

#simple calculator
def add(x, y):
   return x + y

 
def subtract(x, y):
   return x - y


def multiply(x, y):
   return x * y


def divide(x, y):
   return x / y

print("Select operation.")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")


choice = input("Enter choice(1/2/3/4):")

num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

if choice == '1':
   print(num1,"+",num2,"=", add(num1,num2))

elif choice == '2':
   print(num1,"-",num2,"=", subtract(num1,num2))

elif choice == '3':
   print(num1,"*",num2,"=", multiply(num1,num2))

elif choice == '4':
   print(num1,"/",num2,"=", divide(num1,num2))
else:
   print("Invalid input")
   
   
   
   
   
   
output:   
   
   Select operation.
1.Add
2.Subtract
3.Multiply
4.Divide
Enter choice(1/2/3/4):1
Enter first number: 12
Enter second number: 36
12 + 36 = 48
Enter choice(1/2/3/4):2
Enter first number: 88
Enter second number: 66
88 - 66 = 22
Enter choice(1/2/3/4):3
Enter first number: 45
Enter second number: 67
45 * 67 = 3015
Enter choice(1/2/3/4):4
Enter first number: 99
Enter second number: 25
99 / 25 = 3.96
