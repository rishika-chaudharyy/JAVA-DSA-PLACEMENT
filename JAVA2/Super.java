//Write a program for super keyword
public class Super {
    public static void main(String args[]) {
        Horses h = new Horses();
        System.out.println(h.color);
    }
}

class Animalss {
    String color;

    Animalss() {
        System.out.println("Animal constructor is called");
    }
}

class Horses extends Animalss {
    Horses() {
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}
