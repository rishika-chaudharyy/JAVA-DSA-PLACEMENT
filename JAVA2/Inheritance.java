//Write a program for inheritance
public class Inheritance {
    public static void main(String args[]){
        Fish whale=new Fish();
        whale.eats();
        Dog dobby=new Dog();
        dobby.legs=4;
        System.out.println(dobby.legs);
        Bird woodpecker=new Bird();
        woodpecker.wings=2;
        System.out.println(woodpecker.wings);
        woodpecker.eats();
    }
}


//single level
class Fish extends Animals{
    int fins;
}


//multi level
class Mammals extends Animals{
    int legs;
}
class Dog extends Mammals{
    String breed;
}


//hierarchial inheritance
class Bird extends Animals{
    int wings;
}

class Reptile extends Animals{
    int teeth;
}


class Animals{
String skincolor;
void eats(){
    System.out.println("Eats");
}
void breathe(){
    System.out.println("Breathes");
}
}