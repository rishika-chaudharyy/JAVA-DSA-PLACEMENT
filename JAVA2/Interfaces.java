//Write a program for interfaces
public class Interfaces {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
        Bear b=new Bear();
        b.eat();
        b.eats();

    }
}
interface herbivores{
    void eat();
}
interface carnivore{
    void eats();
}
class Bear implements herbivores,carnivore{
public void eat(){
    System.out.println("Eats grass");
}
public void eats(){
    System.out.println("Eats meat");
}
}

interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
System.out.println("up,down,right,left,diagonal(in 4 directions)");
    }
}
class King implements Chessplayer{
    public void moves(){
System.out.println("up,down,right,left,diagonal(in 4 directions)");
    }
}