class one{
	two obj2;
	one(two obj2){
		this.obj2=obj2;
	}
	double cube(double x){
		double result=x*obj2.square(x);
		return result;
	}
}
class two{
	three obj3;
	two(three obj3){
		this.obj3=obj3;
	}
	double square(double x){
		double result=x*obj3.get(x);
		return result;
	}
}
class three {
	double get(double x){
		return x;
	}
}
class main{
	public static void main(String  [] gs){
		three obj3=new three();
		two obj2=new two(obj3);
		one obj1=new one(obj2);
		double result2=obj1.cube(2);
		System.out.println("cube  of  10 is  "+result2);
		double result3=obj2.square(4);
		System.out.println("square of 5  is "+result3);
	}
}