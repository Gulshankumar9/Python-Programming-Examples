class one {
    protected double l;
    one(double l){
        this.l=l;
    }
}
class two extends one {
    
    two(double l){
        super(l);
    }
    void area(){
        System.out.println("area of square:"+(l*l));
    }
}
class rectangle extends two{
    private double b;
    rectangle(double x,double y){
        super(x);
        b=y;
    }
    void area (){
        System.out.println(super.l);
        
        System.out.println("area of rectangle is :"+(l*b));
    }
}
class main {
    public static void main(String []fa) {
        two t=new two(10);
        t.area();
        rectangle r=new rectangle (10,15);
        r.area();
        
    }
}