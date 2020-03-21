#include<stdio.h>
int isprime(int n);
void main(){
	int num,result;
	printf("\n enter the number :");
	scanf("%d",&num);
	result=isprime(num);
	if(result==1){
		printf("\n %d is   prime number :",num);
	}

	else{
		printf("\n %d is not  prime number :",num);
	}
}
int isprime(int n){
	int i,flag=1;
	for(i=2;i<n;i++){
		if(n%i==0){
			flag==0;
			break;
		}
	}
	return flag;
}



