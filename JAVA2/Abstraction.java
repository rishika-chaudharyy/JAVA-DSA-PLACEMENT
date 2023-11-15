//Write a program for abstraction
public class Abstraction {
    public static void main(String args[]){
Horse h=new Horse();
h.eat();
h.walk();
System.out.println(h.color);
Chicken c = new Chicken();
c.eat();
c.walk();
//Mustang myhorse=new Mustang();
//Animal---Horse---Mustang

    }
}
abstract class Animal{
   
       
    String color;
    Animal(){
         System.out.println("Animal construcotr called");
 
        color="Brown";
    }
    void eat(){
        System.out.println("Eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void chang_color(){
        color="dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal{
    void chang_color(){
        color="yellow";
    }
     void walk(){
        System.out.println("Walks on 2 legs");
    }
}