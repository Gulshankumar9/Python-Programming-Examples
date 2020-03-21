class person{
String name,add,email;
int pho;
person(String x,String y,String z,int a){
    name=x;
    add=y;
    email=z;
    pho=a;
}
void getinfo(){   
    System.out.print("persons details \n"+"name:"+name+"\naddress"+add+"\nemail:"+email+"\npho"+pho);
}
}
class stu extends person{
    boolean fresher ,senior ,junior ;
    boolean getinfo(int x){
        if(x>12){
            System.out.println("senior:");
        return senior;
        }
        else if(x<12){
            System.out.println("junior:");
        return junior ;
        }
        else{
            System.out.println("fresher:");
        return fresher;
        }
        
    }
}
class empl extends person{
    String office;
    double salary;
    empl(String y,double x){
    office=y;
    salary=x;
}
void getinfo(){
    System.out.println("office:"+office+"salary:"+salary);
}
} 
class faculty extends employee {
double offihrs;
String rank;
faculty(double x,String y){
    offihrs=x;
    rank=y;
}
void getinfo(){
    System.out.println("officehrs:"+offihrs+"rank:"+rank);
}
} 
class staff extends employee {
    String title;
    staff (String x){
        title=x;
    }
    void getinfo(String x){
    System.out.println("title"+title);  
    }
}
 class main {
    public static void main(String fg[]) { 
        person p=new person(sna,sdf,sdf,214);
        p.getinfo();
        stu s=new stu(12);
        s.getinfo();
        empl e=new empl(ams,90000);
        e.getinfo();
        faculty f=new faculty(7.3,senior);
        f.getinfo();
        staff st=new staff(details);
        st.getinfo();

    }
}
