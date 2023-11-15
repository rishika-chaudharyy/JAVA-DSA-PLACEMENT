//Write a program for method overriding
public class Method_overriding {
    public static void main(String args[]){
        Deer d= new Deer();//because object is of child class
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eat grass");
    }
}