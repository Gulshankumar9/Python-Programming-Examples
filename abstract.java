abstract class myclass {
    abstract void cal(double x);
}
class sub1 extends myclass  {
void cal(double x ){
    System.out.println("square is :"+(x*x));

}
}
class sub2 extends myclass {
    void cal(double x){
        System.out.println("cube is :"+(x*x*x));
    }
}
class sub3 extends myclass{
void cal (double x){
    System.out.println("square root is :"+Math.sqrt(x));
}
}
class main {
    public static void main (String []f){
        sub1 obj1=new sub1();
        sub2 obj2=new sub2();
        sub3 obj3=new sub3();
        obj1.cal(10);
        obj2.cal(20);
        obj3.cal(25);

    }
}