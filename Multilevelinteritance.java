class Human{  
void being(){
System.out.println("object");}  
}  
class Men extends Human{  
void parent(){
System.out.println("father");}  
}  
class Kid extends Men{  
void child(){
System.out.println("Son");
}  
}  
class Multilevelinteritance{  
public static void main(String args[]){  
Kid c=new Kid();  
c.being();  
c.parent();  
c.child();  
}
}  
