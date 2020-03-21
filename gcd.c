#include<stdio.h>
int gcd(int u,int v);
void main(){
	int x,y,z;
	printf("enter the values of two numbers :\n");
	scanf("%d%d",&x,&y);
	z=gcd(x,y);
	printf("gcd%d\n",z);
	printf("lcm%d\n",(x*y)/z);
}
int gcd(int u,int v){
	int r;
	while(v!=0){
		r=u%v;
		u=v;
		v=r;
	}
	return u;
}




