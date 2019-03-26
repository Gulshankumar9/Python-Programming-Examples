class Test:
	h=0

	def __init__(self):
		self.h=7
	def my__func(self,k):
		self.h=k
		print(self.h)
sam=Test()
print(sam.h)
sam2=Test()
print(sam2.h)
sam.my__func(9)
sam2.my__func(12)
sam3=Test()
print(sam3.h)




