#include<stdio.h>
int square (int num){
	int result;
	result=num*num;
	return result;
}
void main(){
	int x,res;
	printf("enter the number to find the square value of?");
	scanf("%d",&x);
	res=square(x);
	printf("square value is : %d",res);
}

