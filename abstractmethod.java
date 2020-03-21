class  myclass {
    void cal(double x){
        System.out.println("square is :"+(x*x));


    }
}
class common {
    public static void main (String []fd){
        myclass obj=new myclass ();
        myclass obj1=new myclass ();
        myclass obj2=new myclass ();
        obj.cal(1);
        obj1.cal(10);
        obj2.cal(30);

        

        
    }
}