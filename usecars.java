class main{
    public static void main (String []xf){
        maruti obj=new maruti(8975);
        santro obj1=new santro(1234);
        car ref,fer;
        ref=obj;
        fer=obj1;
        ref.opentank();
        ref.steering();
        ref.gear();
        ref.brakes();
        fer.opentank();
        fer.steering();
        fer.gear();
        fer.brakes();

    } 
}