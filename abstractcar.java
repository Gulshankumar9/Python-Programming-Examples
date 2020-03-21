abstract  class car{
    int regno;
    car(int regno){
        this.regno=regno;
    }
    void opentank(){
        System.out.println("open tank and fill tank :");

    }
    abstract void steering();
    abstract void brakes();
    abstract void gear();


} 