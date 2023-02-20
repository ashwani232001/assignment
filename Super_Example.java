class car1{
    String brand;
    String colour;
    int price;

      car1(int price,String colour,String brand){
         this.colour=colour;
         this.brand=brand;
         this.price=price;
     }void print(){
        System.out.println(colour+" "+brand+" "+price);
    }
}
class Car2 extends car1{
     Car2(int price,String colour,String brand){
         super(price,colour,brand);
     }
    void specification(){
        System.out.println(colour+" "+brand+" "+price);}
}
public class Super_Example {
    public static void main(String[] args) {
        Car2 obj = new Car2(200000,"red","maruti");
        car1 sc = new car1(300000,"black","polo");
        obj.specification();
        sc.print();
    }
}
